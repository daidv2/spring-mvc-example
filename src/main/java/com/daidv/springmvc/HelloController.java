package com.daidv.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.ModelMap;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

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

    @RequestMapping("el/demo1")
    public String demo1(ModelMap model, HttpSession session) {
        session.setAttribute("name", "Nguyen Van A");
        model.addAttribute("salary", 2000);
        return "el/demo1";
    }

    @RequestMapping("el/demo2")
    public String demo2(ModelMap model) {
        Student sv = new Student(1, "Nguyen Van A", 28, "WEB");
        model.addAttribute("student", sv);

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        model.addAttribute("items", list);

        Map<String, String> majors = new HashMap<String, String>();
        majors.put("app", "Ứng dụng phần mềm");
        majors.put("web", "Thiết kế trang web");
        model.addAttribute("majors", majors);

        return "el/demo2";
    }
}
