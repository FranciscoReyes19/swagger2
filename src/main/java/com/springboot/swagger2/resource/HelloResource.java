package com.springboot.swagger2.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Helloworld resource")
public class HelloResource {

    @ApiOperation(value="Returns Hello world get")
    @ApiResponses(
            value={
                    @ApiResponse(code = 100, message = "100 es el mensaje"),
                    @ApiResponse(code = 200, message = "Sucesfull response")
            }
    )
    @GetMapping
    public String hello(){
        return "Hello world";
    }

    @ApiOperation(value="Returns Hello world post")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello ){
        return hello;
    }

    @ApiOperation(value="Returns Hello world put")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello ){
        return hello;
    }
}
