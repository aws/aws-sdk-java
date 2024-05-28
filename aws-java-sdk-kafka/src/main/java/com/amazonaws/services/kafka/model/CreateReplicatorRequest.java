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
 * Creates a replicator using the specified configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateReplicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A summary description of the replicator.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Kafka Clusters to use in setting up sources / targets for replication.
     * </p>
     */
    private java.util.List<KafkaCluster> kafkaClusters;
    /**
     * <p>
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster
     * replication flow.
     * </p>
     */
    private java.util.List<ReplicationInfo> replicationInfoList;
    /**
     * <p>
     * The name of the replicator. Alpha-numeric characters with '-' are allowed.
     * </p>
     */
    private String replicatorName;
    /**
     * <p>
     * The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and
     * target clusters)
     * </p>
     */
    private String serviceExecutionRoleArn;
    /**
     * <p>
     * List of tags to attach to created Replicator.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A summary description of the replicator.
     * </p>
     * 
     * @param description
     *        A summary description of the replicator.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of the replicator.
     * </p>
     * 
     * @return A summary description of the replicator.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of the replicator.
     * </p>
     * 
     * @param description
     *        A summary description of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Kafka Clusters to use in setting up sources / targets for replication.
     * </p>
     * 
     * @return Kafka Clusters to use in setting up sources / targets for replication.
     */

    public java.util.List<KafkaCluster> getKafkaClusters() {
        return kafkaClusters;
    }

    /**
     * <p>
     * Kafka Clusters to use in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters to use in setting up sources / targets for replication.
     */

    public void setKafkaClusters(java.util.Collection<KafkaCluster> kafkaClusters) {
        if (kafkaClusters == null) {
            this.kafkaClusters = null;
            return;
        }

        this.kafkaClusters = new java.util.ArrayList<KafkaCluster>(kafkaClusters);
    }

    /**
     * <p>
     * Kafka Clusters to use in setting up sources / targets for replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaClusters(java.util.Collection)} or {@link #withKafkaClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters to use in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withKafkaClusters(KafkaCluster... kafkaClusters) {
        if (this.kafkaClusters == null) {
            setKafkaClusters(new java.util.ArrayList<KafkaCluster>(kafkaClusters.length));
        }
        for (KafkaCluster ele : kafkaClusters) {
            this.kafkaClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kafka Clusters to use in setting up sources / targets for replication.
     * </p>
     * 
     * @param kafkaClusters
     *        Kafka Clusters to use in setting up sources / targets for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withKafkaClusters(java.util.Collection<KafkaCluster> kafkaClusters) {
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

    public java.util.List<ReplicationInfo> getReplicationInfoList() {
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

    public void setReplicationInfoList(java.util.Collection<ReplicationInfo> replicationInfoList) {
        if (replicationInfoList == null) {
            this.replicationInfoList = null;
            return;
        }

        this.replicationInfoList = new java.util.ArrayList<ReplicationInfo>(replicationInfoList);
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

    public CreateReplicatorRequest withReplicationInfoList(ReplicationInfo... replicationInfoList) {
        if (this.replicationInfoList == null) {
            setReplicationInfoList(new java.util.ArrayList<ReplicationInfo>(replicationInfoList.length));
        }
        for (ReplicationInfo ele : replicationInfoList) {
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

    public CreateReplicatorRequest withReplicationInfoList(java.util.Collection<ReplicationInfo> replicationInfoList) {
        setReplicationInfoList(replicationInfoList);
        return this;
    }

    /**
     * <p>
     * The name of the replicator. Alpha-numeric characters with '-' are allowed.
     * </p>
     * 
     * @param replicatorName
     *        The name of the replicator. Alpha-numeric characters with '-' are allowed.
     */

    public void setReplicatorName(String replicatorName) {
        this.replicatorName = replicatorName;
    }

    /**
     * <p>
     * The name of the replicator. Alpha-numeric characters with '-' are allowed.
     * </p>
     * 
     * @return The name of the replicator. Alpha-numeric characters with '-' are allowed.
     */

    public String getReplicatorName() {
        return this.replicatorName;
    }

    /**
     * <p>
     * The name of the replicator. Alpha-numeric characters with '-' are allowed.
     * </p>
     * 
     * @param replicatorName
     *        The name of the replicator. Alpha-numeric characters with '-' are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withReplicatorName(String replicatorName) {
        setReplicatorName(replicatorName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and
     * target clusters)
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source
     *        and target clusters)
     */

    public void setServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        this.serviceExecutionRoleArn = serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and
     * target clusters)
     * </p>
     * 
     * @return The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source
     *         and target clusters)
     */

    public String getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and
     * target clusters)
     * </p>
     * 
     * @param serviceExecutionRoleArn
     *        The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source
     *        and target clusters)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withServiceExecutionRoleArn(String serviceExecutionRoleArn) {
        setServiceExecutionRoleArn(serviceExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * List of tags to attach to created Replicator.
     * </p>
     * 
     * @return List of tags to attach to created Replicator.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of tags to attach to created Replicator.
     * </p>
     * 
     * @param tags
     *        List of tags to attach to created Replicator.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * List of tags to attach to created Replicator.
     * </p>
     * 
     * @param tags
     *        List of tags to attach to created Replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateReplicatorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicatorRequest addTagsEntry(String key, String value) {
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

    public CreateReplicatorRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKafkaClusters() != null)
            sb.append("KafkaClusters: ").append(getKafkaClusters()).append(",");
        if (getReplicationInfoList() != null)
            sb.append("ReplicationInfoList: ").append(getReplicationInfoList()).append(",");
        if (getReplicatorName() != null)
            sb.append("ReplicatorName: ").append(getReplicatorName()).append(",");
        if (getServiceExecutionRoleArn() != null)
            sb.append("ServiceExecutionRoleArn: ").append(getServiceExecutionRoleArn()).append(",");
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

        if (obj instanceof CreateReplicatorRequest == false)
            return false;
        CreateReplicatorRequest other = (CreateReplicatorRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKafkaClusters() == null ^ this.getKafkaClusters() == null)
            return false;
        if (other.getKafkaClusters() != null && other.getKafkaClusters().equals(this.getKafkaClusters()) == false)
            return false;
        if (other.getReplicationInfoList() == null ^ this.getReplicationInfoList() == null)
            return false;
        if (other.getReplicationInfoList() != null && other.getReplicationInfoList().equals(this.getReplicationInfoList()) == false)
            return false;
        if (other.getReplicatorName() == null ^ this.getReplicatorName() == null)
            return false;
        if (other.getReplicatorName() != null && other.getReplicatorName().equals(this.getReplicatorName()) == false)
            return false;
        if (other.getServiceExecutionRoleArn() == null ^ this.getServiceExecutionRoleArn() == null)
            return false;
        if (other.getServiceExecutionRoleArn() != null && other.getServiceExecutionRoleArn().equals(this.getServiceExecutionRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKafkaClusters() == null) ? 0 : getKafkaClusters().hashCode());
        hashCode = prime * hashCode + ((getReplicationInfoList() == null) ? 0 : getReplicationInfoList().hashCode());
        hashCode = prime * hashCode + ((getReplicatorName() == null) ? 0 : getReplicatorName().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRoleArn() == null) ? 0 : getServiceExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicatorRequest clone() {
        return (CreateReplicatorRequest) super.clone();
    }

}
