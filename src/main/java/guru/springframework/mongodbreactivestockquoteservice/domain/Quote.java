package guru.springframework.mongodbreactivestockquoteservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by jt on 10/19/17.
 */
@Data
@Document
public class Quote {

    @Id
    private String id;
    private String ticker;
    private BigDecimal price;
    private Instant instant;
}
