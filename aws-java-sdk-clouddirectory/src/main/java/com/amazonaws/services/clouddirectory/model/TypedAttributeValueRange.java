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
 * A range of attribute values. For more information, see <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_range_filters.html">Range
 * Filters</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TypedAttributeValueRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedAttributeValueRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     */
    private String startMode;
    /**
     * <p>
     * The value to start the range at.
     * </p>
     */
    private TypedAttributeValue startValue;
    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     */
    private String endMode;
    /**
     * <p>
     * The attribute value to terminate the range at.
     * </p>
     */
    private TypedAttributeValue endValue;

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     * 
     * @param startMode
     *        The inclusive or exclusive range start.
     * @see RangeMode
     */

    public void setStartMode(String startMode) {
        this.startMode = startMode;
    }

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     * 
     * @return The inclusive or exclusive range start.
     * @see RangeMode
     */

    public String getStartMode() {
        return this.startMode;
    }

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     * 
     * @param startMode
     *        The inclusive or exclusive range start.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RangeMode
     */

    public TypedAttributeValueRange withStartMode(String startMode) {
        setStartMode(startMode);
        return this;
    }

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     * 
     * @param startMode
     *        The inclusive or exclusive range start.
     * @see RangeMode
     */

    public void setStartMode(RangeMode startMode) {
        withStartMode(startMode);
    }

    /**
     * <p>
     * The inclusive or exclusive range start.
     * </p>
     * 
     * @param startMode
     *        The inclusive or exclusive range start.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RangeMode
     */

    public TypedAttributeValueRange withStartMode(RangeMode startMode) {
        this.startMode = startMode.toString();
        return this;
    }

    /**
     * <p>
     * The value to start the range at.
     * </p>
     * 
     * @param startValue
     *        The value to start the range at.
     */

    public void setStartValue(TypedAttributeValue startValue) {
        this.startValue = startValue;
    }

    /**
     * <p>
     * The value to start the range at.
     * </p>
     * 
     * @return The value to start the range at.
     */

    public TypedAttributeValue getStartValue() {
        return this.startValue;
    }

    /**
     * <p>
     * The value to start the range at.
     * </p>
     * 
     * @param startValue
     *        The value to start the range at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValueRange withStartValue(TypedAttributeValue startValue) {
        setStartValue(startValue);
        return this;
    }

    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     * 
     * @param endMode
     *        The inclusive or exclusive range end.
     * @see RangeMode
     */

    public void setEndMode(String endMode) {
        this.endMode = endMode;
    }

    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     * 
     * @return The inclusive or exclusive range end.
     * @see RangeMode
     */

    public String getEndMode() {
        return this.endMode;
    }

    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     * 
     * @param endMode
     *        The inclusive or exclusive range end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RangeMode
     */

    public TypedAttributeValueRange withEndMode(String endMode) {
        setEndMode(endMode);
        return this;
    }

    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     * 
     * @param endMode
     *        The inclusive or exclusive range end.
     * @see RangeMode
     */

    public void setEndMode(RangeMode endMode) {
        withEndMode(endMode);
    }

    /**
     * <p>
     * The inclusive or exclusive range end.
     * </p>
     * 
     * @param endMode
     *        The inclusive or exclusive range end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RangeMode
     */

    public TypedAttributeValueRange withEndMode(RangeMode endMode) {
        this.endMode = endMode.toString();
        return this;
    }

    /**
     * <p>
     * The attribute value to terminate the range at.
     * </p>
     * 
     * @param endValue
     *        The attribute value to terminate the range at.
     */

    public void setEndValue(TypedAttributeValue endValue) {
        this.endValue = endValue;
    }

    /**
     * <p>
     * The attribute value to terminate the range at.
     * </p>
     * 
     * @return The attribute value to terminate the range at.
     */

    public TypedAttributeValue getEndValue() {
        return this.endValue;
    }

    /**
     * <p>
     * The attribute value to terminate the range at.
     * </p>
     * 
     * @param endValue
     *        The attribute value to terminate the range at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValueRange withEndValue(TypedAttributeValue endValue) {
        setEndValue(endValue);
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
        if (getStartMode() != null)
            sb.append("StartMode: ").append(getStartMode()).append(",");
        if (getStartValue() != null)
            sb.append("StartValue: ").append(getStartValue()).append(",");
        if (getEndMode() != null)
            sb.append("EndMode: ").append(getEndMode()).append(",");
        if (getEndValue() != null)
            sb.append("EndValue: ").append(getEndValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedAttributeValueRange == false)
            return false;
        TypedAttributeValueRange other = (TypedAttributeValueRange) obj;
        if (other.getStartMode() == null ^ this.getStartMode() == null)
            return false;
        if (other.getStartMode() != null && other.getStartMode().equals(this.getStartMode()) == false)
            return false;
        if (other.getStartValue() == null ^ this.getStartValue() == null)
            return false;
        if (other.getStartValue() != null && other.getStartValue().equals(this.getStartValue()) == false)
            return false;
        if (other.getEndMode() == null ^ this.getEndMode() == null)
            return false;
        if (other.getEndMode() != null && other.getEndMode().equals(this.getEndMode()) == false)
            return false;
        if (other.getEndValue() == null ^ this.getEndValue() == null)
            return false;
        if (other.getEndValue() != null && other.getEndValue().equals(this.getEndValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartMode() == null) ? 0 : getStartMode().hashCode());
        hashCode = prime * hashCode + ((getStartValue() == null) ? 0 : getStartValue().hashCode());
        hashCode = prime * hashCode + ((getEndMode() == null) ? 0 : getEndMode().hashCode());
        hashCode = prime * hashCode + ((getEndValue() == null) ? 0 : getEndValue().hashCode());
        return hashCode;
    }

    @Override
    public TypedAttributeValueRange clone() {
        try {
            return (TypedAttributeValueRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedAttributeValueRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
