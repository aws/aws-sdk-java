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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An anomaly detection model associated with a particular CloudWatch metric and statistic. You can use the model to
 * display a band of expected normal values when the metric is graphed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/AnomalyDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetector implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the metric associated with the anomaly detection model.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the metric associated with the anomaly detection model.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The statistic associated with the anomaly detection model.
     * </p>
     */
    private String stat;
    /**
     * <p>
     * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges
     * to exclude from use for training the model, and the time zone to use for the metric.
     * </p>
     */
    private AnomalyDetectorConfiguration configuration;
    /**
     * <p>
     * The current status of the anomaly detector's training. The possible values are
     * <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * </p>
     */
    private String stateValue;

    /**
     * <p>
     * The namespace of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the anomaly detection model.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @return The namespace of the metric associated with the anomaly detection model.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the anomaly detection model.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @return The name of the metric associated with the anomaly detection model.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the anomaly detection model.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model.
     * </p>
     * 
     * @return The metric dimensions associated with the anomaly detection model.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model.
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
     * The metric dimensions associated with the anomaly detection model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withDimensions(Dimension... dimensions) {
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
     * The metric dimensions associated with the anomaly detection model.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model.
     * </p>
     * 
     * @param stat
     *        The statistic associated with the anomaly detection model.
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model.
     * </p>
     * 
     * @return The statistic associated with the anomaly detection model.
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model.
     * </p>
     * 
     * @param stat
     *        The statistic associated with the anomaly detection model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * <p>
     * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges
     * to exclude from use for training the model, and the time zone to use for the metric.
     * </p>
     * 
     * @param configuration
     *        The configuration specifies details about how the anomaly detection model is to be trained, including time
     *        ranges to exclude from use for training the model, and the time zone to use for the metric.
     */

    public void setConfiguration(AnomalyDetectorConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges
     * to exclude from use for training the model, and the time zone to use for the metric.
     * </p>
     * 
     * @return The configuration specifies details about how the anomaly detection model is to be trained, including
     *         time ranges to exclude from use for training the model, and the time zone to use for the metric.
     */

    public AnomalyDetectorConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges
     * to exclude from use for training the model, and the time zone to use for the metric.
     * </p>
     * 
     * @param configuration
     *        The configuration specifies details about how the anomaly detection model is to be trained, including time
     *        ranges to exclude from use for training the model, and the time zone to use for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withConfiguration(AnomalyDetectorConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The current status of the anomaly detector's training. The possible values are
     * <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * </p>
     * 
     * @param stateValue
     *        The current status of the anomaly detector's training. The possible values are
     *        <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * @see AnomalyDetectorStateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The current status of the anomaly detector's training. The possible values are
     * <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * </p>
     * 
     * @return The current status of the anomaly detector's training. The possible values are
     *         <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * @see AnomalyDetectorStateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The current status of the anomaly detector's training. The possible values are
     * <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * </p>
     * 
     * @param stateValue
     *        The current status of the anomaly detector's training. The possible values are
     *        <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStateValue
     */

    public AnomalyDetector withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The current status of the anomaly detector's training. The possible values are
     * <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * </p>
     * 
     * @param stateValue
     *        The current status of the anomaly detector's training. The possible values are
     *        <code>TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStateValue
     */

    public AnomalyDetector withStateValue(AnomalyDetectorStateValue stateValue) {
        this.stateValue = stateValue.toString();
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
            sb.append("Stat: ").append(getStat()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getStateValue() != null)
            sb.append("StateValue: ").append(getStateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetector == false)
            return false;
        AnomalyDetector other = (AnomalyDetector) obj;
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
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false)
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
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetector clone() {
        try {
            return (AnomalyDetector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
