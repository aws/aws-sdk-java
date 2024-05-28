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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a range constant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RangeConstant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RangeConstant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum value for a range constant.
     * </p>
     */
    private String minimum;
    /**
     * <p>
     * The maximum value for a range constant.
     * </p>
     */
    private String maximum;

    /**
     * <p>
     * The minimum value for a range constant.
     * </p>
     * 
     * @param minimum
     *        The minimum value for a range constant.
     */

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value for a range constant.
     * </p>
     * 
     * @return The minimum value for a range constant.
     */

    public String getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value for a range constant.
     * </p>
     * 
     * @param minimum
     *        The minimum value for a range constant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RangeConstant withMinimum(String minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum value for a range constant.
     * </p>
     * 
     * @param maximum
     *        The maximum value for a range constant.
     */

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value for a range constant.
     * </p>
     * 
     * @return The maximum value for a range constant.
     */

    public String getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value for a range constant.
     * </p>
     * 
     * @param maximum
     *        The maximum value for a range constant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RangeConstant withMaximum(String maximum) {
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

        if (obj instanceof RangeConstant == false)
            return false;
        RangeConstant other = (RangeConstant) obj;
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
    public RangeConstant clone() {
        try {
            return (RangeConstant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RangeConstantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
