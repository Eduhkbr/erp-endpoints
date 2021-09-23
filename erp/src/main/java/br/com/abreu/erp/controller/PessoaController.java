package br.com.abreu.erp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @GetMapping("")
    public ResponseEntity<String> consultarPessoas() {
        return ResponseEntity.ok("Hello World.");
    }
}
