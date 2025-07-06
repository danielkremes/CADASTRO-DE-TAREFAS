package api_tasks.services;

import api_tasks.entity.Tasks;
import api_tasks.repository.TodosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {

    private final TodosRepository todosRepository;

    public TodosService(TodosRepository todosRepository) {
        this.todosRepository = todosRepository;
    }

    // Criar um novo Todo
    public Tasks create(Tasks tasks) {
        System.out.println("Salvando no banco: " + tasks);
        return todosRepository.save(tasks); // Salva o objeto no banco de dados
    }

    // Listar todos os Tasks
    public List<Tasks> list() {
        return todosRepository.findAll();
    }

    // Atualizar um Todo
    public Tasks update(Tasks tasks) {
        return todosRepository.save(tasks); // Atualiza se o ID existir
    }

    // Deletar um Todo
    public List<Tasks> delete(long id) {
        todosRepository.deleteById(id); // Deleta o objeto pelo ID
        return list(); // Retorna a lista atualizada
    }
}
