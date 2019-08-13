package com.pinming.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: djs
 * @create: 2019-08-02 20:40
 **/
public class User {
    private Integer id;
    @ApiModelProperty(value = "昵称")
    private String nickname;
    @ApiModelProperty(value = "姓名")
    private String rname;
    @ApiModelProperty(value = "头像地址")
    private String imgpath;
    @ApiModelProperty(value = "联系方式")
    private String tel;
    @ApiModelProperty(value = "登陆者id")
    private Integer aid;
    //private Admin admin;

    /*public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
