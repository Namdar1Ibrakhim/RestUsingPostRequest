package com.example.restgetdatausingpost;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MainController {

    private static Logger logger =
            Logger.getLogger(MainController.class.getName());

    @PostMapping("/all")//при отправке Post запроса по пути можно так же получить данные через Rest
    public ResponseEntity<PaymentDetails> payment(@RequestBody PaymentDetails paymentDetails){ //@RequestBody
        logger.info("Received payment " +
                paymentDetails.getAmount());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails); //Возвращаем этому пути данные
    }

    @PostMapping("/ibra")
    public String ibra(@RequestParam String a){
        return a;
    }
}
