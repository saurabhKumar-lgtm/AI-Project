package com.spring.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

//    @Bean(name = "openAiChatClient")
//    public ChatClient openAIChatModel(OpenAiChatModel chatModel) {
//        return ChatClient.builder(chatModel).build();
//    }
//
//    @Bean(name = "ollamaChatClient")
//    public ChatClient ollamaAIModel(OllamaChatModel chatModel) {
//        return ChatClient.builder(chatModel).build();
//    }

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultOptions(OpenAiChatOptions.builder()
                        .model("gpt-4.1")
                        .temperature(0.2)
                        .maxTokens(500)
                        .build())
                .build();
    }


}
