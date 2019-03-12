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

import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.routing.HttpRoutePlanner;

/**
 * Used for Apache HTTP client specific custom configurations.
 */
@NotThreadSafe
public final class ApacheHttpClientConfig {
    private ConnectionSocketFactory sslSocketFactory;
    private HttpRoutePlanner routePlanner;

    ApacheHttpClientConfig() {}

    ApacheHttpClientConfig(ApacheHttpClientConfig that) {
        this.sslSocketFactory = that.sslSocketFactory;
        this.routePlanner = that.routePlanner;
    }

    /**
     * Returns a custom Apache HTTP client specific SSL socket factory; 
     * or null if there is none.
     */
    public ConnectionSocketFactory getSslSocketFactory() {
        return sslSocketFactory;
    }

    /**
     * Sets a custom Apache HTTP client specific SSL socket factory.
     * 
     * @param sslSocketFactory a custom Apache HTTP client specific SSL socket 
     * factory; or null if there is none.
     */
    public void setSslSocketFactory(ConnectionSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    /**
     * Fluent API for setting a custom Apache HTTP client specific SSL socket
     * factory.
     * 
     * @param sslSocketFactory a custom Apache HTTP client specific SSL socket 
     * factory; or null if there is none.
     */
    public ApacheHttpClientConfig withSslSocketFactory(
            ConnectionSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
        return this;
    }

    /**
     * Returns a custom Apache HTTP client HttpRoutePlanner; 
     * or null if there is none.
     */
    public HttpRoutePlanner getRoutePlanner() {
        return routePlanner;
    }

    /**
     * Sets a custom Apache HTTP client specific HttpRoutePlanner.
     * 
     * @param routePlanner a custom Apache HTTP client specific HttpRoutePlanner;
     *  or null if there is none.
     */
    public void setRoutePlanner(HttpRoutePlanner routePlanner) {
        this.routePlanner = routePlanner;
    }

    /**
     * Fluent API for setting a custom Apache HTTP client specific HttpRoutePlanner.
     * 
     * @param routePlanner a custom Apache HTTP client specific HttpRoutePlanner; 
     * or null if there is none.
     */
    public ApacheHttpClientConfig withRoutePlanner(
            HttpRoutePlanner routePlanner) {
        this.routePlanner = routePlanner;
        return this;
    }
}