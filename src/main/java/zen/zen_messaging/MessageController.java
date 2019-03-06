package zen.zen_messaging;

import java.io.UnsupportedEncodingException;
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

    @Autowired
    private Tut1Receiver tut1Receiver;


    @PostMapping(value = "/auditMessage")
    public ResponseEntity<String> produce(@RequestBody final String message)
            throws UnsupportedEncodingException{

        tut1Sender.send(message);


        return new ResponseEntity<>(String.valueOf("hi"), HttpStatus.CREATED);
    }


}
