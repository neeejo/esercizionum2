package com.example.esercizio2.controller;

import com.example.esercizio2.service.ProvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private ProvaService service;
    @GetMapping("/sum")
    public Long sum(@RequestParam Long a, @RequestParam Long b) {
        return service.sum(a,b);
    }

    @PostMapping("/sum")
    public Long sum(@RequestBody Long[] numeri) {
        return service.sum(numeri);
    }
}
