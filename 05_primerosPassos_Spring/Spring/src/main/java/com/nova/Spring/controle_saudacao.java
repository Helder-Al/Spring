package com.nova.Spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class controle_saudacao {

    private static final String template = "Olá, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/saudacao")
    public Saudacao saudacao(@RequestParam(value = "name", defaultValue = "Mundo")String name) {
        return new Saudacao(counter.incrementAndGet(), String.format(template, name));
    }
}
