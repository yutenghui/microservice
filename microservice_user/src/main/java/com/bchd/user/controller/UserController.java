package com.bchd.user.controller;

import com.bchd.common.entity.Result;
import com.bchd.common.utils.JWTUtil;
import com.bchd.user.entity.User;
import com.bchd.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yth
 * @Date: 2019-07-28 11:04
 * @Version 1.0
 * @Description
 */
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private JWTUtil jwtUtil;

    @Value("${jwt.config.key}")
    private String jwt;

    /**
     * 用户登录
     * @param user 用户
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User userLogin = iUserService.login(user.getMobile(), user.getPassword());
        if (StringUtils.isEmpty(userLogin)){
            return Result.fail();
        }
        String token = jwtUtil.createJWT(userLogin.getId(), userLogin.getMobile(), "user");
        Map<String,Object> map = new HashMap();
        map.put("token",token);
        map.put("roles","user");
        return Result.success(map);
    }

    /**
     * 用户注册
     * @param code 短信验证码
     * @param user 用户
     * @return
     */
    @PostMapping(value = "/register/{code}")
    public Result register(@PathVariable String code, @RequestBody User user){
        iUserService.addUser(user);
        return Result.success();
    }
    @PostMapping(value = "/test")
    public Result test(){
        return Result.success(jwt);
    }



}
