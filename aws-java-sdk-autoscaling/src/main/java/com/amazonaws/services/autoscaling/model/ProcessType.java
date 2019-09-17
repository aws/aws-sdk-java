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

/**
 * <p>
 * Describes a process type.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html#process-types">Scaling
 * Processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ProcessType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessType implements Serializable, Cloneable {

    /**
     * <p>
     * One of the following processes:
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
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
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
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * </ul>
     */
    private String processName;

    /**
     * <p>
     * One of the following processes:
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
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
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
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param processName
     *        One of the following processes:</p>
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
     *        <code>AddToLoadBalancer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AlarmNotification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AZRebalance</code>
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
     *        <code>ScheduledActions</code>
     *        </p>
     *        </li>
     */

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    /**
     * <p>
     * One of the following processes:
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
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
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
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following processes:</p>
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
     *         <code>AddToLoadBalancer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AlarmNotification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AZRebalance</code>
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
     *         <code>ScheduledActions</code>
     *         </p>
     *         </li>
     */

    public String getProcessName() {
        return this.processName;
    }

    /**
     * <p>
     * One of the following processes:
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
     * <code>AddToLoadBalancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AlarmNotification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AZRebalance</code>
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
     * <code>ScheduledActions</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param processName
     *        One of the following processes:</p>
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
     *        <code>AddToLoadBalancer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AlarmNotification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AZRebalance</code>
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
     *        <code>ScheduledActions</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessType withProcessName(String processName) {
        setProcessName(processName);
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
        if (getProcessName() != null)
            sb.append("ProcessName: ").append(getProcessName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessType == false)
            return false;
        ProcessType other = (ProcessType) obj;
        if (other.getProcessName() == null ^ this.getProcessName() == null)
            return false;
        if (other.getProcessName() != null && other.getProcessName().equals(this.getProcessName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        return hashCode;
    }

    @Override
    public ProcessType clone() {
        try {
            return (ProcessType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
