/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.message;

/**
 * Represents a message type sent by SNS that this version of the SDK does not know about. Most implementations
 * should ignore this message or upgrade to a version of the SDK that supports it to handle the message.
 */
public final class SnsUnknownMessage extends SnsMessage {

    private SnsUnknownMessage(Builder builder) {
        super(builder);
    }

    /**
     * @return A {@link Builder} for {@link SnsUnknownMessage}.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void handle(SnsMessageHandler handler) {
        handler.handle(this);
    }

    /**
     * Builder for {@link SnsUnknownMessage}.
     */
    public static final class Builder extends SnsMessage.Builder<Builder> {

        private Builder() {
        }

        @Override
        public SnsMessage build() {
            return new SnsUnknownMessage(this);
        }
    }
}
