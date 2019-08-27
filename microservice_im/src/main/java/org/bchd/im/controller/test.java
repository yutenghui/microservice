package org.bchd.im.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yth
 * @Date: 2019-08-26 20:27
 * @Version 1.0
 * @Description
 */
@RestController
@RefreshScope
public class test {
    @Value("${name}")
    public String name;

    @PostMapping("/test")
    public String test(){
        return name;
    }
}
