package com.lifecount.service.impl;


import com.lifecount.dao.UserMapper;
import com.lifecount.o_po.User;
import com.lifecount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public void register(User user) {
        userMapper.insert(user);
    }
}
