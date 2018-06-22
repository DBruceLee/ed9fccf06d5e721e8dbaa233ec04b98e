package com.accountsystem.hellodemoconsumefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceConsumeFeignController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/helloConsumeFeign")
    public String hello(String name) {
        return helloService.sayHello(name);
    }
}
