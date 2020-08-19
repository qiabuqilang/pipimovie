package com.pipimovie.service;

import com.pipimovie.service.businessobject.VideoBO;

import java.util.List;

public interface VideoService {
    List<VideoBO> listVideo(int tid, int pageNum, int pageSize);
    List<VideoBO> listVideo(String keywords, int pageNum, int pageSize);
    List<VideoBO> listVideo(int tid, String keywords, int pageNum, int pageSize);
    VideoBO getVideo(int id);

}
