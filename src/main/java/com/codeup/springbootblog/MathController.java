package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


//    @GetMapping("/add/{x}/and/{y}")
//    @ResponseBody
//    public Double add(@PathVariable Double x, @PathVariable Double y) {
//        return x + y;
//    }

//    @GetMapping("/add/{x}/and/{y}")
//    @ResponseBody
//    public String add(@PathVariable int x, @PathVariable int y) {
//        return "" + (x + y);
//    }

    @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public String add(@PathVariable int x, @PathVariable int y) {
        return x + " + " + y + " = " + (x + y);
    }

    @GetMapping("/subtract/{x}/and/{y}")
    @ResponseBody
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return ""  + (x - y);
    }

    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return ""  + (x * y);
    }

    @GetMapping("/divide/{x}/and/{y}")
    @ResponseBody
    public String divide(@PathVariable int x, @PathVariable int y) {
        return ""  + (x / y);
    }
}