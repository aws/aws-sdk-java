/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Internal only API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/StatisticSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatisticSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private Integer sampleCount;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param maximum
     *        Internal only API.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param maximum
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticSet withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param minimum
     *        Internal only API.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param minimum
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticSet withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param sampleCount
     *        Internal only API.
     */

    public void setSampleCount(Integer sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public Integer getSampleCount() {
        return this.sampleCount;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param sampleCount
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticSet withSampleCount(Integer sampleCount) {
        setSampleCount(sampleCount);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param sum
     *        Internal only API.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param sum
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticSet withSum(Double sum) {
        setSum(sum);
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
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getSampleCount() != null)
            sb.append("SampleCount: ").append(getSampleCount()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticSet == false)
            return false;
        StatisticSet other = (StatisticSet) obj;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null && other.getSampleCount().equals(this.getSampleCount()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        return hashCode;
    }

    @Override
    public StatisticSet clone() {
        try {
            return (StatisticSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.StatisticSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
