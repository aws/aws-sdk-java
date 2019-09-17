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
 * An object representing the node properties of a multi-node parallel job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NodeProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of nodes associated with a multi-node parallel job.
     * </p>
     */
    private Integer numNodes;
    /**
     * <p>
     * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than
     * the number of nodes.
     * </p>
     */
    private Integer mainNode;
    /**
     * <p>
     * A list of node ranges and their properties associated with a multi-node parallel job.
     * </p>
     */
    private java.util.List<NodeRangeProperty> nodeRangeProperties;

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

    public NodeProperties withNumNodes(Integer numNodes) {
        setNumNodes(numNodes);
        return this;
    }

    /**
     * <p>
     * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than
     * the number of nodes.
     * </p>
     * 
     * @param mainNode
     *        Specifies the node index for the main node of a multi-node parallel job. This node index value must be
     *        fewer than the number of nodes.
     */

    public void setMainNode(Integer mainNode) {
        this.mainNode = mainNode;
    }

    /**
     * <p>
     * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than
     * the number of nodes.
     * </p>
     * 
     * @return Specifies the node index for the main node of a multi-node parallel job. This node index value must be
     *         fewer than the number of nodes.
     */

    public Integer getMainNode() {
        return this.mainNode;
    }

    /**
     * <p>
     * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than
     * the number of nodes.
     * </p>
     * 
     * @param mainNode
     *        Specifies the node index for the main node of a multi-node parallel job. This node index value must be
     *        fewer than the number of nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeProperties withMainNode(Integer mainNode) {
        setMainNode(mainNode);
        return this;
    }

    /**
     * <p>
     * A list of node ranges and their properties associated with a multi-node parallel job.
     * </p>
     * 
     * @return A list of node ranges and their properties associated with a multi-node parallel job.
     */

    public java.util.List<NodeRangeProperty> getNodeRangeProperties() {
        return nodeRangeProperties;
    }

    /**
     * <p>
     * A list of node ranges and their properties associated with a multi-node parallel job.
     * </p>
     * 
     * @param nodeRangeProperties
     *        A list of node ranges and their properties associated with a multi-node parallel job.
     */

    public void setNodeRangeProperties(java.util.Collection<NodeRangeProperty> nodeRangeProperties) {
        if (nodeRangeProperties == null) {
            this.nodeRangeProperties = null;
            return;
        }

        this.nodeRangeProperties = new java.util.ArrayList<NodeRangeProperty>(nodeRangeProperties);
    }

    /**
     * <p>
     * A list of node ranges and their properties associated with a multi-node parallel job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeRangeProperties(java.util.Collection)} or {@link #withNodeRangeProperties(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param nodeRangeProperties
     *        A list of node ranges and their properties associated with a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeProperties withNodeRangeProperties(NodeRangeProperty... nodeRangeProperties) {
        if (this.nodeRangeProperties == null) {
            setNodeRangeProperties(new java.util.ArrayList<NodeRangeProperty>(nodeRangeProperties.length));
        }
        for (NodeRangeProperty ele : nodeRangeProperties) {
            this.nodeRangeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of node ranges and their properties associated with a multi-node parallel job.
     * </p>
     * 
     * @param nodeRangeProperties
     *        A list of node ranges and their properties associated with a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeProperties withNodeRangeProperties(java.util.Collection<NodeRangeProperty> nodeRangeProperties) {
        setNodeRangeProperties(nodeRangeProperties);
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
        if (getMainNode() != null)
            sb.append("MainNode: ").append(getMainNode()).append(",");
        if (getNodeRangeProperties() != null)
            sb.append("NodeRangeProperties: ").append(getNodeRangeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeProperties == false)
            return false;
        NodeProperties other = (NodeProperties) obj;
        if (other.getNumNodes() == null ^ this.getNumNodes() == null)
            return false;
        if (other.getNumNodes() != null && other.getNumNodes().equals(this.getNumNodes()) == false)
            return false;
        if (other.getMainNode() == null ^ this.getMainNode() == null)
            return false;
        if (other.getMainNode() != null && other.getMainNode().equals(this.getMainNode()) == false)
            return false;
        if (other.getNodeRangeProperties() == null ^ this.getNodeRangeProperties() == null)
            return false;
        if (other.getNodeRangeProperties() != null && other.getNodeRangeProperties().equals(this.getNodeRangeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumNodes() == null) ? 0 : getNumNodes().hashCode());
        hashCode = prime * hashCode + ((getMainNode() == null) ? 0 : getMainNode().hashCode());
        hashCode = prime * hashCode + ((getNodeRangeProperties() == null) ? 0 : getNodeRangeProperties().hashCode());
        return hashCode;
    }

    @Override
    public NodeProperties clone() {
        try {
            return (NodeProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NodePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
