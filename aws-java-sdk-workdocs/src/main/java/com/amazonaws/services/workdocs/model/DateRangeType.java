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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters results based on timestamp range (in epochs).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DateRangeType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateRangeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Timestamp range start value (in epochs)
     * </p>
     */
    private java.util.Date startValue;
    /**
     * <p>
     * Timestamp range end value (in epochs).
     * </p>
     */
    private java.util.Date endValue;

    /**
     * <p>
     * Timestamp range start value (in epochs)
     * </p>
     * 
     * @param startValue
     *        Timestamp range start value (in epochs)
     */

    public void setStartValue(java.util.Date startValue) {
        this.startValue = startValue;
    }

    /**
     * <p>
     * Timestamp range start value (in epochs)
     * </p>
     * 
     * @return Timestamp range start value (in epochs)
     */

    public java.util.Date getStartValue() {
        return this.startValue;
    }

    /**
     * <p>
     * Timestamp range start value (in epochs)
     * </p>
     * 
     * @param startValue
     *        Timestamp range start value (in epochs)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRangeType withStartValue(java.util.Date startValue) {
        setStartValue(startValue);
        return this;
    }

    /**
     * <p>
     * Timestamp range end value (in epochs).
     * </p>
     * 
     * @param endValue
     *        Timestamp range end value (in epochs).
     */

    public void setEndValue(java.util.Date endValue) {
        this.endValue = endValue;
    }

    /**
     * <p>
     * Timestamp range end value (in epochs).
     * </p>
     * 
     * @return Timestamp range end value (in epochs).
     */

    public java.util.Date getEndValue() {
        return this.endValue;
    }

    /**
     * <p>
     * Timestamp range end value (in epochs).
     * </p>
     * 
     * @param endValue
     *        Timestamp range end value (in epochs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateRangeType withEndValue(java.util.Date endValue) {
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
        if (getStartValue() != null)
            sb.append("StartValue: ").append(getStartValue()).append(",");
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

        if (obj instanceof DateRangeType == false)
            return false;
        DateRangeType other = (DateRangeType) obj;
        if (other.getStartValue() == null ^ this.getStartValue() == null)
            return false;
        if (other.getStartValue() != null && other.getStartValue().equals(this.getStartValue()) == false)
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

        hashCode = prime * hashCode + ((getStartValue() == null) ? 0 : getStartValue().hashCode());
        hashCode = prime * hashCode + ((getEndValue() == null) ? 0 : getEndValue().hashCode());
        return hashCode;
    }

    @Override
    public DateRangeType clone() {
        try {
            return (DateRangeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.DateRangeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
