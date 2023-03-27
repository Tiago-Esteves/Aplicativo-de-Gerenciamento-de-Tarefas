package todoApp;

import controller.ProjectController;
//import java.util.List;
import model.Project;

public class App {
    

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Description");
        projectController.save(project);
        /**
        project.setName("Novo nome");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos" + projects.size());**/
        
    }
}
