package securitydemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping
    public String transferMoney() {
        return "succes";
    }

    @PostMapping("/transfer")
    public String transfer() {
        return "transfersuccess";
    }
}