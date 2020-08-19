package com.pipimovie.service.impl;

import com.github.pagehelper.PageHelper;
import com.pipimovie.common.EnumType;
import com.pipimovie.dao.DataDOMapper;

import com.pipimovie.dao.PlaydataDOMapper;


import com.pipimovie.dao.TypeDOMapper;
import com.pipimovie.dataobject.DataDO;
import com.pipimovie.dataobject.PlaydataDO;
import com.pipimovie.response.CommonReturnType;
import com.pipimovie.service.VideoService;
import com.pipimovie.service.businessobject.PlayDataBO;
import com.pipimovie.service.businessobject.VideoBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class VideoServiceImpl implements VideoService{
    @Autowired
    private DataDOMapper dataDOMapper;
    @Autowired
    private PlaydataDOMapper playdataDOMapper;
    @Autowired
    private TypeDOMapper typeDOMapper;

    private List<VideoBO> DO2BO(List<DataDO> dataDOList){
        List<VideoBO> videoBOList = new ArrayList<>();
        for (DataDO dataDO:dataDOList
                ) {
            VideoBO videoBO = new VideoBO();
            videoBO.setListPlayData(new ArrayList<>());
            BeanUtils.copyProperties(dataDO,videoBO);
            videoBO.setTypeName(this.typeDOMapper.selectByPrimaryKey(videoBO.getTid()).getTname());
            PlaydataDO playdataDO = this.playdataDOMapper.selectByPrimaryKey(videoBO.getvId());
            String playdataBody = playdataDO.getBody();
            String[] playdataList = playdataBody.split("\\$\\$\\$");
            for (String playdata: playdataList
                    ) {
                String[] pdataList = playdata.split("\\$\\$");
                if (pdataList.length >1){
                    String[] ppdataList = pdataList[1].split("#");
                    for (String ppdata:ppdataList
                            ) {
                        String[] pppdataList = ppdata.split("\\$");
                        PlayDataBO playDataBO = new PlayDataBO();
                        if (pppdataList.length>=3){
                            playDataBO.setName(pppdataList[0]);
                            playDataBO.setUrl(pppdataList[1]);
                            playDataBO.setType(pppdataList[2]);
                            try{
                                EnumType enumType = EnumType.valueOf(playDataBO.getType().toUpperCase());
                                playDataBO.setRealUrl(enumType.getUrl()+playDataBO.getUrl());
                            }catch(Exception e){
                                playDataBO.setRealUrl(null);
                            }
                        }


                        videoBO.getListPlayData().add(playDataBO);
                    }
                }


            }
            if (videoBO.getListPlayData().size()>0){
                videoBOList.add(videoBO);
            }

//            wlm3u8$$第1集$http://cn1.18787000118.com/hls/20200526/90d8e715c1db49189d50a52300246a8a/index.m3u8$wlm3u8$$$wlzy$$第1集$http://qiaozhen.com.cn/share/MzcwMTgzJOesrDHpm4Y=$wlzy$$$第1集$http://qiaozhen.com.cn/share/MzcwMTgzJOesrDHpm4Y=$wlzy
        }
        return videoBOList;
    }

    private VideoBO DO2BO(DataDO dataDO){

            VideoBO videoBO = new VideoBO();
            videoBO.setListPlayData(new ArrayList<>());
            BeanUtils.copyProperties(dataDO,videoBO);
            PlaydataDO playdataDO = this.playdataDOMapper.selectByPrimaryKey(videoBO.getvId());
            String playdataBody = playdataDO.getBody();
            String[] playdataList = playdataBody.split("\\$\\$\\$");
            for (String playdata: playdataList
                    ) {
                String[] pdataList = playdata.split("\\$\\$");
                if (pdataList.length >1){
                    String[] ppdataList = pdataList[1].split("#");
                    for (String ppdata:ppdataList
                            ) {
                        String[] pppdataList = ppdata.split("\\$");
                        PlayDataBO playDataBO = new PlayDataBO();

                        playDataBO.setName(pppdataList[0]);
                        playDataBO.setUrl(pppdataList[1]);
                        playDataBO.setType(pppdataList[2]);
                        try{
                            EnumType enumType = EnumType.valueOf(playDataBO.getType().toUpperCase());
                            playDataBO.setRealUrl(enumType.getUrl()+playDataBO.getUrl());
                        }catch(Exception e){
                            playDataBO.setRealUrl(null);
                        }
                        videoBO.getListPlayData().add(playDataBO);
                    }
                }


            }


        return videoBO;
    }

    @Override
    public List<VideoBO> listVideo(int tid, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<DataDO> dataDOList = this.dataDOMapper.listByTid(tid);

        return this.DO2BO(dataDOList);
    }

    @Override
    public List<VideoBO> listVideo(String keywords, int pageNum, int pageSize) {

        return null;
    }

    @Override
    public List<VideoBO> listVideo(int tid, String keywords, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public VideoBO getVideo(int id) {
        DataDO  dataDO = this.dataDOMapper.selectByPrimaryKey(id);

        return this.DO2BO(dataDO);
    }
}
