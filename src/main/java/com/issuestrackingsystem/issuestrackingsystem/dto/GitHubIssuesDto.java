package com.issuestrackingsystem.issuestrackingsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GitHubIssuesDto {
    @JsonProperty("url")
    private String url;

    @JsonProperty("repository_url")
    private String repositoryUrl;

    @JsonProperty("labels_url")
    private String labelsUrl;

    @JsonProperty("comments_url")
    private String commentsUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("html_url")
    private String htmlUrl;


    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("number")
    private int number;

    @JsonProperty("title")
    private String title;

    @JsonProperty("labels")
    private String[] labels;

    @JsonProperty("state")
    private String state;

    @JsonProperty("locked")
    private boolean locked;

    @JsonProperty("comments")
    private int comments;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("closed_at")
    private String closedAt;

    @JsonProperty("author_association")
    private String authorAssociation;

    @JsonProperty("active_lock_reason")
    private String activeLockReason;

    @JsonProperty("draft")
    private boolean draft;

    @JsonProperty("body")
    private String body;

    @JsonProperty("timeline_url")
    private String timelineUrl;

    @JsonProperty("performed_via_github_app")
    private String performedViaGithubApp;

    @JsonProperty("state_reason")
    private String stateReason;

}
