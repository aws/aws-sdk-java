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
 * The action to take on the object attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ObjectAttributeAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectAttributeAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     */
    private String objectAttributeActionType;
    /**
     * <p>
     * The value that you want to update to.
     * </p>
     */
    private TypedAttributeValue objectAttributeUpdateValue;

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     * 
     * @param objectAttributeActionType
     *        A type that can be either <code>Update</code> or <code>Delete</code>.
     * @see UpdateActionType
     */

    public void setObjectAttributeActionType(String objectAttributeActionType) {
        this.objectAttributeActionType = objectAttributeActionType;
    }

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     * 
     * @return A type that can be either <code>Update</code> or <code>Delete</code>.
     * @see UpdateActionType
     */

    public String getObjectAttributeActionType() {
        return this.objectAttributeActionType;
    }

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     * 
     * @param objectAttributeActionType
     *        A type that can be either <code>Update</code> or <code>Delete</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public ObjectAttributeAction withObjectAttributeActionType(String objectAttributeActionType) {
        setObjectAttributeActionType(objectAttributeActionType);
        return this;
    }

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     * 
     * @param objectAttributeActionType
     *        A type that can be either <code>Update</code> or <code>Delete</code>.
     * @see UpdateActionType
     */

    public void setObjectAttributeActionType(UpdateActionType objectAttributeActionType) {
        withObjectAttributeActionType(objectAttributeActionType);
    }

    /**
     * <p>
     * A type that can be either <code>Update</code> or <code>Delete</code>.
     * </p>
     * 
     * @param objectAttributeActionType
     *        A type that can be either <code>Update</code> or <code>Delete</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public ObjectAttributeAction withObjectAttributeActionType(UpdateActionType objectAttributeActionType) {
        this.objectAttributeActionType = objectAttributeActionType.toString();
        return this;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param objectAttributeUpdateValue
     *        The value that you want to update to.
     */

    public void setObjectAttributeUpdateValue(TypedAttributeValue objectAttributeUpdateValue) {
        this.objectAttributeUpdateValue = objectAttributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @return The value that you want to update to.
     */

    public TypedAttributeValue getObjectAttributeUpdateValue() {
        return this.objectAttributeUpdateValue;
    }

    /**
     * <p>
     * The value that you want to update to.
     * </p>
     * 
     * @param objectAttributeUpdateValue
     *        The value that you want to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectAttributeAction withObjectAttributeUpdateValue(TypedAttributeValue objectAttributeUpdateValue) {
        setObjectAttributeUpdateValue(objectAttributeUpdateValue);
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
        if (getObjectAttributeActionType() != null)
            sb.append("ObjectAttributeActionType: ").append(getObjectAttributeActionType()).append(",");
        if (getObjectAttributeUpdateValue() != null)
            sb.append("ObjectAttributeUpdateValue: ").append(getObjectAttributeUpdateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectAttributeAction == false)
            return false;
        ObjectAttributeAction other = (ObjectAttributeAction) obj;
        if (other.getObjectAttributeActionType() == null ^ this.getObjectAttributeActionType() == null)
            return false;
        if (other.getObjectAttributeActionType() != null && other.getObjectAttributeActionType().equals(this.getObjectAttributeActionType()) == false)
            return false;
        if (other.getObjectAttributeUpdateValue() == null ^ this.getObjectAttributeUpdateValue() == null)
            return false;
        if (other.getObjectAttributeUpdateValue() != null && other.getObjectAttributeUpdateValue().equals(this.getObjectAttributeUpdateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectAttributeActionType() == null) ? 0 : getObjectAttributeActionType().hashCode());
        hashCode = prime * hashCode + ((getObjectAttributeUpdateValue() == null) ? 0 : getObjectAttributeUpdateValue().hashCode());
        return hashCode;
    }

    @Override
    public ObjectAttributeAction clone() {
        try {
            return (ObjectAttributeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.ObjectAttributeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
