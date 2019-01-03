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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The statistics for a field calculated in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     */
    private String min;
    /**
     * <p>
     * The maximum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     */
    private String max;
    /**
     * <p>
     * The number of documents that contain a value in the specified field in the result set.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The number of documents that do not contain a value in the specified field in the result set.
     * </p>
     */
    private Long missing;
    /**
     * <p>
     * The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The sum of all field values in the result set squared.
     * </p>
     */
    private Double sumOfSquares;
    /**
     * <p>
     * The average of the values found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     */
    private String mean;
    /**
     * <p>
     * The standard deviation of the values in the specified field in the result set.
     * </p>
     */
    private Double stddev;

    /**
     * <p>
     * The minimum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param min
     *        The minimum value found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public void setMin(String min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @return The minimum value found in the specified field in the result set.</p>
     *         <p>
     *         If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *         <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit
     *         floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is
     *         the string representation of a date with the format specified in <a
     *         href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public String getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param min
     *        The minimum value found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>min</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>min</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withMin(String min) {
        setMin(min);
        return this;
    }

    /**
     * <p>
     * The maximum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param max
     *        The maximum value found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @return The maximum value found in the specified field in the result set.</p>
     *         <p>
     *         If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *         <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit
     *         floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is
     *         the string representation of a date with the format specified in <a
     *         href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public String getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum value found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param max
     *        The maximum value found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>max</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>max</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withMax(String max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The number of documents that contain a value in the specified field in the result set.
     * </p>
     * 
     * @param count
     *        The number of documents that contain a value in the specified field in the result set.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of documents that contain a value in the specified field in the result set.
     * </p>
     * 
     * @return The number of documents that contain a value in the specified field in the result set.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of documents that contain a value in the specified field in the result set.
     * </p>
     * 
     * @param count
     *        The number of documents that contain a value in the specified field in the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of documents that do not contain a value in the specified field in the result set.
     * </p>
     * 
     * @param missing
     *        The number of documents that do not contain a value in the specified field in the result set.
     */

    public void setMissing(Long missing) {
        this.missing = missing;
    }

    /**
     * <p>
     * The number of documents that do not contain a value in the specified field in the result set.
     * </p>
     * 
     * @return The number of documents that do not contain a value in the specified field in the result set.
     */

    public Long getMissing() {
        return this.missing;
    }

    /**
     * <p>
     * The number of documents that do not contain a value in the specified field in the result set.
     * </p>
     * 
     * @param missing
     *        The number of documents that do not contain a value in the specified field in the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withMissing(Long missing) {
        setMissing(missing);
        return this;
    }

    /**
     * <p>
     * The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     * </p>
     * 
     * @param sum
     *        The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     * </p>
     * 
     * @return The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     * </p>
     * 
     * @param sum
     *        The sum of the field values across the documents in the result set. <code>null</code> for date fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The sum of all field values in the result set squared.
     * </p>
     * 
     * @param sumOfSquares
     *        The sum of all field values in the result set squared.
     */

    public void setSumOfSquares(Double sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
    }

    /**
     * <p>
     * The sum of all field values in the result set squared.
     * </p>
     * 
     * @return The sum of all field values in the result set squared.
     */

    public Double getSumOfSquares() {
        return this.sumOfSquares;
    }

    /**
     * <p>
     * The sum of all field values in the result set squared.
     * </p>
     * 
     * @param sumOfSquares
     *        The sum of all field values in the result set squared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withSumOfSquares(Double sumOfSquares) {
        setSumOfSquares(sumOfSquares);
        return this;
    }

    /**
     * <p>
     * The average of the values found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param mean
     *        The average of the values found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public void setMean(String mean) {
        this.mean = mean;
    }

    /**
     * <p>
     * The average of the values found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @return The average of the values found in the specified field in the result set.</p>
     *         <p>
     *         If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *         <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit
     *         floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is
     *         the string representation of a date with the format specified in <a
     *         href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     */

    public String getMean() {
        return this.mean;
    }

    /**
     * <p>
     * The average of the values found in the specified field in the result set.
     * </p>
     * <p>
     * If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     * <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit floating
     * point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is the string
     * representation of a date with the format specified in <a href="http://tools.ietf.org/html/rfc3339">IETF
     * RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * </p>
     * 
     * @param mean
     *        The average of the values found in the specified field in the result set.</p>
     *        <p>
     *        If the field is numeric (<code>int</code>, <code>int-array</code>, <code>double</code>, or
     *        <code>double-array</code>), <code>mean</code> is the string representation of a double-precision 64-bit
     *        floating point value. If the field is <code>date</code> or <code>date-array</code>, <code>mean</code> is
     *        the string representation of a date with the format specified in <a
     *        href="http://tools.ietf.org/html/rfc3339">IETF RFC3339</a>: yyyy-mm-ddTHH:mm:ss.SSSZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withMean(String mean) {
        setMean(mean);
        return this;
    }

    /**
     * <p>
     * The standard deviation of the values in the specified field in the result set.
     * </p>
     * 
     * @param stddev
     *        The standard deviation of the values in the specified field in the result set.
     */

    public void setStddev(Double stddev) {
        this.stddev = stddev;
    }

    /**
     * <p>
     * The standard deviation of the values in the specified field in the result set.
     * </p>
     * 
     * @return The standard deviation of the values in the specified field in the result set.
     */

    public Double getStddev() {
        return this.stddev;
    }

    /**
     * <p>
     * The standard deviation of the values in the specified field in the result set.
     * </p>
     * 
     * @param stddev
     *        The standard deviation of the values in the specified field in the result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldStats withStddev(Double stddev) {
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
        if (getMin() != null)
            sb.append("Min: ").append(getMin()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getMissing() != null)
            sb.append("Missing: ").append(getMissing()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getSumOfSquares() != null)
            sb.append("SumOfSquares: ").append(getSumOfSquares()).append(",");
        if (getMean() != null)
            sb.append("Mean: ").append(getMean()).append(",");
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

        if (obj instanceof FieldStats == false)
            return false;
        FieldStats other = (FieldStats) obj;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getMissing() == null ^ this.getMissing() == null)
            return false;
        if (other.getMissing() != null && other.getMissing().equals(this.getMissing()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getSumOfSquares() == null ^ this.getSumOfSquares() == null)
            return false;
        if (other.getSumOfSquares() != null && other.getSumOfSquares().equals(this.getSumOfSquares()) == false)
            return false;
        if (other.getMean() == null ^ this.getMean() == null)
            return false;
        if (other.getMean() != null && other.getMean().equals(this.getMean()) == false)
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

        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getMissing() == null) ? 0 : getMissing().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getSumOfSquares() == null) ? 0 : getSumOfSquares().hashCode());
        hashCode = prime * hashCode + ((getMean() == null) ? 0 : getMean().hashCode());
        hashCode = prime * hashCode + ((getStddev() == null) ? 0 : getStddev().hashCode());
        return hashCode;
    }

    @Override
    public FieldStats clone() {
        try {
            return (FieldStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.FieldStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
