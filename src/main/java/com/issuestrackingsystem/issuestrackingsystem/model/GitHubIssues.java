package com.issuestrackingsystem.issuestrackingsystem.model;

import com.issuestrackingsystem.issuestrackingsystem.dto.GitHubIssuesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "github_issues")
public class GitHubIssues {
    @Id
    private String id;
    private String url;
    private String repositoryUrl;
    private String labelsUrl;
    private String commentsUrl;
    private String eventsUrl;
    private String htmlUrl;
    private String nodeId;
    private int number;
    private String title;
    private GitHubIssuesDto user;
    private String[] labels;
    private String state;
    private boolean locked;
    private int comments;
    private String createdAt;
    private String updatedAt;
    private String closedAt;
    private String authorAssociation;
    private String activeLockReason;
    private boolean draft;
    private String body;
    private String timelineUrl;
    private String performedViaGithubApp;
    private String stateReason;

}
