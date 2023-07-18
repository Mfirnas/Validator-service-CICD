package det.ey.validationService.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ValidationProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public ValidationProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){

        //System.out.println("Message sent "+ message);
        LOGGER.info(String.format("Message sent %s", message));
        kafkaTemplate.send("validation", message);
    }
}
