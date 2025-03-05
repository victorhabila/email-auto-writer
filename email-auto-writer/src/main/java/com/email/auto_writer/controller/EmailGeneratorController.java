package com.email.auto_writer.controller;


import com.email.auto_writer.model.EmailRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {

    @PostMapping
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        return  ResponseEntity.ok("");
    }
}
