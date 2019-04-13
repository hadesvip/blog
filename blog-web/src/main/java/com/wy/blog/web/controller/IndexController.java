package com.wy.blog.web.controller;

import com.wy.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author wangyong
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public User index() {
        User user = new User();
        user.setUserName("admin");
        user.setEmail("admin@126.com");
        return user;
    }


}
