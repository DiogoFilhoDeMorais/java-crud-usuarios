package com.estudo.app.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jwt.JWT;

@Service
public class TokenService {

    @Value("${jwt.secret}")
    private String secret;

    public String gerarToken(UserDetails user) {
        
        try {
            Algorithm alg = Algorithm.HMAC256(secret);
            return JWT.create()
            .withIssuer("nome-da-sua-api")
        }
    }
    
}
