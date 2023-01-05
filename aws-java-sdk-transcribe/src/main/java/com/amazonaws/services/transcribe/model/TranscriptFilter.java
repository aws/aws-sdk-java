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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Flag the presence or absence of specific words or phrases detected in your Call Analytics transcription output.
 * </p>
 * <p>
 * Rules using <code>TranscriptFilter</code> are designed to match:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Custom words or phrases spoken by the agent, the customer, or both
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom words or phrases <b>not</b> spoken by the agent, the customer, or either
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom words or phrases that occur at a specific time frame
 * </p>
 * </li>
 * </ul>
 * <p>
 * See <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html#tca-rules-batch">Rule
 * criteria for batch categories</a> and <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html#tca-rules-stream">Rule criteria for
 * streaming categories</a> for usage examples.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TranscriptFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the
     * phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your customer says "speak to <i>the</i> manager",
     * instead of "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     */
    private String transcriptFilterType;
    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;
    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;
    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     * participants.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     * <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * </p>
     */
    private Boolean negate;
    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the
     * phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your customer says "speak to <i>the</i> manager",
     * instead of "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * 
     * @param transcriptFilterType
     *        Flag the presence or absence of an exact match to the phrases that you specify. For example, if you
     *        specify the phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is
     *        flagged.</p>
     *        <p>
     *        Note that semantic matching is not supported. For example, if your customer says
     *        "speak to <i>the</i> manager", instead of "speak to <i>a</i> manager", your content is not flagged.
     * @see TranscriptFilterType
     */

    public void setTranscriptFilterType(String transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType;
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the
     * phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your customer says "speak to <i>the</i> manager",
     * instead of "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * 
     * @return Flag the presence or absence of an exact match to the phrases that you specify. For example, if you
     *         specify the phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is
     *         flagged.</p>
     *         <p>
     *         Note that semantic matching is not supported. For example, if your customer says
     *         "speak to <i>the</i> manager", instead of "speak to <i>a</i> manager", your content is not flagged.
     * @see TranscriptFilterType
     */

    public String getTranscriptFilterType() {
        return this.transcriptFilterType;
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the
     * phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your customer says "speak to <i>the</i> manager",
     * instead of "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * 
     * @param transcriptFilterType
     *        Flag the presence or absence of an exact match to the phrases that you specify. For example, if you
     *        specify the phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is
     *        flagged.</p>
     *        <p>
     *        Note that semantic matching is not supported. For example, if your customer says
     *        "speak to <i>the</i> manager", instead of "speak to <i>a</i> manager", your content is not flagged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFilterType
     */

    public TranscriptFilter withTranscriptFilterType(String transcriptFilterType) {
        setTranscriptFilterType(transcriptFilterType);
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of an exact match to the phrases that you specify. For example, if you specify the
     * phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is flagged.
     * </p>
     * <p>
     * Note that semantic matching is not supported. For example, if your customer says "speak to <i>the</i> manager",
     * instead of "speak to <i>a</i> manager", your content is not flagged.
     * </p>
     * 
     * @param transcriptFilterType
     *        Flag the presence or absence of an exact match to the phrases that you specify. For example, if you
     *        specify the phrase "speak to a manager" as your <code>Targets</code> value, only that exact phrase is
     *        flagged.</p>
     *        <p>
     *        Note that semantic matching is not supported. For example, if your customer says
     *        "speak to <i>the</i> manager", instead of "speak to <i>a</i> manager", your content is not flagged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFilterType
     */

    public TranscriptFilter withTranscriptFilterType(TranscriptFilterType transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType.toString();
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @param absoluteTimeRange
     *        Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search
     *        for the specified key words or phrases. See for more detail.
     */

    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @return Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to
     *         search for the specified key words or phrases. See for more detail.
     */

    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return this.absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @param absoluteTimeRange
     *        Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search
     *        for the specified key words or phrases. See for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        setAbsoluteTimeRange(absoluteTimeRange);
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @param relativeTimeRange
     *        Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *        search for the specified key words or phrases. See for more detail.
     */

    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @return Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *         search for the specified key words or phrases. See for more detail.
     */

    public RelativeTimeRange getRelativeTimeRange() {
        return this.relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * the specified key words or phrases. See for more detail.
     * </p>
     * 
     * @param relativeTimeRange
     *        Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *        search for the specified key words or phrases. See for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        setRelativeTimeRange(relativeTimeRange);
        return this;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     * participants.
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     *        participants.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     * participants.
     * </p>
     * 
     * @return Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     *         participants.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     * participants.
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     *        participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptFilter withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     * participants.
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. Omitting this parameter is equivalent to specifying both
     *        participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     * <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     *        <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     * <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     *         <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     * <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     *        <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     * <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to flag the absence of the phrase that you specified in your request. Set to
     *         <code>FALSE</code> to flag the presence of the phrase that you specified in your request.
     */

    public Boolean isNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     * 
     * @return Specify the phrases that you want to flag.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     * 
     * @param targets
     *        Specify the phrases that you want to flag.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        Specify the phrases that you want to flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the phrases that you want to flag.
     * </p>
     * 
     * @param targets
     *        Specify the phrases that you want to flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
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
        if (getTranscriptFilterType() != null)
            sb.append("TranscriptFilterType: ").append(getTranscriptFilterType()).append(",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: ").append(getAbsoluteTimeRange()).append(",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: ").append(getRelativeTimeRange()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptFilter == false)
            return false;
        TranscriptFilter other = (TranscriptFilter) obj;
        if (other.getTranscriptFilterType() == null ^ this.getTranscriptFilterType() == null)
            return false;
        if (other.getTranscriptFilterType() != null && other.getTranscriptFilterType().equals(this.getTranscriptFilterType()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptFilterType() == null) ? 0 : getTranscriptFilterType().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptFilter clone() {
        try {
            return (TranscriptFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
