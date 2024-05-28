/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The ARN of your task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The status of your task. For information about what each status means, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     * >Task statuses</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of your task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the most recent task execution.
     * </p>
     */
    private String currentTaskExecutionArn;
    /**
     * <p>
     * The ARN of your transfer's source location.
     * </p>
     */
    private String sourceLocationArn;
    /**
     * <p>
     * The ARN of your transfer's destination location.
     * </p>
     */
    private String destinationLocationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync with
     * Amazon CloudWatch</a>.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your source location.
     * </p>
     */
    private java.util.List<String> sourceNetworkInterfaceArns;
    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your destination location.
     * </p>
     */
    private java.util.List<String> destinationNetworkInterfaceArns;
    /**
     * <p>
     * The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at the end
     * of your transfer, bandwidth limits, among other options.
     * </p>
     */
    private Options options;
    /**
     * <p>
     * The exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     */
    private java.util.List<FilterRule> excludes;
    /**
     * <p>
     * The schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     */
    private TaskSchedule schedule;
    /**
     * <p>
     * If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * If there's an issue with your task, you can use the error details to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
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
     * The include filters that define the files, objects, and folders in your source location that you want DataSync to
     * transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     */
    private java.util.List<FilterRule> includes;
    /**
     * <p>
     * The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     */
    private ManifestConfig manifestConfig;
    /**
     * <p>
     * The configuration of your task report, which provides detailed information about your DataSync transfer. For more
     * information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring
     * your DataSync transfers with task reports</a>.
     * </p>
     */
    private TaskReportConfig taskReportConfig;
    /**
     * <p>
     * The details about your <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task
     * schedule</a>.
     * </p>
     */
    private TaskScheduleDetails scheduleDetails;

    /**
     * <p>
     * The ARN of your task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of your task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of your task.
     * </p>
     * 
     * @return The ARN of your task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of your task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The status of your task. For information about what each status means, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     * >Task statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of your task. For information about what each status means, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     *        >Task statuses</a>.
     * @see TaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of your task. For information about what each status means, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     * >Task statuses</a>.
     * </p>
     * 
     * @return The status of your task. For information about what each status means, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     *         >Task statuses</a>.
     * @see TaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of your task. For information about what each status means, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     * >Task statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of your task. For information about what each status means, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     *        >Task statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public DescribeTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of your task. For information about what each status means, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     * >Task statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of your task. For information about what each status means, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/understand-task-statuses.html#understand-task-creation-statuses"
     *        >Task statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public DescribeTaskResult withStatus(TaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of your task.
     * </p>
     * 
     * @param name
     *        The name of your task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your task.
     * </p>
     * 
     * @return The name of your task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your task.
     * </p>
     * 
     * @param name
     *        The name of your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the most recent task execution.
     * </p>
     * 
     * @param currentTaskExecutionArn
     *        The ARN of the most recent task execution.
     */

    public void setCurrentTaskExecutionArn(String currentTaskExecutionArn) {
        this.currentTaskExecutionArn = currentTaskExecutionArn;
    }

    /**
     * <p>
     * The ARN of the most recent task execution.
     * </p>
     * 
     * @return The ARN of the most recent task execution.
     */

    public String getCurrentTaskExecutionArn() {
        return this.currentTaskExecutionArn;
    }

    /**
     * <p>
     * The ARN of the most recent task execution.
     * </p>
     * 
     * @param currentTaskExecutionArn
     *        The ARN of the most recent task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCurrentTaskExecutionArn(String currentTaskExecutionArn) {
        setCurrentTaskExecutionArn(currentTaskExecutionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of your transfer's source location.
     * </p>
     * 
     * @param sourceLocationArn
     *        The ARN of your transfer's source location.
     */

    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of your transfer's source location.
     * </p>
     * 
     * @return The ARN of your transfer's source location.
     */

    public String getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of your transfer's source location.
     * </p>
     * 
     * @param sourceLocationArn
     *        The ARN of your transfer's source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSourceLocationArn(String sourceLocationArn) {
        setSourceLocationArn(sourceLocationArn);
        return this;
    }

    /**
     * <p>
     * The ARN of your transfer's destination location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The ARN of your transfer's destination location.
     */

    public void setDestinationLocationArn(String destinationLocationArn) {
        this.destinationLocationArn = destinationLocationArn;
    }

    /**
     * <p>
     * The ARN of your transfer's destination location.
     * </p>
     * 
     * @return The ARN of your transfer's destination location.
     */

    public String getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    /**
     * <p>
     * The ARN of your transfer's destination location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The ARN of your transfer's destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDestinationLocationArn(String destinationLocationArn) {
        setDestinationLocationArn(destinationLocationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync
     *        with Amazon CloudWatch</a>.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync
     *         with Amazon CloudWatch</a>.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync with
     * Amazon CloudWatch</a>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring DataSync
     *        with Amazon CloudWatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your source location.
     * </p>
     * 
     * @return The ARNs of the <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >network interfaces</a> that DataSync created for your source location.
     */

    public java.util.List<String> getSourceNetworkInterfaceArns() {
        return sourceNetworkInterfaceArns;
    }

    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your source location.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your source location.
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
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your source location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceNetworkInterfaceArns(java.util.Collection)} or
     * {@link #withSourceNetworkInterfaceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your source location.
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
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your source location.
     * </p>
     * 
     * @param sourceNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSourceNetworkInterfaceArns(java.util.Collection<String> sourceNetworkInterfaceArns) {
        setSourceNetworkInterfaceArns(sourceNetworkInterfaceArns);
        return this;
    }

    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your destination location.
     * </p>
     * 
     * @return The ARNs of the <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *         >network interfaces</a> that DataSync created for your destination location.
     */

    public java.util.List<String> getDestinationNetworkInterfaceArns() {
        return destinationNetworkInterfaceArns;
    }

    /**
     * <p>
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your destination location.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your destination location.
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
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your destination location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationNetworkInterfaceArns(java.util.Collection)} or
     * {@link #withDestinationNetworkInterfaceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your destination location.
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
     * The ARNs of the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     * >network interfaces</a> that DataSync created for your destination location.
     * </p>
     * 
     * @param destinationNetworkInterfaceArns
     *        The ARNs of the <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces"
     *        >network interfaces</a> that DataSync created for your destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withDestinationNetworkInterfaceArns(java.util.Collection<String> destinationNetworkInterfaceArns) {
        setDestinationNetworkInterfaceArns(destinationNetworkInterfaceArns);
        return this;
    }

    /**
     * <p>
     * The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at the end
     * of your transfer, bandwidth limits, among other options.
     * </p>
     * 
     * @param options
     *        The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at
     *        the end of your transfer, bandwidth limits, among other options.
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * <p>
     * The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at the end
     * of your transfer, bandwidth limits, among other options.
     * </p>
     * 
     * @return The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at
     *         the end of your transfer, bandwidth limits, among other options.
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at the end
     * of your transfer, bandwidth limits, among other options.
     * </p>
     * 
     * @param options
     *        The task's settings. For example, what file metadata gets preserved, how data integrity gets verified at
     *        the end of your transfer, bandwidth limits, among other options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withOptions(Options options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @return The exclude filters that define the files, objects, and folders in your source location that you don't
     *         want DataSync to transfer. For more information and examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *         transfers by using filters</a>.
     */

    public java.util.List<FilterRule> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * The exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param excludes
     *        The exclude filters that define the files, objects, and folders in your source location that you don't
     *        want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
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
     * The exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        The exclude filters that define the files, objects, and folders in your source location that you don't
     *        want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
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
     * The exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param excludes
     *        The exclude filters that define the files, objects, and folders in your source location that you don't
     *        want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @param schedule
     *        The schedule for when you want your task to run. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *        task</a>.
     */

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @return The schedule for when you want your task to run. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *         task</a>.
     */

    public TaskSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @param schedule
     *        The schedule for when you want your task to run. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *        task</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withSchedule(TaskSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param errorCode
     *        If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @return If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *         >Troubleshooting issues with DataSync transfers</a>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param errorCode
     *        If there's an issue with your task, you can use the error code to help you troubleshoot the problem. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error details to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param errorDetail
     *        If there's an issue with your task, you can use the error details to help you troubleshoot the problem.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
     */

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error details to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @return If there's an issue with your task, you can use the error details to help you troubleshoot the problem.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *         >Troubleshooting issues with DataSync transfers</a>.
     */

    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * If there's an issue with your task, you can use the error details to help you troubleshoot the problem. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param errorDetail
     *        If there's an issue with your task, you can use the error details to help you troubleshoot the problem.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
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
     * The include filters that define the files, objects, and folders in your source location that you want DataSync to
     * transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @return The include filters that define the files, objects, and folders in your source location that you want
     *         DataSync to transfer. For more information and examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *         transfers by using filters</a>.
     */

    public java.util.List<FilterRule> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * The include filters that define the files, objects, and folders in your source location that you want DataSync to
     * transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param includes
     *        The include filters that define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
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
     * The include filters that define the files, objects, and folders in your source location that you want DataSync to
     * transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        The include filters that define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
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
     * The include filters that define the files, objects, and folders in your source location that you want DataSync to
     * transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param includes
     *        The include filters that define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withIncludes(java.util.Collection<FilterRule> includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @param manifestConfig
     *        The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.
     */

    public void setManifestConfig(ManifestConfig manifestConfig) {
        this.manifestConfig = manifestConfig;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @return The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *         what DataSync transfers by using a manifest</a>.
     */

    public ManifestConfig getManifestConfig() {
        return this.manifestConfig;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @param manifestConfig
     *        The configuration of the manifest that lists the files or objects that you want DataSync to transfer. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withManifestConfig(ManifestConfig manifestConfig) {
        setManifestConfig(manifestConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about your DataSync transfer. For more
     * information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring
     * your DataSync transfers with task reports</a>.
     * </p>
     * 
     * @param taskReportConfig
     *        The configuration of your task report, which provides detailed information about your DataSync transfer.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.
     */

    public void setTaskReportConfig(TaskReportConfig taskReportConfig) {
        this.taskReportConfig = taskReportConfig;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about your DataSync transfer. For more
     * information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring
     * your DataSync transfers with task reports</a>.
     * </p>
     * 
     * @return The configuration of your task report, which provides detailed information about your DataSync transfer.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *         transfers with task reports</a>.
     */

    public TaskReportConfig getTaskReportConfig() {
        return this.taskReportConfig;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about your DataSync transfer. For more
     * information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring
     * your DataSync transfers with task reports</a>.
     * </p>
     * 
     * @param taskReportConfig
     *        The configuration of your task report, which provides detailed information about your DataSync transfer.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withTaskReportConfig(TaskReportConfig taskReportConfig) {
        setTaskReportConfig(taskReportConfig);
        return this;
    }

    /**
     * <p>
     * The details about your <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task
     * schedule</a>.
     * </p>
     * 
     * @param scheduleDetails
     *        The details about your <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task schedule</a>.
     */

    public void setScheduleDetails(TaskScheduleDetails scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * <p>
     * The details about your <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task
     * schedule</a>.
     * </p>
     * 
     * @return The details about your <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task schedule</a>.
     */

    public TaskScheduleDetails getScheduleDetails() {
        return this.scheduleDetails;
    }

    /**
     * <p>
     * The details about your <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task
     * schedule</a>.
     * </p>
     * 
     * @param scheduleDetails
     *        The details about your <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task schedule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskResult withScheduleDetails(TaskScheduleDetails scheduleDetails) {
        setScheduleDetails(scheduleDetails);
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
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getManifestConfig() != null)
            sb.append("ManifestConfig: ").append(getManifestConfig()).append(",");
        if (getTaskReportConfig() != null)
            sb.append("TaskReportConfig: ").append(getTaskReportConfig()).append(",");
        if (getScheduleDetails() != null)
            sb.append("ScheduleDetails: ").append(getScheduleDetails());
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
        if (other.getManifestConfig() == null ^ this.getManifestConfig() == null)
            return false;
        if (other.getManifestConfig() != null && other.getManifestConfig().equals(this.getManifestConfig()) == false)
            return false;
        if (other.getTaskReportConfig() == null ^ this.getTaskReportConfig() == null)
            return false;
        if (other.getTaskReportConfig() != null && other.getTaskReportConfig().equals(this.getTaskReportConfig()) == false)
            return false;
        if (other.getScheduleDetails() == null ^ this.getScheduleDetails() == null)
            return false;
        if (other.getScheduleDetails() != null && other.getScheduleDetails().equals(this.getScheduleDetails()) == false)
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
        hashCode = prime * hashCode + ((getManifestConfig() == null) ? 0 : getManifestConfig().hashCode());
        hashCode = prime * hashCode + ((getTaskReportConfig() == null) ? 0 : getTaskReportConfig().hashCode());
        hashCode = prime * hashCode + ((getScheduleDetails() == null) ? 0 : getScheduleDetails().hashCode());
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
