/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.config;

import com.amazonaws.Protocol;

import java.util.Optional;

/**
 * Options to route the request through a proxy.
 */
public class ProxyConfiguration {

    private Protocol protocol;
    private String proxyHost;
    private Integer proxyPort;
    private String proxyUsername;
    private String proxyPassword;
    private String proxyDomain;
    private String proxyWorkstation;
    private String nonProxyHosts;
    private Boolean preemptiveBasicProxyAuth;

    /**
     * Returns the protocol (HTTP or HTTPS) to use when connecting through proxy.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * <p>
     *
     * @return The protocol to use when connecting through proxy.
     */
    public Optional<Protocol> getProtocol() {
        return Optional.ofNullable(protocol);
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting through proxy.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * </p>
     *
     * @param protocol The protocol to use when connecting through proxy.
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting through proxy.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased security.
     * </p>
     *
     * @param protocol The protocol to use when connecting through proxy.
     * @return This object for method chaining.
     */
    public ProxyConfiguration protocol(Protocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * Returns the optional proxy host the client will connect through.
     * Returns either the proxyHost set on this object, or if not provided,
     * checks the value of the Java system property for proxy host according to {@link #getProtocol()}:
     * i.e. if protocol is https, returns the value of the system property https.proxyHost,
     * otherwise returns value of http.proxyHost.
     *
     * @return The proxy host the client will connect through.
     */
    public Optional<String> getProxyHost() {
        return Optional.ofNullable(proxyHost);
    }

    /**
     * Sets the optional proxy host the client will connect through.
     *
     * @param proxyHost The proxy host the client will connect through.
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Sets the optional proxy host the client will connect through.
     *
     * @param proxyHost The proxy host the client will connect through.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyHost(String proxyHost) {
        setProxyHost(proxyHost);
        return this;
    }

    /**
     * Returns either the proxyPort set on this object, or
     * if not provided, checks the value of the Java system property
     * for proxy port according to {@link #getProtocol()}: i.e. if
     * protocol is https, returns the value of the system property
     * https.proxyPort, otherwise returns value of http.proxyPort.
     *
     * @return The proxy port the client will connect through.
     */
    public Optional<Integer> getProxyPort() {
        return Optional.ofNullable(proxyPort);
    }

    /**
     * Sets the proxy port the client will connect through.
     *
     * @param proxyPort The proxy port the client will connect through.
     */
    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Sets the proxy port the client will connect through.
     *
     * @param proxyPort The proxy port the client will connect through.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyPort(int proxyPort) {
        setProxyPort(proxyPort);
        return this;
    }

    /**
     * Returns the optional proxy user name to use if connecting
     * through a proxy.  Returns either the proxyUsername set on this
     * object, or if not provided, checks the value of the Java system
     * property for proxy user name according to {@link #getProtocol()}:
     * i.e. if protocol is https, returns the value of the system
     * property https.proxyUsername, otherwise returns value of
     * http.proxyUsername.
     *
     * @return The optional proxy user name the configured client will use if connecting through a
     *         proxy.
     */
    public Optional<String> getProxyUsername() {
        return Optional.ofNullable(proxyUsername);
    }

    /**
     * Sets the optional proxy user name to use if connecting through a proxy.
     *
     * @param proxyUsername The proxy user name to use if connecting through a proxy.
     */
    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    /**
     * Sets the optional proxy user name to use if connecting through a proxy.
     *
     * @param proxyUsername The proxy user name to use if connecting through a proxy.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyUsername(String proxyUsername) {
        setProxyUsername(proxyUsername);
        return this;
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
    public Optional<String> getProxyPassword() {
        return Optional.ofNullable(proxyPassword);
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy.
     *
     * @param proxyPassword The password to use when connecting through a proxy.
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy.
     *
     * @param proxyPassword The password to use when connecting through a proxy.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyPassword(String proxyPassword) {
        setProxyPassword(proxyPassword);
        return this;
    }

    /**
     *
     * Returns the optional Windows domain name for configuring an NTLM proxy. If you aren't using a
     * Windows NTLM proxy, you do not need to set this field.
     *
     * @return The optional Windows domain name for configuring an NTLM proxy.
     */
    public Optional<String> getProxyDomain() {
        return Optional.ofNullable(proxyDomain);
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy.
     * If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain The optional Windows domain name for configuring an NTLM proxy.
     */
    public void setProxyDomain(String proxyDomain) {
        this.proxyDomain = proxyDomain;
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy.
     * If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain The optional Windows domain name for configuring an NTLM proxy.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyDomain(String proxyDomain) {
        setProxyDomain(proxyDomain);
        return this;
    }

    /**
     * Returns the optional Windows workstation name for configuring NTLM proxy support. If you
     * aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @return The optional Windows workstation name for configuring NTLM proxy support.
     */
    public Optional<String> getProxyWorkstation() {
        return Optional.ofNullable(proxyWorkstation);
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy support.
     * If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyWorkstation The optional Windows workstation name for configuring NTLM proxy support.
     */
    public void setProxyWorkstation(String proxyWorkstation) {
        this.proxyWorkstation = proxyWorkstation;
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy support.
     * If you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyWorkstation The optional Windows workstation name for configuring NTLM proxy support.
     * @return This object for method chaining.
     */
    public ProxyConfiguration proxyWorkstation(String proxyWorkstation) {
        setProxyWorkstation(proxyWorkstation);
        return this;
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
    public Optional<String> getNonProxyHosts() {
        return Optional.ofNullable(nonProxyHosts);
    }

    /**
     * Set the optional hosts the client will access without going
     * through the proxy.
     *
     * @param nonProxyHosts The hosts the client will access without going through the proxy.
     */
    public void setNonProxyHosts(String nonProxyHosts) {
        this.nonProxyHosts = nonProxyHosts;
    }

    /**
     * Set the optional hosts the client will access without going
     * through the proxy.
     *
     * @param nonProxyHosts The hosts the client will access without going through the proxy.
     * @return This object for method chaining.
     */
    public ProxyConfiguration nonProxyHosts(String nonProxyHosts) {
        setNonProxyHosts(nonProxyHosts);
        return this;
    }

    /**
     * Returns whether to attempt to authenticate preemptively against proxy servers using basic
     * authentication.
     *
     * @return Whether to authenticate preemptively against proxy server.
     */
    public Optional<Boolean> isPreemptiveBasicProxyAuth() {
        return Optional.ofNullable(preemptiveBasicProxyAuth);
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy servers using basic authentication.
     *
     * @param preemptiveBasicProxyAuth Whether to authenticate preemptively against proxy server.
     */
    public void setPreemptiveBasicProxyAuth(Boolean preemptiveBasicProxyAuth) {
        this.preemptiveBasicProxyAuth = preemptiveBasicProxyAuth;
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy servers using basic authentication.
     *
     * @param preemptiveBasicProxyAuth Whether to authenticate preemptively against proxy server.
     * @return This object for method chaining.
     */
    public ProxyConfiguration preemptiveBasicProxyAuth(boolean preemptiveBasicProxyAuth) {
        setPreemptiveBasicProxyAuth(preemptiveBasicProxyAuth);
        return this;
    }

}
