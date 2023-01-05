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
 * Provides detailed information about a specific Call Analytics job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     */
    private String callAnalyticsJobName;
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
     * The date and time your Call Analytics job began processing.
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
     * The language code used to create your Call Analytics transcription.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Provides the status of your Call Analytics job.
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
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;

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

    public CallAnalyticsJobSummary withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
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

    public CallAnalyticsJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time your Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your Call Analytics job began processing.</p>
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
     * The date and time your Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time your Call Analytics job began processing.</p>
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
     * The date and time your Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your Call Analytics job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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

    public CallAnalyticsJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics transcription.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics transcription.
     * </p>
     * 
     * @return The language code used to create your Call Analytics transcription.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics transcription.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Call Analytics transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of your Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of your Call Analytics job.</p>
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
     * Provides the status of your Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @return Provides the status of your Call Analytics job.</p>
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
     * Provides the status of your Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of your Call Analytics job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJobSummary withCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        setCallAnalyticsJobStatus(callAnalyticsJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of your Call Analytics job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     * transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        Provides the status of your Call Analytics job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>, if you requested
     *        transcript redaction). If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
     *        on why your transcription job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJobSummary withCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the Call Analytics job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @return If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *         information about why the Call Analytics job failed. See also: <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the Call Analytics job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the Call Analytics job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getCallAnalyticsJobStatus() != null)
            sb.append("CallAnalyticsJobStatus: ").append(getCallAnalyticsJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobSummary == false)
            return false;
        CallAnalyticsJobSummary other = (CallAnalyticsJobSummary) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
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
        if (other.getCallAnalyticsJobStatus() == null ^ this.getCallAnalyticsJobStatus() == null)
            return false;
        if (other.getCallAnalyticsJobStatus() != null && other.getCallAnalyticsJobStatus().equals(this.getCallAnalyticsJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsJobStatus() == null) ? 0 : getCallAnalyticsJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJobSummary clone() {
        try {
            return (CallAnalyticsJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
