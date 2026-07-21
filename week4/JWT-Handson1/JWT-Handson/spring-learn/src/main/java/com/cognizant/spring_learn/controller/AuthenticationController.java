package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.service.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private final JwtService jwtService;

    public AuthenticationController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<Map<String, String>> authenticate(
            @RequestHeader(value = "Authorization", required = false)
            String authorizationHeader) {

        Map<String, String> response = new HashMap<>();

        // Authorization header check
        if (authorizationHeader == null ||
                !authorizationHeader.startsWith("Basic ")) {

            response.put(
                    "error",
                    "Please provide username and password using Basic Authentication"
            );

            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(response);
        }

        try {

            // Remove "Basic "
            String encodedCredentials =
                    authorizationHeader.substring(6);

            // Decode Base64
            byte[] decodedBytes =
                    Base64.getDecoder().decode(encodedCredentials);

            String credentials =
                    new String(
                            decodedBytes,
                            StandardCharsets.UTF_8
                    );

            // user:pwd
            String[] values =
                    credentials.split(":", 2);

            if (values.length != 2) {

                response.put(
                        "error",
                        "Invalid credentials format"
                );

                return ResponseEntity
                        .status(HttpStatus.UNAUTHORIZED)
                        .body(response);
            }

            String username = values[0];
            String password = values[1];

            // Validate credentials
            if (!username.equals("user") ||
                    !password.equals("pwd")) {

                response.put(
                        "error",
                        "Invalid username or password"
                );

                return ResponseEntity
                        .status(HttpStatus.UNAUTHORIZED)
                        .body(response);
            }

            // Generate JWT
            String token =
                    jwtService.generateToken(username);

            response.put("token", token);

            return ResponseEntity.ok(response);

        } catch (Exception e) {

            response.put(
                    "error",
                    "Invalid Authorization header"
            );

            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(response);
        }
    }
}