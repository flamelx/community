package life.majiang.community.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index()//@RequestParam(name = "name") String name, Model model)
    {
        //model.addAttribute("name",name);//没这行 hello.html的name有红线。。
        return "index";
    }
}
