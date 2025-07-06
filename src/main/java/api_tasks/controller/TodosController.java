package api_tasks.controller;

import api_tasks.entity.Tasks;
import api_tasks.services.TodosService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodosController {

    private final TodosService todosService;

    public TodosController(TodosService todosService) {
        this.todosService = todosService;
    }

    @PostMapping
    public Tasks create(@Valid @RequestBody Tasks tasks) {
        System.out.println("Recebido: " + tasks);
        System.out.println("Nome: " + tasks.getName());
        System.out.println("Descrição: " + tasks.getDescription());
        System.out.println("Realizado: " + tasks.isRealized());
        System.out.println("Prioridade: " + tasks.getPriority());
        return todosService.create(tasks);
    }


    @GetMapping
    public List<Tasks> list() {
        return todosService.list();
    }

    @PutMapping
    public Tasks update(@RequestBody Tasks tasks) {
        return todosService.update(tasks);
    }

    @DeleteMapping("{id}")
    public List<Tasks> delete(@PathVariable("id")  long id) {
        return todosService.delete(id);
    }
}
