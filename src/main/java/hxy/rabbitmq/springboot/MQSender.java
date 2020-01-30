package hxy.rabbitmq.springboot;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class MQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(String msg) {
        log.info("发送消息：" + msg);
        amqpTemplate.convertAndSend(MQConfig.QUEUE, msg);
    }

}