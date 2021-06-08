/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeArchiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     */
    private String archiveArn;
    /**
     * <p>
     * The name of the archive.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The description of the archive.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event pattern used to filter events sent to the archive.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The state of the archive.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the archive is in the state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The number of days to retain events for in the archive.
     * </p>
     */
    private Integer retentionDays;
    /**
     * <p>
     * The size of the archive in bytes.
     * </p>
     */
    private Long sizeBytes;
    /**
     * <p>
     * The number of events in the archive.
     * </p>
     */
    private Long eventCount;
    /**
     * <p>
     * The time at which the archive was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The ARN of the archive.
     */

    public void setArchiveArn(String archiveArn) {
        this.archiveArn = archiveArn;
    }

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @return The ARN of the archive.
     */

    public String getArchiveArn() {
        return this.archiveArn;
    }

    /**
     * <p>
     * The ARN of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The ARN of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withArchiveArn(String archiveArn) {
        setArchiveArn(archiveArn);
        return this;
    }

    /**
     * <p>
     * The name of the archive.
     * </p>
     * 
     * @param archiveName
     *        The name of the archive.
     */

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /**
     * <p>
     * The name of the archive.
     * </p>
     * 
     * @return The name of the archive.
     */

    public String getArchiveName() {
        return this.archiveName;
    }

    /**
     * <p>
     * The name of the archive.
     * </p>
     * 
     * @param archiveName
     *        The name of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event source associated with the archive.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @return The ARN of the event source associated with the archive.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event source associated with the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event source associated with the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The description of the archive.
     * </p>
     * 
     * @param description
     *        The description of the archive.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the archive.
     * </p>
     * 
     * @return The description of the archive.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the archive.
     * </p>
     * 
     * @param description
     *        The description of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event pattern used to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern used to filter events sent to the archive.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern used to filter events sent to the archive.
     * </p>
     * 
     * @return The event pattern used to filter events sent to the archive.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern used to filter events sent to the archive.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern used to filter events sent to the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @see ArchiveState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @return The state of the archive.
     * @see ArchiveState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public DescribeArchiveResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the archive.
     * </p>
     * 
     * @param state
     *        The state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public DescribeArchiveResult withState(ArchiveState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the archive is in the state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the archive is in the state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that the archive is in the state.
     * </p>
     * 
     * @return The reason that the archive is in the state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that the archive is in the state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the archive is in the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The number of days to retain events for in the archive.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events for in the archive.
     */

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events for in the archive.
     * </p>
     * 
     * @return The number of days to retain events for in the archive.
     */

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events for in the archive.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events for in the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withRetentionDays(Integer retentionDays) {
        setRetentionDays(retentionDays);
        return this;
    }

    /**
     * <p>
     * The size of the archive in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the archive in bytes.
     */

    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * <p>
     * The size of the archive in bytes.
     * </p>
     * 
     * @return The size of the archive in bytes.
     */

    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * <p>
     * The size of the archive in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the archive in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withSizeBytes(Long sizeBytes) {
        setSizeBytes(sizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of events in the archive.
     * </p>
     * 
     * @param eventCount
     *        The number of events in the archive.
     */

    public void setEventCount(Long eventCount) {
        this.eventCount = eventCount;
    }

    /**
     * <p>
     * The number of events in the archive.
     * </p>
     * 
     * @return The number of events in the archive.
     */

    public Long getEventCount() {
        return this.eventCount;
    }

    /**
     * <p>
     * The number of events in the archive.
     * </p>
     * 
     * @param eventCount
     *        The number of events in the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withEventCount(Long eventCount) {
        setEventCount(eventCount);
        return this;
    }

    /**
     * <p>
     * The time at which the archive was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the archive was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the archive was created.
     * </p>
     * 
     * @return The time at which the archive was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the archive was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the archive was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeArchiveResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getArchiveArn() != null)
            sb.append("ArchiveArn: ").append(getArchiveArn()).append(",");
        if (getArchiveName() != null)
            sb.append("ArchiveName: ").append(getArchiveName()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventPattern() != null)
            sb.append("EventPattern: ").append(getEventPattern()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getRetentionDays() != null)
            sb.append("RetentionDays: ").append(getRetentionDays()).append(",");
        if (getSizeBytes() != null)
            sb.append("SizeBytes: ").append(getSizeBytes()).append(",");
        if (getEventCount() != null)
            sb.append("EventCount: ").append(getEventCount()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeArchiveResult == false)
            return false;
        DescribeArchiveResult other = (DescribeArchiveResult) obj;
        if (other.getArchiveArn() == null ^ this.getArchiveArn() == null)
            return false;
        if (other.getArchiveArn() != null && other.getArchiveArn().equals(this.getArchiveArn()) == false)
            return false;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getRetentionDays() == null ^ this.getRetentionDays() == null)
            return false;
        if (other.getRetentionDays() != null && other.getRetentionDays().equals(this.getRetentionDays()) == false)
            return false;
        if (other.getSizeBytes() == null ^ this.getSizeBytes() == null)
            return false;
        if (other.getSizeBytes() != null && other.getSizeBytes().equals(this.getSizeBytes()) == false)
            return false;
        if (other.getEventCount() == null ^ this.getEventCount() == null)
            return false;
        if (other.getEventCount() != null && other.getEventCount().equals(this.getEventCount()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveArn() == null) ? 0 : getArchiveArn().hashCode());
        hashCode = prime * hashCode + ((getArchiveName() == null) ? 0 : getArchiveName().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getEventCount() == null) ? 0 : getEventCount().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeArchiveResult clone() {
        try {
            return (DescribeArchiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
