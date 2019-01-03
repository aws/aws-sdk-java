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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a parameter value that is applicable to a particular node type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/NodeTypeSpecificValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeTypeSpecificValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A node type to which the parameter value applies.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The parameter value for this node type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A node type to which the parameter value applies.
     * </p>
     * 
     * @param nodeType
     *        A node type to which the parameter value applies.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * A node type to which the parameter value applies.
     * </p>
     * 
     * @return A node type to which the parameter value applies.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * A node type to which the parameter value applies.
     * </p>
     * 
     * @param nodeType
     *        A node type to which the parameter value applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeTypeSpecificValue withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The parameter value for this node type.
     * </p>
     * 
     * @param value
     *        The parameter value for this node type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value for this node type.
     * </p>
     * 
     * @return The parameter value for this node type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value for this node type.
     * </p>
     * 
     * @param value
     *        The parameter value for this node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeTypeSpecificValue withValue(String value) {
        setValue(value);
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
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeTypeSpecificValue == false)
            return false;
        NodeTypeSpecificValue other = (NodeTypeSpecificValue) obj;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public NodeTypeSpecificValue clone() {
        try {
            return (NodeTypeSpecificValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.NodeTypeSpecificValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
