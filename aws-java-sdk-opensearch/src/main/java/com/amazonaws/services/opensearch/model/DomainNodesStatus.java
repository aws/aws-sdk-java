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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for information about nodes on the domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainNodesStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the node.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * Indicates whether the nodes is a data, master, or ultrawarm node.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The Availability Zone of the node.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The instance type information of the node.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Indicates if the node is active or in standby.
     * </p>
     */
    private String nodeStatus;
    /**
     * <p>
     * Indicates if the node has EBS or instance storage.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * </p>
     */
    private String storageVolumeType;
    /**
     * <p>
     * The storage size of the node, in GiB.
     * </p>
     */
    private String storageSize;

    /**
     * <p>
     * The ID of the node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The ID of the node.
     * </p>
     * 
     * @return The ID of the node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The ID of the node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNodesStatus withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the nodes is a data, master, or ultrawarm node.
     * </p>
     * 
     * @param nodeType
     *        Indicates whether the nodes is a data, master, or ultrawarm node.
     * @see NodeType
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * Indicates whether the nodes is a data, master, or ultrawarm node.
     * </p>
     * 
     * @return Indicates whether the nodes is a data, master, or ultrawarm node.
     * @see NodeType
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * Indicates whether the nodes is a data, master, or ultrawarm node.
     * </p>
     * 
     * @param nodeType
     *        Indicates whether the nodes is a data, master, or ultrawarm node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public DomainNodesStatus withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the nodes is a data, master, or ultrawarm node.
     * </p>
     * 
     * @param nodeType
     *        Indicates whether the nodes is a data, master, or ultrawarm node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public DomainNodesStatus withNodeType(NodeType nodeType) {
        this.nodeType = nodeType.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the node.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the node.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the node.
     * </p>
     * 
     * @return The Availability Zone of the node.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the node.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNodesStatus withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The instance type information of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type information of the node.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type information of the node.
     * </p>
     * 
     * @return The instance type information of the node.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type information of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type information of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public DomainNodesStatus withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type information of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type information of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public DomainNodesStatus withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the node is active or in standby.
     * </p>
     * 
     * @param nodeStatus
     *        Indicates if the node is active or in standby.
     * @see NodeStatus
     */

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    /**
     * <p>
     * Indicates if the node is active or in standby.
     * </p>
     * 
     * @return Indicates if the node is active or in standby.
     * @see NodeStatus
     */

    public String getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * <p>
     * Indicates if the node is active or in standby.
     * </p>
     * 
     * @param nodeStatus
     *        Indicates if the node is active or in standby.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public DomainNodesStatus withNodeStatus(String nodeStatus) {
        setNodeStatus(nodeStatus);
        return this;
    }

    /**
     * <p>
     * Indicates if the node is active or in standby.
     * </p>
     * 
     * @param nodeStatus
     *        Indicates if the node is active or in standby.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public DomainNodesStatus withNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the node has EBS or instance storage.
     * </p>
     * 
     * @param storageType
     *        Indicates if the node has EBS or instance storage.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Indicates if the node has EBS or instance storage.
     * </p>
     * 
     * @return Indicates if the node has EBS or instance storage.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Indicates if the node has EBS or instance storage.
     * </p>
     * 
     * @param storageType
     *        Indicates if the node has EBS or instance storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNodesStatus withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * </p>
     * 
     * @param storageVolumeType
     *        If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * @see VolumeType
     */

    public void setStorageVolumeType(String storageVolumeType) {
        this.storageVolumeType = storageVolumeType;
    }

    /**
     * <p>
     * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * </p>
     * 
     * @return If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * @see VolumeType
     */

    public String getStorageVolumeType() {
        return this.storageVolumeType;
    }

    /**
     * <p>
     * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * </p>
     * 
     * @param storageVolumeType
     *        If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public DomainNodesStatus withStorageVolumeType(String storageVolumeType) {
        setStorageVolumeType(storageVolumeType);
        return this;
    }

    /**
     * <p>
     * If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * </p>
     * 
     * @param storageVolumeType
     *        If the nodes has EBS storage, indicates if the volume type is GP2 or GP3. Only applicable for data nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public DomainNodesStatus withStorageVolumeType(VolumeType storageVolumeType) {
        this.storageVolumeType = storageVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * The storage size of the node, in GiB.
     * </p>
     * 
     * @param storageSize
     *        The storage size of the node, in GiB.
     */

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }

    /**
     * <p>
     * The storage size of the node, in GiB.
     * </p>
     * 
     * @return The storage size of the node, in GiB.
     */

    public String getStorageSize() {
        return this.storageSize;
    }

    /**
     * <p>
     * The storage size of the node, in GiB.
     * </p>
     * 
     * @param storageSize
     *        The storage size of the node, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNodesStatus withStorageSize(String storageSize) {
        setStorageSize(storageSize);
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
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getNodeStatus() != null)
            sb.append("NodeStatus: ").append(getNodeStatus()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getStorageVolumeType() != null)
            sb.append("StorageVolumeType: ").append(getStorageVolumeType()).append(",");
        if (getStorageSize() != null)
            sb.append("StorageSize: ").append(getStorageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainNodesStatus == false)
            return false;
        DomainNodesStatus other = (DomainNodesStatus) obj;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNodeStatus() == null ^ this.getNodeStatus() == null)
            return false;
        if (other.getNodeStatus() != null && other.getNodeStatus().equals(this.getNodeStatus()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getStorageVolumeType() == null ^ this.getStorageVolumeType() == null)
            return false;
        if (other.getStorageVolumeType() != null && other.getStorageVolumeType().equals(this.getStorageVolumeType()) == false)
            return false;
        if (other.getStorageSize() == null ^ this.getStorageSize() == null)
            return false;
        if (other.getStorageSize() != null && other.getStorageSize().equals(this.getStorageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getNodeStatus() == null) ? 0 : getNodeStatus().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getStorageVolumeType() == null) ? 0 : getStorageVolumeType().hashCode());
        hashCode = prime * hashCode + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        return hashCode;
    }

    @Override
    public DomainNodesStatus clone() {
        try {
            return (DomainNodesStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainNodesStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
