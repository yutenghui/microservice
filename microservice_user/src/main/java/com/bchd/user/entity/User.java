package com.bchd.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author: yth
 * @Date: 2019-04-20 18:21
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class User {
    private Integer id;
    private String userName;
    private String sex;
    private Integer age;
}
