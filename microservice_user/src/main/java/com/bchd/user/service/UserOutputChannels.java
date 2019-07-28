package com.bchd.user.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: yth
 * @Date: 2019-07-25 15:52
 * @Version 1.0
 * @Description 输出通道
 */
public interface UserOutputChannels {

    @Output("userChangeOutput")
    MessageChannel userChangeOutput();
}
