package com.pinming.pojo;

public class Aaddress {
    private Integer id;

    private String consignee;

    private String tel;

    private Integer areaid;

    private String detaaddress;

    private Integer postalcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getDetaaddress() {
        return detaaddress;
    }

    public void setDetaaddress(String detaaddress) {
        this.detaaddress = detaaddress == null ? null : detaaddress.trim();
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }
}