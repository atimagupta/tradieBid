package org.tradieBid.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.time.LocalDateTime;

@Entity
@Table(appliesTo = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String projectName;

    private LocalDateTime deadline;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadline = deadLine;
    }
}