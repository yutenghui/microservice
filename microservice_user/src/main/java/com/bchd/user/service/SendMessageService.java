package com.bchd.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Author: yth
 * @Date: 2019-07-22 21:44
 * @Version 1.0
 * @Description
 */
@EnableBinding(Source.class)
public class SendMessageService {

    @Autowired
    private Source source;

    public void sendMessage(String message){
        source.output().send(MessageBuilder.withPayload(message).build());
    }

}
