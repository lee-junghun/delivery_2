package delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import delivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    @Autowired PaymentRepository paymentRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_Cancel(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener Cancel : " + rejected + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_UpdateStatus(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener UpdateStatus : " + accepted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_UpdateStatus(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener UpdateStatus : " + rejected + "\n\n");


        

        // Sample Logic //

        

    }

}


