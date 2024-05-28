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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The minimum, maximum, average, and sum.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/Stats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The average of the usage statistics.
     * </p>
     */
    private Double avg;
    /**
     * <p>
     * The maximum among the usage statistics.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * The minimum of the usage statistics.
     * </p>
     */
    private Double min;
    /**
     * <p>
     * The sum of the usage statistics.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The average of the usage statistics.
     * </p>
     * 
     * @param avg
     *        The average of the usage statistics.
     */

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    /**
     * <p>
     * The average of the usage statistics.
     * </p>
     * 
     * @return The average of the usage statistics.
     */

    public Double getAvg() {
        return this.avg;
    }

    /**
     * <p>
     * The average of the usage statistics.
     * </p>
     * 
     * @param avg
     *        The average of the usage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stats withAvg(Double avg) {
        setAvg(avg);
        return this;
    }

    /**
     * <p>
     * The maximum among the usage statistics.
     * </p>
     * 
     * @param max
     *        The maximum among the usage statistics.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum among the usage statistics.
     * </p>
     * 
     * @return The maximum among the usage statistics.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum among the usage statistics.
     * </p>
     * 
     * @param max
     *        The maximum among the usage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stats withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum of the usage statistics.
     * </p>
     * 
     * @param min
     *        The minimum of the usage statistics.
     */

    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum of the usage statistics.
     * </p>
     * 
     * @return The minimum of the usage statistics.
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum of the usage statistics.
     * </p>
     * 
     * @param min
     *        The minimum of the usage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stats withMin(Double min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The sum of the usage statistics.
     * </p>
     * 
     * @param sum
     *        The sum of the usage statistics.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the usage statistics.
     * </p>
     * 
     * @return The sum of the usage statistics.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the usage statistics.
     * </p>
     * 
     * @param sum
     *        The sum of the usage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stats withSum(Double sum) {
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
        if (getAvg() != null)
            sb.append("Avg: ").append(getAvg()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
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

        if (obj instanceof Stats == false)
            return false;
        Stats other = (Stats) obj;
        if (other.getAvg() == null ^ this.getAvg() == null)
            return false;
        if (other.getAvg() != null && other.getAvg().equals(this.getAvg()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
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

        hashCode = prime * hashCode + ((getAvg() == null) ? 0 : getAvg().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        return hashCode;
    }

    @Override
    public Stats clone() {
        try {
            return (Stats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
