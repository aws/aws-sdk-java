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
 * An object representing the details of a multi-node parallel job node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeDetails implements Serializable, Cloneable, StructuredPojo {

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
     */
    private Boolean isMainNode;

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

    public NodeDetails withNodeIndex(Integer nodeIndex) {
        setNodeIndex(nodeIndex);
        return this;
    }

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

    public NodeDetails withIsMainNode(Boolean isMainNode) {
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
        if (getNodeIndex() != null)
            sb.append("NodeIndex: ").append(getNodeIndex()).append(",");
        if (getIsMainNode() != null)
            sb.append("IsMainNode: ").append(getIsMainNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeDetails == false)
            return false;
        NodeDetails other = (NodeDetails) obj;
        if (other.getNodeIndex() == null ^ this.getNodeIndex() == null)
            return false;
        if (other.getNodeIndex() != null && other.getNodeIndex().equals(this.getNodeIndex()) == false)
            return false;
        if (other.getIsMainNode() == null ^ this.getIsMainNode() == null)
            return false;
        if (other.getIsMainNode() != null && other.getIsMainNode().equals(this.getIsMainNode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeIndex() == null) ? 0 : getNodeIndex().hashCode());
        hashCode = prime * hashCode + ((getIsMainNode() == null) ? 0 : getIsMainNode().hashCode());
        return hashCode;
    }

    @Override
    public NodeDetails clone() {
        try {
            return (NodeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
