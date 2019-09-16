package com.amazonaws.http.apache.client.impl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;

public class ConnectionManagerDecorator implements HttpClientConnectionManager, ConnPoolControl {
    private static final String PROP_RELEASE_CONN = "com.amazonaws.connectiondebug.logRelease";
    private static final String PROP_LEASE_CONN = "com.amazonaws.connectiondebug.logLease";
    private static final Log LOG = LogFactory.getLog(ConnectionManagerDecorator.class);
    private final HttpClientConnectionManager delegate;

    public ConnectionManagerDecorator(HttpClientConnectionManager delegate) {
        this.delegate = delegate;
    }

    @Override
    public ConnectionRequest requestConnection(HttpRoute httpRoute, Object o) {
        return delegate.requestConnection(httpRoute, o);
    }

    @Override
    public void releaseConnection(HttpClientConnection httpClientConnection, Object o, long l, TimeUnit timeUnit) {
        if (logRelease()) {
            RuntimeException runtimeException = new RuntimeException();
            LOG.info("Connection released", runtimeException);
        }
        delegate.releaseConnection(httpClientConnection, o, l, timeUnit);
    }

    @Override
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) throws IOException {
        if (logLease()) {
            RuntimeException runtimeException = new RuntimeException();
            LOG.info("Connection leased", runtimeException);
        }
        delegate.connect(httpClientConnection, httpRoute, i, httpContext);
    }

    @Override
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        delegate.upgrade(httpClientConnection, httpRoute, httpContext);
    }

    @Override
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) throws IOException {
        delegate.routeComplete(httpClientConnection, httpRoute, httpContext);
    }

    @Override
    public void closeIdleConnections(long l, TimeUnit timeUnit) {
        delegate.closeIdleConnections(l, timeUnit);
    }

    @Override
    public void closeExpiredConnections() {
        delegate.closeExpiredConnections();
    }

    @Override
    public void shutdown() {
        delegate.shutdown();
    }

    @Override
    public void setMaxTotal(int i) {
        asPoolControl().setMaxTotal(i);
    }

    @Override
    public int getMaxTotal() {
        return asPoolControl().getMaxTotal();
    }

    @Override
    public void setDefaultMaxPerRoute(int i) {
        asPoolControl().setDefaultMaxPerRoute(i);
    }

    @Override
    public int getDefaultMaxPerRoute() {
        return asPoolControl().getDefaultMaxPerRoute();
    }

    @Override
    public void setMaxPerRoute(Object o, int i) {
        asPoolControl().setMaxPerRoute(o, i);
    }

    @Override
    public int getMaxPerRoute(Object o) {
        return asPoolControl().getMaxPerRoute(o);
    }

    @Override
    public PoolStats getTotalStats() {
        return asPoolControl().getTotalStats();
    }

    @Override
    public PoolStats getStats(Object o) {
        return asPoolControl().getStats(o);
    }

    private ConnPoolControl asPoolControl() {
        return ((ConnPoolControl) delegate);
    }

    private static final boolean logRelease() {
        return Boolean.parseBoolean(System.getProperty(PROP_RELEASE_CONN, "false"));
    }

    private static final boolean logLease() {
        return Boolean.parseBoolean(System.getProperty(PROP_LEASE_CONN, "false"));
    }
}
