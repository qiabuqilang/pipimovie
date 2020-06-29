package com.pipimovie.service.businessobject;

public class PlayDataModel {
    private String name;
    private String type;
    private String url;
    private String realUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRealUrl() {
        return realUrl;
    }

    public void setRealUrl(String realUrl) {
        this.realUrl = realUrl;
    }
}
