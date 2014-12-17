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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpParams;

import com.amazonaws.internal.SdkSSLSocket;
import com.amazonaws.internal.SdkSocket;

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

    @Override
    public Socket connectSocket(
            final Socket socket,
            final InetSocketAddress remoteAddress,
            final InetSocketAddress localAddress,
            final HttpParams params)
            throws IOException, UnknownHostException, ConnectTimeoutException {
        if (log.isDebugEnabled())
            log.debug("connecting to " + remoteAddress.getAddress() + ":"
                    + remoteAddress.getPort());
        verifyMasterSecret(
            super.connectSocket(socket, remoteAddress, localAddress, params));
        if (socket instanceof SSLSocket)
            return new SdkSSLSocket((SSLSocket)socket);
        return new SdkSocket(socket);
    }

    /**
     * Double check the master secret of an SSL session must not be null, or
     * else a {@link SecurityException} will be thrown.
     * @param sock connected socket
     */
    private void verifyMasterSecret(final Socket sock) {
        if (sock instanceof SSLSocket) {
            SSLSocket ssl = (SSLSocket)sock;
            SSLSession session = ssl.getSession();
            if (session != null) {
                String className = session.getClass().getName();
                if ("sun.security.ssl.SSLSessionImpl".equals(className)) {
                    try {
                        Class<?> clazz = Class.forName(className);
                        Method method = clazz.getDeclaredMethod("getMasterSecret");
                        method.setAccessible(true);
                        Object masterSecret = method.invoke(session);
                        if (masterSecret == null)
                            throw log(new SecurityException("Invalid SSL master secret"));
                    } catch (ClassNotFoundException e) {
                        failedToVerifyMasterSecret(e);
                    } catch (NoSuchMethodException e) {
                        failedToVerifyMasterSecret(e);
                    } catch (IllegalAccessException e) {
                        failedToVerifyMasterSecret(e);
                    } catch (InvocationTargetException e) {
                        failedToVerifyMasterSecret(e.getCause());
                    }
                }
            }
        }
        return;
    }

    private void failedToVerifyMasterSecret(Throwable t) {
        if (log.isDebugEnabled())
            log.debug("Failed to verify the SSL master secret", t);
    }

    private <T extends Throwable> T log(T t) {
        if (log.isDebugEnabled())
            log.debug("", t);
        return t;
    }
}
