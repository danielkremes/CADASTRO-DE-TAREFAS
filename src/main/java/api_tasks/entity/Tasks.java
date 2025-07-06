package api_tasks.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "todos")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;

    @NotBlank
    @Column(name = "task_name", length = 150)
    private String name;

    @NotBlank
    @Column(name = "task_description")
    private String description;

    @NotNull
    @Column(name = "task_realized")
    private boolean realized;

    @NotBlank
    @Column(name = "task_priority", length = 7)
    private String priority;

    public Tasks(String name, String description, boolean realized, String priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }

}
