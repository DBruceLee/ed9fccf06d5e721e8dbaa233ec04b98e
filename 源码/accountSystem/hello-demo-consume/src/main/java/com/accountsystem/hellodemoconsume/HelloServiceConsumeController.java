package com.accountsystem.hellodemoconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloServiceConsumeController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/helloConsume")
    public String sayHelloConsume(String name) {

        // 这种方式只是一种,我们开发时会用其他方式
        // 调用接口提供方
        return restTemplate.getForObject("http://hello-demo-produces/helloProduce?name=" + name, String.class);
    }
}
