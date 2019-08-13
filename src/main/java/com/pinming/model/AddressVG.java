package com.pinming.model;

/**
 * @program: zhenyuemie
 * @author: Larissa
 * @create: 2019-08-10 14:38
 */

public class AddressVG {

    private String consignee;
    private String tel;
    private String province;
    private String city;
    private String area;
    private String detaaddress;
    private Integer postalcode;

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetaaddress() {
        return detaaddress;
    }

    public void setDetaaddress(String detaaddress) {
        this.detaaddress = detaaddress;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }
}
