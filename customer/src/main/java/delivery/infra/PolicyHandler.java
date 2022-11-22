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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_KakaoTalkAlert(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + accepted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_KakaoTalkAlert(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + rejected + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooked'")
    public void wheneverCooked_KakaoTalkAlert(@Payload Cooked cooked){

        Cooked event = cooked;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + cooked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_KakaoTalkAlert(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + paid + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_KakaoTalkAlert(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + deliveryStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_KakaoTalkAlert(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener KakaoTalkAlert : " + delivered + "\n\n");


        

        // Sample Logic //

        

    }

}


