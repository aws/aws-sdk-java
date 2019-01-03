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

/**
 * Configuration for Client Side Monitoring.
 */
public final class CsmConfiguration {
    private final boolean enabled;
    private final int port;
    private final String clientId;

    public CsmConfiguration(boolean enabled, int port, String clientId) {
        this.enabled = enabled;
        this.port = port;
        this.clientId = clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    private CsmConfiguration(Builder builder) {
        this.enabled = builder.enabled == null ? false : builder.enabled;
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
     * The port of the out of process client side monitoring agent.
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CsmConfiguration other = (CsmConfiguration) o;

        if (enabled != other.enabled) {
            return false;
        }
        if (port != other.port) {
            return false;
        }
        return clientId != null ? clientId.equals(other.clientId) : other.clientId == null;
    }

    @Override
    public int hashCode() {
        int result = (enabled ? 1 : 0);
        result = 31 * result + port;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        return result;
    }

    public static class Builder {
        private Boolean enabled;
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

        public Builder withPort(Integer port) {
            this.port = port;
            return this;
        }

        public CsmConfiguration build() {
            return new CsmConfiguration(this);
        }
    }
}
