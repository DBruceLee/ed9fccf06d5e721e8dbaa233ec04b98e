package com.accountsystem.hellodemoconsumefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hello-demo-produces")
public interface HelloService {

    @RequestMapping("/helloProduce")
    String sayHello(@RequestParam("name") String name);
}
