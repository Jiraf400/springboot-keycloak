package com.jirafik.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKeycloakApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootKeycloakApplication.class, args);
    }
}

/* TERMS

Realm - security domain that manages a group of users, their creds, roles

Clients - applications that interacted with keycloak security

Client Scopes - permissions and claims of roles

Users - customers

Groups - represent a way to manage common attributes and roles mapping for a set of users

 */
