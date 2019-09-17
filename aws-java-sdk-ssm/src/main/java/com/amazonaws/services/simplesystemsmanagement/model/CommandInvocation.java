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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
 * command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a
 * command invocation is created for each requested instance ID. A command invocation returns status and detail
 * information about a command you ran.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CommandInvocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandInvocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command against which this invocation was requested.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * The instance ID in which this invocation was requested.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     * on-premises instances, this is the name of the instance.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The document name that was requested for execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The SSM document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The time and date the request was sent to this instance.
     * </p>
     */
    private java.util.Date requestedDateTime;
    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status of the command execution for each invocation (each instance targeted by the command).
     * StatusDetails includes more information than Status because it includes states resulting from error and
     * concurrency control parameters. StatusDetails can show different results than Status. For more information about
     * these statuses, see <a
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
     * Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     * Execution Timed Out: Command execution started on the instance, but the execution was not complete before the
     * execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not
     * zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
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
     * Gets the trace output sent by the agent.
     * </p>
     */
    private String traceOutput;
    /**
     * <p>
     * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     */
    private String standardOutputUrl;
    /**
     * <p>
     * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     */
    private String standardErrorUrl;

    private com.amazonaws.internal.SdkInternalList<CommandPlugin> commandPlugins;
    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes on a per instance basis.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per instance basis.
     * </p>
     */
    private NotificationConfig notificationConfig;
    /**
     * <p>
     * CloudWatch Logs information where you want Systems Manager to send the command output.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The command against which this invocation was requested.
     * </p>
     * 
     * @param commandId
     *        The command against which this invocation was requested.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * The command against which this invocation was requested.
     * </p>
     * 
     * @return The command against which this invocation was requested.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * The command against which this invocation was requested.
     * </p>
     * 
     * @param commandId
     *        The command against which this invocation was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * The instance ID in which this invocation was requested.
     * </p>
     * 
     * @param instanceId
     *        The instance ID in which this invocation was requested.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID in which this invocation was requested.
     * </p>
     * 
     * @return The instance ID in which this invocation was requested.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID in which this invocation was requested.
     * </p>
     * 
     * @param instanceId
     *        The instance ID in which this invocation was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     * on-premises instances, this is the name of the instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     *        on-premises instances, this is the name of the instance.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     * on-premises instances, this is the name of the instance.
     * </p>
     * 
     * @return The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     *         on-premises instances, this is the name of the instance.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     * on-premises instances, this is the name of the instance.
     * </p>
     * 
     * @param instanceName
     *        The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For
     *        on-premises instances, this is the name of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @return User-specified information about the command, such as a brief description of what the command should do.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The document name that was requested for execution.
     * </p>
     * 
     * @param documentName
     *        The document name that was requested for execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The document name that was requested for execution.
     * </p>
     * 
     * @return The document name that was requested for execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The document name that was requested for execution.
     * </p>
     * 
     * @param documentName
     *        The document name that was requested for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The SSM document version.
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The SSM document version.
     * </p>
     * 
     * @return The SSM document version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The SSM document version.
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The time and date the request was sent to this instance.
     * </p>
     * 
     * @param requestedDateTime
     *        The time and date the request was sent to this instance.
     */

    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * <p>
     * The time and date the request was sent to this instance.
     * </p>
     * 
     * @return The time and date the request was sent to this instance.
     */

    public java.util.Date getRequestedDateTime() {
        return this.requestedDateTime;
    }

    /**
     * <p>
     * The time and date the request was sent to this instance.
     * </p>
     * 
     * @param requestedDateTime
     *        The time and date the request was sent to this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withRequestedDateTime(java.util.Date requestedDateTime) {
        setRequestedDateTime(requestedDateTime);
        return this;
    }

    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @see CommandInvocationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     * 
     * @return Whether or not the invocation succeeded, failed, or is pending.
     * @see CommandInvocationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandInvocationStatus
     */

    public CommandInvocation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @see CommandInvocationStatus
     */

    public void setStatus(CommandInvocationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Whether or not the invocation succeeded, failed, or is pending.
     * </p>
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandInvocationStatus
     */

    public CommandInvocation withStatus(CommandInvocationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the command execution for each invocation (each instance targeted by the command).
     * StatusDetails includes more information than Status because it includes states resulting from error and
     * concurrency control parameters. StatusDetails can show different results than Status. For more information about
     * these statuses, see <a
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
     * Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     * Execution Timed Out: Command execution started on the instance, but the execution was not complete before the
     * execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not
     * zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
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
     *        A detailed status of the command execution for each invocation (each instance targeted by the command).
     *        StatusDetails includes more information than Status because it includes states resulting from error and
     *        concurrency control parameters. StatusDetails can show different results than Status. For more information
     *        about these statuses, see <a
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
     *        Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     *        Execution Timed Out: Command execution started on the instance, but the execution was not complete before
     *        the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command.
     *        This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The command was not successful on the instance. For a plugin, this indicates that the result code
     *        was not zero. For a command invocation, this indicates that the result code for one or more plugins was
     *        not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal
     *        state.
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
     * A detailed status of the command execution for each invocation (each instance targeted by the command).
     * StatusDetails includes more information than Status because it includes states resulting from error and
     * concurrency control parameters. StatusDetails can show different results than Status. For more information about
     * these statuses, see <a
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
     * Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     * Execution Timed Out: Command execution started on the instance, but the execution was not complete before the
     * execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not
     * zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
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
     * @return A detailed status of the command execution for each invocation (each instance targeted by the command).
     *         StatusDetails includes more information than Status because it includes states resulting from error and
     *         concurrency control parameters. StatusDetails can show different results than Status. For more
     *         information about these statuses, see <a
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
     *         Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     *         Execution Timed Out: Command execution started on the instance, but the execution was not complete before
     *         the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent
     *         command. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The command was not successful on the instance. For a plugin, this indicates that the result code
     *         was not zero. For a command invocation, this indicates that the result code for one or more plugins was
     *         not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal
     *         state.
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
     * A detailed status of the command execution for each invocation (each instance targeted by the command).
     * StatusDetails includes more information than Status because it includes states resulting from error and
     * concurrency control parameters. StatusDetails can show different results than Status. For more information about
     * these statuses, see <a
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
     * Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     * Execution Timed Out: Command execution started on the instance, but the execution was not complete before the
     * execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not
     * zero. For a command invocation, this indicates that the result code for one or more plugins was not zero.
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
     *        A detailed status of the command execution for each invocation (each instance targeted by the command).
     *        StatusDetails includes more information than Status because it includes states resulting from error and
     *        concurrency control parameters. StatusDetails can show different results than Status. For more information
     *        about these statuses, see <a
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
     *        Success: The execution of the command or plugin was successfully completed. This is a terminal state.
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
     *        Execution Timed Out: Command execution started on the instance, but the execution was not complete before
     *        the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command.
     *        This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The command was not successful on the instance. For a plugin, this indicates that the result code
     *        was not zero. For a command invocation, this indicates that the result code for one or more plugins was
     *        not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal
     *        state.
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

    public CommandInvocation withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * Gets the trace output sent by the agent.
     * </p>
     * 
     * @param traceOutput
     *        Gets the trace output sent by the agent.
     */

    public void setTraceOutput(String traceOutput) {
        this.traceOutput = traceOutput;
    }

    /**
     * <p>
     * Gets the trace output sent by the agent.
     * </p>
     * 
     * @return Gets the trace output sent by the agent.
     */

    public String getTraceOutput() {
        return this.traceOutput;
    }

    /**
     * <p>
     * Gets the trace output sent by the agent.
     * </p>
     * 
     * @param traceOutput
     *        Gets the trace output sent by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withTraceOutput(String traceOutput) {
        setTraceOutput(traceOutput);
        return this;
    }

    /**
     * <p>
     * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *        command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the
     *        command, and the Amazon S3 bucket was defined for the command.
     */

    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>
     * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @return The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *         command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the
     *         command, and the Amazon S3 bucket was defined for the command.
     */

    public String getStandardOutputUrl() {
        return this.standardOutputUrl;
    }

    /**
     * <p>
     * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *        command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the
     *        command, and the Amazon S3 bucket was defined for the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withStandardOutputUrl(String standardOutputUrl) {
        setStandardOutputUrl(standardOutputUrl);
        return this;
    }

    /**
     * <p>
     * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *        command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the
     *        command, and the Amazon S3 bucket was defined for the command.
     */

    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>
     * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @return The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *         command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the
     *         command, and the Amazon S3 bucket was defined for the command.
     */

    public String getStandardErrorUrl() {
        return this.standardErrorUrl;
    }

    /**
     * <p>
     * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For
     * an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon
     * S3 bucket was defined for the command.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent
     *        command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the
     *        command, and the Amazon S3 bucket was defined for the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withStandardErrorUrl(String standardErrorUrl) {
        setStandardErrorUrl(standardErrorUrl);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<CommandPlugin> getCommandPlugins() {
        if (commandPlugins == null) {
            commandPlugins = new com.amazonaws.internal.SdkInternalList<CommandPlugin>();
        }
        return commandPlugins;
    }

    /**
     * @param commandPlugins
     */

    public void setCommandPlugins(java.util.Collection<CommandPlugin> commandPlugins) {
        if (commandPlugins == null) {
            this.commandPlugins = null;
            return;
        }

        this.commandPlugins = new com.amazonaws.internal.SdkInternalList<CommandPlugin>(commandPlugins);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommandPlugins(java.util.Collection)} or {@link #withCommandPlugins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param commandPlugins
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withCommandPlugins(CommandPlugin... commandPlugins) {
        if (this.commandPlugins == null) {
            setCommandPlugins(new com.amazonaws.internal.SdkInternalList<CommandPlugin>(commandPlugins.length));
        }
        for (CommandPlugin ele : commandPlugins) {
            this.commandPlugins.add(ele);
        }
        return this;
    }

    /**
     * @param commandPlugins
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withCommandPlugins(java.util.Collection<CommandPlugin> commandPlugins) {
        setCommandPlugins(commandPlugins);
        return this;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes on a per instance basis.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *        status changes on a per instance basis.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes on a per instance basis.
     * </p>
     * 
     * @return The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *         status changes on a per instance basis.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes on a per instance basis.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *        status changes on a per instance basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per instance basis.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes on a per instance basis.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per instance basis.
     * </p>
     * 
     * @return Configurations for sending notifications about command status changes on a per instance basis.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per instance basis.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes on a per instance basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withNotificationConfig(NotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
        return this;
    }

    /**
     * <p>
     * CloudWatch Logs information where you want Systems Manager to send the command output.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        CloudWatch Logs information where you want Systems Manager to send the command output.
     */

    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where you want Systems Manager to send the command output.
     * </p>
     * 
     * @return CloudWatch Logs information where you want Systems Manager to send the command output.
     */

    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return this.cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where you want Systems Manager to send the command output.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        CloudWatch Logs information where you want Systems Manager to send the command output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandInvocation withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getRequestedDateTime() != null)
            sb.append("RequestedDateTime: ").append(getRequestedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getTraceOutput() != null)
            sb.append("TraceOutput: ").append(getTraceOutput()).append(",");
        if (getStandardOutputUrl() != null)
            sb.append("StandardOutputUrl: ").append(getStandardOutputUrl()).append(",");
        if (getStandardErrorUrl() != null)
            sb.append("StandardErrorUrl: ").append(getStandardErrorUrl()).append(",");
        if (getCommandPlugins() != null)
            sb.append("CommandPlugins: ").append(getCommandPlugins()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: ").append(getNotificationConfig()).append(",");
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

        if (obj instanceof CommandInvocation == false)
            return false;
        CommandInvocation other = (CommandInvocation) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
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
        if (other.getRequestedDateTime() == null ^ this.getRequestedDateTime() == null)
            return false;
        if (other.getRequestedDateTime() != null && other.getRequestedDateTime().equals(this.getRequestedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getTraceOutput() == null ^ this.getTraceOutput() == null)
            return false;
        if (other.getTraceOutput() != null && other.getTraceOutput().equals(this.getTraceOutput()) == false)
            return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null)
            return false;
        if (other.getStandardOutputUrl() != null && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false)
            return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null)
            return false;
        if (other.getStandardErrorUrl() != null && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false)
            return false;
        if (other.getCommandPlugins() == null ^ this.getCommandPlugins() == null)
            return false;
        if (other.getCommandPlugins() != null && other.getCommandPlugins().equals(this.getCommandPlugins()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
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
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getRequestedDateTime() == null) ? 0 : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getTraceOutput() == null) ? 0 : getTraceOutput().hashCode());
        hashCode = prime * hashCode + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
        hashCode = prime * hashCode + ((getCommandPlugins() == null) ? 0 : getCommandPlugins().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public CommandInvocation clone() {
        try {
            return (CommandInvocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.CommandInvocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
