package com.cognizant.spring_learn.service;


import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;


// Note: Add jjwt dependency to pom.xml:
// <dependency>
//     <groupId>io.jsonwebtoken</groupId>
//     <artifactId>jjwt-api</artifactId>
//     <version>0.12.3</version>
// </dependency>
// <dependency>
//     <groupId>io.jsonwebtoken</groupId>
//     <artifactId>jjwt-impl</artifactId>
//     <version>0.12.3</version>
//     <scope>runtime</scope>
// </dependency>
// <dependency>
//     <groupId>io.jsonwebtoken</groupId>
//     <artifactId>jjwt-jackson</artifactId>
//     <version>0.12.3</version>
//     <scope>runtime</scope>
// </dependency>


public class JwtService {

    private static final String SECRET_KEY =
            "ThisIsMyVerySecureJWTSecretKeyForSpringLearnApplication123456789";

    private final SecretKey key =
            new SecretKeySpec(
                    SECRET_KEY.getBytes(StandardCharsets.UTF_8),
                    "HmacSHA256"
            );

    public String generateToken(String username) {

        long currentTime =
                System.currentTimeMillis();

        long expirationTime =
                currentTime + (20 * 60 * 1000);
        return null;

        
              
    }
}
  
