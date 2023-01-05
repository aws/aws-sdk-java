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
 * An aggregation based on the percentile of values in a dimension or measure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PercentileAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PercentileAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the median
     * value of the measure.
     * </p>
     */
    private Double percentileValue;

    /**
     * <p>
     * The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the median
     * value of the measure.
     * </p>
     * 
     * @param percentileValue
     *        The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the
     *        median value of the measure.
     */

    public void setPercentileValue(Double percentileValue) {
        this.percentileValue = percentileValue;
    }

    /**
     * <p>
     * The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the median
     * value of the measure.
     * </p>
     * 
     * @return The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the
     *         median value of the measure.
     */

    public Double getPercentileValue() {
        return this.percentileValue;
    }

    /**
     * <p>
     * The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the median
     * value of the measure.
     * </p>
     * 
     * @param percentileValue
     *        The percentile value. This value can be any numeric constant 0–100. A percentile value of 50 computes the
     *        median value of the measure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PercentileAggregation withPercentileValue(Double percentileValue) {
        setPercentileValue(percentileValue);
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
        if (getPercentileValue() != null)
            sb.append("PercentileValue: ").append(getPercentileValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PercentileAggregation == false)
            return false;
        PercentileAggregation other = (PercentileAggregation) obj;
        if (other.getPercentileValue() == null ^ this.getPercentileValue() == null)
            return false;
        if (other.getPercentileValue() != null && other.getPercentileValue().equals(this.getPercentileValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentileValue() == null) ? 0 : getPercentileValue().hashCode());
        return hashCode;
    }

    @Override
    public PercentileAggregation clone() {
        try {
            return (PercentileAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PercentileAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
