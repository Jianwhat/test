package com.bj58.xxzl.qa.jacocoservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {

    @RequestMapping(value = "/cal", method = RequestMethod.GET)
    public int getResult(@RequestParam int a, @RequestParam int b) {
        if (a == 0 && b == 0) {
            return -1;
        } else if (a == 0 || b == 0) {
            return a + b;
        } else
            return a / b;
    }

}
