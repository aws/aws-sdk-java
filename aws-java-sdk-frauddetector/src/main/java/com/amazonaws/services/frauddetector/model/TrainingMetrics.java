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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training metric details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all
     * possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has
     * a score of 1.0.
     * </p>
     */
    private Float auc;
    /**
     * <p>
     * The data points details.
     * </p>
     */
    private java.util.List<MetricDataPoint> metricDataPoints;

    /**
     * <p>
     * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all
     * possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has
     * a score of 1.0.
     * </p>
     * 
     * @param auc
     *        The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across
     *        all possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect
     *        model has a score of 1.0.
     */

    public void setAuc(Float auc) {
        this.auc = auc;
    }

    /**
     * <p>
     * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all
     * possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has
     * a score of 1.0.
     * </p>
     * 
     * @return The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across
     *         all possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a
     *         perfect model has a score of 1.0.
     */

    public Float getAuc() {
        return this.auc;
    }

    /**
     * <p>
     * The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across all
     * possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect model has
     * a score of 1.0.
     * </p>
     * 
     * @param auc
     *        The area under the curve. This summarizes true positive rate (TPR) and false positive rate (FPR) across
     *        all possible model score thresholds. A model with no predictive power has an AUC of 0.5, whereas a perfect
     *        model has a score of 1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetrics withAuc(Float auc) {
        setAuc(auc);
        return this;
    }

    /**
     * <p>
     * The data points details.
     * </p>
     * 
     * @return The data points details.
     */

    public java.util.List<MetricDataPoint> getMetricDataPoints() {
        return metricDataPoints;
    }

    /**
     * <p>
     * The data points details.
     * </p>
     * 
     * @param metricDataPoints
     *        The data points details.
     */

    public void setMetricDataPoints(java.util.Collection<MetricDataPoint> metricDataPoints) {
        if (metricDataPoints == null) {
            this.metricDataPoints = null;
            return;
        }

        this.metricDataPoints = new java.util.ArrayList<MetricDataPoint>(metricDataPoints);
    }

    /**
     * <p>
     * The data points details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataPoints(java.util.Collection)} or {@link #withMetricDataPoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricDataPoints
     *        The data points details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetrics withMetricDataPoints(MetricDataPoint... metricDataPoints) {
        if (this.metricDataPoints == null) {
            setMetricDataPoints(new java.util.ArrayList<MetricDataPoint>(metricDataPoints.length));
        }
        for (MetricDataPoint ele : metricDataPoints) {
            this.metricDataPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data points details.
     * </p>
     * 
     * @param metricDataPoints
     *        The data points details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetrics withMetricDataPoints(java.util.Collection<MetricDataPoint> metricDataPoints) {
        setMetricDataPoints(metricDataPoints);
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
        if (getAuc() != null)
            sb.append("Auc: ").append(getAuc()).append(",");
        if (getMetricDataPoints() != null)
            sb.append("MetricDataPoints: ").append(getMetricDataPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingMetrics == false)
            return false;
        TrainingMetrics other = (TrainingMetrics) obj;
        if (other.getAuc() == null ^ this.getAuc() == null)
            return false;
        if (other.getAuc() != null && other.getAuc().equals(this.getAuc()) == false)
            return false;
        if (other.getMetricDataPoints() == null ^ this.getMetricDataPoints() == null)
            return false;
        if (other.getMetricDataPoints() != null && other.getMetricDataPoints().equals(this.getMetricDataPoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuc() == null) ? 0 : getAuc().hashCode());
        hashCode = prime * hashCode + ((getMetricDataPoints() == null) ? 0 : getMetricDataPoints().hashCode());
        return hashCode;
    }

    @Override
    public TrainingMetrics clone() {
        try {
            return (TrainingMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
