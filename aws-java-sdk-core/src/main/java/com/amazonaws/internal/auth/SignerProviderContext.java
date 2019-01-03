/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.internal.auth;

import com.amazonaws.Request;
import com.amazonaws.RequestConfig;

import java.net.URI;

public class SignerProviderContext {

    private final URI uri;
    private final boolean isRedirect;
    private final Request<?> request;
    private final RequestConfig requestConfig;

    private SignerProviderContext(Builder builder) {
        this.uri = builder.uri;
        this.isRedirect = builder.isRedirect;
        this.request = builder.request;
        this.requestConfig = builder.requestConfig;
    }

    public URI getUri() {
        return uri;
    }

    public boolean isRedirect() {
        return isRedirect;
    }

    public Request<?> getRequest() {
        return request;
    }

    public RequestConfig getRequestConfig() {
        return requestConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Builder() {
        }

        private URI uri;
        private boolean isRedirect;
        private Request<?> request;
        private RequestConfig requestConfig;

        public Builder withUri(final URI uri) {
            this.uri = uri;
            return this;
        }

        public Builder withIsRedirect(final boolean withIsRedirect) {
            this.isRedirect = withIsRedirect;
            return this;
        }

        public Builder withRequest(final Request<?> request) {
            this.request = request;
            return this;
        }

        public Builder withRequestConfig(final RequestConfig requestConfig) {
            this.requestConfig = requestConfig;
            return this;
        }

        public SignerProviderContext build() {
            return new SignerProviderContext(this);
        }

    }
}
