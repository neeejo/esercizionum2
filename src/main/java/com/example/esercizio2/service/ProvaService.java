package com.example.esercizio2.service;
import org.springframework.stereotype.Service;


@Service
public class ProvaService {

    public Long sum(Long a, Long b) {
        return a+b;
    }

    public Long sum(Long[] numeri) {
        Long res=0L;
        for(int i=0; i<numeri.length; i++) {
            res+=numeri[i];
        }
        return res;
    }
}
