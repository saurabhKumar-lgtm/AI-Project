package com.spring.ai.controllers;

import com.spring.ai.entity.Tut;
import com.spring.ai.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ChatController {


    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }



    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam(value = "prom") String prom) {
        return ResponseEntity.ok(chatService.chat(prom));
    }
}
