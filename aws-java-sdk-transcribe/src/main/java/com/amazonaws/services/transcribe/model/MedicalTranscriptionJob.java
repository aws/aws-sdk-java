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
 * Provides detailed information about a medical transcription job.
 * </p>
 * <p>
 * To view the status of the specified medical transcription job, check the <code>TranscriptionJobStatus</code> field.
 * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location specified
 * in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
 * on why your transcription job failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalTranscriptionJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web
     * Services account.
     * </p>
     */
    private String medicalTranscriptionJobName;
    /**
     * <p>
     * Provides the status of the specified medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * The language code used to create your medical transcription job. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
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

    private Media media;
    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your transcript.
     * </p>
     */
    private MedicalTranscript transcript;
    /**
     * <p>
     * The date and time the specified medical transcription job began processing.
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
     * The date and time the specified medical transcription job request was made.
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
     * The date and time the specified medical transcription job finished processing.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job request failed.
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
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between
     * 16,000 and 48,000 hertz.
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
     * Provides information on any additional settings that were included in your request. Additional settings include
     * channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     */
    private MedicalTranscriptionSetting settings;
    /**
     * <p>
     * Indicates whether content identification was enabled for your transcription request.
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * Describes the medical specialty represented in your media.
     * </p>
     */
    private String specialty;
    /**
     * <p>
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web
     * Services account.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of the medical transcription job. Job names are case sensitive and must be unique within an
     *        Amazon Web Services account.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web
     * Services account.
     * </p>
     * 
     * @return The name of the medical transcription job. Job names are case sensitive and must be unique within an
     *         Amazon Web Services account.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web
     * Services account.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of the medical transcription job. Job names are case sensitive and must be unique within an
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of the specified medical transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your transcription job failed.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @return Provides the status of the specified medical transcription job.</p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *         specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *         <code>FailureReason</code> provides details on why your transcription job failed.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of the specified medical transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJob withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of the specified medical transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJob withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code used to create your medical transcription job. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription job. US English (<code>en-US</code>) is the
     *        only supported language for medical transcriptions.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your medical transcription job. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @return The language code used to create your medical transcription job. US English (<code>en-US</code>) is the
     *         only supported language for medical transcriptions.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your medical transcription job. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription job. US English (<code>en-US</code>) is the
     *        only supported language for medical transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your medical transcription job. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription job. US English (<code>en-US</code>) is the
     *        only supported language for medical transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJob withLanguageCode(LanguageCode languageCode) {
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

    public MedicalTranscriptionJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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

    public MedicalTranscriptionJob withMediaFormat(String mediaFormat) {
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

    public MedicalTranscriptionJob withMediaFormat(MediaFormat mediaFormat) {
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

    public MedicalTranscriptionJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your transcript.
     * </p>
     * 
     * @param transcript
     *        Provides you with the Amazon S3 URI you can use to access your transcript.
     */

    public void setTranscript(MedicalTranscript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your transcript.
     * </p>
     * 
     * @return Provides you with the Amazon S3 URI you can use to access your transcript.
     */

    public MedicalTranscript getTranscript() {
        return this.transcript;
    }

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your transcript.
     * </p>
     * 
     * @param transcript
     *        Provides you with the Amazon S3 URI you can use to access your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withTranscript(MedicalTranscript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * The date and time the specified medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time the specified medical transcription job began processing.</p>
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
     * The date and time the specified medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified medical transcription job began processing.</p>
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
     * The date and time the specified medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time the specified medical transcription job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified medical transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified medical transcription job request was made.</p>
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
     * The date and time the specified medical transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified medical transcription job request was made.</p>
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
     * The date and time the specified medical transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified medical transcription job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified medical transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified medical transcription job finished processing.</p>
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
     * The date and time the specified medical transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified medical transcription job finished processing.</p>
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
     * The date and time the specified medical transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified medical transcription job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at
     *        12:33 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job request failed.
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
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between
     * 16,000 and 48,000 hertz.
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
     *        If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job request failed.</p>
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
     *        between 16,000 and 48,000 hertz.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job request failed.
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
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between
     * 16,000 and 48,000 hertz.
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
     * @return If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *         information about why the transcription job request failed.</p>
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
     *         between 16,000 and 48,000 hertz.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job request failed.
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
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't valid. The sample rate must be between
     * 16,000 and 48,000 hertz.
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
     *        If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job request failed.</p>
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
     *        between 16,000 and 48,000 hertz.
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

    public MedicalTranscriptionJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * 
     * @param settings
     *        Provides information on any additional settings that were included in your request. Additional settings
     *        include channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and
     *        custom vocabulary filters.
     */

    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * 
     * @return Provides information on any additional settings that were included in your request. Additional settings
     *         include channel identification, alternative transcriptions, speaker partitioning, custom vocabularies,
     *         and custom vocabulary filters.
     */

    public MedicalTranscriptionSetting getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in your request. Additional settings include
     * channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and custom
     * vocabulary filters.
     * </p>
     * 
     * @param settings
     *        Provides information on any additional settings that were included in your request. Additional settings
     *        include channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and
     *        custom vocabulary filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withSettings(MedicalTranscriptionSetting settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Indicates whether content identification was enabled for your transcription request.
     * </p>
     * 
     * @param contentIdentificationType
     *        Indicates whether content identification was enabled for your transcription request.
     * @see MedicalContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Indicates whether content identification was enabled for your transcription request.
     * </p>
     * 
     * @return Indicates whether content identification was enabled for your transcription request.
     * @see MedicalContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Indicates whether content identification was enabled for your transcription request.
     * </p>
     * 
     * @param contentIdentificationType
     *        Indicates whether content identification was enabled for your transcription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public MedicalTranscriptionJob withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Indicates whether content identification was enabled for your transcription request.
     * </p>
     * 
     * @param contentIdentificationType
     *        Indicates whether content identification was enabled for your transcription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public MedicalTranscriptionJob withContentIdentificationType(MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Describes the medical specialty represented in your media.
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * Describes the medical specialty represented in your media.
     * </p>
     * 
     * @return Describes the medical specialty represented in your media.
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * Describes the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Describes the medical specialty represented in your media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJob withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * Describes the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Describes the medical specialty represented in your media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJob withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param type
     *        Indicates whether the input media is a dictation or a conversation, as specified in the
     *        <code>StartMedicalTranscriptionJob</code> request.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @return Indicates whether the input media is a dictation or a conversation, as specified in the
     *         <code>StartMedicalTranscriptionJob</code> request.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param type
     *        Indicates whether the input media is a dictation or a conversation, as specified in the
     *        <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public MedicalTranscriptionJob withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param type
     *        Indicates whether the input media is a dictation or a conversation, as specified in the
     *        <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public MedicalTranscriptionJob withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * </p>
     * 
     * @return The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * </p>
     * 
     * @param tags
     *        The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
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
     * The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withTags(Tag... tags) {
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
     * The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * </p>
     * 
     * @param tags
     *        The tags, each in the form of a key:value pair, assigned to the specified medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withTags(java.util.Collection<Tag> tags) {
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
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: ").append(getTranscriptionJobStatus()).append(",");
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

        if (obj instanceof MedicalTranscriptionJob == false)
            return false;
        MedicalTranscriptionJob other = (MedicalTranscriptionJob) obj;
        if (other.getMedicalTranscriptionJobName() == null ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null && other.getMedicalTranscriptionJobName().equals(this.getMedicalTranscriptionJobName()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
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
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MedicalTranscriptionJob clone() {
        try {
            return (MedicalTranscriptionJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalTranscriptionJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
