package zen.zen_messaging;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private Tut1Sender tut1Sender;


    @PostMapping(value = "/auditMessage")
    public ResponseEntity<String> produce(@RequestBody final String message)
            throws UnsupportedEncodingException{

        for(int i = 0; i < 1000; i++) {
            tut1Sender.send(message + i);
        }

        return new ResponseEntity<>(String.valueOf("hi"), HttpStatus.CREATED);
    }


}
