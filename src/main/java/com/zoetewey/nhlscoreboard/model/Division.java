package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Division {

  private Long id;
  private String name;
  private String nameShort;
  private String link;
  private String abbreviation;

}
