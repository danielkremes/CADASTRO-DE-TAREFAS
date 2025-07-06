package api_tasks.controller;

import api_tasks.entity.Tasks;
import api_tasks.services.TasksService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TasksController {

    private final TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @PostMapping
    public Tasks create(@Valid @RequestBody Tasks tasks) {
        System.out.println("Recebido: " + tasks);
        System.out.println("Nome: " + tasks.getName());
        System.out.println("Descrição: " + tasks.getDescription());
        System.out.println("Realizado: " + tasks.isRealized());
        System.out.println("Prioridade: " + tasks.getPriority());
        return tasksService.create(tasks);
    }


    @GetMapping
    public List<Tasks> list() {
        return tasksService.list();
    }

    @PutMapping
    public Tasks update(@RequestBody Tasks tasks) {
        return tasksService.update(tasks);
    }

    @DeleteMapping("{id}")
    public List<Tasks> delete(@PathVariable("id")  long id) {
        return tasksService.delete(id);
    }
}
