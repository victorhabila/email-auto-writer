package com.email.auto_writer.controller;


import com.email.auto_writer.model.EmailRequest;
import com.email.auto_writer.service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/email")
public class EmailGeneratorController {


    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){

        String response =emailGeneratorService.generateEmailReply(emailRequest);
        return  ResponseEntity.ok(response);
    }
}
