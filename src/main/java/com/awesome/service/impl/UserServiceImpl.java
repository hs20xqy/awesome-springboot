package com.awesome.service.impl;

import com.awesome.bean.User;
import com.awesome.dao.IUserDao;
import com.awesome.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hs on 2017/4/10.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public User getUserById(Integer userId) {
        return userDao.getUser(userId);
    }

}
