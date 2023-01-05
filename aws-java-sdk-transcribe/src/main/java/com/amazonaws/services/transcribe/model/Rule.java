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
 * A rule is a set of criteria that you can specify to flag an attribute in your Call Analytics output. Rules define a
 * Call Analytics category.
 * </p>
 * <p>
 * Rules can include these parameters: , , , and .
 * </p>
 * <p>
 * To learn more about Call Analytics rules and categories, see <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html">Creating categories for batch
 * transcriptions</a> and <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html">Creating
 * categories for streaming transcriptions</a>.
 * </p>
 * <p>
 * To learn more about Call Analytics, see <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html">Analyzing call center audio with Call
 * Analytics</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     */
    private NonTalkTimeFilter nonTalkTimeFilter;
    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     */
    private InterruptionFilter interruptionFilter;
    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call Analytics transcription output. Refer to
     * for more detail.
     * </p>
     */
    private TranscriptFilter transcriptFilter;
    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to for
     * more detail.
     * </p>
     */
    private SentimentFilter sentimentFilter;

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @param nonTalkTimeFilter
     *        Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to
     *        for more detail.
     */

    public void setNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        this.nonTalkTimeFilter = nonTalkTimeFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @return Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to
     *         for more detail.
     */

    public NonTalkTimeFilter getNonTalkTimeFilter() {
        return this.nonTalkTimeFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @param nonTalkTimeFilter
     *        Flag the presence or absence of periods of silence in your Call Analytics transcription output. Refer to
     *        for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        setNonTalkTimeFilter(nonTalkTimeFilter);
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @param interruptionFilter
     *        Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for
     *        more detail.
     */

    public void setInterruptionFilter(InterruptionFilter interruptionFilter) {
        this.interruptionFilter = interruptionFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @return Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for
     *         more detail.
     */

    public InterruptionFilter getInterruptionFilter() {
        return this.interruptionFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for more
     * detail.
     * </p>
     * 
     * @param interruptionFilter
     *        Flag the presence or absence of interruptions in your Call Analytics transcription output. Refer to for
     *        more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withInterruptionFilter(InterruptionFilter interruptionFilter) {
        setInterruptionFilter(interruptionFilter);
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call Analytics transcription output. Refer to
     * for more detail.
     * </p>
     * 
     * @param transcriptFilter
     *        Flag the presence or absence of specific words or phrases in your Call Analytics transcription output.
     *        Refer to for more detail.
     */

    public void setTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call Analytics transcription output. Refer to
     * for more detail.
     * </p>
     * 
     * @return Flag the presence or absence of specific words or phrases in your Call Analytics transcription output.
     *         Refer to for more detail.
     */

    public TranscriptFilter getTranscriptFilter() {
        return this.transcriptFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific words or phrases in your Call Analytics transcription output. Refer to
     * for more detail.
     * </p>
     * 
     * @param transcriptFilter
     *        Flag the presence or absence of specific words or phrases in your Call Analytics transcription output.
     *        Refer to for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withTranscriptFilter(TranscriptFilter transcriptFilter) {
        setTranscriptFilter(transcriptFilter);
        return this;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to for
     * more detail.
     * </p>
     * 
     * @param sentimentFilter
     *        Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to
     *        for more detail.
     */

    public void setSentimentFilter(SentimentFilter sentimentFilter) {
        this.sentimentFilter = sentimentFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to for
     * more detail.
     * </p>
     * 
     * @return Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to
     *         for more detail.
     */

    public SentimentFilter getSentimentFilter() {
        return this.sentimentFilter;
    }

    /**
     * <p>
     * Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to for
     * more detail.
     * </p>
     * 
     * @param sentimentFilter
     *        Flag the presence or absence of specific sentiments in your Call Analytics transcription output. Refer to
     *        for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withSentimentFilter(SentimentFilter sentimentFilter) {
        setSentimentFilter(sentimentFilter);
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
        if (getNonTalkTimeFilter() != null)
            sb.append("NonTalkTimeFilter: ").append(getNonTalkTimeFilter()).append(",");
        if (getInterruptionFilter() != null)
            sb.append("InterruptionFilter: ").append(getInterruptionFilter()).append(",");
        if (getTranscriptFilter() != null)
            sb.append("TranscriptFilter: ").append(getTranscriptFilter()).append(",");
        if (getSentimentFilter() != null)
            sb.append("SentimentFilter: ").append(getSentimentFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getNonTalkTimeFilter() == null ^ this.getNonTalkTimeFilter() == null)
            return false;
        if (other.getNonTalkTimeFilter() != null && other.getNonTalkTimeFilter().equals(this.getNonTalkTimeFilter()) == false)
            return false;
        if (other.getInterruptionFilter() == null ^ this.getInterruptionFilter() == null)
            return false;
        if (other.getInterruptionFilter() != null && other.getInterruptionFilter().equals(this.getInterruptionFilter()) == false)
            return false;
        if (other.getTranscriptFilter() == null ^ this.getTranscriptFilter() == null)
            return false;
        if (other.getTranscriptFilter() != null && other.getTranscriptFilter().equals(this.getTranscriptFilter()) == false)
            return false;
        if (other.getSentimentFilter() == null ^ this.getSentimentFilter() == null)
            return false;
        if (other.getSentimentFilter() != null && other.getSentimentFilter().equals(this.getSentimentFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNonTalkTimeFilter() == null) ? 0 : getNonTalkTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getInterruptionFilter() == null) ? 0 : getInterruptionFilter().hashCode());
        hashCode = prime * hashCode + ((getTranscriptFilter() == null) ? 0 : getTranscriptFilter().hashCode());
        hashCode = prime * hashCode + ((getSentimentFilter() == null) ? 0 : getSentimentFilter().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
