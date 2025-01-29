package api_tasks.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "todos")
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private boolean realized;
    @NotBlank
    private String priority;

    public Todos(String name, String description, boolean realized, String priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }

}
