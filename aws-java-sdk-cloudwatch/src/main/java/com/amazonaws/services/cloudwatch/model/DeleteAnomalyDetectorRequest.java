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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteAnomalyDetector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnomalyDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace associated with the anomaly detection model to delete.
     * </p>
     */
    @Deprecated
    private String namespace;
    /**
     * <p>
     * The metric name associated with the anomaly detection model to delete.
     * </p>
     */
    @Deprecated
    private String metricName;
    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model to delete.
     * </p>
     */
    @Deprecated
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The statistic associated with the anomaly detection model to delete.
     * </p>
     */
    @Deprecated
    private String stat;
    /**
     * <p>
     * A single metric anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the same
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the single metric anomaly detector attributes as part of the
     * <code>SingleMetricAnomalyDetector</code> property.
     * </p>
     */
    private SingleMetricAnomalyDetector singleMetricAnomalyDetector;
    /**
     * <p>
     * The metric math anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the metric math anomaly detector attributes as part of the
     * <code>MetricMathAnomalyDetector</code> property.
     * </p>
     */
    private MetricMathAnomalyDetector metricMathAnomalyDetector;

    /**
     * <p>
     * The namespace associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the anomaly detection model to delete.
     */
    @Deprecated
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace associated with the anomaly detection model to delete.
     * </p>
     * 
     * @return The namespace associated with the anomaly detection model to delete.
     */
    @Deprecated
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the anomaly detection model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DeleteAnomalyDetectorRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The metric name associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param metricName
     *        The metric name associated with the anomaly detection model to delete.
     */
    @Deprecated
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric name associated with the anomaly detection model to delete.
     * </p>
     * 
     * @return The metric name associated with the anomaly detection model to delete.
     */
    @Deprecated
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric name associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param metricName
     *        The metric name associated with the anomaly detection model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DeleteAnomalyDetectorRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model to delete.
     * </p>
     * 
     * @return The metric dimensions associated with the anomaly detection model to delete.
     */
    @Deprecated
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model to delete.
     */
    @Deprecated
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * The metric dimensions associated with the anomaly detection model to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DeleteAnomalyDetectorRequest withDimensions(Dimension... dimensions) {
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
     * The metric dimensions associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param dimensions
     *        The metric dimensions associated with the anomaly detection model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DeleteAnomalyDetectorRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param stat
     *        The statistic associated with the anomaly detection model to delete.
     */
    @Deprecated
    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model to delete.
     * </p>
     * 
     * @return The statistic associated with the anomaly detection model to delete.
     */
    @Deprecated
    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic associated with the anomaly detection model to delete.
     * </p>
     * 
     * @param stat
     *        The statistic associated with the anomaly detection model to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DeleteAnomalyDetectorRequest withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * <p>
     * A single metric anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the same
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the single metric anomaly detector attributes as part of the
     * <code>SingleMetricAnomalyDetector</code> property.
     * </p>
     * 
     * @param singleMetricAnomalyDetector
     *        A single metric anomaly detector to be deleted.</p>
     *        <p>
     *        When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the
     *        same operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Dimensions</code>,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MetricName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stat</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Instead, specify the single metric anomaly detector attributes as part of the
     *        <code>SingleMetricAnomalyDetector</code> property.
     */

    public void setSingleMetricAnomalyDetector(SingleMetricAnomalyDetector singleMetricAnomalyDetector) {
        this.singleMetricAnomalyDetector = singleMetricAnomalyDetector;
    }

    /**
     * <p>
     * A single metric anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the same
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the single metric anomaly detector attributes as part of the
     * <code>SingleMetricAnomalyDetector</code> property.
     * </p>
     * 
     * @return A single metric anomaly detector to be deleted.</p>
     *         <p>
     *         When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the
     *         same operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Dimensions</code>,
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MetricName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Namespace</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stat</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Instead, specify the single metric anomaly detector attributes as part of the
     *         <code>SingleMetricAnomalyDetector</code> property.
     */

    public SingleMetricAnomalyDetector getSingleMetricAnomalyDetector() {
        return this.singleMetricAnomalyDetector;
    }

    /**
     * <p>
     * A single metric anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the same
     * operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the single metric anomaly detector attributes as part of the
     * <code>SingleMetricAnomalyDetector</code> property.
     * </p>
     * 
     * @param singleMetricAnomalyDetector
     *        A single metric anomaly detector to be deleted.</p>
     *        <p>
     *        When using <code>SingleMetricAnomalyDetector</code>, you cannot include the following parameters in the
     *        same operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Dimensions</code>,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MetricName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stat</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>MetricMathAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Instead, specify the single metric anomaly detector attributes as part of the
     *        <code>SingleMetricAnomalyDetector</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnomalyDetectorRequest withSingleMetricAnomalyDetector(SingleMetricAnomalyDetector singleMetricAnomalyDetector) {
        setSingleMetricAnomalyDetector(singleMetricAnomalyDetector);
        return this;
    }

    /**
     * <p>
     * The metric math anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the metric math anomaly detector attributes as part of the
     * <code>MetricMathAnomalyDetector</code> property.
     * </p>
     * 
     * @param metricMathAnomalyDetector
     *        The metric math anomaly detector to be deleted.</p>
     *        <p>
     *        When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same
     *        operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Dimensions</code>,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MetricName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stat</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Instead, specify the metric math anomaly detector attributes as part of the
     *        <code>MetricMathAnomalyDetector</code> property.
     */

    public void setMetricMathAnomalyDetector(MetricMathAnomalyDetector metricMathAnomalyDetector) {
        this.metricMathAnomalyDetector = metricMathAnomalyDetector;
    }

    /**
     * <p>
     * The metric math anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the metric math anomaly detector attributes as part of the
     * <code>MetricMathAnomalyDetector</code> property.
     * </p>
     * 
     * @return The metric math anomaly detector to be deleted.</p>
     *         <p>
     *         When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same
     *         operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Dimensions</code>,
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MetricName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Namespace</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stat</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Instead, specify the metric math anomaly detector attributes as part of the
     *         <code>MetricMathAnomalyDetector</code> property.
     */

    public MetricMathAnomalyDetector getMetricMathAnomalyDetector() {
        return this.metricMathAnomalyDetector;
    }

    /**
     * <p>
     * The metric math anomaly detector to be deleted.
     * </p>
     * <p>
     * When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Dimensions</code>,
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MetricName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stat</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, specify the metric math anomaly detector attributes as part of the
     * <code>MetricMathAnomalyDetector</code> property.
     * </p>
     * 
     * @param metricMathAnomalyDetector
     *        The metric math anomaly detector to be deleted.</p>
     *        <p>
     *        When using <code>MetricMathAnomalyDetector</code>, you cannot include following parameters in the same
     *        operation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Dimensions</code>,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MetricName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Namespace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stat</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>SingleMetricAnomalyDetector</code> parameters of <code>DeleteAnomalyDetectorInput</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Instead, specify the metric math anomaly detector attributes as part of the
     *        <code>MetricMathAnomalyDetector</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAnomalyDetectorRequest withMetricMathAnomalyDetector(MetricMathAnomalyDetector metricMathAnomalyDetector) {
        setMetricMathAnomalyDetector(metricMathAnomalyDetector);
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
        if (getSingleMetricAnomalyDetector() != null)
            sb.append("SingleMetricAnomalyDetector: ").append(getSingleMetricAnomalyDetector()).append(",");
        if (getMetricMathAnomalyDetector() != null)
            sb.append("MetricMathAnomalyDetector: ").append(getMetricMathAnomalyDetector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAnomalyDetectorRequest == false)
            return false;
        DeleteAnomalyDetectorRequest other = (DeleteAnomalyDetectorRequest) obj;
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
        if (other.getSingleMetricAnomalyDetector() == null ^ this.getSingleMetricAnomalyDetector() == null)
            return false;
        if (other.getSingleMetricAnomalyDetector() != null && other.getSingleMetricAnomalyDetector().equals(this.getSingleMetricAnomalyDetector()) == false)
            return false;
        if (other.getMetricMathAnomalyDetector() == null ^ this.getMetricMathAnomalyDetector() == null)
            return false;
        if (other.getMetricMathAnomalyDetector() != null && other.getMetricMathAnomalyDetector().equals(this.getMetricMathAnomalyDetector()) == false)
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
        hashCode = prime * hashCode + ((getSingleMetricAnomalyDetector() == null) ? 0 : getSingleMetricAnomalyDetector().hashCode());
        hashCode = prime * hashCode + ((getMetricMathAnomalyDetector() == null) ? 0 : getMetricMathAnomalyDetector().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAnomalyDetectorRequest clone() {
        return (DeleteAnomalyDetectorRequest) super.clone();
    }

}
