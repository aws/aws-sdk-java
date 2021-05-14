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
     * The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the job
     * name. The name must also be unique within an AWS account. If you try to create a transcription job with the same
     * name as a previous transcription job, you get a <code>ConflictException</code> error.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a sample rate
     * of 16000 Hz or higher.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the
     * sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample rate.
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
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3 bucket.
     * When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     * transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
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
     * You can specify a location in an Amazon S3 bucket to store the output of your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon
     * S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example,
     * specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as
     * "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key,
     * the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and
     * the file name, for example "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code> parameter.
     * </p>
     */
    private String outputKey;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the
     * transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     */
    private String outputEncryptionKMSKeyId;
    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a transcription job.
     * </p>
     */
    private Settings settings;
    /**
     * <p>
     * Choose the custom language model you use for your transcription job in this parameter.
     * </p>
     */
    private ModelSettings modelSettings;
    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this field to indicate that the job can be
     * queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately
     * run the job.
     * </p>
     */
    private JobExecutionSettings jobExecutionSettings;
    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     */
    private ContentRedaction contentRedaction;
    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language identification. Automatic language
     * identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     */
    private Boolean identifyLanguage;
    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the job
     * name. The name must also be unique within an AWS account. If you try to create a transcription job with the same
     * name as a previous transcription job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the
     *        job name. The name must also be unique within an AWS account. If you try to create a transcription job
     *        with the same name as a previous transcription job, you get a <code>ConflictException</code> error.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the job
     * name. The name must also be unique within an AWS account. If you try to create a transcription job with the same
     * name as a previous transcription job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @return The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the
     *         job name. The name must also be unique within an AWS account. If you try to create a transcription job
     *         with the same name as a previous transcription job, you get a <code>ConflictException</code> error.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the job
     * name. The name must also be unique within an AWS account. If you try to create a transcription job with the same
     * name as a previous transcription job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the job. You can't use the strings "<code>.</code>" or "<code>..</code>" by themselves as the
     *        job name. The name must also be unique within an AWS account. If you try to create a transcription job
     *        with the same name as a previous transcription job, you get a <code>ConflictException</code> error.
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
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a sample rate
     * of 16000 Hz or higher.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.</p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a
     *        sample rate of 16000 Hz or higher.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a sample rate
     * of 16000 Hz or higher.
     * </p>
     * 
     * @return The language code for the language used in the input media file.</p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a
     *         sample rate of 16000 Hz or higher.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a sample rate
     * of 16000 Hz or higher.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.</p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a
     *        sample rate of 16000 Hz or higher.
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
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a sample rate
     * of 16000 Hz or higher.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language used in the input media file.</p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (ar-SA), your audio or video file must be encoded at a
     *        sample rate of 16000 Hz or higher.
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
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the
     * sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file. </p>
     *        <p>
     *        If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify
     *        the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should
     *        leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample
     *        rate.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the
     * sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the audio track in the input media file. </p>
     *         <p>
     *         If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify
     *         the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should
     *         leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample
     *         rate.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the
     * sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file. </p>
     *        <p>
     *        If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify
     *        the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should
     *        leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe determine the sample
     *        rate.
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
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3 bucket.
     * When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     * transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
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
     *        If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3
     *        bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     *        <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     *        transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket
     *        must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *        the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *        uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3
     *        bucket.
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
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3 bucket.
     * When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     * transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe generates a pre-signed URL, a shareable URL
     * that provides secure access to your transcription, and returns it in the <code>TranscriptFileUri</code> field.
     * Use this URL to download the transcription.
     * </p>
     * 
     * @return The location where the transcription is stored.</p>
     *         <p>
     *         If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3
     *         bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in
     *         the <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript
     *         appears in <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output
     *         an unredacted transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>.
     *         The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     *         <p>
     *         You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *         the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *         uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3
     *         bucket.
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
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3 bucket.
     * When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     * <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     * transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
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
     *        If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the transcript in the specified S3
     *        bucket. When you call the <a>GetTranscriptionJob</a> operation, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. If you enable content redaction, the redacted transcript appears in
     *        <code>RedactedTranscriptFileUri</code>. If you enable content redaction and choose to output an unredacted
     *        transcript, that transcript's location still appears in the <code>TranscriptFileUri</code>. The S3 bucket
     *        must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *        the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *        uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3
     *        bucket.
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
     * You can specify a location in an Amazon S3 bucket to store the output of your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon
     * S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example,
     * specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as
     * "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key,
     * the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and
     * the file name, for example "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputKey
     *        You can specify a location in an Amazon S3 bucket to store the output of your transcription job.</p>
     *        <p>
     *        If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the
     *        Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     *        </p>
     *        <p>
     *        You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For
     *        example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output
     *        being stored as "folder1/folder2/your-transcription-job-name.json". If you specify
     *        "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You can
     *        use an output key to change both the prefix and the file name, for example
     *        "folder/my-other-job-name.json".
     *        </p>
     *        <p>
     *        If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code>
     *        parameter.
     */

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon
     * S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example,
     * specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as
     * "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key,
     * the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and
     * the file name, for example "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @return You can specify a location in an Amazon S3 bucket to store the output of your transcription job.</p>
     *         <p>
     *         If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the
     *         Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     *         </p>
     *         <p>
     *         You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For
     *         example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output
     *         being stored as "folder1/folder2/your-transcription-job-name.json". If you specify
     *         "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You
     *         can use an output key to change both the prefix and the file name, for example
     *         "folder/my-other-job-name.json".
     *         </p>
     *         <p>
     *         If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code>
     *         parameter.
     */

    public String getOutputKey() {
        return this.outputKey;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon
     * S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example,
     * specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as
     * "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key,
     * the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and
     * the file name, for example "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputKey
     *        You can specify a location in an Amazon S3 bucket to store the output of your transcription job.</p>
     *        <p>
     *        If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the
     *        Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
     *        </p>
     *        <p>
     *        You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For
     *        example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output
     *        being stored as "folder1/folder2/your-transcription-job-name.json". If you specify
     *        "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You can
     *        use an output key to change both the prefix and the file name, for example
     *        "folder/my-other-job-name.json".
     *        </p>
     *        <p>
     *        If you specify an output key, you must also specify an S3 bucket in the <code>OutputBucketName</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the
     * transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *        the transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have
     *        permission to use the specified KMS key.</p>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: "alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account or another account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify an encryption key, the output of the transcription job is encrypted with the default
     *        Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *        <code>OutputBucketName</code> parameter.
     */

    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the
     * transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *         the transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have
     *         permission to use the specified KMS key.</p>
     *         <p>
     *         You can use either of the following to identify a KMS key in the current account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS Key Alias: "alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can use either of the following to identify a KMS key in the current account or another account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify an encryption key, the output of the transcription job is encrypted with the default
     *         Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *         <code>OutputBucketName</code> parameter.
     */

    public String getOutputEncryptionKMSKeyId() {
        return this.outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the
     * transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *        the transcription job. The user calling the <code>StartTranscriptionJob</code> operation must have
     *        permission to use the specified KMS key.</p>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: "alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account or another account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify an encryption key, the output of the transcription job is encrypted with the default
     *        Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *        <code>OutputBucketName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
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
     * <p>
     * Choose the custom language model you use for your transcription job in this parameter.
     * </p>
     * 
     * @param modelSettings
     *        Choose the custom language model you use for your transcription job in this parameter.
     */

    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in this parameter.
     * </p>
     * 
     * @return Choose the custom language model you use for your transcription job in this parameter.
     */

    public ModelSettings getModelSettings() {
        return this.modelSettings;
    }

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in this parameter.
     * </p>
     * 
     * @param modelSettings
     *        Choose the custom language model you use for your transcription job in this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withModelSettings(ModelSettings modelSettings) {
        setModelSettings(modelSettings);
        return this;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this field to indicate that the job can be
     * queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately
     * run the job.
     * </p>
     * 
     * @param jobExecutionSettings
     *        Provides information about how a transcription job is executed. Use this field to indicate that the job
     *        can be queued for deferred execution if the concurrency limit is reached and there are no slots available
     *        to immediately run the job.
     */

    public void setJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this field to indicate that the job can be
     * queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately
     * run the job.
     * </p>
     * 
     * @return Provides information about how a transcription job is executed. Use this field to indicate that the job
     *         can be queued for deferred execution if the concurrency limit is reached and there are no slots available
     *         to immediately run the job.
     */

    public JobExecutionSettings getJobExecutionSettings() {
        return this.jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this field to indicate that the job can be
     * queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately
     * run the job.
     * </p>
     * 
     * @param jobExecutionSettings
     *        Provides information about how a transcription job is executed. Use this field to indicate that the job
     *        can be queued for deferred execution if the concurrency limit is reached and there are no slots available
     *        to immediately run the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        setJobExecutionSettings(jobExecutionSettings);
        return this;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     * 
     * @param contentRedaction
     *        An object that contains the request parameters for content redaction.
     */

    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     * 
     * @return An object that contains the request parameters for content redaction.
     */

    public ContentRedaction getContentRedaction() {
        return this.contentRedaction;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     * 
     * @param contentRedaction
     *        An object that contains the request parameters for content redaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withContentRedaction(ContentRedaction contentRedaction) {
        setContentRedaction(contentRedaction);
        return this;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language identification. Automatic language
     * identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     * 
     * @param identifyLanguage
     *        Set this field to <code>true</code> to enable automatic language identification. Automatic language
     *        identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a
     *        value for a <code>LanguageCode</code>.
     */

    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language identification. Automatic language
     * identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     * 
     * @return Set this field to <code>true</code> to enable automatic language identification. Automatic language
     *         identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter
     *         a value for a <code>LanguageCode</code>.
     */

    public Boolean getIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language identification. Automatic language
     * identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     * 
     * @param identifyLanguage
     *        Set this field to <code>true</code> to enable automatic language identification. Automatic language
     *        identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a
     *        value for a <code>LanguageCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withIdentifyLanguage(Boolean identifyLanguage) {
        setIdentifyLanguage(identifyLanguage);
        return this;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language identification. Automatic language
     * identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     * 
     * @return Set this field to <code>true</code> to enable automatic language identification. Automatic language
     *         identification is disabled by default. You receive a <code>BadRequestException</code> error if you enter
     *         a value for a <code>LanguageCode</code>.
     */

    public Boolean isIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     * 
     * @return An object containing a list of languages that might be present in your collection of audio files.
     *         Automatic language identification chooses a language that best matches the source audio from that list.
     * @see LanguageCode
     */

    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     * 
     * @param languageOptions
     *        An object containing a list of languages that might be present in your collection of audio files.
     *        Automatic language identification chooses a language that best matches the source audio from that list.
     * @see LanguageCode
     */

    public void setLanguageOptions(java.util.Collection<String> languageOptions) {
        if (languageOptions == null) {
            this.languageOptions = null;
            return;
        }

        this.languageOptions = new java.util.ArrayList<String>(languageOptions);
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguageOptions(java.util.Collection)} or {@link #withLanguageOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param languageOptions
     *        An object containing a list of languages that might be present in your collection of audio files.
     *        Automatic language identification chooses a language that best matches the source audio from that list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageOptions(String... languageOptions) {
        if (this.languageOptions == null) {
            setLanguageOptions(new java.util.ArrayList<String>(languageOptions.length));
        }
        for (String ele : languageOptions) {
            this.languageOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     * 
     * @param languageOptions
     *        An object containing a list of languages that might be present in your collection of audio files.
     *        Automatic language identification chooses a language that best matches the source audio from that list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageOptions(java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your collection of audio files. Automatic
     * language identification chooses a language that best matches the source audio from that list.
     * </p>
     * 
     * @param languageOptions
     *        An object containing a list of languages that might be present in your collection of audio files.
     *        Automatic language identification chooses a language that best matches the source audio from that list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageOptions(LanguageCode... languageOptions) {
        java.util.ArrayList<String> languageOptionsCopy = new java.util.ArrayList<String>(languageOptions.length);
        for (LanguageCode value : languageOptions) {
            languageOptionsCopy.add(value.toString());
        }
        if (getLanguageOptions() == null) {
            setLanguageOptions(languageOptionsCopy);
        } else {
            getLanguageOptions().addAll(languageOptionsCopy);
        }
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
        if (getOutputKey() != null)
            sb.append("OutputKey: ").append(getOutputKey()).append(",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: ").append(getOutputEncryptionKMSKeyId()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: ").append(getModelSettings()).append(",");
        if (getJobExecutionSettings() != null)
            sb.append("JobExecutionSettings: ").append(getJobExecutionSettings()).append(",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: ").append(getContentRedaction()).append(",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: ").append(getIdentifyLanguage()).append(",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: ").append(getLanguageOptions());
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
        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null && other.getModelSettings().equals(this.getModelSettings()) == false)
            return false;
        if (other.getJobExecutionSettings() == null ^ this.getJobExecutionSettings() == null)
            return false;
        if (other.getJobExecutionSettings() != null && other.getJobExecutionSettings().equals(this.getJobExecutionSettings()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
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
        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionSettings() == null) ? 0 : getJobExecutionSettings().hashCode());
        hashCode = prime * hashCode + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        return hashCode;
    }

    @Override
    public StartTranscriptionJobRequest clone() {
        return (StartTranscriptionJobRequest) super.clone();
    }

}
