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
 * Provides detailed information about a specific transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TranscriptionJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * The date and time the specified transcription job request was made.
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
     * The date and time your transcription job began processing.
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
     * The date and time the specified transcription job finished processing.
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
     * The language code used to create your transcription.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Provides the status of your transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> or
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     */
    private String outputLocationType;
    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    private ModelSettings modelSettings;
    /**
     * <p>
     * Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     */
    private Boolean identifyLanguage;
    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     */
    private Boolean identifyMultipleLanguages;
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
     * The language codes used to create your transcription job. This parameter is used with multi-language
     * identification. For single-language identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     */
    private java.util.List<LanguageCodeItem> languageCodes;

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @return The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web
     *         Services account.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withTranscriptionJobName(String transcriptionJobName) {
        setTranscriptionJobName(transcriptionJobName);
        return this;
    }

    /**
     * <p>
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified transcription job request was made.</p>
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
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified transcription job request was made.</p>
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
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified transcription job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time your transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your transcription job began processing.</p>
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
     * The date and time your transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time your transcription job began processing.</p>
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
     * The date and time your transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your transcription job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified transcription job finished processing.</p>
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
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified transcription job finished processing.</p>
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
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at 12:33 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified transcription job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription job that started processing at
     *        12:33 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your transcription.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * 
     * @return The language code used to create your transcription.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @return Provides the status of your transcription job.</p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *         specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *         transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *         on why your transcription job failed.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJobSummary withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @return If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *         information about why the transcription job failed. See also: <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> or
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        or <code>RedactedTranscriptFileUri</code> field.
     * @see OutputLocationType
     */

    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> or
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @return Indicates where the specified transcription output is stored.</p>
     *         <p>
     *         If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using
     *         the <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code>
     *         in your request, your output is located in the path you specified in your request.
     *         </p>
     *         <p>
     *         If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To
     *         access a transcript stored in a service-managed bucket, use the URI shown in the
     *         <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code> field.
     * @see OutputLocationType
     */

    public String getOutputLocationType() {
        return this.outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> or
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        or <code>RedactedTranscriptFileUri</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public TranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        setOutputLocationType(outputLocationType);
        return this;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> or
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        or <code>RedactedTranscriptFileUri</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public TranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @param contentRedaction
     *        The content redaction settings of the transcription job.
     */

    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @return The content redaction settings of the transcription job.
     */

    public ContentRedaction getContentRedaction() {
        return this.contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * 
     * @param contentRedaction
     *        The content redaction settings of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withContentRedaction(ContentRedaction contentRedaction) {
        setContentRedaction(contentRedaction);
        return this;
    }

    /**
     * @param modelSettings
     */

    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * @return
     */

    public ModelSettings getModelSettings() {
        return this.modelSettings;
    }

    /**
     * @param modelSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withModelSettings(ModelSettings modelSettings) {
        setModelSettings(modelSettings);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @param identifyLanguage
     *        Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     *        transcription job.
     */

    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @return Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     *         transcription job.
     */

    public Boolean getIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @param identifyLanguage
     *        Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     *        transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withIdentifyLanguage(Boolean identifyLanguage) {
        setIdentifyLanguage(identifyLanguage);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @return Indicates whether automatic language identification was enabled (<code>TRUE</code>) for the specified
     *         transcription job.
     */

    public Boolean isIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @param identifyMultipleLanguages
     *        Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the
     *        specified transcription job.
     */

    public void setIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        this.identifyMultipleLanguages = identifyMultipleLanguages;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @return Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the
     *         specified transcription job.
     */

    public Boolean getIdentifyMultipleLanguages() {
        return this.identifyMultipleLanguages;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @param identifyMultipleLanguages
     *        Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the
     *        specified transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        setIdentifyMultipleLanguages(identifyMultipleLanguages);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the specified
     * transcription job.
     * </p>
     * 
     * @return Indicates whether automatic multi-language identification was enabled (<code>TRUE</code>) for the
     *         specified transcription job.
     */

    public Boolean isIdentifyMultipleLanguages() {
        return this.identifyMultipleLanguages;
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

    public TranscriptionJobSummary withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        setIdentifiedLanguageScore(identifiedLanguageScore);
        return this;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter is used with multi-language
     * identification. For single-language identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * 
     * @return The language codes used to create your transcription job. This parameter is used with multi-language
     *         identification. For single-language identification, the singular version of this parameter,
     *         <code>LanguageCode</code>, is present.
     */

    public java.util.List<LanguageCodeItem> getLanguageCodes() {
        return languageCodes;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter is used with multi-language
     * identification. For single-language identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * 
     * @param languageCodes
     *        The language codes used to create your transcription job. This parameter is used with multi-language
     *        identification. For single-language identification, the singular version of this parameter,
     *        <code>LanguageCode</code>, is present.
     */

    public void setLanguageCodes(java.util.Collection<LanguageCodeItem> languageCodes) {
        if (languageCodes == null) {
            this.languageCodes = null;
            return;
        }

        this.languageCodes = new java.util.ArrayList<LanguageCodeItem>(languageCodes);
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter is used with multi-language
     * identification. For single-language identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguageCodes(java.util.Collection)} or {@link #withLanguageCodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param languageCodes
     *        The language codes used to create your transcription job. This parameter is used with multi-language
     *        identification. For single-language identification, the singular version of this parameter,
     *        <code>LanguageCode</code>, is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withLanguageCodes(LanguageCodeItem... languageCodes) {
        if (this.languageCodes == null) {
            setLanguageCodes(new java.util.ArrayList<LanguageCodeItem>(languageCodes.length));
        }
        for (LanguageCodeItem ele : languageCodes) {
            this.languageCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter is used with multi-language
     * identification. For single-language identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * 
     * @param languageCodes
     *        The language codes used to create your transcription job. This parameter is used with multi-language
     *        identification. For single-language identification, the singular version of this parameter,
     *        <code>LanguageCode</code>, is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJobSummary withLanguageCodes(java.util.Collection<LanguageCodeItem> languageCodes) {
        setLanguageCodes(languageCodes);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: ").append(getTranscriptionJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getOutputLocationType() != null)
            sb.append("OutputLocationType: ").append(getOutputLocationType()).append(",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: ").append(getContentRedaction()).append(",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: ").append(getModelSettings()).append(",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: ").append(getIdentifyLanguage()).append(",");
        if (getIdentifyMultipleLanguages() != null)
            sb.append("IdentifyMultipleLanguages: ").append(getIdentifyMultipleLanguages()).append(",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: ").append(getIdentifiedLanguageScore()).append(",");
        if (getLanguageCodes() != null)
            sb.append("LanguageCodes: ").append(getLanguageCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJobSummary == false)
            return false;
        TranscriptionJobSummary other = (TranscriptionJobSummary) obj;
        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getOutputLocationType() == null ^ this.getOutputLocationType() == null)
            return false;
        if (other.getOutputLocationType() != null && other.getOutputLocationType().equals(this.getOutputLocationType()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null && other.getModelSettings().equals(this.getModelSettings()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getIdentifyMultipleLanguages() == null ^ this.getIdentifyMultipleLanguages() == null)
            return false;
        if (other.getIdentifyMultipleLanguages() != null && other.getIdentifyMultipleLanguages().equals(this.getIdentifyMultipleLanguages()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        if (other.getLanguageCodes() == null ^ this.getLanguageCodes() == null)
            return false;
        if (other.getLanguageCodes() != null && other.getLanguageCodes().equals(this.getLanguageCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getOutputLocationType() == null) ? 0 : getOutputLocationType().hashCode());
        hashCode = prime * hashCode + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode + ((getIdentifyMultipleLanguages() == null) ? 0 : getIdentifyMultipleLanguages().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore().hashCode());
        hashCode = prime * hashCode + ((getLanguageCodes() == null) ? 0 : getLanguageCodes().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptionJobSummary clone() {
        try {
            return (TranscriptionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
