package com.wimm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleSpringBootController {

    /*@RequestMapping("/")
    @ResponseBody
    String home() {
        return "index.html";
    }*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleSpringBootController.class, args);
    }
}
