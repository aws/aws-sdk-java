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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides statistics for each data field imported to an Amazon Forecast dataset with the <a>CreateDatasetImportJob</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/Statistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of values in the field.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The number of distinct values in the field.
     * </p>
     */
    private Integer countDistinct;
    /**
     * <p>
     * The number of null values in the field.
     * </p>
     */
    private Integer countNull;
    /**
     * <p>
     * The number of NAN (not a number) values in the field.
     * </p>
     */
    private Integer countNan;
    /**
     * <p>
     * For a numeric field, the minimum value in the field.
     * </p>
     */
    private String min;
    /**
     * <p>
     * For a numeric field, the maximum value in the field.
     * </p>
     */
    private String max;
    /**
     * <p>
     * For a numeric field, the average value in the field.
     * </p>
     */
    private Double avg;
    /**
     * <p>
     * For a numeric field, the standard deviation.
     * </p>
     */
    private Double stddev;

    /**
     * <p>
     * The number of values in the field.
     * </p>
     * 
     * @param count
     *        The number of values in the field.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of values in the field.
     * </p>
     * 
     * @return The number of values in the field.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of values in the field.
     * </p>
     * 
     * @param count
     *        The number of values in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of distinct values in the field.
     * </p>
     * 
     * @param countDistinct
     *        The number of distinct values in the field.
     */

    public void setCountDistinct(Integer countDistinct) {
        this.countDistinct = countDistinct;
    }

    /**
     * <p>
     * The number of distinct values in the field.
     * </p>
     * 
     * @return The number of distinct values in the field.
     */

    public Integer getCountDistinct() {
        return this.countDistinct;
    }

    /**
     * <p>
     * The number of distinct values in the field.
     * </p>
     * 
     * @param countDistinct
     *        The number of distinct values in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCountDistinct(Integer countDistinct) {
        setCountDistinct(countDistinct);
        return this;
    }

    /**
     * <p>
     * The number of null values in the field.
     * </p>
     * 
     * @param countNull
     *        The number of null values in the field.
     */

    public void setCountNull(Integer countNull) {
        this.countNull = countNull;
    }

    /**
     * <p>
     * The number of null values in the field.
     * </p>
     * 
     * @return The number of null values in the field.
     */

    public Integer getCountNull() {
        return this.countNull;
    }

    /**
     * <p>
     * The number of null values in the field.
     * </p>
     * 
     * @param countNull
     *        The number of null values in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCountNull(Integer countNull) {
        setCountNull(countNull);
        return this;
    }

    /**
     * <p>
     * The number of NAN (not a number) values in the field.
     * </p>
     * 
     * @param countNan
     *        The number of NAN (not a number) values in the field.
     */

    public void setCountNan(Integer countNan) {
        this.countNan = countNan;
    }

    /**
     * <p>
     * The number of NAN (not a number) values in the field.
     * </p>
     * 
     * @return The number of NAN (not a number) values in the field.
     */

    public Integer getCountNan() {
        return this.countNan;
    }

    /**
     * <p>
     * The number of NAN (not a number) values in the field.
     * </p>
     * 
     * @param countNan
     *        The number of NAN (not a number) values in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCountNan(Integer countNan) {
        setCountNan(countNan);
        return this;
    }

    /**
     * <p>
     * For a numeric field, the minimum value in the field.
     * </p>
     * 
     * @param min
     *        For a numeric field, the minimum value in the field.
     */

    public void setMin(String min) {
        this.min = min;
    }

    /**
     * <p>
     * For a numeric field, the minimum value in the field.
     * </p>
     * 
     * @return For a numeric field, the minimum value in the field.
     */

    public String getMin() {
        return this.min;
    }

    /**
     * <p>
     * For a numeric field, the minimum value in the field.
     * </p>
     * 
     * @param min
     *        For a numeric field, the minimum value in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withMin(String min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * For a numeric field, the maximum value in the field.
     * </p>
     * 
     * @param max
     *        For a numeric field, the maximum value in the field.
     */

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * <p>
     * For a numeric field, the maximum value in the field.
     * </p>
     * 
     * @return For a numeric field, the maximum value in the field.
     */

    public String getMax() {
        return this.max;
    }

    /**
     * <p>
     * For a numeric field, the maximum value in the field.
     * </p>
     * 
     * @param max
     *        For a numeric field, the maximum value in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withMax(String max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * For a numeric field, the average value in the field.
     * </p>
     * 
     * @param avg
     *        For a numeric field, the average value in the field.
     */

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    /**
     * <p>
     * For a numeric field, the average value in the field.
     * </p>
     * 
     * @return For a numeric field, the average value in the field.
     */

    public Double getAvg() {
        return this.avg;
    }

    /**
     * <p>
     * For a numeric field, the average value in the field.
     * </p>
     * 
     * @param avg
     *        For a numeric field, the average value in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withAvg(Double avg) {
        setAvg(avg);
        return this;
    }

    /**
     * <p>
     * For a numeric field, the standard deviation.
     * </p>
     * 
     * @param stddev
     *        For a numeric field, the standard deviation.
     */

    public void setStddev(Double stddev) {
        this.stddev = stddev;
    }

    /**
     * <p>
     * For a numeric field, the standard deviation.
     * </p>
     * 
     * @return For a numeric field, the standard deviation.
     */

    public Double getStddev() {
        return this.stddev;
    }

    /**
     * <p>
     * For a numeric field, the standard deviation.
     * </p>
     * 
     * @param stddev
     *        For a numeric field, the standard deviation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withStddev(Double stddev) {
        setStddev(stddev);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getCountDistinct() != null)
            sb.append("CountDistinct: ").append(getCountDistinct()).append(",");
        if (getCountNull() != null)
            sb.append("CountNull: ").append(getCountNull()).append(",");
        if (getCountNan() != null)
            sb.append("CountNan: ").append(getCountNan()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getAvg() != null)
            sb.append("Avg: ").append(getAvg()).append(",");
        if (getStddev() != null)
            sb.append("Stddev: ").append(getStddev());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCountDistinct() == null ^ this.getCountDistinct() == null)
            return false;
        if (other.getCountDistinct() != null && other.getCountDistinct().equals(this.getCountDistinct()) == false)
            return false;
        if (other.getCountNull() == null ^ this.getCountNull() == null)
            return false;
        if (other.getCountNull() != null && other.getCountNull().equals(this.getCountNull()) == false)
            return false;
        if (other.getCountNan() == null ^ this.getCountNan() == null)
            return false;
        if (other.getCountNan() != null && other.getCountNan().equals(this.getCountNan()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getAvg() == null ^ this.getAvg() == null)
            return false;
        if (other.getAvg() != null && other.getAvg().equals(this.getAvg()) == false)
            return false;
        if (other.getStddev() == null ^ this.getStddev() == null)
            return false;
        if (other.getStddev() != null && other.getStddev().equals(this.getStddev()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCountDistinct() == null) ? 0 : getCountDistinct().hashCode());
        hashCode = prime * hashCode + ((getCountNull() == null) ? 0 : getCountNull().hashCode());
        hashCode = prime * hashCode + ((getCountNan() == null) ? 0 : getCountNan().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getAvg() == null) ? 0 : getAvg().hashCode());
        hashCode = prime * hashCode + ((getStddev() == null) ? 0 : getStddev().hashCode());
        return hashCode;
    }

    @Override
    public Statistics clone() {
        try {
            return (Statistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.StatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
