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
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.util.IOUtils;
import java.net.URL;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

/**
 * SNS notification message with a subject and message.
 */
public final class SnsNotification extends SnsMessage {

    private final HttpClient httpClient;
    private final String subject;
    private final String message;
    private final URL unsubscribeUrl;

    private SnsNotification(Builder builder) {
        super(builder);
        this.httpClient = builder.httpClient;
        this.subject = builder.subject;
        this.message = builder.message;
        this.unsubscribeUrl = Utils.createUrl(builder.unsubscribeUrl);
    }

    /**
     * @return The Subject parameter specified when the notification was published to the topic. Note that this is an optional
     * parameter. If no Subject was specified, then this will be null.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return The Message value specified when the notification was published to the topic.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return A URL that you can use to unsubscribe the endpoint from this topic. If you visit this URL, Amazon SNS unsubscribes
     * the endpoint and stops sending notifications to this endpoint.
     */
    public URL getUnsubscribeUrl() {
        return unsubscribeUrl;
    }

    @Override
    public void handle(SnsMessageHandler handler) {
        handler.handle(this);
    }

    /**
     * Unsubscribes this endpoint from the topic.
     */
    public void unsubscribeFromTopic() {
        try {
            HttpGet request = new HttpGet(unsubscribeUrl.toURI());
            HttpResponse response = httpClient.execute(request);
            if (!ApacheUtils.isRequestSuccessful(response)) {
                throw new SdkClientException(String.format("Could not unsubscribe from %s: %d %s.%n%s",
                                                           getTopicArn(),
                                                           response.getStatusLine().getStatusCode(),
                                                           response.getStatusLine().getReasonPhrase(),
                                                           IOUtils.toString(response.getEntity().getContent())));
            }
        } catch (Exception e) {
            throw new SdkClientException(e);
        }

    }

    /**
     * @return A {@link Builder} for creating instances of {@link SnsNotification}.
     */
    @SdkInternalApi
    static Builder builder(HttpClient httpClient) {
        return new Builder(httpClient);
    }

    /**
     * Builder for {@link SnsNotification} objects.
     */
    @SdkInternalApi
    static final class Builder extends SnsMessage.Builder<Builder> {

        private final HttpClient httpClient;
        private String subject;
        private String message;
        private String unsubscribeUrl;

        private Builder(HttpClient httpClient) {
            this.httpClient = httpClient;
        }

        public Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder withUnsubscribeUrl(String unsubscribeUrl) {
            this.unsubscribeUrl = unsubscribeUrl;
            return this;
        }

        public SnsNotification build() {
            return new SnsNotification(this);
        }
    }
}
