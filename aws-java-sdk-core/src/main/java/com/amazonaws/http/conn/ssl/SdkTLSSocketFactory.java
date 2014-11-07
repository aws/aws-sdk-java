/*
 * Copyright 2014-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.http.conn.ssl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/**
 * Used to enforce the preferred TLS protocol during SSL handshake.
 */
@ThreadSafe
public class SdkTLSSocketFactory extends SSLSocketFactory {
    private static final Log log = LogFactory.getLog(SdkTLSSocketFactory.class);
    
    public SdkTLSSocketFactory(final SSLContext sslContext,
            final X509HostnameVerifier hostnameVerifier) {
        super(sslContext, hostnameVerifier);
    }

    /**
     * {@inheritDoc}
     * 
     * Used to enforce the preferred TLS protocol during SSL handshake.
     */
    @Override
    protected final void prepareSocket(final SSLSocket socket) {
        String[] supported = socket.getSupportedProtocols();
        String[] enabled = socket.getEnabledProtocols();
        if (log.isDebugEnabled()) {
            log.debug("socket.getSupportedProtocols(): "
                    + Arrays.toString(supported)
                    + ", socket.getEnabledProtocols(): "
                    + Arrays.toString(enabled));
        }
        List<String> target = new ArrayList<String>();
        if (supported != null) {
            // Append the preferred protocols in descending order of preference
            // but only do so if the protocols are supported
            TLSProtocol[] values = TLSProtocol.values();
            for (int i=0; i < values.length; i++) {
                final String pname = values[i].getProtocolName();
                if (existsIn(pname, supported))
                    target.add(pname);
            }
        }
        if (enabled != null) {
            // Append the rest of the already enabled protocols to the end
            // if not already included in the list
            for (String pname: enabled) {
                if (!target.contains(pname))
                    target.add(pname);
            }
        }
        if (target.size() > 0) {
            String[] enabling = target.toArray(new String[target.size()]);
            socket.setEnabledProtocols(enabling);
            if (log.isDebugEnabled()) {
                log.debug("TLS protocol enabled for SSL handshake: "
                        + Arrays.toString(enabling));
            }
        }
    }
    /**
     * Returns true if the given element exists in the given array;
     * false otherwise.
     */
    private boolean existsIn(String element, String[] a) {
        for (String s: a) {
            if (element.equals(s))
                return true;
        }
        return false;
    }
}
