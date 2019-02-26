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

import com.amazonaws.http.IdleConnectionReaper;

import java.util.Optional;

/**
 * Configuration options for the client's http connections like max number of open HTTP connections,
 * connection expiration time etc.
 */
public class ConnectionConfiguration {

    private Integer maxConnections;
    private Long connectionTTL;
    private Long connectionMaxIdleMillis;
    private Boolean useReaper;

    /**
     * Returns an {@link Optional} that contains the maximum number of allowed open HTTP connections.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_MAX_CONNECTIONS}.
     * </p>
     *
     * @return The maximum number of allowed open HTTP connections.
     */
    public Optional<Integer> getMaxConnections() {
        return Optional.ofNullable(maxConnections);
    }

    /**
     * Sets the maximum number of allowed open HTTP connections.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_MAX_CONNECTIONS}.
     * </p>
     *
     * @param maxConnections The maximum number of allowed open HTTP connections.
     */
    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Sets the maximum number of allowed open HTTP connections.
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_MAX_CONNECTIONS}.
     * </p>
     *
     * @param maxConnections The maximum number of allowed open HTTP connections.
     * @return This object for method chaining.
     */
    public ConnectionConfiguration maxConnections(int maxConnections) {
        setMaxConnections(maxConnections);
        return this;
    }

    /**
     * Returns an {@link Optional} that contains the expiration time (in milliseconds) for a connection in the connection pool.
     * When retrieving a connection from the pool to make a request, the total time that the connection
     * has been open is compared against this value. Connections which have been open for longer are
     * discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down (together with an appropriately-low setting for Java's DNS cache
     * TTL) ensures that your application will quickly rotate over to new IP addresses when the
     * service begins announcing them through DNS, at the cost of having to re-establish new
     * connections more frequently.
     * </p>
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TTL}, which means connections do not expire.
     * </p>
     *
     * @return The connection TTL, in milliseconds.
     */
    public Optional<Long> getConnectionTTL() {
        return Optional.ofNullable(connectionTTL);
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
     * </p>
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TTL}, which means connections do not expire.
     * </p>
     *
     * @param connectionTTL The connection TTL, in milliseconds
     */
    public void setConnectionTTL(Long connectionTTL) {
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
     * </p>
     * <p>
     * Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_TTL}, which means connections do not expire.
     * </p>
     *
     * @param connectionTTL The connection TTL, in milliseconds
     * @return This object for method chaining.
     */
    public ConnectionConfiguration connectionTTL(long connectionTTL) {
        setConnectionTTL(connectionTTL);
        return this;
    }

    /**
     * Returns an {@link Optional} which contains the maximum amount of time that an idle connection may sit in the connection pool
     * and still be eligible for reuse. When retrieving a connection from the pool to make a request,
     * the amount of time the connection has been idle is compared against this value. Connections
     * which have been idle for longer are discarded, and if needed a new connection is created.
     * <p>
     * Tuning this setting down reduces the likelihood of a race condition (wherein you begin
     * sending a request down a connection which appears to be healthy, but before it arrives the
     * service decides the connection has been idle for too long and closes it) at the cost of
     * having to re-establish new connections more frequently.
     * </p>
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_MAX_IDLE_MILLIS}.</p>
     *
     * @return The connection maximum idle time, in milliseconds.
     */
    public Optional<Long> getConnectionMaxIdleMillis() {
        return Optional.ofNullable(connectionMaxIdleMillis);
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
     * </p>
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_MAX_IDLE_MILLIS}.</p>
     *
     * @param connectionMaxIdleMillis The connection maximum idle time, in milliseconds
     */
    public void setConnectionMaxIdleMillis(Long connectionMaxIdleMillis) {
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
     * </p>
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_CONNECTION_MAX_IDLE_MILLIS}.</p>
     *
     * @param connectionMaxIdleMillis The connection maximum idle time, in milliseconds
     * @return This object for method chaining.
     */
    public ConnectionConfiguration connectionMaxIdleMillis(long connectionMaxIdleMillis) {
        setConnectionMaxIdleMillis(connectionMaxIdleMillis);
        return this;
    }

    /**
     * Checks if the {@link IdleConnectionReaper} is to be started.
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_USE_REAPER}.</p>
     *
     * @return If the {@link IdleConnectionReaper} is to be started.
     */
    public Optional<Boolean> isUseReaper() {
        return Optional.ofNullable(useReaper);
    }

    /**
     * Sets whether the {@link IdleConnectionReaper} is to be started as a daemon thread.
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_USE_REAPER}.</p>
     *
     * @param useReaper The {@link IdleConnectionReaper} is to be started as a daemon thread
     */
    public void setUseReaper(Boolean useReaper) {
        this.useReaper = useReaper;
    }

    /**
     * Sets whether the {@link IdleConnectionReaper} is to be started as a daemon thread.
     * <p>Default value is {@value com.amazonaws.ClientConfiguration#DEFAULT_USE_REAPER}.</p>
     *
     * @param useReaper The {@link IdleConnectionReaper} is to be started as a daemon thread
     * @return This object for method chaining.
     */
    public ConnectionConfiguration useReaper(boolean useReaper) {
        setUseReaper(useReaper);
        return this;
    }

}
