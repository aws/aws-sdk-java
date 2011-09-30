/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#resumeProcesses(ResumeProcessesRequest) ResumeProcesses operation}.
 * <p>
 * Resumes Auto Scaling processes for an Auto Scaling group. For more
 * information, see SuspendProcesses and ProcessType.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#resumeProcesses(ResumeProcessesRequest)
 */
public class ResumeProcessesRequest extends AmazonWebServiceRequest {

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotifications</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     */
    private java.util.List<String> scalingProcesses;

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResumeProcessesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotifications</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     *
     * @return The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotifications</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     */
    public java.util.List<String> getScalingProcesses() {
        
        if (scalingProcesses == null) {
            scalingProcesses = new java.util.ArrayList<String>();
        }
        return scalingProcesses;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotifications</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotifications</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     */
    public void setScalingProcesses(java.util.Collection<String> scalingProcesses) {
        java.util.List<String> scalingProcessesCopy = new java.util.ArrayList<String>();
        if (scalingProcesses != null) {
            scalingProcessesCopy.addAll(scalingProcesses);
        }
        this.scalingProcesses = scalingProcessesCopy;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotifications</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotifications</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResumeProcessesRequest withScalingProcesses(String... scalingProcesses) {
        if (getScalingProcesses() == null) setScalingProcesses(new java.util.ArrayList<String>());
        for (String value : scalingProcesses) {
            getScalingProcesses().add(value);
        }
        return this;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotifications</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotifications</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResumeProcessesRequest withScalingProcesses(java.util.Collection<String> scalingProcesses) {
        java.util.List<String> scalingProcessesCopy = new java.util.ArrayList<String>();
        if (scalingProcesses != null) {
            scalingProcessesCopy.addAll(scalingProcesses);
        }
        this.scalingProcesses = scalingProcessesCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("ScalingProcesses: " + scalingProcesses + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    