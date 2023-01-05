/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeTaskResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that was described.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The status of the task that was described.
     * </p>
     * <p>
     * For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync User
     * Guide</i>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the task that was described.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that is transferring files.
     * </p>
     */
    private String currentTaskExecutionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source file system's location.
     * </p>
     */
    private String sourceLocationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     * </p>
     */
    private String destinationLocationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the
     * task.
     * </p>
     * <p>
     * For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon CloudWatch
     * User Guide</i>.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     */
    private java.util.List<String> sourceNetworkInterfaceArns;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     */
    private java.util.List<String> destinationNetworkInterfaceArns;
    /**
     * <p>
     * The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     * options include preserving file or object metadata and verifying data integrity.
     * </p>
     * <p>
     * You can override these options for each task execution. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
     * </p>
     */
    private Options options;
    /**
     * <p>
     * A list of filter rules that exclude specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     */
    private java.util.List<FilterRule> excludes;
    /**
     * <p>
     * The schedule used to periodically transfer files from a source to a destination location.
     * </p>
     */
    private TaskSchedule schedule;
    /**
     * <p>
     * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot
     * issues.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     */
    private String errorDetail;
    /**
     * <p>
     * The time that the task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     */
    private java.util.List<FilterRule> includes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that was described.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task that was described.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that was described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task that was described.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that was described.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The status of the task that was described.
     * </p>
     * <p>
     * For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync User
     * Guide</i>.
     * </p>
     * 
     * @param status
     *        The status of the task that was described.</p>
     *        <p>
     *        For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync
     *        User Guide</i>.
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task that was described.
     * </p>
     * <p>
     * For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync User
     * Guide</i>.
     * </p>
     * 
     * @return The status of the task that was described.</p>
     *         <p>
     *         For detailed information about task execution statuses, see Understanding Task Statuses in the
     *         <i>DataSync User Guide</i>.
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task that was described.
     * </p>
     * <p>
     * For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync User
     * Guide</i>.
     * </p>
     * 
     * @param status
     *        The status of the task that was described.</p>
     *        <p>
     *        For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public DescribeTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task that was described.
     * </p>
     * <p>
     * For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync User
     * Guide</i>.
     * </p>
     * 
     * @param status
     *        The status of the task that was described.</p>
     *        <p>
     *        For detailed information about task execution statuses, see Understanding Task Statuses in the <i>DataSync
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public DescribeTaskResult withStatus(TaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the task that was described.
     * </p>
     * 
     * @param name
     *        The name of the task that was described.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task that was described.
     * </p>
     * 
     * @return The name of the task that was described.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the task that was described.
     * </p>
     * 
     * @param name
     *        The name of the task that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that is transferring files.
     * </p>
     * 
     * @param currentTaskExecutionArn
     *        The Amazon Resource Name (ARN) of the task execution that is transferring files.
     */

    public void setCurrentTaskExecutionArn(String currentTaskExecutionArn) {
        this.currentTaskExecutionArn = currentTaskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that is transferring files.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution that is transferring files.
     */

    public String getCurrentTaskExecutionArn() {
        return this.currentTaskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that is transferring files.
     * </p>
     * 
     * @param currentTaskExecutionArn
     *        The Amazon Resource Name (ARN) of the task execution that is transferring files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCurrentTaskExecutionArn(String currentTaskExecutionArn) {
        setCurrentTaskExecutionArn(currentTaskExecutionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source file system's location.
     * </p>
     * 
     * @param sourceLocationArn
     *        The Amazon Resource Name (ARN) of the source file system's location.
     */

    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source file system's location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source file system's location.
     */

    public String getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source file system's location.
     * </p>
     * 
     * @param sourceLocationArn
     *        The Amazon Resource Name (ARN) of the source file system's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSourceLocationArn(String sourceLocationArn) {
        setSourceLocationArn(sourceLocationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     */

    public void setDestinationLocationArn(String destinationLocationArn) {
        this.destinationLocationArn = destinationLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     */

    public String getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services storage resource's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDestinationLocationArn(String destinationLocationArn) {
        setDestinationLocationArn(destinationLocationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the
     * task.
     * </p>
     * <p>
     * For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon CloudWatch
     * User Guide</i>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events
     *        in the task.</p>
     *        <p>
     *        For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon
     *        CloudWatch User Guide</i>.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the
     * task.
     * </p>
     * <p>
     * For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon CloudWatch
     * User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events
     *         in the task.</p>
     *         <p>
     *         For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon
     *         CloudWatch User Guide</i>.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the
     * task.
     * </p>
     * <p>
     * For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon CloudWatch
     * User Guide</i>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events
     *        in the task.</p>
     *        <p>
     *        For more information on these groups, see Working with Log Groups and Log Streams in the <i>Amazon
     *        CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >Network interface requirements</a>.
     */

    public java.util.List<String> getSourceNetworkInterfaceArns() {
        return sourceNetworkInterfaceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     */

    public void setSourceNetworkInterfaceArns(java.util.Collection<String> sourceNetworkInterfaceArns) {
        if (sourceNetworkInterfaceArns == null) {
            this.sourceNetworkInterfaceArns = null;
            return;
        }

        this.sourceNetworkInterfaceArns = new java.util.ArrayList<String>(sourceNetworkInterfaceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceNetworkInterfaceArns(java.util.Collection)} or
     * {@link #withSourceNetworkInterfaceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSourceNetworkInterfaceArns(String... sourceNetworkInterfaceArns) {
        if (this.sourceNetworkInterfaceArns == null) {
            setSourceNetworkInterfaceArns(new java.util.ArrayList<String>(sourceNetworkInterfaceArns.length));
        }
        for (String ele : sourceNetworkInterfaceArns) {
            this.sourceNetworkInterfaceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your source location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSourceNetworkInterfaceArns(java.util.Collection<String> sourceNetworkInterfaceArns) {
        setSourceNetworkInterfaceArns(sourceNetworkInterfaceArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >Network interface requirements</a>.
     */

    public java.util.List<String> getDestinationNetworkInterfaceArns() {
        return destinationNetworkInterfaceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     */

    public void setDestinationNetworkInterfaceArns(java.util.Collection<String> destinationNetworkInterfaceArns) {
        if (destinationNetworkInterfaceArns == null) {
            this.destinationNetworkInterfaceArns = null;
            return;
        }

        this.destinationNetworkInterfaceArns = new java.util.ArrayList<String>(destinationNetworkInterfaceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationNetworkInterfaceArns(java.util.Collection)} or
     * {@link #withDestinationNetworkInterfaceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDestinationNetworkInterfaceArns(String... destinationNetworkInterfaceArns) {
        if (this.destinationNetworkInterfaceArns == null) {
            setDestinationNetworkInterfaceArns(new java.util.ArrayList<String>(destinationNetworkInterfaceArns.length));
        }
        for (String ele : destinationNetworkInterfaceArns) {
            this.destinationNetworkInterfaceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >Network interface requirements</a>.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The Amazon Resource Names (ARNs) of the network interfaces created for your destination location. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >Network interface requirements</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDestinationNetworkInterfaceArns(java.util.Collection<String> destinationNetworkInterfaceArns) {
        setDestinationNetworkInterfaceArns(destinationNetworkInterfaceArns);
        return this;
    }

    /**
     * <p>
     * The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     * options include preserving file or object metadata and verifying data integrity.
     * </p>
     * <p>
     * You can override these options for each task execution. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
     * </p>
     * 
     * @param options
     *        The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     *        options include preserving file or object metadata and verifying data integrity.</p>
     *        <p>
     *        You can override these options for each task execution. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html"
     *        >StartTaskExecution</a>.
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * <p>
     * The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     * options include preserving file or object metadata and verifying data integrity.
     * </p>
     * <p>
     * You can override these options for each task execution. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
     * </p>
     * 
     * @return The configuration options that control the behavior of the <code>StartTaskExecution</code> operation.
     *         Some options include preserving file or object metadata and verifying data integrity.</p>
     *         <p>
     *         You can override these options for each task execution. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html"
     *         >StartTaskExecution</a>.
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     * options include preserving file or object metadata and verifying data integrity.
     * </p>
     * <p>
     * You can override these options for each task execution. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
     * </p>
     * 
     * @param options
     *        The configuration options that control the behavior of the <code>StartTaskExecution</code> operation. Some
     *        options include preserving file or object metadata and verifying data integrity.</p>
     *        <p>
     *        You can override these options for each task execution. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html"
     *        >StartTaskExecution</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withOptions(Options options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * A list of filter rules that exclude specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @return A list of filter rules that exclude specific data during your transfer. For more information and
     *         examples, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering
     *         data transferred by DataSync</a>.
     */

    public java.util.List<FilterRule> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * A list of filter rules that exclude specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that exclude specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     */

    public void setExcludes(java.util.Collection<FilterRule> excludes) {
        if (excludes == null) {
            this.excludes = null;
            return;
        }

        this.excludes = new java.util.ArrayList<FilterRule>(excludes);
    }

    /**
     * <p>
     * A list of filter rules that exclude specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that exclude specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withExcludes(FilterRule... excludes) {
        if (this.excludes == null) {
            setExcludes(new java.util.ArrayList<FilterRule>(excludes.length));
        }
        for (FilterRule ele : excludes) {
            this.excludes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter rules that exclude specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that exclude specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The schedule used to periodically transfer files from a source to a destination location.
     * </p>
     * 
     * @param schedule
     *        The schedule used to periodically transfer files from a source to a destination location.
     */

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule used to periodically transfer files from a source to a destination location.
     * </p>
     * 
     * @return The schedule used to periodically transfer files from a source to a destination location.
     */

    public TaskSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule used to periodically transfer files from a source to a destination location.
     * </p>
     * 
     * @param schedule
     *        The schedule used to periodically transfer files from a source to a destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSchedule(TaskSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot
     * issues.
     * </p>
     * 
     * @param errorCode
     *        Errors that DataSync encountered during execution of the task. You can use this error code to help
     *        troubleshoot issues.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot
     * issues.
     * </p>
     * 
     * @return Errors that DataSync encountered during execution of the task. You can use this error code to help
     *         troubleshoot issues.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot
     * issues.
     * </p>
     * 
     * @param errorCode
     *        Errors that DataSync encountered during execution of the task. You can use this error code to help
     *        troubleshoot issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @param errorDetail
     *        Detailed description of an error that was encountered during the task execution. You can use this
     *        information to help troubleshoot issues.
     */

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @return Detailed description of an error that was encountered during the task execution. You can use this
     *         information to help troubleshoot issues.
     */

    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @param errorDetail
     *        Detailed description of an error that was encountered during the task execution. You can use this
     *        information to help troubleshoot issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withErrorDetail(String errorDetail) {
        setErrorDetail(errorDetail);
        return this;
    }

    /**
     * <p>
     * The time that the task was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the task was created.
     * </p>
     * 
     * @return The time that the task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the task was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @return A list of filter rules that include specific data during your transfer. For more information and
     *         examples, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering
     *         data transferred by DataSync</a>.
     */

    public java.util.List<FilterRule> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @param includes
     *        A list of filter rules that include specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     */

    public void setIncludes(java.util.Collection<FilterRule> includes) {
        if (includes == null) {
            this.includes = null;
            return;
        }

        this.includes = new java.util.ArrayList<FilterRule>(includes);
    }

    /**
     * <p>
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        A list of filter rules that include specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withIncludes(FilterRule... includes) {
        if (this.includes == null) {
            setIncludes(new java.util.ArrayList<FilterRule>(includes.length));
        }
        for (FilterRule ele : includes) {
            this.includes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     * 
     * @param includes
     *        A list of filter rules that include specific data during your transfer. For more information and examples,
     *        see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data
     *        transferred by DataSync</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withIncludes(java.util.Collection<FilterRule> includes) {
        setIncludes(includes);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCurrentTaskExecutionArn() != null)
            sb.append("CurrentTaskExecutionArn: ").append(getCurrentTaskExecutionArn()).append(",");
        if (getSourceLocationArn() != null)
            sb.append("SourceLocationArn: ").append(getSourceLocationArn()).append(",");
        if (getDestinationLocationArn() != null)
            sb.append("DestinationLocationArn: ").append(getDestinationLocationArn()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getSourceNetworkInterfaceArns() != null)
            sb.append("SourceNetworkInterfaceArns: ").append(getSourceNetworkInterfaceArns()).append(",");
        if (getDestinationNetworkInterfaceArns() != null)
            sb.append("DestinationNetworkInterfaceArns: ").append(getDestinationNetworkInterfaceArns()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskResult == false)
            return false;
        DescribeTaskResult other = (DescribeTaskResult) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCurrentTaskExecutionArn() == null ^ this.getCurrentTaskExecutionArn() == null)
            return false;
        if (other.getCurrentTaskExecutionArn() != null && other.getCurrentTaskExecutionArn().equals(this.getCurrentTaskExecutionArn()) == false)
            return false;
        if (other.getSourceLocationArn() == null ^ this.getSourceLocationArn() == null)
            return false;
        if (other.getSourceLocationArn() != null && other.getSourceLocationArn().equals(this.getSourceLocationArn()) == false)
            return false;
        if (other.getDestinationLocationArn() == null ^ this.getDestinationLocationArn() == null)
            return false;
        if (other.getDestinationLocationArn() != null && other.getDestinationLocationArn().equals(this.getDestinationLocationArn()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getSourceNetworkInterfaceArns() == null ^ this.getSourceNetworkInterfaceArns() == null)
            return false;
        if (other.getSourceNetworkInterfaceArns() != null && other.getSourceNetworkInterfaceArns().equals(this.getSourceNetworkInterfaceArns()) == false)
            return false;
        if (other.getDestinationNetworkInterfaceArns() == null ^ this.getDestinationNetworkInterfaceArns() == null)
            return false;
        if (other.getDestinationNetworkInterfaceArns() != null
                && other.getDestinationNetworkInterfaceArns().equals(this.getDestinationNetworkInterfaceArns()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCurrentTaskExecutionArn() == null) ? 0 : getCurrentTaskExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationArn() == null) ? 0 : getSourceLocationArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationLocationArn() == null) ? 0 : getDestinationLocationArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSourceNetworkInterfaceArns() == null) ? 0 : getSourceNetworkInterfaceArns().hashCode());
        hashCode = prime * hashCode + ((getDestinationNetworkInterfaceArns() == null) ? 0 : getDestinationNetworkInterfaceArns().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskResult clone() {
        try {
            return (DescribeTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
