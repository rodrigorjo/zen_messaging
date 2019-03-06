package zen.zen_messaging;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class Tut1Receiver {

    String receiverName;

    public Tut1Receiver(String receiverName) {
        this.receiverName = receiverName;
    }

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "' for: "+receiverName);
    }
}