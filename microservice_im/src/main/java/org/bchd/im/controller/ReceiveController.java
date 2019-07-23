package org.bchd.im.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yth
 * @Date: 2019-07-23 19:22
 * @Version 1.0
 * @Description
 */
@RestController
@EnableBinding(Sink.class)
public class ReceiveController {

    @StreamListener(Sink.INPUT)
    public void receiveController(Object payload){
        System.out.println(payload);
    }
}
