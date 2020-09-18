package com.daidv.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("say-hello")
    public String sayHello() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("say-blo")
    public String sayBlo() {
        return "Bloooooooooooo";
    }
}
