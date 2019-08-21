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
 * The weighted loss value for a quantile. This object is part of the <a>Metrics</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/WeightedQuantileLoss" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeightedQuantileLoss implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the
     * distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
     * </p>
     */
    private Double quantile;
    /**
     * <p>
     * The difference between the predicted value and actual value over the quantile, weighted (normalized) by dividing
     * by the sum over all quantiles.
     * </p>
     */
    private Double lossValue;

    /**
     * <p>
     * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the
     * distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
     * </p>
     * 
     * @param quantile
     *        The quantile. Quantiles divide a probability distribution into regions of equal probability. For example,
     *        if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6,
     *        and 0.8.
     */

    public void setQuantile(Double quantile) {
        this.quantile = quantile;
    }

    /**
     * <p>
     * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the
     * distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
     * </p>
     * 
     * @return The quantile. Quantiles divide a probability distribution into regions of equal probability. For example,
     *         if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4,
     *         0.6, and 0.8.
     */

    public Double getQuantile() {
        return this.quantile;
    }

    /**
     * <p>
     * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the
     * distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
     * </p>
     * 
     * @param quantile
     *        The quantile. Quantiles divide a probability distribution into regions of equal probability. For example,
     *        if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6,
     *        and 0.8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedQuantileLoss withQuantile(Double quantile) {
        setQuantile(quantile);
        return this;
    }

    /**
     * <p>
     * The difference between the predicted value and actual value over the quantile, weighted (normalized) by dividing
     * by the sum over all quantiles.
     * </p>
     * 
     * @param lossValue
     *        The difference between the predicted value and actual value over the quantile, weighted (normalized) by
     *        dividing by the sum over all quantiles.
     */

    public void setLossValue(Double lossValue) {
        this.lossValue = lossValue;
    }

    /**
     * <p>
     * The difference between the predicted value and actual value over the quantile, weighted (normalized) by dividing
     * by the sum over all quantiles.
     * </p>
     * 
     * @return The difference between the predicted value and actual value over the quantile, weighted (normalized) by
     *         dividing by the sum over all quantiles.
     */

    public Double getLossValue() {
        return this.lossValue;
    }

    /**
     * <p>
     * The difference between the predicted value and actual value over the quantile, weighted (normalized) by dividing
     * by the sum over all quantiles.
     * </p>
     * 
     * @param lossValue
     *        The difference between the predicted value and actual value over the quantile, weighted (normalized) by
     *        dividing by the sum over all quantiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedQuantileLoss withLossValue(Double lossValue) {
        setLossValue(lossValue);
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
        if (getQuantile() != null)
            sb.append("Quantile: ").append(getQuantile()).append(",");
        if (getLossValue() != null)
            sb.append("LossValue: ").append(getLossValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeightedQuantileLoss == false)
            return false;
        WeightedQuantileLoss other = (WeightedQuantileLoss) obj;
        if (other.getQuantile() == null ^ this.getQuantile() == null)
            return false;
        if (other.getQuantile() != null && other.getQuantile().equals(this.getQuantile()) == false)
            return false;
        if (other.getLossValue() == null ^ this.getLossValue() == null)
            return false;
        if (other.getLossValue() != null && other.getLossValue().equals(this.getLossValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantile() == null) ? 0 : getQuantile().hashCode());
        hashCode = prime * hashCode + ((getLossValue() == null) ? 0 : getLossValue().hashCode());
        return hashCode;
    }

    @Override
    public WeightedQuantileLoss clone() {
        try {
            return (WeightedQuantileLoss) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.WeightedQuantileLossMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
