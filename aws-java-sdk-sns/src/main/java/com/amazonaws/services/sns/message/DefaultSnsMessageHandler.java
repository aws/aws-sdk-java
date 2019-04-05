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
 * Default handler that implements reasonable behavior for all message types except for {@link SnsNotification} (which must
 * be implemented in handlers that extend this class).
 */
public abstract class DefaultSnsMessageHandler extends SnsMessageHandler {

    /**
     * Confirms the subscription when message is received.
     *
     * @param message Message object.
     */
    @Override
    public void handle(SnsSubscriptionConfirmation message) {
        message.confirmSubscription();
    }

    /**
     * Does nothing by default. Users can override to re-subscribe or process.
     *
     * @param message Message object.
     */
    @Override
    public void handle(SnsUnsubscribeConfirmation message) {
    }

    /**
     * Does nothing by default. Users can override to process but it's not recommended to handle this message
     * type (instead upgrade to a version of the SDK that have first class support for the message type).
     *
     * @param message Message object.
     */
    @Override
    public void handle(SnsUnknownMessage message) {
    }
}
