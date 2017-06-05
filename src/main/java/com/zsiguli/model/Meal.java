package com.zsiguli.model;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "meals")
@Getter
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date date;
  private TypeOfMeal type;
  private String description;
  private Long calories;
}
