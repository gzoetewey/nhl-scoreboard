package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {

  private Long id;
  private String name;
  private String link;
  private String city;
  private TimeZone timeZone;

}
