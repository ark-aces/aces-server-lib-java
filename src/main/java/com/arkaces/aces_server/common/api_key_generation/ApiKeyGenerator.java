package com.arkaces.aces_server.common.api_key_generation;

import java.security.SecureRandom;

public class ApiKeyGenerator {

    private final Integer length = 40;
    private final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final SecureRandom secureRandom = new SecureRandom();

    public String generate() {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(secureRandom.nextInt(chars.length())));
        }
        return sb.toString();
    }

}