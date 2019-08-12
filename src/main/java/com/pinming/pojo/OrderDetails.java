package com.pinming.pojo;

public class OrderDetails {
    private Integer id;

    private Integer goodsdetid;

    private String consignee;

    private String contacttel;

    private String profile;

    private String harvesttime;

    private String postcode;

    private Integer goodsnum;

    private Float freight;

    private Float money;

    private Integer oid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsdetid() {
        return goodsdetid;
    }

    public void setGoodsdetid(Integer goodsdetid) {
        this.goodsdetid = goodsdetid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getHarvesttime() {
        return harvesttime;
    }

    public void setHarvesttime(String harvesttime) {
        this.harvesttime = harvesttime == null ? null : harvesttime.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Float getFreight() {
        return freight;
    }

    public void setFreight(Float freight) {
        this.freight = freight;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}