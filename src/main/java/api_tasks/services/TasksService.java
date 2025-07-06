package api_tasks.services;

import api_tasks.entity.Tasks;
import api_tasks.repository.TasksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {

    private final TasksRepository tasksRepository;

    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    // Create new task
    public Tasks createTask(Tasks tasks) {
        return tasksRepository.save(tasks);
    }

    // List all tasks
    public List<Tasks> listTasks() {
        return tasksRepository.findAll();
    }

    // Update task
    public Tasks updateTask(Tasks tasks) {
        return tasksRepository.save(tasks);
    }
    // Deleted task
    public List<Tasks> deleteTaskById(long id) {
        tasksRepository.deleteById(id);
        return listTasks();
    }
}
