/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed Apache Kafka cluster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The Kafka message key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The Kafka message partition.
     * </p>
     */
    private String partition;
    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     */
    private java.util.Map<String, String> clientProperties;
    /**
     * <p>
     * The list of Kafka headers that you specify.
     * </p>
     */
    private java.util.List<KafkaActionHeader> headers;

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     * 
     * @return The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     * 
     * @param topic
     *        The Kafka topic for messages to be sent to the Kafka broker.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     * 
     * @return The Kafka topic for messages to be sent to the Kafka broker.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     * 
     * @param topic
     *        The Kafka topic for messages to be sent to the Kafka broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     * 
     * @param key
     *        The Kafka message key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     * 
     * @return The Kafka message key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     * 
     * @param key
     *        The Kafka message key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     * 
     * @param partition
     *        The Kafka message partition.
     */

    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     * 
     * @return The Kafka message partition.
     */

    public String getPartition() {
        return this.partition;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     * 
     * @param partition
     *        The Kafka message partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withPartition(String partition) {
        setPartition(partition);
        return this;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     * 
     * @return Properties of the Apache Kafka producer client.
     */

    public java.util.Map<String, String> getClientProperties() {
        return clientProperties;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     * 
     * @param clientProperties
     *        Properties of the Apache Kafka producer client.
     */

    public void setClientProperties(java.util.Map<String, String> clientProperties) {
        this.clientProperties = clientProperties;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     * 
     * @param clientProperties
     *        Properties of the Apache Kafka producer client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withClientProperties(java.util.Map<String, String> clientProperties) {
        setClientProperties(clientProperties);
        return this;
    }

    /**
     * Add a single ClientProperties entry
     *
     * @see KafkaAction#withClientProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction addClientPropertiesEntry(String key, String value) {
        if (null == this.clientProperties) {
            this.clientProperties = new java.util.HashMap<String, String>();
        }
        if (this.clientProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction clearClientPropertiesEntries() {
        this.clientProperties = null;
        return this;
    }

    /**
     * <p>
     * The list of Kafka headers that you specify.
     * </p>
     * 
     * @return The list of Kafka headers that you specify.
     */

    public java.util.List<KafkaActionHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The list of Kafka headers that you specify.
     * </p>
     * 
     * @param headers
     *        The list of Kafka headers that you specify.
     */

    public void setHeaders(java.util.Collection<KafkaActionHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<KafkaActionHeader>(headers);
    }

    /**
     * <p>
     * The list of Kafka headers that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        The list of Kafka headers that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withHeaders(KafkaActionHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<KafkaActionHeader>(headers.length));
        }
        for (KafkaActionHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Kafka headers that you specify.
     * </p>
     * 
     * @param headers
     *        The list of Kafka headers that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaAction withHeaders(java.util.Collection<KafkaActionHeader> headers) {
        setHeaders(headers);
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
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getClientProperties() != null)
            sb.append("ClientProperties: ").append(getClientProperties()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaAction == false)
            return false;
        KafkaAction other = (KafkaAction) obj;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getClientProperties() == null ^ this.getClientProperties() == null)
            return false;
        if (other.getClientProperties() != null && other.getClientProperties().equals(this.getClientProperties()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getClientProperties() == null) ? 0 : getClientProperties().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public KafkaAction clone() {
        try {
            return (KafkaAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.KafkaActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
