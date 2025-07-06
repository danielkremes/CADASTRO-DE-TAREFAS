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

    // Criar um novo Todo
    public Tasks create(Tasks tasks) {
        System.out.println("Salvando no banco: " + tasks);
        return tasksRepository.save(tasks); // Salva o objeto no banco de dados
    }

    // Listar todos os Tasks
    public List<Tasks> list() {
        return tasksRepository.findAll();
    }

    // Atualizar um Todo
    public Tasks update(Tasks tasks) {
        return tasksRepository.save(tasks); // Atualiza se o ID existir
    }

    // Deletar um Todo
    public List<Tasks> delete(long id) {
        tasksRepository.deleteById(id); // Deleta o objeto pelo ID
        return list(); // Retorna a lista atualizada
    }
}
