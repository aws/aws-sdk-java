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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of a message movement task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListMessageMoveTasksResultEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessageMoveTasksResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier associated with a message movement task. When this field is returned in the response of the
     * <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     * </p>
     */
    private String taskHandle;
    /**
     * <p>
     * The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED, and
     * FAILED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code> request. If a
     * <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code> request, this field
     * value will be NULL.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate), if it has been specified in the
     * <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been specified
     * in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     * </p>
     */
    private Integer maxNumberOfMessagesPerSecond;
    /**
     * <p>
     * The approximate number of messages already moved to the destination queue.
     * </p>
     */
    private Long approximateNumberOfMessagesMoved;
    /**
     * <p>
     * The number of messages to be moved from the source queue. This number is obtained at the time of starting the
     * message movement task and is only included after the message movement task is selected to start.
     * </p>
     */
    private Long approximateNumberOfMessagesToMove;
    /**
     * <p>
     * The task failure reason (only included if the task status is FAILED).
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The timestamp of starting the message movement task.
     * </p>
     */
    private Long startedTimestamp;

    /**
     * <p>
     * An identifier associated with a message movement task. When this field is returned in the response of the
     * <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     * </p>
     * 
     * @param taskHandle
     *        An identifier associated with a message movement task. When this field is returned in the response of the
     *        <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     */

    public void setTaskHandle(String taskHandle) {
        this.taskHandle = taskHandle;
    }

    /**
     * <p>
     * An identifier associated with a message movement task. When this field is returned in the response of the
     * <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     * </p>
     * 
     * @return An identifier associated with a message movement task. When this field is returned in the response of the
     *         <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     */

    public String getTaskHandle() {
        return this.taskHandle;
    }

    /**
     * <p>
     * An identifier associated with a message movement task. When this field is returned in the response of the
     * <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     * </p>
     * 
     * @param taskHandle
     *        An identifier associated with a message movement task. When this field is returned in the response of the
     *        <code>ListMessageMoveTasks</code> action, it is only populated for tasks that are in RUNNING status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withTaskHandle(String taskHandle) {
        setTaskHandle(taskHandle);
        return this;
    }

    /**
     * <p>
     * The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED, and
     * FAILED.
     * </p>
     * 
     * @param status
     *        The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED,
     *        and FAILED.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED, and
     * FAILED.
     * </p>
     * 
     * @return The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED,
     *         and FAILED.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED, and
     * FAILED.
     * </p>
     * 
     * @param status
     *        The status of the message movement task. Possible values are: RUNNING, COMPLETED, CANCELLING, CANCELLED,
     *        and FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue that contains the messages to be moved to another queue.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue.
     * </p>
     * 
     * @return The ARN of the queue that contains the messages to be moved to another queue.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the queue that contains the messages to be moved to another queue.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the queue that contains the messages to be moved to another queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code> request. If a
     * <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code> request, this field
     * value will be NULL.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code>
     *        request. If a <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code>
     *        request, this field value will be NULL.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code> request. If a
     * <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code> request, this field
     * value will be NULL.
     * </p>
     * 
     * @return The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code>
     *         request. If a <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code>
     *         request, this field value will be NULL.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code> request. If a
     * <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code> request, this field
     * value will be NULL.
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the destination queue if it has been specified in the <code>StartMessageMoveTask</code>
     *        request. If a <code>DestinationArn</code> has not been specified in the <code>StartMessageMoveTask</code>
     *        request, this field value will be NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate), if it has been specified in the
     * <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been specified
     * in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     * </p>
     * 
     * @param maxNumberOfMessagesPerSecond
     *        The number of messages to be moved per second (the message movement rate), if it has been specified in the
     *        <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been
     *        specified in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     */

    public void setMaxNumberOfMessagesPerSecond(Integer maxNumberOfMessagesPerSecond) {
        this.maxNumberOfMessagesPerSecond = maxNumberOfMessagesPerSecond;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate), if it has been specified in the
     * <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been specified
     * in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     * </p>
     * 
     * @return The number of messages to be moved per second (the message movement rate), if it has been specified in
     *         the <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not
     *         been specified in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     */

    public Integer getMaxNumberOfMessagesPerSecond() {
        return this.maxNumberOfMessagesPerSecond;
    }

    /**
     * <p>
     * The number of messages to be moved per second (the message movement rate), if it has been specified in the
     * <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been specified
     * in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     * </p>
     * 
     * @param maxNumberOfMessagesPerSecond
     *        The number of messages to be moved per second (the message movement rate), if it has been specified in the
     *        <code>StartMessageMoveTask</code> request. If a <code>MaxNumberOfMessagesPerSecond</code> has not been
     *        specified in the <code>StartMessageMoveTask</code> request, this field value will be NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withMaxNumberOfMessagesPerSecond(Integer maxNumberOfMessagesPerSecond) {
        setMaxNumberOfMessagesPerSecond(maxNumberOfMessagesPerSecond);
        return this;
    }

    /**
     * <p>
     * The approximate number of messages already moved to the destination queue.
     * </p>
     * 
     * @param approximateNumberOfMessagesMoved
     *        The approximate number of messages already moved to the destination queue.
     */

    public void setApproximateNumberOfMessagesMoved(Long approximateNumberOfMessagesMoved) {
        this.approximateNumberOfMessagesMoved = approximateNumberOfMessagesMoved;
    }

    /**
     * <p>
     * The approximate number of messages already moved to the destination queue.
     * </p>
     * 
     * @return The approximate number of messages already moved to the destination queue.
     */

    public Long getApproximateNumberOfMessagesMoved() {
        return this.approximateNumberOfMessagesMoved;
    }

    /**
     * <p>
     * The approximate number of messages already moved to the destination queue.
     * </p>
     * 
     * @param approximateNumberOfMessagesMoved
     *        The approximate number of messages already moved to the destination queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withApproximateNumberOfMessagesMoved(Long approximateNumberOfMessagesMoved) {
        setApproximateNumberOfMessagesMoved(approximateNumberOfMessagesMoved);
        return this;
    }

    /**
     * <p>
     * The number of messages to be moved from the source queue. This number is obtained at the time of starting the
     * message movement task and is only included after the message movement task is selected to start.
     * </p>
     * 
     * @param approximateNumberOfMessagesToMove
     *        The number of messages to be moved from the source queue. This number is obtained at the time of starting
     *        the message movement task and is only included after the message movement task is selected to start.
     */

    public void setApproximateNumberOfMessagesToMove(Long approximateNumberOfMessagesToMove) {
        this.approximateNumberOfMessagesToMove = approximateNumberOfMessagesToMove;
    }

    /**
     * <p>
     * The number of messages to be moved from the source queue. This number is obtained at the time of starting the
     * message movement task and is only included after the message movement task is selected to start.
     * </p>
     * 
     * @return The number of messages to be moved from the source queue. This number is obtained at the time of starting
     *         the message movement task and is only included after the message movement task is selected to start.
     */

    public Long getApproximateNumberOfMessagesToMove() {
        return this.approximateNumberOfMessagesToMove;
    }

    /**
     * <p>
     * The number of messages to be moved from the source queue. This number is obtained at the time of starting the
     * message movement task and is only included after the message movement task is selected to start.
     * </p>
     * 
     * @param approximateNumberOfMessagesToMove
     *        The number of messages to be moved from the source queue. This number is obtained at the time of starting
     *        the message movement task and is only included after the message movement task is selected to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withApproximateNumberOfMessagesToMove(Long approximateNumberOfMessagesToMove) {
        setApproximateNumberOfMessagesToMove(approximateNumberOfMessagesToMove);
        return this;
    }

    /**
     * <p>
     * The task failure reason (only included if the task status is FAILED).
     * </p>
     * 
     * @param failureReason
     *        The task failure reason (only included if the task status is FAILED).
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The task failure reason (only included if the task status is FAILED).
     * </p>
     * 
     * @return The task failure reason (only included if the task status is FAILED).
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The task failure reason (only included if the task status is FAILED).
     * </p>
     * 
     * @param failureReason
     *        The task failure reason (only included if the task status is FAILED).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The timestamp of starting the message movement task.
     * </p>
     * 
     * @param startedTimestamp
     *        The timestamp of starting the message movement task.
     */

    public void setStartedTimestamp(Long startedTimestamp) {
        this.startedTimestamp = startedTimestamp;
    }

    /**
     * <p>
     * The timestamp of starting the message movement task.
     * </p>
     * 
     * @return The timestamp of starting the message movement task.
     */

    public Long getStartedTimestamp() {
        return this.startedTimestamp;
    }

    /**
     * <p>
     * The timestamp of starting the message movement task.
     * </p>
     * 
     * @param startedTimestamp
     *        The timestamp of starting the message movement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMessageMoveTasksResultEntry withStartedTimestamp(Long startedTimestamp) {
        setStartedTimestamp(startedTimestamp);
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
        if (getTaskHandle() != null)
            sb.append("TaskHandle: ").append(getTaskHandle()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getMaxNumberOfMessagesPerSecond() != null)
            sb.append("MaxNumberOfMessagesPerSecond: ").append(getMaxNumberOfMessagesPerSecond()).append(",");
        if (getApproximateNumberOfMessagesMoved() != null)
            sb.append("ApproximateNumberOfMessagesMoved: ").append(getApproximateNumberOfMessagesMoved()).append(",");
        if (getApproximateNumberOfMessagesToMove() != null)
            sb.append("ApproximateNumberOfMessagesToMove: ").append(getApproximateNumberOfMessagesToMove()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getStartedTimestamp() != null)
            sb.append("StartedTimestamp: ").append(getStartedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMessageMoveTasksResultEntry == false)
            return false;
        ListMessageMoveTasksResultEntry other = (ListMessageMoveTasksResultEntry) obj;
        if (other.getTaskHandle() == null ^ this.getTaskHandle() == null)
            return false;
        if (other.getTaskHandle() != null && other.getTaskHandle().equals(this.getTaskHandle()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getMaxNumberOfMessagesPerSecond() == null ^ this.getMaxNumberOfMessagesPerSecond() == null)
            return false;
        if (other.getMaxNumberOfMessagesPerSecond() != null && other.getMaxNumberOfMessagesPerSecond().equals(this.getMaxNumberOfMessagesPerSecond()) == false)
            return false;
        if (other.getApproximateNumberOfMessagesMoved() == null ^ this.getApproximateNumberOfMessagesMoved() == null)
            return false;
        if (other.getApproximateNumberOfMessagesMoved() != null
                && other.getApproximateNumberOfMessagesMoved().equals(this.getApproximateNumberOfMessagesMoved()) == false)
            return false;
        if (other.getApproximateNumberOfMessagesToMove() == null ^ this.getApproximateNumberOfMessagesToMove() == null)
            return false;
        if (other.getApproximateNumberOfMessagesToMove() != null
                && other.getApproximateNumberOfMessagesToMove().equals(this.getApproximateNumberOfMessagesToMove()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getStartedTimestamp() == null ^ this.getStartedTimestamp() == null)
            return false;
        if (other.getStartedTimestamp() != null && other.getStartedTimestamp().equals(this.getStartedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskHandle() == null) ? 0 : getTaskHandle().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxNumberOfMessagesPerSecond() == null) ? 0 : getMaxNumberOfMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getApproximateNumberOfMessagesMoved() == null) ? 0 : getApproximateNumberOfMessagesMoved().hashCode());
        hashCode = prime * hashCode + ((getApproximateNumberOfMessagesToMove() == null) ? 0 : getApproximateNumberOfMessagesToMove().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getStartedTimestamp() == null) ? 0 : getStartedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ListMessageMoveTasksResultEntry clone() {
        try {
            return (ListMessageMoveTasksResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sqs.model.transform.ListMessageMoveTasksResultEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
