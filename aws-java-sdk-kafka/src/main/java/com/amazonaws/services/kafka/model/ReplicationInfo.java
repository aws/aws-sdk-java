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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration for replication between a source and target Kafka cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ReplicationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration relating to consumer group replication.
     * </p>
     */
    private ConsumerGroupReplication consumerGroupReplication;
    /**
     * <p>
     * The ARN of the source Kafka cluster.
     * </p>
     */
    private String sourceKafkaClusterArn;
    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     */
    private String targetCompressionType;
    /**
     * <p>
     * The ARN of the target Kafka cluster.
     * </p>
     */
    private String targetKafkaClusterArn;
    /**
     * <p>
     * Configuration relating to topic replication.
     * </p>
     */
    private TopicReplication topicReplication;

    /**
     * <p>
     * Configuration relating to consumer group replication.
     * </p>
     * 
     * @param consumerGroupReplication
     *        Configuration relating to consumer group replication.
     */

    public void setConsumerGroupReplication(ConsumerGroupReplication consumerGroupReplication) {
        this.consumerGroupReplication = consumerGroupReplication;
    }

    /**
     * <p>
     * Configuration relating to consumer group replication.
     * </p>
     * 
     * @return Configuration relating to consumer group replication.
     */

    public ConsumerGroupReplication getConsumerGroupReplication() {
        return this.consumerGroupReplication;
    }

    /**
     * <p>
     * Configuration relating to consumer group replication.
     * </p>
     * 
     * @param consumerGroupReplication
     *        Configuration relating to consumer group replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfo withConsumerGroupReplication(ConsumerGroupReplication consumerGroupReplication) {
        setConsumerGroupReplication(consumerGroupReplication);
        return this;
    }

    /**
     * <p>
     * The ARN of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterArn
     *        The ARN of the source Kafka cluster.
     */

    public void setSourceKafkaClusterArn(String sourceKafkaClusterArn) {
        this.sourceKafkaClusterArn = sourceKafkaClusterArn;
    }

    /**
     * <p>
     * The ARN of the source Kafka cluster.
     * </p>
     * 
     * @return The ARN of the source Kafka cluster.
     */

    public String getSourceKafkaClusterArn() {
        return this.sourceKafkaClusterArn;
    }

    /**
     * <p>
     * The ARN of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterArn
     *        The ARN of the source Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfo withSourceKafkaClusterArn(String sourceKafkaClusterArn) {
        setSourceKafkaClusterArn(sourceKafkaClusterArn);
        return this;
    }

    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     * 
     * @param targetCompressionType
     *        The compression type to use when producing records to target cluster.
     * @see TargetCompressionType
     */

    public void setTargetCompressionType(String targetCompressionType) {
        this.targetCompressionType = targetCompressionType;
    }

    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     * 
     * @return The compression type to use when producing records to target cluster.
     * @see TargetCompressionType
     */

    public String getTargetCompressionType() {
        return this.targetCompressionType;
    }

    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     * 
     * @param targetCompressionType
     *        The compression type to use when producing records to target cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetCompressionType
     */

    public ReplicationInfo withTargetCompressionType(String targetCompressionType) {
        setTargetCompressionType(targetCompressionType);
        return this;
    }

    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     * 
     * @param targetCompressionType
     *        The compression type to use when producing records to target cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetCompressionType
     */

    public ReplicationInfo withTargetCompressionType(TargetCompressionType targetCompressionType) {
        this.targetCompressionType = targetCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterArn
     *        The ARN of the target Kafka cluster.
     */

    public void setTargetKafkaClusterArn(String targetKafkaClusterArn) {
        this.targetKafkaClusterArn = targetKafkaClusterArn;
    }

    /**
     * <p>
     * The ARN of the target Kafka cluster.
     * </p>
     * 
     * @return The ARN of the target Kafka cluster.
     */

    public String getTargetKafkaClusterArn() {
        return this.targetKafkaClusterArn;
    }

    /**
     * <p>
     * The ARN of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterArn
     *        The ARN of the target Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfo withTargetKafkaClusterArn(String targetKafkaClusterArn) {
        setTargetKafkaClusterArn(targetKafkaClusterArn);
        return this;
    }

    /**
     * <p>
     * Configuration relating to topic replication.
     * </p>
     * 
     * @param topicReplication
     *        Configuration relating to topic replication.
     */

    public void setTopicReplication(TopicReplication topicReplication) {
        this.topicReplication = topicReplication;
    }

    /**
     * <p>
     * Configuration relating to topic replication.
     * </p>
     * 
     * @return Configuration relating to topic replication.
     */

    public TopicReplication getTopicReplication() {
        return this.topicReplication;
    }

    /**
     * <p>
     * Configuration relating to topic replication.
     * </p>
     * 
     * @param topicReplication
     *        Configuration relating to topic replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfo withTopicReplication(TopicReplication topicReplication) {
        setTopicReplication(topicReplication);
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
        if (getConsumerGroupReplication() != null)
            sb.append("ConsumerGroupReplication: ").append(getConsumerGroupReplication()).append(",");
        if (getSourceKafkaClusterArn() != null)
            sb.append("SourceKafkaClusterArn: ").append(getSourceKafkaClusterArn()).append(",");
        if (getTargetCompressionType() != null)
            sb.append("TargetCompressionType: ").append(getTargetCompressionType()).append(",");
        if (getTargetKafkaClusterArn() != null)
            sb.append("TargetKafkaClusterArn: ").append(getTargetKafkaClusterArn()).append(",");
        if (getTopicReplication() != null)
            sb.append("TopicReplication: ").append(getTopicReplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationInfo == false)
            return false;
        ReplicationInfo other = (ReplicationInfo) obj;
        if (other.getConsumerGroupReplication() == null ^ this.getConsumerGroupReplication() == null)
            return false;
        if (other.getConsumerGroupReplication() != null && other.getConsumerGroupReplication().equals(this.getConsumerGroupReplication()) == false)
            return false;
        if (other.getSourceKafkaClusterArn() == null ^ this.getSourceKafkaClusterArn() == null)
            return false;
        if (other.getSourceKafkaClusterArn() != null && other.getSourceKafkaClusterArn().equals(this.getSourceKafkaClusterArn()) == false)
            return false;
        if (other.getTargetCompressionType() == null ^ this.getTargetCompressionType() == null)
            return false;
        if (other.getTargetCompressionType() != null && other.getTargetCompressionType().equals(this.getTargetCompressionType()) == false)
            return false;
        if (other.getTargetKafkaClusterArn() == null ^ this.getTargetKafkaClusterArn() == null)
            return false;
        if (other.getTargetKafkaClusterArn() != null && other.getTargetKafkaClusterArn().equals(this.getTargetKafkaClusterArn()) == false)
            return false;
        if (other.getTopicReplication() == null ^ this.getTopicReplication() == null)
            return false;
        if (other.getTopicReplication() != null && other.getTopicReplication().equals(this.getTopicReplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerGroupReplication() == null) ? 0 : getConsumerGroupReplication().hashCode());
        hashCode = prime * hashCode + ((getSourceKafkaClusterArn() == null) ? 0 : getSourceKafkaClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTargetCompressionType() == null) ? 0 : getTargetCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTargetKafkaClusterArn() == null) ? 0 : getTargetKafkaClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTopicReplication() == null) ? 0 : getTopicReplication().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationInfo clone() {
        try {
            return (ReplicationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ReplicationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
