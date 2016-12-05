package com.github.wx.gadget.service.impl;

import com.github.wx.gadget.dbo.User;
import com.github.wx.gadget.mybatis.mapper.UserMapper;
import com.github.wx.gadget.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohao on 2016/12/2.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void unsubscribe(String openId) {
        userMapper.unsubscribe(openId);
    }

    @Override
    public List<User> list() {
        return userMapper.all();
    }

}
