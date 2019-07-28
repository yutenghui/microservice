package com.bchd.user.repository;

import com.bchd.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yth
 * @Date: 2019-04-20 18:21
 * @Version 1.0
 * @Description
 */
public interface IUserRepository extends JpaRepository<User,Integer> {
    User findUserByMobile(String mobile);
}
