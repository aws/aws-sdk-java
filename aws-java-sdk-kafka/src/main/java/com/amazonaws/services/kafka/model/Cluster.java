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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Returns information about a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/Cluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     * </p>
     */
    private String activeOperationArn;
    /**
     * <p>
     * Cluster Type.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE,
     * REBOOTING_BROKER, and UPDATING.
     * </p>
     */
    private String state;
    /**
     * <p>
     * State Info for the Amazon MSK cluster.
     * </p>
     */
    private StateInfo stateInfo;
    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     */
    private Provisioned provisioned;
    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     */
    private Serverless serverless;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     * </p>
     * 
     * @param activeOperationArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     *        </p>
     */

    public void setActiveOperationArn(String activeOperationArn) {
        this.activeOperationArn = activeOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     *         </p>
     */

    public String getActiveOperationArn() {
        return this.activeOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     * </p>
     * 
     * @param activeOperationArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies a cluster operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withActiveOperationArn(String activeOperationArn) {
        setActiveOperationArn(activeOperationArn);
        return this;
    }

    /**
     * <p>
     * Cluster Type.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Cluster Type.
     *        </p>
     * @see ClusterType
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * Cluster Type.
     * </p>
     * 
     * @return <p>
     *         Cluster Type.
     *         </p>
     * @see ClusterType
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * Cluster Type.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Cluster Type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterType
     */

    public Cluster withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * Cluster Type.
     * </p>
     * 
     * @param clusterType
     *        <p>
     *        Cluster Type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterType
     */

    public Cluster withClusterType(ClusterType clusterType) {
        this.clusterType = clusterType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        <p>
     *        The name of the cluster.
     *        </p>
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return <p>
     *         The name of the cluster.
     *         </p>
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        <p>
     *        The name of the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the cluster was created.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @return <p>
     *         The time when the cluster was created.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the cluster was created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The current version of the MSK cluster.
     *        </p>
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @return <p>
     *         The current version of the MSK cluster.
     *         </p>
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The current version of the MSK cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE,
     * REBOOTING_BROKER, and UPDATING.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING,
     *        MAINTENANCE, REBOOTING_BROKER, and UPDATING.
     *        </p>
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE,
     * REBOOTING_BROKER, and UPDATING.
     * </p>
     * 
     * @return <p>
     *         The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING,
     *         MAINTENANCE, REBOOTING_BROKER, and UPDATING.
     *         </p>
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE,
     * REBOOTING_BROKER, and UPDATING.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING,
     *        MAINTENANCE, REBOOTING_BROKER, and UPDATING.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public Cluster withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE,
     * REBOOTING_BROKER, and UPDATING.
     * </p>
     * 
     * @param state
     *        <p>
     *        The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING,
     *        MAINTENANCE, REBOOTING_BROKER, and UPDATING.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public Cluster withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * State Info for the Amazon MSK cluster.
     * </p>
     * 
     * @param stateInfo
     *        <p>
     *        State Info for the Amazon MSK cluster.
     *        </p>
     */

    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    /**
     * <p>
     * State Info for the Amazon MSK cluster.
     * </p>
     * 
     * @return <p>
     *         State Info for the Amazon MSK cluster.
     *         </p>
     */

    public StateInfo getStateInfo() {
        return this.stateInfo;
    }

    /**
     * <p>
     * State Info for the Amazon MSK cluster.
     * </p>
     * 
     * @param stateInfo
     *        <p>
     *        State Info for the Amazon MSK cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStateInfo(StateInfo stateInfo) {
        setStateInfo(stateInfo);
        return this;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @return <p>
     *         Tags attached to the cluster.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @param tags
     *        <p>
     *        Tags attached to the cluster.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @param tags
     *        <p>
     *        Tags attached to the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Cluster#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Cluster addTagsEntry(String key, String value) {
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

    public Cluster clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Information about the provisioned cluster.
     *        </p>
     */

    public void setProvisioned(Provisioned provisioned) {
        this.provisioned = provisioned;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the provisioned cluster.
     *         </p>
     */

    public Provisioned getProvisioned() {
        return this.provisioned;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Information about the provisioned cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withProvisioned(Provisioned provisioned) {
        setProvisioned(provisioned);
        return this;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Information about the serverless cluster.
     *        </p>
     */

    public void setServerless(Serverless serverless) {
        this.serverless = serverless;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the serverless cluster.
     *         </p>
     */

    public Serverless getServerless() {
        return this.serverless;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Information about the serverless cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withServerless(Serverless serverless) {
        setServerless(serverless);
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
        if (getActiveOperationArn() != null)
            sb.append("ActiveOperationArn: ").append(getActiveOperationArn()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateInfo() != null)
            sb.append("StateInfo: ").append(getStateInfo()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProvisioned() != null)
            sb.append("Provisioned: ").append(getProvisioned()).append(",");
        if (getServerless() != null)
            sb.append("Serverless: ").append(getServerless());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getActiveOperationArn() == null ^ this.getActiveOperationArn() == null)
            return false;
        if (other.getActiveOperationArn() != null && other.getActiveOperationArn().equals(this.getActiveOperationArn()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateInfo() == null ^ this.getStateInfo() == null)
            return false;
        if (other.getStateInfo() != null && other.getStateInfo().equals(this.getStateInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProvisioned() == null ^ this.getProvisioned() == null)
            return false;
        if (other.getProvisioned() != null && other.getProvisioned().equals(this.getProvisioned()) == false)
            return false;
        if (other.getServerless() == null ^ this.getServerless() == null)
            return false;
        if (other.getServerless() != null && other.getServerless().equals(this.getServerless()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveOperationArn() == null) ? 0 : getActiveOperationArn().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateInfo() == null) ? 0 : getStateInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProvisioned() == null) ? 0 : getProvisioned().hashCode());
        hashCode = prime * hashCode + ((getServerless() == null) ? 0 : getServerless().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
