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
     * The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     * hierarchical and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     * </p>
     */
    private String taskExecutionArn;
    /**
     * <p>
     * The status of the task. For detailed information about sync statuses, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html">Understanding
     * Sync Task Statuses</a>.
     * </p>
     */
    private String status;

    private Options options;
    /**
     * <p>
     * The time that the task execution was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The expected number of files that is to be transferred over the network. This value is calculated during the
     * PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred.
     * It's calculated based on comparing the content of the source and destination locations and finding the delta that
     * needs to be transferred.
     * </p>
     */
    private Long estimatedFilesToTransfer;
    /**
     * <p>
     * The estimated physical number of bytes that is to be transferred over the network.
     * </p>
     */
    private Long estimatedBytesToTransfer;
    /**
     * <p>
     * The actual number of files that was transferred over the network. This value is calculated and updated on an
     * ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and
     * sent over the network.
     * </p>
     * <p>
     * If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>. This
     * value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     * implementation-specific for some location types, so don't use it as an indicator for a correct file number or to
     * monitor your task execution.
     * </p>
     */
    private Long filesTransferred;
    /**
     * <p>
     * The number of logical bytes written to the destination AWS storage resource.
     * </p>
     */
    private Long bytesWritten;
    /**
     * <p>
     * The physical number of bytes transferred over the network.
     * </p>
     */
    private Long bytesTransferred;
    /**
     * <p>
     * The result of the task execution.
     * </p>
     */
    private TaskExecutionResultDetail result;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     * hierarchical and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     *        hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *        <p>
     *        For example, a <code>TaskExecution</code> value with the ARN
     *        <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *        executed the task with the ARN
     *        <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     */

    public void setTaskExecutionArn(String taskExecutionArn) {
        this.taskExecutionArn = taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     * hierarchical and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     *         hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *         <p>
     *         For example, a <code>TaskExecution</code> value with the ARN
     *         <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *         executed the task with the ARN
     *         <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     */

    public String getTaskExecutionArn() {
        return this.taskExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     * hierarchical and includes <code>TaskArn</code> for the task that was executed.
     * </p>
     * <p>
     * For example, a <code>TaskExecution</code> value with the ARN
     * <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     * executed the task with the ARN <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     * </p>
     * 
     * @param taskExecutionArn
     *        The Amazon Resource Name (ARN) of the task execution that was described. <code>TaskExecutionArn</code> is
     *        hierarchical and includes <code>TaskArn</code> for the task that was executed. </p>
     *        <p>
     *        For example, a <code>TaskExecution</code> value with the ARN
     *        <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b</code>
     *        executed the task with the ARN
     *        <code>arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withTaskExecutionArn(String taskExecutionArn) {
        setTaskExecutionArn(taskExecutionArn);
        return this;
    }

    /**
     * <p>
     * The status of the task. For detailed information about sync statuses, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html">Understanding
     * Sync Task Statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of the task. For detailed information about sync statuses, see <a
     *        href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html"
     *        >Understanding Sync Task Statuses</a>.
     * @see TaskExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task. For detailed information about sync statuses, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html">Understanding
     * Sync Task Statuses</a>.
     * </p>
     * 
     * @return The status of the task. For detailed information about sync statuses, see <a
     *         href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html"
     *         >Understanding Sync Task Statuses</a>.
     * @see TaskExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task. For detailed information about sync statuses, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html">Understanding
     * Sync Task Statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of the task. For detailed information about sync statuses, see <a
     *        href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html"
     *        >Understanding Sync Task Statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskExecutionStatus
     */

    public DescribeTaskExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task. For detailed information about sync statuses, see <a
     * href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html">Understanding
     * Sync Task Statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of the task. For detailed information about sync statuses, see <a
     *        href="https://docs.aws.amazon.com/sync-service/latest/userguide/understand-sync-task-statuses.html"
     *        >Understanding Sync Task Statuses</a>.
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
     * The time that the task execution was started.
     * </p>
     * 
     * @param startTime
     *        The time that the task execution was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the task execution was started.
     * </p>
     * 
     * @return The time that the task execution was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the task execution was started.
     * </p>
     * 
     * @param startTime
     *        The time that the task execution was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The expected number of files that is to be transferred over the network. This value is calculated during the
     * PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred.
     * It's calculated based on comparing the content of the source and destination locations and finding the delta that
     * needs to be transferred.
     * </p>
     * 
     * @param estimatedFilesToTransfer
     *        The expected number of files that is to be transferred over the network. This value is calculated during
     *        the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be
     *        transferred. It's calculated based on comparing the content of the source and destination locations and
     *        finding the delta that needs to be transferred.
     */

    public void setEstimatedFilesToTransfer(Long estimatedFilesToTransfer) {
        this.estimatedFilesToTransfer = estimatedFilesToTransfer;
    }

    /**
     * <p>
     * The expected number of files that is to be transferred over the network. This value is calculated during the
     * PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred.
     * It's calculated based on comparing the content of the source and destination locations and finding the delta that
     * needs to be transferred.
     * </p>
     * 
     * @return The expected number of files that is to be transferred over the network. This value is calculated during
     *         the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be
     *         transferred. It's calculated based on comparing the content of the source and destination locations and
     *         finding the delta that needs to be transferred.
     */

    public Long getEstimatedFilesToTransfer() {
        return this.estimatedFilesToTransfer;
    }

    /**
     * <p>
     * The expected number of files that is to be transferred over the network. This value is calculated during the
     * PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred.
     * It's calculated based on comparing the content of the source and destination locations and finding the delta that
     * needs to be transferred.
     * </p>
     * 
     * @param estimatedFilesToTransfer
     *        The expected number of files that is to be transferred over the network. This value is calculated during
     *        the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be
     *        transferred. It's calculated based on comparing the content of the source and destination locations and
     *        finding the delta that needs to be transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withEstimatedFilesToTransfer(Long estimatedFilesToTransfer) {
        setEstimatedFilesToTransfer(estimatedFilesToTransfer);
        return this;
    }

    /**
     * <p>
     * The estimated physical number of bytes that is to be transferred over the network.
     * </p>
     * 
     * @param estimatedBytesToTransfer
     *        The estimated physical number of bytes that is to be transferred over the network.
     */

    public void setEstimatedBytesToTransfer(Long estimatedBytesToTransfer) {
        this.estimatedBytesToTransfer = estimatedBytesToTransfer;
    }

    /**
     * <p>
     * The estimated physical number of bytes that is to be transferred over the network.
     * </p>
     * 
     * @return The estimated physical number of bytes that is to be transferred over the network.
     */

    public Long getEstimatedBytesToTransfer() {
        return this.estimatedBytesToTransfer;
    }

    /**
     * <p>
     * The estimated physical number of bytes that is to be transferred over the network.
     * </p>
     * 
     * @param estimatedBytesToTransfer
     *        The estimated physical number of bytes that is to be transferred over the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withEstimatedBytesToTransfer(Long estimatedBytesToTransfer) {
        setEstimatedBytesToTransfer(estimatedBytesToTransfer);
        return this;
    }

    /**
     * <p>
     * The actual number of files that was transferred over the network. This value is calculated and updated on an
     * ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and
     * sent over the network.
     * </p>
     * <p>
     * If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>. This
     * value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     * implementation-specific for some location types, so don't use it as an indicator for a correct file number or to
     * monitor your task execution.
     * </p>
     * 
     * @param filesTransferred
     *        The actual number of files that was transferred over the network. This value is calculated and updated on
     *        an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the
     *        source and sent over the network. </p>
     *        <p>
     *        If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>.
     *        This value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     *        implementation-specific for some location types, so don't use it as an indicator for a correct file number
     *        or to monitor your task execution.
     */

    public void setFilesTransferred(Long filesTransferred) {
        this.filesTransferred = filesTransferred;
    }

    /**
     * <p>
     * The actual number of files that was transferred over the network. This value is calculated and updated on an
     * ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and
     * sent over the network.
     * </p>
     * <p>
     * If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>. This
     * value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     * implementation-specific for some location types, so don't use it as an indicator for a correct file number or to
     * monitor your task execution.
     * </p>
     * 
     * @return The actual number of files that was transferred over the network. This value is calculated and updated on
     *         an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the
     *         source and sent over the network. </p>
     *         <p>
     *         If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>.
     *         This value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     *         implementation-specific for some location types, so don't use it as an indicator for a correct file
     *         number or to monitor your task execution.
     */

    public Long getFilesTransferred() {
        return this.filesTransferred;
    }

    /**
     * <p>
     * The actual number of files that was transferred over the network. This value is calculated and updated on an
     * ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and
     * sent over the network.
     * </p>
     * <p>
     * If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>. This
     * value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     * implementation-specific for some location types, so don't use it as an indicator for a correct file number or to
     * monitor your task execution.
     * </p>
     * 
     * @param filesTransferred
     *        The actual number of files that was transferred over the network. This value is calculated and updated on
     *        an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the
     *        source and sent over the network. </p>
     *        <p>
     *        If failures occur during a transfer, this value can be less than <code>EstimatedFilesToTransfer</code>.
     *        This value can also be greater than <code>EstimatedFilesTransferred</code> in some cases. This element is
     *        implementation-specific for some location types, so don't use it as an indicator for a correct file number
     *        or to monitor your task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withFilesTransferred(Long filesTransferred) {
        setFilesTransferred(filesTransferred);
        return this;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination AWS storage resource.
     * </p>
     * 
     * @param bytesWritten
     *        The number of logical bytes written to the destination AWS storage resource.
     */

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination AWS storage resource.
     * </p>
     * 
     * @return The number of logical bytes written to the destination AWS storage resource.
     */

    public Long getBytesWritten() {
        return this.bytesWritten;
    }

    /**
     * <p>
     * The number of logical bytes written to the destination AWS storage resource.
     * </p>
     * 
     * @param bytesWritten
     *        The number of logical bytes written to the destination AWS storage resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withBytesWritten(Long bytesWritten) {
        setBytesWritten(bytesWritten);
        return this;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network.
     * </p>
     * 
     * @param bytesTransferred
     *        The physical number of bytes transferred over the network.
     */

    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network.
     * </p>
     * 
     * @return The physical number of bytes transferred over the network.
     */

    public Long getBytesTransferred() {
        return this.bytesTransferred;
    }

    /**
     * <p>
     * The physical number of bytes transferred over the network.
     * </p>
     * 
     * @param bytesTransferred
     *        The physical number of bytes transferred over the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskExecutionResult withBytesTransferred(Long bytesTransferred) {
        setBytesTransferred(bytesTransferred);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
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
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
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
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEstimatedFilesToTransfer() == null) ? 0 : getEstimatedFilesToTransfer().hashCode());
        hashCode = prime * hashCode + ((getEstimatedBytesToTransfer() == null) ? 0 : getEstimatedBytesToTransfer().hashCode());
        hashCode = prime * hashCode + ((getFilesTransferred() == null) ? 0 : getFilesTransferred().hashCode());
        hashCode = prime * hashCode + ((getBytesWritten() == null) ? 0 : getBytesWritten().hashCode());
        hashCode = prime * hashCode + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
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
