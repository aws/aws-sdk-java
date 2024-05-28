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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeReplicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time when the replicator was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The current version number of the replicator.
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
    private java.util.List<KafkaClusterDescription> kafkaClusters;
    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     */
    private java.util.List<ReplicationInfoDescription> replicationInfoList;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator.
     * </p>
     */
    private String replicatorArn;
    /**
     * <p>
     * The description of the replicator.
     * </p>
     */
    private String replicatorDescription;
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
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the customer's
     * account (e.g source and target clusters)
     * </p>
     */
    private String serviceExecutionRoleArn;
    /**
     * <p>
     * Details about the state of the replicator.
     * </p>
     */
    private ReplicationStateInfo stateInfo;
    /**
     * <p>
     * List of tags attached to the Replicator.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The time when the replicator was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the replicator was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the replicator was created.
     * </p>
     * 
     * @return The time when the replicator was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the replicator was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the replicator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current version number of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version number of the replicator.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version number of the replicator.
     * </p>
     * 
     * @return The current version number of the replicator.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version number of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version number of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withCurrentVersion(String currentVersion) {
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

    public DescribeReplicatorResult withIsReplicatorReference(Boolean isReplicatorReference) {
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

    public java.util.List<KafkaClusterDescription> getKafkaClusters() {
        return kafkaClusters;
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters used in setting up sources / targets for replication.
     */

    public void setKafkaClusters(java.util.Collection<KafkaClusterDescription> kafkaClusters) {
        if (kafkaClusters == null) {
            this.kafkaClusters = null;
            return;
        }

        this.kafkaClusters = new java.util.ArrayList<KafkaClusterDescription>(kafkaClusters);
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaClusters(java.util.Collection)} or {@link #withKafkaClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters used in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withKafkaClusters(KafkaClusterDescription... kafkaClusters) {
        if (this.kafkaClusters == null) {
            setKafkaClusters(new java.util.ArrayList<KafkaClusterDescription>(kafkaClusters.length));
        }
        for (KafkaClusterDescription ele : kafkaClusters) {
            this.kafkaClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kafka Clusters used in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters used in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withKafkaClusters(java.util.Collection<KafkaClusterDescription> kafkaClusters) {
        setKafkaClusters(kafkaClusters);
        return this;
    }

    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     * 
     * @return A list of replication configurations, where each configuration targets a given source cluster to target
     *         cluster replication flow.
     */

    public java.util.List<ReplicationInfoDescription> getReplicationInfoList() {
        return replicationInfoList;
    }

    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     * 
     * @param replicationInfoList
     *        A list of replication configurations, where each configuration targets a given source cluster to target
     *        cluster replication flow.
     */

    public void setReplicationInfoList(java.util.Collection<ReplicationInfoDescription> replicationInfoList) {
        if (replicationInfoList == null) {
            this.replicationInfoList = null;
            return;
        }

        this.replicationInfoList = new java.util.ArrayList<ReplicationInfoDescription>(replicationInfoList);
    }

    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationInfoList(java.util.Collection)} or {@link #withReplicationInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationInfoList
     *        A list of replication configurations, where each configuration targets a given source cluster to target
     *        cluster replication flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withReplicationInfoList(ReplicationInfoDescription... replicationInfoList) {
        if (this.replicationInfoList == null) {
            setReplicationInfoList(new java.util.ArrayList<ReplicationInfoDescription>(replicationInfoList.length));
        }
        for (ReplicationInfoDescription ele : replicationInfoList) {
            this.replicationInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     * 
     * @param replicationInfoList
     *        A list of replication configurations, where each configuration targets a given source cluster to target
     *        cluster replication flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withReplicationInfoList(java.util.Collection<ReplicationInfoDescription> replicationInfoList) {
        setReplicationInfoList(replicationInfoList);
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

    public DescribeReplicatorResult withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
        return this;
    }

    /**
     * <p>
     * The description of the replicator.
     * </p>
     * 
     * @param replicatorDescription
     *        The description of the replicator.
     */

    public void setReplicatorDescription(String replicatorDescription) {
        this.replicatorDescription = replicatorDescription;
    }

    /**
     * <p>
     * The description of the replicator.
     * </p>
     * 
     * @return The description of the replicator.
     */

    public String getReplicatorDescription() {
        return this.replicatorDescription;
    }

    /**
     * <p>
     * The description of the replicator.
     * </p>
     * 
     * @param replicatorDescription
     *        The description of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withReplicatorDescription(String replicatorDescription) {
        setReplicatorDescription(replicatorDescription);
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

    public DescribeReplicatorResult withReplicatorName(String replicatorName) {
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

    public DescribeReplicatorResult withReplicatorResourceArn(String replicatorResourceArn) {
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

    public DescribeReplicatorResult withReplicatorState(String replicatorState) {
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

    public DescribeReplicatorResult withReplicatorState(ReplicatorState replicatorState) {
        this.replicatorState = replicatorState.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the customer's
     * account (e.g source and target clusters)
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the
     *        customer's account (e.g source and target clusters)
     */

    public void setServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        this.serviceExecutionRoleArn = serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the customer's
     * account (e.g source and target clusters)
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the
     *         customer's account (e.g source and target clusters)
     */

    public String getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the customer's
     * account (e.g source and target clusters)
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used by the replicator to access resources in the
     *        customer's account (e.g source and target clusters)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        setServiceExecutionRoleArn(serviceExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * Details about the state of the replicator.
     * </p>
     * 
     * @param stateInfo
     *        Details about the state of the replicator.
     */

    public void setStateInfo(ReplicationStateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    /**
     * <p>
     * Details about the state of the replicator.
     * </p>
     * 
     * @return Details about the state of the replicator.
     */

    public ReplicationStateInfo getStateInfo() {
        return this.stateInfo;
    }

    /**
     * <p>
     * Details about the state of the replicator.
     * </p>
     * 
     * @param stateInfo
     *        Details about the state of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withStateInfo(ReplicationStateInfo stateInfo) {
        setStateInfo(stateInfo);
        return this;
    }

    /**
     * <p>
     * List of tags attached to the Replicator.
     * </p>
     * 
     * @return List of tags attached to the Replicator.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags attached to the Replicator.
     * </p>
     * 
     * @param tags
     *        List of tags attached to the Replicator.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * List of tags attached to the Replicator.
     * </p>
     * 
     * @param tags
     *        List of tags attached to the Replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeReplicatorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicatorResult clearTagsEntries() {
        this.tags = null;
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
        if (getKafkaClusters() != null)
            sb.append("KafkaClusters: ").append(getKafkaClusters()).append(",");
        if (getReplicationInfoList() != null)
            sb.append("ReplicationInfoList: ").append(getReplicationInfoList()).append(",");
        if (getReplicatorArn() != null)
            sb.append("ReplicatorArn: ").append(getReplicatorArn()).append(",");
        if (getReplicatorDescription() != null)
            sb.append("ReplicatorDescription: ").append(getReplicatorDescription()).append(",");
        if (getReplicatorName() != null)
            sb.append("ReplicatorName: ").append(getReplicatorName()).append(",");
        if (getReplicatorResourceArn() != null)
            sb.append("ReplicatorResourceArn: ").append(getReplicatorResourceArn()).append(",");
        if (getReplicatorState() != null)
            sb.append("ReplicatorState: ").append(getReplicatorState()).append(",");
        if (getServiceExecutionRoleArn() != null)
            sb.append("ServiceExecutionRoleArn: ").append(getServiceExecutionRoleArn()).append(",");
        if (getStateInfo() != null)
            sb.append("StateInfo: ").append(getStateInfo()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicatorResult == false)
            return false;
        DescribeReplicatorResult other = (DescribeReplicatorResult) obj;
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
        if (other.getKafkaClusters() == null ^ this.getKafkaClusters() == null)
            return false;
        if (other.getKafkaClusters() != null && other.getKafkaClusters().equals(this.getKafkaClusters()) == false)
            return false;
        if (other.getReplicationInfoList() == null ^ this.getReplicationInfoList() == null)
            return false;
        if (other.getReplicationInfoList() != null && other.getReplicationInfoList().equals(this.getReplicationInfoList()) == false)
            return false;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        if (other.getReplicatorDescription() == null ^ this.getReplicatorDescription() == null)
            return false;
        if (other.getReplicatorDescription() != null && other.getReplicatorDescription().equals(this.getReplicatorDescription()) == false)
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
        if (other.getServiceExecutionRoleArn() == null ^ this.getServiceExecutionRoleArn() == null)
            return false;
        if (other.getServiceExecutionRoleArn() != null && other.getServiceExecutionRoleArn().equals(this.getServiceExecutionRoleArn()) == false)
            return false;
        if (other.getStateInfo() == null ^ this.getStateInfo() == null)
            return false;
        if (other.getStateInfo() != null && other.getStateInfo().equals(this.getStateInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getKafkaClusters() == null) ? 0 : getKafkaClusters().hashCode());
        hashCode = prime * hashCode + ((getReplicationInfoList() == null) ? 0 : getReplicationInfoList().hashCode());
        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        hashCode = prime * hashCode + ((getReplicatorDescription() == null) ? 0 : getReplicatorDescription().hashCode());
        hashCode = prime * hashCode + ((getReplicatorName() == null) ? 0 : getReplicatorName().hashCode());
        hashCode = prime * hashCode + ((getReplicatorResourceArn() == null) ? 0 : getReplicatorResourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplicatorState() == null) ? 0 : getReplicatorState().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRoleArn() == null) ? 0 : getServiceExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStateInfo() == null) ? 0 : getStateInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicatorResult clone() {
        try {
            return (DescribeReplicatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
