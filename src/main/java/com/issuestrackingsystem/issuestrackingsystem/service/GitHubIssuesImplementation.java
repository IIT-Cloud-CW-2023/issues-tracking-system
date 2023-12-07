package com.issuestrackingsystem.issuestrackingsystem.service;

import com.issuestrackingsystem.issuestrackingsystem.dto.GitHubIssuesDto;
import com.issuestrackingsystem.issuestrackingsystem.model.GitHubIssues;
import com.issuestrackingsystem.issuestrackingsystem.repository.GitHubIssuesRepository;
import com.issuestrackingsystem.issuestrackingsystem.service.external.GitHubExternalIssues;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GitHubIssuesImplementation implements GitHubIssuesService {
    private final GitHubExternalIssues gitHubExternalIssues;
    private final GitHubIssuesRepository gitHubIssuesRepository;

    @Override
    public List<GitHubIssues> getGitHubIssues() {
        List<GitHubIssues> gitHubIssues = new ArrayList<>();
        List<GitHubIssuesDto> gitHubIssuesDtoList = this.gitHubExternalIssues.getIssuesDetails();
        gitHubIssuesDtoList.forEach(gitHubIssuesDto -> {
            GitHubIssues gitHubIssue = this.generateGitHubIssuesObject(gitHubIssuesDto);
            gitHubIssues.add(gitHubIssue);
        });
        this.gitHubIssuesRepository.saveAll(gitHubIssues);
        return gitHubIssues;
    }

    @Override
    public List<GitHubIssues> getAllHubIssues() {
        return this.gitHubIssuesRepository.findAll();
    }
    private GitHubIssues generateGitHubIssuesObject(GitHubIssuesDto gitHubIssuesDto) {
        return GitHubIssues.builder()
                .url(gitHubIssuesDto.getUrl())
                .repositoryUrl(gitHubIssuesDto.getRepositoryUrl())
                .labelsUrl(gitHubIssuesDto.getLabelsUrl())
                .commentsUrl(gitHubIssuesDto.getCommentsUrl())
                .eventsUrl(gitHubIssuesDto.getEventsUrl())
                .htmlUrl(gitHubIssuesDto.getHtmlUrl())
                .nodeId(gitHubIssuesDto.getNodeId())
                .number(gitHubIssuesDto.getNumber())
                .title(gitHubIssuesDto.getTitle())
                .labels(gitHubIssuesDto.getLabels())
                .state(gitHubIssuesDto.getState())
                .locked(gitHubIssuesDto.isLocked())
                .comments(gitHubIssuesDto.getComments())
                .createdAt(gitHubIssuesDto.getCreatedAt())
                .updatedAt(gitHubIssuesDto.getUpdatedAt())
                .closedAt(gitHubIssuesDto.getClosedAt())
                .authorAssociation(gitHubIssuesDto.getAuthorAssociation())
                .activeLockReason(gitHubIssuesDto.getActiveLockReason())
                .draft(gitHubIssuesDto.isDraft())
                .body(gitHubIssuesDto.getBody())
                .timelineUrl(gitHubIssuesDto.getTimelineUrl())
                .performedViaGithubApp(gitHubIssuesDto.getPerformedViaGithubApp())
                .stateReason(gitHubIssuesDto.getStateReason())
                .build();


    }
}
