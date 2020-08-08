package com.microserv.learnmicro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
public class GreetingController {
    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getUser(@PathVariable String user) {
        // ...
        return ResponseEntity.accepted().body("SHIVA");
    }
}
