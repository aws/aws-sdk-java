/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.http.IdleConnectionReaper;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.ValidationUtils;
import com.amazonaws.util.VersionInfoUtils;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Client configuration options such as proxy settings, user agent string, max retry attempts, etc.
 *
 * @see PredefinedClientConfigurations
 */
@NotThreadSafe
public class ClientConfiguration {

    /** The default timeout for creating new connections. */
    public static final int DEFAULT_CONNECTION_TIMEOUT = 10 * 1000;

    /** The default timeout for reading from a connected socket. */
    public static final int DEFAULT_SOCKET_TIMEOUT = 50 * 1000;

    /**
     * The default timeout for a request. This is disabled by default.
     */
    public static final int DEFAULT_REQUEST_TIMEOUT = 0;

    /**
     * The default timeout for a request. This is disabled by default.
     */
    public static final int DEFAULT_CLIENT_EXECUTION_TIMEOUT = 0;

    /**
     * The default on whether to disable {@code Socket} proxies.
     */
    public static final boolean DEFAULT_DISABLE_SOCKET_PROXY = false;

    /** The default max connection pool size. */
    public static final int DEFAULT_MAX_CONNECTIONS = 50;

    /**
     * The default on whether to utilize the USE_EXPECT_CONTINUE handshake for operations. Currently
     * only honored for PUT operations.
     */
    public static final boolean DEFAULT_USE_EXPECT_CONTINUE = true;

    /** The default HTTP user agent header for AWS Java SDK clients. */
    public static final String DEFAULT_USER_AGENT = VersionInfoUtils.getUserAgent();

    /**
     * Default request retry policy, including the maximum retry count of 3, the default retry
     * condition and the default back-off strategy.
     *
     * @see PredefinedRetryPolicies#DEFAULT
     * @see PredefinedRetryPolicies#DYNAMODB_DEFAULT
     */
    public static final RetryPolicy DEFAULT_RETRY_POLICY = PredefinedRetryPolicies.DEFAULT;

    /**
     * The default on whether to use the {@link IdleConnectionReaper} to manage stale connections
     *
     * @see IdleConnectionReaper
     */
    public static final boolean DEFAULT_USE_REAPER = true;

    /**
     * The default on whether to use gzip compression.
     */
    public static final boolean DEFAULT_USE_GZIP = false;

    /**
     * The default expiration time (in milliseconds) for a connection in the connection pool.
     */
    public static final long DEFAULT_CONNECTION_TTL = -1;

    /**
     * The default maximum idle time (in milliseconds) for a connection in the connection pool.
     */
    public static final long DEFAULT_CONNECTION_MAX_IDLE_MILLIS = 60 * 1000;

    /**
     * The default time a connection can be idle in the connection pool before it must be validated that it's still open.
     */
    public static final int DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS = 5 * 1000;

    /**
     * The default on whether to use TCP KeepAlive.
     */
    public static final boolean DEFAULT_TCP_KEEP_ALIVE = false;

    /**
     * The default on whether to throttle retries.
     */
    public static final boolean DEFAULT_THROTTLE_RETRIES = true;

    /**
     * The default on whether to cache response metadata.
     */
    public static final boolean DEFAULT_CACHE_RESPONSE_METADATA = true;

    /**
     * The default response metadata cache size.
     */
    public static final int DEFAULT_RESPONSE_METADATA_CACHE_SIZE = 50;

    public static final int DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING = 100;


    /** A prefix to the HTTP user agent header passed with all HTTP requests.  */
    private String userAgentPrefix = DEFAULT_USER_AGENT;

    /** A suffix to the HTTP user agent header. */
    private String userAgentSuffix;

    /**
     * The maximum number of times that a retryable failed request (ex: a 5xx response from a
     * service) will be retried. Or -1 if the user has not explicitly set this value, in which case
     * the configured RetryPolicy will be used to control the retry count.
     */
    private int maxErrorRetry = -1;

    /** The retry policy upon failed requests. **/
    private RetryPolicy retryPolicy = DEFAULT_RETRY_POLICY;

    /** Optionally specifies the local address to bind to */
    private InetAddress localAddress;

    /**
     * The protocol to use when connecting to Amazon Web Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     */
    private Protocol protocol = Protocol.HTTPS;

    /**
     * The protocol to use when connecting to an HTTP proxy.
     * <p>
     * The default configuration is to use {@link Protocol#HTTP}.
     */
    private Protocol proxyProtocol = Protocol.HTTP;

    /** Optionally specifies the proxy host to connect through. */
    private String proxyHost = null;

    /** Optionally specifies the port on the proxy host to connect through. */
    private int proxyPort = -1;

    /** Optionally specifies the user name to use when connecting through a proxy. */
    private String proxyUsername = null;

    /** Optionally specifies the password to use when connecting through a proxy. */
    private String proxyPassword = null;

    /** Optional Windows domain name for configuring NTLM proxy support. */
    private String proxyDomain = null;

    /** Optional Windows workstation name for configuring NTLM proxy support. */
    private String proxyWorkstation = null;

    /** Optional specifies the hosts that should be accessed without going through the proxy. */
    private String nonProxyHosts = null;

    /** Specifies the proxy authentication methods that should be used, in priority order. */
    private List<ProxyAuthenticationMethod> proxyAuthenticationMethods = null;

    /**
     * Controls whether {@link java.net.Socket}s created by the client should
     * use the default {@link java.net.ProxySelector} when connecting to the
     * remote host to find an appropriate proxy or connect directly to the
     * host.
     * <p />
     * Note this property is only guaranteed to be honored when using the
     * default connection factories.
     */
    private boolean disableSocketProxy = DEFAULT_DISABLE_SOCKET_PROXY;

    /**
     * Whether to pre-emptively authenticate against a proxy server using basic authentication
     */
    private boolean preemptiveBasicProxyAuth;

    /** The maximum number of open HTTP connections. */
    private int maxConnections = DEFAULT_MAX_CONNECTIONS;

    /**
     * The amount of time to wait (in milliseconds) for data to be transfered over an established,
     * open connection before the connection is timed out. A value of 0 means infinity, and is not
     * recommended.
     */
    private int socketTimeout = DEFAULT_SOCKET_TIMEOUT;

    /**
     * The amount of time to wait (in milliseconds) when initially establishing a connection before
     * giving up and timing out. A value of 0 means infinity, and is not recommended.
     */
    private int connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;

    /**
     * The amount of time to wait (in milliseconds) for a request to complete before giving up and
     * timing out. A value of 0 means infinity. Consider setting this if a harder guarantee is
     * required on the maximum amount of time a request will take for non-streaming operations, and
     * are willing to spin up a background thread to enforce it.
     */
    private int requestTimeout = DEFAULT_REQUEST_TIMEOUT;

    private int clientExecutionTimeout = DEFAULT_CLIENT_EXECUTION_TIMEOUT;

    private boolean throttleRetries = DEFAULT_THROTTLE_RETRIES;

    /**
     * Optional size hint (in bytes) for the low level TCP send buffer. This is an advanced option
     * for advanced users who want to tune low level TCP parameters to try and squeeze out more
     * performance.
     */
    private int socketSendBufferSizeHint = 0;

    /**
     * Optional size hint (in bytes) for the low level TCP receive buffer. This is an advanced
     * option for advanced users who want to tune low level TCP parameters to try and squeeze out
     * more performance.
     */
    private int socketReceiveBufferSizeHint = 0;

    /**
     * Optional whether to use the {@link IdleConnectionReaper} to manage stale connections. A
     * reason for not running the {@link IdleConnectionReaper} can be if running in an environment
     * where the modifyThread and modifyThreadGroup permissions are not allowed.
     */
    private boolean useReaper = DEFAULT_USE_REAPER;

    /**
     * Optional whether to use gzip compression when making HTTP requests.
     */
    private boolean useGzip = DEFAULT_USE_GZIP;

    /**
     * Optional override to control which signature algorithm should be used to sign requests to the
     * service. If not explicitly set, the client will determine the algorithm to use by inspecting
     * a configuration file baked in to the SDK.
     */
    private String signerOverride;

