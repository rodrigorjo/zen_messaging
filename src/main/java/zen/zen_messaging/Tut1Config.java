package zen.zen_messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Tut1Config {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }


    @Bean
    public Tut1Receiver receiver() {
        return new Tut1Receiver("First Receiver");
    }

    @Bean
    public Tut1Receiver receiver2() {
        return new Tut1Receiver("Second Receiver");
    }


    @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }
}