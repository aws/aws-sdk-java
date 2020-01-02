/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties of a peer node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Node" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the network that the node is in.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The instance type of the node.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Availability Zone in which the node exists.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     */
    private NodeFrameworkAttributes frameworkAttributes;
    /**
     * <p>
     * The status of the node.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The unique identifier of the network that the node is in.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network that the node is in.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network that the node is in.
     * </p>
     * 
     * @return The unique identifier of the network that the node is in.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network that the node is in.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network that the node is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member to which the node belongs.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * 
     * @return The unique identifier of the member to which the node belongs.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member to which the node belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param id
     *        The unique identifier of the node.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @return The unique identifier of the node.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param id
     *        The unique identifier of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the node.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @return The instance type of the node.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node exists.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists.
     * </p>
     * 
     * @return The Availability Zone in which the node exists.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework being used.
     */

    public void setFrameworkAttributes(NodeFrameworkAttributes frameworkAttributes) {
        this.frameworkAttributes = frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @return Attributes of the blockchain framework being used.
     */

    public NodeFrameworkAttributes getFrameworkAttributes() {
        return this.frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withFrameworkAttributes(NodeFrameworkAttributes frameworkAttributes) {
        setFrameworkAttributes(frameworkAttributes);
        return this;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * 
     * @param status
     *        The status of the node.
     * @see NodeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * 
     * @return The status of the node.
     * @see NodeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * 
     * @param status
     *        The status of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public Node withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * 
     * @param status
     *        The status of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public Node withStatus(NodeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the node was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @return The date and time that the node was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getFrameworkAttributes() != null)
            sb.append("FrameworkAttributes: ").append(getFrameworkAttributes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getFrameworkAttributes() == null ^ this.getFrameworkAttributes() == null)
            return false;
        if (other.getFrameworkAttributes() != null && other.getFrameworkAttributes().equals(this.getFrameworkAttributes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getFrameworkAttributes() == null) ? 0 : getFrameworkAttributes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
