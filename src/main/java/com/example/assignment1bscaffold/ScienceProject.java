package com.example.assignment1bscaffold;

public class ScienceProject {
    private String projectName;
    private String participantName;
    private String category;

    public ScienceProject(String projectName, String participantName, String category) {
        this.projectName = projectName;
        this.participantName = participantName;
        this.category = category;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public String getCategory() {
        return category;
    }
}
