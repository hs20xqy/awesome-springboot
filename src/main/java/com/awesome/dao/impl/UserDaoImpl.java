package com.awesome.dao.impl;

import com.awesome.bean.User;
import com.awesome.dao.IUserDao;
import com.awesome.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by hs on 2017/4/10.
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
