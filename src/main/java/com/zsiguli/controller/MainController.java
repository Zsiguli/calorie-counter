package com.zsiguli.controller;

import com.zsiguli.model.TypeOfMeal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String homePage() {
    return "index";
  }

  @GetMapping("/addOrEdit")
  public String addOrEditPage(Model model) {
    model.addAttribute("types", TypeOfMeal.values());
    return "addOrEdit";
  }
}
