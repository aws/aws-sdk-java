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
 * Provides detailed information about a specific medical transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalTranscriptionJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web
     * Services account.
     * </p>
     */
    private String medicalTranscriptionJobName;
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
     * The date and time your medical transcription job began processing.
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
     * The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Provides the status of your medical transcription job.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Indicates where the specified medical transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> field.
     * </p>
     */
    private String outputLocationType;
    /**
     * <p>
     * Provides the medical specialty represented in your media.
     * </p>
     */
    private String specialty;
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
     * Indicates whether the input media is a dictation or a conversation, as specified in the
     * <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     */
    private String type;

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

    public MedicalTranscriptionJobSummary withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
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

    public MedicalTranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time your medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your medical transcription job began processing.</p>
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
     * The date and time your medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time your medical transcription job began processing.</p>
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
     * The date and time your medical transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your medical transcription job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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

    public MedicalTranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     *        supported language for medical transcriptions.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @return The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     *         supported language for medical transcriptions.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     *        supported language for medical transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     * supported language for medical transcriptions.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your medical transcription. US English (<code>en-US</code>) is the only
     *        supported language for medical transcriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of your medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your medical transcription job.</p>
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
     * Provides the status of your medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @return Provides the status of your medical transcription job.</p>
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
     * Provides the status of your medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your medical transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of your medical transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your transcription job failed.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        Provides the status of your medical transcription job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
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

    public MedicalTranscriptionJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Indicates where the specified medical transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified medical transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        field.
     * @see OutputLocationType
     */

    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified medical transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @return Indicates where the specified medical transcription output is stored.</p>
     *         <p>
     *         If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using
     *         the <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code>
     *         in your request, your output is located in the path you specified in your request.
     *         </p>
     *         <p>
     *         If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To
     *         access a transcript stored in a service-managed bucket, use the URI shown in the
     *         <code>TranscriptFileUri</code> field.
     * @see OutputLocationType
     */

    public String getOutputLocationType() {
        return this.outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified medical transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified medical transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public MedicalTranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        setOutputLocationType(outputLocationType);
        return this;
    }

    /**
     * <p>
     * Indicates where the specified medical transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     * <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access a
     * transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code> field.
     * </p>
     * 
     * @param outputLocationType
     *        Indicates where the specified medical transcription output is stored.</p>
     *        <p>
     *        If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon S3 bucket you specified using the
     *        <code>OutputBucketName</code> parameter in your request. If you also included <code>OutputKey</code> in
     *        your request, your output is located in the path you specified in your request.
     *        </p>
     *        <p>
     *        If the value is <code>SERVICE_BUCKET</code>, the location is a service-managed Amazon S3 bucket. To access
     *        a transcript stored in a service-managed bucket, use the URI shown in the <code>TranscriptFileUri</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public MedicalTranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Provides the medical specialty represented in your media.
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * Provides the medical specialty represented in your media.
     * </p>
     * 
     * @return Provides the medical specialty represented in your media.
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * Provides the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Provides the medical specialty represented in your media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJobSummary withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * Provides the medical specialty represented in your media.
     * </p>
     * 
     * @param specialty
     *        Provides the medical specialty represented in your media.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJobSummary withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
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

    public MedicalTranscriptionJobSummary withContentIdentificationType(String contentIdentificationType) {
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

    public MedicalTranscriptionJobSummary withContentIdentificationType(MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
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

    public MedicalTranscriptionJobSummary withType(String type) {
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

    public MedicalTranscriptionJobSummary withType(Type type) {
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
        if (getSpecialty() != null)
            sb.append("Specialty: ").append(getSpecialty()).append(",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: ").append(getContentIdentificationType()).append(",");
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

        if (obj instanceof MedicalTranscriptionJobSummary == false)
            return false;
        MedicalTranscriptionJobSummary other = (MedicalTranscriptionJobSummary) obj;
        if (other.getMedicalTranscriptionJobName() == null ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null && other.getMedicalTranscriptionJobName().equals(this.getMedicalTranscriptionJobName()) == false)
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
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getContentIdentificationType() == null ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getOutputLocationType() == null) ? 0 : getOutputLocationType().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MedicalTranscriptionJobSummary clone() {
        try {
            return (MedicalTranscriptionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalTranscriptionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
