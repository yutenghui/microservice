package com.bchd.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

/**
 * @Author: yth
 * @Date: 2019-07-28 10:04
 * @Version 1.0
 * @Description
 */
@Data
@Builder
public class Result implements Serializable {

    private String status;

    @Builder.Default
    private String timestamp = String.valueOf(System.currentTimeMillis());
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public static Result success() {
        return Result.builder().status("200").message("执行成功").build();
    }

    public static Result success(Object object) {
        return Result.builder().status("200").message("执行成功").data(object).build();
    }


    public static Result fail() {
        return Result.builder().status("500").message("执行失败").build();
    }

    public static Result fail(String message) {
        return Result.builder().status("500").message(message).build();
    }
}
