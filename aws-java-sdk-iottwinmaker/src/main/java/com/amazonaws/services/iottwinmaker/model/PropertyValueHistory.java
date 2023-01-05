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
 * The history of values for a time series property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyValueHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValueHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that uniquely identifies an entity property.
     * </p>
     */
    private EntityPropertyReference entityPropertyReference;
    /**
     * <p>
     * A list of objects that contain information about the values in the history of a time series property.
     * </p>
     */
    private java.util.List<PropertyValue> values;

    /**
     * <p>
     * An object that uniquely identifies an entity property.
     * </p>
     * 
     * @param entityPropertyReference
     *        An object that uniquely identifies an entity property.
     */

    public void setEntityPropertyReference(EntityPropertyReference entityPropertyReference) {
        this.entityPropertyReference = entityPropertyReference;
    }

    /**
     * <p>
     * An object that uniquely identifies an entity property.
     * </p>
     * 
     * @return An object that uniquely identifies an entity property.
     */

    public EntityPropertyReference getEntityPropertyReference() {
        return this.entityPropertyReference;
    }

    /**
     * <p>
     * An object that uniquely identifies an entity property.
     * </p>
     * 
     * @param entityPropertyReference
     *        An object that uniquely identifies an entity property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueHistory withEntityPropertyReference(EntityPropertyReference entityPropertyReference) {
        setEntityPropertyReference(entityPropertyReference);
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the values in the history of a time series property.
     * </p>
     * 
     * @return A list of objects that contain information about the values in the history of a time series property.
     */

    public java.util.List<PropertyValue> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of objects that contain information about the values in the history of a time series property.
     * </p>
     * 
     * @param values
     *        A list of objects that contain information about the values in the history of a time series property.
     */

    public void setValues(java.util.Collection<PropertyValue> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<PropertyValue>(values);
    }

    /**
     * <p>
     * A list of objects that contain information about the values in the history of a time series property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of objects that contain information about the values in the history of a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueHistory withValues(PropertyValue... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<PropertyValue>(values.length));
        }
        for (PropertyValue ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the values in the history of a time series property.
     * </p>
     * 
     * @param values
     *        A list of objects that contain information about the values in the history of a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValueHistory withValues(java.util.Collection<PropertyValue> values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValueHistory == false)
            return false;
        PropertyValueHistory other = (PropertyValueHistory) obj;
        if (other.getEntityPropertyReference() == null ^ this.getEntityPropertyReference() == null)
            return false;
        if (other.getEntityPropertyReference() != null && other.getEntityPropertyReference().equals(this.getEntityPropertyReference()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityPropertyReference() == null) ? 0 : getEntityPropertyReference().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public PropertyValueHistory clone() {
        try {
            return (PropertyValueHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyValueHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
