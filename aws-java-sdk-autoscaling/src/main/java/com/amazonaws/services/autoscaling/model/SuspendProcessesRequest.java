/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendProcesses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuspendProcessesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> scalingProcesses;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendProcessesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more of the following processes. If you omit this parameter, all processes are specified.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Launch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Terminate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HealthCheck</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplaceUnhealthy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AZRebalance</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AlarmNotification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ScheduledActions</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AddToLoadBalancer</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getScalingProcesses() {
        if (scalingProcesses == null) {
            scalingProcesses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scalingProcesses;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingProcesses
     *        One or more of the following processes. If you omit this parameter, all processes are specified.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Launch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HealthCheck</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplaceUnhealthy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AZRebalance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AlarmNotification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActions</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AddToLoadBalancer</code>
     *        </p>
     *        </li>
     */

    public void setScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
            return;
        }

        this.scalingProcesses = new com.amazonaws.internal.SdkInternalList<String>(scalingProcesses);
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingProcesses(java.util.Collection)} or {@link #withScalingProcesses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingProcesses
     *        One or more of the following processes. If you omit this parameter, all processes are specified.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Launch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HealthCheck</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplaceUnhealthy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AZRebalance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AlarmNotification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActions</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AddToLoadBalancer</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendProcessesRequest withScalingProcesses(String... scalingProcesses) {
        if (this.scalingProcesses == null) {
            setScalingProcesses(new com.amazonaws.internal.SdkInternalList<String>(scalingProcesses.length));
        }
        for (String ele : scalingProcesses) {
            this.scalingProcesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more of the following processes. If you omit this parameter, all processes are specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Launch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HealthCheck</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceUnhealthy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingProcesses
     *        One or more of the following processes. If you omit this parameter, all processes are specified.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Launch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HealthCheck</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplaceUnhealthy</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AZRebalance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AlarmNotification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActions</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AddToLoadBalancer</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendProcessesRequest withScalingProcesses(java.util.Collection<String> scalingProcesses) {
        setScalingProcesses(scalingProcesses);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getScalingProcesses() != null)
            sb.append("ScalingProcesses: ").append(getScalingProcesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuspendProcessesRequest == false)
            return false;
        SuspendProcessesRequest other = (SuspendProcessesRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScalingProcesses() == null ^ this.getScalingProcesses() == null)
            return false;
        if (other.getScalingProcesses() != null && other.getScalingProcesses().equals(this.getScalingProcesses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getScalingProcesses() == null) ? 0 : getScalingProcesses().hashCode());
        return hashCode;
    }

    @Override
    public SuspendProcessesRequest clone() {
        return (SuspendProcessesRequest) super.clone();
    }

}
