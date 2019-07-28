package com.bchd.user.service.impl;

import com.bchd.user.channels.IUserOutputChannels;
import com.bchd.user.service.ISendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Author: yth
 * @Date: 2019-07-22 21:44
 * @Version 1.0
 * @Description SpringCloud Stream
 */
@EnableBinding(IUserOutputChannels.class)
public class SendMessageServiceImpl implements ISendMessageService {

    @Autowired
    private IUserOutputChannels userOutputChannels;

    @Override
    public void sendMessage(String message){
        userOutputChannels.userChangeOutput().send(MessageBuilder.withPayload(message).build());
    }

}
