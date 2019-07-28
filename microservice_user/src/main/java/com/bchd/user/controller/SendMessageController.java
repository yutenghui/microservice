package com.bchd.user.controller;

import com.bchd.user.entity.Message;
import com.bchd.user.service.ISendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yth
 * @Date: 2019-07-22 21:49
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/user")
public class SendMessageController {

    @Autowired
    private ISendMessageService iSendMessageService;

    @PostMapping("/sendMessage")
    public void sendMessage(@RequestBody Message message){
        iSendMessageService.sendMessage(message.toString());
    }
}
