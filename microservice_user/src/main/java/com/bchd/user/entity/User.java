package com.bchd.user.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: yth
 * @Date: 2019-04-20 18:21
 * @Version 1.0
 * @Description
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private String faceImage;

    private String faceImageBig;

    private String nickname;

    private String qrcode;

    private String cid;
}
