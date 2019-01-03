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
 * An object representing the properties of a node that is associated with a multi-node parallel job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodePropertiesSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodePropertiesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the current node is the main node for a multi-node parallel job.
     * </p>
     */
    private Boolean isMainNode;
    /**
     * <p>
     * The number of nodes associated with a multi-node parallel job.
     * </p>
     */
    private Integer numNodes;
    /**
     * <p>
     * The node index for the node. Node index numbering begins at zero. This index is also available on the node with
     * the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     * </p>
     */
    private Integer nodeIndex;

    /**
     * <p>
     * Specifies whether the current node is the main node for a multi-node parallel job.
     * </p>
     * 
     * @param isMainNode
     *        Specifies whether the current node is the main node for a multi-node parallel job.
     */

    public void setIsMainNode(Boolean isMainNode) {
        this.isMainNode = isMainNode;
    }

    /**
     * <p>
     * Specifies whether the current node is the main node for a multi-node parallel job.
     * </p>
     * 
     * @return Specifies whether the current node is the main node for a multi-node parallel job.
     */

    public Boolean getIsMainNode() {
        return this.isMainNode;
    }

    /**
     * <p>
     * Specifies whether the current node is the main node for a multi-node parallel job.
     * </p>
     * 
     * @param isMainNode
     *        Specifies whether the current node is the main node for a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertiesSummary withIsMainNode(Boolean isMainNode) {
        setIsMainNode(isMainNode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the current node is the main node for a multi-node parallel job.
     * </p>
     * 
     * @return Specifies whether the current node is the main node for a multi-node parallel job.
     */

    public Boolean isMainNode() {
        return this.isMainNode;
    }

    /**
     * <p>
     * The number of nodes associated with a multi-node parallel job.
     * </p>
     * 
     * @param numNodes
     *        The number of nodes associated with a multi-node parallel job.
     */

    public void setNumNodes(Integer numNodes) {
        this.numNodes = numNodes;
    }

    /**
     * <p>
     * The number of nodes associated with a multi-node parallel job.
     * </p>
     * 
     * @return The number of nodes associated with a multi-node parallel job.
     */

    public Integer getNumNodes() {
        return this.numNodes;
    }

    /**
     * <p>
     * The number of nodes associated with a multi-node parallel job.
     * </p>
     * 
     * @param numNodes
     *        The number of nodes associated with a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertiesSummary withNumNodes(Integer numNodes) {
        setNumNodes(numNodes);
        return this;
    }

    /**
     * <p>
     * The node index for the node. Node index numbering begins at zero. This index is also available on the node with
     * the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     * </p>
     * 
     * @param nodeIndex
     *        The node index for the node. Node index numbering begins at zero. This index is also available on the node
     *        with the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     */

    public void setNodeIndex(Integer nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    /**
     * <p>
     * The node index for the node. Node index numbering begins at zero. This index is also available on the node with
     * the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     * </p>
     * 
     * @return The node index for the node. Node index numbering begins at zero. This index is also available on the
     *         node with the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     */

    public Integer getNodeIndex() {
        return this.nodeIndex;
    }

    /**
     * <p>
     * The node index for the node. Node index numbering begins at zero. This index is also available on the node with
     * the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     * </p>
     * 
     * @param nodeIndex
     *        The node index for the node. Node index numbering begins at zero. This index is also available on the node
     *        with the <code>AWS_BATCH_JOB_NODE_INDEX</code> environment variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodePropertiesSummary withNodeIndex(Integer nodeIndex) {
        setNodeIndex(nodeIndex);
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
        if (getIsMainNode() != null)
            sb.append("IsMainNode: ").append(getIsMainNode()).append(",");
        if (getNumNodes() != null)
            sb.append("NumNodes: ").append(getNumNodes()).append(",");
        if (getNodeIndex() != null)
            sb.append("NodeIndex: ").append(getNodeIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodePropertiesSummary == false)
            return false;
        NodePropertiesSummary other = (NodePropertiesSummary) obj;
        if (other.getIsMainNode() == null ^ this.getIsMainNode() == null)
            return false;
        if (other.getIsMainNode() != null && other.getIsMainNode().equals(this.getIsMainNode()) == false)
            return false;
        if (other.getNumNodes() == null ^ this.getNumNodes() == null)
            return false;
        if (other.getNumNodes() != null && other.getNumNodes().equals(this.getNumNodes()) == false)
            return false;
        if (other.getNodeIndex() == null ^ this.getNodeIndex() == null)
            return false;
        if (other.getNodeIndex() != null && other.getNodeIndex().equals(this.getNodeIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsMainNode() == null) ? 0 : getIsMainNode().hashCode());
        hashCode = prime * hashCode + ((getNumNodes() == null) ? 0 : getNumNodes().hashCode());
        hashCode = prime * hashCode + ((getNodeIndex() == null) ? 0 : getNodeIndex().hashCode());
        return hashCode;
    }

    @Override
    public NodePropertiesSummary clone() {
        try {
            return (NodePropertiesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodePropertiesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
