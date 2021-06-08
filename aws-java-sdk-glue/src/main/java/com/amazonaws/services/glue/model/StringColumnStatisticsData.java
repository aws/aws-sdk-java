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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines column statistics supported for character sequence data values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StringColumnStatisticsData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of the longest string in the column.
     * </p>
     */
    private Long maximumLength;
    /**
     * <p>
     * The average string length in the column.
     * </p>
     */
    private Double averageLength;
    /**
     * <p>
     * The number of null values in the column.
     * </p>
     */
    private Long numberOfNulls;
    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     */
    private Long numberOfDistinctValues;

    /**
     * <p>
     * The size of the longest string in the column.
     * </p>
     * 
     * @param maximumLength
     *        The size of the longest string in the column.
     */

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * <p>
     * The size of the longest string in the column.
     * </p>
     * 
     * @return The size of the longest string in the column.
     */

    public Long getMaximumLength() {
        return this.maximumLength;
    }

    /**
     * <p>
     * The size of the longest string in the column.
     * </p>
     * 
     * @param maximumLength
     *        The size of the longest string in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withMaximumLength(Long maximumLength) {
        setMaximumLength(maximumLength);
        return this;
    }

    /**
     * <p>
     * The average string length in the column.
     * </p>
     * 
     * @param averageLength
     *        The average string length in the column.
     */

    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    /**
     * <p>
     * The average string length in the column.
     * </p>
     * 
     * @return The average string length in the column.
     */

    public Double getAverageLength() {
        return this.averageLength;
    }

    /**
     * <p>
     * The average string length in the column.
     * </p>
     * 
     * @param averageLength
     *        The average string length in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withAverageLength(Double averageLength) {
        setAverageLength(averageLength);
        return this;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     */

    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @return The number of null values in the column.
     */

    public Long getNumberOfNulls() {
        return this.numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        setNumberOfNulls(numberOfNulls);
        return this;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        The number of distinct values in a column.
     */

    public void setNumberOfDistinctValues(Long numberOfDistinctValues) {
        this.numberOfDistinctValues = numberOfDistinctValues;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @return The number of distinct values in a column.
     */

    public Long getNumberOfDistinctValues() {
        return this.numberOfDistinctValues;
    }

    /**
     * <p>
     * The number of distinct values in a column.
     * </p>
     * 
     * @param numberOfDistinctValues
     *        The number of distinct values in a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringColumnStatisticsData withNumberOfDistinctValues(Long numberOfDistinctValues) {
        setNumberOfDistinctValues(numberOfDistinctValues);
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
        if (getMaximumLength() != null)
            sb.append("MaximumLength: ").append(getMaximumLength()).append(",");
        if (getAverageLength() != null)
            sb.append("AverageLength: ").append(getAverageLength()).append(",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: ").append(getNumberOfNulls()).append(",");
        if (getNumberOfDistinctValues() != null)
            sb.append("NumberOfDistinctValues: ").append(getNumberOfDistinctValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringColumnStatisticsData == false)
            return false;
        StringColumnStatisticsData other = (StringColumnStatisticsData) obj;
        if (other.getMaximumLength() == null ^ this.getMaximumLength() == null)
            return false;
        if (other.getMaximumLength() != null && other.getMaximumLength().equals(this.getMaximumLength()) == false)
            return false;
        if (other.getAverageLength() == null ^ this.getAverageLength() == null)
            return false;
        if (other.getAverageLength() != null && other.getAverageLength().equals(this.getAverageLength()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        if (other.getNumberOfDistinctValues() == null ^ this.getNumberOfDistinctValues() == null)
            return false;
        if (other.getNumberOfDistinctValues() != null && other.getNumberOfDistinctValues().equals(this.getNumberOfDistinctValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode + ((getAverageLength() == null) ? 0 : getAverageLength().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDistinctValues() == null) ? 0 : getNumberOfDistinctValues().hashCode());
        return hashCode;
    }

    @Override
    public StringColumnStatisticsData clone() {
        try {
            return (StringColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StringColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
