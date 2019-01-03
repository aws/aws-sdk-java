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

import java.util.Date;

/**
 * Base class for SNS message types.
 */
public abstract class SnsMessage {

    private final String messageId;
    private final String topicArn;
    private final Date timestamp;

    SnsMessage(Builder builder) {
        this.messageId = builder.messageId;
        this.topicArn = builder.topicArn;
        this.timestamp = builder.timestamp;
    }

    /**
     * @return A Universally Unique Identifier, unique for each message published. For a notification that Amazon SNS re-sends during a
     * retry, the message ID of the original message is used.
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @return The Amazon Resource Name (ARN) for the topic that this message was published to.
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * @return The time (GMT) when the notification was published.
     */
    public Date getTimestamp() {
        return new Date(timestamp.getTime());
    }

    /**
     * Calls the appropriate 'handle' method on {@link SnsMessageHandler} depending on the subtype.
     *
     * @param handler Handler to deliver message to.
     */
    public abstract void handle(SnsMessageHandler handler);

    /**
     * Builder base class.
     *
     * @param <SubclassT> Subclass for fluent method returns.
     */
    abstract static class Builder<SubclassT extends Builder> {

        private String messageId;
        private String topicArn;
        private Date timestamp;

        public SubclassT withMessageId(String messageId) {
            this.messageId = messageId;
            return getSubclass();
        }

        public SubclassT withTopicArn(String topicArn) {
            this.topicArn = topicArn;
            return getSubclass();
        }

        public SubclassT withTimestamp(Date timestamp) {
            this.timestamp = timestamp;
            return getSubclass();
        }

        /**
         * Builds a concrete {@link SnsMessage} from the current configuration.
         *
         * @return Instance of {@link SnsMessage} subtype.
         */
        public abstract SnsMessage build();

        @SuppressWarnings("unchecked")
        private SubclassT getSubclass() {
            return (SubclassT) this;
        }
    }
}
