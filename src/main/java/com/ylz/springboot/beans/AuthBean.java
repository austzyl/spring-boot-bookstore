package com.ylz.springboot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by yaleizhu on 2018/9/3.
 * description:
 */
@Component
@PropertySource("classpath:auth.properties")
public class AuthBean {

    @Value("${auth.username}")
    private String username;
    @Value("${auth.password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
