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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateRumMetricDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRumMetricDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that sends these metrics.
     * </p>
     */
    private String appMonitorName;
    /**
     * <p>
     * The destination to send the metrics to. Valid values are <code>CloudWatch</code> and <code>Evidently</code>. If
     * you specify <code>Evidently</code>, you must also specify the ARN of the CloudWatchEvidently experiment that will
     * receive the metrics and an IAM role that has permission to write to the experiment.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     * already defined this experiment as a valid destination. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     * >PutRumMetricsDestination</a>.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * A structure that contains the new definition that you want to use for this metric.
     * </p>
     */
    private MetricDefinitionRequest metricDefinition;
    /**
     * <p>
     * The ID of the metric definition to update.
     * </p>
     */
    private String metricDefinitionId;

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that sends these metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that sends these metrics.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that sends these metrics.
     * </p>
     * 
     * @return The name of the CloudWatch RUM app monitor that sends these metrics.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that sends these metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that sends these metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRumMetricDefinitionRequest withAppMonitorName(String appMonitorName) {
        setAppMonitorName(appMonitorName);
        return this;
    }

    /**
     * <p>
     * The destination to send the metrics to. Valid values are <code>CloudWatch</code> and <code>Evidently</code>. If
     * you specify <code>Evidently</code>, you must also specify the ARN of the CloudWatchEvidently experiment that will
     * receive the metrics and an IAM role that has permission to write to the experiment.
     * </p>
     * 
     * @param destination
     *        The destination to send the metrics to. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify the ARN of the
     *        CloudWatchEvidently experiment that will receive the metrics and an IAM role that has permission to write
     *        to the experiment.
     * @see MetricDestination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination to send the metrics to. Valid values are <code>CloudWatch</code> and <code>Evidently</code>. If
     * you specify <code>Evidently</code>, you must also specify the ARN of the CloudWatchEvidently experiment that will
     * receive the metrics and an IAM role that has permission to write to the experiment.
     * </p>
     * 
     * @return The destination to send the metrics to. Valid values are <code>CloudWatch</code> and
     *         <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify the ARN of the
     *         CloudWatchEvidently experiment that will receive the metrics and an IAM role that has permission to write
     *         to the experiment.
     * @see MetricDestination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination to send the metrics to. Valid values are <code>CloudWatch</code> and <code>Evidently</code>. If
     * you specify <code>Evidently</code>, you must also specify the ARN of the CloudWatchEvidently experiment that will
     * receive the metrics and an IAM role that has permission to write to the experiment.
     * </p>
     * 
     * @param destination
     *        The destination to send the metrics to. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify the ARN of the
     *        CloudWatchEvidently experiment that will receive the metrics and an IAM role that has permission to write
     *        to the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public UpdateRumMetricDefinitionRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The destination to send the metrics to. Valid values are <code>CloudWatch</code> and <code>Evidently</code>. If
     * you specify <code>Evidently</code>, you must also specify the ARN of the CloudWatchEvidently experiment that will
     * receive the metrics and an IAM role that has permission to write to the experiment.
     * </p>
     * 
     * @param destination
     *        The destination to send the metrics to. Valid values are <code>CloudWatch</code> and
     *        <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify the ARN of the
     *        CloudWatchEvidently experiment that will receive the metrics and an IAM role that has permission to write
     *        to the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public UpdateRumMetricDefinitionRequest withDestination(MetricDestination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     * already defined this experiment as a valid destination. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     * >PutRumMetricsDestination</a>.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     *        already defined this experiment as a valid destination. For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     *        >PutRumMetricsDestination</a>.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     * already defined this experiment as a valid destination. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     * >PutRumMetricsDestination</a>.
     * </p>
     * 
     * @return This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *         <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *         <p>
     *         This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must
     *         have already defined this experiment as a valid destination. For more information, see <a
     *         href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     *         >PutRumMetricsDestination</a>.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     * already defined this experiment as a valid destination. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     * >PutRumMetricsDestination</a>.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter.</p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have
     *        already defined this experiment as a valid destination. For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html"
     *        >PutRumMetricsDestination</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRumMetricDefinitionRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * A structure that contains the new definition that you want to use for this metric.
     * </p>
     * 
     * @param metricDefinition
     *        A structure that contains the new definition that you want to use for this metric.
     */

    public void setMetricDefinition(MetricDefinitionRequest metricDefinition) {
        this.metricDefinition = metricDefinition;
    }

    /**
     * <p>
     * A structure that contains the new definition that you want to use for this metric.
     * </p>
     * 
     * @return A structure that contains the new definition that you want to use for this metric.
     */

    public MetricDefinitionRequest getMetricDefinition() {
        return this.metricDefinition;
    }

    /**
     * <p>
     * A structure that contains the new definition that you want to use for this metric.
     * </p>
     * 
     * @param metricDefinition
     *        A structure that contains the new definition that you want to use for this metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRumMetricDefinitionRequest withMetricDefinition(MetricDefinitionRequest metricDefinition) {
        setMetricDefinition(metricDefinition);
        return this;
    }

    /**
     * <p>
     * The ID of the metric definition to update.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of the metric definition to update.
     */

    public void setMetricDefinitionId(String metricDefinitionId) {
        this.metricDefinitionId = metricDefinitionId;
    }

    /**
     * <p>
     * The ID of the metric definition to update.
     * </p>
     * 
     * @return The ID of the metric definition to update.
     */

    public String getMetricDefinitionId() {
        return this.metricDefinitionId;
    }

    /**
     * <p>
     * The ID of the metric definition to update.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of the metric definition to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRumMetricDefinitionRequest withMetricDefinitionId(String metricDefinitionId) {
        setMetricDefinitionId(metricDefinitionId);
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
        if (getAppMonitorName() != null)
            sb.append("AppMonitorName: ").append(getAppMonitorName()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getMetricDefinition() != null)
            sb.append("MetricDefinition: ").append(getMetricDefinition()).append(",");
        if (getMetricDefinitionId() != null)
            sb.append("MetricDefinitionId: ").append(getMetricDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRumMetricDefinitionRequest == false)
            return false;
        UpdateRumMetricDefinitionRequest other = (UpdateRumMetricDefinitionRequest) obj;
        if (other.getAppMonitorName() == null ^ this.getAppMonitorName() == null)
            return false;
        if (other.getAppMonitorName() != null && other.getAppMonitorName().equals(this.getAppMonitorName()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getMetricDefinition() == null ^ this.getMetricDefinition() == null)
            return false;
        if (other.getMetricDefinition() != null && other.getMetricDefinition().equals(this.getMetricDefinition()) == false)
            return false;
        if (other.getMetricDefinitionId() == null ^ this.getMetricDefinitionId() == null)
            return false;
        if (other.getMetricDefinitionId() != null && other.getMetricDefinitionId().equals(this.getMetricDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorName() == null) ? 0 : getAppMonitorName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinition() == null) ? 0 : getMetricDefinition().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitionId() == null) ? 0 : getMetricDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRumMetricDefinitionRequest clone() {
        return (UpdateRumMetricDefinitionRequest) super.clone();
    }

}
