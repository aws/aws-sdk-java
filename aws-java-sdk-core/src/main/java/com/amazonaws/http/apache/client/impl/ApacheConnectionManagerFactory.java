/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.apache.client.impl;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.DelegatingDnsResolver;
import com.amazonaws.http.client.ConnectionManagerFactory;
import com.amazonaws.http.conn.SdkPlainSocketFactory;
import com.amazonaws.http.conn.ssl.SdkTLSSocketFactory;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.internal.SdkSSLContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * Factory class to create connection manager used by the apache client.
 */
public class ApacheConnectionManagerFactory implements
        ConnectionManagerFactory<HttpClientConnectionManager> {

    private final Log LOG = LogFactory.getLog(AmazonHttpClient.class);

    @Override
    public HttpClientConnectionManager create(final HttpClientSettings settings) {
        ConnectionSocketFactory sslsf = getPreferredSocketFactory(settings);

        final PoolingHttpClientConnectionManager cm = new
                PoolingHttpClientConnectionManager(
                createSocketFactoryRegistry(sslsf),
                null,
                DefaultSchemePortResolver.INSTANCE,
                new DelegatingDnsResolver(settings.getDnsResolver()),
                settings.getConnectionPoolTTL(),
                TimeUnit.MILLISECONDS);

        cm.setValidateAfterInactivity(settings.getValidateAfterInactivityMillis());
        cm.setDefaultMaxPerRoute(settings.getMaxConnections());
        cm.setMaxTotal(settings.getMaxConnections());
        cm.setDefaultSocketConfig(buildSocketConfig(settings));
        cm.setDefaultConnectionConfig(buildConnectionConfig(settings));

        return cm;
    }

    private ConnectionSocketFactory getPreferredSocketFactory(HttpClientSettings settings) {
        ConnectionSocketFactory sslsf = settings.getApacheHttpClientConfig().getSslSocketFactory();

        return sslsf != null
                ? sslsf
                : new SdkTLSSocketFactory(
                SdkSSLContext.getPreferredSSLContext(settings.getSecureRandom()),
                getHostNameVerifier(settings));
    }


    private SocketConfig buildSocketConfig(HttpClientSettings settings) {
        return SocketConfig.custom()
                .setSoKeepAlive(settings.useTcpKeepAlive())
                .setSoTimeout(settings.getSocketTimeout())
                .setTcpNoDelay(true)
                .build();
    }

    private ConnectionConfig buildConnectionConfig(HttpClientSettings settings) {

        int socketBufferSize = Math.max(settings.getSocketBufferSize()[0],
                settings.getSocketBufferSize()[1]);

        return socketBufferSize <= 0
                ? null
                : ConnectionConfig.custom()
                .setBufferSize(socketBufferSize)
                .build();
    }

    private HostnameVerifier getHostNameVerifier
            (HttpClientSettings options) {
        // TODO Need to find a better way to handle these deprecations.
        return options.useBrowserCompatibleHostNameVerifier()
                ? SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER
                : SSLConnectionSocketFactory.STRICT_HOSTNAME_VERIFIER;
    }

    private Registry<ConnectionSocketFactory> createSocketFactoryRegistry(ConnectionSocketFactory sslSocketFactory) {

        /*
         * If SSL cert checking for endpoints has been explicitly disabled,
         * register a new scheme for HTTPS that won't cause self-signed certs to
         * error out.
         */
        if (SDKGlobalConfiguration.isCertCheckingDisabled()) {
            if (LOG.isWarnEnabled()) {
                LOG.warn("SSL Certificate checking for endpoints has been " +
                        "explicitly disabled.");
            }
            sslSocketFactory = new TrustingSocketFactory();
        }

        return RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", new SdkPlainSocketFactory())
                .register("https", sslSocketFactory)
                .build();
    }

    /**
     * Simple implementation of SchemeSocketFactory (and
     * LayeredSchemeSocketFactory) that bypasses SSL certificate checks. This
     * class is only intended to be used for testing purposes.
     */
    private static class TrustingSocketFactory implements
            LayeredConnectionSocketFactory {

        private SSLContext sslcontext = null;

        private static SSLContext createSSLContext() throws IOException {
            try {
                SSLContext context = SSLContext.getInstance("TLS");
                context.init(null, new TrustManager[]{new TrustingX509TrustManager()}, null);
                return context;
            } catch (Exception e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override
        public Socket createLayeredSocket(Socket socket, String target, int port, HttpContext context) throws IOException, UnknownHostException {
            return getSSLContext().getSocketFactory().createSocket(socket,
                    target, port, true);
        }

        @Override
        public Socket createSocket(HttpContext context) throws IOException {
            return getSSLContext().getSocketFactory().createSocket();
        }

        @Override
        public Socket connectSocket(int connectTimeout, Socket sock, HttpHost host, InetSocketAddress remoteAddress, InetSocketAddress localAddress, HttpContext context) throws IOException {

            SSLSocket sslsock = (SSLSocket) ((sock != null) ? sock :
                    createSocket(context));
            if (localAddress != null) sslsock.bind(localAddress);


            sslsock.connect(remoteAddress, connectTimeout);
            // socket timeout is set internally by the
            // PoolingHttpClientConnectionManager.
            return sslsock;
        }

        private SSLContext getSSLContext() throws IOException {
            if (this.sslcontext == null) this.sslcontext = createSSLContext();
            return this.sslcontext;
        }
    }

    /**
     * Simple implementation of X509TrustManager that trusts all certificates.
     * This class is only intended to be used for testing purposes.
     */
    private static class TrustingX509TrustManager implements X509TrustManager {
        private static final X509Certificate[] X509_CERTIFICATES = new X509Certificate[0];

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return X509_CERTIFICATES;
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            // No-op, to trust all certs
        }

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            // No-op, to trust all certs
        }
    }
}
