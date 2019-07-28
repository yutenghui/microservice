package com.bchd.user.service;

/**
 * @Author: yth
 * @Date: 2019-07-28 12:11
 * @Version 1.0
 * @Description
 */
public interface ISendMessageService {
    /**
     * 向消息队列发送消息
     * @param message 消息
     */
    void sendMessage(String message);
}
