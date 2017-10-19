package guru.springframework.mongodbreactivestockquoteservice;

import guru.springframework.mongodbreactivestockquoteservice.client.StockQuoteClient;
import guru.springframework.mongodbreactivestockquoteservice.domain.Quote;
import org.springframework.boot.CommandLineRunner;
import reactor.core.publisher.Flux;

/**
 * Created by jt on 10/19/17.
 */
//@Component
public class QuoteRunner implements CommandLineRunner {

    private final StockQuoteClient stockQuoteClient;

    public QuoteRunner(StockQuoteClient stockQuoteClient) {
        this.stockQuoteClient = stockQuoteClient;
    }

    @Override
    public void run(String... args) throws Exception {
        Flux<Quote> quoteFlux = stockQuoteClient.getQuoteStream();

        quoteFlux.subscribe(System.out::println);
    }
}
