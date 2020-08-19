package com.pipimovie.controller;

import com.github.pagehelper.PageInfo;
import com.pipimovie.response.CommonReturnType;
import com.pipimovie.service.TypeService;
import com.pipimovie.service.VideoService;
import com.pipimovie.service.businessobject.TypeBO;
import com.pipimovie.service.businessobject.VideoBO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.plugin.com.event.COMEventHandler;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*"}, allowCredentials = "true")

public class DataController extends BaseController{
    @Autowired
    private VideoService videoService;
    @Autowired
    private TypeService typeService;
    @GetMapping("/home")
    public CommonReturnType home(){
        int tid = 36;
        int pageNum = 1;
        int pageSize =10;
        List<VideoBO> videoBOList = this.videoService.listVideo(tid,pageNum,pageSize);
        List<TypeBO> typeBOList = this.typeService.listType();
        return CommonReturnType.create(typeBOList);

    }
    @GetMapping("/getById")
    public CommonReturnType getById(@Param(value = "id") int id){
        VideoBO videoBO = this.videoService.getVideo(id);
        return CommonReturnType.create(videoBO);
    }
}
