package com.zoetewey.nhlscoreboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Team {

  private Long id;
  private String name;
  private String link;
  private String abbreviation;
  private String teamName;
  private String locationName;
  private Long firstYearOfPlay;
  private String shortName;
  private String officialSiteUrl;
  private Long franchiseId;
  private boolean active;

  private Venue venue;
  private Division division;
  private Conference conference;
  private Franchise franchise;

}