    /**
     * Optional expiration time for a connection in the connection pool. When a connection is
     * retrieved from the connection pool, this parameter is checked to see if the connection can be
     * reused.
     */
    private long connectionTTL = DEFAULT_CONNECTION_TTL;

    /**
     * The maximum idle time for a connection in the connection pool.
     */
    private long connectionMaxIdleMillis = DEFAULT_CONNECTION_MAX_IDLE_MILLIS;

    private int validateAfterInactivityMillis = DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS;

    /**
     * Optional override to enable support for TCP KeepAlive (not to be confused with HTTP
     * KeepAlive). TCP KeepAlive can be used to detect misbehaving routers or down servers through
     * the use of special, empty-data keep alive packets.
     * <p>
     * Actual TCP KeepAlive values (timeout, number of packets, etc) are configured via the
     * operating system (sysctl on Linux, and Registry values on Windows).
     */
    private boolean tcpKeepAlive = DEFAULT_TCP_KEEP_ALIVE;

    /**
     * Whether or not to cache response metadata.
     * <p>
     * Response metadata is typically used for troubleshooting issues with AWS support staff when
     * services aren't acting as expected.
     * </p>
     * <p>
     * While this feature is useful for debugging it adds overhead and disabling it may
     * be desired in high throughput applications.
     * </p>
     */
    private boolean cacheResponseMetadata = DEFAULT_CACHE_RESPONSE_METADATA;

    /**
     * Size of the response metadata cache, if it is enabled.
     * <p>
     * Response metadata is typically used for troubleshooting issues with AWS support staff when
     * services aren't acting as expected.
     */
    private int responseMetadataCacheSize = DEFAULT_RESPONSE_METADATA_CACHE_SIZE;

    /**
     * The DNS Resolver to resolve IP addresses of Amazon Web Services.
     */
    private DnsResolver dnsResolver = new SystemDefaultDnsResolver();

    /**
     * An instance of {@link SecureRandom} configured by the user; or the JDK default will be used
     * if it is set to null or not explicitly configured.
     */
    private SecureRandom secureRandom;

    /**
     * Headers to be added to all requests
     */
    private Map<String, String> headers = new HashMap<String, String>();

    /**
     * Optional override to enable/disable support for HTTP/1.1 handshake utilizing EXPECT:
     * 100-Continue. The default value is true.
     * <p>
     * The detail of HTTP Expect Continue is defined at
     * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec8.html#sec8.2.3"> Use of the 100
     * (Continue) Status</a>. Setting this as false will reduce latency when you want to send small
     * size of payload. It is highly recommended to use the default value if you want to transfer a
     * large amount of data to the server, such as uploading a big file to S3 bucket.
     */
    private boolean useExpectContinue = DEFAULT_USE_EXPECT_CONTINUE;

    /**
     * The maximum number of throttled retries if the initial request
     * fails.
     */
    private int maxConsecutiveRetriesBeforeThrottling = DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING;

    /**
     * Can be used to specify custom specific Apache HTTP client configurations.
     */
    private final ApacheHttpClientConfig apacheHttpClientConfig;

    /**
     * Configuration option to disable the host prefix injection.
     *
     * The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
     * the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.
     */
    private boolean disableHostPrefixInjection;

    public ClientConfiguration() {
        apacheHttpClientConfig = new ApacheHttpClientConfig();
    }

    public ClientConfiguration(ClientConfiguration other) {
        this.connectionTimeout = other.getConnectionTimeout();
        this.maxConnections = other.getMaxConnections();
        this.maxErrorRetry = other.getMaxErrorRetry();
        this.retryPolicy = other.getRetryPolicy();
        this.throttleRetries = other.useThrottledRetries();
        this.localAddress = other.getLocalAddress();
        this.protocol = other.getProtocol();
        this.proxyProtocol = other.getProxyProtocol();
        this.proxyDomain = other.getProxyDomain();
        this.proxyHost = other.getProxyHost();
        this.proxyPassword = other.getProxyPassword();
        this.proxyPort = other.getProxyPort();
        this.proxyUsername = other.getProxyUsername();
        this.proxyWorkstation = other.getProxyWorkstation();
        this.nonProxyHosts = other.getNonProxyHosts();
        this.disableSocketProxy = other.disableSocketProxy();
        this.proxyAuthenticationMethods = other.getProxyAuthenticationMethods();
        this.preemptiveBasicProxyAuth = other.isPreemptiveBasicProxyAuth();
        this.socketTimeout = other.getSocketTimeout();
        this.requestTimeout = other.getRequestTimeout();
        this.clientExecutionTimeout = other.getClientExecutionTimeout();
        this.userAgentPrefix = other.getUserAgentPrefix();
        this.userAgentSuffix = other.getUserAgentSuffix();
        this.useReaper = other.useReaper();
        this.useGzip = other.useGzip();
        this.socketSendBufferSizeHint = other.getSocketBufferSizeHints()[0];
        this.socketReceiveBufferSizeHint = other.getSocketBufferSizeHints()[1];
        this.signerOverride = other.getSignerOverride();
        this.responseMetadataCacheSize = other.getResponseMetadataCacheSize();
        this.dnsResolver = other.getDnsResolver();
        this.useExpectContinue = other.isUseExpectContinue();
        this.apacheHttpClientConfig = new ApacheHttpClientConfig(other.getApacheHttpClientConfig());
        this.cacheResponseMetadata = other.getCacheResponseMetadata();
        this.connectionTTL = other.getConnectionTTL();
        this.connectionMaxIdleMillis = other.getConnectionMaxIdleMillis();
        this.validateAfterInactivityMillis = other.getValidateAfterInactivityMillis();
        this.tcpKeepAlive = other.useTcpKeepAlive();
        this.secureRandom = other.getSecureRandom();
        this.headers.clear();
        this.headers.putAll(other.getHeaders());
        this.maxConsecutiveRetriesBeforeThrottling = other.getMaxConsecutiveRetriesBeforeThrottling();
        this.disableHostPrefixInjection = other.disableHostPrefixInjection;
    }

