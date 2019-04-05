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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window execution that includes the task.
     * </p>
     */
    private String windowExecutionId;
    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window task that was retrieved.
     * </p>
     */
    private String taskExecutionId;
    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The type of task that was run.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters;
    /**
     * <p>
     * The priority of the task.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The defined maximum number of task executions that could be run in parallel.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The defined maximum number of task execution errors allowed before scheduling of the task execution would have
     * been stopped.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The status of the task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The time the task execution started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the task execution completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the Maintenance Window execution that includes the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution that includes the task.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution that includes the task.
     * </p>
     * 
     * @return The ID of the Maintenance Window execution that includes the task.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution that includes the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution that includes the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window task that was retrieved.
     * </p>
     * 
     * @param taskExecutionId
     *        The ID of the specific task execution in the Maintenance Window task that was retrieved.
     */

    public void setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window task that was retrieved.
     * </p>
     * 
     * @return The ID of the specific task execution in the Maintenance Window task that was retrieved.
     */

    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window task that was retrieved.
     * </p>
     * 
     * @param taskExecutionId
     *        The ID of the specific task execution in the Maintenance Window task that was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withTaskExecutionId(String taskExecutionId) {
        setTaskExecutionId(taskExecutionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task that ran.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @return The ARN of the task that ran.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     * 
     * @param serviceRole
     *        The role that was assumed when running the task.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     * 
     * @return The role that was assumed when running the task.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     * 
     * @param serviceRole
     *        The role that was assumed when running the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * 
     * @param type
     *        The type of task that was run.
     * @see MaintenanceWindowTaskType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * 
     * @return The type of task that was run.
     * @see MaintenanceWindowTaskType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * 
     * @param type
     *        The type of task that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowExecutionTaskResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * 
     * @param type
     *        The type of task that was run.
     * @see MaintenanceWindowTaskType
     */

    public void setType(MaintenanceWindowTaskType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * 
     * @param type
     *        The type of task that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowExecutionTaskResult withType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @return The parameters passed to the task when it was run.</p> <note>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *         instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure.
     *         For information about how Systems Manager handles these options for the supported Maintenance Window task
     *         types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         </note>
     *         <p>
     *         The map has the following format:
     *         </p>
     *         <p>
     *         Key: string, between 1 and 255 characters
     *         </p>
     *         <p>
     *         Value: an array of strings, each string is between 1 and 255 characters
     */

    public java.util.List<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> getTaskParameters() {
        if (taskParameters == null) {
            taskParameters = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>();
        }
        return taskParameters;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @param taskParameters
     *        The parameters passed to the task when it was run.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The map has the following format:
     *        </p>
     *        <p>
     *        Key: string, between 1 and 255 characters
     *        </p>
     *        <p>
     *        Value: an array of strings, each string is between 1 and 255 characters
     */

    public void setTaskParameters(java.util.Collection<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters) {
        if (taskParameters == null) {
            this.taskParameters = null;
            return;
        }

        this.taskParameters = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(taskParameters);
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskParameters(java.util.Collection)} or {@link #withTaskParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param taskParameters
     *        The parameters passed to the task when it was run.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The map has the following format:
     *        </p>
     *        <p>
     *        Key: string, between 1 and 255 characters
     *        </p>
     *        <p>
     *        Value: an array of strings, each string is between 1 and 255 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>... taskParameters) {
        if (this.taskParameters == null) {
            setTaskParameters(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(
                    taskParameters.length));
        }
        for (java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> ele : taskParameters) {
            this.taskParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * 
     * @param taskParameters
     *        The parameters passed to the task when it was run.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        </note>
     *        <p>
     *        The map has the following format:
     *        </p>
     *        <p>
     *        Key: string, between 1 and 255 characters
     *        </p>
     *        <p>
     *        Value: an array of strings, each string is between 1 and 255 characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withTaskParameters(
            java.util.Collection<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * 
     * @param priority
     *        The priority of the task.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * 
     * @return The priority of the task.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * 
     * @param priority
     *        The priority of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The defined maximum number of task executions that could be run in parallel.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in parallel.
     * </p>
     * 
     * @return The defined maximum number of task executions that could be run in parallel.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in parallel.
     * </p>
     * 
     * @param maxConcurrency
     *        The defined maximum number of task executions that could be run in parallel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before scheduling of the task execution would have
     * been stopped.
     * </p>
     * 
     * @param maxErrors
     *        The defined maximum number of task execution errors allowed before scheduling of the task execution would
     *        have been stopped.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before scheduling of the task execution would have
     * been stopped.
     * </p>
     * 
     * @return The defined maximum number of task execution errors allowed before scheduling of the task execution would
     *         have been stopped.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before scheduling of the task execution would have
     * been stopped.
     * </p>
     * 
     * @param maxErrors
     *        The defined maximum number of task execution errors allowed before scheduling of the task execution would
     *        have been stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @return The status of the task.
     * @see MaintenanceWindowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(MaintenanceWindowExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionTaskResult withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the Status. Only available for certain status values.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @return The details explaining the Status. Only available for certain status values.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the Status. Only available for certain status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time the task execution started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @return The time the task execution started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time the task execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     * 
     * @param endTime
     *        The time the task execution completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     * 
     * @return The time the task execution completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     * 
     * @param endTime
     *        The time the task execution completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: ").append(getWindowExecutionId()).append(",");
        if (getTaskExecutionId() != null)
            sb.append("TaskExecutionId: ").append(getTaskExecutionId()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowExecutionTaskResult == false)
            return false;
        GetMaintenanceWindowExecutionTaskResult other = (GetMaintenanceWindowExecutionTaskResult) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null)
            return false;
        if (other.getTaskExecutionId() != null && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetMaintenanceWindowExecutionTaskResult clone() {
        try {
            return (GetMaintenanceWindowExecutionTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
