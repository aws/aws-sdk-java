package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SigningAlgorithmTest {
    
    @Test
    public void testCanCreateSHA1() {
        assertEquals("HmacSHA1",SigningAlgorithm.HmacSHA1.getMac().getAlgorithm());
    }
    
    @Test
    public void testCanCreateSHA256() {
        assertEquals("HmacSHA256",SigningAlgorithm.HmacSHA256.getMac().getAlgorithm());
    }

}
