/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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

import java.net.URI;

public class SignerProviderContext {

    private final URI uri;
    private final boolean isRedirect;

    private SignerProviderContext(Builder builder) {
        this.uri = builder.uri;
        this.isRedirect = builder.isRedirect;
    }

    public URI getUri() {
        return uri;
    }

    public boolean isRedirect() {
        return isRedirect;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {

        private Builder() {}

        private URI uri;
        private boolean isRedirect;

        public URI getUri() {
            return uri;
        }

        public void setUri(final URI uri) {
            this.uri = uri;
        }

        public Builder withUri(final URI uri) {
            setUri(uri);
            return this;
        }

        public boolean isRedirect() {
            return isRedirect;
        }

        public void setIsRedirect(final boolean isRedirect) {
            this.isRedirect = isRedirect;
        }

        public Builder withIsRedirect(final boolean withIsRedirect) {
            setIsRedirect(withIsRedirect);
            return this;
        }

        public SignerProviderContext build() {
            return new SignerProviderContext(this);
        }

    }
}
