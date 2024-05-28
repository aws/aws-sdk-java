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
 * Filter based on size (in bytes).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/LongRangeType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LongRangeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size start range (in bytes).
     * </p>
     */
    private Long startValue;
    /**
     * <p>
     * The size end range (in bytes).
     * </p>
     */
    private Long endValue;

    /**
     * <p>
     * The size start range (in bytes).
     * </p>
     * 
     * @param startValue
     *        The size start range (in bytes).
     */

    public void setStartValue(Long startValue) {
        this.startValue = startValue;
    }

    /**
     * <p>
     * The size start range (in bytes).
     * </p>
     * 
     * @return The size start range (in bytes).
     */

    public Long getStartValue() {
        return this.startValue;
    }

    /**
     * <p>
     * The size start range (in bytes).
     * </p>
     * 
     * @param startValue
     *        The size start range (in bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongRangeType withStartValue(Long startValue) {
        setStartValue(startValue);
        return this;
    }

    /**
     * <p>
     * The size end range (in bytes).
     * </p>
     * 
     * @param endValue
     *        The size end range (in bytes).
     */

    public void setEndValue(Long endValue) {
        this.endValue = endValue;
    }

    /**
     * <p>
     * The size end range (in bytes).
     * </p>
     * 
     * @return The size end range (in bytes).
     */

    public Long getEndValue() {
        return this.endValue;
    }

    /**
     * <p>
     * The size end range (in bytes).
     * </p>
     * 
     * @param endValue
     *        The size end range (in bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LongRangeType withEndValue(Long endValue) {
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

        if (obj instanceof LongRangeType == false)
            return false;
        LongRangeType other = (LongRangeType) obj;
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
    public LongRangeType clone() {
        try {
            return (LongRangeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.LongRangeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
