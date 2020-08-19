package com.pipimovie.common;

public enum  EnumType {
    WLM3U8("https://jx.inpower.cc/?url=");
    String url;
    private EnumType(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }

}
