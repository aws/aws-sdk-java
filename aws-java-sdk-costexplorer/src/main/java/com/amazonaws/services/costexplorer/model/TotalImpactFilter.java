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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters cost anomalies based on the total impact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TotalImpactFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TotalImpactFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparing value used in the filter.
     * </p>
     */
    private String numericOperator;
    /**
     * <p>
     * The lower bound dollar value used in the filter.
     * </p>
     */
    private Double startValue;
    /**
     * <p>
     * The upper bound dollar value used in the filter.
     * </p>
     */
    private Double endValue;

    /**
     * <p>
     * The comparing value used in the filter.
     * </p>
     * 
     * @param numericOperator
     *        The comparing value used in the filter.
     * @see NumericOperator
     */

    public void setNumericOperator(String numericOperator) {
        this.numericOperator = numericOperator;
    }

    /**
     * <p>
     * The comparing value used in the filter.
     * </p>
     * 
     * @return The comparing value used in the filter.
     * @see NumericOperator
     */

    public String getNumericOperator() {
        return this.numericOperator;
    }

    /**
     * <p>
     * The comparing value used in the filter.
     * </p>
     * 
     * @param numericOperator
     *        The comparing value used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericOperator
     */

    public TotalImpactFilter withNumericOperator(String numericOperator) {
        setNumericOperator(numericOperator);
        return this;
    }

    /**
     * <p>
     * The comparing value used in the filter.
     * </p>
     * 
     * @param numericOperator
     *        The comparing value used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericOperator
     */

    public TotalImpactFilter withNumericOperator(NumericOperator numericOperator) {
        this.numericOperator = numericOperator.toString();
        return this;
    }

    /**
     * <p>
     * The lower bound dollar value used in the filter.
     * </p>
     * 
     * @param startValue
     *        The lower bound dollar value used in the filter.
     */

    public void setStartValue(Double startValue) {
        this.startValue = startValue;
    }

    /**
     * <p>
     * The lower bound dollar value used in the filter.
     * </p>
     * 
     * @return The lower bound dollar value used in the filter.
     */

    public Double getStartValue() {
        return this.startValue;
    }

    /**
     * <p>
     * The lower bound dollar value used in the filter.
     * </p>
     * 
     * @param startValue
     *        The lower bound dollar value used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalImpactFilter withStartValue(Double startValue) {
        setStartValue(startValue);
        return this;
    }

    /**
     * <p>
     * The upper bound dollar value used in the filter.
     * </p>
     * 
     * @param endValue
     *        The upper bound dollar value used in the filter.
     */

    public void setEndValue(Double endValue) {
        this.endValue = endValue;
    }

    /**
     * <p>
     * The upper bound dollar value used in the filter.
     * </p>
     * 
     * @return The upper bound dollar value used in the filter.
     */

    public Double getEndValue() {
        return this.endValue;
    }

    /**
     * <p>
     * The upper bound dollar value used in the filter.
     * </p>
     * 
     * @param endValue
     *        The upper bound dollar value used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalImpactFilter withEndValue(Double endValue) {
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
        if (getNumericOperator() != null)
            sb.append("NumericOperator: ").append(getNumericOperator()).append(",");
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

        if (obj instanceof TotalImpactFilter == false)
            return false;
        TotalImpactFilter other = (TotalImpactFilter) obj;
        if (other.getNumericOperator() == null ^ this.getNumericOperator() == null)
            return false;
        if (other.getNumericOperator() != null && other.getNumericOperator().equals(this.getNumericOperator()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getNumericOperator() == null) ? 0 : getNumericOperator().hashCode());
        hashCode = prime * hashCode + ((getStartValue() == null) ? 0 : getStartValue().hashCode());
        hashCode = prime * hashCode + ((getEndValue() == null) ? 0 : getEndValue().hashCode());
        return hashCode;
    }

    @Override
    public TotalImpactFilter clone() {
        try {
            return (TotalImpactFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.TotalImpactFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
