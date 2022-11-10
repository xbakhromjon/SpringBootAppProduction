package uz.bakhromjon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 10/11/22, Thu, 21:52
 **/
@Controller
public class MainController {
    @Autowired
    private Environment env;

    @Value("${corporate.name}")
    private String corporateName;

    @GetMapping({"/", "/index"})
    public String welcomePage(Model model) {
        model.addAttribute("environments", env.getActiveProfiles());
        model.addAttribute("corporateName", corporateName);
        return "index";
    }
}
