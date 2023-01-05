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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateRumMetricDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is to send the metrics.
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
     * An array of structures which define the metrics that you want to send.
     * </p>
     */
    private java.util.List<MetricDefinitionRequest> metricDefinitions;

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is to send the metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is to send the metrics.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is to send the metrics.
     * </p>
     * 
     * @return The name of the CloudWatch RUM app monitor that is to send the metrics.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is to send the metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is to send the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsRequest withAppMonitorName(String appMonitorName) {
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

    public BatchCreateRumMetricDefinitionsRequest withDestination(String destination) {
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

    public BatchCreateRumMetricDefinitionsRequest withDestination(MetricDestination destination) {
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

    public BatchCreateRumMetricDefinitionsRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to send.
     * </p>
     * 
     * @return An array of structures which define the metrics that you want to send.
     */

    public java.util.List<MetricDefinitionRequest> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to send.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures which define the metrics that you want to send.
     */

    public void setMetricDefinitions(java.util.Collection<MetricDefinitionRequest> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinitionRequest>(metricDefinitions);
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to send.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitions(java.util.Collection)} or {@link #withMetricDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures which define the metrics that you want to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsRequest withMetricDefinitions(MetricDefinitionRequest... metricDefinitions) {
        if (this.metricDefinitions == null) {
            setMetricDefinitions(new java.util.ArrayList<MetricDefinitionRequest>(metricDefinitions.length));
        }
        for (MetricDefinitionRequest ele : metricDefinitions) {
            this.metricDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to send.
     * </p>
     * 
     * @param metricDefinitions
     *        An array of structures which define the metrics that you want to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsRequest withMetricDefinitions(java.util.Collection<MetricDefinitionRequest> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
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
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: ").append(getMetricDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateRumMetricDefinitionsRequest == false)
            return false;
        BatchCreateRumMetricDefinitionsRequest other = (BatchCreateRumMetricDefinitionsRequest) obj;
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
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
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
        hashCode = prime * hashCode + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateRumMetricDefinitionsRequest clone() {
        return (BatchCreateRumMetricDefinitionsRequest) super.clone();
    }

}
