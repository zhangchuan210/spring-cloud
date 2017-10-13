package cn.cdboost.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zc
 * @desc
 * @create 2017-10-13 10:58
 **/
@RestController
public class HelloController {

//    @RequestMapping("/hello")
//    public String index(@RequestParam String name) {
//        return "hello " + name + "，this is first messge";
//    }

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is producer2  send first messge";
    }

}