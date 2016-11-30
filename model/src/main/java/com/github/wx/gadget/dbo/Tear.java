package com.github.wx.gadget.dbo;

import lombok.Data;

import java.util.Date;

@Data
public class Tear {
    private Integer id;

    private String name;

    private Date createTime;

    private Integer version;
}