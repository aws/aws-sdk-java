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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRumMetricDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending these metrics.
     * </p>
     */
    private String appMonitorName;
    /**
     * <p>
     * Defines the destination where you want to stop sending the specified metrics. Valid values are
     * <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify
     * the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission
     * to write to the experiment.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     * deleted.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * An array of structures which define the metrics that you want to stop sending.
     * </p>
     */
    private java.util.List<String> metricDefinitionIds;

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending these metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is sending these metrics.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending these metrics.
     * </p>
     * 
     * @return The name of the CloudWatch RUM app monitor that is sending these metrics.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the CloudWatch RUM app monitor that is sending these metrics.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the CloudWatch RUM app monitor that is sending these metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsRequest withAppMonitorName(String appMonitorName) {
        setAppMonitorName(appMonitorName);
        return this;
    }

    /**
     * <p>
     * Defines the destination where you want to stop sending the specified metrics. Valid values are
     * <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify
     * the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission
     * to write to the experiment.
     * </p>
     * 
     * @param destination
     *        Defines the destination where you want to stop sending the specified metrics. Valid values are
     *        <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also
     *        specify the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that
     *        has permission to write to the experiment.
     * @see MetricDestination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Defines the destination where you want to stop sending the specified metrics. Valid values are
     * <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify
     * the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission
     * to write to the experiment.
     * </p>
     * 
     * @return Defines the destination where you want to stop sending the specified metrics. Valid values are
     *         <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also
     *         specify the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that
     *         has permission to write to the experiment.
     * @see MetricDestination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Defines the destination where you want to stop sending the specified metrics. Valid values are
     * <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify
     * the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission
     * to write to the experiment.
     * </p>
     * 
     * @param destination
     *        Defines the destination where you want to stop sending the specified metrics. Valid values are
     *        <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also
     *        specify the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that
     *        has permission to write to the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public BatchDeleteRumMetricDefinitionsRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Defines the destination where you want to stop sending the specified metrics. Valid values are
     * <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also specify
     * the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission
     * to write to the experiment.
     * </p>
     * 
     * @param destination
     *        Defines the destination where you want to stop sending the specified metrics. Valid values are
     *        <code>CloudWatch</code> and <code>Evidently</code>. If you specify <code>Evidently</code>, you must also
     *        specify the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that
     *        has permission to write to the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public BatchDeleteRumMetricDefinitionsRequest withDestination(MetricDestination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter.
     * </p>
     * <p>
     * This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     * deleted.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. </p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     *        deleted.
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
     * This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     * deleted.
     * </p>
     * 
     * @return This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *         <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. </p>
     *         <p>
     *         This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are
     *         being deleted.
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
     * This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     * deleted.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. </p>
     *        <p>
     *        This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to stop sending.
     * </p>
     * 
     * @return An array of structures which define the metrics that you want to stop sending.
     */

    public java.util.List<String> getMetricDefinitionIds() {
        return metricDefinitionIds;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to stop sending.
     * </p>
     * 
     * @param metricDefinitionIds
     *        An array of structures which define the metrics that you want to stop sending.
     */

    public void setMetricDefinitionIds(java.util.Collection<String> metricDefinitionIds) {
        if (metricDefinitionIds == null) {
            this.metricDefinitionIds = null;
            return;
        }

        this.metricDefinitionIds = new java.util.ArrayList<String>(metricDefinitionIds);
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to stop sending.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitionIds(java.util.Collection)} or {@link #withMetricDefinitionIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitionIds
     *        An array of structures which define the metrics that you want to stop sending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsRequest withMetricDefinitionIds(String... metricDefinitionIds) {
        if (this.metricDefinitionIds == null) {
            setMetricDefinitionIds(new java.util.ArrayList<String>(metricDefinitionIds.length));
        }
        for (String ele : metricDefinitionIds) {
            this.metricDefinitionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures which define the metrics that you want to stop sending.
     * </p>
     * 
     * @param metricDefinitionIds
     *        An array of structures which define the metrics that you want to stop sending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsRequest withMetricDefinitionIds(java.util.Collection<String> metricDefinitionIds) {
        setMetricDefinitionIds(metricDefinitionIds);
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
        if (getMetricDefinitionIds() != null)
            sb.append("MetricDefinitionIds: ").append(getMetricDefinitionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRumMetricDefinitionsRequest == false)
            return false;
        BatchDeleteRumMetricDefinitionsRequest other = (BatchDeleteRumMetricDefinitionsRequest) obj;
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
        if (other.getMetricDefinitionIds() == null ^ this.getMetricDefinitionIds() == null)
            return false;
        if (other.getMetricDefinitionIds() != null && other.getMetricDefinitionIds().equals(this.getMetricDefinitionIds()) == false)
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
        hashCode = prime * hashCode + ((getMetricDefinitionIds() == null) ? 0 : getMetricDefinitionIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRumMetricDefinitionsRequest clone() {
        return (BatchDeleteRumMetricDefinitionsRequest) super.clone();
    }

}
