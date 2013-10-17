/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#resumeProcesses(ResumeProcessesRequest) ResumeProcesses operation}.
 * <p>
 * Resumes all suspended Auto Scaling processes for an Auto Scaling group. For information on suspending and resuming Auto Scaling process, see <a
 * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Process </a> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#resumeProcesses(ResumeProcessesRequest)
 */
public class ResumeProcessesRequest extends AmazonWebServiceRequest implements Serializable {

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
     * <li>AlarmNotification</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcesses;

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
     * <li>AlarmNotification</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     *
     * @return The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotification</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     */
    public java.util.List<String> getScalingProcesses() {
        if (scalingProcesses == null) {
              scalingProcesses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              scalingProcesses.setAutoConstruct(true);
        }
        return scalingProcesses;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotification</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotification</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     */
    public void setScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scalingProcesses.size());
        scalingProcessesCopy.addAll(scalingProcesses);
        this.scalingProcesses = scalingProcessesCopy;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotification</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotification</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResumeProcessesRequest withScalingProcesses(String... scalingProcesses) {
        if (getScalingProcesses() == null) setScalingProcesses(new java.util.ArrayList<String>(scalingProcesses.length));
        for (String value : scalingProcesses) {
            getScalingProcesses().add(value);
        }
        return this;
    }
    
    /**
     * The processes that you want to suspend or resume, which can include
     * one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     * <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     * <li>AlarmNotification</li> <li>ScheduledActions</li>
     * <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     * omit this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses The processes that you want to suspend or resume, which can include
     *         one or more of the following: <ul> <li>Launch</li> <li>Terminate</li>
     *         <li>HealthCheck</li> <li>ReplaceUnhealthy</li> <li>AZRebalance</li>
     *         <li>AlarmNotification</li> <li>ScheduledActions</li>
     *         <li>AddToLoadBalancer</li> </ul> <p> To suspend all process types,
     *         omit this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResumeProcessesRequest withScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scalingProcesses.size());
            scalingProcessesCopy.addAll(scalingProcesses);
            this.scalingProcesses = scalingProcessesCopy;
        }

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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScalingProcesses() != null) sb.append("ScalingProcesses: " + getScalingProcesses() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResumeProcessesRequest == false) return false;
        ResumeProcessesRequest other = (ResumeProcessesRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getScalingProcesses() == null ^ this.getScalingProcesses() == null) return false;
        if (other.getScalingProcesses() != null && other.getScalingProcesses().equals(this.getScalingProcesses()) == false) return false; 
        return true;
    }
    
}
    