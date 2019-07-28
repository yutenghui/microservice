package com.bchd.user.service.impl;

import com.bchd.common.utils.IdWorker;
import com.bchd.user.entity.User;
import com.bchd.user.repository.IUserRepository;
import com.bchd.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author: yth
 * @Date: 2019-07-28 11:30
 * @Version 1.0
 * @Description
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private IdWorker idWorker;


    @Override
    public User login(String mobile,String password) {
        User userLogin = iUserRepository.findUserByMobile(mobile);
        if (!StringUtils.isEmpty(userLogin) && bCryptPasswordEncoder.matches(password,userLogin.getPassword())){
            return userLogin;
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        user.setId(idWorker.nextId()+"");
        //密码加密
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        iUserRepository.saveAndFlush(user);
    }
}
