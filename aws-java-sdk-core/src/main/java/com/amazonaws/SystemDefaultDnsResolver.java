package com.amazonaws;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Default dns resolver that uses {@link java.net.InetAddress#getAllByName(String)}
 * to resolve hosts to ip addresses
 */
public class SystemDefaultDnsResolver implements DnsResolver {
    @Override
    public InetAddress[] resolve(String host) throws UnknownHostException {
        return InetAddress.getAllByName(host);
    }
}
