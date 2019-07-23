package com.bchd.user.entity;

import lombok.Data;

/**
 * @Author: yth
 * @Date: 2019-07-22 21:53
 * @Version 1.0
 * @Description
 */
@Data
public class Message {
    private Integer id;
    private Integer userId;
    private String type;
}
