/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.SSLInitializationException;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.conn.SdkConnectionKeepAliveStrategy;
import com.amazonaws.http.conn.ssl.SdkTLSSocketFactory;
import com.amazonaws.http.impl.client.HttpRequestNoRetryHandler;
import com.amazonaws.http.impl.client.SdkHttpClient;

/** Responsible for creating and configuring instances of Apache HttpClient4. */
@SdkInternalApi
public class HttpClientFactory {

    /**
     * Creates a new HttpClient object using the specified AWS ClientConfiguration to configure the
     * client.
     *
     * @param config
     *            Client configuration options (ex: proxy settings, connection limits, etc).
     * @return The new, configured HttpClient.
     */
    public HttpClient createHttpClient(ClientConfiguration config) {
        /* Set HTTP client parameters */
        HttpParams httpClientParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpClientParams, config.getConnectionTimeout());
        HttpConnectionParams.setSoTimeout(httpClientParams, config.getSocketTimeout());
        HttpConnectionParams.setStaleCheckingEnabled(httpClientParams, true);
        HttpConnectionParams.setTcpNoDelay(httpClientParams, true);
        HttpConnectionParams.setSoKeepalive(httpClientParams, config.useTcpKeepAlive());

        int socketSendBufferSizeHint = config.getSocketBufferSizeHints()[0];
        int socketReceiveBufferSizeHint = config.getSocketBufferSizeHints()[1];
        if (socketSendBufferSizeHint > 0 || socketReceiveBufferSizeHint > 0) {
            HttpConnectionParams.setSocketBufferSize(httpClientParams,
                    Math.max(socketSendBufferSizeHint, socketReceiveBufferSizeHint));
        }
        final SSLContext sslContext = createSSLContext(config);
        SSLSocketFactory sslSocketFactory =
                config.getApacheHttpClientConfig().getSslSocketFactory();
        if (sslSocketFactory == null) {
            sslSocketFactory = new SdkTLSSocketFactory(
                    sslContext,
                    SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }

        PoolingClientConnectionManager connectionManager = ConnectionManagerFactory
            .createPoolingClientConnManager(config, httpClientParams, sslSocketFactory);

        SdkHttpClient httpClient = new SdkHttpClient(connectionManager, httpClientParams);
        httpClient.setHttpRequestRetryHandler(HttpRequestNoRetryHandler.Singleton);
        httpClient.setRedirectStrategy(new NeverFollowRedirectStrategy());

        if (config.getConnectionMaxIdleMillis() > 0) {
            httpClient.setKeepAliveStrategy(new SdkConnectionKeepAliveStrategy(
                    config.getConnectionMaxIdleMillis()));
        }

        if (config.getLocalAddress() != null) {
            ConnRouteParams.setLocalAddress(httpClientParams, config.getLocalAddress());
        }

        Scheme http = new Scheme("http", 80, PlainSocketFactory.getSocketFactory());
        Scheme https = new Scheme("https", 443, sslSocketFactory);
        SchemeRegistry sr = connectionManager.getSchemeRegistry();
        sr.register(http);
        sr.register(https);

        /*
         * If SSL cert checking for endpoints has been explicitly disabled,
         * register a new scheme for HTTPS that won't cause self-signed certs to
         * error out.
         */
        if (SDKGlobalConfiguration.isCertCheckingDisabled()) {
            Scheme sch = new Scheme("https", 443, new TrustingSocketFactory());
            httpClient.getConnectionManager().getSchemeRegistry().register(sch);
        }

        /* Set proxy if configured */
        String proxyHost = config.getProxyHost();
        int proxyPort = config.getProxyPort();
        if (proxyHost != null && proxyPort > 0) {
            AmazonHttpClient.log.info("Configuring Proxy. Proxy Host: " + proxyHost + " " + "Proxy Port: " + proxyPort);
            HttpHost proxyHttpHost = new HttpHost(proxyHost, proxyPort);
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);

            String proxyUsername    = config.getProxyUsername();
            String proxyPassword    = config.getProxyPassword();
            String proxyDomain      = config.getProxyDomain();
            String proxyWorkstation = config.getProxyWorkstation();

            if (proxyUsername != null && proxyPassword != null) {
                httpClient.getCredentialsProvider().setCredentials(
                        new AuthScope(proxyHost, proxyPort),
                        new NTCredentials(proxyUsername, proxyPassword, proxyWorkstation, proxyDomain));
            }

            // Add a request interceptor that sets up proxy authentication pre-emptively if configured
            if (config.isPreemptiveBasicProxyAuth()){
                httpClient.addRequestInterceptor(new PreemptiveProxyAuth(proxyHttpHost), 0);
            }
        }

