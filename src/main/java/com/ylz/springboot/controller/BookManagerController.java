package com.ylz.springboot.controller;

import com.ylz.springboot.beans.AuthBean;
import com.ylz.springboot.beans.ResultObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaleizhu on 2018/8/30.
 * description:
 */
@RestController
public class BookManagerController {

    private static final Logger log = LoggerFactory.getLogger(BookManagerController.class);

    @Value("${book.name}")
    private  String bookName;

    @Autowired
    private AuthBean bean;


    @RequestMapping("/index")
    public ResultObject<String> index() {
        log.info("------------------this book names {}----------------",bookName);

        return new ResultObject<>("this is my book store!~" + bookName + bean.getUsername()) ;
    }
}
