package com.rolling.page.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/start")
    public String createPaper(Model model) {
        return "paper-create";
    }

    @GetMapping("{paperPath}")
    public String paperHome(Model model) {
        return "paper";
    }
}
