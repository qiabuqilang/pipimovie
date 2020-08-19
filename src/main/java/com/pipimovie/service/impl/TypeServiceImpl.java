package com.pipimovie.service.impl;

import com.pipimovie.dao.TypeDOMapper;
import com.pipimovie.dataobject.TypeDO;
import com.pipimovie.service.TypeService;
import com.pipimovie.service.VideoService;
import com.pipimovie.service.businessobject.ListVideoBo;
import com.pipimovie.service.businessobject.TypeBO;
import com.pipimovie.service.businessobject.VideoBO;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeDOMapper typeDOMapper;
    @Autowired
    private VideoService videoService;

    private Boolean getTypeByPid(List<TypeBO> typeBOList,Byte pid){
//        根据PID找出子节点
    List<TypeDO> typeDOListChildren = this.typeDOMapper.listByPid(pid);
    List<TypeBO> typeBOListChildren = this.DO2BO(typeDOListChildren);
    if (typeBOListChildren.size()>0){
        for (TypeBO typeBo: typeBOListChildren
             ) {
            List<TypeBO> children = new ArrayList<>();
            if (this.getTypeByPid(children,typeBo.getTid().byteValue())){
                    typeBo.setChildren(children);
            }
            typeBOList.add(typeBo);
        }
        return true;
    }else{
        return false;
    }



    }

    private Boolean getTypeTree(List<TypeBO> typeBOList){

        return true;
    }

    private List<TypeBO> DO2BO(List<TypeDO> typeDOList){
        List<TypeBO> typeBOList = new ArrayList<>();
        for (TypeDO typeDO: typeDOList
             ) {
            TypeBO typeBO = new TypeBO();
            BeanUtils.copyProperties(typeDO,typeBO);
            typeBOList.add(typeBO);
        }
        return typeBOList;
    }

    private TypeBO DO2BO(TypeDO typeDO){
            TypeBO typeBO = new TypeBO();
            BeanUtils.copyProperties(typeDO,typeBO);
        return typeBO;
    }

    @Override
    public List<TypeBO> listType() {
        List<TypeBO> typeBOList = new ArrayList<>();
        typeBOList.add(this.getType((short)1));
        typeBOList.add(this.getType((short)2));
        typeBOList.add(this.getType((short)3));
        typeBOList.add(this.getType((short)4));
       return typeBOList;
    }

    @Override
    public List<TypeBO> listType(byte pid) {
        List<TypeBO> typeBOList = new ArrayList<>();
        this.getTypeByPid(typeBOList,pid);
        for (TypeBO typeBO:typeBOList
                ) {
            List<VideoBO> videoBOList = this.videoService.listVideo(typeBO.getTid().intValue(),1, 10);
            typeBO.setVideoBOList(videoBOList);
        }
        return typeBOList;
    }

    @Override
    public TypeBO getType(short tid) {
        TypeDO typeDO = this.typeDOMapper.selectByPrimaryKey(tid);
        TypeBO typeBO = this.DO2BO(typeDO);
        typeBO.setChildren(this.listType(new Byte(""+tid)));
        return typeBO;
    }
}
