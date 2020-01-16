package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeZone {

  private String id;
  private Long offset;
  private String tz;

}
