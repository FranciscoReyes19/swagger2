package com.springboot.swagger2.resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello ){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello ){
        return hello;
    }
}
