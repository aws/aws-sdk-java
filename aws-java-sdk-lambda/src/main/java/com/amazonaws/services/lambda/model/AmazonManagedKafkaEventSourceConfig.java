/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK) event source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AmazonManagedKafkaEventSourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedKafkaEventSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka
     * event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot
     * update this value. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id">Customizable
     * consumer group ID</a>.
     * </p>
     */
    private String consumerGroupId;

    /**
     * <p>
     * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka
     * event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot
     * update this value. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id">Customizable
     * consumer group ID</a>.
     * </p>
     * 
     * @param consumerGroupId
     *        The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your
     *        Kafka event sources. After creating a Kafka event source mapping with the consumer group ID specified, you
     *        cannot update this value. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id"
     *        >Customizable consumer group ID</a>.
     */

    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    /**
     * <p>
     * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka
     * event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot
     * update this value. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id">Customizable
     * consumer group ID</a>.
     * </p>
     * 
     * @return The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your
     *         Kafka event sources. After creating a Kafka event source mapping with the consumer group ID specified,
     *         you cannot update this value. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id"
     *         >Customizable consumer group ID</a>.
     */

    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * <p>
     * The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your Kafka
     * event sources. After creating a Kafka event source mapping with the consumer group ID specified, you cannot
     * update this value. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id">Customizable
     * consumer group ID</a>.
     * </p>
     * 
     * @param consumerGroupId
     *        The identifier for the Kafka consumer group to join. The consumer group ID must be unique among all your
     *        Kafka event sources. After creating a Kafka event source mapping with the consumer group ID specified, you
     *        cannot update this value. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id"
     *        >Customizable consumer group ID</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonManagedKafkaEventSourceConfig withConsumerGroupId(String consumerGroupId) {
        setConsumerGroupId(consumerGroupId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConsumerGroupId() != null)
            sb.append("ConsumerGroupId: ").append(getConsumerGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonManagedKafkaEventSourceConfig == false)
            return false;
        AmazonManagedKafkaEventSourceConfig other = (AmazonManagedKafkaEventSourceConfig) obj;
        if (other.getConsumerGroupId() == null ^ this.getConsumerGroupId() == null)
            return false;
        if (other.getConsumerGroupId() != null && other.getConsumerGroupId().equals(this.getConsumerGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerGroupId() == null) ? 0 : getConsumerGroupId().hashCode());
        return hashCode;
    }

    @Override
    public AmazonManagedKafkaEventSourceConfig clone() {
        try {
            return (AmazonManagedKafkaEventSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.AmazonManagedKafkaEventSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
