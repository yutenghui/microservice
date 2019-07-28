package com.bchd.user.service.impl;

import com.bchd.user.service.UserOutputChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Author: yth
 * @Date: 2019-07-22 21:44
 * @Version 1.0
 * @Description
 */
@EnableBinding(UserOutputChannels.class)
public class SendMessageService {

    @Autowired
    private UserOutputChannels userOutputChannels;

    public void sendMessage(String message){
        userOutputChannels.userChangeOutput().send(MessageBuilder.withPayload(message).build());
    }

}
