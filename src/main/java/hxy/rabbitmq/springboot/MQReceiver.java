package hxy.rabbitmq.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MQReceiver {

    //绑定队列名称
    @RabbitListener(queues = {MQConfig.QUEUE})
    public void receive(String message) {
        log.info("springboot rabbitmq recevie message:" + message);
    }
}