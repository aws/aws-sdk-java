/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a task defined for a Maintenance Window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Maintenance Window ID where the task is registered.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String windowTaskId;
    /**
     * <p>
     * The ARN of the task to execute.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The type of task.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;
    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     */
    private LoggingInfo loggingInfo;
    /**
     * <p>
     * The role that should be assumed when executing the task
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     */
    private String maxErrors;

    /**
     * <p>
     * The Maintenance Window ID where the task is registered.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID where the task is registered.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID where the task is registered.
     * </p>
     * 
     * @return The Maintenance Window ID where the task is registered.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID where the task is registered.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID where the task is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withWindowTaskId(String windowTaskId) {
        setWindowTaskId(windowTaskId);
        return this;
    }

    /**
     * <p>
     * The ARN of the task to execute.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to execute.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task to execute.
     * </p>
     * 
     * @return The ARN of the task to execute.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task to execute.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The type of task.
     * </p>
     * 
     * @param type
     *        The type of task.
     * @see MaintenanceWindowTaskType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of task.
     * </p>
     * 
     * @return The type of task.
     * @see MaintenanceWindowTaskType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of task.
     * </p>
     * 
     * @param type
     *        The type of task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowTask withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of task.
     * </p>
     * 
     * @param type
     *        The type of task.
     * @see MaintenanceWindowTaskType
     */

    public void setType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of task.
     * </p>
     * 
     * @param type
     *        The type of task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowTask withType(MaintenanceWindowTaskType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @return The targets (either instances or tags). Instances are specified using
     *         Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *         name&gt;,Values=&lt;tag value&gt;.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     * name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags). Instances are specified using
     *        Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag
     *        name&gt;,Values=&lt;tag value&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @return The parameters that should be passed to the task when it is executed.
     */

    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @param taskParameters
     *        The parameters that should be passed to the task when it is executed.
     */

    public void setTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is executed.
     * </p>
     * 
     * @param taskParameters
     *        The parameters that should be passed to the task when it is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    public MaintenanceWindowTask addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
        if (null == this.taskParameters) {
            this.taskParameters = new java.util.HashMap<String, MaintenanceWindowTaskParameterValueExpression>();
        }
        if (this.taskParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in
     *        a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in
     *        parallel.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @return The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks
     *         in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled
     *         in parallel.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     * 
     * @param priority
     *        The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in
     *        a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in
     *        parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * 
     * @param loggingInfo
     *        Information about an Amazon S3 bucket to write task-level logs to.
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * 
     * @return Information about an Amazon S3 bucket to write task-level logs to.
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * 
     * @param loggingInfo
     *        Information about an Amazon S3 bucket to write task-level logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task
     * </p>
     * 
     * @param serviceRoleArn
     *        The role that should be assumed when executing the task
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task
     * </p>
     * 
     * @return The role that should be assumed when executing the task
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The role that should be assumed when executing the task
     * </p>
     * 
     * @param serviceRoleArn
     *        The role that should be assumed when executing the task
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets this task can be run for in parallel.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @return The maximum number of targets this task can be run for in parallel.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets this task can be run for in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before this task stops being scheduled.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @return The maximum number of errors allowed before this task stops being scheduled.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being scheduled.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before this task stops being scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTask withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTaskId() != null)
            sb.append("WindowTaskId: ").append(getWindowTaskId()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: ").append(getTaskParameters()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTask == false)
            return false;
        MaintenanceWindowTask other = (MaintenanceWindowTask) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowTask clone() {
        try {
            return (MaintenanceWindowTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
