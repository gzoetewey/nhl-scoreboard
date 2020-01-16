package com.zoetewey.nhlscoreboard.controller;

import com.zoetewey.nhlscoreboard.model.Teams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, path = "/teams")
@PropertySource("classpath:nhl-api.properties")
public class TeamController {

  @Value("${nhl.api.host.url}")
  private String nhlApiUrl;

  @Value("${nhl.api.endpoint.teams}")
  private String teamEndpoint;

  @GetMapping("/")
  public Teams teams() {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(nhlApiUrl + teamEndpoint, Teams.class);
  }

  @GetMapping("/{id}")
  public Teams teamsById(@PathVariable Long id) {
    RestTemplate restTemplate = new RestTemplate();
    String url = nhlApiUrl + teamEndpoint + "/" + id;
    return restTemplate.getForObject(url, Teams.class);
  }
}
