package guru.springframework.mongodbreactivestockquoteservice.repositories;

import guru.springframework.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


/**
 * Created by jt on 10/19/17.
 */
public interface QuoteRepository extends ReactiveMongoRepository<Quote, String> {
}
