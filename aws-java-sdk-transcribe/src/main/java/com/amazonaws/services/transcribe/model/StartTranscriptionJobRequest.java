/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must
     * also be unique within an AWS account.
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
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     * bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to put
     * files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in
     * your S3 bucket. You can't specify your own encryption key.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a shareable URL
     * that provides secure access to your transcription, and returns it in the <code>TranscriptFileUri</code> field.
     * Use this URL to download the transcription.
     * </p>
     */
    private String outputBucketName;
    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a transcription job.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must
     * also be unique within an AWS account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The
     *        name must also be unique within an AWS account.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must
     * also be unique within an AWS account.
     * </p>
     * 
     * @return The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The
     *         name must also be unique within an AWS account.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must
     * also be unique within an AWS account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The
     *        name must also be unique within an AWS account.
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
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     * bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to put
     * files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in
     * your S3 bucket. You can't specify your own encryption key.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a shareable URL
     * that provides secure access to your transcription, and returns it in the <code>TranscriptFileUri</code> field.
     * Use this URL to download the transcription.
     * </p>
     * 
     * @param outputBucketName
     *        The location where the transcription is stored.</p>
     *        <p>
     *        If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     *        bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to
     *        put files in the bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed
     *        in your S3 bucket. You can't specify your own encryption key.
     *        </p>
     *        <p>
     *        If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a
     *        shareable URL that provides secure access to your transcription, and returns it in the
     *        <code>TranscriptFileUri</code> field. Use this URL to download the transcription.
     */

    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     * bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to put
     * files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in
     * your S3 bucket. You can't specify your own encryption key.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a shareable URL
     * that provides secure access to your transcription, and returns it in the <code>TranscriptFileUri</code> field.
     * Use this URL to download the transcription.
     * </p>
     * 
     * @return The location where the transcription is stored.</p>
     *         <p>
     *         If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified
     *         S3 bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in
     *         the <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon
     *         Transcribe to put files in the bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     *         <p>
     *         Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are
     *         placed in your S3 bucket. You can't specify your own encryption key.
     *         </p>
     *         <p>
     *         If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a
     *         shareable URL that provides secure access to your transcription, and returns it in the
     *         <code>TranscriptFileUri</code> field. Use this URL to download the transcription.
     */

    public String getOutputBucketName() {
        return this.outputBucketName;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     * bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to put
     * files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in
     * your S3 bucket. You can't specify your own encryption key.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a shareable URL
     * that provides secure access to your transcription, and returns it in the <code>TranscriptFileUri</code> field.
     * Use this URL to download the transcription.
     * </p>
     * 
     * @param outputBucketName
     *        The location where the transcription is stored.</p>
     *        <p>
     *        If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcription in the specified S3
     *        bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe to
     *        put files in the bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/access-control-managing-permissions.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed
     *        in your S3 bucket. You can't specify your own encryption key.
     *        </p>
     *        <p>
     *        If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a
     *        shareable URL that provides secure access to your transcription, and returns it in the
     *        <code>TranscriptFileUri</code> field. Use this URL to download the transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        setOutputBucketName(outputBucketName);
        return this;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a transcription job.
     * </p>
     * 
     * @param settings
     *        A <code>Settings</code> object that provides optional settings for a transcription job.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a transcription job.
     * </p>
     * 
     * @return A <code>Settings</code> object that provides optional settings for a transcription job.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a transcription job.
     * </p>
     * 
     * @param settings
     *        A <code>Settings</code> object that provides optional settings for a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withSettings(Settings settings) {
        setSettings(settings);
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: ").append(getTranscriptionJobName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: ").append(getMediaSampleRateHertz()).append(",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: ").append(getMediaFormat()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getOutputBucketName() != null)
            sb.append("OutputBucketName: ").append(getOutputBucketName()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
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
        if (other.getOutputBucketName() == null ^ this.getOutputBucketName() == null)
            return false;
        if (other.getOutputBucketName() != null && other.getOutputBucketName().equals(this.getOutputBucketName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
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
        hashCode = prime * hashCode + ((getOutputBucketName() == null) ? 0 : getOutputBucketName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public StartTranscriptionJobRequest clone() {
        return (StartTranscriptionJobRequest) super.clone();
    }

}
