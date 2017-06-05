package com.zsiguli.controller;

import com.zsiguli.model.Meal;
import com.zsiguli.model.Status;
import com.zsiguli.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealController {

  @Autowired
  MealRepository mealRepository;

  @PostMapping("/meal")
  public Status addNewMeal(@ModelAttribute("meal") Meal meal) {
    System.out.println(meal.getId() + "calories:" + meal.getCalories()
            + "date:" + meal.getDate()
            + "type:" + meal.getType()
            + "desc:" + meal.getDescription());
    mealRepository.save(meal);
    return new Status();
  }
}
