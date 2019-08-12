package com.pinming.vo;


import com.pinming.pojo.OrderDetails;

import java.util.Date;
import java.util.List;

public class VorderInfo {

    private Integer oid;
    private Integer goodsnum;
    private Double tatalprice;
    private Date createtime;
    private Integer uid;
    private List<OrderDetails> details;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Double getTatalprice() {
        return tatalprice;
    }

    public void setTatalprice(Double tatalprice) {
        this.tatalprice = tatalprice;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<OrderDetails> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetails> details) {
        this.details = details;
    }
}
