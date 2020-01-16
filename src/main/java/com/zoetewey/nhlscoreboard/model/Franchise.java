package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Franchise {

  private Long franchiseId;
  private String teamName;
  private String link;

}
