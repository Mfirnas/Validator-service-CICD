package det.ey.validationService.producer;

import det.ey.validationService.dto.BookingInfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingValidationProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketBookingValidationProducer.class);

    private KafkaTemplate<String, BookingInfoDto> kafkaTemplate;

    public TicketBookingValidationProducer(KafkaTemplate<String, BookingInfoDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public  void publishPayload(BookingInfoDto infoDto){

        LOGGER.info(String.format("Message sent -> %s", infoDto.toString()));

        Message<BookingInfoDto> message = MessageBuilder
                .withPayload(infoDto)
                .setHeader(KafkaHeaders.TOPIC,"validation")
                .build();

        kafkaTemplate.send(message);
    }


}
