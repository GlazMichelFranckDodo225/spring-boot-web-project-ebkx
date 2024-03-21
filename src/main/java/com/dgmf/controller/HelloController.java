package com.dgmf.controller;

import org.springframework.web.bind.annotation.*;

@RestController // @Controller + @ResponseBody
public class HelloController {
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring !";
    }

    // @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @PostMapping("/hello")
    public String helloUser(@RequestBody String username) {
        return "Hello " + username + " !";
    }
}
