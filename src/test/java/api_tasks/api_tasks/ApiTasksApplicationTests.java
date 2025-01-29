package api_tasks.api_tasks;

import api_tasks.entity.Todos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiTasksApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void ContextLoad() {

    }
    @Test
    void createTodoSuccess() {
        Todos todos = new Todos("daniel", "desc 1", true, "p3");

        webTestClient
                .post()
                .uri("todos")
                .bodyValue(todos)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.name").isEqualTo(todos.getName())
                .jsonPath("$.description").isEqualTo(todos.getDescription())
                .jsonPath("$.realized").isEqualTo(todos.isRealized())
                .jsonPath("$.priority").isEqualTo(todos.getPriority());

    }

    void createTodoFailure() {
        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(new Todos("", "", false, ""))
                .exchange()
                .expectStatus().isBadRequest();
    }
}
