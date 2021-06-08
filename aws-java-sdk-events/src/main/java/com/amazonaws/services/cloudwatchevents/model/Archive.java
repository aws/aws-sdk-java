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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An <code>Archive</code> object that contains details about an archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/Archive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Archive implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the archive.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The current state of the archive.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description for the reason that the archive is in the current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The number of days to retain events in the archive before they are deleted.
     * </p>
     */
    private Integer retentionDays;
    /**
     * <p>
     * The size of the archive, in bytes.
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
     * The time stamp for the time that the archive was created.
     * </p>
     */
    private java.util.Date creationTime;

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

    public Archive withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event bus associated with the archive. Only events from this event bus are sent to the
     *        archive.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
     * </p>
     * 
     * @return The ARN of the event bus associated with the archive. Only events from this event bus are sent to the
     *         archive.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the event bus associated with the archive. Only events from this event bus are sent to the
     *        archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Archive withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The current state of the archive.
     * </p>
     * 
     * @param state
     *        The current state of the archive.
     * @see ArchiveState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the archive.
     * </p>
     * 
     * @return The current state of the archive.
     * @see ArchiveState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the archive.
     * </p>
     * 
     * @param state
     *        The current state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public Archive withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the archive.
     * </p>
     * 
     * @param state
     *        The current state of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public Archive withState(ArchiveState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description for the reason that the archive is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description for the reason that the archive is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * A description for the reason that the archive is in the current state.
     * </p>
     * 
     * @return A description for the reason that the archive is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * A description for the reason that the archive is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description for the reason that the archive is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Archive withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The number of days to retain events in the archive before they are deleted.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events in the archive before they are deleted.
     */

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events in the archive before they are deleted.
     * </p>
     * 
     * @return The number of days to retain events in the archive before they are deleted.
     */

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * <p>
     * The number of days to retain events in the archive before they are deleted.
     * </p>
     * 
     * @param retentionDays
     *        The number of days to retain events in the archive before they are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Archive withRetentionDays(Integer retentionDays) {
        setRetentionDays(retentionDays);
        return this;
    }

    /**
     * <p>
     * The size of the archive, in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the archive, in bytes.
     */

    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * <p>
     * The size of the archive, in bytes.
     * </p>
     * 
     * @return The size of the archive, in bytes.
     */

    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * <p>
     * The size of the archive, in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the archive, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Archive withSizeBytes(Long sizeBytes) {
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

    public Archive withEventCount(Long eventCount) {
        setEventCount(eventCount);
        return this;
    }

    /**
     * <p>
     * The time stamp for the time that the archive was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for the time that the archive was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp for the time that the archive was created.
     * </p>
     * 
     * @return The time stamp for the time that the archive was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp for the time that the archive was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for the time that the archive was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Archive withCreationTime(java.util.Date creationTime) {
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
        if (getArchiveName() != null)
            sb.append("ArchiveName: ").append(getArchiveName()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
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

        if (obj instanceof Archive == false)
            return false;
        Archive other = (Archive) obj;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
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

        hashCode = prime * hashCode + ((getArchiveName() == null) ? 0 : getArchiveName().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getEventCount() == null) ? 0 : getEventCount().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public Archive clone() {
        try {
            return (Archive) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.ArchiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
