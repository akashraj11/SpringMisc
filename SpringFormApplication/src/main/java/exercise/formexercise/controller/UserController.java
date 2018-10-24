package exercise.formexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import exercise.formexercise.configuration.User;

@Controller
public class UserController {
    @RequestMapping("/")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
        String name = user.getName();
        String password  = user.getPassword();
        return "result";
    }

}
