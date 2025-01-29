package api_tasks.services;

import api_tasks.entity.Todos;
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
    public Todos create(Todos todos) {
        System.out.println("Salvando no banco: " + todos);
        return todosRepository.save(todos); // Salva o objeto no banco de dados
    }

    // Listar todos os Todos
    public List<Todos> list() {
        return todosRepository.findAll();
    }

    // Atualizar um Todo
    public Todos update(Todos todos) {
        return todosRepository.save(todos); // Atualiza se o ID existir
    }

    // Deletar um Todo
    public List<Todos> delete(long id) {
        todosRepository.deleteById(id); // Deleta o objeto pelo ID
        return list(); // Retorna a lista atualizada
    }
}
