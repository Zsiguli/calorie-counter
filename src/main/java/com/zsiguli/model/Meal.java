package com.zsiguli.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "meals")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date date;
  private TypeOfMeal type;
  private String description;
  private Long calories;
}
