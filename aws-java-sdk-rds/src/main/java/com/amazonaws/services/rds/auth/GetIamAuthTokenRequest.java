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
package com.amazonaws.services.rds.auth;

import static com.amazonaws.util.ValidationUtils.assertIsPositive;
import static com.amazonaws.util.ValidationUtils.assertStringNotEmpty;

/**
 * Request object to get an auth token for IAM database authentication.
 *
 * @see RdsIamAuthTokenGenerator
 */
public class GetIamAuthTokenRequest {

    private final String hostname;
    private final int port;
    private final String userName;

    public GetIamAuthTokenRequest(String hostname, int port, String userName) {
        this.hostname = assertStringNotEmpty(hostname, "hostname");
        this.port = assertIsPositive(port, "port");
        this.userName = assertStringNotEmpty(userName, "userName");
    }

    public String getHostname() {
        return hostname;
    }

    public int getPort() {
        return port;
    }

    public String getUserName() {
        return userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String hostname;
        private int port;
        private String userName;

        private Builder() {
        }

        public Builder hostname(String endpoint) {
            this.hostname = endpoint;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public GetIamAuthTokenRequest build() {
            return new GetIamAuthTokenRequest(hostname, port, userName);
        }
    }
}
