package org.bchd.im.service;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: yth
 * @Date: 2019-07-25 15:57
 * @Version 1.0
 * @Description
 */
public interface UserInputChannels {

    @Input("userChangeInput")
    SubscribableChannel userChangeInput();
}
