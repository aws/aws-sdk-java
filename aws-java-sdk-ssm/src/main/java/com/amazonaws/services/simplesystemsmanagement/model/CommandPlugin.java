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
 * Describes plugin details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CommandPlugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandPlugin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     * aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
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
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't
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
     * A numeric response code generated after running the plugin.
     * </p>
     */
    private Integer responseCode;
    /**
     * <p>
     * The time the plugin started running.
     * </p>
     */
    private java.util.Date responseStartDateTime;
    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     * </p>
     */
    private java.util.Date responseFinishDateTime;
    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     */
    private String output;
    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the
     * command was not specified, then this string is empty.
     * </p>
     */
    private String standardOutputUrl;
    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string
     * is empty.
     * </p>
     */
    private String standardErrorUrl;
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
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     * aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * 
     * @param name
     *        The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     *        aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     * aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * 
     * @return The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     *         aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     * aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * 
     * @param name
     *        The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications,
     *        aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * 
     * @param status
     *        The status of this plugin. You can run a document with multiple plugins.
     * @see CommandPluginStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * 
     * @return The status of this plugin. You can run a document with multiple plugins.
     * @see CommandPluginStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * 
     * @param status
     *        The status of this plugin. You can run a document with multiple plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandPluginStatus
     */

    public CommandPlugin withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * 
     * @param status
     *        The status of this plugin. You can run a document with multiple plugins.
     * @see CommandPluginStatus
     */

    public void setStatus(CommandPluginStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * 
     * @param status
     *        The status of this plugin. You can run a document with multiple plugins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandPluginStatus
     */

    public CommandPlugin withStatus(CommandPluginStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
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
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't
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
     *        A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     *        includes states resulting from error and concurrency control parameters. StatusDetails can show different
     *        results than Status. For more information about these statuses, see <a
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
     *        Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might
     *        not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and
     *        they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal
     *        state.
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
     * A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
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
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't
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
     * @return A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     *         includes states resulting from error and concurrency control parameters. StatusDetails can show different
     *         results than Status. For more information about these statuses, see <a
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
     *         Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might
     *         not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit,
     *         and they don't contribute to whether the parent command status is Success or Incomplete. This is a
     *         terminal state.
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
     * A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     * includes states resulting from error and concurrency control parameters. StatusDetails can show different results
     * than Status. For more information about these statuses, see <a
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
     * Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be
     * responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't
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
     *        A detailed status of the plugin execution. StatusDetails includes more information than Status because it
     *        includes states resulting from error and concurrency control parameters. StatusDetails can show different
     *        results than Status. For more information about these statuses, see <a
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
     *        Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might
     *        not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and
     *        they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal
     *        state.
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

    public CommandPlugin withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     * 
     * @param responseCode
     *        A numeric response code generated after running the plugin.
     */

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     * 
     * @return A numeric response code generated after running the plugin.
     */

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     * 
     * @param responseCode
     *        A numeric response code generated after running the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     * 
     * @param responseStartDateTime
     *        The time the plugin started running.
     */

    public void setResponseStartDateTime(java.util.Date responseStartDateTime) {
        this.responseStartDateTime = responseStartDateTime;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     * 
     * @return The time the plugin started running.
     */

    public java.util.Date getResponseStartDateTime() {
        return this.responseStartDateTime;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     * 
     * @param responseStartDateTime
     *        The time the plugin started running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withResponseStartDateTime(java.util.Date responseStartDateTime) {
        setResponseStartDateTime(responseStartDateTime);
        return this;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     * </p>
     * 
     * @param responseFinishDateTime
     *        The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     */

    public void setResponseFinishDateTime(java.util.Date responseFinishDateTime) {
        this.responseFinishDateTime = responseFinishDateTime;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     * </p>
     * 
     * @return The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     */

    public java.util.Date getResponseFinishDateTime() {
        return this.responseFinishDateTime;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     * </p>
     * 
     * @param responseFinishDateTime
     *        The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withResponseFinishDateTime(java.util.Date responseFinishDateTime) {
        setResponseFinishDateTime(responseFinishDateTime);
        return this;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * 
     * @param output
     *        Output of the plugin execution.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * 
     * @return Output of the plugin execution.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * 
     * @param output
     *        Output of the plugin execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the
     * command was not specified, then this string is empty.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for
     *        the command was not specified, then this string is empty.
     */

    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the
     * command was not specified, then this string is empty.
     * </p>
     * 
     * @return The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for
     *         the command was not specified, then this string is empty.
     */

    public String getStandardOutputUrl() {
        return this.standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the
     * command was not specified, then this string is empty.
     * </p>
     * 
     * @param standardOutputUrl
     *        The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for
     *        the command was not specified, then this string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withStandardOutputUrl(String standardOutputUrl) {
        setStandardOutputUrl(standardOutputUrl);
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string
     * is empty.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this
     *        string is empty.
     */

    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string
     * is empty.
     * </p>
     * 
     * @return The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then
     *         this string is empty.
     */

    public String getStandardErrorUrl() {
        return this.standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string
     * is empty.
     * </p>
     * 
     * @param standardErrorUrl
     *        The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withStandardErrorUrl(String standardErrorUrl) {
        setStandardErrorUrl(standardErrorUrl);
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

    public CommandPlugin withOutputS3Region(String outputS3Region) {
        setOutputS3Region(outputS3Region);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command. For example, in the following response:</p>
     *        <p>
     *        test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *        </p>
     *        <p>
     *        test_folder is the name of the Amazon S3 bucket;
     *        </p>
     *        <p>
     *        ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *        </p>
     *        <p>
     *        i-1234567876543 is the instance ID;
     *        </p>
     *        <p>
     *        awsrunShellScript is the name of the plugin.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @return The S3 bucket where the responses to the command executions should be stored. This was requested when
     *         issuing the command. For example, in the following response:</p>
     *         <p>
     *         test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *         </p>
     *         <p>
     *         test_folder is the name of the Amazon S3 bucket;
     *         </p>
     *         <p>
     *         ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *         </p>
     *         <p>
     *         i-1234567876543 is the instance ID;
     *         </p>
     *         <p>
     *         awsrunShellScript is the name of the plugin.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command. For example, in the following response:</p>
     *        <p>
     *        test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *        </p>
     *        <p>
     *        test_folder is the name of the Amazon S3 bucket;
     *        </p>
     *        <p>
     *        ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *        </p>
     *        <p>
     *        i-1234567876543 is the instance ID;
     *        </p>
     *        <p>
     *        awsrunShellScript is the name of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command. For example, in the following response:</p>
     *        <p>
     *        test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *        </p>
     *        <p>
     *        test_folder is the name of the Amazon S3 bucket;
     *        </p>
     *        <p>
     *        ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *        </p>
     *        <p>
     *        i-1234567876543 is the instance ID;
     *        </p>
     *        <p>
     *        awsrunShellScript is the name of the plugin.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @return The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *         This was requested when issuing the command. For example, in the following response:</p>
     *         <p>
     *         test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *         </p>
     *         <p>
     *         test_folder is the name of the Amazon S3 bucket;
     *         </p>
     *         <p>
     *         ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *         </p>
     *         <p>
     *         i-1234567876543 is the instance ID;
     *         </p>
     *         <p>
     *         awsrunShellScript is the name of the plugin.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command. For example, in the following response:</p>
     *        <p>
     *        test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *        </p>
     *        <p>
     *        test_folder is the name of the Amazon S3 bucket;
     *        </p>
     *        <p>
     *        ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     *        </p>
     *        <p>
     *        i-1234567876543 is the instance ID;
     *        </p>
     *        <p>
     *        awsrunShellScript is the name of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommandPlugin withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getResponseStartDateTime() != null)
            sb.append("ResponseStartDateTime: ").append(getResponseStartDateTime()).append(",");
        if (getResponseFinishDateTime() != null)
            sb.append("ResponseFinishDateTime: ").append(getResponseFinishDateTime()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getStandardOutputUrl() != null)
            sb.append("StandardOutputUrl: ").append(getStandardOutputUrl()).append(",");
        if (getStandardErrorUrl() != null)
            sb.append("StandardErrorUrl: ").append(getStandardErrorUrl()).append(",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: ").append(getOutputS3Region()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommandPlugin == false)
            return false;
        CommandPlugin other = (CommandPlugin) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getResponseStartDateTime() == null ^ this.getResponseStartDateTime() == null)
            return false;
        if (other.getResponseStartDateTime() != null && other.getResponseStartDateTime().equals(this.getResponseStartDateTime()) == false)
            return false;
        if (other.getResponseFinishDateTime() == null ^ this.getResponseFinishDateTime() == null)
            return false;
        if (other.getResponseFinishDateTime() != null && other.getResponseFinishDateTime().equals(this.getResponseFinishDateTime()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null)
            return false;
        if (other.getStandardOutputUrl() != null && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false)
            return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null)
            return false;
        if (other.getStandardErrorUrl() != null && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getResponseStartDateTime() == null) ? 0 : getResponseStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getResponseFinishDateTime() == null) ? 0 : getResponseFinishDateTime().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CommandPlugin clone() {
        try {
            return (CommandPlugin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.CommandPluginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
