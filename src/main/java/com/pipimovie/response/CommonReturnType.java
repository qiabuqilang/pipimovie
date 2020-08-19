package com.pipimovie.response;

import lombok.Data;

@Data
public class CommonReturnType {
    private String status;
    private Object data;

    public static CommonReturnType create(Object data){
        return CommonReturnType.create(data,"success");
    }
    public static CommonReturnType create(Object data,String status){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.status = status;
        commonReturnType.data = data;
        return commonReturnType;
//        wlm3u8$$第1集$http://cn1.18787000118.com/hls/20200526/90d8e715c1db49189d50a52300246a8a/index.m3u8$wlm3u8$$$wlzy$$第1集$http://qiaozhen.com.cn/share/MzcwMTgzJOesrDHpm4Y=$wlzy$$$第1集$http://qiaozhen.com.cn/share/MzcwMTgzJOesrDHpm4Y=$wlzy
    }

}
