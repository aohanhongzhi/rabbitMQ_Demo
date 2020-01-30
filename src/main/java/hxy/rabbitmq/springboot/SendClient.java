package hxy.rabbitmq.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author eric
 * @date 9/12/19 4:00 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendClient {
    @Autowired
    MQSender mqSender;
    @Test
    public void  send(){
        mqSender.sendMsg("喜爱四");
    }


    public static void main(String args[]){

    }
}
