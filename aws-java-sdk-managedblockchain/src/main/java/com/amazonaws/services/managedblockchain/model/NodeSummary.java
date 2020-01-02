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
 * A summary of configuration properties for a peer node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     */
    private String id;
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
     * The Availability Zone in which the node exists.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The EC2 instance type for the node.
     * </p>
     */
    private String instanceType;

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

    public NodeSummary withId(String id) {
        setId(id);
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

    public NodeSummary withStatus(String status) {
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

    public NodeSummary withStatus(NodeStatus status) {
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

    public NodeSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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

    public NodeSummary withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type for the node.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for the node.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for the node.
     * </p>
     * 
     * @return The EC2 instance type for the node.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for the node.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeSummary == false)
            return false;
        NodeSummary other = (NodeSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public NodeSummary clone() {
        try {
            return (NodeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
