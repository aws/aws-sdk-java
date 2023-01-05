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
 * An object that specifies information about time series property values. This object is used and consumed by the <a
 * href="https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_BatchPutPropertyValues.html">
 * BatchPutPropertyValues</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyValueEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValueEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about the entity that has the property.
     * </p>
     */
    private EntityPropertyReference entityPropertyReference;
    /**
     * <p>
     * A list of objects that specify time series property values.
     * </p>
     */
    private java.util.List<PropertyValue> propertyValues;

    /**
     * <p>
     * An object that contains information about the entity that has the property.
     * </p>
     * 
     * @param entityPropertyReference
     *        An object that contains information about the entity that has the property.
     */

    public void setEntityPropertyReference(EntityPropertyReference entityPropertyReference) {
        this.entityPropertyReference = entityPropertyReference;
    }

    /**
     * <p>
     * An object that contains information about the entity that has the property.
     * </p>
     * 
     * @return An object that contains information about the entity that has the property.
     */

    public EntityPropertyReference getEntityPropertyReference() {
        return this.entityPropertyReference;
    }

    /**
     * <p>
     * An object that contains information about the entity that has the property.
     * </p>
     * 
     * @param entityPropertyReference
     *        An object that contains information about the entity that has the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueEntry withEntityPropertyReference(EntityPropertyReference entityPropertyReference) {
        setEntityPropertyReference(entityPropertyReference);
        return this;
    }

    /**
     * <p>
     * A list of objects that specify time series property values.
     * </p>
     * 
     * @return A list of objects that specify time series property values.
     */

    public java.util.List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * A list of objects that specify time series property values.
     * </p>
     * 
     * @param propertyValues
     *        A list of objects that specify time series property values.
     */

    public void setPropertyValues(java.util.Collection<PropertyValue> propertyValues) {
        if (propertyValues == null) {
            this.propertyValues = null;
            return;
        }

        this.propertyValues = new java.util.ArrayList<PropertyValue>(propertyValues);
    }

    /**
     * <p>
     * A list of objects that specify time series property values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyValues(java.util.Collection)} or {@link #withPropertyValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param propertyValues
     *        A list of objects that specify time series property values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueEntry withPropertyValues(PropertyValue... propertyValues) {
        if (this.propertyValues == null) {
            setPropertyValues(new java.util.ArrayList<PropertyValue>(propertyValues.length));
        }
        for (PropertyValue ele : propertyValues) {
            this.propertyValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that specify time series property values.
     * </p>
     * 
     * @param propertyValues
     *        A list of objects that specify time series property values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueEntry withPropertyValues(java.util.Collection<PropertyValue> propertyValues) {
        setPropertyValues(propertyValues);
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
        if (getEntityPropertyReference() != null)
            sb.append("EntityPropertyReference: ").append(getEntityPropertyReference()).append(",");
        if (getPropertyValues() != null)
            sb.append("PropertyValues: ").append(getPropertyValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValueEntry == false)
            return false;
        PropertyValueEntry other = (PropertyValueEntry) obj;
        if (other.getEntityPropertyReference() == null ^ this.getEntityPropertyReference() == null)
            return false;
        if (other.getEntityPropertyReference() != null && other.getEntityPropertyReference().equals(this.getEntityPropertyReference()) == false)
            return false;
        if (other.getPropertyValues() == null ^ this.getPropertyValues() == null)
            return false;
        if (other.getPropertyValues() != null && other.getPropertyValues().equals(this.getPropertyValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityPropertyReference() == null) ? 0 : getEntityPropertyReference().hashCode());
        hashCode = prime * hashCode + ((getPropertyValues() == null) ? 0 : getPropertyValues().hashCode());
        return hashCode;
    }

    @Override
    public PropertyValueEntry clone() {
        try {
            return (PropertyValueEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyValueEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
