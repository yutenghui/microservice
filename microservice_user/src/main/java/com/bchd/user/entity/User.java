package com.bchd.user.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author: yth
 * @Date: 2019-04-20 18:21
 * @Version 1.0
 * @Description
 */
@Data
@Entity
@Table()
public class User {
    private Integer id;
    private String userName;
    private String sex;
    private Integer age;
}
