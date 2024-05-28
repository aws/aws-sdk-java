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
 * The analyzed transcript segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisSegmentTranscript"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentTranscript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the transcript.
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
     * The display name of the participant.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Field describing the time of the event. It can have different representations of time.
     * </p>
     */
    private RealTimeContactAnalysisTimeData time;
    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If transcript has the field it means part of the
     * transcript was redacted.
     * </p>
     */
    private RealTimeContactAnalysisTranscriptItemRedaction redaction;
    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     */
    private String sentiment;

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * 
     * @param id
     *        The identifier of the transcript.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * 
     * @return The identifier of the transcript.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the transcript.
     * </p>
     * 
     * @param id
     *        The identifier of the transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentTranscript withId(String id) {
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

    public RealTimeContactAnalysisSegmentTranscript withParticipantId(String participantId) {
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

    public RealTimeContactAnalysisSegmentTranscript withParticipantRole(String participantRole) {
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

    public RealTimeContactAnalysisSegmentTranscript withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * 
     * @param displayName
     *        The display name of the participant.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * 
     * @return The display name of the participant.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * 
     * @param displayName
     *        The display name of the participant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentTranscript withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * 
     * @param content
     *        The content of the transcript. Can be redacted.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * 
     * @return The content of the transcript. Can be redacted.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the transcript. Can be redacted.
     * </p>
     * 
     * @param content
     *        The content of the transcript. Can be redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentTranscript withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * 
     * @param contentType
     *        The type of content of the item. For example, <code>text/plain</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * 
     * @return The type of content of the item. For example, <code>text/plain</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of content of the item. For example, <code>text/plain</code>.
     * </p>
     * 
     * @param contentType
     *        The type of content of the item. For example, <code>text/plain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentTranscript withContentType(String contentType) {
        setContentType(contentType);
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

    public RealTimeContactAnalysisSegmentTranscript withTime(RealTimeContactAnalysisTimeData time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If transcript has the field it means part of the
     * transcript was redacted.
     * </p>
     * 
     * @param redaction
     *        Object describing redaction that was applied to the transcript. If transcript has the field it means part
     *        of the transcript was redacted.
     */

    public void setRedaction(RealTimeContactAnalysisTranscriptItemRedaction redaction) {
        this.redaction = redaction;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If transcript has the field it means part of the
     * transcript was redacted.
     * </p>
     * 
     * @return Object describing redaction that was applied to the transcript. If transcript has the field it means part
     *         of the transcript was redacted.
     */

    public RealTimeContactAnalysisTranscriptItemRedaction getRedaction() {
        return this.redaction;
    }

    /**
     * <p>
     * Object describing redaction that was applied to the transcript. If transcript has the field it means part of the
     * transcript was redacted.
     * </p>
     * 
     * @param redaction
     *        Object describing redaction that was applied to the transcript. If transcript has the field it means part
     *        of the transcript was redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentTranscript withRedaction(RealTimeContactAnalysisTranscriptItemRedaction redaction) {
        setRedaction(redaction);
        return this;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected for this piece of transcript.
     * @see RealTimeContactAnalysisSentimentLabel
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * 
     * @return The sentiment detected for this piece of transcript.
     * @see RealTimeContactAnalysisSentimentLabel
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected for this piece of transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSentimentLabel
     */

    public RealTimeContactAnalysisSegmentTranscript withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The sentiment detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment detected for this piece of transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeContactAnalysisSentimentLabel
     */

    public RealTimeContactAnalysisSegmentTranscript withSentiment(RealTimeContactAnalysisSentimentLabel sentiment) {
        this.sentiment = sentiment.toString();
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getRedaction() != null)
            sb.append("Redaction: ").append(getRedaction()).append(",");
        if (getSentiment() != null)
            sb.append("Sentiment: ").append(getSentiment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentTranscript == false)
            return false;
        RealTimeContactAnalysisSegmentTranscript other = (RealTimeContactAnalysisSegmentTranscript) obj;
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
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getRedaction() == null ^ this.getRedaction() == null)
            return false;
        if (other.getRedaction() != null && other.getRedaction().equals(this.getRedaction()) == false)
            return false;
        if (other.getSentiment() == null ^ this.getSentiment() == null)
            return false;
        if (other.getSentiment() != null && other.getSentiment().equals(this.getSentiment()) == false)
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
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getRedaction() == null) ? 0 : getRedaction().hashCode());
        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisSegmentTranscript clone() {
        try {
            return (RealTimeContactAnalysisSegmentTranscript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisSegmentTranscriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
