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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>Threshold</code> object that includes a comparison and <code>ThresholdValue</code> to compare to. Used with
 * service level metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Threshold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Threshold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * </p>
     */
    private String comparison;
    /**
     * <p>
     * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     * </p>
     */
    private Double thresholdValue;

    /**
     * <p>
     * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @param comparison
     *        The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * @see Comparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @return The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are
     *         supported.
     * @see Comparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @param comparison
     *        The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparison
     */

    public Threshold withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @param comparison
     *        The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Comparison
     */

    public Threshold withComparison(Comparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @param thresholdValue
     *        The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     */

    public void setThresholdValue(Double thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    /**
     * <p>
     * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @return The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     */

    public Double getThresholdValue() {
        return this.thresholdValue;
    }

    /**
     * <p>
     * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     * </p>
     * 
     * @param thresholdValue
     *        The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threshold withThresholdValue(Double thresholdValue) {
        setThresholdValue(thresholdValue);
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
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison()).append(",");
        if (getThresholdValue() != null)
            sb.append("ThresholdValue: ").append(getThresholdValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Threshold == false)
            return false;
        Threshold other = (Threshold) obj;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        if (other.getThresholdValue() == null ^ this.getThresholdValue() == null)
            return false;
        if (other.getThresholdValue() != null && other.getThresholdValue().equals(this.getThresholdValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode + ((getThresholdValue() == null) ? 0 : getThresholdValue().hashCode());
        return hashCode;
    }

    @Override
    public Threshold clone() {
        try {
            return (Threshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
