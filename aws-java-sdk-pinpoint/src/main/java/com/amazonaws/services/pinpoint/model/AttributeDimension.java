/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies attribute-based criteria for including or excluding endpoints from a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/AttributeDimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     */
    private String attributeType;
    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property,
     * endpoints are included or excluded from the segment if their attribute values match the criteria values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     * 
     * @param attributeType
     *        The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are
     *        included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * @see AttributeType
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     * 
     * @return The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are
     *         included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * @see AttributeType
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     * 
     * @param attributeType
     *        The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are
     *        included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public AttributeDimension withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     * 
     * @param attributeType
     *        The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are
     *        included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * @see AttributeType
     */

    public void setAttributeType(AttributeType attributeType) {
        withAttributeType(attributeType);
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included
     * in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * </p>
     * 
     * @param attributeType
     *        The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are
     *        included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public AttributeDimension withAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
        return this;
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property,
     * endpoints are included or excluded from the segment if their attribute values match the criteria values.
     * </p>
     * 
     * @return The criteria values to use for the segment dimension. Depending on the value of the AttributeType
     *         property, endpoints are included or excluded from the segment if their attribute values match the
     *         criteria values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property,
     * endpoints are included or excluded from the segment if their attribute values match the criteria values.
     * </p>
     * 
     * @param values
     *        The criteria values to use for the segment dimension. Depending on the value of the AttributeType
     *        property, endpoints are included or excluded from the segment if their attribute values match the criteria
     *        values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property,
     * endpoints are included or excluded from the segment if their attribute values match the criteria values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The criteria values to use for the segment dimension. Depending on the value of the AttributeType
     *        property, endpoints are included or excluded from the segment if their attribute values match the criteria
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeDimension withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property,
     * endpoints are included or excluded from the segment if their attribute values match the criteria values.
     * </p>
     * 
     * @param values
     *        The criteria values to use for the segment dimension. Depending on the value of the AttributeType
     *        property, endpoints are included or excluded from the segment if their attribute values match the criteria
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeDimension withValues(java.util.Collection<String> values) {
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
        if (getAttributeType() != null)
            sb.append("AttributeType: ").append(getAttributeType()).append(",");
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

        if (obj instanceof AttributeDimension == false)
            return false;
        AttributeDimension other = (AttributeDimension) obj;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false)
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

        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public AttributeDimension clone() {
        try {
            return (AttributeDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.AttributeDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
