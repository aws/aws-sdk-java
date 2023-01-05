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
 * Provides detailed information about a Call Analytics job.
 * </p>
 * <p>
 * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>. If the status is <code>COMPLETED</code>, the
 * job is finished. You can find your completed transcript at the URI specified in <code>TranscriptFileUri</code>. If
 * the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why your transcription job failed.
 * </p>
 * <p>
 * If you enabled personally identifiable information (PII) redaction, the redacted transcript appears at the location
 * specified in <code>RedactedTranscriptFileUri</code>.
 * </p>
 * <p>
 * If you chose to redact the audio in your media file, you can find your redacted media file at the location specified
 * in the <code>RedactedMediaFileUri</code> field of your response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     */
    private String callAnalyticsJobName;
    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     */
    private String callAnalyticsJobStatus;
    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of supported languages and their associated
     * language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe
     * automatically identify the language of your media. To improve the accuracy of language identification, you can
     * include several language codes and Amazon Transcribe chooses the closest match for your transcription.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
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
     * Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     * </p>
     */
    private Media media;

    private Transcript transcript;
    /**
     * <p>
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list of
     * supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check the
     * media format of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between 8,000
     * and 48,000 hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in your
     * input media file. Check the sample rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The confidence score associated with the language identified in your media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified
     * language correctly matches the language spoken in your media.
     * </p>
     */
    private Float identifiedLanguageScore;
    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * content redaction and language identification settings.
     * </p>
     */
    private CallAnalyticsJobSettings settings;
    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     */

    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @return The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web
     *         Services account.
     */

    public String getCallAnalyticsJobName() {
        return this.callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of the specified Call Analytics job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @see CallAnalyticsJobStatus
     */

    public void setCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @return Provides the status of the specified Call Analytics job.</p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *         specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *         transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *         on why your transcription job failed.
     * @see CallAnalyticsJobStatus
     */

    public String getCallAnalyticsJobStatus() {
        return this.callAnalyticsJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of the specified Call Analytics job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJob withCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        setCallAnalyticsJobStatus(callAnalyticsJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of the specified Call Analytics job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJob withCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of supported languages and their associated
     * language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe
     * automatically identify the language of your media. To improve the accuracy of language identification, you can
     * include several language codes and Amazon Transcribe chooses the closest match for your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics job. For a list of supported languages and their
     *        associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.</p>
     *        <p>
     *        If you don't know the language spoken in your media file, you can omit this field and let Amazon
     *        Transcribe automatically identify the language of your media. To improve the accuracy of language
     *        identification, you can include several language codes and Amazon Transcribe chooses the closest match for
     *        your transcription.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of supported languages and their associated
     * language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe
     * automatically identify the language of your media. To improve the accuracy of language identification, you can
     * include several language codes and Amazon Transcribe chooses the closest match for your transcription.
     * </p>
     * 
     * @return The language code used to create your Call Analytics job. For a list of supported languages and their
     *         associated language codes, refer to the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *         table.</p>
     *         <p>
     *         If you don't know the language spoken in your media file, you can omit this field and let Amazon
     *         Transcribe automatically identify the language of your media. To improve the accuracy of language
     *         identification, you can include several language codes and Amazon Transcribe chooses the closest match
     *         for your transcription.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of supported languages and their associated
     * language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe
     * automatically identify the language of your media. To improve the accuracy of language identification, you can
     * include several language codes and Amazon Transcribe chooses the closest match for your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics job. For a list of supported languages and their
     *        associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.</p>
     *        <p>
     *        If you don't know the language spoken in your media file, you can omit this field and let Amazon
     *        Transcribe automatically identify the language of your media. To improve the accuracy of language
     *        identification, you can include several language codes and Amazon Transcribe chooses the closest match for
     *        your transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of supported languages and their associated
     * language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe
     * automatically identify the language of your media. To improve the accuracy of language identification, you can
     * include several language codes and Amazon Transcribe chooses the closest match for your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics job. For a list of supported languages and their
     *        associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.</p>
     *        <p>
     *        If you don't know the language spoken in your media file, you can omit this field and let Amazon
     *        Transcribe automatically identify the language of your media. To improve the accuracy of language
     *        identification, you can include several language codes and Amazon Transcribe chooses the closest match for
     *        your transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * 
     * @return The sample rate, in hertz, of the audio track in your input media file.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in hertz, of the audio track in your input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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

    public CallAnalyticsJob withMediaFormat(String mediaFormat) {
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

    public CallAnalyticsJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     * </p>
     * 
     * @param media
     *        Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     * </p>
     * 
     * @return Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     * </p>
     * 
     * @param media
     *        Provides the Amazon S3 location of the media file you used in your Call Analytics request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * @param transcript
     */

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * @return
     */

    public Transcript getTranscript() {
        return this.transcript;
    }

    /**
     * @param transcript
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withTranscript(Transcript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time the specified Call Analytics job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Call Analytics job began processing.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *         12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time the specified Call Analytics job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified Call Analytics job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Call Analytics job request was made.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at
     *         12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified Call Analytics job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified Call Analytics job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at
     *        12:33 PM UTC-7 on May 4, 2022.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Call Analytics job finished processing.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at
     *         12:33 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified Call Analytics job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at
     *        12:33 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list of
     * supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check the
     * media format of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between 8,000
     * and 48,000 hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in your
     * input media file. Check the sample rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the Call Analytics job request failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>.
     *        </p>
     *        <p>
     *        The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list
     *        of supported formats.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>.
     *        </p>
     *        <p>
     *        The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check
     *        the media format of your media file and correct the specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>.
     *        </p>
     *        <p>
     *        The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be
     *        between 8,000 and 48,000 hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>.
     *        </p>
     *        <p>
     *        The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in
     *        your input media file. Check the sample rate of your media file and correct the specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>.
     *        </p>
     *        <p>
     *        The size of your media file is larger than what Amazon Transcribe can process. For more information, refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        quotas</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>.
     *        </p>
     *        <p>
     *        Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        quotas</a>.
     *        </p>
     *        </li>
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list of
     * supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check the
     * media format of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between 8,000
     * and 48,000 hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in your
     * input media file. Check the sample rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *         information about why the Call Analytics job request failed.</p>
     *         <p>
     *         The <code>FailureReason</code> field contains one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>.
     *         </p>
     *         <p>
     *         The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a
     *         list of supported formats.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>.
     *         </p>
     *         <p>
     *         The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check
     *         the media format of your media file and correct the specified value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>.
     *         </p>
     *         <p>
     *         The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be
     *         between 8,000 and 48,000 hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>.
     *         </p>
     *         <p>
     *         The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in
     *         your input media file. Check the sample rate of your media file and correct the specified value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>.
     *         </p>
     *         <p>
     *         The size of your media file is larger than what Amazon Transcribe can process. For more information,
     *         refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *         quotas</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>.
     *         </p>
     *         <p>
     *         Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer
     *         to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines
     *         and quotas</a>.
     *         </p>
     *         </li>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list of
     * supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check the
     * media format of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between 8,000
     * and 48,000 hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in your
     * input media file. Check the sample rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the Call Analytics job request failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>.
     *        </p>
     *        <p>
     *        The media format specified in <code>MediaFormat</code> isn't valid. Refer to <b>MediaFormat</b> for a list
     *        of supported formats.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>.
     *        </p>
     *        <p>
     *        The media format specified in <code>MediaFormat</code> doesn't match the format of the input file. Check
     *        the media format of your media file and correct the specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>.
     *        </p>
     *        <p>
     *        The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be
     *        between 8,000 and 48,000 hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>.
     *        </p>
     *        <p>
     *        The sample rate specified in <code>MediaSampleRateHertz</code> doesn't match the sample rate detected in
     *        your input media file. Check the sample rate of your media file and correct the specified value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>.
     *        </p>
     *        <p>
     *        The size of your media file is larger than what Amazon Transcribe can process. For more information, refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        quotas</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>.
     *        </p>
     *        <p>
     *        Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        quotas</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) you included in your request.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) you included in your request.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) you included in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The confidence score associated with the language identified in your media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified
     * language correctly matches the language spoken in your media.
     * </p>
     * 
     * @param identifiedLanguageScore
     *        The confidence score associated with the language identified in your media file.</p>
     *        <p>
     *        Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the
     *        identified language correctly matches the language spoken in your media.
     */

    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * The confidence score associated with the language identified in your media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified
     * language correctly matches the language spoken in your media.
     * </p>
     * 
     * @return The confidence score associated with the language identified in your media file.</p>
     *         <p>
     *         Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the
     *         identified language correctly matches the language spoken in your media.
     */

    public Float getIdentifiedLanguageScore() {
        return this.identifiedLanguageScore;
    }

    /**
     * <p>
     * The confidence score associated with the language identified in your media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified
     * language correctly matches the language spoken in your media.
     * </p>
     * 
     * @param identifiedLanguageScore
     *        The confidence score associated with the language identified in your media file.</p>
     *        <p>
     *        Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the
     *        identified language correctly matches the language spoken in your media.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        setIdentifiedLanguageScore(identifiedLanguageScore);
        return this;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * content redaction and language identification settings.
     * </p>
     * 
     * @param settings
     *        Provides information on any additional settings that were included in your request. Additional settings
     *        include content redaction and language identification settings.
     */

    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * content redaction and language identification settings.
     * </p>
     * 
     * @return Provides information on any additional settings that were included in your request. Additional settings
     *         include content redaction and language identification settings.
     */

    public CallAnalyticsJobSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * content redaction and language identification settings.
     * </p>
     * 
     * @param settings
     *        Provides information on any additional settings that were included in your request. Additional settings
     *        include content redaction and language identification settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withSettings(CallAnalyticsJobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * 
     * @return Indicates which speaker is on which channel.
     */

    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * 
     * @param channelDefinitions
     *        Indicates which speaker is on which channel.
     */

    public void setChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        Indicates which speaker is on which channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withChannelDefinitions(ChannelDefinition... channelDefinitions) {
        if (this.channelDefinitions == null) {
            setChannelDefinitions(new java.util.ArrayList<ChannelDefinition>(channelDefinitions.length));
        }
        for (ChannelDefinition ele : channelDefinitions) {
            this.channelDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * 
     * @param channelDefinitions
     *        Indicates which speaker is on which channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: ").append(getCallAnalyticsJobName()).append(",");
        if (getCallAnalyticsJobStatus() != null)
            sb.append("CallAnalyticsJobStatus: ").append(getCallAnalyticsJobStatus()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: ").append(getMediaSampleRateHertz()).append(",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: ").append(getMediaFormat()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: ").append(getIdentifiedLanguageScore()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: ").append(getChannelDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJob == false)
            return false;
        CallAnalyticsJob other = (CallAnalyticsJob) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getCallAnalyticsJobStatus() == null ^ this.getCallAnalyticsJobStatus() == null)
            return false;
        if (other.getCallAnalyticsJobStatus() != null && other.getCallAnalyticsJobStatus().equals(this.getCallAnalyticsJobStatus()) == false)
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
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsJobStatus() == null) ? 0 : getCallAnalyticsJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJob clone() {
        try {
            return (CallAnalyticsJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
