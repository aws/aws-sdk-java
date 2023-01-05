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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchUpdateAttendeeCapabilitiesExcept"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateAttendeeCapabilitiesExceptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * </p>
     */
    private java.util.List<AttendeeIdItem> excludedAttendeeIds;
    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to update.
     * </p>
     */
    private AttendeeCapabilities capabilities;

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @param meetingId
     *        The ID of the meeting associated with the update request.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @return The ID of the meeting associated with the update request.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @param meetingId
     *        The ID of the meeting associated with the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAttendeeCapabilitiesExceptRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * </p>
     * 
     * @return The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     */

    public java.util.List<AttendeeIdItem> getExcludedAttendeeIds() {
        return excludedAttendeeIds;
    }

    /**
     * <p>
     * The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * </p>
     * 
     * @param excludedAttendeeIds
     *        The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     */

    public void setExcludedAttendeeIds(java.util.Collection<AttendeeIdItem> excludedAttendeeIds) {
        if (excludedAttendeeIds == null) {
            this.excludedAttendeeIds = null;
            return;
        }

        this.excludedAttendeeIds = new java.util.ArrayList<AttendeeIdItem>(excludedAttendeeIds);
    }

    /**
     * <p>
     * The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedAttendeeIds(java.util.Collection)} or {@link #withExcludedAttendeeIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param excludedAttendeeIds
     *        The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAttendeeCapabilitiesExceptRequest withExcludedAttendeeIds(AttendeeIdItem... excludedAttendeeIds) {
        if (this.excludedAttendeeIds == null) {
            setExcludedAttendeeIds(new java.util.ArrayList<AttendeeIdItem>(excludedAttendeeIds.length));
        }
        for (AttendeeIdItem ele : excludedAttendeeIds) {
            this.excludedAttendeeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * </p>
     * 
     * @param excludedAttendeeIds
     *        The <code>AttendeeIDs</code> that you want to exclude from one or more capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAttendeeCapabilitiesExceptRequest withExcludedAttendeeIds(java.util.Collection<AttendeeIdItem> excludedAttendeeIds) {
        setExcludedAttendeeIds(excludedAttendeeIds);
        return this;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to update.
     * </p>
     * 
     * @param capabilities
     *        The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to
     *        update.
     */

    public void setCapabilities(AttendeeCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to update.
     * </p>
     * 
     * @return The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to
     *         update.
     */

    public AttendeeCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to update.
     * </p>
     * 
     * @param capabilities
     *        The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to
     *        update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateAttendeeCapabilitiesExceptRequest withCapabilities(AttendeeCapabilities capabilities) {
        setCapabilities(capabilities);
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
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId()).append(",");
        if (getExcludedAttendeeIds() != null)
            sb.append("ExcludedAttendeeIds: ").append(getExcludedAttendeeIds()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateAttendeeCapabilitiesExceptRequest == false)
            return false;
        BatchUpdateAttendeeCapabilitiesExceptRequest other = (BatchUpdateAttendeeCapabilitiesExceptRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getExcludedAttendeeIds() == null ^ this.getExcludedAttendeeIds() == null)
            return false;
        if (other.getExcludedAttendeeIds() != null && other.getExcludedAttendeeIds().equals(this.getExcludedAttendeeIds()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getExcludedAttendeeIds() == null) ? 0 : getExcludedAttendeeIds().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateAttendeeCapabilitiesExceptRequest clone() {
        return (BatchUpdateAttendeeCapabilitiesExceptRequest) super.clone();
    }

}
