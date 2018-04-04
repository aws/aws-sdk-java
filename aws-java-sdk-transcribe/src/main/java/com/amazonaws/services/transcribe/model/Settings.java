/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides optional settings for the <code>StartTranscriptionJob</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Settings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * Determines whether the transcription job should use speaker recognition to identify different speakers in the
     * input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of
     * speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     */
    private Boolean showSpeakerLabels;
    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers will be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     */
    private Integer maxSpeakerLabels;

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of a vocabulary to use when processing the transcription job.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * 
     * @return The name of a vocabulary to use when processing the transcription job.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of a vocabulary to use when processing the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * Determines whether the transcription job should use speaker recognition to identify different speakers in the
     * input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of
     * speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Determines whether the transcription job should use speaker recognition to identify different speakers in
     *        the input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the
     *        maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     */

    public void setShowSpeakerLabels(Boolean showSpeakerLabels) {
        this.showSpeakerLabels = showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job should use speaker recognition to identify different speakers in the
     * input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of
     * speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * 
     * @return Determines whether the transcription job should use speaker recognition to identify different speakers in
     *         the input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the
     *         maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     */

    public Boolean getShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job should use speaker recognition to identify different speakers in the
     * input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of
     * speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Determines whether the transcription job should use speaker recognition to identify different speakers in
     *        the input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the
     *        maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withShowSpeakerLabels(Boolean showSpeakerLabels) {
        setShowSpeakerLabels(showSpeakerLabels);
        return this;
    }

    /**
     * <p>
     * Determines whether the transcription job should use speaker recognition to identify different speakers in the
     * input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the maximum number of
     * speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * 
     * @return Determines whether the transcription job should use speaker recognition to identify different speakers in
     *         the input audio. If you set the <code>ShowSpeakerLabels</code> field to true, you must also set the
     *         maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     */

    public Boolean isShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers will be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *        than this number, multiple speakers will be identified as a single speaker. If you specify the
     *        <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     */

    public void setMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers will be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @return The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *         than this number, multiple speakers will be identified as a single speaker. If you specify the
     *         <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     */

    public Integer getMaxSpeakerLabels() {
        return this.maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this
     * number, multiple speakers will be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        The maximum number of speakers to identify in the input audio. If there are more speakers in the audio
     *        than this number, multiple speakers will be identified as a single speaker. If you specify the
     *        <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Settings withMaxSpeakerLabels(Integer maxSpeakerLabels) {
        setMaxSpeakerLabels(maxSpeakerLabels);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getShowSpeakerLabels() != null)
            sb.append("ShowSpeakerLabels: ").append(getShowSpeakerLabels()).append(",");
        if (getMaxSpeakerLabels() != null)
            sb.append("MaxSpeakerLabels: ").append(getMaxSpeakerLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Settings == false)
            return false;
        Settings other = (Settings) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getShowSpeakerLabels() == null ^ this.getShowSpeakerLabels() == null)
            return false;
        if (other.getShowSpeakerLabels() != null && other.getShowSpeakerLabels().equals(this.getShowSpeakerLabels()) == false)
            return false;
        if (other.getMaxSpeakerLabels() == null ^ this.getMaxSpeakerLabels() == null)
            return false;
        if (other.getMaxSpeakerLabels() != null && other.getMaxSpeakerLabels().equals(this.getMaxSpeakerLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getShowSpeakerLabels() == null) ? 0 : getShowSpeakerLabels().hashCode());
        hashCode = prime * hashCode + ((getMaxSpeakerLabels() == null) ? 0 : getMaxSpeakerLabels().hashCode());
        return hashCode;
    }

    @Override
    public Settings clone() {
        try {
            return (Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
