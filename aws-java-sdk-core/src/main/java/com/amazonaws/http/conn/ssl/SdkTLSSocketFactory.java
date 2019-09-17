/*
 * Copyright 2014-2019 Amazon Technologies, Inc.
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

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.apache.utils.HttpContextUtils;
import com.amazonaws.internal.SdkMetricsSocket;
import com.amazonaws.internal.SdkSSLMetricsSocket;
import com.amazonaws.internal.SdkSSLSocket;
import com.amazonaws.internal.SdkSocket;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.util.JavaVersionParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * Used to enforce the preferred TLS protocol during SSL handshake.
 */
@ThreadSafe
public class SdkTLSSocketFactory extends SSLConnectionSocketFactory {

    private static final Log LOG = LogFactory.getLog(SdkTLSSocketFactory.class);
    private final SSLContext sslContext;
    private final MasterSecretValidators.MasterSecretValidator masterSecretValidator;
    private final ShouldClearSslSessionPredicate shouldClearSslSessionsPredicate;

    public SdkTLSSocketFactory(final SSLContext sslContext, final HostnameVerifier hostnameVerifier) {
        super(sslContext, hostnameVerifier);
        if (sslContext == null) {
            throw new IllegalArgumentException(
                    "sslContext must not be null. " + "Use SSLContext.getDefault() if you are unsure.");
        }
        this.sslContext = sslContext;
        this.masterSecretValidator = MasterSecretValidators.getMasterSecretValidator();
        this.shouldClearSslSessionsPredicate = new ShouldClearSslSessionPredicate(JavaVersionParser.getCurrentJavaVersion());
    }

    @Override
    public Socket createSocket(HttpContext ctx) throws IOException {
        if (HttpContextUtils.disableSocketProxy(ctx)) {
            return new Socket(Proxy.NO_PROXY);
        }
        return super.createSocket(ctx);
    }

    /**
     * {@inheritDoc} Used to enforce the preferred TLS protocol during SSL handshake.
     */
    @Override
    protected final void prepareSocket(final SSLSocket socket) {
        String[] supported = socket.getSupportedProtocols();
        String[] enabled = socket.getEnabledProtocols();
        if (LOG.isDebugEnabled()) {
            LOG.debug("socket.getSupportedProtocols(): " + Arrays.toString(supported)
                    + ", socket.getEnabledProtocols(): " + Arrays.toString(enabled));
        }
        List<String> target = new ArrayList<String>();
        if (supported != null) {
            // Append the preferred protocols in descending order of preference
            // but only do so if the protocols are supported
            TLSProtocol[] values = TLSProtocol.values();
            for (int i = 0; i < values.length; i++) {
                final String pname = values[i].getProtocolName();
                if (existsIn(pname, supported)) {
                    target.add(pname);
                }
            }
        }
        if (enabled != null) {
            // Append the rest of the already enabled protocols to the end
            // if not already included in the list
            for (String pname : enabled) {
                if (!target.contains(pname)) {
                    target.add(pname);
                }
            }
        }
        if (target.size() > 0) {
            String[] enabling = target.toArray(new String[target.size()]);
            socket.setEnabledProtocols(enabling);
            if (LOG.isDebugEnabled()) {
                LOG.debug("TLS protocol enabled for SSL handshake: " + Arrays.toString(enabling));
            }
        }
    }

    /**
     * Returns true if the given element exists in the given array; false otherwise.
     */
    private boolean existsIn(String element, String[] a) {
        for (String s : a) {
            if (element.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public Socket connectSocket(
            final int connectTimeout,
            final Socket socket,
            final HttpHost host,
            final InetSocketAddress remoteAddress,
            final InetSocketAddress localAddress,
            final HttpContext context) throws IOException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("connecting to " + remoteAddress.getAddress() + ":" + remoteAddress.getPort());
        }
        Socket connectedSocket;
        try {
            connectedSocket = super.connectSocket
                    (connectTimeout, socket, host, remoteAddress, localAddress, context);
            if (!masterSecretValidator.isMasterSecretValid(connectedSocket)) {
                throw log(new IllegalStateException("Invalid SSL master secret"));
            }
        } catch (final SSLException sslEx) {
            if (shouldClearSslSessionsPredicate.test(sslEx)) {
                // clear any related sessions from our cache
                if (LOG.isDebugEnabled()) {
                    LOG.debug("connection failed due to SSL error, clearing TLS session cache", sslEx);
                }
                clearSessionCache(sslContext.getClientSessionContext(), remoteAddress);
            }
            throw sslEx;
        }

        if (connectedSocket instanceof SSLSocket) {
            SdkSSLSocket sslSocket = new SdkSSLSocket((SSLSocket) connectedSocket);
            return AwsSdkMetrics.isHttpSocketReadMetricEnabled() ? new SdkSSLMetricsSocket(sslSocket) : sslSocket;
        }
        SdkSocket sdkSocket = new SdkSocket(connectedSocket);
        return AwsSdkMetrics.isHttpSocketReadMetricEnabled() ? new SdkMetricsSocket(sdkSocket) : sdkSocket;
    }

    /**
     * Invalidates all SSL/TLS sessions in {@code sessionContext} associated with {@code remoteAddress}.
     *
     * @param sessionContext collection of SSL/TLS sessions to be (potentially) invalidated
     * @param remoteAddress  associated with sessions to invalidate
     */
    private void clearSessionCache(final SSLSessionContext sessionContext, final InetSocketAddress remoteAddress) {
        final String hostName = remoteAddress.getHostName();
        final int port = remoteAddress.getPort();
        final Enumeration<byte[]> ids = sessionContext.getIds();

        if (ids == null) {
            return;
        }

        while (ids.hasMoreElements()) {
            final byte[] id = ids.nextElement();
            final SSLSession session = sessionContext.getSession(id);
            if (session != null && session.getPeerHost() != null && session.getPeerHost().equalsIgnoreCase(hostName)
                    && session.getPeerPort() == port) {
                session.invalidate();
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Invalidated session " + session);
                }
            }
        }
    }

    private <T extends Throwable> T log(T t) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("", t);
        }
        return t;
    }
}
