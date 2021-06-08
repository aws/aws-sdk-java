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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of messages in the session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/Transcript" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transcript implements Serializable, Cloneable, StructuredPojo {

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
     * The role of participant. For example, is it a customer, agent, or system.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * The content of the transcript.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The beginning offset in the contact for this transcript.
     * </p>
     */
    private Integer beginOffsetMillis;
    /**
     * <p>
     * The end offset in the contact for this transcript.
     * </p>
     */
    private Integer endOffsetMillis;
    /**
     * <p>
     * The sentiment of the detected for this piece of transcript.
     * </p>
     */
    private String sentiment;
    /**
     * <p>
     * List of positions where issues were detected on the transcript.
     * </p>
     */
    private java.util.List<IssueDetected> issuesDetected;

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

    public Transcript withId(String id) {
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

    public Transcript withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * The role of participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of participant. For example, is it a customer, agent, or system.
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @return The role of participant. For example, is it a customer, agent, or system.
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * The role of participant. For example, is it a customer, agent, or system.
     * </p>
     * 
     * @param participantRole
     *        The role of participant. For example, is it a customer, agent, or system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * The content of the transcript.
     * </p>
     * 
     * @param content
     *        The content of the transcript.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the transcript.
     * </p>
     * 
     * @return The content of the transcript.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the transcript.
     * </p>
     * 
     * @param content
     *        The content of the transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The beginning offset in the contact for this transcript.
     * </p>
     * 
     * @param beginOffsetMillis
     *        The beginning offset in the contact for this transcript.
     */

    public void setBeginOffsetMillis(Integer beginOffsetMillis) {
        this.beginOffsetMillis = beginOffsetMillis;
    }

    /**
     * <p>
     * The beginning offset in the contact for this transcript.
     * </p>
     * 
     * @return The beginning offset in the contact for this transcript.
     */

    public Integer getBeginOffsetMillis() {
        return this.beginOffsetMillis;
    }

    /**
     * <p>
     * The beginning offset in the contact for this transcript.
     * </p>
     * 
     * @param beginOffsetMillis
     *        The beginning offset in the contact for this transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withBeginOffsetMillis(Integer beginOffsetMillis) {
        setBeginOffsetMillis(beginOffsetMillis);
        return this;
    }

    /**
     * <p>
     * The end offset in the contact for this transcript.
     * </p>
     * 
     * @param endOffsetMillis
     *        The end offset in the contact for this transcript.
     */

    public void setEndOffsetMillis(Integer endOffsetMillis) {
        this.endOffsetMillis = endOffsetMillis;
    }

    /**
     * <p>
     * The end offset in the contact for this transcript.
     * </p>
     * 
     * @return The end offset in the contact for this transcript.
     */

    public Integer getEndOffsetMillis() {
        return this.endOffsetMillis;
    }

    /**
     * <p>
     * The end offset in the contact for this transcript.
     * </p>
     * 
     * @param endOffsetMillis
     *        The end offset in the contact for this transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withEndOffsetMillis(Integer endOffsetMillis) {
        setEndOffsetMillis(endOffsetMillis);
        return this;
    }

    /**
     * <p>
     * The sentiment of the detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the detected for this piece of transcript.
     * @see SentimentValue
     */

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    /**
     * <p>
     * The sentiment of the detected for this piece of transcript.
     * </p>
     * 
     * @return The sentiment of the detected for this piece of transcript.
     * @see SentimentValue
     */

    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * <p>
     * The sentiment of the detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the detected for this piece of transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentValue
     */

    public Transcript withSentiment(String sentiment) {
        setSentiment(sentiment);
        return this;
    }

    /**
     * <p>
     * The sentiment of the detected for this piece of transcript.
     * </p>
     * 
     * @param sentiment
     *        The sentiment of the detected for this piece of transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentValue
     */

    public Transcript withSentiment(SentimentValue sentiment) {
        this.sentiment = sentiment.toString();
        return this;
    }

    /**
     * <p>
     * List of positions where issues were detected on the transcript.
     * </p>
     * 
     * @return List of positions where issues were detected on the transcript.
     */

    public java.util.List<IssueDetected> getIssuesDetected() {
        return issuesDetected;
    }

    /**
     * <p>
     * List of positions where issues were detected on the transcript.
     * </p>
     * 
     * @param issuesDetected
     *        List of positions where issues were detected on the transcript.
     */

    public void setIssuesDetected(java.util.Collection<IssueDetected> issuesDetected) {
        if (issuesDetected == null) {
            this.issuesDetected = null;
            return;
        }

        this.issuesDetected = new java.util.ArrayList<IssueDetected>(issuesDetected);
    }

    /**
     * <p>
     * List of positions where issues were detected on the transcript.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssuesDetected(java.util.Collection)} or {@link #withIssuesDetected(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param issuesDetected
     *        List of positions where issues were detected on the transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withIssuesDetected(IssueDetected... issuesDetected) {
        if (this.issuesDetected == null) {
            setIssuesDetected(new java.util.ArrayList<IssueDetected>(issuesDetected.length));
        }
        for (IssueDetected ele : issuesDetected) {
            this.issuesDetected.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of positions where issues were detected on the transcript.
     * </p>
     * 
     * @param issuesDetected
     *        List of positions where issues were detected on the transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withIssuesDetected(java.util.Collection<IssueDetected> issuesDetected) {
        setIssuesDetected(issuesDetected);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getBeginOffsetMillis() != null)
            sb.append("BeginOffsetMillis: ").append(getBeginOffsetMillis()).append(",");
        if (getEndOffsetMillis() != null)
            sb.append("EndOffsetMillis: ").append(getEndOffsetMillis()).append(",");
        if (getSentiment() != null)
            sb.append("Sentiment: ").append(getSentiment()).append(",");
        if (getIssuesDetected() != null)
            sb.append("IssuesDetected: ").append(getIssuesDetected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;
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
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getBeginOffsetMillis() == null ^ this.getBeginOffsetMillis() == null)
            return false;
        if (other.getBeginOffsetMillis() != null && other.getBeginOffsetMillis().equals(this.getBeginOffsetMillis()) == false)
            return false;
        if (other.getEndOffsetMillis() == null ^ this.getEndOffsetMillis() == null)
            return false;
        if (other.getEndOffsetMillis() != null && other.getEndOffsetMillis().equals(this.getEndOffsetMillis()) == false)
            return false;
        if (other.getSentiment() == null ^ this.getSentiment() == null)
            return false;
        if (other.getSentiment() != null && other.getSentiment().equals(this.getSentiment()) == false)
            return false;
        if (other.getIssuesDetected() == null ^ this.getIssuesDetected() == null)
            return false;
        if (other.getIssuesDetected() != null && other.getIssuesDetected().equals(this.getIssuesDetected()) == false)
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
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getBeginOffsetMillis() == null) ? 0 : getBeginOffsetMillis().hashCode());
        hashCode = prime * hashCode + ((getEndOffsetMillis() == null) ? 0 : getEndOffsetMillis().hashCode());
        hashCode = prime * hashCode + ((getSentiment() == null) ? 0 : getSentiment().hashCode());
        hashCode = prime * hashCode + ((getIssuesDetected() == null) ? 0 : getIssuesDetected().hashCode());
        return hashCode;
    }

    @Override
    public Transcript clone() {
        try {
            return (Transcript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.TranscriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
