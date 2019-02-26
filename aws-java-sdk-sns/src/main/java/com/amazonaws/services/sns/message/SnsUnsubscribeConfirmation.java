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

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.ConfirmSubscriptionRequest;
import com.amazonaws.services.sns.model.ConfirmSubscriptionResult;
import java.net.URL;
import org.apache.http.client.HttpClient;

/**
 * After an HTTP/HTTPS endpoint is unsubscribed from a topic, Amazon SNS sends an unsubscribe confirmation message to the
 * endpoint.
 */
public final class SnsUnsubscribeConfirmation extends SnsMessage {

    private final HttpClient httpClient;
    private final String message;
    private final URL subscribeUrl;
    private final String token;

    private SnsUnsubscribeConfirmation(Builder builder) {
        super(builder);
        this.httpClient = builder.httpClient;
        this.message = builder.message;
        this.subscribeUrl = Utils.createUrl(builder.subscribeUrl);
        this.token = builder.token;
    }

    /**
     * @return A string that describes the message. For unsubscribe confirmation, this string looks like this: <code>
     * You have chosen to deactivate subscription arn:aws:sns:us-east-1:123456789012:MyTopic:2bcfbf39-05c3-41de-beaa-fcfcc21c8f55.\nTo cancel this operation and restore the subscription, visit the SubscribeURL included in this message.
     * </code>
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return The {@link URL} that you must visit in order to re-confirm the subscription. Alternatively, you can instead use the
     * Token with the {@link AmazonSNS#confirmSubscription(ConfirmSubscriptionRequest)} action to re-confirm the subscription.
     */
    public URL getSubscribeUrl() {
        return subscribeUrl;
    }

    /**
     * @return A value you can use with the {@link AmazonSNS#confirmSubscription(ConfirmSubscriptionRequest)} action to re-confirm
     * the subscription. Alternatively, you can simply visit the SubscribeURL.
     */
    public String getToken() {
        return token;
    }

    @Override
    public void handle(SnsMessageHandler handler) {
        handler.handle(this);
    }

    /**
     * Will attempt to re-confirm the subscription by visiting the URL at {@link #getSubscribeUrl()}.
     *
     * @return ConfirmSubscriptionResult if confirmation was successful.
     * @throws SdkClientException if confirmation could not be confirmed.
     */
    public ConfirmSubscriptionResult reconfirmSubscription() {
        return Utils.confirmSubscription(httpClient, subscribeUrl.toExternalForm());
    }

    /**
     * @param httpClient {@link HttpClient} instance used to reconfirm the SNS subscription. See {@link #reconfirmSubscription()}.
     * @return A {@link Builder} for {@link SnsUnsubscribeConfirmation}.
     */
    public static Builder builder(HttpClient httpClient) {
        return new Builder(httpClient);
    }

    /**
     * Builder for {@link SnsUnsubscribeConfirmation}.
     */
    public static final class Builder extends SnsMessage.Builder<Builder> {

        private final HttpClient httpClient;
        private String message;
        private String subscribeUrl;
        private String token;

        private Builder(HttpClient httpClient) {
            this.httpClient = httpClient;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder withSubscribeUrl(String subscribeUrl) {
            this.subscribeUrl = subscribeUrl;
            return this;
        }

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }

        public SnsUnsubscribeConfirmation build() {
            return new SnsUnsubscribeConfirmation(this);
        }
    }
}
