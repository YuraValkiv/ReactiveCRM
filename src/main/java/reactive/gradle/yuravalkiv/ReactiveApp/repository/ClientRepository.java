package reactive.gradle.yuravalkiv.ReactiveApp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactive.gradle.yuravalkiv.ReactiveApp.model.Client;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, Long> {

}
