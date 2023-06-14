package reactive.gradle.yuravalkiv.ReactiveApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactive.gradle.yuravalkiv.ReactiveApp.model.Client;
import reactive.gradle.yuravalkiv.ReactiveApp.repository.ClientRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Mono<Client> getById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Flux<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<ResponseEntity<String>> create(Client client) {
        return clientRepository.save(client)
                .map(savedClient -> ResponseEntity.status(HttpStatus.CREATED)
                        .body("Client created successfully"))
                .onErrorResume(throwable -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to create client")));
    }

    @Override
    public Mono<ResponseEntity<String>> update(Client client, Long id) {
        return clientRepository.findById(id)
                .flatMap(updatedClient -> {
                    updatedClient.setFirstName(client.getFirstName());
                    updatedClient.setLastName(client.getLastName());
                    updatedClient.setAddress(client.getAddress());
                    updatedClient.setPhoneNumber(client.getPhoneNumber());
                    updatedClient.setEmail(client.getEmail());
                    return clientRepository.save(updatedClient);
                })
                .map(updatedClient -> ResponseEntity.status(HttpStatus.OK)
                        .body("Client updated successfully"))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<String>> delete(Long id) {
        return clientRepository.findById(id)
                .flatMap(existingClient -> clientRepository.delete(existingClient)
                        .then(Mono.just(ResponseEntity.ok("Client deleted successfully"))))
                .onErrorResume(throwable -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to delete client")));
    }
}
