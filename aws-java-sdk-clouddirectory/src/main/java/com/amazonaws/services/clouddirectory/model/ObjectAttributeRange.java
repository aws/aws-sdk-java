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
 * A range of attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ObjectAttributeRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectAttributeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the attribute that the attribute range covers.
     * </p>
     */
    private AttributeKey attributeKey;
    /**
     * <p>
     * The range of attribute values being selected.
     * </p>
     */
    private TypedAttributeValueRange range;

    /**
     * <p>
     * The key of the attribute that the attribute range covers.
     * </p>
     * 
     * @param attributeKey
     *        The key of the attribute that the attribute range covers.
     */

    public void setAttributeKey(AttributeKey attributeKey) {
        this.attributeKey = attributeKey;
    }

    /**
     * <p>
     * The key of the attribute that the attribute range covers.
     * </p>
     * 
     * @return The key of the attribute that the attribute range covers.
     */

    public AttributeKey getAttributeKey() {
        return this.attributeKey;
    }

    /**
     * <p>
     * The key of the attribute that the attribute range covers.
     * </p>
     * 
     * @param attributeKey
     *        The key of the attribute that the attribute range covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectAttributeRange withAttributeKey(AttributeKey attributeKey) {
        setAttributeKey(attributeKey);
        return this;
    }

    /**
     * <p>
     * The range of attribute values being selected.
     * </p>
     * 
     * @param range
     *        The range of attribute values being selected.
     */

    public void setRange(TypedAttributeValueRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The range of attribute values being selected.
     * </p>
     * 
     * @return The range of attribute values being selected.
     */

    public TypedAttributeValueRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range of attribute values being selected.
     * </p>
     * 
     * @param range
     *        The range of attribute values being selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectAttributeRange withRange(TypedAttributeValueRange range) {
        setRange(range);
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
        if (getAttributeKey() != null)
            sb.append("AttributeKey: ").append(getAttributeKey()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectAttributeRange == false)
            return false;
        ObjectAttributeRange other = (ObjectAttributeRange) obj;
        if (other.getAttributeKey() == null ^ this.getAttributeKey() == null)
            return false;
        if (other.getAttributeKey() != null && other.getAttributeKey().equals(this.getAttributeKey()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeKey() == null) ? 0 : getAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        return hashCode;
    }

    @Override
    public ObjectAttributeRange clone() {
        try {
            return (ObjectAttributeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.ObjectAttributeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