        /* Accept Gzip response if configured */
        if (config.useGzip()) {

            httpClient.addRequestInterceptor(new HttpRequestInterceptor() {

                @Override
                public void process(final HttpRequest request,
                        final HttpContext context) throws HttpException,
                        IOException {
                    if (!request.containsHeader("Accept-Encoding")) {
                        request.addHeader("Accept-Encoding", "gzip");
                    }
                }

            });

            httpClient.addResponseInterceptor(new HttpResponseInterceptor() {

                @Override
                public void process(final HttpResponse response,
                        final HttpContext context) throws HttpException,
                        IOException {
                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        Header ceheader = entity.getContentEncoding();
                        if (ceheader != null) {
                            HeaderElement[] codecs = ceheader.getElements();
                            for (int i = 0; i < codecs.length; i++) {
                                if (codecs[i].getName()
                                        .equalsIgnoreCase("gzip")) {
                                    response.setEntity(new GzipDecompressingEntity(
                                            response.getEntity()));
                                    return;
                                }
                            }
                        }
                    }
                }

            });
        }

        return httpClient;
    }


    /**
     * Disable http redirect inside Apache HttpClient.
     */
    private static final class NeverFollowRedirectStrategy implements RedirectStrategy {

        @Override
        public boolean isRedirected(HttpRequest request, HttpResponse response,
                HttpContext context) throws ProtocolException {
            return false;
        }

        @Override
        public HttpUriRequest getRedirect(HttpRequest request,
                HttpResponse response, HttpContext context)
                throws ProtocolException {
            return null;
        }

    }

    /**
     * Simple implementation of SchemeSocketFactory (and
     * LayeredSchemeSocketFactory) that bypasses SSL certificate checks. This
     * class is only intended to be used for testing purposes.
     */
    private static class TrustingSocketFactory implements SchemeSocketFactory, SchemeLayeredSocketFactory {

        private SSLContext sslcontext = null;

        private static SSLContext createSSLContext() throws IOException {
            try {
                SSLContext context = SSLContext.getInstance("TLS");
                context.init(null, new TrustManager[] { new TrustingX509TrustManager() }, null);
                return context;
            } catch (Exception e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        private SSLContext getSSLContext() throws IOException {
            if (this.sslcontext == null) this.sslcontext = createSSLContext();
            return this.sslcontext;
        }

        @Override
        public Socket createSocket(HttpParams params) throws IOException {
            return getSSLContext().getSocketFactory().createSocket();
        }

        @Override
        public Socket connectSocket(Socket sock,
                InetSocketAddress remoteAddress,
                InetSocketAddress localAddress, HttpParams params)
                throws IOException, UnknownHostException,
                ConnectTimeoutException {
            int connTimeout = HttpConnectionParams.getConnectionTimeout(params);
            int soTimeout = HttpConnectionParams.getSoTimeout(params);

            SSLSocket sslsock = (SSLSocket) ((sock != null) ? sock : createSocket(params));
            if (localAddress != null) sslsock.bind(localAddress);

            sslsock.connect(remoteAddress, connTimeout);
            sslsock.setSoTimeout(soTimeout);
            return sslsock;
        }

        @Override
        public boolean isSecure(Socket sock) throws IllegalArgumentException {
            return true;
        }

        @Override
        public Socket createLayeredSocket(Socket arg0, String arg1, int arg2, HttpParams arg3)
                throws IOException, UnknownHostException {
            return getSSLContext().getSocketFactory().createSocket(arg0, arg1, arg2, true);
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
    };

    /**
     * HttpRequestInterceptor implementation to set up pre-emptive
     * authentication against a defined basic proxy server.
     */
    private static class PreemptiveProxyAuth implements HttpRequestInterceptor {
        private final HttpHost proxyHost;

        public PreemptiveProxyAuth(HttpHost proxyHost) {
            this.proxyHost = proxyHost;
        }

        @Override
        public void process(HttpRequest request, HttpContext context) {
            AuthCache authCache;
            // Set up the a Basic Auth scheme scoped for the proxy - we don't
            // want to do this for non-proxy authentication.
            BasicScheme basicScheme = new BasicScheme(ChallengeState.PROXY);

            if (context.getAttribute(ClientContext.AUTH_CACHE) == null) {
                authCache = new BasicAuthCache();
                authCache.put(this.proxyHost, basicScheme);
                context.setAttribute(ClientContext.AUTH_CACHE, authCache);
            } else {
                authCache =
                    (AuthCache) context.getAttribute(ClientContext.AUTH_CACHE);
                authCache.put(this.proxyHost, basicScheme);
            }
        }
    }


    /**
     * @see SSLContexts#createDefault()
     */
    public static SSLContext createSSLContext(ClientConfiguration config)
            throws SSLInitializationException {
        try {
            final SSLContext sslcontext = SSLContext.getInstance("TLS");
            // http://download.java.net/jdk9/docs/technotes/guides/security/jsse/JSSERefGuide.html
            sslcontext.init(null, null, config.getSecureRandom());
            return sslcontext;
        } catch (final NoSuchAlgorithmException ex) {
            throw new SSLInitializationException(ex.getMessage(), ex);
        } catch (final KeyManagementException ex) {
            throw new SSLInitializationException(ex.getMessage(), ex);
        }
    }
}