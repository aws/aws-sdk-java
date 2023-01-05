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
     * A unique name, chosen by you, for your medical transcription job. The name that you specify is also used as the
     * default name of your transcription output file. If you want to specify a different name for your transcription
     * output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     */
    private String medicalTranscriptionJobName;
    /**
     * <p>
     * The language code that represents the language spoken in the input media file. US English (<code>en-US</code>) is
     * the only valid value for medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you specify the
     * sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a mismatch between the
     * value that you specify and the value detected, your job fails. Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     */
    private String mediaFormat;

    private Media media;
    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include the
     * <code>S3://</code> prefix of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     * parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     * <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     * permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management Console</a>. See
     * also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     */
    private String outputBucketName;
    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your medical transcription job (<code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     * <code>OutputKey</code>, your transcription output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output
     * path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'test-files/my-transcript.json' as
     * the <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * </p>
     */
    private String outputKey;
    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     */
    private String outputEncryptionKMSKeyId;
    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer
     * of security for your data. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     * context</a> and <a href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric
     * keys in KMS</a>.
     * </p>
     */
    private java.util.Map<String, String> kMSEncryptionContext;
    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your transcription
     * job.
     * </p>
     */
    private MedicalTranscriptionSetting settings;
    /**
     * <p>
     * Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health information (PHI)
     * in a transcription</a>.
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For batch transcriptions,
     * <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * </p>
     */
    private String specialty;
    /**
     * <p>
     * Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a conversation
     * between two people (<code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice memos;
     * <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the patient's office
     * visit.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the
     * time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The name that you specify is also used as the
     * default name of your transcription output file. If you want to specify a different name for your transcription
     * output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        A unique name, chosen by you, for your medical transcription job. The name that you specify is also used
     *        as the default name of your transcription output file. If you want to specify a different name for your
     *        transcription output, use the <code>OutputKey</code> parameter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The name that you specify is also used as the
     * default name of your transcription output file. If you want to specify a different name for your transcription
     * output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your medical transcription job. The name that you specify is also used
     *         as the default name of your transcription output file. If you want to specify a different name for your
     *         transcription output, use the <code>OutputKey</code> parameter.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The name that you specify is also used as the
     * default name of your transcription output file. If you want to specify a different name for your transcription
     * output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        A unique name, chosen by you, for your medical transcription job. The name that you specify is also used
     *        as the default name of your transcription output file. If you want to specify a different name for your
     *        transcription output, use the <code>OutputKey</code> parameter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file. US English (<code>en-US</code>) is
     * the only valid value for medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file. US English (
     *        <code>en-US</code>) is the only valid value for medical transcription jobs. Any other value you enter for
     *        language code results in a <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file. US English (<code>en-US</code>) is
     * the only valid value for medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @return The language code that represents the language spoken in the input media file. US English (
     *         <code>en-US</code>) is the only valid value for medical transcription jobs. Any other value you enter for
     *         language code results in a <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file. US English (<code>en-US</code>) is
     * the only valid value for medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file. US English (
     *        <code>en-US</code>) is the only valid value for medical transcription jobs. Any other value you enter for
     *        language code results in a <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartMedicalTranscriptionJobRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file. US English (<code>en-US</code>) is
     * the only valid value for medical transcription jobs. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file. US English (
     *        <code>en-US</code>) is the only valid value for medical transcription jobs. Any other value you enter for
     *        language code results in a <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartMedicalTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you specify the
     * sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a mismatch between the
     * value that you specify and the value detected, your job fails. Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.</p>
     *        <p>
     *        If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a
     *        mismatch between the value that you specify and the value detected, your job fails. Therefore, in most
     *        cases, it's advised to omit <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine
     *        the sample rate.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you specify the
     * sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a mismatch between the
     * value that you specify and the value detected, your job fails. Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @return The sample rate, in hertz, of the audio track in your input media file.</p>
     *         <p>
     *         If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you
     *         specify the sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a
     *         mismatch between the value that you specify and the value detected, your job fails. Therefore, in most
     *         cases, it's advised to omit <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine
     *         the sample rate.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you specify the
     * sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a mismatch between the
     * value that you specify and the value detected, your job fails. Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.</p>
     *        <p>
     *        If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a
     *        mismatch between the value that you specify and the value detected, your job fails. Therefore, in most
     *        cases, it's advised to omit <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical determine
     *        the sample rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        setMediaSampleRateHertz(mediaSampleRateHertz);
        return this;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * 
     * @param mediaFormat
     *        Specify the format of your input media file.
     * @see MediaFormat
     */

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * 
     * @return Specify the format of your input media file.
     * @see MediaFormat
     */

    public String getMediaFormat() {
        return this.mediaFormat;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * 
     * @param mediaFormat
     *        Specify the format of your input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public StartMedicalTranscriptionJobRequest withMediaFormat(String mediaFormat) {
        setMediaFormat(mediaFormat);
        return this;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * 
     * @param mediaFormat
     *        Specify the format of your input media file.
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
     * The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include the
     * <code>S3://</code> prefix of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     * parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     * <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     * permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management Console</a>. See
     * also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * 
     * @param outputBucketName
     *        The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include
     *        the <code>S3://</code> prefix of the specified bucket.</p>
     *        <p>
     *        If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     *        parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     *        </p>
     *        <p>
     *        For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *        <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored
     *        in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     *        <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     *        </p>
     *        <p>
     *        Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     *        permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     *        Console</a>. See also <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     */

    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include the
     * <code>S3://</code> prefix of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     * parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     * <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     * permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management Console</a>. See
     * also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include
     *         the <code>S3://</code> prefix of the specified bucket.</p>
     *         <p>
     *         If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     *         parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     *         </p>
     *         <p>
     *         For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *         <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored
     *         in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     *         <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     *         </p>
     *         <p>
     *         Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     *         permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     *         Console</a>. See also <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     */

    public String getOutputBucketName() {
        return this.outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include the
     * <code>S3://</code> prefix of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     * parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     * <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     * permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management Console</a>. See
     * also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * 
     * @param outputBucketName
     *        The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include
     *        the <code>S3://</code> prefix of the specified bucket.</p>
     *        <p>
     *        If you want your output to go to a sub-folder of this bucket, specify it using the <code>OutputKey</code>
     *        parameter; <code>OutputBucketName</code> only accepts the name of a bucket.
     *        </p>
     *        <p>
     *        For example, if you want your output stored in <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *        <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output stored
     *        in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set <code>OutputBucketName</code> to
     *        <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to <code>test-files/</code>.
     *        </p>
     *        <p>
     *        Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3
     *        permissions using the <a href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     *        Console</a>. See also <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *        >Permissions Required for IAM User Roles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        setOutputBucketName(outputBucketName);
        return this;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your medical transcription job (<code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     * <code>OutputKey</code>, your transcription output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output
     * path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'test-files/my-transcript.json' as
     * the <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * </p>
     * 
     * @param outputKey
     *        Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript
     *        and, optionally, a unique name for your output file. The default name for your transcription output is the
     *        same as the name you specified for your medical transcription job (
     *        <code>MedicalTranscriptionJobName</code>).</p>
     *        <p>
     *        Here are some examples of how you can use <code>OutputKey</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *        'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'my-transcript' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and
     *        'test-files/my-transcript.json' as the <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *        'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     */

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your medical transcription job (<code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     * <code>OutputKey</code>, your transcription output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output
     * path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'test-files/my-transcript.json' as
     * the <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * </p>
     * 
     * @return Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript
     *         and, optionally, a unique name for your output file. The default name for your transcription output is
     *         the same as the name you specified for your medical transcription job (
     *         <code>MedicalTranscriptionJobName</code>).</p>
     *         <p>
     *         Here are some examples of how you can use <code>OutputKey</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     *         <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *         'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'my-transcript' as the
     *         <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and
     *         'test-files/my-transcript.json' as the <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *         'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     *         <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     */

    public String getOutputKey() {
        return this.outputKey;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your medical transcription job (<code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     * <code>OutputKey</code>, your transcription output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output
     * path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'test-files/my-transcript.json' as
     * the <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     * the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * </p>
     * 
     * @param outputKey
     *        Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript
     *        and, optionally, a unique name for your output file. The default name for your transcription output is the
     *        same as the name you specified for your medical transcription job (
     *        <code>MedicalTranscriptionJobName</code>).</p>
     *        <p>
     *        Here are some examples of how you can use <code>OutputKey</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and 'my-transcript.json' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *        'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'my-transcript' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code> and
     *        'test-files/my-transcript.json' as the <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify 'my-first-transcription' as the <code>MedicalTranscriptionJobName</code>,
     *        'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     *        <code>OutputKey</code>, your transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The KMS key you want to use to encrypt your medical transcription output.</p>
     *        <p>
     *        If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *        one of four ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *        Services account, you can specify your KMS key in one of two ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *        <code>OutputLocation</code> parameter.
     *        </p>
     *        <p>
     *        Note that the user making the request must have permission to use the specified KMS key.
     */

    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @return The KMS key you want to use to encrypt your medical transcription output.</p>
     *         <p>
     *         If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *         one of four ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *         Services account, you can specify your KMS key in one of two ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key ID. For example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *         <code>OutputLocation</code> parameter.
     *         </p>
     *         <p>
     *         Note that the user making the request must have permission to use the specified KMS key.
     */

    public String getOutputEncryptionKMSKeyId() {
        return this.outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in one of
     * four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web Services
     * account, you can specify your KMS key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example, <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location using the
     * <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the user making the request must have permission to use the specified KMS key.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The KMS key you want to use to encrypt your medical transcription output.</p>
     *        <p>
     *        If using a key located in the <b>current</b> Amazon Web Services account, you can specify your KMS key in
     *        one of four ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the KMS key ID itself. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use an alias for the KMS key ID. For example, <code>alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If using a key located in a <b>different</b> Amazon Web Services account than the current Amazon Web
     *        Services account, you can specify your KMS key in one of two ways:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key ID. For example,
     *        <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use the ARN for the KMS key alias. For example,
     *        <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location using the
     *        <code>OutputLocation</code> parameter.
     *        </p>
     *        <p>
     *        Note that the user making the request must have permission to use the specified KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
        return this;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer
     * of security for your data. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     * context</a> and <a href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric
     * keys in KMS</a>.
     * </p>
     * 
     * @return A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added
     *         layer of security for your data. For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     *         context</a> and <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric keys in
     *         KMS</a>.
     */

    public java.util.Map<String, String> getKMSEncryptionContext() {
        return kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer
     * of security for your data. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     * context</a> and <a href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric
     * keys in KMS</a>.
     * </p>
     * 
     * @param kMSEncryptionContext
     *        A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added
     *        layer of security for your data. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     *        context</a> and <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric keys in
     *        KMS</a>.
     */

    public void setKMSEncryptionContext(java.util.Map<String, String> kMSEncryptionContext) {
        this.kMSEncryptionContext = kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer
     * of security for your data. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     * context</a> and <a href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric
     * keys in KMS</a>.
     * </p>
     * 
     * @param kMSEncryptionContext
     *        A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added
     *        layer of security for your data. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context">KMS encryption
     *        context</a> and <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html">Asymmetric keys in
     *        KMS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withKMSEncryptionContext(java.util.Map<String, String> kMSEncryptionContext) {
        setKMSEncryptionContext(kMSEncryptionContext);
        return this;
    }

    /**
     * Add a single KMSEncryptionContext entry
     *
     * @see StartMedicalTranscriptionJobRequest#withKMSEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest addKMSEncryptionContextEntry(String key, String value) {
        if (null == this.kMSEncryptionContext) {
            this.kMSEncryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.kMSEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.kMSEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KMSEncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest clearKMSEncryptionContextEntries() {
        this.kMSEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your transcription
     * job.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including channel identification, alternative
     *        transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your
     *        transcription job.
     */

    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your transcription
     * job.
     * </p>
     * 
     * @return Specify additional optional settings in your request, including channel identification, alternative
     *         transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your
     *         transcription job.
     */

    public MedicalTranscriptionSetting getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your transcription
     * job.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including channel identification, alternative
     *        transcriptions, and speaker partitioning. You can use that to apply custom vocabularies to your
     *        transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withSettings(MedicalTranscriptionSetting settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health information (PHI)
     * in a transcription</a>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health
     *        information (PHI) in a transcription</a>.
     * @see MedicalContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health information (PHI)
     * in a transcription</a>.
     * </p>
     * 
     * @return Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health
     *         information (PHI) in a transcription</a>.
     * @see MedicalContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health information (PHI)
     * in a transcription</a>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health
     *        information (PHI) in a transcription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public StartMedicalTranscriptionJobRequest withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health information (PHI)
     * in a transcription</a>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personal health information (PHI) identified in your transcript. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html">Identifying personal health
     *        information (PHI) in a transcription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public StartMedicalTranscriptionJobRequest withContentIdentificationType(MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For batch transcriptions,
     * <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * </p>
     * 
     * @param specialty
     *        Specify the predominant medical specialty represented in your media. For batch transcriptions,
     *        <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For batch transcriptions,
     * <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * </p>
     * 
     * @return Specify the predominant medical specialty represented in your media. For batch transcriptions,
     *         <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For batch transcriptions,
     * <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * </p>
     * 
     * @param specialty
     *        Specify the predominant medical specialty represented in your media. For batch transcriptions,
     *        <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public StartMedicalTranscriptionJobRequest withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For batch transcriptions,
     * <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * </p>
     * 
     * @param specialty
     *        Specify the predominant medical specialty represented in your media. For batch transcriptions,
     *        <code>PRIMARYCARE</code> is the only valid value. If you require additional specialties, refer to .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public StartMedicalTranscriptionJobRequest withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a conversation
     * between two people (<code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice memos;
     * <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the patient's office
     * visit.
     * </p>
     * 
     * @param type
     *        Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a
     *        conversation between two people (<code>CONVERSATION</code>).</p>
     *        <p>
     *        For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice
     *        memos; <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the
     *        patient's office visit.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a conversation
     * between two people (<code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice memos;
     * <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the patient's office
     * visit.
     * </p>
     * 
     * @return Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a
     *         conversation between two people (<code>CONVERSATION</code>).</p>
     *         <p>
     *         For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice
     *         memos; <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the
     *         patient's office visit.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a conversation
     * between two people (<code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice memos;
     * <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the patient's office
     * visit.
     * </p>
     * 
     * @param type
     *        Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a
     *        conversation between two people (<code>CONVERSATION</code>).</p>
     *        <p>
     *        For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice
     *        memos; <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the
     *        patient's office visit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public StartMedicalTranscriptionJobRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a conversation
     * between two people (<code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice memos;
     * <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the patient's office
     * visit.
     * </p>
     * 
     * @param type
     *        Specify whether your input media contains only one person (<code>DICTATION</code>) or contains a
     *        conversation between two people (<code>CONVERSATION</code>).</p>
     *        <p>
     *        For example, <code>DICTATION</code> could be used for a medical professional wanting to transcribe voice
     *        memos; <code>CONVERSATION</code> could be used for transcribing the doctor-patient dialogue during the
     *        patient's office visit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public StartMedicalTranscriptionJobRequest withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the
     * time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at
     *         the time you start this new job.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the
     * time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at
     *        the time you start this new job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the
     * time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at
     *        the time you start this new job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the
     * time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at
     *        the time you start this new job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKMSEncryptionContext() != null)
            sb.append("KMSEncryptionContext: ").append(getKMSEncryptionContext()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: ").append(getContentIdentificationType()).append(",");
        if (getSpecialty() != null)
            sb.append("Specialty: ").append(getSpecialty()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getKMSEncryptionContext() == null ^ this.getKMSEncryptionContext() == null)
            return false;
        if (other.getKMSEncryptionContext() != null && other.getKMSEncryptionContext().equals(this.getKMSEncryptionContext()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getKMSEncryptionContext() == null) ? 0 : getKMSEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartMedicalTranscriptionJobRequest clone() {
        return (StartMedicalTranscriptionJobRequest) super.clone();
    }

}
