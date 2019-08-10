package com.pinming.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


/**
 * @author: djs
 * @create: 2019-08-02 20:40
 **/
public class User {
    private Integer id;
    private String tel;
    private String email;
    private String password;
    private Integer flag;
    private String nickname;
    private String rname;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;
    private String imgpath;
    private String code;

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

    public Date getCreatetime() {
        return createtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", flag=" + flag +
                ", nickname='" + nickname + '\'' +
                ", rname='" + rname + '\'' +
                ", createtime=" + createtime +
                ", imgpath='" + imgpath + '\'' +
                ", code='" + code + '\'' +
                '}';
    }


}
