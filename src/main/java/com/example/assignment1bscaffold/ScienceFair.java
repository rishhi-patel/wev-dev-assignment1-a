package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

public class ScienceFair {
    private String title;
    private List<ScienceProject> projects;

    public ScienceFair(String title) {
        this.title = title;
        this.projects = new ArrayList<>();
    }

    public void addProject(ScienceProject project) {
        projects.add(project);
    }

    public List<ScienceProject> getProjects() {
        return projects;
    }

    public String getTitle() {
        return title;
    }
}
