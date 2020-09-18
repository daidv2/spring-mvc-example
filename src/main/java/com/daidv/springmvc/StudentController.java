package com.daidv.springmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import java.util.HashMap;

@Controller
@RequestMapping("/student/")
public class StudentController {
    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(ModelMap model) {
        Student sv = new Student(1, "Nguyen Van A", 28, "WEB");
        model.addAttribute("student", sv);
        return "student/index";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("student") Student student, ModelMap model) {
        model.addAttribute("id", student.getId());
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("major", student.getMajor());

        return "student/result";
    }

    @ModelAttribute("majors")
    public Map<String, String> getMajors() {
        Map<String, String> majors = new HashMap<String, String>();
        majors.put("APP", "Ứng dụng phần mềm");
        majors.put("WEB", "Thiết kế trang web");
        return majors;
    }
}
