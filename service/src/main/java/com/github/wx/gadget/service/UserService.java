package com.github.wx.gadget.service;

import com.github.wx.gadget.dbo.User;

/**
 * Created by luohao on 2016/12/2.
 */
public interface UserService {

    void insertUser(User user);

    void unsubscribe(String openId);
}
