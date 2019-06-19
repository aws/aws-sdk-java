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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommandInvocationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an
     * instance in your hybrid environment that is configured for Systems Manager.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The comment text for the command.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     * </p>
     */
    private String pluginName;
    /**
     * <p>
     * The error level response code for the plugin script. If the response code is -1, then the command has not started
     * running on the instance, or it was not received by the instance.
     * </p>
     */
    private Integer responseCode;
    /**
     * <p>
     * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7,
     * 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedBefore</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     */
    private String executionStartDateTime;
    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     */
    private String executionElapsedTime;
    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example,
     * June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedAfter</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     */
    private String executionEndDateTime;
    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status
     * because it includes states resulting from error and concurrency control parameters. StatusDetails can show
     * different results than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delayed: The system attempted to send the command to the target, but the target was not available. The instance
     * might not be available because of network issues, the instance was stopped, etc. The system will try to deliver
     * the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery
     * timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent
     * command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The command started to run on the instance, but the execution was not complete before the
     * timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code
     * was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
     * Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't
     * contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by
     * the system. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     */
    private String statusDetails;
    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     * ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     * </p>
     */
    private String standardOutputContent;
    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     * specified, then this string is empty.
     * </p>
     */
    private String standardOutputUrl;
    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     */
    private String standardErrorContent;
    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     */
    private String standardErrorUrl;
    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command output.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * 
     * @param commandId
     *        The parent command ID of the invocation plugin.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * 
     * @return The parent command ID of the invocation plugin.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * 
     * @param commandId
     *        The parent command ID of the invocation plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an
     * instance in your hybrid environment that is configured for Systems Manager.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance
     *        or an instance in your hybrid environment that is configured for Systems Manager.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an
     * instance in your hybrid environment that is configured for Systems Manager.
     * </p>
     * 
     * @return The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance
     *         or an instance in your hybrid environment that is configured for Systems Manager.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an
     * instance in your hybrid environment that is configured for Systems Manager.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance
     *        or an instance in your hybrid environment that is configured for Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * 
     * @param comment
     *        The comment text for the command.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * 
     * @return The comment text for the command.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * 
     * @param comment
     *        The comment text for the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * 
     * @param documentName
     *        The name of the document that was run. For example, AWS-RunShellScript.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * 
     * @return The name of the document that was run. For example, AWS-RunShellScript.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * 
     * @param documentName
     *        The name of the document that was run. For example, AWS-RunShellScript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version used in the request.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * 
     * @return The SSM document version used in the request.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version used in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     * </p>
     * 
     * @param pluginName
     *        The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     */

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     * </p>
     * 
     * @return The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     */

    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     * </p>
     * 
     * @param pluginName
     *        The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withPluginName(String pluginName) {
        setPluginName(pluginName);
        return this;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code is -1, then the command has not started
     * running on the instance, or it was not received by the instance.
     * </p>
     * 
     * @param responseCode
     *        The error level response code for the plugin script. If the response code is -1, then the command has not
     *        started running on the instance, or it was not received by the instance.
     */

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code is -1, then the command has not started
     * running on the instance, or it was not received by the instance.
     * </p>
     * 
     * @return The error level response code for the plugin script. If the response code is -1, then the command has not
     *         started running on the instance, or it was not received by the instance.
     */

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code is -1, then the command has not started
     * running on the instance, or it was not received by the instance.
     * </p>
     * 
     * @param responseCode
     *        The error level response code for the plugin script. If the response code is -1, then the command has not
     *        started running on the instance, or it was not received by the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7,
     * 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedBefore</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @param executionStartDateTime
     *        The date and time the plugin started running. Date and time are written in ISO 8601 format. For example,
     *        June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *        <code>InvokedBefore</code> filter.</p>
     *        <p>
     *        <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *        </p>
     *        <p>
     *        If the plugin has not started to run, the string is empty.
     */

    public void setExecutionStartDateTime(String executionStartDateTime) {
        this.executionStartDateTime = executionStartDateTime;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7,
     * 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedBefore</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @return The date and time the plugin started running. Date and time are written in ISO 8601 format. For example,
     *         June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *         <code>InvokedBefore</code> filter.</p>
     *         <p>
     *         <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *         </p>
     *         <p>
     *         If the plugin has not started to run, the string is empty.
     */

    public String getExecutionStartDateTime() {
        return this.executionStartDateTime;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7,
     * 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedBefore</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @param executionStartDateTime
     *        The date and time the plugin started running. Date and time are written in ISO 8601 format. For example,
     *        June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *        <code>InvokedBefore</code> filter.</p>
     *        <p>
     *        <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *        </p>
     *        <p>
     *        If the plugin has not started to run, the string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withExecutionStartDateTime(String executionStartDateTime) {
        setExecutionStartDateTime(executionStartDateTime);
        return this;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * 
     * @param executionElapsedTime
     *        Duration since ExecutionStartDateTime.
     */

    public void setExecutionElapsedTime(String executionElapsedTime) {
        this.executionElapsedTime = executionElapsedTime;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * 
     * @return Duration since ExecutionStartDateTime.
     */

    public String getExecutionElapsedTime() {
        return this.executionElapsedTime;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * 
     * @param executionElapsedTime
     *        Duration since ExecutionStartDateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withExecutionElapsedTime(String executionElapsedTime) {
        setExecutionElapsedTime(executionElapsedTime);
        return this;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example,
     * June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedAfter</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @param executionEndDateTime
     *        The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For
     *        example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *        <code>InvokedAfter</code> filter.</p>
     *        <p>
     *        <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *        </p>
     *        <p>
     *        If the plugin has not started to run, the string is empty.
     */

    public void setExecutionEndDateTime(String executionEndDateTime) {
        this.executionEndDateTime = executionEndDateTime;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example,
     * June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedAfter</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @return The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For
     *         example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *         <code>InvokedAfter</code> filter.</p>
     *         <p>
     *         <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *         </p>
     *         <p>
     *         If the plugin has not started to run, the string is empty.
     */

    public String getExecutionEndDateTime() {
        return this.executionEndDateTime;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example,
     * June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the <code>InvokedAfter</code>
     * filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * 
     * @param executionEndDateTime
     *        The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For
     *        example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the
     *        <code>InvokedAfter</code> filter.</p>
     *        <p>
     *        <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *        </p>
     *        <p>
     *        If the plugin has not started to run, the string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withExecutionEndDateTime(String executionEndDateTime) {
        setExecutionEndDateTime(executionEndDateTime);
        return this;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     * 
     * @param status
     *        The status of this invocation plugin. This status can be different than StatusDetails.
     * @see CommandInvocationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     * 
     * @return The status of this invocation plugin. This status can be different than StatusDetails.
     * @see CommandInvocationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     * 
     * @param status
     *        The status of this invocation plugin. This status can be different than StatusDetails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandInvocationStatus
     */

    public GetCommandInvocationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     * 
     * @param status
     *        The status of this invocation plugin. This status can be different than StatusDetails.
     * @see CommandInvocationStatus
     */

    public void setStatus(CommandInvocationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than StatusDetails.
     * </p>
     * 
     * @param status
     *        The status of this invocation plugin. This status can be different than StatusDetails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandInvocationStatus
     */

    public GetCommandInvocationResult withStatus(CommandInvocationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status
     * because it includes states resulting from error and concurrency control parameters. StatusDetails can show
     * different results than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delayed: The system attempted to send the command to the target, but the target was not available. The instance
     * might not be available because of network issues, the instance was stopped, etc. The system will try to deliver
     * the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery
     * timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent
     * command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The command started to run on the instance, but the execution was not complete before the
     * timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code
     * was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
     * Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't
     * contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by
     * the system. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetails
     *        A detailed status of the command execution for an invocation. StatusDetails includes more information than
     *        Status because it includes states resulting from error and concurrency control parameters. StatusDetails
     *        can show different results than Status. For more information about these statuses, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *        Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The command has not been sent to the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The command has been sent to the instance but has not reached a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delayed: The system attempted to send the command to the target, but the target was not available. The
     *        instance might not be available because of network issues, the instance was stopped, etc. The system will
     *        try to deliver the command again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Success: The command or plugin was run successfully. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired.
     *        Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to
     *        whether the parent command status is Success or Incomplete. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Execution Timed Out: The command started to run on the instance, but the execution was not complete before
     *        the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     *        terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result
     *        code was not zero. For a command invocation, this indicates that the result code for one or more plugins
     *        was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a
     *        terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canceled: The command was terminated before it was completed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not
     *        be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and
     *        don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were
     *        canceled by the system. This is a terminal state.
     *        </p>
     *        </li>
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status
     * because it includes states resulting from error and concurrency control parameters. StatusDetails can show
     * different results than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delayed: The system attempted to send the command to the target, but the target was not available. The instance
     * might not be available because of network issues, the instance was stopped, etc. The system will try to deliver
     * the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery
     * timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent
     * command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The command started to run on the instance, but the execution was not complete before the
     * timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code
     * was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
     * Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't
     * contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by
     * the system. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A detailed status of the command execution for an invocation. StatusDetails includes more information
     *         than Status because it includes states resulting from error and concurrency control parameters.
     *         StatusDetails can show different results than Status. For more information about these statuses, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *         Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The command has not been sent to the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Progress: The command has been sent to the instance but has not reached a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delayed: The system attempted to send the command to the target, but the target was not available. The
     *         instance might not be available because of network issues, the instance was stopped, etc. The system will
     *         try to deliver the command again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Success: The command or plugin was run successfully. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired.
     *         Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to
     *         whether the parent command status is Success or Incomplete. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Execution Timed Out: The command started to run on the instance, but the execution was not complete
     *         before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command.
     *         This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result
     *         code was not zero. For a command invocation, this indicates that the result code for one or more plugins
     *         was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a
     *         terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canceled: The command was terminated before it was completed. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not
     *         be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and
     *         don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were
     *         canceled by the system. This is a terminal state.
     *         </p>
     *         </li>
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status
     * because it includes states resulting from error and concurrency control parameters. StatusDetails can show
     * different results than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delayed: The system attempted to send the command to the target, but the target was not available. The instance
     * might not be available because of network issues, the instance was stopped, etc. The system will try to deliver
     * the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery
     * timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent
     * command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The command started to run on the instance, but the execution was not complete before the
     * timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code
     * was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
     * Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't
     * contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by
     * the system. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetails
     *        A detailed status of the command execution for an invocation. StatusDetails includes more information than
     *        Status because it includes states resulting from error and concurrency control parameters. StatusDetails
     *        can show different results than Status. For more information about these statuses, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *        Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The command has not been sent to the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The command has been sent to the instance but has not reached a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delayed: The system attempted to send the command to the target, but the target was not available. The
     *        instance might not be available because of network issues, the instance was stopped, etc. The system will
     *        try to deliver the command again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Success: The command or plugin was run successfully. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired.
     *        Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to
     *        whether the parent command status is Success or Incomplete. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Execution Timed Out: The command started to run on the instance, but the execution was not complete before
     *        the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     *        terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result
     *        code was not zero. For a command invocation, this indicates that the result code for one or more plugins
     *        was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a
     *        terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canceled: The command was terminated before it was completed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not
     *        be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and
     *        don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were
     *        canceled by the system. This is a terminal state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     * ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     * </p>
     * 
     * @param standardOutputContent
     *        The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     *        ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     */

    public void setStandardOutputContent(String standardOutputContent) {
        this.standardOutputContent = standardOutputContent;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     * ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     * </p>
     * 
     * @return The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     *         ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     */

    public String getStandardOutputContent() {
        return this.standardOutputContent;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     * ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     * </p>
     * 
     * @param standardOutputContent
     *        The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if
     *        ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withStandardOutputContent(String standardOutputContent) {
        setStandardOutputContent(standardOutputContent);
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     * specified, then this string is empty.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     *        specified, then this string is empty.
     */

    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     * specified, then this string is empty.
     * </p>
     * 
     * @return The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was
     *         not specified, then this string is empty.
     */

    public String getStandardOutputUrl() {
        return this.standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     * specified, then this string is empty.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not
     *        specified, then this string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withStandardOutputUrl(String standardOutputUrl) {
        setStandardOutputUrl(standardOutputUrl);
        return this;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @param standardErrorContent
     *        The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then
     *        this string is empty.
     */

    public void setStandardErrorContent(String standardErrorContent) {
        this.standardErrorContent = standardErrorContent;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @return The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then
     *         this string is empty.
     */

    public String getStandardErrorContent() {
        return this.standardErrorContent;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @param standardErrorContent
     *        The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then
     *        this string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withStandardErrorContent(String standardErrorContent) {
        setStandardErrorContent(standardErrorContent);
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL for the complete text written by the plugin to stderr. If the command has not finished running,
     *        then this string is empty.
     */

    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @return The URL for the complete text written by the plugin to stderr. If the command has not finished running,
     *         then this string is empty.
     */

    public String getStandardErrorUrl() {
        return this.standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this
     * string is empty.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL for the complete text written by the plugin to stderr. If the command has not finished running,
     *        then this string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withStandardErrorUrl(String standardErrorUrl) {
        setStandardErrorUrl(standardErrorUrl);
        return this;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command output.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        CloudWatch Logs information where Systems Manager sent the command output.
     */

    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command output.
     * </p>
     * 
     * @return CloudWatch Logs information where Systems Manager sent the command output.
     */

    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return this.cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command output.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        CloudWatch Logs information where Systems Manager sent the command output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationResult withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        setCloudWatchOutputConfig(cloudWatchOutputConfig);
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
        if (getCommandId() != null)
            sb.append("CommandId: ").append(getCommandId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getPluginName() != null)
            sb.append("PluginName: ").append(getPluginName()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getExecutionStartDateTime() != null)
            sb.append("ExecutionStartDateTime: ").append(getExecutionStartDateTime()).append(",");
        if (getExecutionElapsedTime() != null)
            sb.append("ExecutionElapsedTime: ").append(getExecutionElapsedTime()).append(",");
        if (getExecutionEndDateTime() != null)
            sb.append("ExecutionEndDateTime: ").append(getExecutionEndDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStandardOutputContent() != null)
            sb.append("StandardOutputContent: ").append(getStandardOutputContent()).append(",");
        if (getStandardOutputUrl() != null)
            sb.append("StandardOutputUrl: ").append(getStandardOutputUrl()).append(",");
        if (getStandardErrorContent() != null)
            sb.append("StandardErrorContent: ").append(getStandardErrorContent()).append(",");
        if (getStandardErrorUrl() != null)
            sb.append("StandardErrorUrl: ").append(getStandardErrorUrl()).append(",");
        if (getCloudWatchOutputConfig() != null)
            sb.append("CloudWatchOutputConfig: ").append(getCloudWatchOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommandInvocationResult == false)
            return false;
        GetCommandInvocationResult other = (GetCommandInvocationResult) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getPluginName() == null ^ this.getPluginName() == null)
            return false;
        if (other.getPluginName() != null && other.getPluginName().equals(this.getPluginName()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getExecutionStartDateTime() == null ^ this.getExecutionStartDateTime() == null)
            return false;
        if (other.getExecutionStartDateTime() != null && other.getExecutionStartDateTime().equals(this.getExecutionStartDateTime()) == false)
            return false;
        if (other.getExecutionElapsedTime() == null ^ this.getExecutionElapsedTime() == null)
            return false;
        if (other.getExecutionElapsedTime() != null && other.getExecutionElapsedTime().equals(this.getExecutionElapsedTime()) == false)
            return false;
        if (other.getExecutionEndDateTime() == null ^ this.getExecutionEndDateTime() == null)
            return false;
        if (other.getExecutionEndDateTime() != null && other.getExecutionEndDateTime().equals(this.getExecutionEndDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getStandardOutputContent() == null ^ this.getStandardOutputContent() == null)
            return false;
        if (other.getStandardOutputContent() != null && other.getStandardOutputContent().equals(this.getStandardOutputContent()) == false)
            return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null)
            return false;
        if (other.getStandardOutputUrl() != null && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false)
            return false;
        if (other.getStandardErrorContent() == null ^ this.getStandardErrorContent() == null)
            return false;
        if (other.getStandardErrorContent() != null && other.getStandardErrorContent().equals(this.getStandardErrorContent()) == false)
            return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null)
            return false;
        if (other.getStandardErrorUrl() != null && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false)
            return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null)
            return false;
        if (other.getCloudWatchOutputConfig() != null && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginName() == null) ? 0 : getPluginName().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartDateTime() == null) ? 0 : getExecutionStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionElapsedTime() == null) ? 0 : getExecutionElapsedTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndDateTime() == null) ? 0 : getExecutionEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStandardOutputContent() == null) ? 0 : getStandardOutputContent().hashCode());
        hashCode = prime * hashCode + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getStandardErrorContent() == null) ? 0 : getStandardErrorContent().hashCode());
        hashCode = prime * hashCode + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetCommandInvocationResult clone() {
        try {
            return (GetCommandInvocationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
