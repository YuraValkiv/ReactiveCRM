package reactive.gradle.yuravalkiv.ReactiveApp.service;

import org.springframework.http.ResponseEntity;
import reactive.gradle.yuravalkiv.ReactiveApp.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Client> getById(Long id);
    Flux<Client> getAll();
    Mono<ResponseEntity<String>> create(Client client);
    Mono<ResponseEntity<String>> update(Client client, Long id);
    Mono<ResponseEntity<String>> delete(Long id);
}
