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
package com.amazonaws.monitoring;

import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_CLIENT_ID;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_PORT;
import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_AWS_CSM_HOST;

/**
 * Configuration for Client Side Monitoring.
 */
public final class CsmConfiguration {
    private final boolean enabled;
    private final String host;
    private final int port;
    private final String clientId;

    public CsmConfiguration(boolean enabled, int port, String clientId) {
        this.enabled = enabled;
        this.host = null;
        this.port = port;
        this.clientId = clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    private CsmConfiguration(Builder builder) {
        this.enabled = builder.enabled == null ? false : builder.enabled;
        this.host = builder.host == null ? DEFAULT_AWS_CSM_HOST : builder.host;
        this.port = builder.port == null ? DEFAULT_AWS_CSM_PORT : builder.port;
        this.clientId = builder.clientId == null ? DEFAULT_AWS_CSM_CLIENT_ID : builder.clientId;
    }

    /**
     * {@code true} if client side monitoring is enabled, {@code false}
     * otherwise.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * The host to send monitoring events to.
     */
    public String getHost() {
        return host;
    }

    /**
     * The port on the specified host to send monitoring events to.
     */
    public int getPort() {
        return port;
    }

    /**
     * The client ID to set on the monitoring events.
     */
    public String getClientId() {
        return clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CsmConfiguration that = (CsmConfiguration) o;

        if (enabled != that.enabled) return false;
        if (port != that.port) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        return clientId != null ? clientId.equals(that.clientId) : that.clientId == null;

    }

    @Override
    public int hashCode() {
        int result = (enabled ? 1 : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + port;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        return result;
    }

    public static class Builder {
        private Boolean enabled;
        private String host;
        private Integer port;
        private String clientId;

        private Builder() {

        }

        public Builder withEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder withHost(String host) {
            this.host = host;
            return this;
        }

        public Builder withPort(Integer port) {
            this.port = port;
            return this;
        }

        public CsmConfiguration build() {
            return new CsmConfiguration(this);
        }
    }
}
