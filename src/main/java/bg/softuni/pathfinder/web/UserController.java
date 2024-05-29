package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.services.dto.UserLoginDTO;
import bg.softuni.pathfinder.services.dto.UserRegisterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, UserLoginDTO userLoginDTO){
        System.out.println();
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(Model model){

        return "register";
    }

    @PostMapping("/register")
    public String register(Model model, UserRegisterDTO userRegisterDTO){
        System.out.println();

        //if successful reg
        return "redirect:/users/login";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        System.out.println();

        return "profile";
    }


}