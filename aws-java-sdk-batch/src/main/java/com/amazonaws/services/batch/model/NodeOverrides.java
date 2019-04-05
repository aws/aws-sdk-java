/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodeOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are
     * specified in the job definition. To use this override:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There must be at least one node range in your job definition that has an open upper boundary (such as
     * <code>:</code> or <code>n:</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The lower boundary of the node range specified in the job definition must be fewer than the number of nodes
     * specified in the override.
     * </p>
     * </li>
     * <li>
     * <p>
     * The main node index specified in the job definition must be fewer than the number of nodes specified in the
     * override.
     * </p>
     * </li>
     * </ul>
     */
    private Integer numNodes;
    /**
     * <p>
     * The node property overrides for the job.
     * </p>
     */
    private java.util.List<NodePropertyOverride> nodePropertyOverrides;

    /**
     * <p>
     * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are
     * specified in the job definition. To use this override:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There must be at least one node range in your job definition that has an open upper boundary (such as
     * <code>:</code> or <code>n:</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The lower boundary of the node range specified in the job definition must be fewer than the number of nodes
     * specified in the override.
     * </p>
     * </li>
     * <li>
     * <p>
     * The main node index specified in the job definition must be fewer than the number of nodes specified in the
     * override.
     * </p>
     * </li>
     * </ul>
     * 
     * @param numNodes
     *        The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that
     *        are specified in the job definition. To use this override:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        There must be at least one node range in your job definition that has an open upper boundary (such as
     *        <code>:</code> or <code>n:</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The lower boundary of the node range specified in the job definition must be fewer than the number of
     *        nodes specified in the override.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The main node index specified in the job definition must be fewer than the number of nodes specified in
     *        the override.
     *        </p>
     *        </li>
     */

    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    /**
     * <p>
     * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are
     * specified in the job definition. To use this override:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There must be at least one node range in your job definition that has an open upper boundary (such as
     * <code>:</code> or <code>n:</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The lower boundary of the node range specified in the job definition must be fewer than the number of nodes
     * specified in the override.
     * </p>
     * </li>
     * <li>
     * <p>
     * The main node index specified in the job definition must be fewer than the number of nodes specified in the
     * override.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that
     *         are specified in the job definition. To use this override:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         There must be at least one node range in your job definition that has an open upper boundary (such as
     *         <code>:</code> or <code>n:</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The lower boundary of the node range specified in the job definition must be fewer than the number of
     *         nodes specified in the override.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The main node index specified in the job definition must be fewer than the number of nodes specified in
     *         the override.
     *         </p>
     *         </li>
     */

    public Integer getNumNodes() {
        return this.numNodes;
    }

    /**
     * <p>
     * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are
     * specified in the job definition. To use this override:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There must be at least one node range in your job definition that has an open upper boundary (such as
     * <code>:</code> or <code>n:</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The lower boundary of the node range specified in the job definition must be fewer than the number of nodes
     * specified in the override.
     * </p>
     * </li>
     * <li>
     * <p>
     * The main node index specified in the job definition must be fewer than the number of nodes specified in the
     * override.
     * </p>
     * </li>
     * </ul>
     * 
     * @param numNodes
     *        The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that
     *        are specified in the job definition. To use this override:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        There must be at least one node range in your job definition that has an open upper boundary (such as
     *        <code>:</code> or <code>n:</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The lower boundary of the node range specified in the job definition must be fewer than the number of
     *        nodes specified in the override.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The main node index specified in the job definition must be fewer than the number of nodes specified in
     *        the override.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeOverrides withNumNodes(Integer numNodes) {
        setNumNodes(numNodes);
        return this;
    }

    /**
     * <p>
     * The node property overrides for the job.
     * </p>
     * 
     * @return The node property overrides for the job.
     */

    public java.util.List<NodePropertyOverride> getNodePropertyOverrides() {
        return nodePropertyOverrides;
    }

    /**
     * <p>
     * The node property overrides for the job.
     * </p>
     * 
     * @param nodePropertyOverrides
     *        The node property overrides for the job.
     */

    public void setNodePropertyOverrides(java.util.Collection<NodePropertyOverride> nodePropertyOverrides) {
        if (nodePropertyOverrides == null) {
            this.nodePropertyOverrides = null;
            return;
        }

        this.nodePropertyOverrides = new java.util.ArrayList<NodePropertyOverride>(nodePropertyOverrides);
    }

    /**
     * <p>
     * The node property overrides for the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodePropertyOverrides(java.util.Collection)} or
     * {@link #withNodePropertyOverrides(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nodePropertyOverrides
     *        The node property overrides for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeOverrides withNodePropertyOverrides(NodePropertyOverride... nodePropertyOverrides) {
        if (this.nodePropertyOverrides == null) {
            setNodePropertyOverrides(new java.util.ArrayList<NodePropertyOverride>(nodePropertyOverrides.length));
        }
        for (NodePropertyOverride ele : nodePropertyOverrides) {
            this.nodePropertyOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node property overrides for the job.
     * </p>
     * 
     * @param nodePropertyOverrides
     *        The node property overrides for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeOverrides withNodePropertyOverrides(java.util.Collection<NodePropertyOverride> nodePropertyOverrides) {
        setNodePropertyOverrides(nodePropertyOverrides);
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
        if (getNumNodes() != null)
            sb.append("NumNodes: ").append(getNumNodes()).append(",");
        if (getNodePropertyOverrides() != null)
            sb.append("NodePropertyOverrides: ").append(getNodePropertyOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeOverrides == false)
            return false;
        NodeOverrides other = (NodeOverrides) obj;
        if (other.getNumNodes() == null ^ this.getNumNodes() == null)
            return false;
        if (other.getNumNodes() != null && other.getNumNodes().equals(this.getNumNodes()) == false)
            return false;
        if (other.getNodePropertyOverrides() == null ^ this.getNodePropertyOverrides() == null)
            return false;
        if (other.getNodePropertyOverrides() != null && other.getNodePropertyOverrides().equals(this.getNodePropertyOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumNodes() == null) ? 0 : getNumNodes().hashCode());
        hashCode = prime * hashCode + ((getNodePropertyOverrides() == null) ? 0 : getNodePropertyOverrides().hashCode());
        return hashCode;
    }

    @Override
    public NodeOverrides clone() {
        try {
            return (NodeOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodeOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
