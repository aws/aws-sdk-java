/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The counter that describes a DDoS attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/SummarizedCounter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SummarizedCounter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The counter name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     */
    private Double max;
    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     */
    private Integer n;
    /**
     * <p>
     * The unit of the counters.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The counter name.
     * </p>
     * 
     * @param name
     *        The counter name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The counter name.
     * </p>
     * 
     * @return The counter name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The counter name.
     * </p>
     * 
     * @param name
     *        The counter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     * 
     * @param max
     *        The maximum value of the counter for a specified time period.
     */

    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     * 
     * @return The maximum value of the counter for a specified time period.
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     * 
     * @param max
     *        The maximum value of the counter for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withMax(Double max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     * 
     * @param average
     *        The average value of the counter for a specified time period.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     * 
     * @return The average value of the counter for a specified time period.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     * 
     * @param average
     *        The average value of the counter for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     * 
     * @param sum
     *        The total of counter values for a specified time period.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     * 
     * @return The total of counter values for a specified time period.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     * 
     * @param sum
     *        The total of counter values for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     * 
     * @param n
     *        The number of counters for a specified time period.
     */

    public void setN(Integer n) {
        this.n = n;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     * 
     * @return The number of counters for a specified time period.
     */

    public Integer getN() {
        return this.n;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     * 
     * @param n
     *        The number of counters for a specified time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withN(Integer n) {
        setN(n);
        return this;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     * 
     * @param unit
     *        The unit of the counters.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     * 
     * @return The unit of the counters.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     * 
     * @param unit
     *        The unit of the counters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummarizedCounter withUnit(String unit) {
        setUnit(unit);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getN() != null)
            sb.append("N: ").append(getN()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummarizedCounter == false)
            return false;
        SummarizedCounter other = (SummarizedCounter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public SummarizedCounter clone() {
        try {
            return (SummarizedCounter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SummarizedCounterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
