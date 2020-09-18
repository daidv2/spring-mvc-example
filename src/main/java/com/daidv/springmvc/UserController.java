package com.daidv.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user/")
public class UserController {
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "user/login";
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(ModelMap model, @RequestParam("uid") String id, @RequestParam("pwd") String pw) {
        model.addAttribute("uid", id);
        model.addAttribute("pwd", pw);
        return "user/info";
    }

    // use Java Bean
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(ModelMap model, User user) {
        if (user.getId().equals("daidv") && user.getPassword().equals("123")) {
            model.addAttribute("uid", user.getId());
            model.addAttribute("pwd", user.getPassword());
            return "redirect:info";
        }

        model.addAttribute("message", "Sai thông tin đăng nhập");
        return "user/login";
    }

    // use HttpServletRequest
    public String login1(HttpServletRequest request) {
        String id = request.getParameter("id");
        String pw = request.getParameter("password");
        if (id.equals("daidv") && pw.equals("123")) {
            request.setAttribute("uid", id);
            request.setAttribute("pwd", pw);
            return "user/info";
        }
        request.setAttribute("message", "Sai thông tin đăng nhập");
        return "user/login";
    }

    // use ModelMap
    public String login2(ModelMap model, HttpServletRequest request) {
        String id = request.getParameter("id");
        String pw = request.getParameter("password");
        if (id.equals("daidv") && pw.equals("123")) {
            model.addAttribute("uid", id);
            model.addAttribute("pwd", pw);
            return "user/info";
        }
        request.setAttribute("message", "Sai thông tin đăng nhập");
        return "user/login";
    }

    // use @RequestParam
    public String login3(ModelMap model, @RequestParam("id") String id, @RequestParam("password") String pw) {
        if (id.equals("daidv") && pw.equals("123")) {
            model.addAttribute("uid", id);
            model.addAttribute("pwd", pw);
            return "user/info";
        }

        model.addAttribute("message", "Sai thông tin đăng nhập");
        return "user/login";
    }
}
