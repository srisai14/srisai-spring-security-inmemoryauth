package com.srisai.srisaispringsecurityinmemoryauth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SpringTestController {

    @GetMapping("/hi")
    public ResponseEntity<String> getResult() {
        return new ResponseEntity<>("Hello Srisai..", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {
        return new ResponseEntity<>("Hello Admin..", HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("Hello USER..", HttpStatus.OK);
    }
}
