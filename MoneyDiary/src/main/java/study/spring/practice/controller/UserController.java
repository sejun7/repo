package study.spring.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.spring.practice.domain.User;
import study.spring.practice.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @PostMapping("/register")
    public String registerSave(
            @RequestParam(value = "email") String email
            , @RequestParam(value = "password") String password
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "grade") int grade) {

        User user = new User(email, password, name, grade);
        userService.register(user);

        return "redirect:/";
    }

    @GetMapping("/my-login")
    public String login() {
        return "user/login";
    }
}
