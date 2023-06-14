package reactive.gradle.yuravalkiv.ReactiveApp.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class ActionHistory {
    @Id
    private Long id;
    private LocalDateTime timestamp;
    private String action;
    //TODO
}
