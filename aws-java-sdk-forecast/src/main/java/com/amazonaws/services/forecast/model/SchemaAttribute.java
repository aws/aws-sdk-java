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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute of a schema, which defines a field of a dataset. A schema attribute is required for every field in a
 * dataset. The <a>Schema</a> object contains an array of <code>SchemaAttribute</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/SchemaAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dataset field.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The data type of the field.
     * </p>
     */
    private String attributeType;

    /**
     * <p>
     * The name of the dataset field.
     * </p>
     * 
     * @param attributeName
     *        The name of the dataset field.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the dataset field.
     * </p>
     * 
     * @return The name of the dataset field.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the dataset field.
     * </p>
     * 
     * @param attributeName
     *        The name of the dataset field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttribute withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * 
     * @param attributeType
     *        The data type of the field.
     * @see AttributeType
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * 
     * @return The data type of the field.
     * @see AttributeType
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * 
     * @param attributeType
     *        The data type of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public SchemaAttribute withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * <p>
     * The data type of the field.
     * </p>
     * 
     * @param attributeType
     *        The data type of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public SchemaAttribute withAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeType() != null)
            sb.append("AttributeType: ").append(getAttributeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaAttribute == false)
            return false;
        SchemaAttribute other = (SchemaAttribute) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        return hashCode;
    }

    @Override
    public SchemaAttribute clone() {
        try {
            return (SchemaAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.SchemaAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
