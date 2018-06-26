package com.accountsystem.hellodemoproduces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceProduceController {

    @RequestMapping("/helloProduce")
    public String sayHelloProduce(String name) {
        return "hello : "+ name;
    }
}
