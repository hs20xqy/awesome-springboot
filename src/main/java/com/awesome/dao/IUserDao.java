package com.awesome.dao;

import com.awesome.bean.User;

/**
 * Created by hs on 2017/4/10.
 */
public interface IUserDao {

    User getUser(Integer userId);
}
