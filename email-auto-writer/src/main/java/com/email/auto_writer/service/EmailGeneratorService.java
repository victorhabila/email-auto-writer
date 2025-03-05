package com.email.auto_writer.service;

import com.email.auto_writer.model.EmailRequest;
import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {

    public String generateEmailReply(EmailRequest emailRequest){
        return null;
    }

    private String buildPrompt(EmailRequest emailRequest){
        //Build the prompt
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following content. Please don't generate a subject line");

        if(emailRequest.getTone() != null && !emailRequest.getTone().isEmpty()){
            prompt.append("Use a ").append(emailRequest.getTone()).append("tone");
        }
        prompt.append("\nOriginal email: \n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }
}
