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
 * Provides metrics used to evaluate the performance of a predictor. This object is part of the <a>WindowSummary</a>
 * object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/Metrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Metrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The root mean square error (RMSE).
     * </p>
     */
    private Double rMSE;
    /**
     * <p>
     * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     * probability. The distribution in this case is the loss function.
     * </p>
     */
    private java.util.List<WeightedQuantileLoss> weightedQuantileLosses;

    /**
     * <p>
     * The root mean square error (RMSE).
     * </p>
     * 
     * @param rMSE
     *        The root mean square error (RMSE).
     */

    public void setRMSE(Double rMSE) {
        this.rMSE = rMSE;
    }

    /**
     * <p>
     * The root mean square error (RMSE).
     * </p>
     * 
     * @return The root mean square error (RMSE).
     */

    public Double getRMSE() {
        return this.rMSE;
    }

    /**
     * <p>
     * The root mean square error (RMSE).
     * </p>
     * 
     * @param rMSE
     *        The root mean square error (RMSE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metrics withRMSE(Double rMSE) {
        setRMSE(rMSE);
        return this;
    }

    /**
     * <p>
     * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     * probability. The distribution in this case is the loss function.
     * </p>
     * 
     * @return An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     *         probability. The distribution in this case is the loss function.
     */

    public java.util.List<WeightedQuantileLoss> getWeightedQuantileLosses() {
        return weightedQuantileLosses;
    }

    /**
     * <p>
     * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     * probability. The distribution in this case is the loss function.
     * </p>
     * 
     * @param weightedQuantileLosses
     *        An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     *        probability. The distribution in this case is the loss function.
     */

    public void setWeightedQuantileLosses(java.util.Collection<WeightedQuantileLoss> weightedQuantileLosses) {
        if (weightedQuantileLosses == null) {
            this.weightedQuantileLosses = null;
            return;
        }

        this.weightedQuantileLosses = new java.util.ArrayList<WeightedQuantileLoss>(weightedQuantileLosses);
    }

    /**
     * <p>
     * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     * probability. The distribution in this case is the loss function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWeightedQuantileLosses(java.util.Collection)} or
     * {@link #withWeightedQuantileLosses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param weightedQuantileLosses
     *        An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     *        probability. The distribution in this case is the loss function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metrics withWeightedQuantileLosses(WeightedQuantileLoss... weightedQuantileLosses) {
        if (this.weightedQuantileLosses == null) {
            setWeightedQuantileLosses(new java.util.ArrayList<WeightedQuantileLoss>(weightedQuantileLosses.length));
        }
        for (WeightedQuantileLoss ele : weightedQuantileLosses) {
            this.weightedQuantileLosses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     * probability. The distribution in this case is the loss function.
     * </p>
     * 
     * @param weightedQuantileLosses
     *        An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal
     *        probability. The distribution in this case is the loss function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metrics withWeightedQuantileLosses(java.util.Collection<WeightedQuantileLoss> weightedQuantileLosses) {
        setWeightedQuantileLosses(weightedQuantileLosses);
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
        if (getRMSE() != null)
            sb.append("RMSE: ").append(getRMSE()).append(",");
        if (getWeightedQuantileLosses() != null)
            sb.append("WeightedQuantileLosses: ").append(getWeightedQuantileLosses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Metrics == false)
            return false;
        Metrics other = (Metrics) obj;
        if (other.getRMSE() == null ^ this.getRMSE() == null)
            return false;
        if (other.getRMSE() != null && other.getRMSE().equals(this.getRMSE()) == false)
            return false;
        if (other.getWeightedQuantileLosses() == null ^ this.getWeightedQuantileLosses() == null)
            return false;
        if (other.getWeightedQuantileLosses() != null && other.getWeightedQuantileLosses().equals(this.getWeightedQuantileLosses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRMSE() == null) ? 0 : getRMSE().hashCode());
        hashCode = prime * hashCode + ((getWeightedQuantileLosses() == null) ? 0 : getWeightedQuantileLosses().hashCode());
        return hashCode;
    }

    @Override
    public Metrics clone() {
        try {
            return (Metrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.MetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
