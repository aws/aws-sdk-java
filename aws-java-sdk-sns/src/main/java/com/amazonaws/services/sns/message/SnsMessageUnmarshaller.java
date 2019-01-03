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

import com.amazonaws.util.DateUtils;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;
import org.apache.http.client.HttpClient;

/**
 * Unmarshalls the JSON of an SNS message into the appropriate subclass of {@link SnsMessage}.
 */
final class SnsMessageUnmarshaller {

    // SNS message field names
    private static final String TYPE = "Type";
    private static final String MESSAGE_ID = "MessageId";
    private static final String TOPIC_ARN = "TopicArn";
    private static final String SUBJECT = "Subject";
    private static final String MESSAGE = "Message";
    private static final String TIMESTAMP = "Timestamp";
    private static final String SUBSCRIBE_URL = "SubscribeURL";
    private static final String UNSUBSCRIBE_URL = "UnsubscribeURL";
    private static final String TOKEN = "Token";

    // SNS message types
    private static final String TYPE_NOTIFICATION = "Notification";
    private static final String TYPE_SUBSCRIPTION_CONFIRMATION = "SubscriptionConfirmation";
    private static final String TYPE_UNSUBSCRIBE_CONFIRMATION = "UnsubscribeConfirmation";

    private final HttpClient client;

    SnsMessageUnmarshaller(HttpClient client) {
        this.client = client;
    }

    /**
     * Unmarshalls the given {@link JsonNode} into the appropriate sub type based on the {@link #TYPE}.
     *
     * @param rawMessage JSON message.
     * @return Unmarshalled message.
     */
    public SnsMessage unmarshall(JsonNode rawMessage) {
        SnsJsonNode message = new SnsJsonNode(rawMessage);
        return unmarshallBase(createSubMessage(message), message).build();
    }

    private SnsMessage.Builder<? extends SnsMessage.Builder> createSubMessage(SnsJsonNode message) {
        String type = message.getString(TYPE);
        if (TYPE_NOTIFICATION.equals(type)) {
            return unmarshallNotification(message);
        } else if (TYPE_SUBSCRIPTION_CONFIRMATION.equals(type)) {
            return unmarshallSubscriptionConfirmation(message);
        } else if (TYPE_UNSUBSCRIBE_CONFIRMATION.equals(type)) {
            return unmarshallUnsubscribeConfirmation(message);
        } else {
            return SnsUnknownMessage.builder();
        }
    }

    /**
     * Unmarshall into a {@link SnsUnsubscribeConfirmation} object.
     *
     * @param message JSON message.
     * @return Builder with sub properties filled in. Base properties are added by
     * {@link #unmarshallBase(SnsMessage.Builder, SnsJsonNode)}.
     */
    private SnsMessage.Builder<? extends SnsMessage.Builder> unmarshallUnsubscribeConfirmation(SnsJsonNode message) {
        return SnsUnsubscribeConfirmation.builder(client)
                                         .withMessage(message.getString(MESSAGE))
                                         .withSubscribeUrl(message.getString(SUBSCRIBE_URL))
                                         .withToken(message.getString(TOKEN));
    }

    /**
     * Unmarshall into a {@link SnsSubscriptionConfirmation} object.
     *
     * @param message JSON message.
     * @return Builder with sub properties filled in. Base properties are added by
     * {@link #unmarshallBase(SnsMessage.Builder, SnsJsonNode)}.
     */
    private SnsMessage.Builder<? extends SnsMessage.Builder> unmarshallSubscriptionConfirmation(SnsJsonNode message) {
        return SnsSubscriptionConfirmation.builder(client)
                                          .withSubscribeUrl(message.getString(SUBSCRIBE_URL))
                                          .withToken(message.getString(TOKEN))
                                          .withMessage(message.getString(MESSAGE));
    }

    /**
     * Unmarshall into a {@link SnsNotification} object.
     *
     * @param message JSON message.
     * @return Builder with sub properties filled in. Base properties are added by
     * {@link #unmarshallBase(SnsMessage.Builder, SnsJsonNode)}.
     */
    private SnsMessage.Builder<? extends SnsMessage.Builder> unmarshallNotification(SnsJsonNode message) {
        return SnsNotification.builder(client)
                              .withMessage(message.getString(MESSAGE))
                              .withSubject(message.getString(SUBJECT))
                              .withUnsubscribeUrl(message.getString(UNSUBSCRIBE_URL));
    }

    /**
     * Unmarshall the base properties of {@link SnsMessage}.
     *
     * @param builder Builder subclass to add base properties to.
     * @param message JSON message.
     * @return Modified builder with base properties added.
     */
    public SnsMessage.Builder<?> unmarshallBase(SnsMessage.Builder<?> builder, SnsJsonNode message) {
        return builder
            .withMessageId(message.getString(MESSAGE_ID))
            .withTopicArn(message.getString(TOPIC_ARN))
            .withTimestamp(message.getIso8601Date(TIMESTAMP));
    }

    /**
     * Small wrapper to provide convenient access to a {@link JsonNode} and some simple conversions.
     */
    private static final class SnsJsonNode {

        private final JsonNode source;

        private SnsJsonNode(JsonNode source) {
            this.source = source;
        }

        /**
         * Gets a ISO8601 date value from the JSON.
         *
         * @param fieldName Name of field to get.
         * @return Date object or null if not present.
         */
        private Date getIso8601Date(String fieldName) {
            String dateString = getString(fieldName);
            return dateString != null ? DateUtils.parseISO8601Date(dateString) : null;
        }

        /**
         * Get a string field from the JSON.
         *
         * @param fieldName Name of field to get.
         * @return String value or null if not present.
         */
        private String getString(String fieldName) {
            return source.has(fieldName) ? source.get(fieldName).asText() : null;
        }
    }
}
