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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an individual node within a cluster. Each node runs its own instance of the cluster's protocol-compliant
 * caching software.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Node" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster name,
     * shard name and node name uniquely identifies every node used in a customer's Amazon account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the service update on the node
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Availability Zone in which the node resides
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The date and time when the node was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The hostname for connecting to this node.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster name,
     * shard name and node name uniquely identifies every node used in a customer's Amazon account.
     * </p>
     * 
     * @param name
     *        The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster
     *        name, shard name and node name uniquely identifies every node used in a customer's Amazon account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster name,
     * shard name and node name uniquely identifies every node used in a customer's Amazon account.
     * </p>
     * 
     * @return The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster
     *         name, shard name and node name uniquely identifies every node used in a customer's Amazon account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster name,
     * shard name and node name uniquely identifies every node used in a customer's Amazon account.
     * </p>
     * 
     * @param name
     *        The node identifier. A node name is a numeric identifier (0001, 0002, etc.). The combination of cluster
     *        name, shard name and node name uniquely identifies every node used in a customer's Amazon account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node
     * </p>
     * 
     * @param status
     *        The status of the service update on the node
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service update on the node
     * </p>
     * 
     * @return The status of the service update on the node
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service update on the node
     * </p>
     * 
     * @param status
     *        The status of the service update on the node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the node resides
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node resides
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node resides
     * </p>
     * 
     * @return The Availability Zone in which the node resides
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node resides
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node resides
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time when the node was created.
     * </p>
     * 
     * @param createTime
     *        The date and time when the node was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time when the node was created.
     * </p>
     * 
     * @return The date and time when the node was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time when the node was created.
     * </p>
     * 
     * @param createTime
     *        The date and time when the node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The hostname for connecting to this node.
     * </p>
     * 
     * @param endpoint
     *        The hostname for connecting to this node.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this node.
     * </p>
     * 
     * @return The hostname for connecting to this node.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this node.
     * </p>
     * 
     * @param endpoint
     *        The hostname for connecting to this node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
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
        com.amazonaws.services.memorydb.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
