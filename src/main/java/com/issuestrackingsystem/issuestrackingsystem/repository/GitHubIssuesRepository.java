package com.issuestrackingsystem.issuestrackingsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.issuestrackingsystem.issuestrackingsystem.model.GitHubIssues;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubIssuesRepository extends MongoRepository<GitHubIssues, String> {
}
