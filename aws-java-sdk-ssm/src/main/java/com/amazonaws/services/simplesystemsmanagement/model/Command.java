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
 * Describes a command request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Command" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Command implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * The name of the document requested for execution.
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
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run. Calculated based on the
     * ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     */
    private java.util.Date expiresAfter;
    /**
     * <p>
     * The parameter values to be inserted in the document when running the command.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is
     * required if you don't provide one or more instance IDs in the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     */
    private java.util.Date requestedDateTime;
    /**
     * <p>
     * The status of the command.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status of the command execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to any instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to at least one instance but has not reached a final state on all
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command successfully ran on all invocations. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This
     * is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out.
     * This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Incomplete: The command was attempted on all instances and one or more invocations does not have a value of
     * Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     * invocations. The system has canceled the command before running it on any instance. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     */
    private String statusDetails;
    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     */
    private String outputS3Region;
    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of
     * instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The maximum number of errors allowed before the system stops sending the command to additional targets. You can
     * specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more
     * information about how to use MaxErrors, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The number of targets for the command.
     * </p>
     */
    private Integer targetCount;
    /**
     * <p>
     * The number of targets for which the command invocation reached a terminal state. Terminal states include the
     * following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
     * </p>
     */
    private Integer completedCount;
    /**
     * <p>
     * The number of targets for which the status is Failed or Execution Timed Out.
     * </p>
     */
    private Integer errorCount;
    /**
     * <p>
     * The number of targets for which the status is Delivery Timed Out.
     * </p>
     */
    private Integer deliveryTimedOutCount;
    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Configurations for sending notifications about command status changes.
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
     * A unique identifier for this command.
     * </p>
     * 
     * @param commandId
     *        A unique identifier for this command.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     * 
     * @return A unique identifier for this command.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     * 
     * @param commandId
     *        A unique identifier for this command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * The name of the document requested for execution.
     * </p>
     * 
     * @param documentName
     *        The name of the document requested for execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the document requested for execution.
     * </p>
     * 
     * @return The name of the document requested for execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the document requested for execution.
     * </p>
     * 
     * @param documentName
     *        The name of the document requested for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withDocumentName(String documentName) {
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

    public Command withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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

    public Command withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run. Calculated based on the
     * ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @param expiresAfter
     *        If this time is reached and the command has not already started running, it will not run. Calculated based
     *        on the ExpiresAfter user input provided as part of the SendCommand API.
     */

    public void setExpiresAfter(java.util.Date expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run. Calculated based on the
     * ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @return If this time is reached and the command has not already started running, it will not run. Calculated
     *         based on the ExpiresAfter user input provided as part of the SendCommand API.
     */

    public java.util.Date getExpiresAfter() {
        return this.expiresAfter;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run. Calculated based on the
     * ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @param expiresAfter
     *        If this time is reached and the command has not already started running, it will not run. Calculated based
     *        on the ExpiresAfter user input provided as part of the SendCommand API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withExpiresAfter(java.util.Date expiresAfter) {
        setExpiresAfter(expiresAfter);
        return this;
    }

    /**
     * <p>
     * The parameter values to be inserted in the document when running the command.
     * </p>
     * 
     * @return The parameter values to be inserted in the document when running the command.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter values to be inserted in the document when running the command.
     * </p>
     * 
     * @param parameters
     *        The parameter values to be inserted in the document when running the command.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter values to be inserted in the document when running the command.
     * </p>
     * 
     * @param parameters
     *        The parameter values to be inserted in the document when running the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public Command addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @return The instance IDs against which this command was requested.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is
     * required if you don't provide one or more instance IDs in the call.
     * </p>
     * 
     * @return An array of search criteria that targets instances using a Key,Value combination that you specify.
     *         Targets is required if you don't provide one or more instance IDs in the call.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is
     * required if you don't provide one or more instance IDs in the call.
     * </p>
     * 
     * @param targets
     *        An array of search criteria that targets instances using a Key,Value combination that you specify. Targets
     *        is required if you don't provide one or more instance IDs in the call.
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
     * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is
     * required if you don't provide one or more instance IDs in the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        An array of search criteria that targets instances using a Key,Value combination that you specify. Targets
     *        is required if you don't provide one or more instance IDs in the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withTargets(Target... targets) {
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
     * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is
     * required if you don't provide one or more instance IDs in the call.
     * </p>
     * 
     * @param targets
     *        An array of search criteria that targets instances using a Key,Value combination that you specify. Targets
     *        is required if you don't provide one or more instance IDs in the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @param requestedDateTime
     *        The date and time the command was requested.
     */

    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @return The date and time the command was requested.
     */

    public java.util.Date getRequestedDateTime() {
        return this.requestedDateTime;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @param requestedDateTime
     *        The date and time the command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withRequestedDateTime(java.util.Date requestedDateTime) {
        setRequestedDateTime(requestedDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @see CommandStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @return The status of the command.
     * @see CommandStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandStatus
     */

    public Command withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @see CommandStatus
     */

    public void setStatus(CommandStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandStatus
     */

    public Command withStatus(CommandStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the command execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to any instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to at least one instance but has not reached a final state on all
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command successfully ran on all invocations. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This
     * is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out.
     * This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Incomplete: The command was attempted on all instances and one or more invocations does not have a value of
     * Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     * invocations. The system has canceled the command before running it on any instance. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetails
     *        A detailed status of the command execution. StatusDetails includes more information than Status because it
     *        includes states resulting from error and concurrency control parameters. StatusDetails can show different
     *        results than Status. For more information about these statuses, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *        Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The command has not been sent to any instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The command has been sent to at least one instance but has not reached a final state on all
     *        instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Success: The command successfully ran on all invocations. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed
     *        Out. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed
     *        Out. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal
     *        state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Incomplete: The command was attempted on all instances and one or more invocations does not have a value
     *        of Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canceled: The command was terminated before it was completed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     *        invocations. The system has canceled the command before running it on any instance. This is a terminal
     *        state.
     *        </p>
     *        </li>
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A detailed status of the command execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to any instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to at least one instance but has not reached a final state on all
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command successfully ran on all invocations. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This
     * is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out.
     * This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Incomplete: The command was attempted on all instances and one or more invocations does not have a value of
     * Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     * invocations. The system has canceled the command before running it on any instance. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A detailed status of the command execution. StatusDetails includes more information than Status because
     *         it includes states resulting from error and concurrency control parameters. StatusDetails can show
     *         different results than Status. For more information about these statuses, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *         Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The command has not been sent to any instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Progress: The command has been sent to at least one instance but has not reached a final state on all
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Success: The command successfully ran on all invocations. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed
     *         Out. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed
     *         Out. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Incomplete: The command was attempted on all instances and one or more invocations does not have a value
     *         of Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canceled: The command was terminated before it was completed. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     *         invocations. The system has canceled the command before running it on any instance. This is a terminal
     *         state.
     *         </p>
     *         </li>
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * A detailed status of the command execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding Command
     * Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to any instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to at least one instance but has not reached a final state on all
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command successfully ran on all invocations. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This
     * is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out.
     * This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Incomplete: The command was attempted on all instances and one or more invocations does not have a value of
     * Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     * invocations. The system has canceled the command before running it on any instance. This is a terminal state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusDetails
     *        A detailed status of the command execution. StatusDetails includes more information than Status because it
     *        includes states resulting from error and concurrency control parameters. StatusDetails can show different
     *        results than Status. For more information about these statuses, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding
     *        Command Statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The command has not been sent to any instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The command has been sent to at least one instance but has not reached a final state on all
     *        instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Success: The command successfully ran on all invocations. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed
     *        Out. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed
     *        Out. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal
     *        state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Incomplete: The command was attempted on all instances and one or more invocations does not have a value
     *        of Success but not enough invocations failed for the status to be Failed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Canceled: The command was terminated before it was completed. This is a terminal state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending
     *        invocations. The system has canceled the command before running it on any instance. This is a terminal
     *        state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @param outputS3Region
     *        (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *        automatically determines the Amazon S3 bucket region.
     */

    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @return (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *         automatically determines the Amazon S3 bucket region.
     */

    public String getOutputS3Region() {
        return this.outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @param outputS3Region
     *        (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *        automatically determines the Amazon S3 bucket region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withOutputS3Region(String outputS3Region) {
        setOutputS3Region(outputS3Region);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @return The S3 bucket where the responses to the command executions should be stored. This was requested when
     *         issuing the command.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @return The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *         This was requested when issuing the command.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of
     * instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of instances that are allowed to run the command at the same time. You can specify a
     *        number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For
     *        more information about how to use MaxConcurrency, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     *        Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of
     * instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The maximum number of instances that are allowed to run the command at the same time. You can specify a
     *         number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For
     *         more information about how to use MaxConcurrency, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands
     *         Using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of
     * instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of instances that are allowed to run the command at the same time. You can specify a
     *        number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For
     *        more information about how to use MaxConcurrency, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     *        Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed before the system stops sending the command to additional targets. You can
     * specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more
     * information about how to use MaxErrors, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before the system stops sending the command to additional targets.
     *        You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value
     *        is 0. For more information about how to use MaxErrors, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     *        Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before the system stops sending the command to additional targets. You can
     * specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more
     * information about how to use MaxErrors, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The maximum number of errors allowed before the system stops sending the command to additional targets.
     *         You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value
     *         is 0. For more information about how to use MaxErrors, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands
     *         Using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before the system stops sending the command to additional targets. You can
     * specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more
     * information about how to use MaxErrors, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     * Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed before the system stops sending the command to additional targets.
     *        You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value
     *        is 0. For more information about how to use MaxErrors, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running Commands Using
     *        Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The number of targets for the command.
     * </p>
     * 
     * @param targetCount
     *        The number of targets for the command.
     */

    public void setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
    }

    /**
     * <p>
     * The number of targets for the command.
     * </p>
     * 
     * @return The number of targets for the command.
     */

    public Integer getTargetCount() {
        return this.targetCount;
    }

    /**
     * <p>
     * The number of targets for the command.
     * </p>
     * 
     * @param targetCount
     *        The number of targets for the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withTargetCount(Integer targetCount) {
        setTargetCount(targetCount);
        return this;
    }

    /**
     * <p>
     * The number of targets for which the command invocation reached a terminal state. Terminal states include the
     * following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
     * </p>
     * 
     * @param completedCount
     *        The number of targets for which the command invocation reached a terminal state. Terminal states include
     *        the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or
     *        Undeliverable.
     */

    public void setCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
    }

    /**
     * <p>
     * The number of targets for which the command invocation reached a terminal state. Terminal states include the
     * following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
     * </p>
     * 
     * @return The number of targets for which the command invocation reached a terminal state. Terminal states include
     *         the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or
     *         Undeliverable.
     */

    public Integer getCompletedCount() {
        return this.completedCount;
    }

    /**
     * <p>
     * The number of targets for which the command invocation reached a terminal state. Terminal states include the
     * following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
     * </p>
     * 
     * @param completedCount
     *        The number of targets for which the command invocation reached a terminal state. Terminal states include
     *        the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or
     *        Undeliverable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withCompletedCount(Integer completedCount) {
        setCompletedCount(completedCount);
        return this;
    }

    /**
     * <p>
     * The number of targets for which the status is Failed or Execution Timed Out.
     * </p>
     * 
     * @param errorCount
     *        The number of targets for which the status is Failed or Execution Timed Out.
     */

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>
     * The number of targets for which the status is Failed or Execution Timed Out.
     * </p>
     * 
     * @return The number of targets for which the status is Failed or Execution Timed Out.
     */

    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * <p>
     * The number of targets for which the status is Failed or Execution Timed Out.
     * </p>
     * 
     * @param errorCount
     *        The number of targets for which the status is Failed or Execution Timed Out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withErrorCount(Integer errorCount) {
        setErrorCount(errorCount);
        return this;
    }

    /**
     * <p>
     * The number of targets for which the status is Delivery Timed Out.
     * </p>
     * 
     * @param deliveryTimedOutCount
     *        The number of targets for which the status is Delivery Timed Out.
     */

    public void setDeliveryTimedOutCount(Integer deliveryTimedOutCount) {
        this.deliveryTimedOutCount = deliveryTimedOutCount;
    }

    /**
     * <p>
     * The number of targets for which the status is Delivery Timed Out.
     * </p>
     * 
     * @return The number of targets for which the status is Delivery Timed Out.
     */

    public Integer getDeliveryTimedOutCount() {
        return this.deliveryTimedOutCount;
    }

    /**
     * <p>
     * The number of targets for which the status is Delivery Timed Out.
     * </p>
     * 
     * @param deliveryTimedOutCount
     *        The number of targets for which the status is Delivery Timed Out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withDeliveryTimedOutCount(Integer deliveryTimedOutCount) {
        setDeliveryTimedOutCount(deliveryTimedOutCount);
        return this;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *        status changes.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes.
     * </p>
     * 
     * @return The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *         status changes.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status
     * changes.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that Run Command uses to act on your behalf when sending notifications about command
     *        status changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @return Configurations for sending notifications about command status changes.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withNotificationConfig(NotificationConfig notificationConfig) {
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

    public Command withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
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
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getExpiresAfter() != null)
            sb.append("ExpiresAfter: ").append(getExpiresAfter()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getRequestedDateTime() != null)
            sb.append("RequestedDateTime: ").append(getRequestedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: ").append(getOutputS3Region()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getTargetCount() != null)
            sb.append("TargetCount: ").append(getTargetCount()).append(",");
        if (getCompletedCount() != null)
            sb.append("CompletedCount: ").append(getCompletedCount()).append(",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: ").append(getErrorCount()).append(",");
        if (getDeliveryTimedOutCount() != null)
            sb.append("DeliveryTimedOutCount: ").append(getDeliveryTimedOutCount()).append(",");
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

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getExpiresAfter() == null ^ this.getExpiresAfter() == null)
            return false;
        if (other.getExpiresAfter() != null && other.getExpiresAfter().equals(this.getExpiresAfter()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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
        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null)
            return false;
        if (other.getOutputS3Region() != null && other.getOutputS3Region().equals(this.getOutputS3Region()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTargetCount() == null ^ this.getTargetCount() == null)
            return false;
        if (other.getTargetCount() != null && other.getTargetCount().equals(this.getTargetCount()) == false)
            return false;
        if (other.getCompletedCount() == null ^ this.getCompletedCount() == null)
            return false;
        if (other.getCompletedCount() != null && other.getCompletedCount().equals(this.getCompletedCount()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getDeliveryTimedOutCount() == null ^ this.getDeliveryTimedOutCount() == null)
            return false;
        if (other.getDeliveryTimedOutCount() != null && other.getDeliveryTimedOutCount().equals(this.getDeliveryTimedOutCount()) == false)
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
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiresAfter() == null) ? 0 : getExpiresAfter().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getRequestedDateTime() == null) ? 0 : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTargetCount() == null) ? 0 : getTargetCount().hashCode());
        hashCode = prime * hashCode + ((getCompletedCount() == null) ? 0 : getCompletedCount().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getDeliveryTimedOutCount() == null) ? 0 : getDeliveryTimedOutCount().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public Command clone() {
        try {
            return (Command) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.CommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
