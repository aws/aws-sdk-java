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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTaskWithMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window the task should be added to.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The targets (either instances or Maintenance Window targets).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify Maintenance Window targets using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The ARN of the task to run.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The role to assume when running the Maintenance Window task.
     * </p>
     * <p>
     * If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems
     * Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when
     * you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role ARN.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The type of task being registered.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
     * </p>
     */
    private MaintenanceWindowTaskInvocationParameters taskInvocationParameters;
    /**
     * <p>
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a
     * Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * </p>
     */
    private Integer priority;
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
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
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
     * An optional name for the task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the task should be added to.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @return The ID of the Maintenance Window the task should be added to.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the task should be added to.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the task should be added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The targets (either instances or Maintenance Window targets).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify Maintenance Window targets using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * </p>
     * 
     * @return The targets (either instances or Maintenance Window targets).</p>
     *         <p>
     *         Specify instances using the following format:
     *         </p>
     *         <p>
     *         <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *         </p>
     *         <p>
     *         Specify Maintenance Window targets using the following format:
     *         </p>
     *         <p>
     *         <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or Maintenance Window targets).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify Maintenance Window targets using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * </p>
     * 
     * @param targets
     *        The targets (either instances or Maintenance Window targets).</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify Maintenance Window targets using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
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
     * The targets (either instances or Maintenance Window targets).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify Maintenance Window targets using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or Maintenance Window targets).</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify Maintenance Window targets using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTargets(Target... targets) {
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
     * The targets (either instances or Maintenance Window targets).
     * </p>
     * <p>
     * Specify instances using the following format:
     * </p>
     * <p>
     * <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     * </p>
     * <p>
     * Specify Maintenance Window targets using the following format:
     * </p>
     * <p>
     * <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * </p>
     * 
     * @param targets
     *        The targets (either instances or Maintenance Window targets).</p>
     *        <p>
     *        Specify instances using the following format:
     *        </p>
     *        <p>
     *        <code>Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;</code>
     *        </p>
     *        <p>
     *        Specify Maintenance Window targets using the following format:
     *        </p>
     *        <p>
     *        <code>Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The ARN of the task to run.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to run.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task to run.
     * </p>
     * 
     * @return The ARN of the task to run.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task to run.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The role to assume when running the Maintenance Window task.
     * </p>
     * <p>
     * If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems
     * Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when
     * you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role ARN.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * 
     * @param serviceRoleArn
     *        The role to assume when running the Maintenance Window task.</p>
     *        <p>
     *        If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for
     *        Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will
     *        be created when you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role
     *        ARN.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *        >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *        >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the
     *        <i>AWS Systems Manager User Guide</i>.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The role to assume when running the Maintenance Window task.
     * </p>
     * <p>
     * If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems
     * Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when
     * you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role ARN.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The role to assume when running the Maintenance Window task.</p>
     *         <p>
     *         If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for
     *         Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will
     *         be created when you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role
     *         ARN.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *         >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *         >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the
     *         <i>AWS Systems Manager User Guide</i>.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The role to assume when running the Maintenance Window task.
     * </p>
     * <p>
     * If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems
     * Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when
     * you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role ARN.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * 
     * @param serviceRoleArn
     *        The role to assume when running the Maintenance Window task.</p>
     *        <p>
     *        If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for
     *        Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will
     *        be created when you run <code>RegisterTaskWithMaintenanceWindow</code> without specifying a service role
     *        ARN.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *        >Service-Linked Role Permissions for Systems Manager</a> and <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *        >Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks? </a> in the
     *        <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @return The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(MaintenanceWindowTaskType taskType) {
        withTaskType(taskType);
    }

    /**
     * <p>
     * The type of task being registered.
     * </p>
     * 
     * @param taskType
     *        The type of task being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     * @return The parameters that should be passed to the task when it is run.</p> <note>
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
     * The parameters that should be passed to the task when it is run.
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
     *        The parameters that should be passed to the task when it is run.</p> <note>
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
     * The parameters that should be passed to the task when it is run.
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
     *        The parameters that should be passed to the task when it is run.</p> <note>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskParameters(java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    public RegisterTaskWithMaintenanceWindowRequest addTaskParametersEntry(String key, MaintenanceWindowTaskParameterValueExpression value) {
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

    public RegisterTaskWithMaintenanceWindowRequest clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The parameters that the task should use during execution. Populate only the fields that match the task
     *        type. All other fields should be empty.
     */

    public void setTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
     * </p>
     * 
     * @return The parameters that the task should use during execution. Populate only the fields that match the task
     *         type. All other fields should be empty.
     */

    public MaintenanceWindowTaskInvocationParameters getTaskInvocationParameters() {
        return this.taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only the fields that match the task type. All
     * other fields should be empty.
     * </p>
     * 
     * @param taskInvocationParameters
     *        The parameters that the task should use during execution. Populate only the fields that match the task
     *        type. All other fields should be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withTaskInvocationParameters(MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        setTaskInvocationParameters(taskInvocationParameters);
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

    public RegisterTaskWithMaintenanceWindowRequest withPriority(Integer priority) {
        setPriority(priority);
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

    public RegisterTaskWithMaintenanceWindowRequest withMaxConcurrency(String maxConcurrency) {
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

    public RegisterTaskWithMaintenanceWindowRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
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
     *        A structure containing information about an Amazon S3 bucket to write instance-level logs to. </p> <note>
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
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
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
     * @return A structure containing information about an Amazon S3 bucket to write instance-level logs to. </p> <note>
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
     * A structure containing information about an Amazon S3 bucket to write instance-level logs to.
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
     *        A structure containing information about an Amazon S3 bucket to write instance-level logs to. </p> <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported Maintenance Window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
        return this;
    }

    /**
     * <p>
     * An optional name for the task.
     * </p>
     * 
     * @param name
     *        An optional name for the task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An optional name for the task.
     * </p>
     * 
     * @return An optional name for the task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An optional name for the task.
     * </p>
     * 
     * @param name
     *        An optional name for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the task.
     * </p>
     * 
     * @param description
     *        An optional description for the task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the task.
     * </p>
     * 
     * @return An optional description for the task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the task.
     * </p>
     * 
     * @param description
     *        An optional description for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskWithMaintenanceWindowRequest == false)
            return false;
        RegisterTaskWithMaintenanceWindowRequest other = (RegisterTaskWithMaintenanceWindowRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
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
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getTaskInvocationParameters() == null) ? 0 : getTaskInvocationParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskWithMaintenanceWindowRequest clone() {
        return (RegisterTaskWithMaintenanceWindowRequest) super.clone();
    }

}
