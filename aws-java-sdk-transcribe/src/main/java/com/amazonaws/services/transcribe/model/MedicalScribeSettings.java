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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Makes it possible to control how your Medical Scribe job is processed using a <code>MedicalScribeSettings</code>
 * object. Specify <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are set. Enabled
 * <code>ShowSpeakerLabels</code> if <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not set.
 * One and only one of <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
 * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use <code>Settings</code> to
 * specify a vocabulary or vocabulary filter or both using <code>VocabularyName</code>,
 * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must be specified if
 * <code>VocabularyFilterName</code> is set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalScribeSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalScribeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * If you enable <code>ShowSpeakerLabels</code> in your request, you must also include <code>MaxSpeakerLabels</code>
     * .
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>.
     * </p>
     */
    private Boolean showSpeakerLabels;
    /**
     * <p>
     * Specify the maximum number of speakers you want to partition in your media.
     * </p>
     * <p>
     * Note that if your media contains more speakers than the specified number, multiple speakers are treated as a
     * single speaker.
     * </p>
     * <p>
     * If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to
     * true.
     * </p>
     */
    private Integer maxSpeakerLabels;
    /**
     * <p>
     * Enables channel identification in multi-channel audio.
     * </p>
     * <p>
     * Channel identification transcribes the audio on each channel independently, then appends the output for each
     * channel into one transcript.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing
     * multi-channel audio</a>.
     * </p>
     */
    private Boolean channelIdentification;
    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary names are
     * case sensitive.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     * <code>VocabularyFilterMethod</code>.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     */
    private String vocabularyFilterMethod;

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * If you enable <code>ShowSpeakerLabels</code> in your request, you must also include <code>MaxSpeakerLabels</code>
     * .
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the
     *        speech from individual speakers in your media file.</p>
     *        <p>
     *        If you enable <code>ShowSpeakerLabels</code> in your request, you must also include
     *        <code>MaxSpeakerLabels</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *        (diarization)</a>.
     */

    public void setShowSpeakerLabels(Boolean showSpeakerLabels) {
        this.showSpeakerLabels = showSpeakerLabels;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * If you enable <code>ShowSpeakerLabels</code> in your request, you must also include <code>MaxSpeakerLabels</code>
     * .
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>.
     * </p>
     * 
     * @return Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the
     *         speech from individual speakers in your media file.</p>
     *         <p>
     *         If you enable <code>ShowSpeakerLabels</code> in your request, you must also include
     *         <code>MaxSpeakerLabels</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *         (diarization)</a>.
     */

    public Boolean getShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * If you enable <code>ShowSpeakerLabels</code> in your request, you must also include <code>MaxSpeakerLabels</code>
     * .
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>.
     * </p>
     * 
     * @param showSpeakerLabels
     *        Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the
     *        speech from individual speakers in your media file.</p>
     *        <p>
     *        If you enable <code>ShowSpeakerLabels</code> in your request, you must also include
     *        <code>MaxSpeakerLabels</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *        (diarization)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeSettings withShowSpeakerLabels(Boolean showSpeakerLabels) {
        setShowSpeakerLabels(showSpeakerLabels);
        return this;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * If you enable <code>ShowSpeakerLabels</code> in your request, you must also include <code>MaxSpeakerLabels</code>
     * .
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>.
     * </p>
     * 
     * @return Enables speaker partitioning (diarization) in your Medical Scribe output. Speaker partitioning labels the
     *         speech from individual speakers in your media file.</p>
     *         <p>
     *         If you enable <code>ShowSpeakerLabels</code> in your request, you must also include
     *         <code>MaxSpeakerLabels</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *         (diarization)</a>.
     */

    public Boolean isShowSpeakerLabels() {
        return this.showSpeakerLabels;
    }

    /**
     * <p>
     * Specify the maximum number of speakers you want to partition in your media.
     * </p>
     * <p>
     * Note that if your media contains more speakers than the specified number, multiple speakers are treated as a
     * single speaker.
     * </p>
     * <p>
     * If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to
     * true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        Specify the maximum number of speakers you want to partition in your media.</p>
     *        <p>
     *        Note that if your media contains more speakers than the specified number, multiple speakers are treated as
     *        a single speaker.
     *        </p>
     *        <p>
     *        If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code>
     *        field to true.
     */

    public void setMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
    }

    /**
     * <p>
     * Specify the maximum number of speakers you want to partition in your media.
     * </p>
     * <p>
     * Note that if your media contains more speakers than the specified number, multiple speakers are treated as a
     * single speaker.
     * </p>
     * <p>
     * If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to
     * true.
     * </p>
     * 
     * @return Specify the maximum number of speakers you want to partition in your media.</p>
     *         <p>
     *         Note that if your media contains more speakers than the specified number, multiple speakers are treated
     *         as a single speaker.
     *         </p>
     *         <p>
     *         If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code>
     *         field to true.
     */

    public Integer getMaxSpeakerLabels() {
        return this.maxSpeakerLabels;
    }

    /**
     * <p>
     * Specify the maximum number of speakers you want to partition in your media.
     * </p>
     * <p>
     * Note that if your media contains more speakers than the specified number, multiple speakers are treated as a
     * single speaker.
     * </p>
     * <p>
     * If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code> field to
     * true.
     * </p>
     * 
     * @param maxSpeakerLabels
     *        Specify the maximum number of speakers you want to partition in your media.</p>
     *        <p>
     *        Note that if your media contains more speakers than the specified number, multiple speakers are treated as
     *        a single speaker.
     *        </p>
     *        <p>
     *        If you specify the <code>MaxSpeakerLabels</code> field, you must set the <code>ShowSpeakerLabels</code>
     *        field to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeSettings withMaxSpeakerLabels(Integer maxSpeakerLabels) {
        setMaxSpeakerLabels(maxSpeakerLabels);
        return this;
    }

    /**
     * <p>
     * Enables channel identification in multi-channel audio.
     * </p>
     * <p>
     * Channel identification transcribes the audio on each channel independently, then appends the output for each
     * channel into one transcript.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing
     * multi-channel audio</a>.
     * </p>
     * 
     * @param channelIdentification
     *        Enables channel identification in multi-channel audio.</p>
     *        <p>
     *        Channel identification transcribes the audio on each channel independently, then appends the output for
     *        each channel into one transcript.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing multi-channel
     *        audio</a>.
     */

    public void setChannelIdentification(Boolean channelIdentification) {
        this.channelIdentification = channelIdentification;
    }

    /**
     * <p>
     * Enables channel identification in multi-channel audio.
     * </p>
     * <p>
     * Channel identification transcribes the audio on each channel independently, then appends the output for each
     * channel into one transcript.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing
     * multi-channel audio</a>.
     * </p>
     * 
     * @return Enables channel identification in multi-channel audio.</p>
     *         <p>
     *         Channel identification transcribes the audio on each channel independently, then appends the output for
     *         each channel into one transcript.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing multi-channel
     *         audio</a>.
     */

    public Boolean getChannelIdentification() {
        return this.channelIdentification;
    }

    /**
     * <p>
     * Enables channel identification in multi-channel audio.
     * </p>
     * <p>
     * Channel identification transcribes the audio on each channel independently, then appends the output for each
     * channel into one transcript.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing
     * multi-channel audio</a>.
     * </p>
     * 
     * @param channelIdentification
     *        Enables channel identification in multi-channel audio.</p>
     *        <p>
     *        Channel identification transcribes the audio on each channel independently, then appends the output for
     *        each channel into one transcript.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing multi-channel
     *        audio</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeSettings withChannelIdentification(Boolean channelIdentification) {
        setChannelIdentification(channelIdentification);
        return this;
    }

    /**
     * <p>
     * Enables channel identification in multi-channel audio.
     * </p>
     * <p>
     * Channel identification transcribes the audio on each channel independently, then appends the output for each
     * channel into one transcript.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing
     * multi-channel audio</a>.
     * </p>
     * 
     * @return Enables channel identification in multi-channel audio.</p>
     *         <p>
     *         Channel identification transcribes the audio on each channel independently, then appends the output for
     *         each channel into one transcript.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/channel-id.html">Transcribing multi-channel
     *         audio</a>.
     */

    public Boolean isChannelIdentification() {
        return this.channelIdentification;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary names are
     * case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary
     *        names are case sensitive.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary names are
     * case sensitive.
     * </p>
     * 
     * @return The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary
     *         names are case sensitive.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary names are
     * case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary you want to include in your Medical Scribe request. Custom vocabulary
     *        names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     * <code>VocabularyFilterMethod</code>.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom
     *        vocabulary filter names are case sensitive.</p>
     *        <p>
     *        Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     *        <code>VocabularyFilterMethod</code>.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     * <code>VocabularyFilterMethod</code>.
     * </p>
     * 
     * @return The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom
     *         vocabulary filter names are case sensitive.</p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     *         <code>VocabularyFilterMethod</code>.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     * <code>VocabularyFilterMethod</code>.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the custom vocabulary filter you want to include in your Medical Scribe request. Custom
     *        vocabulary filter names are case sensitive.</p>
     *        <p>
     *        Note that if you include <code>VocabularyFilterName</code> in your request, you must also include
     *        <code>VocabularyFilterMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeSettings withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specify how you want your custom vocabulary filter applied to your transcript.</p>
     *        <p>
     *        To replace words with <code>***</code>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @see VocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @return Specify how you want your custom vocabulary filter applied to your transcript.</p>
     *         <p>
     *         To replace words with <code>***</code>, choose <code>mask</code>.
     *         </p>
     *         <p>
     *         To delete words, choose <code>remove</code>.
     *         </p>
     *         <p>
     *         To flag words without changing them, choose <code>tag</code>.
     * @see VocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specify how you want your custom vocabulary filter applied to your transcript.</p>
     *        <p>
     *        To replace words with <code>***</code>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public MedicalScribeSettings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specify how you want your custom vocabulary filter applied to your transcript.</p>
     *        <p>
     *        To replace words with <code>***</code>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public MedicalScribeSettings withVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: ").append(getVocabularyFilterMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalScribeSettings == false)
            return false;
        MedicalScribeSettings other = (MedicalScribeSettings) obj;
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
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
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
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod().hashCode());
        return hashCode;
    }

    @Override
    public MedicalScribeSettings clone() {
        try {
            return (MedicalScribeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalScribeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
