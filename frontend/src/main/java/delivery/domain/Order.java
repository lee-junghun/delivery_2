package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Order extends AbstractEvent {

    private Long id;
    private String foodId;
    private String customerId;
    private String options;
    private Address address;
    private String status;

    public Order(Order aggregate){
        super(aggregate);
    }
    public Order(){
        super();
    }
}
