package reactive.gradle.yuravalkiv.ReactiveApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactive.gradle.yuravalkiv.ReactiveApp.model.Client;
import reactive.gradle.yuravalkiv.ReactiveApp.service.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class ClientControllerImpl implements ClientController {

    @Autowired
    ClientService clientService;

    @Override
    public Mono<Client> getClientById(Long id) {
        return clientService.getById(id);
    }

    @Override
    public Flux<Client> getAllClients() {
        return clientService.getAll();
    }

    @Override
    public Mono<ResponseEntity<String>> createClient(@RequestBody Client client) {
        return clientService.create(client);

    }

    @Override
    public Mono<ResponseEntity<String>> updateClient(Client client, Long id) {
        return clientService.update(client, id);
    }

    @Override
    public Mono<ResponseEntity<String>> deleteClient(Long id) {
        return null;
    }
}
