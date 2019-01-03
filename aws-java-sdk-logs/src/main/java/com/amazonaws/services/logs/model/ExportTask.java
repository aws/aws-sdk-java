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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an export task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ExportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the export task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The name of the export task.
     * </p>
     */
    private String taskName;
    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * before this time are not exported.
     * </p>
     */
    private Long from;
    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * later than this time are not exported.
     * </p>
     */
    private Long to;
    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object exported.
     * </p>
     */
    private String destinationPrefix;
    /**
     * <p>
     * The status of the export task.
     * </p>
     */
    private ExportTaskStatus status;
    /**
     * <p>
     * Execution info about the export task.
     * </p>
     */
    private ExportTaskExecutionInfo executionInfo;

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @param taskId
     *        The ID of the export task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @return The ID of the export task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @param taskId
     *        The ID of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * 
     * @param taskName
     *        The name of the export task.
     */

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * 
     * @return The name of the export task.
     */

    public String getTaskName() {
        return this.taskName;
    }

    /**
     * <p>
     * The name of the export task.
     * </p>
     * 
     * @param taskName
     *        The name of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withTaskName(String taskName) {
        setTaskName(taskName);
        return this;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group from which logs data was exported.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * 
     * @return The name of the log group from which logs data was exported.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group from which logs data was exported.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group from which logs data was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * before this time are not exported.
     * </p>
     * 
     * @param from
     *        The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *        timestamp before this time are not exported.
     */

    public void setFrom(Long from) {
        this.from = from;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * before this time are not exported.
     * </p>
     * 
     * @return The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *         timestamp before this time are not exported.
     */

    public Long getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * before this time are not exported.
     * </p>
     * 
     * @param from
     *        The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *        timestamp before this time are not exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withFrom(Long from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * later than this time are not exported.
     * </p>
     * 
     * @param to
     *        The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *        timestamp later than this time are not exported.
     */

    public void setTo(Long to) {
        this.to = to;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * later than this time are not exported.
     * </p>
     * 
     * @return The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *         timestamp later than this time are not exported.
     */

    public Long getTo() {
        return this.to;
    }

    /**
     * <p>
     * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp
     * later than this time are not exported.
     * </p>
     * 
     * @param to
     *        The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     *        timestamp later than this time are not exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withTo(Long to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * 
     * @param destination
     *        The name of Amazon S3 bucket to which the log data was exported.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * 
     * @return The name of Amazon S3 bucket to which the log data was exported.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The name of Amazon S3 bucket to which the log data was exported.
     * </p>
     * 
     * @param destination
     *        The name of Amazon S3 bucket to which the log data was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object exported.
     * </p>
     * 
     * @param destinationPrefix
     *        The prefix that was used as the start of Amazon S3 key for every object exported.
     */

    public void setDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object exported.
     * </p>
     * 
     * @return The prefix that was used as the start of Amazon S3 key for every object exported.
     */

    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    /**
     * <p>
     * The prefix that was used as the start of Amazon S3 key for every object exported.
     * </p>
     * 
     * @param destinationPrefix
     *        The prefix that was used as the start of Amazon S3 key for every object exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withDestinationPrefix(String destinationPrefix) {
        setDestinationPrefix(destinationPrefix);
        return this;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     * 
     * @param status
     *        The status of the export task.
     */

    public void setStatus(ExportTaskStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     * 
     * @return The status of the export task.
     */

    public ExportTaskStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the export task.
     * </p>
     * 
     * @param status
     *        The status of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withStatus(ExportTaskStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     * 
     * @param executionInfo
     *        Execution info about the export task.
     */

    public void setExecutionInfo(ExportTaskExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     * 
     * @return Execution info about the export task.
     */

    public ExportTaskExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * <p>
     * Execution info about the export task.
     * </p>
     * 
     * @param executionInfo
     *        Execution info about the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withExecutionInfo(ExportTaskExecutionInfo executionInfo) {
        setExecutionInfo(executionInfo);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTaskName() != null)
            sb.append("TaskName: ").append(getTaskName()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationPrefix() != null)
            sb.append("DestinationPrefix: ").append(getDestinationPrefix()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExecutionInfo() != null)
            sb.append("ExecutionInfo: ").append(getExecutionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskName() == null ^ this.getTaskName() == null)
            return false;
        if (other.getTaskName() != null && other.getTaskName().equals(this.getTaskName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationPrefix() == null ^ this.getDestinationPrefix() == null)
            return false;
        if (other.getDestinationPrefix() != null && other.getDestinationPrefix().equals(this.getDestinationPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionInfo() == null ^ this.getExecutionInfo() == null)
            return false;
        if (other.getExecutionInfo() != null && other.getExecutionInfo().equals(this.getExecutionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefix() == null) ? 0 : getDestinationPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionInfo() == null) ? 0 : getExecutionInfo().hashCode());
        return hashCode;
    }

    @Override
    public ExportTask clone() {
        try {
            return (ExportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.ExportTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
