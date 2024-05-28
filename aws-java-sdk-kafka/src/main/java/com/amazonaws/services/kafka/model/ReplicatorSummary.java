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
 * Information about a replicator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ReplicatorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicatorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the replicator was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The current version of the replicator.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * Whether this resource is a replicator reference.
     * </p>
     */
    private Boolean isReplicatorReference;
    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     */
    private java.util.List<KafkaClusterSummary> kafkaClustersSummary;
    /**
     * <p>
     * A list of summarized information of replications between clusters.
     * </p>
     */
    private java.util.List<ReplicationInfoSummary> replicationInfoSummaryList;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     */
    private String replicatorArn;
    /**
     * <p>
     * The name of the replicator.
     * </p>
     */
    private String replicatorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     * </p>
     */
    private String replicatorResourceArn;
    /**
     * <p>
     * State of the replicator.
     * </p>
     */
    private String replicatorState;

    /**
     * <p>
     * The time the replicator was created.
     * </p>
     * 
     * @param creationTime
     *        The time the replicator was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the replicator was created.
     * </p>
     * 
     * @return The time the replicator was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the replicator was created.
     * </p>
     * 
     * @param creationTime
     *        The time the replicator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the replicator.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @return The current version of the replicator.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * Whether this resource is a replicator reference.
     * </p>
     * 
     * @param isReplicatorReference
     *        Whether this resource is a replicator reference.
     */

    public void setIsReplicatorReference(Boolean isReplicatorReference) {
        this.isReplicatorReference = isReplicatorReference;
    }

    /**
     * <p>
     * Whether this resource is a replicator reference.
     * </p>
     * 
     * @return Whether this resource is a replicator reference.
     */

    public Boolean getIsReplicatorReference() {
        return this.isReplicatorReference;
    }

    /**
     * <p>
     * Whether this resource is a replicator reference.
     * </p>
     * 
     * @param isReplicatorReference
     *        Whether this resource is a replicator reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withIsReplicatorReference(Boolean isReplicatorReference) {
        setIsReplicatorReference(isReplicatorReference);
        return this;
    }

    /**
     * <p>
     * Whether this resource is a replicator reference.
     * </p>
     * 
     * @return Whether this resource is a replicator reference.
     */

    public Boolean isReplicatorReference() {
        return this.isReplicatorReference;
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * 
     * @return Kafka Clusters used in setting up sources / targets for replication.
     */

    public java.util.List<KafkaClusterSummary> getKafkaClustersSummary() {
        return kafkaClustersSummary;
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClustersSummary
     *        Kafka Clusters used in setting up sources / targets for replication.
     */

    public void setKafkaClustersSummary(java.util.Collection<KafkaClusterSummary> kafkaClustersSummary) {
        if (kafkaClustersSummary == null) {
            this.kafkaClustersSummary = null;
            return;
        }

        this.kafkaClustersSummary = new java.util.ArrayList<KafkaClusterSummary>(kafkaClustersSummary);
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaClustersSummary(java.util.Collection)} or {@link #withKafkaClustersSummary(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param kafkaClustersSummary
     *        Kafka Clusters used in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withKafkaClustersSummary(KafkaClusterSummary... kafkaClustersSummary) {
        if (this.kafkaClustersSummary == null) {
            setKafkaClustersSummary(new java.util.ArrayList<KafkaClusterSummary>(kafkaClustersSummary.length));
        }
        for (KafkaClusterSummary ele : kafkaClustersSummary) {
            this.kafkaClustersSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClustersSummary
     *        Kafka Clusters used in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withKafkaClustersSummary(java.util.Collection<KafkaClusterSummary> kafkaClustersSummary) {
        setKafkaClustersSummary(kafkaClustersSummary);
        return this;
    }

    /**
     * <p>
     * A list of summarized information of replications between clusters.
     * </p>
     * 
     * @return A list of summarized information of replications between clusters.
     */

    public java.util.List<ReplicationInfoSummary> getReplicationInfoSummaryList() {
        return replicationInfoSummaryList;
    }

    /**
     * <p>
     * A list of summarized information of replications between clusters.
     * </p>
     * 
     * @param replicationInfoSummaryList
     *        A list of summarized information of replications between clusters.
     */

    public void setReplicationInfoSummaryList(java.util.Collection<ReplicationInfoSummary> replicationInfoSummaryList) {
        if (replicationInfoSummaryList == null) {
            this.replicationInfoSummaryList = null;
            return;
        }

        this.replicationInfoSummaryList = new java.util.ArrayList<ReplicationInfoSummary>(replicationInfoSummaryList);
    }

    /**
     * <p>
     * A list of summarized information of replications between clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationInfoSummaryList(java.util.Collection)} or
     * {@link #withReplicationInfoSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationInfoSummaryList
     *        A list of summarized information of replications between clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withReplicationInfoSummaryList(ReplicationInfoSummary... replicationInfoSummaryList) {
        if (this.replicationInfoSummaryList == null) {
            setReplicationInfoSummaryList(new java.util.ArrayList<ReplicationInfoSummary>(replicationInfoSummaryList.length));
        }
        for (ReplicationInfoSummary ele : replicationInfoSummaryList) {
            this.replicationInfoSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summarized information of replications between clusters.
     * </p>
     * 
     * @param replicationInfoSummaryList
     *        A list of summarized information of replications between clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withReplicationInfoSummaryList(java.util.Collection<ReplicationInfoSummary> replicationInfoSummaryList) {
        setReplicationInfoSummaryList(replicationInfoSummaryList);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator.
     */

    public void setReplicatorArn(String replicatorArn) {
        this.replicatorArn = replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator.
     */

    public String getReplicatorArn() {
        return this.replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
        return this;
    }

    /**
     * <p>
     * The name of the replicator.
     * </p>
     * 
     * @param replicatorName
     *        The name of the replicator.
     */

    public void setReplicatorName(String replicatorName) {
        this.replicatorName = replicatorName;
    }

    /**
     * <p>
     * The name of the replicator.
     * </p>
     * 
     * @return The name of the replicator.
     */

    public String getReplicatorName() {
        return this.replicatorName;
    }

    /**
     * <p>
     * The name of the replicator.
     * </p>
     * 
     * @param replicatorName
     *        The name of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withReplicatorName(String replicatorName) {
        setReplicatorName(replicatorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     * </p>
     * 
     * @param replicatorResourceArn
     *        The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     */

    public void setReplicatorResourceArn(String replicatorResourceArn) {
        this.replicatorResourceArn = replicatorResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     */

    public String getReplicatorResourceArn() {
        return this.replicatorResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     * </p>
     * 
     * @param replicatorResourceArn
     *        The Amazon Resource Name (ARN) of the replicator resource in the region where the replicator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicatorSummary withReplicatorResourceArn(String replicatorResourceArn) {
        setReplicatorResourceArn(replicatorResourceArn);
        return this;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @see ReplicatorState
     */

    public void setReplicatorState(String replicatorState) {
        this.replicatorState = replicatorState;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @return State of the replicator.
     * @see ReplicatorState
     */

    public String getReplicatorState() {
        return this.replicatorState;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicatorState
     */

    public ReplicatorSummary withReplicatorState(String replicatorState) {
        setReplicatorState(replicatorState);
        return this;
    }

    /**
     * <p>
     * State of the replicator.
     * </p>
     * 
     * @param replicatorState
     *        State of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicatorState
     */

    public ReplicatorSummary withReplicatorState(ReplicatorState replicatorState) {
        this.replicatorState = replicatorState.toString();
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getIsReplicatorReference() != null)
            sb.append("IsReplicatorReference: ").append(getIsReplicatorReference()).append(",");
        if (getKafkaClustersSummary() != null)
            sb.append("KafkaClustersSummary: ").append(getKafkaClustersSummary()).append(",");
        if (getReplicationInfoSummaryList() != null)
            sb.append("ReplicationInfoSummaryList: ").append(getReplicationInfoSummaryList()).append(",");
        if (getReplicatorArn() != null)
            sb.append("ReplicatorArn: ").append(getReplicatorArn()).append(",");
        if (getReplicatorName() != null)
            sb.append("ReplicatorName: ").append(getReplicatorName()).append(",");
        if (getReplicatorResourceArn() != null)
            sb.append("ReplicatorResourceArn: ").append(getReplicatorResourceArn()).append(",");
        if (getReplicatorState() != null)
            sb.append("ReplicatorState: ").append(getReplicatorState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicatorSummary == false)
            return false;
        ReplicatorSummary other = (ReplicatorSummary) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getIsReplicatorReference() == null ^ this.getIsReplicatorReference() == null)
            return false;
        if (other.getIsReplicatorReference() != null && other.getIsReplicatorReference().equals(this.getIsReplicatorReference()) == false)
            return false;
        if (other.getKafkaClustersSummary() == null ^ this.getKafkaClustersSummary() == null)
            return false;
        if (other.getKafkaClustersSummary() != null && other.getKafkaClustersSummary().equals(this.getKafkaClustersSummary()) == false)
            return false;
        if (other.getReplicationInfoSummaryList() == null ^ this.getReplicationInfoSummaryList() == null)
            return false;
        if (other.getReplicationInfoSummaryList() != null && other.getReplicationInfoSummaryList().equals(this.getReplicationInfoSummaryList()) == false)
            return false;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        if (other.getReplicatorName() == null ^ this.getReplicatorName() == null)
            return false;
        if (other.getReplicatorName() != null && other.getReplicatorName().equals(this.getReplicatorName()) == false)
            return false;
        if (other.getReplicatorResourceArn() == null ^ this.getReplicatorResourceArn() == null)
            return false;
        if (other.getReplicatorResourceArn() != null && other.getReplicatorResourceArn().equals(this.getReplicatorResourceArn()) == false)
            return false;
        if (other.getReplicatorState() == null ^ this.getReplicatorState() == null)
            return false;
        if (other.getReplicatorState() != null && other.getReplicatorState().equals(this.getReplicatorState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getIsReplicatorReference() == null) ? 0 : getIsReplicatorReference().hashCode());
        hashCode = prime * hashCode + ((getKafkaClustersSummary() == null) ? 0 : getKafkaClustersSummary().hashCode());
        hashCode = prime * hashCode + ((getReplicationInfoSummaryList() == null) ? 0 : getReplicationInfoSummaryList().hashCode());
        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        hashCode = prime * hashCode + ((getReplicatorName() == null) ? 0 : getReplicatorName().hashCode());
        hashCode = prime * hashCode + ((getReplicatorResourceArn() == null) ? 0 : getReplicatorResourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplicatorState() == null) ? 0 : getReplicatorState().hashCode());
        return hashCode;
    }

    @Override
    public ReplicatorSummary clone() {
        try {
            return (ReplicatorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ReplicatorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
