package com.zsiguli.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "meals")
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date date;
  private TypeOfMeal typeOfMeal;
  private String description;
  private Long calories;
}
