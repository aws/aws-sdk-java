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
 * Specifies configuration for replication between a source and target Kafka cluster (sourceKafkaClusterAlias ->
 * targetKafkaClusterAlias)
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ReplicationInfoDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationInfoDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration relating to consumer group replication.
     * </p>
     */
    private ConsumerGroupReplication consumerGroupReplication;
    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     */
    private String sourceKafkaClusterAlias;
    /**
     * <p>
     * The compression type to use when producing records to target cluster.
     * </p>
     */
    private String targetCompressionType;
    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     */
    private String targetKafkaClusterAlias;
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

    public ReplicationInfoDescription withConsumerGroupReplication(ConsumerGroupReplication consumerGroupReplication) {
        setConsumerGroupReplication(consumerGroupReplication);
        return this;
    }

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterAlias
     *        The alias of the source Kafka cluster.
     */

    public void setSourceKafkaClusterAlias(String sourceKafkaClusterAlias) {
        this.sourceKafkaClusterAlias = sourceKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @return The alias of the source Kafka cluster.
     */

    public String getSourceKafkaClusterAlias() {
        return this.sourceKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the source Kafka cluster.
     * </p>
     * 
     * @param sourceKafkaClusterAlias
     *        The alias of the source Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfoDescription withSourceKafkaClusterAlias(String sourceKafkaClusterAlias) {
        setSourceKafkaClusterAlias(sourceKafkaClusterAlias);
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

    public ReplicationInfoDescription withTargetCompressionType(String targetCompressionType) {
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

    public ReplicationInfoDescription withTargetCompressionType(TargetCompressionType targetCompressionType) {
        this.targetCompressionType = targetCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterAlias
     *        The alias of the target Kafka cluster.
     */

    public void setTargetKafkaClusterAlias(String targetKafkaClusterAlias) {
        this.targetKafkaClusterAlias = targetKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @return The alias of the target Kafka cluster.
     */

    public String getTargetKafkaClusterAlias() {
        return this.targetKafkaClusterAlias;
    }

    /**
     * <p>
     * The alias of the target Kafka cluster.
     * </p>
     * 
     * @param targetKafkaClusterAlias
     *        The alias of the target Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInfoDescription withTargetKafkaClusterAlias(String targetKafkaClusterAlias) {
        setTargetKafkaClusterAlias(targetKafkaClusterAlias);
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

    public ReplicationInfoDescription withTopicReplication(TopicReplication topicReplication) {
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
        if (getSourceKafkaClusterAlias() != null)
            sb.append("SourceKafkaClusterAlias: ").append(getSourceKafkaClusterAlias()).append(",");
        if (getTargetCompressionType() != null)
            sb.append("TargetCompressionType: ").append(getTargetCompressionType()).append(",");
        if (getTargetKafkaClusterAlias() != null)
            sb.append("TargetKafkaClusterAlias: ").append(getTargetKafkaClusterAlias()).append(",");
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

        if (obj instanceof ReplicationInfoDescription == false)
            return false;
        ReplicationInfoDescription other = (ReplicationInfoDescription) obj;
        if (other.getConsumerGroupReplication() == null ^ this.getConsumerGroupReplication() == null)
            return false;
        if (other.getConsumerGroupReplication() != null && other.getConsumerGroupReplication().equals(this.getConsumerGroupReplication()) == false)
            return false;
        if (other.getSourceKafkaClusterAlias() == null ^ this.getSourceKafkaClusterAlias() == null)
            return false;
        if (other.getSourceKafkaClusterAlias() != null && other.getSourceKafkaClusterAlias().equals(this.getSourceKafkaClusterAlias()) == false)
            return false;
        if (other.getTargetCompressionType() == null ^ this.getTargetCompressionType() == null)
            return false;
        if (other.getTargetCompressionType() != null && other.getTargetCompressionType().equals(this.getTargetCompressionType()) == false)
            return false;
        if (other.getTargetKafkaClusterAlias() == null ^ this.getTargetKafkaClusterAlias() == null)
            return false;
        if (other.getTargetKafkaClusterAlias() != null && other.getTargetKafkaClusterAlias().equals(this.getTargetKafkaClusterAlias()) == false)
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
        hashCode = prime * hashCode + ((getSourceKafkaClusterAlias() == null) ? 0 : getSourceKafkaClusterAlias().hashCode());
        hashCode = prime * hashCode + ((getTargetCompressionType() == null) ? 0 : getTargetCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTargetKafkaClusterAlias() == null) ? 0 : getTargetKafkaClusterAlias().hashCode());
        hashCode = prime * hashCode + ((getTopicReplication() == null) ? 0 : getTopicReplication().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationInfoDescription clone() {
        try {
            return (ReplicationInfoDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ReplicationInfoDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
