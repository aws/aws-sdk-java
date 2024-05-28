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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A node structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/NodeStructure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeStructure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of nodes that have this specific structure.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * A list of the node properties present in this specific structure.
     * </p>
     */
    private java.util.List<String> nodeProperties;
    /**
     * <p>
     * A list of distinct outgoing edge labels present in this specific structure.
     * </p>
     */
    private java.util.List<String> distinctOutgoingEdgeLabels;

    /**
     * <p>
     * Number of nodes that have this specific structure.
     * </p>
     * 
     * @param count
     *        Number of nodes that have this specific structure.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of nodes that have this specific structure.
     * </p>
     * 
     * @return Number of nodes that have this specific structure.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * Number of nodes that have this specific structure.
     * </p>
     * 
     * @param count
     *        Number of nodes that have this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeStructure withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * A list of the node properties present in this specific structure.
     * </p>
     * 
     * @return A list of the node properties present in this specific structure.
     */

    public java.util.List<String> getNodeProperties() {
        return nodeProperties;
    }

    /**
     * <p>
     * A list of the node properties present in this specific structure.
     * </p>
     * 
     * @param nodeProperties
     *        A list of the node properties present in this specific structure.
     */

    public void setNodeProperties(java.util.Collection<String> nodeProperties) {
        if (nodeProperties == null) {
            this.nodeProperties = null;
            return;
        }

        this.nodeProperties = new java.util.ArrayList<String>(nodeProperties);
    }

    /**
     * <p>
     * A list of the node properties present in this specific structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeProperties(java.util.Collection)} or {@link #withNodeProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodeProperties
     *        A list of the node properties present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeStructure withNodeProperties(String... nodeProperties) {
        if (this.nodeProperties == null) {
            setNodeProperties(new java.util.ArrayList<String>(nodeProperties.length));
        }
        for (String ele : nodeProperties) {
            this.nodeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the node properties present in this specific structure.
     * </p>
     * 
     * @param nodeProperties
     *        A list of the node properties present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeStructure withNodeProperties(java.util.Collection<String> nodeProperties) {
        setNodeProperties(nodeProperties);
        return this;
    }

    /**
     * <p>
     * A list of distinct outgoing edge labels present in this specific structure.
     * </p>
     * 
     * @return A list of distinct outgoing edge labels present in this specific structure.
     */

    public java.util.List<String> getDistinctOutgoingEdgeLabels() {
        return distinctOutgoingEdgeLabels;
    }

    /**
     * <p>
     * A list of distinct outgoing edge labels present in this specific structure.
     * </p>
     * 
     * @param distinctOutgoingEdgeLabels
     *        A list of distinct outgoing edge labels present in this specific structure.
     */

    public void setDistinctOutgoingEdgeLabels(java.util.Collection<String> distinctOutgoingEdgeLabels) {
        if (distinctOutgoingEdgeLabels == null) {
            this.distinctOutgoingEdgeLabels = null;
            return;
        }

        this.distinctOutgoingEdgeLabels = new java.util.ArrayList<String>(distinctOutgoingEdgeLabels);
    }

    /**
     * <p>
     * A list of distinct outgoing edge labels present in this specific structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDistinctOutgoingEdgeLabels(java.util.Collection)} or
     * {@link #withDistinctOutgoingEdgeLabels(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param distinctOutgoingEdgeLabels
     *        A list of distinct outgoing edge labels present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeStructure withDistinctOutgoingEdgeLabels(String... distinctOutgoingEdgeLabels) {
        if (this.distinctOutgoingEdgeLabels == null) {
            setDistinctOutgoingEdgeLabels(new java.util.ArrayList<String>(distinctOutgoingEdgeLabels.length));
        }
        for (String ele : distinctOutgoingEdgeLabels) {
            this.distinctOutgoingEdgeLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of distinct outgoing edge labels present in this specific structure.
     * </p>
     * 
     * @param distinctOutgoingEdgeLabels
     *        A list of distinct outgoing edge labels present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeStructure withDistinctOutgoingEdgeLabels(java.util.Collection<String> distinctOutgoingEdgeLabels) {
        setDistinctOutgoingEdgeLabels(distinctOutgoingEdgeLabels);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties()).append(",");
        if (getDistinctOutgoingEdgeLabels() != null)
            sb.append("DistinctOutgoingEdgeLabels: ").append(getDistinctOutgoingEdgeLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeStructure == false)
            return false;
        NodeStructure other = (NodeStructure) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        if (other.getDistinctOutgoingEdgeLabels() == null ^ this.getDistinctOutgoingEdgeLabels() == null)
            return false;
        if (other.getDistinctOutgoingEdgeLabels() != null && other.getDistinctOutgoingEdgeLabels().equals(this.getDistinctOutgoingEdgeLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        hashCode = prime * hashCode + ((getDistinctOutgoingEdgeLabels() == null) ? 0 : getDistinctOutgoingEdgeLabels().hashCode());
        return hashCode;
    }

    @Override
    public NodeStructure clone() {
        try {
            return (NodeStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.NodeStructureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
