package com.senac.ThallesNascimentoEmissorMS.controllers;


import com.senac.ThallesNascimentoEmissorMS.models.VooModel;
import com.senac.ThallesNascimentoEmissorMS.producer.VooProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VooController {
    @Autowired
    VooProducer vooProducer;

    @GetMapping("/voos")
    public void listaVoos(){
        vooProducer.publishMessageListVoos();
    }
}
