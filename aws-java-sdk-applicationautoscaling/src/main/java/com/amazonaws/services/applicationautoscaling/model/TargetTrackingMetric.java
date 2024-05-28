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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a specific metric.
 * </p>
 * <p>
 * Metric is a property of the <a>TargetTrackingMetricStat</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/TargetTrackingMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation
     * available from the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     */
    private java.util.List<TargetTrackingMetricDimension> dimensions;
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric. For more information, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation
     * available from the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @return The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services
     *         documentation available from the table in <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *         >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *         Guide</i>. </p>
     *         <p>
     *         Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *         scaling policy.
     */

    public java.util.List<TargetTrackingMetricDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation
     * available from the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services
     *        documentation available from the table in <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *        >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *        Guide</i>. </p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     */

    public void setDimensions(java.util.Collection<TargetTrackingMetricDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<TargetTrackingMetricDimension>(dimensions);
    }

    /**
     * <p>
     * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation
     * available from the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services
     *        documentation available from the table in <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *        >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *        Guide</i>. </p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetric withDimensions(TargetTrackingMetricDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<TargetTrackingMetricDimension>(dimensions.length));
        }
        for (TargetTrackingMetricDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services documentation
     * available from the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric. For the list of available dimensions, see the Amazon Web Services
     *        documentation available from the table in <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *        >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *        Guide</i>. </p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetric withDimensions(java.util.Collection<TargetTrackingMetricDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetric withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric. For more information, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric. For more information, see the table in <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *        >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *        Guide</i>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric. For more information, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The namespace of the metric. For more information, see the table in <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *         >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *         Guide</i>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric. For more information, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html">Amazon
     * Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric. For more information, see the table in <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html"
     *        >Amazon Web Services services that publish CloudWatch metrics </a> in the <i>Amazon CloudWatch User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetric withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingMetric == false)
            return false;
        TargetTrackingMetric other = (TargetTrackingMetric) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingMetric clone() {
        try {
            return (TargetTrackingMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.TargetTrackingMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
