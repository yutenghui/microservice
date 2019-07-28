package com.bchd.user.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: yth
 * @Date: 2019-07-25 15:52
 * @Version 1.0
 * @Description user输出通道
 */
public interface IUserOutputChannels {

    /**
     * 用户变更输出
     * @return
     */
    @Output("userChangeOutput")
    MessageChannel userChangeOutput();
}
