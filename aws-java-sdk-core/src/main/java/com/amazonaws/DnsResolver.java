package com.amazonaws;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Given a hostname, will resolve the hostname to an ip, or list of ip addresses.
 */
public interface DnsResolver {
    InetAddress[] resolve(String host) throws UnknownHostException;

}
