package org.allen.springsecurity.client.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
