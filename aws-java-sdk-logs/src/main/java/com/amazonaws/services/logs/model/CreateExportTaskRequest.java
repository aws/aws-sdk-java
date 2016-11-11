/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateExportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the export task.
     * </p>
     */
    private String taskName;
    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     * applied.
     * </p>
     */
    private String logStreamNamePrefix;
    /**
     * <p>
     * The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp earlier than this time are not exported.
     * </p>
     */
    private Long from;
    /**
     * <p>
     * The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp later than this time are not exported.
     * </p>
     */
    private Long to;
    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is
     * <code>exportedlogs</code>.
     * </p>
     */
    private String destinationPrefix;

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

    public CreateExportTaskRequest withTaskName(String taskName) {
        setTaskName(taskName);
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     * applied.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     *        applied.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     * applied.
     * </p>
     * 
     * @return Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     *         applied.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     * applied.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is
     *        applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
        return this;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp earlier than this time are not exported.
     * </p>
     * 
     * @param from
     *        The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
     */

    public void setFrom(Long from) {
        this.from = from;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp earlier than this time are not exported.
     * </p>
     * 
     * @return The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *         00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
     */

    public Long getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp earlier than this time are not exported.
     * </p>
     * 
     * @param from
     *        The start time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withFrom(Long from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp later than this time are not exported.
     * </p>
     * 
     * @param to
     *        The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC. Events with a timestamp later than this time are not exported.
     */

    public void setTo(Long to) {
        this.to = to;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp later than this time are not exported.
     * </p>
     * 
     * @return The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *         00:00:00 UTC. Events with a timestamp later than this time are not exported.
     */

    public Long getTo() {
        return this.to;
    }

    /**
     * <p>
     * The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     * UTC. Events with a timestamp later than this time are not exported.
     * </p>
     * 
     * @param to
     *        The end time of the range for the request, expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC. Events with a timestamp later than this time are not exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withTo(Long to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     * </p>
     * 
     * @param destination
     *        The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     * </p>
     * 
     * @return The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     * </p>
     * 
     * @param destination
     *        The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is
     * <code>exportedlogs</code>.
     * </p>
     * 
     * @param destinationPrefix
     *        The prefix used as the start of the key for every object exported. If you don't specify a value, the
     *        default is <code>exportedlogs</code>.
     */

    public void setDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is
     * <code>exportedlogs</code>.
     * </p>
     * 
     * @return The prefix used as the start of the key for every object exported. If you don't specify a value, the
     *         default is <code>exportedlogs</code>.
     */

    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    /**
     * <p>
     * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is
     * <code>exportedlogs</code>.
     * </p>
     * 
     * @param destinationPrefix
     *        The prefix used as the start of the key for every object exported. If you don't specify a value, the
     *        default is <code>exportedlogs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportTaskRequest withDestinationPrefix(String destinationPrefix) {
        setDestinationPrefix(destinationPrefix);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskName() != null)
            sb.append("TaskName: " + getTaskName() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNamePrefix() != null)
            sb.append("LogStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getFrom() != null)
            sb.append("From: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("To: " + getTo() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationPrefix() != null)
            sb.append("DestinationPrefix: " + getDestinationPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportTaskRequest == false)
            return false;
        CreateExportTaskRequest other = (CreateExportTaskRequest) obj;
        if (other.getTaskName() == null ^ this.getTaskName() == null)
            return false;
        if (other.getTaskName() != null && other.getTaskName().equals(this.getTaskName()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationPrefix() == null) ? 0 : getDestinationPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CreateExportTaskRequest clone() {
        return (CreateExportTaskRequest) super.clone();
    }
}
