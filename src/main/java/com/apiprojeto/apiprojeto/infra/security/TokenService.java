package com.apiprojeto.apiprojeto.infra.security;

import com.apiprojeto.apiprojeto.domain.user.User;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public String generateToken(User user){
        try{
            
        }
        catch (JWTCreationException e){
            throw new RuntimeException("Erro while authenticating");
        }
    }
}
