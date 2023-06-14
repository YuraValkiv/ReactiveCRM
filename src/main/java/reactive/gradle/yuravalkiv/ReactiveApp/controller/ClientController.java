package reactive.gradle.yuravalkiv.ReactiveApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactive.gradle.yuravalkiv.ReactiveApp.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public interface ClientController {
    @GetMapping("/{id}")
    Mono<Client> getClientById(@PathVariable Long id);

    @GetMapping("/")
    Flux<Client> getAllClients();

    @PostMapping("/")
    Mono<ResponseEntity<String>> createClient(@RequestBody Client client);

    @PutMapping("/{id}")
    Mono<ResponseEntity<String>> updateClient(@RequestBody Client client, @PathVariable Long id);

    @DeleteMapping("/{id}")
    Mono<ResponseEntity<String>> deleteClient(@PathVariable Long id);
}
