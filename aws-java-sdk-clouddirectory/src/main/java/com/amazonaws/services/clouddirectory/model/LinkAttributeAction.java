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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action to take on a typed link attribute value. Updates are only supported for attributes which don’t contribute
 * to link identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/LinkAttributeAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinkAttributeAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * </p>
     */
    private String attributeActionType;
    /**
     * <p>
     * The value that you want to update to.
     * </p>
     */
    private TypedAttributeValue attributeUpdateValue;

    /**
     * <p>
     * A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * </p>
     * 
     * @param attributeActionType
     *        A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * @see UpdateActionType
     */

    public void setAttributeActionType(String attributeActionType) {
        this.attributeActionType = attributeActionType;
    }

    /**
     * <p>
     * A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * </p>
     * 
     * @return A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * @see UpdateActionType
     */

    public String getAttributeActionType() {
        return this.attributeActionType;
    }

    /**
     * <p>
     * A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * </p>
     * 
     * @param attributeActionType
     *        A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public LinkAttributeAction withAttributeActionType(String attributeActionType) {
        setAttributeActionType(attributeActionType);
        return this;
    }

    /**
     * <p>
     * A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * </p>
     * 
     * @param attributeActionType
     *        A type that can be either <code>UPDATE_OR_CREATE</code> or <code>DELETE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public LinkAttributeAction withAttributeActionType(UpdateActionType attributeActionType) {
        this.attributeActionType = attributeActionType.toString();
        return this;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param attributeUpdateValue
     *        The value that you want to update to.
     */

    public void setAttributeUpdateValue(TypedAttributeValue attributeUpdateValue) {
        this.attributeUpdateValue = attributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @return The value that you want to update to.
     */

    public TypedAttributeValue getAttributeUpdateValue() {
        return this.attributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param attributeUpdateValue
     *        The value that you want to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkAttributeAction withAttributeUpdateValue(TypedAttributeValue attributeUpdateValue) {
        setAttributeUpdateValue(attributeUpdateValue);
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
        if (getAttributeActionType() != null)
            sb.append("AttributeActionType: ").append(getAttributeActionType()).append(",");
        if (getAttributeUpdateValue() != null)
            sb.append("AttributeUpdateValue: ").append(getAttributeUpdateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinkAttributeAction == false)
            return false;
        LinkAttributeAction other = (LinkAttributeAction) obj;
        if (other.getAttributeActionType() == null ^ this.getAttributeActionType() == null)
            return false;
        if (other.getAttributeActionType() != null && other.getAttributeActionType().equals(this.getAttributeActionType()) == false)
            return false;
        if (other.getAttributeUpdateValue() == null ^ this.getAttributeUpdateValue() == null)
            return false;
        if (other.getAttributeUpdateValue() != null && other.getAttributeUpdateValue().equals(this.getAttributeUpdateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeActionType() == null) ? 0 : getAttributeActionType().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdateValue() == null) ? 0 : getAttributeUpdateValue().hashCode());
        return hashCode;
    }

    @Override
    public LinkAttributeAction clone() {
        try {
            return (LinkAttributeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.LinkAttributeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
