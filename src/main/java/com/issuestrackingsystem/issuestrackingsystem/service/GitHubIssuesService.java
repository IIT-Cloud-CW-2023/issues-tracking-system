package com.issuestrackingsystem.issuestrackingsystem.service;

import com.issuestrackingsystem.issuestrackingsystem.model.GitHubIssues;

import java.util.List;

public interface GitHubIssuesService {
    List<GitHubIssues> getGitHubIssues();

    List<GitHubIssues> getAllHubIssues();
}
