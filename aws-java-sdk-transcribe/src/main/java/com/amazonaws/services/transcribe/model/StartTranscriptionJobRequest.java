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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTranscriptionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * The format of the input media file.
     * </p>
     */
    private String mediaFormat;
    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. The name must be unique within an AWS account.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * 
     * @return The name of the job. The name must be unique within an AWS account.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an AWS account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. The name must be unique within an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withTranscriptionJobName(String transcriptionJobName) {
        setTranscriptionJobName(transcriptionJobName);
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * 
     * @return The language code for the language used in the input media file.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the audio track in the input media file.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        setMediaSampleRateHertz(mediaSampleRateHertz);
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @see MediaFormat
     */

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @return The format of the input media file.
     * @see MediaFormat
     */

    public String getMediaFormat() {
        return this.mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public StartTranscriptionJobRequest withMediaFormat(String mediaFormat) {
        setMediaFormat(mediaFormat);
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public StartTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     * 
     * @param media
     *        An object that describes the input media for a transcription job.
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     * 
     * @return An object that describes the input media for a transcription job.
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     * 
     * @param media
     *        An object that describes the input media for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withMedia(Media media) {
        setMedia(media);
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: ").append(getTranscriptionJobName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: ").append(getMediaSampleRateHertz()).append(",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: ").append(getMediaFormat()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTranscriptionJobRequest == false)
            return false;
        StartTranscriptionJobRequest other = (StartTranscriptionJobRequest) obj;
        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        return hashCode;
    }

    @Override
    public StartTranscriptionJobRequest clone() {
        return (StartTranscriptionJobRequest) super.clone();
    }

}
