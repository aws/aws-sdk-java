/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Metrics you can use as a baseline for comparison purposes. Use these metrics when you interpret monitoring results
 * for an auto predictor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorBaseline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for the
     * predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics
     * change.
     * </p>
     */
    private java.util.List<BaselineMetric> baselineMetrics;

    /**
     * <p>
     * The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for the
     * predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics
     * change.
     * </p>
     * 
     * @return The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a>
     *         for the predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and
     *         the metrics change.
     */

    public java.util.List<BaselineMetric> getBaselineMetrics() {
        return baselineMetrics;
    }

    /**
     * <p>
     * The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for the
     * predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics
     * change.
     * </p>
     * 
     * @param baselineMetrics
     *        The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for
     *        the predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the
     *        metrics change.
     */

    public void setBaselineMetrics(java.util.Collection<BaselineMetric> baselineMetrics) {
        if (baselineMetrics == null) {
            this.baselineMetrics = null;
            return;
        }

        this.baselineMetrics = new java.util.ArrayList<BaselineMetric>(baselineMetrics);
    }

    /**
     * <p>
     * The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for the
     * predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics
     * change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaselineMetrics(java.util.Collection)} or {@link #withBaselineMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param baselineMetrics
     *        The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for
     *        the predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the
     *        metrics change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorBaseline withBaselineMetrics(BaselineMetric... baselineMetrics) {
        if (this.baselineMetrics == null) {
            setBaselineMetrics(new java.util.ArrayList<BaselineMetric>(baselineMetrics.length));
        }
        for (BaselineMetric ele : baselineMetrics) {
            this.baselineMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for the
     * predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the metrics
     * change.
     * </p>
     * 
     * @param baselineMetrics
     *        The initial <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">accuracy metrics</a> for
     *        the predictor. Use these metrics as a baseline for comparison purposes as you use your predictor and the
     *        metrics change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorBaseline withBaselineMetrics(java.util.Collection<BaselineMetric> baselineMetrics) {
        setBaselineMetrics(baselineMetrics);
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
        if (getBaselineMetrics() != null)
            sb.append("BaselineMetrics: ").append(getBaselineMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictorBaseline == false)
            return false;
        PredictorBaseline other = (PredictorBaseline) obj;
        if (other.getBaselineMetrics() == null ^ this.getBaselineMetrics() == null)
            return false;
        if (other.getBaselineMetrics() != null && other.getBaselineMetrics().equals(this.getBaselineMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineMetrics() == null) ? 0 : getBaselineMetrics().hashCode());
        return hashCode;
    }

    @Override
    public PredictorBaseline clone() {
        try {
            return (PredictorBaseline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorBaselineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
