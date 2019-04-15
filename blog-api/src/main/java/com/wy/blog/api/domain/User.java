package com.wy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 * @author wangyong
 */
@Data
public class User implements Serializable {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 邮箱
     */
    private String email;
}
