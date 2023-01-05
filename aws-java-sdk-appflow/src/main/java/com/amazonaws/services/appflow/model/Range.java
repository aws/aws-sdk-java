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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The range of values that the property supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/Range" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Range implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum value supported by the field.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * Minimum value supported by the field.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * Maximum value supported by the field.
     * </p>
     * 
     * @param maximum
     *        Maximum value supported by the field.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * Maximum value supported by the field.
     * </p>
     * 
     * @return Maximum value supported by the field.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * Maximum value supported by the field.
     * </p>
     * 
     * @param maximum
     *        Maximum value supported by the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * Minimum value supported by the field.
     * </p>
     * 
     * @param minimum
     *        Minimum value supported by the field.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * Minimum value supported by the field.
     * </p>
     * 
     * @return Minimum value supported by the field.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * Minimum value supported by the field.
     * </p>
     * 
     * @param minimum
     *        Minimum value supported by the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withMinimum(Double minimum) {
        setMinimum(minimum);
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
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Range == false)
            return false;
        Range other = (Range) obj;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        return hashCode;
    }

    @Override
    public Range clone() {
        try {
            return (Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.RangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
