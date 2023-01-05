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
 * Represents a collection of nodes in a cluster. One node in the node group is the read/write primary node. All the
 * other nodes are read-only Replica nodes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Shard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Shard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the shard
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current state of this replication group - creating, available, modifying, deleting.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The keyspace for this shard.
     * </p>
     */
    private String slots;
    /**
     * <p>
     * A list containing information about individual nodes within the shard
     * </p>
     */
    private java.util.List<Node> nodes;
    /**
     * <p>
     * The number of nodes in the shard
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param name
     *        The name of the shard
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @return The name of the shard
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param name
     *        The name of the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state of this replication group - creating, available, modifying, deleting.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - creating, available, modifying, deleting.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of this replication group - creating, available, modifying, deleting.
     * </p>
     * 
     * @return The current state of this replication group - creating, available, modifying, deleting.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of this replication group - creating, available, modifying, deleting.
     * </p>
     * 
     * @param status
     *        The current state of this replication group - creating, available, modifying, deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The keyspace for this shard.
     * </p>
     * 
     * @param slots
     *        The keyspace for this shard.
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The keyspace for this shard.
     * </p>
     * 
     * @return The keyspace for this shard.
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * The keyspace for this shard.
     * </p>
     * 
     * @param slots
     *        The keyspace for this shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the shard
     * </p>
     * 
     * @return A list containing information about individual nodes within the shard
     */

    public java.util.List<Node> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the shard
     * </p>
     * 
     * @param nodes
     *        A list containing information about individual nodes within the shard
     */

    public void setNodes(java.util.Collection<Node> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<Node>(nodes);
    }

    /**
     * <p>
     * A list containing information about individual nodes within the shard
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        A list containing information about individual nodes within the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withNodes(Node... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<Node>(nodes.length));
        }
        for (Node ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing information about individual nodes within the shard
     * </p>
     * 
     * @param nodes
     *        A list containing information about individual nodes within the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withNodes(java.util.Collection<Node> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * The number of nodes in the shard
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes in the shard
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the shard
     * </p>
     * 
     * @return The number of nodes in the shard
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the shard
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes in the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
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
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getNodes() != null)
            sb.append("Nodes: ").append(getNodes()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shard == false)
            return false;
        Shard other = (Shard) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        return hashCode;
    }

    @Override
    public Shard clone() {
        try {
            return (Shard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ShardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
