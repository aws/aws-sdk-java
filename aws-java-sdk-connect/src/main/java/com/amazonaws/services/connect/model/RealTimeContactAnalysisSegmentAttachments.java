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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Segment containing list of attachments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisSegmentAttachments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentAttachments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the segment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the participant.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or system.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * List of objects describing an individual attachment.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisAttachment> attachments;
    /**
     * <p>
     * Field describing the time of the event. It can have different representations of time.
     * </p>
     */
    private RealTimeContactAnalysisTimeData time;

    /**
     * <p>
     * The identifier of the segment.
     * </p>
     * 
     * @param id
     *        The identifier of the segment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the segment.
     * </p>
     * 
     * @return The identifier of the segment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the segment.
     * </p>
     * 
     * @param id
     *        The identifier of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * 
     * @param participantId
     *        The identifier of the participant.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * 
     * @return The identifier of the participant.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * 
     * @param participantId
     *        The identifier of the participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant. For example, is it a customer, agent, or system.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @return The role of the participant. For example, is it a customer, agent, or system.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant. For example, is it a customer, agent, or system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public RealTimeContactAnalysisSegmentAttachments withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of the participant. For example, is it a customer, agent, or system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public RealTimeContactAnalysisSegmentAttachments withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * 
     * @param displayName
     *        The display name of the participant. Can be redacted.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * 
     * @return The display name of the participant. Can be redacted.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * 
     * @param displayName
     *        The display name of the participant. Can be redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * List of objects describing an individual attachment.
     * </p>
     * 
     * @return List of objects describing an individual attachment.
     */

    public java.util.List<RealTimeContactAnalysisAttachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * List of objects describing an individual attachment.
     * </p>
     * 
     * @param attachments
     *        List of objects describing an individual attachment.
     */

    public void setAttachments(java.util.Collection<RealTimeContactAnalysisAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<RealTimeContactAnalysisAttachment>(attachments);
    }

    /**
     * <p>
     * List of objects describing an individual attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        List of objects describing an individual attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withAttachments(RealTimeContactAnalysisAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new java.util.ArrayList<RealTimeContactAnalysisAttachment>(attachments.length));
        }
        for (RealTimeContactAnalysisAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of objects describing an individual attachment.
     * </p>
     * 
     * @param attachments
     *        List of objects describing an individual attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withAttachments(java.util.Collection<RealTimeContactAnalysisAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different representations of time.
     * </p>
     * 
     * @param time
     *        Field describing the time of the event. It can have different representations of time.
     */

    public void setTime(RealTimeContactAnalysisTimeData time) {
        this.time = time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different representations of time.
     * </p>
     * 
     * @return Field describing the time of the event. It can have different representations of time.
     */

    public RealTimeContactAnalysisTimeData getTime() {
        return this.time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different representations of time.
     * </p>
     * 
     * @param time
     *        Field describing the time of the event. It can have different representations of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentAttachments withTime(RealTimeContactAnalysisTimeData time) {
        setTime(time);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentAttachments == false)
            return false;
        RealTimeContactAnalysisSegmentAttachments other = (RealTimeContactAnalysisSegmentAttachments) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisSegmentAttachments clone() {
        try {
            return (RealTimeContactAnalysisSegmentAttachments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisSegmentAttachmentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
