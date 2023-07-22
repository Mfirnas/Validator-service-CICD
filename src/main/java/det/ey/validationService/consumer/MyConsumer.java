package det.ey.validationService.consumer;

import det.ey.validationService.dto.BookingInfoDto;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {
//    private static final Logger LOGGER = LoggerFactory.getLogger(MyConsumer.class);
//
//    @KafkaListener(topics = "validation", groupId = "myGroup")
//    public void consume(BookingInfoDto infoDto){
//        LOGGER.info(String.format("Json message recieved -> %s", infoDto.toString()));
//    }


}
