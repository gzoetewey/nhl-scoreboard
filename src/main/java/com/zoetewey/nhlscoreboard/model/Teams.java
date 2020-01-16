package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Teams {

  private String copyright;
  private List<Team> teams;

}
