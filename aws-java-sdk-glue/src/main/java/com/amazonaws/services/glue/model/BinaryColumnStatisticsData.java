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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a binary column statistics data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BinaryColumnStatisticsData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BinaryColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     */
    private Long maximumLength;
    /**
     * <p>
     * Average length of the column.
     * </p>
     */
    private Double averageLength;
    /**
     * <p>
     * Number of nulls.
     * </p>
     */
    private Long numberOfNulls;

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * 
     * @param maximumLength
     *        Maximum length of the column.
     */

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * 
     * @return Maximum length of the column.
     */

    public Long getMaximumLength() {
        return this.maximumLength;
    }

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * 
     * @param maximumLength
     *        Maximum length of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BinaryColumnStatisticsData withMaximumLength(Long maximumLength) {
        setMaximumLength(maximumLength);
        return this;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * 
     * @param averageLength
     *        Average length of the column.
     */

    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * 
     * @return Average length of the column.
     */

    public Double getAverageLength() {
        return this.averageLength;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * 
     * @param averageLength
     *        Average length of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BinaryColumnStatisticsData withAverageLength(Double averageLength) {
        setAverageLength(averageLength);
        return this;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @param numberOfNulls
     *        Number of nulls.
     */

    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @return Number of nulls.
     */

    public Long getNumberOfNulls() {
        return this.numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * 
     * @param numberOfNulls
     *        Number of nulls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BinaryColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        setNumberOfNulls(numberOfNulls);
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
            sb.append("NumberOfNulls: ").append(getNumberOfNulls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BinaryColumnStatisticsData == false)
            return false;
        BinaryColumnStatisticsData other = (BinaryColumnStatisticsData) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode + ((getAverageLength() == null) ? 0 : getAverageLength().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        return hashCode;
    }

    @Override
    public BinaryColumnStatisticsData clone() {
        try {
            return (BinaryColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BinaryColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
