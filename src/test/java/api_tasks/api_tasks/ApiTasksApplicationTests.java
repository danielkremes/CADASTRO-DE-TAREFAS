package api_tasks.api_tasks;

import api_tasks.entity.Tasks;
import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.reactive.server.WebTestClient;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiTasksApplicationTests {

    // @Autowired
    // private WebTestClient webTestClient;

    /*
    @Test
    void ContextLoad() {

    }
    @Test
    void createTodoSuccess() {
        Tasks tasks = new Tasks("daniel", "desc 1", true, "p3");

        webTestClient
                .post()
                .uri("tasks")
                .bodyValue(tasks)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.name").isEqualTo(tasks.getName())
                .jsonPath("$.description").isEqualTo(tasks.getDescription())
                .jsonPath("$.realized").isEqualTo(tasks.isRealized())
                .jsonPath("$.priority").isEqualTo(tasks.getPriority());

    }
     */

    /*
    void createTodoFailure() {
        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(new Tasks("", "", false, ""))
                .exchange()
                .expectStatus().isBadRequest();
    }
     */
}
