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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteRumMetricsDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRumMetricsDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app monitor that is sending metrics to the destination that you want to delete.
     * </p>
     */
    private String appMonitorName;
    /**
     * <p>
     * The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter. This parameter specifies the ARN of the Evidently experiment
     * that corresponds to the destination to delete.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * The name of the app monitor that is sending metrics to the destination that you want to delete.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the app monitor that is sending metrics to the destination that you want to delete.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the app monitor that is sending metrics to the destination that you want to delete.
     * </p>
     * 
     * @return The name of the app monitor that is sending metrics to the destination that you want to delete.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the app monitor that is sending metrics to the destination that you want to delete.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the app monitor that is sending metrics to the destination that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRumMetricsDestinationRequest withAppMonitorName(String appMonitorName) {
        setAppMonitorName(appMonitorName);
        return this;
    }

    /**
     * <p>
     * The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * @see MetricDestination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * </p>
     * 
     * @return The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * @see MetricDestination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public DeleteRumMetricsDestinationRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        The type of destination to delete. Valid values are <code>CloudWatch</code> and <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public DeleteRumMetricsDestinationRequest withDestination(MetricDestination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter. This parameter specifies the ARN of the Evidently experiment
     * that corresponds to the destination to delete.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. This parameter specifies
     *        the ARN of the Evidently experiment that corresponds to the destination to delete.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter. This parameter specifies the ARN of the Evidently experiment
     * that corresponds to the destination to delete.
     * </p>
     * 
     * @return This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *         <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. This parameter specifies
     *         the ARN of the Evidently experiment that corresponds to the destination to delete.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * This parameter is required if <code>Destination</code> is <code>Evidently</code>. If <code>Destination</code> is
     * <code>CloudWatch</code>, do not use this parameter. This parameter specifies the ARN of the Evidently experiment
     * that corresponds to the destination to delete.
     * </p>
     * 
     * @param destinationArn
     *        This parameter is required if <code>Destination</code> is <code>Evidently</code>. If
     *        <code>Destination</code> is <code>CloudWatch</code>, do not use this parameter. This parameter specifies
     *        the ARN of the Evidently experiment that corresponds to the destination to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRumMetricsDestinationRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
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
            sb.append("DestinationArn: ").append(getDestinationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRumMetricsDestinationRequest == false)
            return false;
        DeleteRumMetricsDestinationRequest other = (DeleteRumMetricsDestinationRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorName() == null) ? 0 : getAppMonitorName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRumMetricsDestinationRequest clone() {
        return (DeleteRumMetricsDestinationRequest) super.clone();
    }

}
