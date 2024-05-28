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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data quality metric value according to the analysis of historical data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityMetricValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityMetricValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actual value of the data quality metric.
     * </p>
     */
    private Double actualValue;
    /**
     * <p>
     * The expected value of the data quality metric according to the analysis of historical data.
     * </p>
     */
    private Double expectedValue;
    /**
     * <p>
     * The lower limit of the data quality metric value according to the analysis of historical data.
     * </p>
     */
    private Double lowerLimit;
    /**
     * <p>
     * The upper limit of the data quality metric value according to the analysis of historical data.
     * </p>
     */
    private Double upperLimit;

    /**
     * <p>
     * The actual value of the data quality metric.
     * </p>
     * 
     * @param actualValue
     *        The actual value of the data quality metric.
     */

    public void setActualValue(Double actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * <p>
     * The actual value of the data quality metric.
     * </p>
     * 
     * @return The actual value of the data quality metric.
     */

    public Double getActualValue() {
        return this.actualValue;
    }

    /**
     * <p>
     * The actual value of the data quality metric.
     * </p>
     * 
     * @param actualValue
     *        The actual value of the data quality metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetricValues withActualValue(Double actualValue) {
        setActualValue(actualValue);
        return this;
    }

    /**
     * <p>
     * The expected value of the data quality metric according to the analysis of historical data.
     * </p>
     * 
     * @param expectedValue
     *        The expected value of the data quality metric according to the analysis of historical data.
     */

    public void setExpectedValue(Double expectedValue) {
        this.expectedValue = expectedValue;
    }

    /**
     * <p>
     * The expected value of the data quality metric according to the analysis of historical data.
     * </p>
     * 
     * @return The expected value of the data quality metric according to the analysis of historical data.
     */

    public Double getExpectedValue() {
        return this.expectedValue;
    }

    /**
     * <p>
     * The expected value of the data quality metric according to the analysis of historical data.
     * </p>
     * 
     * @param expectedValue
     *        The expected value of the data quality metric according to the analysis of historical data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetricValues withExpectedValue(Double expectedValue) {
        setExpectedValue(expectedValue);
        return this;
    }

    /**
     * <p>
     * The lower limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @param lowerLimit
     *        The lower limit of the data quality metric value according to the analysis of historical data.
     */

    public void setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    /**
     * <p>
     * The lower limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @return The lower limit of the data quality metric value according to the analysis of historical data.
     */

    public Double getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * <p>
     * The lower limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @param lowerLimit
     *        The lower limit of the data quality metric value according to the analysis of historical data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetricValues withLowerLimit(Double lowerLimit) {
        setLowerLimit(lowerLimit);
        return this;
    }

    /**
     * <p>
     * The upper limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @param upperLimit
     *        The upper limit of the data quality metric value according to the analysis of historical data.
     */

    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * <p>
     * The upper limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @return The upper limit of the data quality metric value according to the analysis of historical data.
     */

    public Double getUpperLimit() {
        return this.upperLimit;
    }

    /**
     * <p>
     * The upper limit of the data quality metric value according to the analysis of historical data.
     * </p>
     * 
     * @param upperLimit
     *        The upper limit of the data quality metric value according to the analysis of historical data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityMetricValues withUpperLimit(Double upperLimit) {
        setUpperLimit(upperLimit);
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
        if (getActualValue() != null)
            sb.append("ActualValue: ").append(getActualValue()).append(",");
        if (getExpectedValue() != null)
            sb.append("ExpectedValue: ").append(getExpectedValue()).append(",");
        if (getLowerLimit() != null)
            sb.append("LowerLimit: ").append(getLowerLimit()).append(",");
        if (getUpperLimit() != null)
            sb.append("UpperLimit: ").append(getUpperLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityMetricValues == false)
            return false;
        DataQualityMetricValues other = (DataQualityMetricValues) obj;
        if (other.getActualValue() == null ^ this.getActualValue() == null)
            return false;
        if (other.getActualValue() != null && other.getActualValue().equals(this.getActualValue()) == false)
            return false;
        if (other.getExpectedValue() == null ^ this.getExpectedValue() == null)
            return false;
        if (other.getExpectedValue() != null && other.getExpectedValue().equals(this.getExpectedValue()) == false)
            return false;
        if (other.getLowerLimit() == null ^ this.getLowerLimit() == null)
            return false;
        if (other.getLowerLimit() != null && other.getLowerLimit().equals(this.getLowerLimit()) == false)
            return false;
        if (other.getUpperLimit() == null ^ this.getUpperLimit() == null)
            return false;
        if (other.getUpperLimit() != null && other.getUpperLimit().equals(this.getUpperLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActualValue() == null) ? 0 : getActualValue().hashCode());
        hashCode = prime * hashCode + ((getExpectedValue() == null) ? 0 : getExpectedValue().hashCode());
        hashCode = prime * hashCode + ((getLowerLimit() == null) ? 0 : getLowerLimit().hashCode());
        hashCode = prime * hashCode + ((getUpperLimit() == null) ? 0 : getUpperLimit().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityMetricValues clone() {
        try {
            return (DataQualityMetricValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityMetricValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
