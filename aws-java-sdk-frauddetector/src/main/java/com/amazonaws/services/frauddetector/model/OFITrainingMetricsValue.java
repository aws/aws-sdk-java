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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Online Fraud Insights (OFI) model training metric details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/OFITrainingMetricsValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OFITrainingMetricsValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model's performance metrics data points.
     * </p>
     */
    private java.util.List<OFIMetricDataPoint> metricDataPoints;
    /**
     * <p>
     * The model's overall performance score.
     * </p>
     */
    private OFIModelPerformance modelPerformance;

    /**
     * <p>
     * The model's performance metrics data points.
     * </p>
     * 
     * @return The model's performance metrics data points.
     */

    public java.util.List<OFIMetricDataPoint> getMetricDataPoints() {
        return metricDataPoints;
    }

    /**
     * <p>
     * The model's performance metrics data points.
     * </p>
     * 
     * @param metricDataPoints
     *        The model's performance metrics data points.
     */

    public void setMetricDataPoints(java.util.Collection<OFIMetricDataPoint> metricDataPoints) {
        if (metricDataPoints == null) {
            this.metricDataPoints = null;
            return;
        }

        this.metricDataPoints = new java.util.ArrayList<OFIMetricDataPoint>(metricDataPoints);
    }

    /**
     * <p>
     * The model's performance metrics data points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataPoints(java.util.Collection)} or {@link #withMetricDataPoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricDataPoints
     *        The model's performance metrics data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OFITrainingMetricsValue withMetricDataPoints(OFIMetricDataPoint... metricDataPoints) {
        if (this.metricDataPoints == null) {
            setMetricDataPoints(new java.util.ArrayList<OFIMetricDataPoint>(metricDataPoints.length));
        }
        for (OFIMetricDataPoint ele : metricDataPoints) {
            this.metricDataPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model's performance metrics data points.
     * </p>
     * 
     * @param metricDataPoints
     *        The model's performance metrics data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OFITrainingMetricsValue withMetricDataPoints(java.util.Collection<OFIMetricDataPoint> metricDataPoints) {
        setMetricDataPoints(metricDataPoints);
        return this;
    }

    /**
     * <p>
     * The model's overall performance score.
     * </p>
     * 
     * @param modelPerformance
     *        The model's overall performance score.
     */

    public void setModelPerformance(OFIModelPerformance modelPerformance) {
        this.modelPerformance = modelPerformance;
    }

    /**
     * <p>
     * The model's overall performance score.
     * </p>
     * 
     * @return The model's overall performance score.
     */

    public OFIModelPerformance getModelPerformance() {
        return this.modelPerformance;
    }

    /**
     * <p>
     * The model's overall performance score.
     * </p>
     * 
     * @param modelPerformance
     *        The model's overall performance score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OFITrainingMetricsValue withModelPerformance(OFIModelPerformance modelPerformance) {
        setModelPerformance(modelPerformance);
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
        if (getMetricDataPoints() != null)
            sb.append("MetricDataPoints: ").append(getMetricDataPoints()).append(",");
        if (getModelPerformance() != null)
            sb.append("ModelPerformance: ").append(getModelPerformance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OFITrainingMetricsValue == false)
            return false;
        OFITrainingMetricsValue other = (OFITrainingMetricsValue) obj;
        if (other.getMetricDataPoints() == null ^ this.getMetricDataPoints() == null)
            return false;
        if (other.getMetricDataPoints() != null && other.getMetricDataPoints().equals(this.getMetricDataPoints()) == false)
            return false;
        if (other.getModelPerformance() == null ^ this.getModelPerformance() == null)
            return false;
        if (other.getModelPerformance() != null && other.getModelPerformance().equals(this.getModelPerformance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricDataPoints() == null) ? 0 : getMetricDataPoints().hashCode());
        hashCode = prime * hashCode + ((getModelPerformance() == null) ? 0 : getModelPerformance().hashCode());
        return hashCode;
    }

    @Override
    public OFITrainingMetricsValue clone() {
        try {
            return (OFITrainingMetricsValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.OFITrainingMetricsValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
