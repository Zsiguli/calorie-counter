package com.zsiguli.controller;

import com.zsiguli.model.Meal;
import com.zsiguli.model.TypeOfMeal;
import com.zsiguli.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  MealRepository mealRepository;

  @GetMapping("/")
  public String homePage(Model model) {
    model.addAttribute("meals", mealRepository.findAll());
    return "index";
  }

  @GetMapping("/addOrEdit")
  public String addOrEditPage(Model model) {
    model.addAttribute("meal", new Meal());
    model.addAttribute("types", TypeOfMeal.values());
    return "addOrEdit";
  }
}
