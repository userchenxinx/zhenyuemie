package com.pinming.pojo;

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
                '}';
    }
}
