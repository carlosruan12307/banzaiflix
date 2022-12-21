package com.backbanzaiflix.backbanzaiflix.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MensagemResponse {
    private String mensagem;
}
