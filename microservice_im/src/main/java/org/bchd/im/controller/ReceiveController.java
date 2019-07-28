package org.bchd.im.controller;

import org.bchd.im.service.UserInputChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yth
 * @Date: 2019-07-23 19:22
 * @Version 1.0
 * @Description
 */
@RestController
@EnableBinding(UserInputChannels.class)
public class ReceiveController {

    @StreamListener("userChangeInput")
    public void receiveUserChangeMessage(Object payload){
        System.out.println(payload);
    }
}
