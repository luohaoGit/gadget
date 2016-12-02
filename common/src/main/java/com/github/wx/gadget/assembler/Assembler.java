package com.github.wx.gadget.assembler;

import com.github.wx.gadget.dbo.User;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

import java.util.Date;

/**
 * Created by luohao on 2016/12/2.
 */
public class Assembler {
    private static final String EMPTY = "";
    private static final Long ZERO = 0L;

    public static User assembler(WxMpUser mpUser){
        User user = new User();

        user.setName(mpUser.getNickname());
        user.setPassword(EMPTY);
        user.setStarred("1".equals(mpUser.getSubscribe()));
        user.setCreateTime(new Date());
        user.setVersion(ZERO);

        user.setSubscribe(mpUser.getSubscribe() ? "1" : "0");
        user.setOpenid(mpUser.getOpenId());
        user.setNickname(mpUser.getNickname());
        user.setSex(mpUser.getSex());
        user.setCity(mpUser.getCity());
        user.setCountry(mpUser.getCountry());
        user.setProvince(mpUser.getProvince());
        user.setLanguage(mpUser.getLanguage());
        user.setHeadimgurl(mpUser.getHeadImgUrl());
        user.setSubscribeTime(mpUser.getSubscribeTime() + "");
        user.setUnionid(mpUser.getUnionId());
        user.setRemark(mpUser.getRemark());
        user.setGroupid(mpUser.getGroupId() + "");

        return user;
    }

}
