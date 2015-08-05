package com.amazonaws;

import org.junit.Test;

import static org.junit.Assert.*;

public class SystemDefaultDnsResolverTest {

    @Test
    public void testResolveLocalhost() throws Exception {
        DnsResolver resolver = new SystemDefaultDnsResolver();
        assertNotNull(resolver.resolve("127.0.0.1"));
        assertEquals("Should resolve to 1 address", 1, resolver.resolve("127.0.0.1").length);
        assertTrue("Should resolve localhost",  resolver.resolve("localhost").length>0);
    }
}