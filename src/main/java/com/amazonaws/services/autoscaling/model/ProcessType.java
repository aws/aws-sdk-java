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


/**
 * <p>
 * There are two primary Auto Scaling process types-- <code>Launch</code> and <code>Terminate</code> . The <code>Launch</code> process creates a new
 * Amazon EC2 instance for an Auto Scaling group, and the <code>Terminate</code> process removes an existing Amazon EC2 instance.
 * </p>
 * <p>
 * The remaining Auto Scaling process types relate to specific Auto Scaling features:
 * <ul>
 * <li>AddToLoadBalancer</li>
 * <li>AlarmNotification</li>
 * <li>AZRebalance</li>
 * <li>HealthCheck</li>
 * <li>ReplaceUnhealthy</li>
 * <li>ScheduledActions</li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If you suspend Launch or Terminate, all other process types are affected to varying degrees. The following descriptions discuss how
 * each process type is affected by a suspension of Launch or Terminate.
 * </p>
 * <p>
 * The <code>AddToLoadBalancer</code> process type adds instances to the load balancer when the instances are launched. If you suspend this process,
 * Auto Scaling will launch the instances but will not add them to the load balancer. If you resume the <code>AddToLoadBalancer</code> process, Auto
 * Scaling will also resume adding new instances to the load balancer when they are launched. However, Auto Scaling will not add running instances that
 * were launched while the process was suspended; those instances must be added manually using the the <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_RegisterInstancesWithLoadBalancer.html">
 * RegisterInstancesWithLoadBalancer </a> call in the <i>Elastic Load Balancing API Reference</i> .
 * 
 * </p>
 * <p>
 * The <code>AlarmNotification</code> process type accepts notifications from Amazon CloudWatch alarms that are associated with the Auto Scaling group.
 * If you suspend the <code>AlarmNotification</code> process type, Auto Scaling will not automatically execute scaling policies that would be triggered
 * by alarms.
 * </p>
 * <p>
 * Although the <code>AlarmNotification</code> process type is not directly affected by a suspension of <code>Launch</code> or <code>Terminate</code> ,
 * alarm notifications are often used to signal that a change in the size of the Auto Scaling group is warranted. If you suspend
 * <code>Launch</code> or <code>Terminate</code> , Auto Scaling might not be able to implement the alarm's associated policy.
 * </p>
 * <p>
 * The <code>AZRebalance</code> process type seeks to maintain a balanced number of instances across Availability Zones within a Region. If you remove
 * an Availability Zone from your Auto Scaling group or an Availability Zone otherwise becomes unhealthy or unavailable, Auto Scaling launches new
 * instances in an unaffected Availability Zone before terminating the unhealthy or unavailable instances. When the unhealthy Availability Zone returns
 * to a healthy state, Auto Scaling automatically redistributes the application instances evenly across all of the designated Availability Zones.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If you call SuspendProcesses on the launch process type, the AZRebalance process will neither launch new instances nor terminate
 * existing instances. This is because the AZRebalance process terminates existing instances only after launching the replacement instances. If you call
 * SuspendProcesses on the terminate process type, the AZRebalance process can cause your Auto Scaling group to grow up to ten percent larger than the
 * maximum size. This is because Auto Scaling allows groups to temporarily grow larger than the maximum size during rebalancing activities. If Auto
 * Scaling cannot terminate instances, your Auto Scaling group could remain up to ten percent larger than the maximum size until you resume the terminate
 * process type.
 * </p>
 * <p>
 * The <code>HealthCheck</code> process type checks the health of the instances. Auto Scaling marks an instance as unhealthy if Amazon EC2 or Elastic
 * Load Balancing informs Auto Scaling that the instance is unhealthy. The <code>HealthCheck</code> process can override the health status of an instance
 * that you set with SetInstanceHealth.
 * </p>
 * <p>
 * The <code>ReplaceUnhealthy</code> process type terminates instances that are marked as unhealthy and subsequently creates new instances to replace
 * them. This process calls both of the primary process types--first <code>Terminate</code> and then <code>Launch</code> .
 * 
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The HealthCheck process type works in conjunction with the ReplaceUnhealthly process type to provide health check functionality. If
 * you suspend either Launch or Terminate, the ReplaceUnhealthy process type will not function properly.
 * </p>
 * <p>
 * The <code>ScheduledActions</code> process type performs scheduled actions that you create with PutScheduledUpdateGroupAction. Scheduled actions often
 * involve launching new instances or terminating existing instances. If you suspend either <code>Launch</code> or <code>Terminate</code> , your
 * scheduled actions might not function as expected.
 * </p>
 */
public class ProcessType implements Serializable {

    /**
     * The name of a process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String processName;

    /**
     * The name of a process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of a process.
     */
    public String getProcessName() {
        return processName;
    }
    
    /**
     * The name of a process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of a process.
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }
    
    /**
     * The name of a process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of a process.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ProcessType withProcessName(String processName) {
        this.processName = processName;
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
        if (getProcessName() != null) sb.append("ProcessName: " + getProcessName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProcessName() == null) ? 0 : getProcessName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProcessType == false) return false;
        ProcessType other = (ProcessType)obj;
        
        if (other.getProcessName() == null ^ this.getProcessName() == null) return false;
        if (other.getProcessName() != null && other.getProcessName().equals(this.getProcessName()) == false) return false; 
        return true;
    }
    
}
    