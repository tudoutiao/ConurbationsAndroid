package com.test.admin.conurbations.model.entity;


import java.io.Serializable;

/**
 * Created by zhouqiong on 2017/1/23.
 */
public class SoGouSearcher implements Serializable {
    private String thumbUrl;
    private String pic_url;


    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }


    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
}
