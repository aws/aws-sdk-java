/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a process type.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html#process-types"> Auto Scaling Processes </a>
 * in the <i>Auto Scaling Developer Guide</i> .
 * </p>
 */
public class ProcessType implements Serializable, Cloneable {

    /**
     * The name of the process. <ul> <li><p><code>Launch</code></li>
     * <li><p><code>Terminate</code></li>
     * <li><p><code>AddToLoadBalancer</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>ScheduledActions</code></li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String processName;

    /**
     * The name of the process. <ul> <li><p><code>Launch</code></li>
     * <li><p><code>Terminate</code></li>
     * <li><p><code>AddToLoadBalancer</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>ScheduledActions</code></li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the process. <ul> <li><p><code>Launch</code></li>
     *         <li><p><code>Terminate</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>ScheduledActions</code></li> </ul>
     */
    public String getProcessName() {
        return processName;
    }
    
    /**
     * The name of the process. <ul> <li><p><code>Launch</code></li>
     * <li><p><code>Terminate</code></li>
     * <li><p><code>AddToLoadBalancer</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>ScheduledActions</code></li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of the process. <ul> <li><p><code>Launch</code></li>
     *         <li><p><code>Terminate</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>ScheduledActions</code></li> </ul>
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }
    
    /**
     * The name of the process. <ul> <li><p><code>Launch</code></li>
     * <li><p><code>Terminate</code></li>
     * <li><p><code>AddToLoadBalancer</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>ScheduledActions</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of the process. <ul> <li><p><code>Launch</code></li>
     *         <li><p><code>Terminate</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>ScheduledActions</code></li> </ul>
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
    
    @Override
    public ProcessType clone() {
        try {
            return (ProcessType) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    