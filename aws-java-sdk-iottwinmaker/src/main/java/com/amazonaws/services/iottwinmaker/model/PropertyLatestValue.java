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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The latest value of the property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyLatestValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyLatestValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that specifies information about a property.&gt;
     * </p>
     */
    private EntityPropertyReference propertyReference;
    /**
     * <p>
     * The value of the property.
     * </p>
     */
    private DataValue propertyValue;

    /**
     * <p>
     * An object that specifies information about a property.&gt;
     * </p>
     * 
     * @param propertyReference
     *        An object that specifies information about a property.&gt;
     */

    public void setPropertyReference(EntityPropertyReference propertyReference) {
        this.propertyReference = propertyReference;
    }

    /**
     * <p>
     * An object that specifies information about a property.&gt;
     * </p>
     * 
     * @return An object that specifies information about a property.&gt;
     */

    public EntityPropertyReference getPropertyReference() {
        return this.propertyReference;
    }

    /**
     * <p>
     * An object that specifies information about a property.&gt;
     * </p>
     * 
     * @param propertyReference
     *        An object that specifies information about a property.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyLatestValue withPropertyReference(EntityPropertyReference propertyReference) {
        setPropertyReference(propertyReference);
        return this;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param propertyValue
     *        The value of the property.
     */

    public void setPropertyValue(DataValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @return The value of the property.
     */

    public DataValue getPropertyValue() {
        return this.propertyValue;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * 
     * @param propertyValue
     *        The value of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyLatestValue withPropertyValue(DataValue propertyValue) {
        setPropertyValue(propertyValue);
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
        if (getPropertyReference() != null)
            sb.append("PropertyReference: ").append(getPropertyReference()).append(",");
        if (getPropertyValue() != null)
            sb.append("PropertyValue: ").append(getPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyLatestValue == false)
            return false;
        PropertyLatestValue other = (PropertyLatestValue) obj;
        if (other.getPropertyReference() == null ^ this.getPropertyReference() == null)
            return false;
        if (other.getPropertyReference() != null && other.getPropertyReference().equals(this.getPropertyReference()) == false)
            return false;
        if (other.getPropertyValue() == null ^ this.getPropertyValue() == null)
            return false;
        if (other.getPropertyValue() != null && other.getPropertyValue().equals(this.getPropertyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyReference() == null) ? 0 : getPropertyReference().hashCode());
        hashCode = prime * hashCode + ((getPropertyValue() == null) ? 0 : getPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public PropertyLatestValue clone() {
        try {
            return (PropertyLatestValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyLatestValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
