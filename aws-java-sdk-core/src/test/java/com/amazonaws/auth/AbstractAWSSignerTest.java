package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractAWSSignerTest {

    @Test
    public void test() {
        assertEquals(
            "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855",
            AbstractAWSSigner.EMPTY_STRING_SHA256_HEX);
    }

}
