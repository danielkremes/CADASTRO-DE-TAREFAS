package api_tasks.controller;

import api_tasks.entity.Tasks;
import api_tasks.services.TasksService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api_tasks/")
public class TasksController {

    private final TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @PostMapping
    public Tasks create(@Valid @RequestBody Tasks tasks) {
        return tasksService.createTask(tasks);
    }

    @GetMapping
    public List<Tasks> list() {
        return tasksService.listTasks();
    }

    @PutMapping
    public Tasks update(@RequestBody Tasks tasks) {
        return tasksService.updateTask(tasks);
    }

    @DeleteMapping("{id}")
    public List<Tasks> delete(@PathVariable("id") long id) {
        return tasksService.deleteTaskById(id);
    }
}
