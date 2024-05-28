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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Update information relating to replication between a given source and target Kafka cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateReplicationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updated consumer group replication information.
     * </p>
     */
    private ConsumerGroupReplicationUpdate consumerGroupReplication;
    /**
     * <p>
     * Current replicator version.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be updated.
     * </p>
     */
    private String replicatorArn;
    /**
     * <p>
     * The ARN of the source Kafka cluster.
     * </p>
     */
    private String sourceKafkaClusterArn;
    /**
     * <p>
     * The ARN of the target Kafka cluster.
     * </p>
     */
    private String targetKafkaClusterArn;
    /**
     * <p>
     * Updated topic replication information.
     * </p>
     */
    private TopicReplicationUpdate topicReplication;

    /**
     * <p>
     * Updated consumer group replication information.
     * </p>
     * 
     * @param consumerGroupReplication
     *        Updated consumer group replication information.
     */

    public void setConsumerGroupReplication(ConsumerGroupReplicationUpdate consumerGroupReplication) {
        this.consumerGroupReplication = consumerGroupReplication;
    }

    /**
     * <p>
     * Updated consumer group replication information.
     * </p>
     * 
     * @return Updated consumer group replication information.
     */

    public ConsumerGroupReplicationUpdate getConsumerGroupReplication() {
        return this.consumerGroupReplication;
    }

    /**
     * <p>
     * Updated consumer group replication information.
     * </p>
     * 
     * @param consumerGroupReplication
     *        Updated consumer group replication information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationInfoRequest withConsumerGroupReplication(ConsumerGroupReplicationUpdate consumerGroupReplication) {
        setConsumerGroupReplication(consumerGroupReplication);
        return this;
    }

    /**
     * <p>
     * Current replicator version.
     * </p>
     * 
     * @param currentVersion
     *        Current replicator version.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * Current replicator version.
     * </p>
     * 
     * @return Current replicator version.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * Current replicator version.
     * </p>
     * 
     * @param currentVersion
     *        Current replicator version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationInfoRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be updated.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be updated.
     */

    public void setReplicatorArn(String replicatorArn) {
        this.replicatorArn = replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator to be updated.
     */

    public String getReplicatorArn() {
        return this.replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be updated.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationInfoRequest withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
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

    public UpdateReplicationInfoRequest withSourceKafkaClusterArn(String sourceKafkaClusterArn) {
        setSourceKafkaClusterArn(sourceKafkaClusterArn);
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

    public UpdateReplicationInfoRequest withTargetKafkaClusterArn(String targetKafkaClusterArn) {
        setTargetKafkaClusterArn(targetKafkaClusterArn);
        return this;
    }

    /**
     * <p>
     * Updated topic replication information.
     * </p>
     * 
     * @param topicReplication
     *        Updated topic replication information.
     */

    public void setTopicReplication(TopicReplicationUpdate topicReplication) {
        this.topicReplication = topicReplication;
    }

    /**
     * <p>
     * Updated topic replication information.
     * </p>
     * 
     * @return Updated topic replication information.
     */

    public TopicReplicationUpdate getTopicReplication() {
        return this.topicReplication;
    }

    /**
     * <p>
     * Updated topic replication information.
     * </p>
     * 
     * @param topicReplication
     *        Updated topic replication information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationInfoRequest withTopicReplication(TopicReplicationUpdate topicReplication) {
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getReplicatorArn() != null)
            sb.append("ReplicatorArn: ").append(getReplicatorArn()).append(",");
        if (getSourceKafkaClusterArn() != null)
            sb.append("SourceKafkaClusterArn: ").append(getSourceKafkaClusterArn()).append(",");
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

        if (obj instanceof UpdateReplicationInfoRequest == false)
            return false;
        UpdateReplicationInfoRequest other = (UpdateReplicationInfoRequest) obj;
        if (other.getConsumerGroupReplication() == null ^ this.getConsumerGroupReplication() == null)
            return false;
        if (other.getConsumerGroupReplication() != null && other.getConsumerGroupReplication().equals(this.getConsumerGroupReplication()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        if (other.getSourceKafkaClusterArn() == null ^ this.getSourceKafkaClusterArn() == null)
            return false;
        if (other.getSourceKafkaClusterArn() != null && other.getSourceKafkaClusterArn().equals(this.getSourceKafkaClusterArn()) == false)
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
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        hashCode = prime * hashCode + ((getSourceKafkaClusterArn() == null) ? 0 : getSourceKafkaClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTargetKafkaClusterArn() == null) ? 0 : getTargetKafkaClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTopicReplication() == null) ? 0 : getTopicReplication().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationInfoRequest clone() {
        return (UpdateReplicationInfoRequest) super.clone();
    }

}
