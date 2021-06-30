package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) { // 데이터 받아서 view로 넘김
        model.addAttribute("data", "hello!!!");
        return "hello";
    }
}
