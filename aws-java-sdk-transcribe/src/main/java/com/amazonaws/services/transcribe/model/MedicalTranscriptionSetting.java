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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional settings for the <a>StartMedicalTranscriptionJob</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalTranscriptionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to identify different speakers in the input
     * audio. Speaker recognition labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in the
     * <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     */
    private Boolean showSpeakerLabels;
    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers are identified as a single speaker. If you specify the <code>MaxSpeakerLabels</code>
     * field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     */
    private Integer maxSpeakerLabels;
    /**
     * <p>
     * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription
     * output of each channel into a single transcription.
     * </p>
     * <p>
     * Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the
     * start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also
     * come with confidence scores provided by Amazon Transcribe Medical.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>
     * </p>
     */
    private Boolean channelIdentification;
    /**
     * <p>
     * Determines whether alternative transcripts are generated along with the transcript that has the highest
     * confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number of
     * alternatives to return in the <code>MaxAlternatives</code> field.
     * </p>
     */
    private Boolean showAlternatives;
    /**
     * <p>
     * The maximum number of alternatives that you tell the service to return. If you specify the
     * <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     * </p>
     */
    private Integer maxAlternatives;
    /**
     * <p>
     * The name of the vocabulary to use when processing a medical transcription job.
     * </p>
     */
    private String vocabularyName;

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to identify different speakers in the input
     * audio. Speaker recognition labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in the
     * <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Determines whether the transcription job uses speaker recognition to identify different speakers in the
     *        input audio. Speaker recognition labels individual speakers in the audio file. If you set the
     *        <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in
     *        the <code>MaxSpeakerLabels</code> field.</p>
     *        <p>
     *        You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>.
     */

    public void setShowSpeakerLabels(Boolean showSpeakerLabels) {
        this.showSpeakerLabels = showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to identify different speakers in the input
     * audio. Speaker recognition labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in the
     * <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * 
     * @return Determines whether the transcription job uses speaker recognition to identify different speakers in the
     *         input audio. Speaker recognition labels individual speakers in the audio file. If you set the
     *         <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in
     *         the <code>MaxSpeakerLabels</code> field.</p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *         request. If you set both, your request returns a <code>BadRequestException</code>.
     */

    public Boolean getShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to identify different speakers in the input
     * audio. Speaker recognition labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in the
     * <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Determines whether the transcription job uses speaker recognition to identify different speakers in the
     *        input audio. Speaker recognition labels individual speakers in the audio file. If you set the
     *        <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in
     *        the <code>MaxSpeakerLabels</code> field.</p>
     *        <p>
     *        You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withShowSpeakerLabels(Boolean showSpeakerLabels) {
        setShowSpeakerLabels(showSpeakerLabels);
        return this;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to identify different speakers in the input
     * audio. Speaker recognition labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in the
     * <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * 
     * @return Determines whether the transcription job uses speaker recognition to identify different speakers in the
     *         input audio. Speaker recognition labels individual speakers in the audio file. If you set the
     *         <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of speaker labels in
     *         the <code>MaxSpeakerLabels</code> field.</p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *         request. If you set both, your request returns a <code>BadRequestException</code>.
     */

    public Boolean isShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers are identified as a single speaker. If you specify the <code>MaxSpeakerLabels</code>
     * field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *        than this number, multiple speakers are identified as a single speaker. If you specify the
     *        <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     */

    public void setMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers are identified as a single speaker. If you specify the <code>MaxSpeakerLabels</code>
     * field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @return The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *         than this number, multiple speakers are identified as a single speaker. If you specify the
     *         <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     */

    public Integer getMaxSpeakerLabels() {
        return this.maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers are identified as a single speaker. If you specify the <code>MaxSpeakerLabels</code>
     * field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *        than this number, multiple speakers are identified as a single speaker. If you specify the
     *        <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withMaxSpeakerLabels(Integer maxSpeakerLabels) {
        setMaxSpeakerLabels(maxSpeakerLabels);
        return this;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription
     * output of each channel into a single transcription.
     * </p>
     * <p>
     * Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the
     * start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also
     * come with confidence scores provided by Amazon Transcribe Medical.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>
     * </p>
     * 
     * @param channelIdentification
     *        Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the
     *        transcription output of each channel into a single transcription.</p>
     *        <p>
     *        Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel,
     *        including the start time and end time of the item and alternative transcriptions of item. The alternative
     *        transcriptions also come with confidence scores provided by Amazon Transcribe Medical.
     *        </p>
     *        <p>
     *        You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>
     */

    public void setChannelIdentification(Boolean channelIdentification) {
        this.channelIdentification = channelIdentification;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription
     * output of each channel into a single transcription.
     * </p>
     * <p>
     * Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the
     * start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also
     * come with confidence scores provided by Amazon Transcribe Medical.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>
     * </p>
     * 
     * @return Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the
     *         transcription output of each channel into a single transcription.</p>
     *         <p>
     *         Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel,
     *         including the start time and end time of the item and alternative transcriptions of item. The alternative
     *         transcriptions also come with confidence scores provided by Amazon Transcribe Medical.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *         request. If you set both, your request returns a <code>BadRequestException</code>
     */

    public Boolean getChannelIdentification() {
        return this.channelIdentification;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription
     * output of each channel into a single transcription.
     * </p>
     * <p>
     * Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the
     * start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also
     * come with confidence scores provided by Amazon Transcribe Medical.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>
     * </p>
     * 
     * @param channelIdentification
     *        Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the
     *        transcription output of each channel into a single transcription.</p>
     *        <p>
     *        Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel,
     *        including the start time and end time of the item and alternative transcriptions of item. The alternative
     *        transcriptions also come with confidence scores provided by Amazon Transcribe Medical.
     *        </p>
     *        <p>
     *        You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withChannelIdentification(Boolean channelIdentification) {
        setChannelIdentification(channelIdentification);
        return this;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the transcription
     * output of each channel into a single transcription.
     * </p>
     * <p>
     * Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel, including the
     * start time and end time of the item and alternative transcriptions of item. The alternative transcriptions also
     * come with confidence scores provided by Amazon Transcribe Medical.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same request. If
     * you set both, your request returns a <code>BadRequestException</code>
     * </p>
     * 
     * @return Instructs Amazon Transcribe Medical to process each audio channel separately and then merge the
     *         transcription output of each channel into a single transcription.</p>
     *         <p>
     *         Amazon Transcribe Medical also produces a transcription of each item detected on an audio channel,
     *         including the start time and end time of the item and alternative transcriptions of item. The alternative
     *         transcriptions also come with confidence scores provided by Amazon Transcribe Medical.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and <code>ChannelIdentification</code> in the same
     *         request. If you set both, your request returns a <code>BadRequestException</code>
     */

    public Boolean isChannelIdentification() {
        return this.channelIdentification;
    }

    /**
     * <p>
     * Determines whether alternative transcripts are generated along with the transcript that has the highest
     * confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number of
     * alternatives to return in the <code>MaxAlternatives</code> field.
     * </p>
     * 
     * @param showAlternatives
     *        Determines whether alternative transcripts are generated along with the transcript that has the highest
     *        confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number
     *        of alternatives to return in the <code>MaxAlternatives</code> field.
     */

    public void setShowAlternatives(Boolean showAlternatives) {
        this.showAlternatives = showAlternatives;
    }

    /**
     * <p>
     * Determines whether alternative transcripts are generated along with the transcript that has the highest
     * confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number of
     * alternatives to return in the <code>MaxAlternatives</code> field.
     * </p>
     * 
     * @return Determines whether alternative transcripts are generated along with the transcript that has the highest
     *         confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number
     *         of alternatives to return in the <code>MaxAlternatives</code> field.
     */

    public Boolean getShowAlternatives() {
        return this.showAlternatives;
    }

    /**
     * <p>
     * Determines whether alternative transcripts are generated along with the transcript that has the highest
     * confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number of
     * alternatives to return in the <code>MaxAlternatives</code> field.
     * </p>
     * 
     * @param showAlternatives
     *        Determines whether alternative transcripts are generated along with the transcript that has the highest
     *        confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number
     *        of alternatives to return in the <code>MaxAlternatives</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withShowAlternatives(Boolean showAlternatives) {
        setShowAlternatives(showAlternatives);
        return this;
    }

    /**
     * <p>
     * Determines whether alternative transcripts are generated along with the transcript that has the highest
     * confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number of
     * alternatives to return in the <code>MaxAlternatives</code> field.
     * </p>
     * 
     * @return Determines whether alternative transcripts are generated along with the transcript that has the highest
     *         confidence. If you set <code>ShowAlternatives</code> field to true, you must also set the maximum number
     *         of alternatives to return in the <code>MaxAlternatives</code> field.
     */

    public Boolean isShowAlternatives() {
        return this.showAlternatives;
    }

    /**
     * <p>
     * The maximum number of alternatives that you tell the service to return. If you specify the
     * <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     * </p>
     * 
     * @param maxAlternatives
     *        The maximum number of alternatives that you tell the service to return. If you specify the
     *        <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     */

    public void setMaxAlternatives(Integer maxAlternatives) {
        this.maxAlternatives = maxAlternatives;
    }

    /**
     * <p>
     * The maximum number of alternatives that you tell the service to return. If you specify the
     * <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     * </p>
     * 
     * @return The maximum number of alternatives that you tell the service to return. If you specify the
     *         <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     */

    public Integer getMaxAlternatives() {
        return this.maxAlternatives;
    }

    /**
     * <p>
     * The maximum number of alternatives that you tell the service to return. If you specify the
     * <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     * </p>
     * 
     * @param maxAlternatives
     *        The maximum number of alternatives that you tell the service to return. If you specify the
     *        <code>MaxAlternatives</code> field, you must set the <code>ShowAlternatives</code> field to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withMaxAlternatives(Integer maxAlternatives) {
        setMaxAlternatives(maxAlternatives);
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing a medical transcription job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to use when processing a medical transcription job.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing a medical transcription job.
     * </p>
     * 
     * @return The name of the vocabulary to use when processing a medical transcription job.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing a medical transcription job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to use when processing a medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionSetting withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
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
        if (getShowSpeakerLabels() != null)
            sb.append("ShowSpeakerLabels: ").append(getShowSpeakerLabels()).append(",");
        if (getMaxSpeakerLabels() != null)
            sb.append("MaxSpeakerLabels: ").append(getMaxSpeakerLabels()).append(",");
        if (getChannelIdentification() != null)
            sb.append("ChannelIdentification: ").append(getChannelIdentification()).append(",");
        if (getShowAlternatives() != null)
            sb.append("ShowAlternatives: ").append(getShowAlternatives()).append(",");
        if (getMaxAlternatives() != null)
            sb.append("MaxAlternatives: ").append(getMaxAlternatives()).append(",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalTranscriptionSetting == false)
            return false;
        MedicalTranscriptionSetting other = (MedicalTranscriptionSetting) obj;
        if (other.getShowSpeakerLabels() == null ^ this.getShowSpeakerLabels() == null)
            return false;
        if (other.getShowSpeakerLabels() != null && other.getShowSpeakerLabels().equals(this.getShowSpeakerLabels()) == false)
            return false;
        if (other.getMaxSpeakerLabels() == null ^ this.getMaxSpeakerLabels() == null)
            return false;
        if (other.getMaxSpeakerLabels() != null && other.getMaxSpeakerLabels().equals(this.getMaxSpeakerLabels()) == false)
            return false;
        if (other.getChannelIdentification() == null ^ this.getChannelIdentification() == null)
            return false;
        if (other.getChannelIdentification() != null && other.getChannelIdentification().equals(this.getChannelIdentification()) == false)
            return false;
        if (other.getShowAlternatives() == null ^ this.getShowAlternatives() == null)
            return false;
        if (other.getShowAlternatives() != null && other.getShowAlternatives().equals(this.getShowAlternatives()) == false)
            return false;
        if (other.getMaxAlternatives() == null ^ this.getMaxAlternatives() == null)
            return false;
        if (other.getMaxAlternatives() != null && other.getMaxAlternatives().equals(this.getMaxAlternatives()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShowSpeakerLabels() == null) ? 0 : getShowSpeakerLabels().hashCode());
        hashCode = prime * hashCode + ((getMaxSpeakerLabels() == null) ? 0 : getMaxSpeakerLabels().hashCode());
        hashCode = prime * hashCode + ((getChannelIdentification() == null) ? 0 : getChannelIdentification().hashCode());
        hashCode = prime * hashCode + ((getShowAlternatives() == null) ? 0 : getShowAlternatives().hashCode());
        hashCode = prime * hashCode + ((getMaxAlternatives() == null) ? 0 : getMaxAlternatives().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        return hashCode;
    }

    @Override
    public MedicalTranscriptionSetting clone() {
        try {
            return (MedicalTranscriptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalTranscriptionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
