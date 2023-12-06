package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/integrations/test")
public class todoist {

    @PostMapping("")
    public ResponseEntity test(){
        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
