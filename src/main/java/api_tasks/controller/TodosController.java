package api_tasks.controller;

import api_tasks.entity.Todos;
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
    public Todos create(@Valid @RequestBody Todos todos) {
        System.out.println("Recebido: " + todos);
        System.out.println("Nome: " + todos.getName());
        System.out.println("Descrição: " + todos.getDescription());
        System.out.println("Realizado: " + todos.isRealized());
        System.out.println("Prioridade: " + todos.getPriority());
        return todosService.create(todos);
    }


    @GetMapping
    public List<Todos> list() {
        return todosService.list();
    }

    @PutMapping
    public Todos update(@RequestBody Todos todos) {
        return todosService.update(todos);
    }

    @DeleteMapping("{id}")
    public List<Todos> delete(@PathVariable("id")  long id) {
        return todosService.delete(id);
    }
}
