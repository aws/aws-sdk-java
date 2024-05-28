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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An integer range that has a minimum and maximum value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/IntegerRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegerRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A maximum value.
     * </p>
     */
    private Integer maximum;
    /**
     * <p>
     * A minimum value.
     * </p>
     */
    private Integer minimum;

    /**
     * <p>
     * A maximum value.
     * </p>
     * 
     * @param maximum
     *        A maximum value.
     */

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * A maximum value.
     * </p>
     * 
     * @return A maximum value.
     */

    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * A maximum value.
     * </p>
     * 
     * @param maximum
     *        A maximum value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerRange withMaximum(Integer maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * A minimum value.
     * </p>
     * 
     * @param minimum
     *        A minimum value.
     */

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * A minimum value.
     * </p>
     * 
     * @return A minimum value.
     */

    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * A minimum value.
     * </p>
     * 
     * @param minimum
     *        A minimum value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerRange withMinimum(Integer minimum) {
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

        if (obj instanceof IntegerRange == false)
            return false;
        IntegerRange other = (IntegerRange) obj;
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
    public IntegerRange clone() {
        try {
            return (IntegerRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.IntegerRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
