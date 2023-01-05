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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Designates the CloudWatch metric and statistic that provides the time series the anomaly detector uses as input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/SingleMetricAnomalyDetector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleMetricAnomalyDetector implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the metric to create the anomaly detection model for.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the metric to create the anomaly detection model for.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The metric dimensions to create the anomaly detection model for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The statistic to use for the metric and anomaly detection model.
     * </p>
     */
    private String stat;

    /**
     * <p>
     * The namespace of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric to create the anomaly detection model for.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @return The namespace of the metric to create the anomaly detection model for.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric to create the anomaly detection model for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMetricAnomalyDetector withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to create the anomaly detection model for.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @return The name of the metric to create the anomaly detection model for.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric to create the anomaly detection model for.
     * </p>
     * 
     * @param metricName
     *        The name of the metric to create the anomaly detection model for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMetricAnomalyDetector withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric dimensions to create the anomaly detection model for.
     * </p>
     * 
     * @return The metric dimensions to create the anomaly detection model for.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The metric dimensions to create the anomaly detection model for.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions to create the anomaly detection model for.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * The metric dimensions to create the anomaly detection model for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions to create the anomaly detection model for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMetricAnomalyDetector withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metric dimensions to create the anomaly detection model for.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions to create the anomaly detection model for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMetricAnomalyDetector withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The statistic to use for the metric and anomaly detection model.
     * </p>
     * 
     * @param stat
     *        The statistic to use for the metric and anomaly detection model.
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic to use for the metric and anomaly detection model.
     * </p>
     * 
     * @return The statistic to use for the metric and anomaly detection model.
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic to use for the metric and anomaly detection model.
     * </p>
     * 
     * @param stat
     *        The statistic to use for the metric and anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleMetricAnomalyDetector withStat(String stat) {
        setStat(stat);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getStat() != null)
            sb.append("Stat: ").append(getStat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleMetricAnomalyDetector == false)
            return false;
        SingleMetricAnomalyDetector other = (SingleMetricAnomalyDetector) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getStat() == null ^ this.getStat() == null)
            return false;
        if (other.getStat() != null && other.getStat().equals(this.getStat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getStat() == null) ? 0 : getStat().hashCode());
        return hashCode;
    }

    @Override
    public SingleMetricAnomalyDetector clone() {
        try {
            return (SingleMetricAnomalyDetector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
