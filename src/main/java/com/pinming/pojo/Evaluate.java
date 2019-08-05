package com.pinming.pojo;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer star;

    private String evaluate;

    private String evaluateman;

    private String imgpath;

    private Date evaluatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public String getEvaluateman() {
        return evaluateman;
    }

    public void setEvaluateman(String evaluateman) {
        this.evaluateman = evaluateman == null ? null : evaluateman.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Date getEvaluatetime() {
        return evaluatetime;
    }

    public void setEvaluatetime(Date evaluatetime) {
        this.evaluatetime = evaluatetime;
    }
}