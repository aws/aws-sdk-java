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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartTranscriptionJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTranscriptionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your transcription job. The name that you specify is also used as the default
     * name of your transcription output file. If you want to specify a different name for your transcription output,
     * use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * The language code that represents the language spoken in the input media file.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <note>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * </note>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the sample
     * rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value that you
     * specify and the value detected, your job fails. In most cases, you can omit <code>MediaSampleRateHertz</code> and
     * let Amazon Transcribe determine the sample rate.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     */
    private String mediaFormat;
    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your request.
     * </p>
     */
    private Media media;
    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
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
     * <p>
     * If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon S3
     * bucket and you are provided with a URI to access your transcript.
     * </p>
     */
    private String outputBucketName;
    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your transcription job (<code>TranscriptionJobName</code>).
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output path
     * is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your transcription
     * output path is <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
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
     * The KMS key you want to use to encrypt your transcription output.
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
     * transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do
     * not</b> want to use automatic language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and want to include a custom language model,
     * a custom vocabulary, or a custom vocabulary filter, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> sub-parameters.
     * </p>
     */
    private Settings settings;
    /**
     * <p>
     * Specify the custom language model you want to include with your transcription job. If you include
     * <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a>.
     * </p>
     */
    private ModelSettings modelSettings;
    /**
     * <p>
     * Makes it possible to control how your transcription job is processed. Currently, the only
     * <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     * <code>AllowDeferredExecution</code> sub-parameter.
     * </p>
     * <p>
     * If you include <code>JobExecutionSettings</code> in your request, you must also include the sub-parameters:
     * <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     * </p>
     */
    private JobExecutionSettings jobExecutionSettings;
    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If
     * you use <code>ContentRedaction</code>, you must also include the sub-parameters: <code>PiiEntityTypes</code>,
     * <code>RedactionOutput</code>, and <code>RedactionType</code>.
     * </p>
     */
    private ContentRedaction contentRedaction;
    /**
     * <p>
     * Enables automatic language identification in your transcription job request. Use this parameter if your media
     * file contains only one language. If your media contains multiple languages, use
     * <code>IdentifyMultipleLanguages</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     * automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     */
    private Boolean identifyLanguage;
    /**
     * <p>
     * Enables automatic multi-language identification in your transcription job request. Use this parameter if your
     * media file contains more than one language. If your media contains only one language, use
     * <code>IdentifyLanguage</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification
     * request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (<code>VocabularyName</code>
     * and <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     */
    private Boolean identifyMultipleLanguages;
    /**
     * <p>
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     */
    private java.util.List<String> languageOptions;
    /**
     * <p>
     * Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     * </p>
     */
    private Subtitles subtitles;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you
     * start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * If using automatic language identification in your request and you want to apply a custom language model, a
     * custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). Note that multi-language identification (
     * <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can have an
     * associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you
     * specify must match the languages of the associated custom language models, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code> to
     * ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is
     * in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     * <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your custom
     * vocabulary <i>is</i> applied to your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but <b>do not</b> want to use automatic language
     * identification, use instead the <code/> parameter with the <code>LanguageModelName</code> sub-parameter. If you
     * want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do not</b>
     * want to use automatic language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     * sub-parameter.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * A unique name, chosen by you, for your transcription job. The name that you specify is also used as the default
     * name of your transcription output file. If you want to specify a different name for your transcription output,
     * use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param transcriptionJobName
     *        A unique name, chosen by you, for your transcription job. The name that you specify is also used as the
     *        default name of your transcription output file. If you want to specify a different name for your
     *        transcription output, use the <code>OutputKey</code> parameter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your transcription job. The name that you specify is also used as the default
     * name of your transcription output file. If you want to specify a different name for your transcription output,
     * use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your transcription job. The name that you specify is also used as the
     *         default name of your transcription output file. If you want to specify a different name for your
     *         transcription output, use the <code>OutputKey</code> parameter.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your transcription job. The name that you specify is also used as the default
     * name of your transcription output file. If you want to specify a different name for your transcription output,
     * use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new job with the same name as an existing job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param transcriptionJobName
     *        A unique name, chosen by you, for your transcription job. The name that you specify is also used as the
     *        default name of your transcription output file. If you want to specify a different name for your
     *        transcription output, use the <code>OutputKey</code> parameter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new job with the same name as an existing job, you get a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withTranscriptionJobName(String transcriptionJobName) {
        setTranscriptionJobName(transcriptionJobName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <note>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * </note>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file.</p>
     *        <p>
     *        If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code>
     *        or <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     *        </p>
     *        <note>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
     *        </p>
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <note>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * </note>
     * 
     * @return The language code that represents the language spoken in the input media file.</p>
     *         <p>
     *         If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code>
     *         or <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *         your transcription job fails.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language codes, refer to the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *         table.
     *         </p>
     *         <note>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *         sample rate of 16,000 Hz or higher.
     *         </p>
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <note>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * </note>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file.</p>
     *        <p>
     *        If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code>
     *        or <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     *        </p>
     *        <note>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media file.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <note>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * </note>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in the input media file.</p>
     *        <p>
     *        If you're unsure of the language spoken in your media file, consider using <code>IdentifyLanguage</code>
     *        or <code>IdentifyMultipleLanguages</code> to enable automatic language identification.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     *        </p>
     *        <note>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the sample
     * rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value that you
     * specify and the value detected, your job fails. In most cases, you can omit <code>MediaSampleRateHertz</code> and
     * let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.</p>
     *        <p>
     *        If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the
     *        sample rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value
     *        that you specify and the value detected, your job fails. In most cases, you can omit
     *        <code>MediaSampleRateHertz</code> and let Amazon Transcribe determine the sample rate.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the sample
     * rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value that you
     * specify and the value detected, your job fails. In most cases, you can omit <code>MediaSampleRateHertz</code> and
     * let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @return The sample rate, in hertz, of the audio track in your input media file.</p>
     *         <p>
     *         If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the
     *         sample rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the
     *         value that you specify and the value detected, your job fails. In most cases, you can omit
     *         <code>MediaSampleRateHertz</code> and let Amazon Transcribe determine the sample rate.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the sample
     * rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value that you
     * specify and the value detected, your job fails. In most cases, you can omit <code>MediaSampleRateHertz</code> and
     * let Amazon Transcribe determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.</p>
     *        <p>
     *        If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the
     *        sample rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value
     *        that you specify and the value detected, your job fails. In most cases, you can omit
     *        <code>MediaSampleRateHertz</code> and let Amazon Transcribe determine the sample rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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

    public StartTranscriptionJobRequest withMediaFormat(String mediaFormat) {
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

    public StartTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your request.
     * </p>
     * 
     * @param media
     *        Describes the Amazon S3 location of the media file you want to use in your request.
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your request.
     * </p>
     * 
     * @return Describes the Amazon S3 location of the media file you want to use in your request.
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in your request.
     * </p>
     * 
     * @param media
     *        Describes the Amazon S3 location of the media file you want to use in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
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
     * <p>
     * If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon S3
     * bucket and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @param outputBucketName
     *        The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
     *        <code>S3://</code> prefix of the specified bucket.</p>
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
     *        </p>
     *        <p>
     *        If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon
     *        S3 bucket and you are provided with a URI to access your transcript.
     */

    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
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
     * <p>
     * If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon S3
     * bucket and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
     *         <code>S3://</code> prefix of the specified bucket.</p>
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
     *         </p>
     *         <p>
     *         If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon
     *         S3 bucket and you are provided with a URI to access your transcript.
     */

    public String getOutputBucketName() {
        return this.outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
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
     * <p>
     * If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon S3
     * bucket and you are provided with a URI to access your transcript.
     * </p>
     * 
     * @param outputBucketName
     *        The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the
     *        <code>S3://</code> prefix of the specified bucket.</p>
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
     *        </p>
     *        <p>
     *        If you don't specify <code>OutputBucketName</code>, your transcript is placed in a service-managed Amazon
     *        S3 bucket and you are provided with a URI to access your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        setOutputBucketName(outputBucketName);
        return this;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript and,
     * optionally, a unique name for your output file. The default name for your transcription output is the same as the
     * name you specified for your transcription job (<code>TranscriptionJobName</code>).
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output path
     * is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your transcription
     * output path is <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
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
     *        same as the name you specified for your transcription job (<code>TranscriptionJobName</code>).</p>
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
     *        If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *        the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription
     *        output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     *        If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *        the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     *        transcription output path is
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
     * name you specified for your transcription job (<code>TranscriptionJobName</code>).
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output path
     * is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your transcription
     * output path is <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * </p>
     * 
     * @return Use in combination with <code>OutputBucketName</code> to specify the output location of your transcript
     *         and, optionally, a unique name for your output file. The default name for your transcription output is
     *         the same as the name you specified for your transcription job (<code>TranscriptionJobName</code>).</p>
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
     *         If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *         the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription
     *         output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     *         If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *         the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     *         transcription output path is
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
     * name you specified for your transcription job (<code>TranscriptionJobName</code>).
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription output path
     * is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     * If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your transcription
     * output path is <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
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
     *        same as the name you specified for your transcription job (<code>TranscriptionJobName</code>).</p>
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
     *        If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *        the <code>OutputBucketName</code>, and 'my-transcript' as the <code>OutputKey</code>, your transcription
     *        output path is <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>.
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
     *        If you specify 'my-first-transcription' as the <code>TranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *        the <code>OutputBucketName</code>, and 'test-files/my-transcript' as the <code>OutputKey</code>, your
     *        transcription output path is
     *        <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your transcription output.
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
     *        The KMS key you want to use to encrypt your transcription output.</p>
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
     * The KMS key you want to use to encrypt your transcription output.
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
     * @return The KMS key you want to use to encrypt your transcription output.</p>
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
     * The KMS key you want to use to encrypt your transcription output.
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
     *        The KMS key you want to use to encrypt your transcription output.</p>
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

    public StartTranscriptionJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
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

    public StartTranscriptionJobRequest withKMSEncryptionContext(java.util.Map<String, String> kMSEncryptionContext) {
        setKMSEncryptionContext(kMSEncryptionContext);
        return this;
    }

    /**
     * Add a single KMSEncryptionContext entry
     *
     * @see StartTranscriptionJobRequest#withKMSEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest addKMSEncryptionContextEntry(String key, String value) {
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

    public StartTranscriptionJobRequest clearKMSEncryptionContextEntries() {
        this.kMSEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do
     * not</b> want to use automatic language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and want to include a custom language model,
     * a custom vocabulary, or a custom vocabulary filter, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> sub-parameters.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including channel identification, alternative
     *        transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary
     *        filters.</p>
     *        <p>
     *        If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but
     *        <b>do not</b> want to use automatic language identification, use <code>Settings</code> with the
     *        <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     *        </p>
     *        <p>
     *        If you're using automatic language identification with your request and want to include a custom language
     *        model, a custom vocabulary, or a custom vocabulary filter, use instead the
     *        <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     *        <code>VocabularyFilterName</code> sub-parameters.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do
     * not</b> want to use automatic language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and want to include a custom language model,
     * a custom vocabulary, or a custom vocabulary filter, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> sub-parameters.
     * </p>
     * 
     * @return Specify additional optional settings in your request, including channel identification, alternative
     *         transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary
     *         filters.</p>
     *         <p>
     *         If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but
     *         <b>do not</b> want to use automatic language identification, use <code>Settings</code> with the
     *         <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     *         </p>
     *         <p>
     *         If you're using automatic language identification with your request and want to include a custom language
     *         model, a custom vocabulary, or a custom vocabulary filter, use instead the
     *         <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     *         <code>VocabularyFilterName</code> sub-parameters.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel identification, alternative
     * transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do
     * not</b> want to use automatic language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and want to include a custom language model,
     * a custom vocabulary, or a custom vocabulary filter, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> sub-parameters.
     * </p>
     * 
     * @param settings
     *        Specify additional optional settings in your request, including channel identification, alternative
     *        transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary
     *        filters.</p>
     *        <p>
     *        If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but
     *        <b>do not</b> want to use automatic language identification, use <code>Settings</code> with the
     *        <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both) sub-parameter.
     *        </p>
     *        <p>
     *        If you're using automatic language identification with your request and want to include a custom language
     *        model, a custom vocabulary, or a custom vocabulary filter, use instead the
     *        <code/> parameter with the <code>LanguageModelName</code>, <code>VocabularyName</code> or
     *        <code>VocabularyFilterName</code> sub-parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withSettings(Settings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Specify the custom language model you want to include with your transcription job. If you include
     * <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a>.
     * </p>
     * 
     * @param modelSettings
     *        Specify the custom language model you want to include with your transcription job. If you include
     *        <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code>
     *        sub-parameter.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *        models</a>.
     */

    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * Specify the custom language model you want to include with your transcription job. If you include
     * <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a>.
     * </p>
     * 
     * @return Specify the custom language model you want to include with your transcription job. If you include
     *         <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code>
     *         sub-parameter.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *         models</a>.
     */

    public ModelSettings getModelSettings() {
        return this.modelSettings;
    }

    /**
     * <p>
     * Specify the custom language model you want to include with your transcription job. If you include
     * <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a>.
     * </p>
     * 
     * @param modelSettings
     *        Specify the custom language model you want to include with your transcription job. If you include
     *        <code>ModelSettings</code> in your request, you must include the <code>LanguageModelName</code>
     *        sub-parameter.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *        models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withModelSettings(ModelSettings modelSettings) {
        setModelSettings(modelSettings);
        return this;
    }

    /**
     * <p>
     * Makes it possible to control how your transcription job is processed. Currently, the only
     * <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     * <code>AllowDeferredExecution</code> sub-parameter.
     * </p>
     * <p>
     * If you include <code>JobExecutionSettings</code> in your request, you must also include the sub-parameters:
     * <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @param jobExecutionSettings
     *        Makes it possible to control how your transcription job is processed. Currently, the only
     *        <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     *        <code>AllowDeferredExecution</code> sub-parameter.</p>
     *        <p>
     *        If you include <code>JobExecutionSettings</code> in your request, you must also include the
     *        sub-parameters: <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     */

    public void setJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
    }

    /**
     * <p>
     * Makes it possible to control how your transcription job is processed. Currently, the only
     * <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     * <code>AllowDeferredExecution</code> sub-parameter.
     * </p>
     * <p>
     * If you include <code>JobExecutionSettings</code> in your request, you must also include the sub-parameters:
     * <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @return Makes it possible to control how your transcription job is processed. Currently, the only
     *         <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     *         <code>AllowDeferredExecution</code> sub-parameter.</p>
     *         <p>
     *         If you include <code>JobExecutionSettings</code> in your request, you must also include the
     *         sub-parameters: <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     */

    public JobExecutionSettings getJobExecutionSettings() {
        return this.jobExecutionSettings;
    }

    /**
     * <p>
     * Makes it possible to control how your transcription job is processed. Currently, the only
     * <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     * <code>AllowDeferredExecution</code> sub-parameter.
     * </p>
     * <p>
     * If you include <code>JobExecutionSettings</code> in your request, you must also include the sub-parameters:
     * <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     * </p>
     * 
     * @param jobExecutionSettings
     *        Makes it possible to control how your transcription job is processed. Currently, the only
     *        <code>JobExecutionSettings</code> modification you can choose is enabling job queueing using the
     *        <code>AllowDeferredExecution</code> sub-parameter.</p>
     *        <p>
     *        If you include <code>JobExecutionSettings</code> in your request, you must also include the
     *        sub-parameters: <code>AllowDeferredExecution</code> and <code>DataAccessRoleArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        setJobExecutionSettings(jobExecutionSettings);
        return this;
    }

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If
     * you use <code>ContentRedaction</code>, you must also include the sub-parameters: <code>PiiEntityTypes</code>,
     * <code>RedactionOutput</code>, and <code>RedactionType</code>.
     * </p>
     * 
     * @param contentRedaction
     *        Makes it possible to redact or flag specified personally identifiable information (PII) in your
     *        transcript. If you use <code>ContentRedaction</code>, you must also include the sub-parameters:
     *        <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and <code>RedactionType</code>.
     */

    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If
     * you use <code>ContentRedaction</code>, you must also include the sub-parameters: <code>PiiEntityTypes</code>,
     * <code>RedactionOutput</code>, and <code>RedactionType</code>.
     * </p>
     * 
     * @return Makes it possible to redact or flag specified personally identifiable information (PII) in your
     *         transcript. If you use <code>ContentRedaction</code>, you must also include the sub-parameters:
     *         <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and <code>RedactionType</code>.
     */

    public ContentRedaction getContentRedaction() {
        return this.contentRedaction;
    }

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If
     * you use <code>ContentRedaction</code>, you must also include the sub-parameters: <code>PiiEntityTypes</code>,
     * <code>RedactionOutput</code>, and <code>RedactionType</code>.
     * </p>
     * 
     * @param contentRedaction
     *        Makes it possible to redact or flag specified personally identifiable information (PII) in your
     *        transcript. If you use <code>ContentRedaction</code>, you must also include the sub-parameters:
     *        <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and <code>RedactionType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withContentRedaction(ContentRedaction contentRedaction) {
        setContentRedaction(contentRedaction);
        return this;
    }

    /**
     * <p>
     * Enables automatic language identification in your transcription job request. Use this parameter if your media
     * file contains only one language. If your media contains multiple languages, use
     * <code>IdentifyMultipleLanguages</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     * automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @param identifyLanguage
     *        Enables automatic language identification in your transcription job request. Use this parameter if your
     *        media file contains only one language. If your media contains multiple languages, use
     *        <code>IdentifyMultipleLanguages</code> instead.</p>
     *        <p>
     *        If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     *        <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *        <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     *        specify, which can improve transcription accuracy.
     *        </p>
     *        <p>
     *        If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     *        automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     *        sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *        <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     *        <code>LanguageOptions</code>.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     */

    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Enables automatic language identification in your transcription job request. Use this parameter if your media
     * file contains only one language. If your media contains multiple languages, use
     * <code>IdentifyMultipleLanguages</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     * automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @return Enables automatic language identification in your transcription job request. Use this parameter if your
     *         media file contains only one language. If your media contains multiple languages, use
     *         <code>IdentifyMultipleLanguages</code> instead.</p>
     *         <p>
     *         If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     *         <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *         <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that
     *         you specify, which can improve transcription accuracy.
     *         </p>
     *         <p>
     *         If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     *         automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     *         sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *         <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     *         <code>LanguageOptions</code>.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *         your transcription job fails.
     */

    public Boolean getIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Enables automatic language identification in your transcription job request. Use this parameter if your media
     * file contains only one language. If your media contains multiple languages, use
     * <code>IdentifyMultipleLanguages</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     * automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @param identifyLanguage
     *        Enables automatic language identification in your transcription job request. Use this parameter if your
     *        media file contains only one language. If your media contains multiple languages, use
     *        <code>IdentifyMultipleLanguages</code> instead.</p>
     *        <p>
     *        If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     *        <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *        <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     *        specify, which can improve transcription accuracy.
     *        </p>
     *        <p>
     *        If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     *        automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     *        sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *        <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     *        <code>LanguageOptions</code>.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withIdentifyLanguage(Boolean identifyLanguage) {
        setIdentifyLanguage(identifyLanguage);
        return this;
    }

    /**
     * <p>
     * Enables automatic language identification in your transcription job request. Use this parameter if your media
     * file contains only one language. If your media contains multiple languages, use
     * <code>IdentifyMultipleLanguages</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     * automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @return Enables automatic language identification in your transcription job request. Use this parameter if your
     *         media file contains only one language. If your media contains multiple languages, use
     *         <code>IdentifyMultipleLanguages</code> instead.</p>
     *         <p>
     *         If you include <code>IdentifyLanguage</code>, you can optionally include a list of language codes, using
     *         <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *         <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that
     *         you specify, which can improve transcription accuracy.
     *         </p>
     *         <p>
     *         If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your
     *         automatic language identification request, include <code>LanguageIdSettings</code> with the relevant
     *         sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *         <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     *         <code>LanguageOptions</code>.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *         your transcription job fails.
     */

    public Boolean isIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Enables automatic multi-language identification in your transcription job request. Use this parameter if your
     * media file contains more than one language. If your media contains only one language, use
     * <code>IdentifyLanguage</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification
     * request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (<code>VocabularyName</code>
     * and <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @param identifyMultipleLanguages
     *        Enables automatic multi-language identification in your transcription job request. Use this parameter if
     *        your media file contains more than one language. If your media contains only one language, use
     *        <code>IdentifyLanguage</code> instead.</p>
     *        <p>
     *        If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language
     *        codes, using <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *        <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     *        specify, which can improve transcription accuracy.
     *        </p>
     *        <p>
     *        If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language
     *        identification request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (
     *        <code>VocabularyName</code> and <code>VocabularyFilterName</code>). If you include
     *        <code>LanguageIdSettings</code>, also include <code>LanguageOptions</code>.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     */

    public void setIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        this.identifyMultipleLanguages = identifyMultipleLanguages;
    }

    /**
     * <p>
     * Enables automatic multi-language identification in your transcription job request. Use this parameter if your
     * media file contains more than one language. If your media contains only one language, use
     * <code>IdentifyLanguage</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification
     * request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (<code>VocabularyName</code>
     * and <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @return Enables automatic multi-language identification in your transcription job request. Use this parameter if
     *         your media file contains more than one language. If your media contains only one language, use
     *         <code>IdentifyLanguage</code> instead.</p>
     *         <p>
     *         If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language
     *         codes, using <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *         <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that
     *         you specify, which can improve transcription accuracy.
     *         </p>
     *         <p>
     *         If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language
     *         identification request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (
     *         <code>VocabularyName</code> and <code>VocabularyFilterName</code>). If you include
     *         <code>LanguageIdSettings</code>, also include <code>LanguageOptions</code>.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *         your transcription job fails.
     */

    public Boolean getIdentifyMultipleLanguages() {
        return this.identifyMultipleLanguages;
    }

    /**
     * <p>
     * Enables automatic multi-language identification in your transcription job request. Use this parameter if your
     * media file contains more than one language. If your media contains only one language, use
     * <code>IdentifyLanguage</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification
     * request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (<code>VocabularyName</code>
     * and <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @param identifyMultipleLanguages
     *        Enables automatic multi-language identification in your transcription job request. Use this parameter if
     *        your media file contains more than one language. If your media contains only one language, use
     *        <code>IdentifyLanguage</code> instead.</p>
     *        <p>
     *        If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language
     *        codes, using <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *        <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     *        specify, which can improve transcription accuracy.
     *        </p>
     *        <p>
     *        If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language
     *        identification request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (
     *        <code>VocabularyName</code> and <code>VocabularyFilterName</code>). If you include
     *        <code>LanguageIdSettings</code>, also include <code>LanguageOptions</code>.
     *        </p>
     *        <p>
     *        Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *        <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *        your transcription job fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        setIdentifyMultipleLanguages(identifyMultipleLanguages);
        return this;
    }

    /**
     * <p>
     * Enables automatic multi-language identification in your transcription job request. Use this parameter if your
     * media file contains more than one language. If your media contains only one language, use
     * <code>IdentifyLanguage</code> instead.
     * </p>
     * <p>
     * If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language codes, using
     * <code>LanguageOptions</code>, that you think may be present in your media file. Including
     * <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that you
     * specify, which can improve transcription accuracy.
     * </p>
     * <p>
     * If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification
     * request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (<code>VocabularyName</code>
     * and <code>VocabularyFilterName</code>). If you include <code>LanguageIdSettings</code>, also include
     * <code>LanguageOptions</code>.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * 
     * @return Enables automatic multi-language identification in your transcription job request. Use this parameter if
     *         your media file contains more than one language. If your media contains only one language, use
     *         <code>IdentifyLanguage</code> instead.</p>
     *         <p>
     *         If you include <code>IdentifyMultipleLanguages</code>, you can optionally include a list of language
     *         codes, using <code>LanguageOptions</code>, that you think may be present in your media file. Including
     *         <code>LanguageOptions</code> restricts <code>IdentifyLanguage</code> to only the language options that
     *         you specify, which can improve transcription accuracy.
     *         </p>
     *         <p>
     *         If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language
     *         identification request, include <code>LanguageIdSettings</code> with the relevant sub-parameters (
     *         <code>VocabularyName</code> and <code>VocabularyFilterName</code>). If you include
     *         <code>LanguageIdSettings</code>, also include <code>LanguageOptions</code>.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you include more than one of these parameters,
     *         your transcription job fails.
     */

    public Boolean isIdentifyMultipleLanguages() {
        return this.identifyMultipleLanguages;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * 
     * @return You can specify two or more language codes that represent the languages you think may be present in your
     *         media. Including more than five is not recommended. If you're unsure what languages are present, do not
     *         include this parameter.</p>
     *         <p>
     *         If you include <code>LanguageOptions</code> in your request, you must also include
     *         <code>IdentifyLanguage</code>.
     *         </p>
     *         <p>
     *         For more information, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     *         </p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *         sample rate of 16,000 Hz or higher.
     * @see LanguageCode
     */

    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * 
     * @param languageOptions
     *        You can specify two or more language codes that represent the languages you think may be present in your
     *        media. Including more than five is not recommended. If you're unsure what languages are present, do not
     *        include this parameter.</p>
     *        <p>
     *        If you include <code>LanguageOptions</code> in your request, you must also include
     *        <code>IdentifyLanguage</code>.
     *        </p>
     *        <p>
     *        For more information, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     *        </p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguageOptions(java.util.Collection)} or {@link #withLanguageOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param languageOptions
     *        You can specify two or more language codes that represent the languages you think may be present in your
     *        media. Including more than five is not recommended. If you're unsure what languages are present, do not
     *        include this parameter.</p>
     *        <p>
     *        If you include <code>LanguageOptions</code> in your request, you must also include
     *        <code>IdentifyLanguage</code>.
     *        </p>
     *        <p>
     *        For more information, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     *        </p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * 
     * @param languageOptions
     *        You can specify two or more language codes that represent the languages you think may be present in your
     *        media. Including more than five is not recommended. If you're unsure what languages are present, do not
     *        include this parameter.</p>
     *        <p>
     *        If you include <code>LanguageOptions</code> in your request, you must also include
     *        <code>IdentifyLanguage</code>.
     *        </p>
     *        <p>
     *        For more information, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     *        </p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartTranscriptionJobRequest withLanguageOptions(java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages you think may be present in your media.
     * Including more than five is not recommended. If you're unsure what languages are present, do not include this
     * parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a sample
     * rate of 16,000 Hz or higher.
     * </p>
     * 
     * @param languageOptions
     *        You can specify two or more language codes that represent the languages you think may be present in your
     *        media. Including more than five is not recommended. If you're unsure what languages are present, do not
     *        include this parameter.</p>
     *        <p>
     *        If you include <code>LanguageOptions</code> in your request, you must also include
     *        <code>IdentifyLanguage</code>.
     *        </p>
     *        <p>
     *        For more information, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>.
     *        </p>
     *        <p>
     *        To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your media file must be encoded at a
     *        sample rate of 16,000 Hz or higher.
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
     * <p>
     * Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     * </p>
     * 
     * @param subtitles
     *        Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     */

    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
    }

    /**
     * <p>
     * Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     * </p>
     * 
     * @return Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     */

    public Subtitles getSubtitles() {
        return this.subtitles;
    }

    /**
     * <p>
     * Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     * </p>
     * 
     * @param subtitles
     *        Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withSubtitles(Subtitles subtitles) {
        setSubtitles(subtitles);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you
     * start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the
     *         time you start this new job.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you
     * start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time
     *        you start this new job.</p>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you
     * start this new job.
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
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time
     *        you start this new job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you
     * start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time
     *        you start this new job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If using automatic language identification in your request and you want to apply a custom language model, a
     * custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). Note that multi-language identification (
     * <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can have an
     * associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you
     * specify must match the languages of the associated custom language models, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code> to
     * ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is
     * in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     * <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your custom
     * vocabulary <i>is</i> applied to your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but <b>do not</b> want to use automatic language
     * identification, use instead the <code/> parameter with the <code>LanguageModelName</code> sub-parameter. If you
     * want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do not</b>
     * want to use automatic language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     * sub-parameter.
     * </p>
     * 
     * @return If using automatic language identification in your request and you want to apply a custom language model,
     *         a custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the
     *         relevant sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *         <code>VocabularyFilterName</code>). Note that multi-language identification (
     *         <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.</p>
     *         <p>
     *         <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can
     *         have an associated custom language model, custom vocabulary, and custom vocabulary filter. The language
     *         codes that you specify must match the languages of the associated custom language models, custom
     *         vocabularies, and custom vocabulary filters.
     *         </p>
     *         <p>
     *         It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code>
     *         to ensure that the correct language dialect is identified. For example, if you specify a custom
     *         vocabulary that is in <code>en-US</code> but Amazon Transcribe determines that the language spoken in
     *         your media is <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If
     *         you include <code>LanguageOptions</code> and include <code>en-US</code> as the only English language
     *         dialect, your custom vocabulary <i>is</i> applied to your transcription.
     *         </p>
     *         <p>
     *         If you want to include a custom language model with your request but <b>do not</b> want to use automatic
     *         language identification, use instead the <code/> parameter with the <code>LanguageModelName</code>
     *         sub-parameter. If you want to include a custom vocabulary or a custom vocabulary filter (or both) with
     *         your request but <b>do not</b> want to use automatic language identification, use instead the
     *         <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     *         sub-parameter.
     */

    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification in your request and you want to apply a custom language model, a
     * custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). Note that multi-language identification (
     * <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can have an
     * associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you
     * specify must match the languages of the associated custom language models, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code> to
     * ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is
     * in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     * <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your custom
     * vocabulary <i>is</i> applied to your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but <b>do not</b> want to use automatic language
     * identification, use instead the <code/> parameter with the <code>LanguageModelName</code> sub-parameter. If you
     * want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do not</b>
     * want to use automatic language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     * sub-parameter.
     * </p>
     * 
     * @param languageIdSettings
     *        If using automatic language identification in your request and you want to apply a custom language model,
     *        a custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the
     *        relevant sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *        <code>VocabularyFilterName</code>). Note that multi-language identification (
     *        <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.</p>
     *        <p>
     *        <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can
     *        have an associated custom language model, custom vocabulary, and custom vocabulary filter. The language
     *        codes that you specify must match the languages of the associated custom language models, custom
     *        vocabularies, and custom vocabulary filters.
     *        </p>
     *        <p>
     *        It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code>
     *        to ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary
     *        that is in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     *        <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     *        <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your
     *        custom vocabulary <i>is</i> applied to your transcription.
     *        </p>
     *        <p>
     *        If you want to include a custom language model with your request but <b>do not</b> want to use automatic
     *        language identification, use instead the <code/> parameter with the <code>LanguageModelName</code>
     *        sub-parameter. If you want to include a custom vocabulary or a custom vocabulary filter (or both) with
     *        your request but <b>do not</b> want to use automatic language identification, use instead the
     *        <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     *        sub-parameter.
     */

    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification in your request and you want to apply a custom language model, a
     * custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the relevant
     * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>). Note that multi-language identification (
     * <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can have an
     * associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you
     * specify must match the languages of the associated custom language models, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code> to
     * ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is
     * in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     * <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your custom
     * vocabulary <i>is</i> applied to your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but <b>do not</b> want to use automatic language
     * identification, use instead the <code/> parameter with the <code>LanguageModelName</code> sub-parameter. If you
     * want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but <b>do not</b>
     * want to use automatic language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     * sub-parameter.
     * </p>
     * 
     * @param languageIdSettings
     *        If using automatic language identification in your request and you want to apply a custom language model,
     *        a custom vocabulary, or a custom vocabulary filter, include <code>LanguageIdSettings</code> with the
     *        relevant sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *        <code>VocabularyFilterName</code>). Note that multi-language identification (
     *        <code>IdentifyMultipleLanguages</code>) doesn't support custom language models.</p>
     *        <p>
     *        <code>LanguageIdSettings</code> supports two to five language codes. Each language code you include can
     *        have an associated custom language model, custom vocabulary, and custom vocabulary filter. The language
     *        codes that you specify must match the languages of the associated custom language models, custom
     *        vocabularies, and custom vocabulary filters.
     *        </p>
     *        <p>
     *        It's recommended that you include <code>LanguageOptions</code> when using <code>LanguageIdSettings</code>
     *        to ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary
     *        that is in <code>en-US</code> but Amazon Transcribe determines that the language spoken in your media is
     *        <code>en-AU</code>, your custom vocabulary <i>is not</i> applied to your transcription. If you include
     *        <code>LanguageOptions</code> and include <code>en-US</code> as the only English language dialect, your
     *        custom vocabulary <i>is</i> applied to your transcription.
     *        </p>
     *        <p>
     *        If you want to include a custom language model with your request but <b>do not</b> want to use automatic
     *        language identification, use instead the <code/> parameter with the <code>LanguageModelName</code>
     *        sub-parameter. If you want to include a custom vocabulary or a custom vocabulary filter (or both) with
     *        your request but <b>do not</b> want to use automatic language identification, use instead the
     *        <code/> parameter with the <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or both)
     *        sub-parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest withLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        setLanguageIdSettings(languageIdSettings);
        return this;
    }

    /**
     * Add a single LanguageIdSettings entry
     *
     * @see StartTranscriptionJobRequest#withLanguageIdSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest addLanguageIdSettingsEntry(String key, LanguageIdSettings value) {
        if (null == this.languageIdSettings) {
            this.languageIdSettings = new java.util.HashMap<String, LanguageIdSettings>();
        }
        if (this.languageIdSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.languageIdSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LanguageIdSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTranscriptionJobRequest clearLanguageIdSettingsEntries() {
        this.languageIdSettings = null;
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
        if (getKMSEncryptionContext() != null)
            sb.append("KMSEncryptionContext: ").append(getKMSEncryptionContext()).append(",");
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
        if (getIdentifyMultipleLanguages() != null)
            sb.append("IdentifyMultipleLanguages: ").append(getIdentifyMultipleLanguages()).append(",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: ").append(getLanguageOptions()).append(",");
        if (getSubtitles() != null)
            sb.append("Subtitles: ").append(getSubtitles()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLanguageIdSettings() != null)
            sb.append("LanguageIdSettings: ").append(getLanguageIdSettings());
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
        if (other.getKMSEncryptionContext() == null ^ this.getKMSEncryptionContext() == null)
            return false;
        if (other.getKMSEncryptionContext() != null && other.getKMSEncryptionContext().equals(this.getKMSEncryptionContext()) == false)
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
        if (other.getIdentifyMultipleLanguages() == null ^ this.getIdentifyMultipleLanguages() == null)
            return false;
        if (other.getIdentifyMultipleLanguages() != null && other.getIdentifyMultipleLanguages().equals(this.getIdentifyMultipleLanguages()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
            return false;
        if (other.getSubtitles() == null ^ this.getSubtitles() == null)
            return false;
        if (other.getSubtitles() != null && other.getSubtitles().equals(this.getSubtitles()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLanguageIdSettings() == null ^ this.getLanguageIdSettings() == null)
            return false;
        if (other.getLanguageIdSettings() != null && other.getLanguageIdSettings().equals(this.getLanguageIdSettings()) == false)
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
        hashCode = prime * hashCode + ((getKMSEncryptionContext() == null) ? 0 : getKMSEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionSettings() == null) ? 0 : getJobExecutionSettings().hashCode());
        hashCode = prime * hashCode + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode + ((getIdentifyMultipleLanguages() == null) ? 0 : getIdentifyMultipleLanguages().hashCode());
        hashCode = prime * hashCode + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime * hashCode + ((getSubtitles() == null) ? 0 : getSubtitles().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLanguageIdSettings() == null) ? 0 : getLanguageIdSettings().hashCode());
        return hashCode;
    }

    @Override
    public StartTranscriptionJobRequest clone() {
        return (StartTranscriptionJobRequest) super.clone();
    }

}
