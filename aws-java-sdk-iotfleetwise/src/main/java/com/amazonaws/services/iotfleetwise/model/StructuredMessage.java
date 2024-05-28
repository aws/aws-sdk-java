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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structured message for the message signal. It can be defined with either a
 * <code>primitiveMessageDefinition</code>, <code>structuredMessageListDefinition</code>, or
 * <code>structuredMessageDefinition</code> recursively.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/StructuredMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StructuredMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents a primitive type node of the complex data structure.
     * </p>
     */
    private PrimitiveMessageDefinition primitiveMessageDefinition;
    /**
     * <p>
     * Represents a list type node of the complex data structure.
     * </p>
     */
    private StructuredMessageListDefinition structuredMessageListDefinition;
    /**
     * <p>
     * Represents a struct type node of the complex data structure.
     * </p>
     */
    private java.util.List<StructuredMessageFieldNameAndDataTypePair> structuredMessageDefinition;

    /**
     * <p>
     * Represents a primitive type node of the complex data structure.
     * </p>
     * 
     * @param primitiveMessageDefinition
     *        Represents a primitive type node of the complex data structure.
     */

    public void setPrimitiveMessageDefinition(PrimitiveMessageDefinition primitiveMessageDefinition) {
        this.primitiveMessageDefinition = primitiveMessageDefinition;
    }

    /**
     * <p>
     * Represents a primitive type node of the complex data structure.
     * </p>
     * 
     * @return Represents a primitive type node of the complex data structure.
     */

    public PrimitiveMessageDefinition getPrimitiveMessageDefinition() {
        return this.primitiveMessageDefinition;
    }

    /**
     * <p>
     * Represents a primitive type node of the complex data structure.
     * </p>
     * 
     * @param primitiveMessageDefinition
     *        Represents a primitive type node of the complex data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessage withPrimitiveMessageDefinition(PrimitiveMessageDefinition primitiveMessageDefinition) {
        setPrimitiveMessageDefinition(primitiveMessageDefinition);
        return this;
    }

    /**
     * <p>
     * Represents a list type node of the complex data structure.
     * </p>
     * 
     * @param structuredMessageListDefinition
     *        Represents a list type node of the complex data structure.
     */

    public void setStructuredMessageListDefinition(StructuredMessageListDefinition structuredMessageListDefinition) {
        this.structuredMessageListDefinition = structuredMessageListDefinition;
    }

    /**
     * <p>
     * Represents a list type node of the complex data structure.
     * </p>
     * 
     * @return Represents a list type node of the complex data structure.
     */

    public StructuredMessageListDefinition getStructuredMessageListDefinition() {
        return this.structuredMessageListDefinition;
    }

    /**
     * <p>
     * Represents a list type node of the complex data structure.
     * </p>
     * 
     * @param structuredMessageListDefinition
     *        Represents a list type node of the complex data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessage withStructuredMessageListDefinition(StructuredMessageListDefinition structuredMessageListDefinition) {
        setStructuredMessageListDefinition(structuredMessageListDefinition);
        return this;
    }

    /**
     * <p>
     * Represents a struct type node of the complex data structure.
     * </p>
     * 
     * @return Represents a struct type node of the complex data structure.
     */

    public java.util.List<StructuredMessageFieldNameAndDataTypePair> getStructuredMessageDefinition() {
        return structuredMessageDefinition;
    }

    /**
     * <p>
     * Represents a struct type node of the complex data structure.
     * </p>
     * 
     * @param structuredMessageDefinition
     *        Represents a struct type node of the complex data structure.
     */

    public void setStructuredMessageDefinition(java.util.Collection<StructuredMessageFieldNameAndDataTypePair> structuredMessageDefinition) {
        if (structuredMessageDefinition == null) {
            this.structuredMessageDefinition = null;
            return;
        }

        this.structuredMessageDefinition = new java.util.ArrayList<StructuredMessageFieldNameAndDataTypePair>(structuredMessageDefinition);
    }

    /**
     * <p>
     * Represents a struct type node of the complex data structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStructuredMessageDefinition(java.util.Collection)} or
     * {@link #withStructuredMessageDefinition(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param structuredMessageDefinition
     *        Represents a struct type node of the complex data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessage withStructuredMessageDefinition(StructuredMessageFieldNameAndDataTypePair... structuredMessageDefinition) {
        if (this.structuredMessageDefinition == null) {
            setStructuredMessageDefinition(new java.util.ArrayList<StructuredMessageFieldNameAndDataTypePair>(structuredMessageDefinition.length));
        }
        for (StructuredMessageFieldNameAndDataTypePair ele : structuredMessageDefinition) {
            this.structuredMessageDefinition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents a struct type node of the complex data structure.
     * </p>
     * 
     * @param structuredMessageDefinition
     *        Represents a struct type node of the complex data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessage withStructuredMessageDefinition(java.util.Collection<StructuredMessageFieldNameAndDataTypePair> structuredMessageDefinition) {
        setStructuredMessageDefinition(structuredMessageDefinition);
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
        if (getPrimitiveMessageDefinition() != null)
            sb.append("PrimitiveMessageDefinition: ").append(getPrimitiveMessageDefinition()).append(",");
        if (getStructuredMessageListDefinition() != null)
            sb.append("StructuredMessageListDefinition: ").append(getStructuredMessageListDefinition()).append(",");
        if (getStructuredMessageDefinition() != null)
            sb.append("StructuredMessageDefinition: ").append(getStructuredMessageDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StructuredMessage == false)
            return false;
        StructuredMessage other = (StructuredMessage) obj;
        if (other.getPrimitiveMessageDefinition() == null ^ this.getPrimitiveMessageDefinition() == null)
            return false;
        if (other.getPrimitiveMessageDefinition() != null && other.getPrimitiveMessageDefinition().equals(this.getPrimitiveMessageDefinition()) == false)
            return false;
        if (other.getStructuredMessageListDefinition() == null ^ this.getStructuredMessageListDefinition() == null)
            return false;
        if (other.getStructuredMessageListDefinition() != null
                && other.getStructuredMessageListDefinition().equals(this.getStructuredMessageListDefinition()) == false)
            return false;
        if (other.getStructuredMessageDefinition() == null ^ this.getStructuredMessageDefinition() == null)
            return false;
        if (other.getStructuredMessageDefinition() != null && other.getStructuredMessageDefinition().equals(this.getStructuredMessageDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimitiveMessageDefinition() == null) ? 0 : getPrimitiveMessageDefinition().hashCode());
        hashCode = prime * hashCode + ((getStructuredMessageListDefinition() == null) ? 0 : getStructuredMessageListDefinition().hashCode());
        hashCode = prime * hashCode + ((getStructuredMessageDefinition() == null) ? 0 : getStructuredMessageDefinition().hashCode());
        return hashCode;
    }

    @Override
    public StructuredMessage clone() {
        try {
            return (StructuredMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.StructuredMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
