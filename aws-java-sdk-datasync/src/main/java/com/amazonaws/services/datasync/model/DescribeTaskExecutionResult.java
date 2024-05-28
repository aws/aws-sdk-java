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
 * DescribeTaskExecutionResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is hierarchical
     * and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     * </p>
     */
    private String taskExecutionArn;
    /**
     * <p>
     * The status of the task execution.
     * </p>
     */
    private String status;

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
     * A list of filter rules that include specific data during your transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Filtering data transferred by
     * DataSync</a>.
     * </p>
     */
    private java.util.List<FilterRule> includes;
    /**
     * <p>
     * The configuration of the manifest that lists the files or objects to transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     */
    private ManifestConfig manifestConfig;
    /**
     * <p>
     * The time when the task execution started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will transfer over the network. This value
     * is calculated during the task execution's <code>PREPARING</code> phase before the <code>TRANSFERRING</code>
     * phase. The calculation is based on comparing the content of the source and destination locations and finding the
     * difference that needs to be transferred.
     * </p>
     */
    private Long estimatedFilesToTransfer;
    /**
     * <p>
     * The estimated physical number of bytes that will transfer over the network.
     * </p>
     */
    private Long estimatedBytesToTransfer;
    /**
     * <p>
     * The actual number of files, objects, and directories that DataSync transferred over the network. This value is
     * updated periodically during the task execution's <code>TRANSFERRING</code> phase when something is read from the
     * source and sent over the network.
     * </p>
     * <p>
     * If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>. In
     * some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element is
     * implementation-specific for some location types, so don't use it as an exact indication of what transferred or to
     * monitor your task execution.
     * </p>
     */
    private Long filesTransferred;
    /**
     * <p>
     * The number of logical bytes written to the destination location.
     * </p>
     */
    private Long bytesWritten;
    /**
     * <p>
     * The total number of bytes that are involved in the transfer. For the number of bytes sent over the network, see
     * <code>BytesCompressed</code>.
     * </p>
     */
    private Long bytesTransferred;
    /**
     * <p>
     * The physical number of bytes transferred over the network after compression was applied. In most cases, this
     * number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     * </p>
     */
    private Long bytesCompressed;
    /**
     * <p>
     * The result of the task execution.
     * </p>
     */
    private TaskExecutionResultDetail result;
    /**
     * <p>
     * The configuration of your task report, which provides detailed information about for your DataSync transfer. For
     * more information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating
     * a task report</a>.
     * </p>
     */
    private TaskReportConfig taskReportConfig;
    /**
     * <p>
     * The number of files, objects, and directories that DataSync deleted in your destination location. If you don't <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     */
    private Long filesDeleted;
    /**
     * <p>
     * The number of files, objects, and directories that DataSync skipped during your transfer.
     * </p>
     */
    private Long filesSkipped;
    /**
     * <p>
     * The number of files, objects, and directories that DataSync verified during your transfer.
     * </p>
     * <note>
     * <p>
     * When you configure your task to <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html">verify only
     * the data that's transferred</a>, DataSync doesn't verify directories in some situations or files that fail to
     * transfer.
     * </p>
     * </note>
     */
    private Long filesVerified;
    /**
     * <p>
     * Indicates whether DataSync generated a complete <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your transfer.
     * </p>
     */
    private ReportResult reportResult;
    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will delete in your destination location. If
     * you don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     * task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     */
    private Long estimatedFilesToDelete;

    /**
     * <p>
     * The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is hierarchical
     * and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @param taskExecutionArn
     *        The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is
     *        hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *        <p>
     *        For example, a <code>TaskExecution</code> value with the ARN
     *        <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *        executed the task with the ARN
     *        <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     */

    public void setTaskExecutionArn(String taskExecutionArn) {
        this.taskExecutionArn = taskExecutionArn;
    }

    /**
     * <p>
     * The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is hierarchical
     * and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @return The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is
     *         hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *         <p>
     *         For example, a <code>TaskExecution</code> value with the ARN
     *         <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *         executed the task with the ARN
     *         <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     */

    public String getTaskExecutionArn() {
        return this.taskExecutionArn;
    }

    /**
     * <p>
     * The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is hierarchical
     * and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @param taskExecutionArn
     *        The ARN of the task execution that you wanted information about. <code>TaskExecutionArn</code> is
     *        hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *        <p>
     *        For example, a <code>TaskExecution</code> value with the ARN
     *        <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *        executed the task with the ARN
     *        <code>arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withTaskExecutionArn(String taskExecutionArn) {
        setTaskExecutionArn(taskExecutionArn);
        return this;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @see TaskExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @return The status of the task execution.
     * @see TaskExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskExecutionStatus
     */

    public DescribeTaskExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskExecutionStatus
     */

    public DescribeTaskExecutionResult withStatus(TaskExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param options
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * @return
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * @param options
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withOptions(Options options) {
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

    public DescribeTaskExecutionResult withExcludes(FilterRule... excludes) {
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

    public DescribeTaskExecutionResult withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
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

    public DescribeTaskExecutionResult withIncludes(FilterRule... includes) {
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

    public DescribeTaskExecutionResult withIncludes(java.util.Collection<FilterRule> includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects to transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @param manifestConfig
     *        The configuration of the manifest that lists the files or objects to transfer. For more information, see
     *        <a href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.
     */

    public void setManifestConfig(ManifestConfig manifestConfig) {
        this.manifestConfig = manifestConfig;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects to transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @return The configuration of the manifest that lists the files or objects to transfer. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *         what DataSync transfers by using a manifest</a>.
     */

    public ManifestConfig getManifestConfig() {
        return this.manifestConfig;
    }

    /**
     * <p>
     * The configuration of the manifest that lists the files or objects to transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * 
     * @param manifestConfig
     *        The configuration of the manifest that lists the files or objects to transfer. For more information, see
     *        <a href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withManifestConfig(ManifestConfig manifestConfig) {
        setManifestConfig(manifestConfig);
        return this;
    }

    /**
     * <p>
     * The time when the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time when the task execution started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the task execution started.
     * </p>
     * 
     * @return The time when the task execution started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time when the task execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will transfer over the network. This value
     * is calculated during the task execution's <code>PREPARING</code> phase before the <code>TRANSFERRING</code>
     * phase. The calculation is based on comparing the content of the source and destination locations and finding the
     * difference that needs to be transferred.
     * </p>
     * 
     * @param estimatedFilesToTransfer
     *        The expected number of files, objects, and directories that DataSync will transfer over the network. This
     *        value is calculated during the task execution's <code>PREPARING</code> phase before the
     *        <code>TRANSFERRING</code> phase. The calculation is based on comparing the content of the source and
     *        destination locations and finding the difference that needs to be transferred.
     */

    public void setEstimatedFilesToTransfer(Long estimatedFilesToTransfer) {
        this.estimatedFilesToTransfer = estimatedFilesToTransfer;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will transfer over the network. This value
     * is calculated during the task execution's <code>PREPARING</code> phase before the <code>TRANSFERRING</code>
     * phase. The calculation is based on comparing the content of the source and destination locations and finding the
     * difference that needs to be transferred.
     * </p>
     * 
     * @return The expected number of files, objects, and directories that DataSync will transfer over the network. This
     *         value is calculated during the task execution's <code>PREPARING</code> phase before the
     *         <code>TRANSFERRING</code> phase. The calculation is based on comparing the content of the source and
     *         destination locations and finding the difference that needs to be transferred.
     */

    public Long getEstimatedFilesToTransfer() {
        return this.estimatedFilesToTransfer;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will transfer over the network. This value
     * is calculated during the task execution's <code>PREPARING</code> phase before the <code>TRANSFERRING</code>
     * phase. The calculation is based on comparing the content of the source and destination locations and finding the
     * difference that needs to be transferred.
     * </p>
     * 
     * @param estimatedFilesToTransfer
     *        The expected number of files, objects, and directories that DataSync will transfer over the network. This
     *        value is calculated during the task execution's <code>PREPARING</code> phase before the
     *        <code>TRANSFERRING</code> phase. The calculation is based on comparing the content of the source and
     *        destination locations and finding the difference that needs to be transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withEstimatedFilesToTransfer(Long estimatedFilesToTransfer) {
        setEstimatedFilesToTransfer(estimatedFilesToTransfer);
        return this;
    }

    /**
     * <p>
     * The estimated physical number of bytes that will transfer over the network.
     * </p>
     * 
     * @param estimatedBytesToTransfer
     *        The estimated physical number of bytes that will transfer over the network.
     */

    public void setEstimatedBytesToTransfer(Long estimatedBytesToTransfer) {
        this.estimatedBytesToTransfer = estimatedBytesToTransfer;
    }

    /**
     * <p>
     * The estimated physical number of bytes that will transfer over the network.
     * </p>
     * 
     * @return The estimated physical number of bytes that will transfer over the network.
     */

    public Long getEstimatedBytesToTransfer() {
        return this.estimatedBytesToTransfer;
    }

    /**
     * <p>
     * The estimated physical number of bytes that will transfer over the network.
     * </p>
     * 
     * @param estimatedBytesToTransfer
     *        The estimated physical number of bytes that will transfer over the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withEstimatedBytesToTransfer(Long estimatedBytesToTransfer) {
        setEstimatedBytesToTransfer(estimatedBytesToTransfer);
        return this;
    }

    /**
     * <p>
     * The actual number of files, objects, and directories that DataSync transferred over the network. This value is
     * updated periodically during the task execution's <code>TRANSFERRING</code> phase when something is read from the
     * source and sent over the network.
     * </p>
     * <p>
     * If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>. In
     * some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element is
     * implementation-specific for some location types, so don't use it as an exact indication of what transferred or to
     * monitor your task execution.
     * </p>
     * 
     * @param filesTransferred
     *        The actual number of files, objects, and directories that DataSync transferred over the network. This
     *        value is updated periodically during the task execution's <code>TRANSFERRING</code> phase when something
     *        is read from the source and sent over the network.</p>
     *        <p>
     *        If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>
     *        . In some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element
     *        is implementation-specific for some location types, so don't use it as an exact indication of what
     *        transferred or to monitor your task execution.
     */

    public void setFilesTransferred(Long filesTransferred) {
        this.filesTransferred = filesTransferred;
    }

    /**
     * <p>
     * The actual number of files, objects, and directories that DataSync transferred over the network. This value is
     * updated periodically during the task execution's <code>TRANSFERRING</code> phase when something is read from the
     * source and sent over the network.
     * </p>
     * <p>
     * If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>. In
     * some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element is
     * implementation-specific for some location types, so don't use it as an exact indication of what transferred or to
     * monitor your task execution.
     * </p>
     * 
     * @return The actual number of files, objects, and directories that DataSync transferred over the network. This
     *         value is updated periodically during the task execution's <code>TRANSFERRING</code> phase when something
     *         is read from the source and sent over the network.</p>
     *         <p>
     *         If DataSync fails to transfer something, this value can be less than
     *         <code>EstimatedFilesToTransfer</code>. In some cases, this value can also be greater than
     *         <code>EstimatedFilesToTransfer</code>. This element is implementation-specific for some location types,
     *         so don't use it as an exact indication of what transferred or to monitor your task execution.
     */

    public Long getFilesTransferred() {
        return this.filesTransferred;
    }

    /**
     * <p>
     * The actual number of files, objects, and directories that DataSync transferred over the network. This value is
     * updated periodically during the task execution's <code>TRANSFERRING</code> phase when something is read from the
     * source and sent over the network.
     * </p>
     * <p>
     * If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>. In
     * some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element is
     * implementation-specific for some location types, so don't use it as an exact indication of what transferred or to
     * monitor your task execution.
     * </p>
     * 
     * @param filesTransferred
     *        The actual number of files, objects, and directories that DataSync transferred over the network. This
     *        value is updated periodically during the task execution's <code>TRANSFERRING</code> phase when something
     *        is read from the source and sent over the network.</p>
     *        <p>
     *        If DataSync fails to transfer something, this value can be less than <code>EstimatedFilesToTransfer</code>
     *        . In some cases, this value can also be greater than <code>EstimatedFilesToTransfer</code>. This element
     *        is implementation-specific for some location types, so don't use it as an exact indication of what
     *        transferred or to monitor your task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withFilesTransferred(Long filesTransferred) {
        setFilesTransferred(filesTransferred);
        return this;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination location.
     * </p>
     * 
     * @param bytesWritten
     *        The number of logical bytes written to the destination location.
     */

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination location.
     * </p>
     * 
     * @return The number of logical bytes written to the destination location.
     */

    public Long getBytesWritten() {
        return this.bytesWritten;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination location.
     * </p>
     * 
     * @param bytesWritten
     *        The number of logical bytes written to the destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withBytesWritten(Long bytesWritten) {
        setBytesWritten(bytesWritten);
        return this;
    }

    /**
     * <p>
     * The total number of bytes that are involved in the transfer. For the number of bytes sent over the network, see
     * <code>BytesCompressed</code>.
     * </p>
     * 
     * @param bytesTransferred
     *        The total number of bytes that are involved in the transfer. For the number of bytes sent over the
     *        network, see <code>BytesCompressed</code>.
     */

    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The total number of bytes that are involved in the transfer. For the number of bytes sent over the network, see
     * <code>BytesCompressed</code>.
     * </p>
     * 
     * @return The total number of bytes that are involved in the transfer. For the number of bytes sent over the
     *         network, see <code>BytesCompressed</code>.
     */

    public Long getBytesTransferred() {
        return this.bytesTransferred;
    }

    /**
     * <p>
     * The total number of bytes that are involved in the transfer. For the number of bytes sent over the network, see
     * <code>BytesCompressed</code>.
     * </p>
     * 
     * @param bytesTransferred
     *        The total number of bytes that are involved in the transfer. For the number of bytes sent over the
     *        network, see <code>BytesCompressed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withBytesTransferred(Long bytesTransferred) {
        setBytesTransferred(bytesTransferred);
        return this;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network after compression was applied. In most cases, this
     * number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     * </p>
     * 
     * @param bytesCompressed
     *        The physical number of bytes transferred over the network after compression was applied. In most cases,
     *        this number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     */

    public void setBytesCompressed(Long bytesCompressed) {
        this.bytesCompressed = bytesCompressed;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network after compression was applied. In most cases, this
     * number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     * </p>
     * 
     * @return The physical number of bytes transferred over the network after compression was applied. In most cases,
     *         this number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     */

    public Long getBytesCompressed() {
        return this.bytesCompressed;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network after compression was applied. In most cases, this
     * number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     * </p>
     * 
     * @param bytesCompressed
     *        The physical number of bytes transferred over the network after compression was applied. In most cases,
     *        this number is less than <code>BytesTransferred</code> unless the data isn't compressible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withBytesCompressed(Long bytesCompressed) {
        setBytesCompressed(bytesCompressed);
        return this;
    }

    /**
     * <p>
     * The result of the task execution.
     * </p>
     * 
     * @param result
     *        The result of the task execution.
     */

    public void setResult(TaskExecutionResultDetail result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the task execution.
     * </p>
     * 
     * @return The result of the task execution.
     */

    public TaskExecutionResultDetail getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the task execution.
     * </p>
     * 
     * @param result
     *        The result of the task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withResult(TaskExecutionResultDetail result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about for your DataSync transfer. For
     * more information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating
     * a task report</a>.
     * </p>
     * 
     * @param taskReportConfig
     *        The configuration of your task report, which provides detailed information about for your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating a task report</a>.
     */

    public void setTaskReportConfig(TaskReportConfig taskReportConfig) {
        this.taskReportConfig = taskReportConfig;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about for your DataSync transfer. For
     * more information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating
     * a task report</a>.
     * </p>
     * 
     * @return The configuration of your task report, which provides detailed information about for your DataSync
     *         transfer. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating a task
     *         report</a>.
     */

    public TaskReportConfig getTaskReportConfig() {
        return this.taskReportConfig;
    }

    /**
     * <p>
     * The configuration of your task report, which provides detailed information about for your DataSync transfer. For
     * more information, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating
     * a task report</a>.
     * </p>
     * 
     * @param taskReportConfig
     *        The configuration of your task report, which provides detailed information about for your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Creating a task report</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withTaskReportConfig(TaskReportConfig taskReportConfig) {
        setTaskReportConfig(taskReportConfig);
        return this;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync deleted in your destination location. If you don't <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @param filesDeleted
     *        The number of files, objects, and directories that DataSync deleted in your destination location. If you
     *        don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure
     *        your task</a> to delete data in the destination that isn't in the source, the value is always
     *        <code>0</code>.
     */

    public void setFilesDeleted(Long filesDeleted) {
        this.filesDeleted = filesDeleted;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync deleted in your destination location. If you don't <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @return The number of files, objects, and directories that DataSync deleted in your destination location. If you
     *         don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure
     *         your task</a> to delete data in the destination that isn't in the source, the value is always
     *         <code>0</code>.
     */

    public Long getFilesDeleted() {
        return this.filesDeleted;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync deleted in your destination location. If you don't <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @param filesDeleted
     *        The number of files, objects, and directories that DataSync deleted in your destination location. If you
     *        don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure
     *        your task</a> to delete data in the destination that isn't in the source, the value is always
     *        <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withFilesDeleted(Long filesDeleted) {
        setFilesDeleted(filesDeleted);
        return this;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync skipped during your transfer.
     * </p>
     * 
     * @param filesSkipped
     *        The number of files, objects, and directories that DataSync skipped during your transfer.
     */

    public void setFilesSkipped(Long filesSkipped) {
        this.filesSkipped = filesSkipped;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync skipped during your transfer.
     * </p>
     * 
     * @return The number of files, objects, and directories that DataSync skipped during your transfer.
     */

    public Long getFilesSkipped() {
        return this.filesSkipped;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync skipped during your transfer.
     * </p>
     * 
     * @param filesSkipped
     *        The number of files, objects, and directories that DataSync skipped during your transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withFilesSkipped(Long filesSkipped) {
        setFilesSkipped(filesSkipped);
        return this;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync verified during your transfer.
     * </p>
     * <note>
     * <p>
     * When you configure your task to <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html">verify only
     * the data that's transferred</a>, DataSync doesn't verify directories in some situations or files that fail to
     * transfer.
     * </p>
     * </note>
     * 
     * @param filesVerified
     *        The number of files, objects, and directories that DataSync verified during your transfer.</p> <note>
     *        <p>
     *        When you configure your task to <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html"
     *        >verify only the data that's transferred</a>, DataSync doesn't verify directories in some situations or
     *        files that fail to transfer.
     *        </p>
     */

    public void setFilesVerified(Long filesVerified) {
        this.filesVerified = filesVerified;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync verified during your transfer.
     * </p>
     * <note>
     * <p>
     * When you configure your task to <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html">verify only
     * the data that's transferred</a>, DataSync doesn't verify directories in some situations or files that fail to
     * transfer.
     * </p>
     * </note>
     * 
     * @return The number of files, objects, and directories that DataSync verified during your transfer.</p> <note>
     *         <p>
     *         When you configure your task to <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html"
     *         >verify only the data that's transferred</a>, DataSync doesn't verify directories in some situations or
     *         files that fail to transfer.
     *         </p>
     */

    public Long getFilesVerified() {
        return this.filesVerified;
    }

    /**
     * <p>
     * The number of files, objects, and directories that DataSync verified during your transfer.
     * </p>
     * <note>
     * <p>
     * When you configure your task to <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html">verify only
     * the data that's transferred</a>, DataSync doesn't verify directories in some situations or files that fail to
     * transfer.
     * </p>
     * </note>
     * 
     * @param filesVerified
     *        The number of files, objects, and directories that DataSync verified during your transfer.</p> <note>
     *        <p>
     *        When you configure your task to <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-data-verification-options.html"
     *        >verify only the data that's transferred</a>, DataSync doesn't verify directories in some situations or
     *        files that fail to transfer.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withFilesVerified(Long filesVerified) {
        setFilesVerified(filesVerified);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync generated a complete <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your transfer.
     * </p>
     * 
     * @param reportResult
     *        Indicates whether DataSync generated a complete <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your
     *        transfer.
     */

    public void setReportResult(ReportResult reportResult) {
        this.reportResult = reportResult;
    }

    /**
     * <p>
     * Indicates whether DataSync generated a complete <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your transfer.
     * </p>
     * 
     * @return Indicates whether DataSync generated a complete <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your
     *         transfer.
     */

    public ReportResult getReportResult() {
        return this.reportResult;
    }

    /**
     * <p>
     * Indicates whether DataSync generated a complete <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your transfer.
     * </p>
     * 
     * @param reportResult
     *        Indicates whether DataSync generated a complete <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your
     *        transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withReportResult(ReportResult reportResult) {
        setReportResult(reportResult);
        return this;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will delete in your destination location. If
     * you don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     * task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @param estimatedFilesToDelete
     *        The expected number of files, objects, and directories that DataSync will delete in your destination
     *        location. If you don't <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *        task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     */

    public void setEstimatedFilesToDelete(Long estimatedFilesToDelete) {
        this.estimatedFilesToDelete = estimatedFilesToDelete;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will delete in your destination location. If
     * you don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     * task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @return The expected number of files, objects, and directories that DataSync will delete in your destination
     *         location. If you don't <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *         task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     */

    public Long getEstimatedFilesToDelete() {
        return this.estimatedFilesToDelete;
    }

    /**
     * <p>
     * The expected number of files, objects, and directories that DataSync will delete in your destination location. If
     * you don't <a href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     * task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * </p>
     * 
     * @param estimatedFilesToDelete
     *        The expected number of files, objects, and directories that DataSync will delete in your destination
     *        location. If you don't <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *        task</a> to delete data in the destination that isn't in the source, the value is always <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withEstimatedFilesToDelete(Long estimatedFilesToDelete) {
        setEstimatedFilesToDelete(estimatedFilesToDelete);
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
        if (getTaskExecutionArn() != null)
            sb.append("TaskExecutionArn: ").append(getTaskExecutionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getManifestConfig() != null)
            sb.append("ManifestConfig: ").append(getManifestConfig()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEstimatedFilesToTransfer() != null)
            sb.append("EstimatedFilesToTransfer: ").append(getEstimatedFilesToTransfer()).append(",");
        if (getEstimatedBytesToTransfer() != null)
            sb.append("EstimatedBytesToTransfer: ").append(getEstimatedBytesToTransfer()).append(",");
        if (getFilesTransferred() != null)
            sb.append("FilesTransferred: ").append(getFilesTransferred()).append(",");
        if (getBytesWritten() != null)
            sb.append("BytesWritten: ").append(getBytesWritten()).append(",");
        if (getBytesTransferred() != null)
            sb.append("BytesTransferred: ").append(getBytesTransferred()).append(",");
        if (getBytesCompressed() != null)
            sb.append("BytesCompressed: ").append(getBytesCompressed()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getTaskReportConfig() != null)
            sb.append("TaskReportConfig: ").append(getTaskReportConfig()).append(",");
        if (getFilesDeleted() != null)
            sb.append("FilesDeleted: ").append(getFilesDeleted()).append(",");
        if (getFilesSkipped() != null)
            sb.append("FilesSkipped: ").append(getFilesSkipped()).append(",");
        if (getFilesVerified() != null)
            sb.append("FilesVerified: ").append(getFilesVerified()).append(",");
        if (getReportResult() != null)
            sb.append("ReportResult: ").append(getReportResult()).append(",");
        if (getEstimatedFilesToDelete() != null)
            sb.append("EstimatedFilesToDelete: ").append(getEstimatedFilesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskExecutionResult == false)
            return false;
        DescribeTaskExecutionResult other = (DescribeTaskExecutionResult) obj;
        if (other.getTaskExecutionArn() == null ^ this.getTaskExecutionArn() == null)
            return false;
        if (other.getTaskExecutionArn() != null && other.getTaskExecutionArn().equals(this.getTaskExecutionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        if (other.getManifestConfig() == null ^ this.getManifestConfig() == null)
            return false;
        if (other.getManifestConfig() != null && other.getManifestConfig().equals(this.getManifestConfig()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEstimatedFilesToTransfer() == null ^ this.getEstimatedFilesToTransfer() == null)
            return false;
        if (other.getEstimatedFilesToTransfer() != null && other.getEstimatedFilesToTransfer().equals(this.getEstimatedFilesToTransfer()) == false)
            return false;
        if (other.getEstimatedBytesToTransfer() == null ^ this.getEstimatedBytesToTransfer() == null)
            return false;
        if (other.getEstimatedBytesToTransfer() != null && other.getEstimatedBytesToTransfer().equals(this.getEstimatedBytesToTransfer()) == false)
            return false;
        if (other.getFilesTransferred() == null ^ this.getFilesTransferred() == null)
            return false;
        if (other.getFilesTransferred() != null && other.getFilesTransferred().equals(this.getFilesTransferred()) == false)
            return false;
        if (other.getBytesWritten() == null ^ this.getBytesWritten() == null)
            return false;
        if (other.getBytesWritten() != null && other.getBytesWritten().equals(this.getBytesWritten()) == false)
            return false;
        if (other.getBytesTransferred() == null ^ this.getBytesTransferred() == null)
            return false;
        if (other.getBytesTransferred() != null && other.getBytesTransferred().equals(this.getBytesTransferred()) == false)
            return false;
        if (other.getBytesCompressed() == null ^ this.getBytesCompressed() == null)
            return false;
        if (other.getBytesCompressed() != null && other.getBytesCompressed().equals(this.getBytesCompressed()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getTaskReportConfig() == null ^ this.getTaskReportConfig() == null)
            return false;
        if (other.getTaskReportConfig() != null && other.getTaskReportConfig().equals(this.getTaskReportConfig()) == false)
            return false;
        if (other.getFilesDeleted() == null ^ this.getFilesDeleted() == null)
            return false;
        if (other.getFilesDeleted() != null && other.getFilesDeleted().equals(this.getFilesDeleted()) == false)
            return false;
        if (other.getFilesSkipped() == null ^ this.getFilesSkipped() == null)
            return false;
        if (other.getFilesSkipped() != null && other.getFilesSkipped().equals(this.getFilesSkipped()) == false)
            return false;
        if (other.getFilesVerified() == null ^ this.getFilesVerified() == null)
            return false;
        if (other.getFilesVerified() != null && other.getFilesVerified().equals(this.getFilesVerified()) == false)
            return false;
        if (other.getReportResult() == null ^ this.getReportResult() == null)
            return false;
        if (other.getReportResult() != null && other.getReportResult().equals(this.getReportResult()) == false)
            return false;
        if (other.getEstimatedFilesToDelete() == null ^ this.getEstimatedFilesToDelete() == null)
            return false;
        if (other.getEstimatedFilesToDelete() != null && other.getEstimatedFilesToDelete().equals(this.getEstimatedFilesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskExecutionArn() == null) ? 0 : getTaskExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getManifestConfig() == null) ? 0 : getManifestConfig().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEstimatedFilesToTransfer() == null) ? 0 : getEstimatedFilesToTransfer().hashCode());
        hashCode = prime * hashCode + ((getEstimatedBytesToTransfer() == null) ? 0 : getEstimatedBytesToTransfer().hashCode());
        hashCode = prime * hashCode + ((getFilesTransferred() == null) ? 0 : getFilesTransferred().hashCode());
        hashCode = prime * hashCode + ((getBytesWritten() == null) ? 0 : getBytesWritten().hashCode());
        hashCode = prime * hashCode + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        hashCode = prime * hashCode + ((getBytesCompressed() == null) ? 0 : getBytesCompressed().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getTaskReportConfig() == null) ? 0 : getTaskReportConfig().hashCode());
        hashCode = prime * hashCode + ((getFilesDeleted() == null) ? 0 : getFilesDeleted().hashCode());
        hashCode = prime * hashCode + ((getFilesSkipped() == null) ? 0 : getFilesSkipped().hashCode());
        hashCode = prime * hashCode + ((getFilesVerified() == null) ? 0 : getFilesVerified().hashCode());
        hashCode = prime * hashCode + ((getReportResult() == null) ? 0 : getReportResult().hashCode());
        hashCode = prime * hashCode + ((getEstimatedFilesToDelete() == null) ? 0 : getEstimatedFilesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskExecutionResult clone() {
        try {
            return (DescribeTaskExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
