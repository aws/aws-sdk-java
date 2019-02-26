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
 * Handler for the {@link SnsMessage} class hierarchy.
 */
public abstract class SnsMessageHandler {

    /**
     * Handles a {@link SnsNotification} message.
     *
     * @param message Message object.
     */
    public abstract void handle(SnsNotification message);

    /**
     * Handles a {@link SnsSubscriptionConfirmation} message.
     *
     * @param message Message object.
     */
    public abstract void handle(SnsSubscriptionConfirmation message);

    /**
     * Handles a {@link SnsUnsubscribeConfirmation} message.
     *
     * @param message Message object.
     */
    public abstract void handle(SnsUnsubscribeConfirmation message);

    /**
     * Handles a {@link SnsUnknownMessage} message.
     *
     * @param message Message object.
     */
    public abstract void handle(SnsUnknownMessage message);
}
