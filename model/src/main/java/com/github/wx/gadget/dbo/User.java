package com.github.wx.gadget.dbo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String name;

    private String password;

    private Boolean starred;

    private Date createTime;

    private Long version;

    private String subscribe;

    private String openid;

    private String nickname;

    private String sex;

    private String city;

    private String country;

    private String province;

    private String language;

    private String headimgurl;

    private String subscribeTime;

    private String unionid;

    private String remark;

    private String groupid;
}