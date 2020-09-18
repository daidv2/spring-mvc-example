package com.daidv.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value="login", method=RequestMethod.GET)
    public String login() {
        return "user/login";
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(ModelMap model, HttpServletRequest request) {
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

    public String sayHelloBk(HttpServletRequest request) {
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
}
