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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMedicalTranscriptionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>" by
     * themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical
     * transcription job with the same name as a previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     */
    private String medicalTranscriptionJobName;
    /**
     * <p>
     * The language code for the language spoken in the input media file. US English (en-US) is the valid value for
     * medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     */
    private String mediaFormat;

    private Media media;
    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription results. Your
     * transcript appears in the S3 location you specify. When you call the <a>GetMedicalTranscriptionJob</a>, the
     * operation returns this location in the <code>TranscriptFileUri</code> field. The S3 bucket must have permissions
     * that allow Amazon Transcribe Medical to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses
     * the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     */
    private String outputBucketName;
    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job in the
     * Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     * transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current account:
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default
     * Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     */
    private String outputEncryptionKMSKeyId;
    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     */
    private MedicalTranscriptionSetting settings;
    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     * <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it identifies in
     * the transcription output.
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     */
    private String specialty;
    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or more
     * speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to single-speaker
     * dictated speech, e.g., for clinical notes.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>" by
     * themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical
     * transcription job with the same name as a previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>"
     *        by themselves as the job name. The name must also be unique within an AWS account. If you try to create a
     *        medical transcription job with the same name as a previous medical transcription job, you get a
     *        <code>ConflictException</code> error.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>" by
     * themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical
     * transcription job with the same name as a previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @return The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>
     *         " by themselves as the job name. The name must also be unique within an AWS account. If you try to create
     *         a medical transcription job with the same name as a previous medical transcription job, you get a
     *         <code>ConflictException</code> error.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>" by
     * themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical
     * transcription job with the same name as a previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of the medical transcription job. You can't use the strings "<code>.</code>" or "<code>..</code>"
     *        by themselves as the job name. The name must also be unique within an AWS account. If you try to create a
     *        medical transcription job with the same name as a previous medical transcription job, you get a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US English (en-US) is the valid value for
     * medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the input media file. US English (en-US) is the valid value
     *        for medical transcription jobs. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US English (en-US) is the valid value for
     * medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @return The language code for the language spoken in the input media file. US English (en-US) is the valid value
     *         for medical transcription jobs. Any other value you enter for language code results in a
     *         <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US English (en-US) is the valid value for
     * medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the input media file. US English (en-US) is the valid value
     *        for medical transcription jobs. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartMedicalTranscriptionJobRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US English (en-US) is the valid value for
     * medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the input media file. US English (en-US) is the valid value
     *        for medical transcription jobs. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartMedicalTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.</p>
     *        <p>
     *        If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *        should leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine
     *        the sample rate.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the audio track in the input media file.</p>
     *         <p>
     *         If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you
     *         specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *         should leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical
     *         determine the sample rate.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.</p>
     *        <p>
     *        If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *        should leave the <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe Medical determine
     *        the sample rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        setMediaSampleRateHertz(mediaSampleRateHertz);
        return this;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The audio format of the input media file.
     * @see MediaFormat
     */

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * 
     * @return The audio format of the input media file.
     * @see MediaFormat
     */

    public String getMediaFormat() {
        return this.mediaFormat;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The audio format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public StartMedicalTranscriptionJobRequest withMediaFormat(String mediaFormat) {
        setMediaFormat(mediaFormat);
        return this;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The audio format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public StartMedicalTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * @param media
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * @return
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * @param media
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription results. Your
     * transcript appears in the S3 location you specify. When you call the <a>GetMedicalTranscriptionJob</a>, the
     * operation returns this location in the <code>TranscriptFileUri</code> field. The S3 bucket must have permissions
     * that allow Amazon Transcribe Medical to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses
     * the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * 
     * @param outputBucketName
     *        The Amazon S3 location where the transcription is stored.</p>
     *        <p>
     *        You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription
     *        results. Your transcript appears in the S3 location you specify. When you call the
     *        <a>GetMedicalTranscriptionJob</a>, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe
     *        Medical to put files in the bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *        the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *        Medical uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your
     *        S3 bucket.
     */

    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription results. Your
     * transcript appears in the S3 location you specify. When you call the <a>GetMedicalTranscriptionJob</a>, the
     * operation returns this location in the <code>TranscriptFileUri</code> field. The S3 bucket must have permissions
     * that allow Amazon Transcribe Medical to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses
     * the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 location where the transcription is stored.</p>
     *         <p>
     *         You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription
     *         results. Your transcript appears in the S3 location you specify. When you call the
     *         <a>GetMedicalTranscriptionJob</a>, the operation returns this location in the
     *         <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe
     *         Medical to put files in the bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     *         <p>
     *         You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *         the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *         Medical uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your
     *         S3 bucket.
     */

    public String getOutputBucketName() {
        return this.outputBucketName;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription results. Your
     * transcript appears in the S3 location you specify. When you call the <a>GetMedicalTranscriptionJob</a>, the
     * operation returns this location in the <code>TranscriptFileUri</code> field. The S3 bucket must have permissions
     * that allow Amazon Transcribe Medical to put files in the bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses
     * the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * 
     * @param outputBucketName
     *        The Amazon S3 location where the transcription is stored.</p>
     *        <p>
     *        You must set <code>OutputBucketName</code> for Amazon Transcribe Medical to store the transcription
     *        results. Your transcript appears in the S3 location you specify. When you call the
     *        <a>GetMedicalTranscriptionJob</a>, the operation returns this location in the
     *        <code>TranscriptFileUri</code> field. The S3 bucket must have permissions that allow Amazon Transcribe
     *        Medical to put files in the bucket. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     *        </p>
     *        <p>
     *        You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using
     *        the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     *        Medical uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your
     *        S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        setOutputBucketName(outputBucketName);
        return this;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job in the
     * Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     *        You can specify a location in an Amazon S3 bucket to store the output of your medical transcription
     *        job.</p>
     *        <p>
     *        If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job
     *        in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     * You can specify a location in an Amazon S3 bucket to store the output of your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job in the
     * Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     * @return You can specify a location in an Amazon S3 bucket to store the output of your medical transcription
     *         job.</p>
     *         <p>
     *         If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job
     *         in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     * You can specify a location in an Amazon S3 bucket to store the output of your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job in the
     * Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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
     *        You can specify a location in an Amazon S3 bucket to store the output of your medical transcription
     *        job.</p>
     *        <p>
     *        If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job
     *        in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json".
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

    public StartMedicalTranscriptionJobRequest withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the
     * transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current account:
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default
     * Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *        the transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have
     *        permission to use the specified KMS key.</p>
     *        <p>
     *        You use either of the following to identify a KMS key in the current account:
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
     *        Amazon Resource Name (ARN) of a KMS key in the current account or another account:
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
     *        If you don't specify an encryption key, the output of the medical transcription job is encrypted with the
     *        default Amazon S3 key (SSE-S3).
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
     * transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current account:
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default
     * Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *         the transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have
     *         permission to use the specified KMS key.</p>
     *         <p>
     *         You use either of the following to identify a KMS key in the current account:
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
     *         Amazon Resource Name (ARN) of a KMS key in the current account or another account:
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
     *         If you don't specify an encryption key, the output of the medical transcription job is encrypted with the
     *         default Amazon S3 key (SSE-S3).
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
     * transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have permission to use
     * the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current account:
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default
     * Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of
     *        the transcription job. The user calling the <a>StartMedicalTranscriptionJob</a> operation must have
     *        permission to use the specified KMS key.</p>
     *        <p>
     *        You use either of the following to identify a KMS key in the current account:
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
     *        Amazon Resource Name (ARN) of a KMS key in the current account or another account:
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
     *        If you don't specify an encryption key, the output of the medical transcription job is encrypted with the
     *        default Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *        <code>OutputBucketName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
        return this;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     * 
     * @param settings
     *        Optional settings for the medical transcription job.
     */

    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     * 
     * @return Optional settings for the medical transcription job.
     */

    public MedicalTranscriptionSetting getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     * 
     * @param settings
     *        Optional settings for the medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withSettings(MedicalTranscriptionSetting settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     * <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it identifies in
     * the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     *        <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it
     *        identifies in the transcription output.
     * @see MedicalContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     * <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it identifies in
     * the transcription output.
     * </p>
     * 
     * @return You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     *         <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it
     *         identifies in the transcription output.
     * @see MedicalContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     * <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it identifies in
     * the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     *        <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it
     *        identifies in the transcription output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public StartMedicalTranscriptionJobRequest withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     * <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it identifies in
     * the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        You can configure Amazon Transcribe Medical to label content in the transcription output. If you specify
     *        <code>PHI</code>, Amazon Transcribe Medical labels the personal health information (PHI) that it
     *        identifies in the transcription output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public StartMedicalTranscriptionJobRequest withContentIdentificationType(MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of any clinician speaking in the input media.
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * 
     * @return The medical specialty of any clinician speaking in the input media.
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of any clinician speaking in the input media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public StartMedicalTranscriptionJobRequest withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of any clinician speaking in the input media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public StartMedicalTranscriptionJobRequest withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or more
     * speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to single-speaker
     * dictated speech, e.g., for clinical notes.
     * </p>
     * 
     * @param type
     *        The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or
     *        more speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to
     *        single-speaker dictated speech, e.g., for clinical notes.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or more
     * speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to single-speaker
     * dictated speech, e.g., for clinical notes.
     * </p>
     * 
     * @return The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or
     *         more speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to
     *         single-speaker dictated speech, e.g., for clinical notes.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or more
     * speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to single-speaker
     * dictated speech, e.g., for clinical notes.
     * </p>
     * 
     * @param type
     *        The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or
     *        more speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to
     *        single-speaker dictated speech, e.g., for clinical notes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public StartMedicalTranscriptionJobRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or more
     * speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to single-speaker
     * dictated speech, e.g., for clinical notes.
     * </p>
     * 
     * @param type
     *        The type of speech in the input audio. <code>CONVERSATION</code> refers to conversations between two or
     *        more speakers, e.g., a conversations between doctors and patients. <code>DICTATION</code> refers to
     *        single-speaker dictated speech, e.g., for clinical notes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public StartMedicalTranscriptionJobRequest withType(Type type) {
        this.type = type.toString();
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: ").append(getMedicalTranscriptionJobName()).append(",");
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
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: ").append(getContentIdentificationType()).append(",");
        if (getSpecialty() != null)
            sb.append("Specialty: ").append(getSpecialty()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalTranscriptionJobRequest == false)
            return false;
        StartMedicalTranscriptionJobRequest other = (StartMedicalTranscriptionJobRequest) obj;
        if (other.getMedicalTranscriptionJobName() == null ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null && other.getMedicalTranscriptionJobName().equals(this.getMedicalTranscriptionJobName()) == false)
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
        if (other.getContentIdentificationType() == null ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
            return false;
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedicalTranscriptionJobName() == null) ? 0 : getMedicalTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getOutputBucketName() == null) ? 0 : getOutputBucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public StartMedicalTranscriptionJobRequest clone() {
        return (StartMedicalTranscriptionJobRequest) super.clone();
    }

}
