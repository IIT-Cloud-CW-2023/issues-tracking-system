package com.issuestrackingsystem.issuestrackingsystem.service.external;

import com.issuestrackingsystem.issuestrackingsystem.dto.GitHubIssuesDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class GitHubExternalIssues {
    private final RestTemplate restTemplate;

    @Value("${github.issues-detail-url}")
    private String gitHubIssuesDetailsUrl;

    public GitHubExternalIssues(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<GitHubIssuesDto> getIssuesDetails() {
        ResponseEntity<List<GitHubIssuesDto>> response = restTemplate.exchange(gitHubIssuesDetailsUrl, HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });
        return response.getBody();
    }
}

