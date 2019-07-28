package com.bchd.user.service;

import com.bchd.user.entity.User;

/**
 * @Author: yth
 * @Date: 2019-07-28 11:29
 * @Version 1.0
 * @Description
 */
public interface IUserService {
    /**
     * 用户登录
     * @param mobile 手机号
     * @param password 密码
     * @return
     */
    User login(String mobile,String password);

    /**
     * 添加用户
     * @param user 用户
     */
    void addUser(User user);
}
