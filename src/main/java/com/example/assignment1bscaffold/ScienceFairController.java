package com.example.assignment1bscaffold;

// Information Expert which handles all processes related to Sciene Event.
public class ScienceFairController {
    private ScienceFairRepository repository = new ScienceFairRepository();

    public void createFair(String title) {
        ScienceFair fair = new ScienceFair(title);
        repository.addScienceFair(fair);
    }

    public void registerProject(String fairTitle, String projectName, String participantName, String category) {
        for (ScienceFair fair : repository.getAllFairs()) {
            if (fair.getTitle().equals(fairTitle)) {
                ScienceProject project = new ScienceProject(projectName, participantName, category);
                fair.addProject(project);

            }
        }
    }

    public void displayProjects(String fairTitle) {
        for (ScienceFair fair : repository.getAllFairs()) {
            if (fair.getTitle().equals(fairTitle)) {
                System.out.println("\nProjects for " + fair.getTitle() + ":");
                for (ScienceProject project : fair.getProjects()) {
                    System.out.println('\n' + project.getProjectName() + " - " + project.getParticipantName() + " ("
                            + project.getCategory() + ")");
                }
            }
        }
    }
}
