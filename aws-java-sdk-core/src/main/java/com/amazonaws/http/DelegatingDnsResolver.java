package com.amazonaws.http;

import org.apache.http.conn.DnsResolver;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Implements the {@link org.apache.http.conn.DnsResolver} interface,
 * taking in a {@link com.amazonaws.DnsResolver} implementation and executing it's
 * {@link com.amazonaws.DnsResolver#resolve(String)} method to perform the
 * actual dns resolution
 */
public class DelegatingDnsResolver implements DnsResolver {

    private final com.amazonaws.DnsResolver delegate;

    public DelegatingDnsResolver(com.amazonaws.DnsResolver delegate) {
        this.delegate = delegate;
    }

    @Override
    public InetAddress[] resolve(String host) throws UnknownHostException {
        return delegate.resolve(host);
    }
}
