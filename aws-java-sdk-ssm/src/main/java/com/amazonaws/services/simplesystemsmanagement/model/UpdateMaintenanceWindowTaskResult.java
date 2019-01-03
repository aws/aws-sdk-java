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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window that was updated.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The task ID of the Maintenance Window that was updated.
     * </p>
     */
    private String windowTaskId;
    /**
     * <p>
     * The updated target values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The updated task ARN value.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The updated service role ARN value.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The updated parameter values.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;
    /**
     * <p>
     * The updated parameter values.
     * </p>
     */
    private MaintenanceWindowTaskInvocationParameters taskInvocationParameters;
    /**
     * <p>
     * The updated priority value.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The updated MaxConcurrency value.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The updated MaxErrors value.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The updated logging information in Amazon S3.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     */
    private LoggingInfo loggingInfo;
    /**
     * <p>
     * The updated task name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated task description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window that was updated.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @return The ID of the Maintenance Window that was updated.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The task ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID of the Maintenance Window that was updated.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The task ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @return The task ID of the Maintenance Window that was updated.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The task ID of the Maintenance Window that was updated.
     * </p>
     * 
     * @param windowTaskId
     *        The task ID of the Maintenance Window that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withWindowTaskId(String windowTaskId) {
        setWindowTaskId(windowTaskId);
        return this;
    }

    /**
     * <p>
     * The updated target values.
     * </p>
     * 
     * @return The updated target values.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The updated target values.
     * </p>
     * 
     * @param targets
     *        The updated target values.
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
     * The updated target values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The updated target values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withTargets(Target... targets) {
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
     * The updated target values.
     * </p>
     * 
     * @param targets
     *        The updated target values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The updated task ARN value.
     * </p>
     * 
     * @param taskArn
     *        The updated task ARN value.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The updated task ARN value.
     * </p>
     * 
     * @return The updated task ARN value.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The updated task ARN value.
     * </p>
     * 
     * @param taskArn
     *        The updated task ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The updated service role ARN value.
     * </p>
     * 
     * @param serviceRoleArn
     *        The updated service role ARN value.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The updated service role ARN value.
     * </p>
     * 
     * @return The updated service role ARN value.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The updated service role ARN value.
     * </p>
     * 
     * @param serviceRoleArn
     *        The updated service role ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @return The updated parameter values.</p> <note>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *         instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure.
     *         For information about how Systems Manager handles these options for the supported Maintenance Window task
     *         types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     */

    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param taskParameters
     *        The updated parameter values.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     */

    public void setTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param taskParameters
     *        The updated parameter values.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    public UpdateMaintenanceWindowTaskResult addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
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

    public UpdateMaintenanceWindowTaskResult clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The updated parameter values.
     */

    public void setTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * 
     * @return The updated parameter values.
     */

    public MaintenanceWindowTaskInvocationParameters getTaskInvocationParameters() {
        return this.taskInvocationParameters;
    }

    /**
     * <p>
     * The updated parameter values.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The updated parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        setTaskInvocationParameters(taskInvocationParameters);
        return this;
    }

    /**
     * <p>
     * The updated priority value.
     * </p>
     * 
     * @param priority
     *        The updated priority value.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The updated priority value.
     * </p>
     * 
     * @return The updated priority value.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The updated priority value.
     * </p>
     * 
     * @param priority
     *        The updated priority value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The updated MaxConcurrency value.
     * </p>
     * 
     * @param maxConcurrency
     *        The updated MaxConcurrency value.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The updated MaxConcurrency value.
     * </p>
     * 
     * @return The updated MaxConcurrency value.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The updated MaxConcurrency value.
     * </p>
     * 
     * @param maxConcurrency
     *        The updated MaxConcurrency value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The updated MaxErrors value.
     * </p>
     * 
     * @param maxErrors
     *        The updated MaxErrors value.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The updated MaxErrors value.
     * </p>
     * 
     * @return The updated MaxErrors value.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The updated MaxErrors value.
     * </p>
     * 
     * @param maxErrors
     *        The updated MaxErrors value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The updated logging information in Amazon S3.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param loggingInfo
     *        The updated logging information in Amazon S3.</p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported Maintenance Window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * The updated logging information in Amazon S3.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @return The updated logging information in Amazon S3.</p> <note>
     *         <p>
     *         <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *         <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *         <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *         options for the supported Maintenance Window task types, see
     *         <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * <p>
     * The updated logging information in Amazon S3.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * 
     * @param loggingInfo
     *        The updated logging information in Amazon S3.</p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported Maintenance Window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * The updated task name.
     * </p>
     * 
     * @param name
     *        The updated task name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated task name.
     * </p>
     * 
     * @return The updated task name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated task name.
     * </p>
     * 
     * @param name
     *        The updated task name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated task description.
     * </p>
     * 
     * @param description
     *        The updated task description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated task description.
     * </p>
     * 
     * @return The updated task description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated task description.
     * </p>
     * 
     * @param description
     *        The updated task description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMaintenanceWindowTaskResult withDescription(String description) {
        setDescription(description);
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTaskId() != null)
            sb.append("WindowTaskId: ").append(getWindowTaskId()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getTaskInvocationParameters() != null)
            sb.append("TaskInvocationParameters: ").append(getTaskInvocationParameters()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowTaskResult == false)
            return false;
        UpdateMaintenanceWindowTaskResult other = (UpdateMaintenanceWindowTaskResult) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getTaskInvocationParameters() == null ^ this.getTaskInvocationParameters() == null)
            return false;
        if (other.getTaskInvocationParameters() != null && other.getTaskInvocationParameters().equals(this.getTaskInvocationParameters()) == false)
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
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getTaskInvocationParameters() == null) ? 0 : getTaskInvocationParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMaintenanceWindowTaskResult clone() {
        try {
            return (UpdateMaintenanceWindowTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
