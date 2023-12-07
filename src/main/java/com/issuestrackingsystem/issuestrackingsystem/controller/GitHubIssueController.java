package com.issuestrackingsystem.issuestrackingsystem.controller;

import com.issuestrackingsystem.issuestrackingsystem.model.GitHubIssues;
import com.issuestrackingsystem.issuestrackingsystem.service.GitHubIssuesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/git-hub")
public class GitHubIssueController {
    private final GitHubIssuesService gitHubIssuesService;

    @GetMapping("/issues")
    public ResponseEntity<List<GitHubIssues>> getGitHubIssues() {
        return ResponseEntity.ok(this.gitHubIssuesService.getGitHubIssues());
    }

    @GetMapping("/issues/get-all")
    public ResponseEntity<List<GitHubIssues>> getAllHubIssues() {
        return ResponseEntity.ok(this.gitHubIssuesService.getAllHubIssues());
    }
}
