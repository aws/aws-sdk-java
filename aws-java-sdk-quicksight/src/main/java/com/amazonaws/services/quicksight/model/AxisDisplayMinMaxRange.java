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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The minimum and maximum setup for an axis display range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisDisplayMinMaxRange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisDisplayMinMaxRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum setup for an axis display range.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The maximum setup for an axis display range.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The minimum setup for an axis display range.
     * </p>
     * 
     * @param minimum
     *        The minimum setup for an axis display range.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum setup for an axis display range.
     * </p>
     * 
     * @return The minimum setup for an axis display range.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum setup for an axis display range.
     * </p>
     * 
     * @param minimum
     *        The minimum setup for an axis display range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayMinMaxRange withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum setup for an axis display range.
     * </p>
     * 
     * @param maximum
     *        The maximum setup for an axis display range.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum setup for an axis display range.
     * </p>
     * 
     * @return The maximum setup for an axis display range.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum setup for an axis display range.
     * </p>
     * 
     * @param maximum
     *        The maximum setup for an axis display range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayMinMaxRange withMaximum(Double maximum) {
        setMaximum(maximum);
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
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisDisplayMinMaxRange == false)
            return false;
        AxisDisplayMinMaxRange other = (AxisDisplayMinMaxRange) obj;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        return hashCode;
    }

    @Override
    public AxisDisplayMinMaxRange clone() {
        try {
            return (AxisDisplayMinMaxRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisDisplayMinMaxRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
