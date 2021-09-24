package br.com.abreu.erp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PessoaController {

    @GetMapping("")
    public ResponseEntity<String> consultarPessoas() {
        return ResponseEntity.ok("Hello World.");
    }
}