    /**
     * Returns the protocol (HTTP or HTTPS) to use when connecting to Amazon Web Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * <p>
     * Individual clients can also override this setting by explicitly including the protocol as
     * part of the endpoint URL when calling {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @return The protocol to use when connecting to Amazon Web Services.
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon Web Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * <p>
     * Individual clients can also override this setting by explicitly including the protocol as
     * part of the endpoint URL when calling {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @param protocol
     *            The protocol to use when connecting to Amazon Web Services.
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon Web Services, and
     * returns the updated ClientConfiguration object so that additional calls may be chained
     * together.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * <p>
     * Individual clients can also override this setting by explicitly including the protocol as
     * part of the endpoint URL when calling {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @param protocol
     *            The protocol to use when connecting to Amazon Web Services.
     * @return The updated ClientConfiguration object with the new max HTTP connections setting.
     */
    public ClientConfiguration withProtocol(Protocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * Returns the maximum number of allowed open HTTP connections.
     *
     * @return The maximum number of allowed open HTTP connections.
     */
    public int getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the maximum number of allowed open HTTP connections.
     *
     * @param maxConnections
     *            The maximum number of allowed open HTTP connections.
     */
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Sets the maximum number of allowed open HTTP connections and returns the updated
     * ClientConfiguration object.
     *
     * @param maxConnections
     *            The maximum number of allowed open HTTP connections.
     * @return The updated ClientConfiguration object with the new max HTTP connections setting.
     */
    public ClientConfiguration withMaxConnections(int maxConnections) {
        setMaxConnections(maxConnections);
        return this;
    }

    /**
     * @deprecated Replaced by {@link #getUserAgentPrefix()} and {@link #getUserAgentSuffix()}
     * @return The user agent string to use when sending requests.
     */
    @Deprecated
    public String getUserAgent() {
        return getUserAgentPrefix();
    }

    /**
     * @deprecated Replaced by {@link #setUserAgentPrefix(String)} and {@link #setUserAgentSuffix(String)}
     * @param userAgent
     *            The user agent string to use when sending requests.
     */
    @Deprecated
    public void setUserAgent(String userAgent) {
        setUserAgentPrefix(userAgent);
    }

    /**
     * @deprecated Replaced by {@link #withUserAgentPrefix(String)} and {@link #withUserAgentSuffix(String)}
     * @param userAgent
     *            The user agent string to use when sending requests.
     * @return The updated ClientConfiguration object.
     */
    @Deprecated
    public ClientConfiguration withUserAgent(String userAgent) {
        return withUserAgentPrefix(userAgent);
    }

    /**
     * Returns the HTTP user agent header prefix to send with all requests.
     *
     * @return The user agent string prefix to use when sending requests.
     */
    public String getUserAgentPrefix() {
        return userAgentPrefix;
    }

    /**
     * Sets the HTTP user agent prefix to send with all requests.
     *
     * @param prefix
     *            The string to prefix to user agent to use when sending requests.
     */
    public void setUserAgentPrefix(String prefix) {
        this.userAgentPrefix = prefix;
    }

    /**
     * Sets the HTTP user agent prefix header used in requests and returns the updated ClientConfiguration
     * object.
     *
     * @param prefix
     *            The string to prefix to user agent to use when sending requests.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withUserAgentPrefix(String prefix) {
        setUserAgentPrefix(prefix);
        return this;
    }

    /**
     * Returns the HTTP user agent header suffix to add to the end of the user agent header on all requests.
     *
     * @return The user agent string suffix to use when sending requests.
     */
    public String getUserAgentSuffix() {
        return userAgentSuffix;
    }

    /**
     * Sets the HTTP user agent suffix to send with all requests.
     *
     * @param suffix
     *            The string to suffix to user agent to use when sending requests.
     */
    public void setUserAgentSuffix(String suffix) {
        this.userAgentSuffix = suffix;
    }

    /**
     * Sets the HTTP user agent suffix header used in requests and returns the updated ClientConfiguration
     * object.
     *
     * @param suffix
     *            The string to suffix to user agent to use when sending requests.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withUserAgentSuffix(String suffix) {
        setUserAgentSuffix(suffix);
        return this;
    }

    /**
     * Returns the optional local address the client will bind to.
     *
     * @return The local address the client will bind to.
     */
    public InetAddress getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the optional local address the client will bind to.
     *
     * @param localAddress
     *            The local address the client will bind to.
     */
    public void setLocalAddress(InetAddress localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * Sets the optional local address the client will bind to and returns the updated
     * ClientConfiguration object.
     *
     * @param localAddress
     *            The local address the client will bind to.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withLocalAddress(InetAddress localAddress) {
        setLocalAddress(localAddress);
        return this;
    }

    /**
     * Returns the value for the given system property.
     */
    private String getSystemProperty(String property) {
        return System.getProperty(property);
    }

    /**
     * @return The {@link Protocol} to use for connecting to the proxy.
     */
    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    /**
     * Set the {@link Protocol} to use for connecting to the proxy.
     *
     * @param proxyProtocol The protocol.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol == null ? Protocol.HTTP : proxyProtocol;
        return this;
    }

    /**
     * Set the {@link Protocol} to use for connecting to the proxy.
     *
     * @param proxyProtocol The protocol.
     */
    public void setProxyProtocol(Protocol proxyProtocol) {
        withProxyProtocol(proxyProtocol);
    }

    /**
     * Returns the Java system property for proxy host depending on
     * {@link #getProtocol()}: i.e. if protocol is https, returns
     * the value of the system property https.proxyHost, otherwise
     * returns value of http.proxyHost.
     */
    private String getProxyHostProperty() {
        return getProtocol() == Protocol.HTTPS
                ? getSystemProperty("https.proxyHost")
                : getSystemProperty("http.proxyHost");
    }

    /**
     * Returns the optional proxy host the client will connect
     * through.  Returns either the proxyHost set on this object, or
     * if not provided, checks the value of the Java system property
     * for proxy host according to {@link #getProtocol()}: i.e. if
     * protocol is https, returns the value of the system property
     * https.proxyHost, otherwise returns value of http.proxyHost.
     *
     * @return The proxy host the client will connect through.
     */
    public String getProxyHost() {
        return (proxyHost != null) ? proxyHost : getProxyHostProperty();
    }

    /**
     * Sets the optional proxy host the client will connect through.
     *
     * @param proxyHost
     *            The proxy host the client will connect through.
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Sets the optional proxy host the client will connect through and returns the updated
     * ClientConfiguration object.
     *
     * @param proxyHost
     *            The proxy host the client will connect through.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyHost(String proxyHost) {
        setProxyHost(proxyHost);
        return this;
    }

    /**
     * Returns the Java system property for proxy port depending on
     * {@link #getProtocol()}: i.e. if protocol is https, returns
     * the value of the system property https.proxyPort, otherwise
     * returns value of http.proxyPort.  Defaults to {@link this.proxyPort}
     * if the system property is not set with a valid port number.
     */
    private int getProxyPortProperty() {
        final String proxyPortString = (getProtocol() == Protocol.HTTPS)
                    ? getSystemProperty("https.proxyPort")
                    : getSystemProperty("http.proxyPort");
        try {
            return Integer.parseInt(proxyPortString);
        } catch (NumberFormatException e) {
            return proxyPort;
        }
    }

    /**
     * Returns the optional proxy port the client will connect
     * through.  Returns either the proxyPort set on this object, or
     * if not provided, checks the value of the Java system property
     * for proxy port according to {@link #getProtocol()}: i.e. if
     * protocol is https, returns the value of the system property
     * https.proxyPort, otherwise returns value of http.proxyPort.
     *
     * @return The proxy port the client will connect through.
     */
    public int getProxyPort() {
        return (proxyPort >= 0) ? proxyPort : getProxyPortProperty();
    }

    /**
     * Sets the optional proxy port the client will connect through.
     *
     * @param proxyPort
     *            The proxy port the client will connect through.
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Sets the optional proxy port the client will connect through and returns the updated
     * ClientConfiguration object.
     *
     * @param proxyPort
     *            The proxy port the client will connect through.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyPort(int proxyPort) {
        setProxyPort(proxyPort);
        return this;
    }

    /**
     * Set whether to disable proxies at the socket level.
     *
     * @param disableSocketProxy Whether to disable proxies at the socket level.
     *
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withDisableSocketProxy(boolean disableSocketProxy) {
        this.disableSocketProxy = disableSocketProxy;
        return this;
    }

    /**
     * Set whether to disable proxies at the socket level.
     *
     * @param disableSocketProxy Whether to disable proxies at the socket level.
     */
    public void setDisableSocketProxy(boolean disableSocketProxy) {
        withDisableSocketProxy(disableSocketProxy);
    }

    /**
     * @return Whether to disable proxies at the socket level.
     */
    public boolean disableSocketProxy() {
        return disableSocketProxy;
    }

    /**
     * Returns the Java system property for proxy user name depending on
     * {@link #getProtocol()}: i.e. if protocol is https, returns
     * the value of the system property https.proxyUser, otherwise
     * returns value of http.proxyUser.
     */
    private String getProxyUsernameProperty() {
        return (getProtocol() == Protocol.HTTPS)
                ? getSystemProperty("https.proxyUser")
                : getSystemProperty("http.proxyUser");
    }

    /**
     * Returns the optional proxy user name to use if connecting
     * through a proxy.  Returns either the proxyUsername set on this
     * object, or if not provided, checks the value of the Java system
     * property for proxy user name according to {@link #getProtocol()}:
     * i.e. if protocol is https, returns the value of the system
     * property https.proxyUser, otherwise returns value of
     * http.proxyUser.
     *
     * @return The optional proxy user name the configured client will use if connecting through a
     *         proxy.
     */
    public String getProxyUsername() {
        return (proxyUsername != null) ? proxyUsername : getProxyUsernameProperty();
    }

    /**
     * Sets the optional proxy user name to use if connecting through a proxy.
     *
     * @param proxyUsername
     *            The proxy user name to use if connecting through a proxy.
     */
    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    /**
     * Sets the optional proxy user name and returns the updated ClientConfiguration object.
     *
     * @param proxyUsername
     *            The proxy user name to use if connecting through a proxy.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyUsername(String proxyUsername) {
        setProxyUsername(proxyUsername);
        return this;
    }

    /**
     * Returns the Java system property for proxy password depending on
     * {@link #getProtocol()}: i.e. if protocol is https, returns
     * the value of the system property https.proxyPassword, otherwise
     * returns value of http.proxyPassword.
     */
    private String getProxyPasswordProperty() {
        return (getProtocol() == Protocol.HTTPS)
                ? getSystemProperty("https.proxyPassword")
                : getSystemProperty("http.proxyPassword");
    }

    /**
     * Returns the optional proxy password to use if connecting
     * through a proxy.  Returns either the proxyPassword set on this
     * object, or if not provided, checks the value of the Java system
     * property for proxy password according to {@link #getProtocol()}:
     * i.e. if protocol is https, returns the value of the system
     * property https.proxyPassword, otherwise returns value of
     * http.proxyPassword.
     *
     * @return The password to use when connecting through a proxy.
     */
    public String getProxyPassword() {
        return (proxyPassword != null) ? proxyPassword : getProxyPasswordProperty();
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy.
     *
     * @param proxyPassword
     *            The password to use when connecting through a proxy.
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy, and returns the
     * updated ClientConfiguration object.
     *
     * @param proxyPassword
     *            The password to use when connecting through a proxy.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyPassword(String proxyPassword) {
        setProxyPassword(proxyPassword);
        return this;
    }

    /**
     * Returns the optional Windows domain name for configuring an NTLM proxy. If you aren't using a
     * Windows NTLM proxy, you do not need to set this field.
     *
     * @return The optional Windows domain name for configuring an NTLM proxy.
     */
    public String getProxyDomain() {
        return proxyDomain;
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy. If you aren't using a
     * Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain
     *            The optional Windows domain name for configuring an NTLM proxy.
     */
    public void setProxyDomain(String proxyDomain) {
        this.proxyDomain = proxyDomain;
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy and returns a reference
     * to this updated ClientConfiguration object so that additional method calls can be chained
     * together. If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain
     *            The optional Windows domain name for configuring an NTLM proxy.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyDomain(String proxyDomain) {
        setProxyDomain(proxyDomain);
        return this;
    }

    /**
     * Returns the optional Windows workstation name for configuring NTLM proxy support. If you
     * aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @return The optional Windows workstation name for configuring NTLM proxy support.
     */
    public String getProxyWorkstation() {
        return proxyWorkstation;
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy support. If you aren't
     * using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyWorkstation
     *            The optional Windows workstation name for configuring NTLM proxy support.
     */
    public void setProxyWorkstation(String proxyWorkstation) {
        this.proxyWorkstation = proxyWorkstation;
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy support, and returns
     * the updated ClientConfiguration object so that additional method calls can be chained
     * together. If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyWorkstation
     *            The optional Windows workstation name for configuring NTLM proxy support.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyWorkstation(String proxyWorkstation) {
        setProxyWorkstation(proxyWorkstation);
        return this;
    }

    /**
     * Returns the Java system property for nonProxyHosts. We still honor this property even
     * {@link #getProtocol()} is https, see http://docs.oracle.com/javase/7/docs/api/java/net/doc-files/net-properties.html.
     */
    private String getNonProxyHostsProperty() {
        return getSystemProperty("http.nonProxyHosts");
    }

    /**
     * Returns the optional hosts the client will access without going
     * through the proxy. Returns either the nonProxyHosts set on this
     * object, or if not provided, checks the value of the Java system property
     * for nonProxyHosts according to {@link #getProtocol()}: i.e. if
     * protocol is https, returns null, otherwise returns value of http.nonProxyHosts.
     *
     * @return The hosts the client will connect through bypassing the proxy.
     */
    public String getNonProxyHosts() {
        return nonProxyHosts != null ? nonProxyHosts : getNonProxyHostsProperty();
    }

    /**
     * Set the optional hosts the client will access without going
     * through the proxy.
     *
     * @param nonProxyHosts
     *            The hosts the client will access without going through the proxy.
     */
    public void setNonProxyHosts(String nonProxyHosts) {
        this.nonProxyHosts = nonProxyHosts;
    }

    /**
     * Set the optional hosts the client will access without going
     * through the proxy.
     *
     * @param nonProxyHosts
     *            The hosts the client will access without going through the proxy.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withNonProxyHosts(String nonProxyHosts) {
        setNonProxyHosts(nonProxyHosts);
        return this;
    }

    /**
     * Returns the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order they
     * should be attempted.
     *
     * @return An unmodifiable view of the proxy authentication methods that should be attempted, in order.
     */
    public List<ProxyAuthenticationMethod> getProxyAuthenticationMethods() {
        return this.proxyAuthenticationMethods;
    }

    /**
     * Configure the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order
     * they should be attempted. Any methods not included in this list will not be attempted. If one authentication method fails,
     * the next method will be attempted, until a working method is found (or all methods have been attempted).
     *
     * <p>Setting this value to null indicates using the default behavior, which is to try all authentication methods in an
     * unspecified order.</p>
     *
     * @param proxyAuthenticationMethods The proxy authentication methods to be attempted, in the order they should be attempted.
     */
    public void setProxyAuthenticationMethods(List<ProxyAuthenticationMethod> proxyAuthenticationMethods) {
        if(proxyAuthenticationMethods == null) {
            this.proxyAuthenticationMethods = null;
        } else {
            ValidationUtils.assertNotEmpty(proxyAuthenticationMethods, "proxyAuthenticationMethods");
            this.proxyAuthenticationMethods =
                    Collections.unmodifiableList(new ArrayList<ProxyAuthenticationMethod>(proxyAuthenticationMethods));
        }
    }

    /**
     * Configure the list of authentication methods that should be used when authenticating against an HTTP proxy, in the order
     * they should be attempted. Any methods not included in this list will not be attempted. If one authentication method fails,
     * the next method will be attempted, until a working method is found (or all methods have been attempted).
     *
     * <p>Setting this value to null indicates using the default behavior, which is to try all authentication methods in an
     * unspecified order.</p>
     *
     * @param proxyAuthenticationMethods The proxy authentication methods to be attempted, in the order they should be attempted.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withProxyAuthenticationMethods(List<ProxyAuthenticationMethod> proxyAuthenticationMethods) {
        setProxyAuthenticationMethods(proxyAuthenticationMethods);
        return this;
    }

    /**
     * Returns the retry policy upon failed requests.
     *
     * @return The retry policy upon failed requests.
     */
    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * Sets the retry policy upon failed requests. User could specify whether the RetryPolicy should
     * honor maxErrorRetry set by {@link #setMaxErrorRetry(int)}.
     *
     * @param retryPolicy
     *            The retry policy upon failed requests.
     */
    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * Sets the retry policy upon failed requests, and returns the updated ClientConfiguration
     * object. User could specify whether the RetryPolicy should honor maxErrorRetry set by
     * {@link #setMaxErrorRetry(int)}
     *
     * @param retryPolicy
     *            The retry policy upon failed requests.
     */
    public ClientConfiguration withRetryPolicy(RetryPolicy retryPolicy) {
        setRetryPolicy(retryPolicy);
        return this;
    }

    /**
     * Returns the maximum number of retry attempts for failed retryable requests (ex: 5xx error
     * responses from a service). This method returns -1 before a maxErrorRetry value is explicitly
     * set by {@link #setMaxErrorRetry(int)}, in which case the configured RetryPolicy will be used
     * to control the retry count.
     *
     * @return The maximum number of retry attempts for failed retryable requests, or -1 if
     *         maxErrorRetry has not been set by {@link #setMaxErrorRetry(int)}.
     */
    public int getMaxErrorRetry() {
        return maxErrorRetry;
    }

    /**
     * Sets the maximum number of retry attempts for failed retryable requests (ex: 5xx error
     * responses from services).
     *
     * @param maxErrorRetry
     *            The maximum number of retry attempts for failed retryable requests. This value
     *            should not be negative.
     */
    public void setMaxErrorRetry(int maxErrorRetry) {
        if (maxErrorRetry < 0) {
            throw new IllegalArgumentException("maxErrorRetry shoud be non-negative");
        }
        this.maxErrorRetry = maxErrorRetry;
    }

    /**
     * Sets the maximum number of retry attempts for failed retryable requests (ex: 5xx error
     * responses from services), and returns the updated ClientConfiguration object.
     *
     * @param maxErrorRetry
     *            The maximum number of retry attempts for failed retryable requests. This value
     *            should not be negative.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withMaxErrorRetry(int maxErrorRetry) {
        setMaxErrorRetry(maxErrorRetry);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) for data to be transfered over an
     * established, open connection before the connection times out and is closed. A value of 0
     * means infinity, and isn't recommended.
     *
     * @return The amount of time to wait (in milliseconds) for data to be transfered over an
     *         established, open connection before the connection times out and is closed.
     */
    public int getSocketTimeout() {
        return socketTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be transfered over an
     * established, open connection before the connection times out and is closed. A value of 0
     * means infinity, and isn't recommended.
     *
     * @param socketTimeout
     *            The amount of time to wait (in milliseconds) for data to be transfered over an
     *            established, open connection before the connection times out and is closed.
     */
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be transfered over an
     * established, open connection before the connection times out and is closed, and returns the
     * updated ClientConfiguration object so that additional method calls may be chained together.
     *
     * @param socketTimeout
     *            The amount of time to wait (in milliseconds) for data to be transfered over an
     *            established, open connection before the connection times out and is closed.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withSocketTimeout(int socketTimeout) {
        setSocketTimeout(socketTimeout);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out. A value of 0 means infinity, and is not recommended.
     *
     * @return The amount of time to wait (in milliseconds) when initially establishing a connection
     *         before giving up and timing out.
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out. A value of 0 means infinity, and is not recommended.
     *
     * @param connectionTimeout
     *            The amount of time to wait (in milliseconds) when initially establishing a
     *            connection before giving up and timing out.
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially establishing a connection
     * before giving up and timing out, and returns the updated ClientConfiguration object so that
     * additional method calls may be chained together.
     *
     * @param connectionTimeout
     *            the amount of time to wait (in milliseconds) when initially establishing a
     *            connection before giving up and timing out.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withConnectionTimeout(int connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) for the request to complete before
     * giving up and timing out. A non-positive value disables this feature.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the request timeout feature
     * should not be used when absolute precision is needed.
     * </p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @return The amount of time to wait (in milliseconds) for the request to complete before
     *         giving up and timing out.
     * @see {@link ClientConfiguration#setClientExecutionTimeout(int)} to enforce a timeout across
     *      all retries
     */
    public int getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for the request to complete before giving
     * up and timing out. A non-positive value disables this feature.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the request timeout feature
     * should not be used when absolute precision is needed.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param requestTimeout
     *            The amount of time to wait (in milliseconds) for the request to complete before
     *            giving up and timing out.
     * @see {@link ClientConfiguration#setClientExecutionTimeout(int)} to enforce a timeout across
     *      all retries
     */
    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for the request to complete before giving
     * up and timing out. A non-positive value disables this feature. Returns the updated
     * ClientConfiguration object so that additional method calls may be chained together.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The request timeout feature doesn't have strict guarantees on how quickly a request is
     * aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the request timeout feature
     * should not be used when absolute precision is needed.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param requestTimeout
     *            The amount of time to wait (in milliseconds) for the request to complete before
     *            giving up and timing out.
     * @return The updated ClientConfiguration object.
     * @see {@link ClientConfiguration#setClientExecutionTimeout(int)} to enforce a timeout across
     *      all retries
     */
    public ClientConfiguration withRequestTimeout(int requestTimeout) {
        setRequestTimeout(requestTimeout);
        return this;
    }

    /**
     * Returns the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link ClientConfiguration#setRequestTimeout(int)} to enforce
     * both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
     * all requests across retries (i.e. the 'client execution' time). A non-positive value disables
     * this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @return The amount of time (in milliseconds) to allow the client to complete the execution of
     *         an API call.
     * @see {@link ClientConfiguration#setRequestTimeout(int)} to enforce a timeout per HTTP request
     */
    public int getClientExecutionTimeout() {
        return this.clientExecutionTimeout;
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link ClientConfiguration#setRequestTimeout(int)} to enforce
     * both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
     * all requests across retries (i.e. the 'client execution' time). A non-positive value disables
     * this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param clientExecutionTimeout
     *            The amount of time (in milliseconds) to allow the client to complete the execution
     *            of an API call. A value of '0' disables this feature.
     * @see {@link ClientConfiguration#setRequestTimeout(int)} to enforce a timeout per HTTP request
     */
    public void setClientExecutionTimeout(int clientExecutionTimeout) {
        this.clientExecutionTimeout = clientExecutionTimeout;
    }

    /**
     * Sets the amount of time (in milliseconds) to allow the client to complete the execution of
     * an API call. This timeout covers the entire client execution except for marshalling. This
     * includes request handler execution, all HTTP request including retries, unmarshalling, etc.
     * <p>
     * This feature requires buffering the entire response (for non-streaming APIs) into memory to
     * enforce a hard timeout when reading the response. For APIs that return large responses this
     * could be expensive.
     * <p>
     * <p>
     * The client execution timeout feature doesn't have strict guarantees on how quickly a request
     * is aborted when the timeout is breached. The typical case aborts the request within a few
     * milliseconds but there may occasionally be requests that don't get aborted until several
     * seconds after the timer has been breached. Because of this, the client execution timeout
     * feature should not be used when absolute precision is needed.
     * </p>
     * <p>
     * This may be used together with {@link ClientConfiguration#setRequestTimeout(int)} to enforce
     * both a timeout on each individual HTTP request (i.e. each retry) and the total time spent on
     * all requests across retries (i.e. the 'client execution' time). A non-positive value disables
     * this feature.
     * </p>
     * <p>
     * <b>Note:</b> This feature is not compatible with Java 1.6.
     * </p>
     *
     * @param clientExecutionTimeout
     *            The amount of time (in milliseconds) to allow the client to complete the execution
     *            of an API call. A value of '0' disables this feature.
     * @return The updated ClientConfiguration object for method chaining
     * @see {@link ClientConfiguration#setRequestTimeout(int)} to enforce a timeout per HTTP request
     */
    public ClientConfiguration withClientExecutionTimeout(int clientExecutionTimeout) {
        setClientExecutionTimeout(clientExecutionTimeout);
        return this;
    }

    /**
     * Checks if the {@link IdleConnectionReaper} is to be started
     *
     * @return if the {@link IdleConnectionReaper} is to be started
     */
    public boolean useReaper() {
        return useReaper;
    }

    /**
     * Sets whether the {@link IdleConnectionReaper} is to be started as a daemon thread
     *
     * @param use
     *            whether the {@link IdleConnectionReaper} is to be started as a daemon thread
     * @see IdleConnectionReaper
     */
    public void setUseReaper(boolean use) {
        this.useReaper = use;
    }

    /**
     * Sets whether the {@link IdleConnectionReaper} is to be started as a daemon thread
     *
     * @param use
     *            the {@link IdleConnectionReaper} is to be started as a daemon thread
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withReaper(boolean use) {
        setUseReaper(use);
        return this;
    }

    /**
     * Returns whether retry throttling will be used.
     * <p>
     * Retry throttling is a feature which intelligently throttles retry attempts when a
     * large percentage of requests are failing and retries are unsuccessful, particularly
     * in scenarios of degraded service health.  In these situations the client will drain its
     * internal retry capacity and slowly roll off from retry attempts until requests begin
     * to succeed again.  At that point the retry capacity pool will begin to refill and
     * retries will once again be permitted.
     * </p>
     * <p>
     * In situations where retries have been throttled this feature will effectively result in
     * fail-fast behavior from the client.  Because retries are circumvented exceptions will
     * be immediately returned to the caller if the initial request is unsuccessful.  This
     * will result in a greater number of exceptions being returned up front but prevents
     * requests being tied up attempting subsequent retries which are also likely to fail.
     * </p>
     *
     * @return true if retry throttling will be used
     */
    public boolean useThrottledRetries() {
        return throttleRetries || getSystemProperty(
                SDKGlobalConfiguration.RETRY_THROTTLING_SYSTEM_PROPERTY) != null;
    }

    /**
     * Sets whether throttled retries should be used
     * <p>
     * Retry throttling is a feature which intelligently throttles retry attempts when a
     * large percentage of requests are failing and retries are unsuccessful, particularly
     * in scenarios of degraded service health.  In these situations the client will drain its
     * internal retry capacity and slowly roll off from retry attempts until requests begin
     * to succeed again.  At that point the retry capacity pool will begin to refill and
     * retries will once again be permitted.
     * </p>
     * <p>
     * In situations where retries have been throttled this feature will effectively result in
     * fail-fast behavior from the client.  Because retries are circumvented exceptions will
     * be immediately returned to the caller if the initial request is unsuccessful.  This
     * will result in a greater number of exceptions being returned up front but prevents
     * requests being tied up attempting subsequent retries which are also likely to fail.
     * </p>
     *
     * @param use
     *            true if throttled retries should be used
     */
    public void setUseThrottleRetries(boolean use) { this.throttleRetries = use; }

    /**
     * Sets whether throttled retries should be used
     * <p>
     * Retry throttling is a feature which intelligently throttles retry attempts when a
     * large percentage of requests are failing and retries are unsuccessful, particularly
     * in scenarios of degraded service health.  In these situations the client will drain its
     * internal retry capacity and slowly roll off from retry attempts until requests begin
     * to succeed again.  At that point the retry capacity pool will begin to refill and
     * retries will once again be permitted.
     * </p>
     * <p>
     * In situations where retries have been throttled this feature will effectively result in
     * fail-fast behavior from the client.  Because retries are circumvented exceptions will
     * be immediately returned to the caller if the initial request is unsuccessful.  This
     * will result in a greater number of exceptions being returned up front but prevents
     * requests being tied up attempting subsequent retries which are also likely to fail.
     * </p>

     * @param use
     *            true if throttled retries should be used
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withThrottledRetries(boolean use) {
        setUseThrottleRetries(use);
        return this;
    }

    /**
     * Set the maximum number of consecutive failed retries that the client will permit before
     * throttling all subsequent retries of failed requests.
     * <p>
     * Note: This does not guarantee that each failed request will be retried up to this many times.
     * Depending on the configured {@link RetryPolicy} and the number of past failed and successful
     * requests, the actual number of retries attempted may be less.
     * <p>
     * This has a default value of {@link #DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING}.
     *
     * @param maxConsecutiveRetriesBeforeThrottling The maximum number of consecutive retries.
     */
    public void setMaxConsecutiveRetriesBeforeThrottling(int maxConsecutiveRetriesBeforeThrottling) {
        this.maxConsecutiveRetriesBeforeThrottling = ValidationUtils.assertIsPositive(maxConsecutiveRetriesBeforeThrottling,
                "maxConsecutiveRetriesBeforeThrottling");
    }
    /**
     * Set the maximum number of consecutive failed retries that the client will permit before
     * throttling all subsequent retries of failed requests.
     * <p>
     * Note: This does not guarantee that each failed request will be retried up to this many times.
     * Depending on the configured {@link RetryPolicy} and the number of past failed and successful
     * requests, the actual number of retries attempted may be less.
     * <p>
     * This has a default value of {@link #DEFAULT_MAX_CONSECUTIVE_RETRIES_BEFORE_THROTTLING}.
     *
     * @param maxConsecutiveRetriesBeforeThrottling The maximum number of consecutive retries.
     *
     * @return This object for chaining.
     */
    public ClientConfiguration withMaxConsecutiveRetriesBeforeThrottling(int maxConsecutiveRetriesBeforeThrottling) {
        setMaxConsecutiveRetriesBeforeThrottling(maxConsecutiveRetriesBeforeThrottling);
        return this;
    }

    /**
     * @return Set the maximum number of consecutive failed retries that the client will permit
     * before throttling all subsequent retries of failed requests.
     */
    public int getMaxConsecutiveRetriesBeforeThrottling() {
        return maxConsecutiveRetriesBeforeThrottling;
    }

    /**
     * Checks if gzip compression is used
     *
     * @return if gzip compression is used
     */
    public boolean useGzip() {
        return useGzip;
    }

    /**
     * Sets whether gzip compression should be used
     *
     * @param use
     *            whether gzip compression should be used
     */
    public void setUseGzip(boolean use) {
        this.useGzip = use;
    }

    /**
     * Sets whether gzip compression should be used
     *
     * @param use
     *            whether gzip compression should be used
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withGzip(boolean use) {
        setUseGzip(use);
        return this;
    }

    /**
     * Returns the optional size hints (in bytes) for the low level TCP send and receive buffers.
     * This is an advanced option for advanced users who want to tune low level TCP parameters to
     * try and squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly dependent on network
     * configuration and operating system configuration and capabilities. For example, most modern
     * operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
     * big impact on performance for TCP connections that are held open long enough for the
     * auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
     * without requiring the remote server to acknowledge receipt of that information, so can be
     * particularly useful when the network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to honor it. When using
     * this option, users should <b>always</b> check the operating system's configured limits and
     * defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
     * beyond that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP buffer sizes and
     * operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @return A two element array containing first the TCP send buffer size hint and then the TCP
     *         receive buffer size hint.
     */
    public int[] getSocketBufferSizeHints() {
        return new int[] { socketSendBufferSizeHint, socketReceiveBufferSizeHint };
    }

    /**
     * Sets the optional size hints (in bytes) for the low level TCP send and receive buffers. This
     * is an advanced option for advanced users who want to tune low level TCP parameters to try and
     * squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly dependent on network
     * configuration and operating system configuration and capabilities. For example, most modern
     * operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
     * big impact on performance for TCP connections that are held open long enough for the
     * auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
     * without requiring the remote server to acknowledge receipt of that information, so can be
     * particularly useful when the network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to honor it. When using
     * this option, users should <b>always</b> check the operating system's configured limits and
     * defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
     * beyond that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP buffer sizes and
     * operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @param socketSendBufferSizeHint
     *            The size hint (in bytes) for the low level TCP send buffer.
     * @param socketReceiveBufferSizeHint
     *            The size hint (in bytes) for the low level TCP receive buffer.
     */
    public void setSocketBufferSizeHints(int socketSendBufferSizeHint, int socketReceiveBufferSizeHint) {
        this.socketSendBufferSizeHint = socketSendBufferSizeHint;
        this.socketReceiveBufferSizeHint = socketReceiveBufferSizeHint;
    }

    /**
     * Sets the optional size hints (in bytes) for the low level TCP send and receive buffers, and
     * returns the updated ClientConfiguration object so that additional method calls may be chained
     * together.
     * <p>
     * This is an advanced option for advanced users who want to tune low level TCP parameters to
     * try and squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly dependent on network
     * configuration and operating system configuration and capabilities. For example, most modern
     * operating systems provide auto-tuning functionality for TCP buffer sizes, which can have a
     * big impact on performance for TCP connections that are held open long enough for the
     * auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer more data in memory
     * without requiring the remote server to acknowledge receipt of that information, so can be
     * particularly useful when the network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to honor it. When using
     * this option, users should <b>always</b> check the operating system's configured limits and
     * defaults. Most OS's have a maximum TCP buffer size limit configured, and won't let you go
     * beyond that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP buffer sizes and
     * operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @param socketSendBufferSizeHint
     *            The size hint (in bytes) for the low level TCP send buffer.
     * @param socketReceiveBufferSizeHint
     *            The size hint (in bytes) for the low level TCP receive buffer.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withSocketBufferSizeHints(int socketSendBufferSizeHint,
                                                         int socketReceiveBufferSizeHint) {
        setSocketBufferSizeHints(socketSendBufferSizeHint, socketReceiveBufferSizeHint);
        return this;
    }

    /**
     * Returns the name of the signature algorithm to use for signing requests made by this client.
     * If not set or explicitly set to null, the client will choose a signature algorithm to use
     * based on a configuration file of supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature algorithm is being used, as
     * the defaults will be sufficient. This setting exists only so advanced users can opt in to
     * newer signature protocols which have not yet been made the default for a particular
     * service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an unsupported signature
     * algorithm will lead to authentication failures. Use me at your own risk, and only after
     * consulting the documentation for the service to ensure it actually does supports your chosen
     * algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a {@code Signer} class
     * implementing the chosen algorithm by the {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @return The signature algorithm to use for this client, or null to use the default.
     */
    public String getSignerOverride() {
        return signerOverride;
    }

    /**
     * Sets the name of the signature algorithm to use for signing requests made by this client. If
     * not set or explicitly set to null, the client will choose a signature algorithm to use based
     * on a configuration file of supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature algorithm is being used, as
     * the defaults will be sufficient. This setting exists only so advanced users can opt in to
     * newer signature protocols which have not yet been made the default for a particular
     * service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an unsupported signature
     * algorithm will lead to authentication failures. Use me at your own risk, and only after
     * consulting the documentation for the service to ensure it actually does supports your chosen
     * algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a {@code Signer} class
     * implementing the chosen algorithm by the {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @param value
     *            The signature algorithm to use for this client, or null to use the default.
     */
    public void setSignerOverride(final String value) {
        signerOverride = value;
    }

    /**
     * Sets the name of the signature algorithm to use for signing requests made by this client. If
     * not set or explicitly set to null, the client will choose a signature algorithm to use based
     * on a configuration file of supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature algorithm is being used, as
     * the defaults will be sufficient. This setting exists only so advanced users can opt in to
     * newer signature protocols which have not yet been made the default for a particular
     * service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an unsupported signature
     * algorithm will lead to authentication failures. Use me at your own risk, and only after
     * consulting the documentation for the service to ensure it actually does supports your chosen
     * algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a {@code Signer} class
     * implementing the chosen algorithm by the {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @param value
     *            The signature algorithm to use for this client, or null to use the default.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withSignerOverride(final String value) {
        setSignerOverride(value);
        return this;
    }

    /**
     * Returns whether to attempt to authenticate preemptively against proxy servers using basic
     * authentication
     *
     * @return Whether to authenticate preemptively against proxy server.
     */
    public boolean isPreemptiveBasicProxyAuth() {
        return preemptiveBasicProxyAuth;
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy servers using basic
     * authentication
     *
     * @param preemptiveBasicProxyAuth
     *            Whether to authenticate preemptively against proxy server.
     */
    public void setPreemptiveBasicProxyAuth(Boolean preemptiveBasicProxyAuth) {
        this.preemptiveBasicProxyAuth = preemptiveBasicProxyAuth;
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy servers using basic
     * authentication, and returns the updated ClientConfiguration object so that additional method
     * calls may be chained together.
     *
     * @param preemptiveBasicProxyAuth
     *            Whether to authenticate preemptively against proxy server.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withPreemptiveBasicProxyAuth(boolean preemptiveBasicProxyAuth) {
        setPreemptiveBasicProxyAuth(preemptiveBasicProxyAuth);
        return this;
    }

    /**
     * Returns the expiration time (in milliseconds) for a connection in the connection pool. When
     * retrieving a connection from the pool to make a request, the total time that the connection
     * has been open is compared against this value. Connections which have been open for longer are
     * discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
     * TTL) ensures that your application will quickly rotate over to new IP addresses when the
     * service begins announcing them through DNS, at the cost of having to re-establish new
     * connections more frequently.
     *
     * @return the connection TTL, in milliseconds
     */
    public long getConnectionTTL() {
        return connectionTTL;
    }

    /**
     * Sets the expiration time (in milliseconds) for a connection in the connection pool. When
     * retrieving a connection from the pool to make a request, the total time that the connection
     * has been open is compared against this value. Connections which have been open for longer are
     * discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
     * TTL) ensures that your application will quickly rotate over to new IP addresses when the
     * service begins announcing them through DNS, at the cost of having to re-establish new
     * connections more frequently.
     * <p>
     * By default, it is set to {@code -1], i.e. connections do not expire.
     *
     * @param connectionTTL
     *            the connection TTL, in milliseconds
     */
    public void setConnectionTTL(long connectionTTL) {
        this.connectionTTL = connectionTTL;
    }

    /**
     * Sets the expiration time (in milliseconds) for a connection in the connection pool. When
     * retrieving a connection from the pool to make a request, the total time that the connection
     * has been open is compared against this value. Connections which have been open for longer are
     * discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
     * TTL) ensures that your application will quickly rotate over to new IP addresses when the
     * service begins announcing them through DNS, at the cost of having to re-establish new
     * connections more frequently.
     * <p>
     * By default, it is set to {@code -1}, i.e. connections do not expire.
     *
     * @param connectionTTL
     *            the connection TTL, in milliseconds
     * @return the updated ClientConfiguration object
     */
    public ClientConfiguration withConnectionTTL(long connectionTTL) {
        setConnectionTTL(connectionTTL);
        return this;
    }

    /**
     * Returns the maximum amount of time that an idle connection may sit in the connection pool and
     * still be eligible for reuse. When retrieving a connection from the pool to make a request,
     * the amount of time the connection has been idle is compared against this value. Connections
     * which have been idle for longer are discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down reduces the likelihood of a race condition (wherein you begin
     * sending a request down a connection which appears to be healthy, but before it arrives the
     * service decides the connection has been idle for too long and closes it) at the cost of
     * having to re-establish new connections more frequently.
     *
     * @return the connection maximum idle time, in milliseconds
     */
    public long getConnectionMaxIdleMillis() {
        return connectionMaxIdleMillis;
    }

    /**
     * Sets the maximum amount of time that an idle connection may sit in the connection pool and
     * still be eligible for reuse. When retrieving a connection from the pool to make a request,
     * the amount of time the connection has been idle is compared against this value. Connections
     * which have been idle for longer are discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down reduces the likelihood of a race condition (wherein you begin
     * sending a request down a connection which appears to be healthy, but before it arrives the
     * service decides the connection has been idle for too long and closes it) at the cost of
     * having to re-establish new connections more frequently.
     * <p>
     * By default, it is set to one minute (60000ms).
     *
     * @param connectionMaxIdleMillis
     *            the connection maximum idle time, in milliseconds
     */
    public void setConnectionMaxIdleMillis(long connectionMaxIdleMillis) {
        this.connectionMaxIdleMillis = connectionMaxIdleMillis;
    }

    /**
     * Sets the maximum amount of time that an idle connection may sit in the connection pool and
     * still be eligible for reuse. When retrieving a connection from the pool to make a request,
     * the amount of time the connection has been idle is compared against this value. Connections
     * which have been idle for longer are discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down reduces the likelihood of a race condition (wherein you begin
     * sending a request down a connection which appears to be healthy, but before it arrives the
     * service decides the connection has been idle for too long and closes it) at the cost of
     * having to re-establish new connections more frequently.
     * <p>
     * By default, it is set to one minute (60000ms).
     *
     * @param connectionMaxIdleMillis
     *            the connection maximum idle time, in milliseconds
     * @return the updated ClientConfiguration object
     */
    public ClientConfiguration withConnectionMaxIdleMillis(long connectionMaxIdleMillis) {

        setConnectionMaxIdleMillis(connectionMaxIdleMillis);
        return this;
    }

    /**
     * Returns the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be
     * validated to ensure it's still open. This "stale connection check" adds a small bit of overhead to validate the
     * connection. Setting this value to larger values may increase the likelihood that the connection is not usable, potentially
     * resulting in a {@link org.apache.http.NoHttpResponseException}. Lowering this setting increases the overhead when leasing
     * connections from the connection pool. It is recommended to tune this setting based on how long a service allows a
     * connection to be idle before closing.
     *
     * <p>A non positive value disables validation of connections.</p>
     *
     * <p>The default value is {@value #DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS} milliseconds.</p>
     */
    public int getValidateAfterInactivityMillis() {
        return validateAfterInactivityMillis;
    }

    /**
     * Sets the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be validated
     * to ensure it's still open. This "stale connection check" adds a small bit of overhead to validate the connection. Setting
     * this value to larger values may increase the likelihood that the connection is not usable, potentially resulting in a
     * {@link org.apache.http.NoHttpResponseException}. Lowering this setting increases the overhead when leasing connections
     * from the connection pool. It is recommended to tune this setting based on how long a service allows a connection to be
     * idle before closing.
     *
     * <p>A non positive value disables validation of connections.</p>
     *
     * <p>The default value is {@value #DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS} milliseconds.</p>
     *
     * @param validateAfterInactivityMillis The allowed time, in milliseconds, a connection can be idle before it must be
     *                                      re-validated.
     */
    public void setValidateAfterInactivityMillis(int validateAfterInactivityMillis) {
        this.validateAfterInactivityMillis = validateAfterInactivityMillis;
    }

    /**
     * Sets the amount of time (in milliseconds) that a connection can be idle in the connection pool before it must be validated
     * to ensure it's still open. This "stale connection check" adds a small bit of overhead to validate the connection. Setting
     * this value to larger values may increase the likelihood that the connection is not usable, potentially resulting in a
     * {@link org.apache.http.NoHttpResponseException}. Lowering this setting increases the overhead when leasing connections
     * from the connection pool. It is recommended to tune this setting based on how long a service allows a connection to be
     * idle before closing.
     *
     * <p>A non positive value disables validation of connections.</p>
     *
     * <p>The default value is {@value #DEFAULT_VALIDATE_AFTER_INACTIVITY_MILLIS} milliseconds.</p>
     *
     * @param validateAfterInactivityMillis The allowed time, in milliseconds, a connection can be idle before it must be
     *                                      re-validated.
     * @return The updated {@link ClientConfiguration} object.
     */
    public ClientConfiguration withValidateAfterInactivityMillis(int validateAfterInactivityMillis) {
        setValidateAfterInactivityMillis(validateAfterInactivityMillis);
        return this;
    }

    /**
     * Returns whether or not TCP KeepAlive support is enabled.
     */
    public boolean useTcpKeepAlive() {
        return tcpKeepAlive;
    }

    /**
     * Sets whether or not to enable TCP KeepAlive support at the socket level.
     */
    public void setUseTcpKeepAlive(final boolean use) {
        this.tcpKeepAlive = use;
    }

    /**
     * Sets whether or not to enable TCP KeepAlive support at the socket level.
     *
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withTcpKeepAlive(final boolean use) {
        setUseTcpKeepAlive(use);
        return this;
    }

    /**
     * Returns the DnsResolver for resolving AWS IP addresses.
     * Returns the {@link SystemDefaultDnsResolver} by default if not
     * explicitly configured by the user.
     */
    public DnsResolver getDnsResolver() {
        return dnsResolver;
    }

    /**
     * Sets the DNS Resolver that should be used to for resolving AWS IP addresses.
     */
    public void setDnsResolver(final DnsResolver resolver) {
        if (resolver == null) {
            throw new IllegalArgumentException("resolver cannot be null");
        }
        this.dnsResolver = resolver;
    }

    /**
     * Sets the DNS Resolver that should be used to for resolving AWS IP addresses.
     *
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withDnsResolver(final DnsResolver resolver) {
        setDnsResolver(resolver);
        return this;
    }

    /**
     * Returns whether or not to cache response metadata.
     * <p>
     * Response metadata is typically used for troubleshooting issues with AWS support staff when
     * services aren't acting as expected.
     * </p>
     * <p>
     * While this feature is useful for debugging it adds overhead and disabling it may
     * be desired in high throughput applications.
     * </p>
     *
     * @return true if response metadata will be cached
     */
    public boolean getCacheResponseMetadata() { return cacheResponseMetadata; }

    /**
     * Sets whether or not to cache response metadata.
     * <p>
     * Response metadata is typically used for troubleshooting issues with AWS support staff when
     * services aren't acting as expected.
     * </p>
     * <p>
     * While this feature is useful for debugging it adds overhead and disabling it may
     * be desired in high throughput applications.
     * </p>
     *
     * @param shouldCache true if response metadata should be cached
     */
    public void setCacheResponseMetadata(boolean shouldCache) {
        this.cacheResponseMetadata = shouldCache;
    }

    /**
     * Sets whether or not to cache response metadata.
     * <p>
     * Response metadata is typically used for troubleshooting issues with AWS support staff when
     * services aren't acting as expected.
     * </p>
     * <p>
     * While this feature is useful for debugging it adds overhead and disabling it may
     * be desired in high throughput applications.
     * </p>
     *
     * @param shouldCache true if response metadata should be cached
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withCacheResponseMetadata(final boolean shouldCache) {
        setCacheResponseMetadata(shouldCache);
        return this;
    }

    /**
     * Returns the response metadata cache size.
     */
    public int getResponseMetadataCacheSize() {
        return responseMetadataCacheSize;
    }

    /**
     * Sets the response metadata cache size. By default, it is set to
     * {@value #DEFAULT_RESPONSE_METADATA_CACHE_SIZE}.
     *
     * @param responseMetadataCacheSize
     *            maximum cache size.
     */
    public void setResponseMetadataCacheSize(int responseMetadataCacheSize) {
        this.responseMetadataCacheSize = responseMetadataCacheSize;
    }

    /**
     * Sets the response metadata cache size. By default, it is set to
     * {@value #DEFAULT_RESPONSE_METADATA_CACHE_SIZE}.
     *
     * @param responseMetadataCacheSize
     *            maximum cache size.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withResponseMetadataCacheSize(int responseMetadataCacheSize) {
        setResponseMetadataCacheSize(responseMetadataCacheSize);
        return this;
    }

    /**
     * Returns a non-null object that can be used to specify Apache HTTP client specific custom
     * configurations.
     */
    public ApacheHttpClientConfig getApacheHttpClientConfig() {
        return apacheHttpClientConfig;
    }

    /**
     * Returns the instance of {@link SecureRandom} configured by the user; or the JDK default if it
     * is null.
     *
     * @return a non-null instance of SecureRandom.
     */
    public SecureRandom getSecureRandom() {
        if (secureRandom == null)
            secureRandom = new SecureRandom();
        return secureRandom;
    }

    /**
     * Sets an instance of {@link SecureRandom} to be used by the SDK.
     */
    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    /**
     * Fluent API for {@link #setSecureRandom(SecureRandom)}.
     */
    public ClientConfiguration withSecureRandom(SecureRandom secureRandom) {
        setSecureRandom(secureRandom);
        return this;
    }

    /**
     * Returns the use expect continue flag
     */
    public boolean isUseExpectContinue() {
        return useExpectContinue;
    }

    /**
     * Sets if use expect continue should be enabled. By default, it is set to
     * {@value #DEFAULT_USE_EXPECT_CONTINUE}.
     *
     * @param useExpectContinue
     *            use expect continue HTTP/1.1 header.
     */
    public void setUseExpectContinue(boolean useExpectContinue) {
        this.useExpectContinue = useExpectContinue;
    }

    /**
     * Sets if use expect continue should be enabled. By default, it is set to
     * {@value #DEFAULT_USE_EXPECT_CONTINUE}.
     *
     * @param useExpectContinue
     *            use expect continue HTTP/1.1 header.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withUseExpectContinue(boolean useExpectContinue) {
        setUseExpectContinue(useExpectContinue);

        return this;
    }

    /**
     * Adds a header to be added on all requests and returns the {@link ClientConfiguration} object
     *
     * @param name
     *            the name of the header
     * @param value
     *            the value of the header
     *
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withHeader(String name, String value) {
        addHeader(name, value);
        return this;
    }

    /**
     * Adds a header to be added on all requests
     *
     * @param name
     *            the name of the header
     * @param value
     *            the value of the header
     */
    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    /**
     * Returns headers to be added to all requests
     *
     * @return headers to be added to all requests
     */
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    /**
     * Returns the boolean value to indicate if the host prefix injection is disabled or not.
     *
     * The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
     * the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.
     */
    public boolean isDisableHostPrefixInjection() {
        return disableHostPrefixInjection;
    }

    /**
     * Sets the configuration option to disable the host prefix injection.
     *
     * The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
     * the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.
     */
    public void setDisableHostPrefixInjection(boolean disableHostPrefixInjection) {
        this.disableHostPrefixInjection = disableHostPrefixInjection;
    }

    /**
     * Sets the configuration option to disable the host prefix injection.
     *
     * The hostPrefix template is specified in the service model and is used by the SDK to modify the endpoint
     * the request is sent to. Host prefix injection is enabled by default. This option can be set to disable the behavior.
     */
    public ClientConfiguration withDisableHostPrefixInjection(boolean disableHostPrefixInjection) {
        setDisableHostPrefixInjection(disableHostPrefixInjection);
        return this;
    }
}
