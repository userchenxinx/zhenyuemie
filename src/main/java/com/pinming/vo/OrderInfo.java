package com.pinming.vo;

import java.util.Date;

public class OrderInfo {

    private Integer oid;

    private String ordercode;

    private Double tatalprice;

    private Integer orderstatus;

    private Date createtime;

    private String nickname;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public Double getTatalprice() {
        return tatalprice;
    }

    public void setTatalprice(Double tatalprice) {
        this.tatalprice = tatalprice;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
