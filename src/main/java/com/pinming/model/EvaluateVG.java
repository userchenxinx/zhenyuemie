package com.pinming.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pinming.pojo.Evaluate;

import java.util.Date;


public class EvaluateVG extends Evaluate {

    private Integer gid;

    private Integer star;

    private String evaluate;

    private String evaluateman;

    private String imgpath;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT-8")
    private Date evaluatetime;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Override
    public Integer getStar() {
        return star;
    }

    @Override
    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public String getEvaluate() {
        return evaluate;
    }

    @Override
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    @Override
    public String getEvaluateman() {
        return evaluateman;
    }

    @Override
    public void setEvaluateman(String evaluateman) {
        this.evaluateman = evaluateman;
    }

    @Override
    public String getImgpath() {
        return imgpath;
    }

    @Override
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @Override
    public Date getEvaluatetime() {
        return evaluatetime;
    }

    @Override
    public void setEvaluatetime(Date evaluatetime) {
        this.evaluatetime = evaluatetime;
    }
}
