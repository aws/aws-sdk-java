/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides detailed information about a Medical Scribe job.
 * </p>
 * <p>
 * To view the status of the specified Medical Scribe job, check the <code>MedicalScribeJobStatus</code> field. If the
 * status is <code>COMPLETED</code>, the job is finished and you can find the results at the locations specified in
 * <code>MedicalScribeOutput</code>. If the status is <code>FAILED</code>, <code>FailureReason</code> provides details
 * on why your Medical Scribe job failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalScribeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalScribeJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     */
    private String medicalScribeJobName;
    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your Medical Scribe job failed.
     * </p>
     */
    private String medicalScribeJobStatus;
    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only supported
     * language for Medical Scribe jobs.
     * </p>
     */
    private String languageCode;

    private Media media;
    /**
     * <p>
     * The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon S3 URI
     * for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the Transcript.
     * </p>
     */
    private MedicalScribeOutput medicalScribeOutput;
    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at 12:32
     * PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed using a <code>MedicalScribeSettings</code>
     * object. Specify <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are set. Enabled
     * <code>ShowSpeakerLabels</code> if <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not
     * set. One and only one of <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use <code>Settings</code>
     * to specify a vocabulary or vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must be specified if
     * <code>VocabularyFilterName</code> is set.
     * </p>
     */
    private MedicalScribeSettings settings;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files, write to the output bucket, and use your KMS key if supplied. If the role that you specify
     * doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     * participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in the
     * list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to <code>CLINICIAN</code>
     * (to indicate that it's the clinician speaking). Then you would set the <code>ChannelId</code> of the second
     * <code>ChannelDefinition</code> in the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that it's the patient speaking).
     * </p>
     */
    private java.util.List<MedicalScribeChannelDefinition> channelDefinitions;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param medicalScribeJobName
     *        The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     */

    public void setMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @return The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web
     *         Services account.
     */

    public String getMedicalScribeJobName() {
        return this.medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web Services
     * account.
     * </p>
     * 
     * @param medicalScribeJobName
     *        The name of the Medical Scribe job. Job names are case sensitive and must be unique within an Amazon Web
     *        Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withMedicalScribeJobName(String medicalScribeJobName) {
        setMedicalScribeJobName(medicalScribeJobName);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your Medical Scribe job failed.
     * </p>
     * 
     * @param medicalScribeJobStatus
     *        Provides the status of the specified Medical Scribe job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your Medical Scribe job failed.
     * @see MedicalScribeJobStatus
     */

    public void setMedicalScribeJobStatus(String medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your Medical Scribe job failed.
     * </p>
     * 
     * @return Provides the status of the specified Medical Scribe job.</p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *         specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     *         <code>FailureReason</code> provides details on why your Medical Scribe job failed.
     * @see MedicalScribeJobStatus
     */

    public String getMedicalScribeJobStatus() {
        return this.medicalScribeJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your Medical Scribe job failed.
     * </p>
     * 
     * @param medicalScribeJobStatus
     *        Provides the status of the specified Medical Scribe job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your Medical Scribe job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeJobStatus
     */

    public MedicalScribeJob withMedicalScribeJobStatus(String medicalScribeJobStatus) {
        setMedicalScribeJobStatus(medicalScribeJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     * specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>, <code>FailureReason</code>
     * provides details on why your Medical Scribe job failed.
     * </p>
     * 
     * @param medicalScribeJobStatus
     *        Provides the status of the specified Medical Scribe job.</p>
     *        <p>
     *        If the status is <code>COMPLETED</code>, the job is finished and you can find the results at the location
     *        specified in <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     *        <code>FailureReason</code> provides details on why your Medical Scribe job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeJobStatus
     */

    public MedicalScribeJob withMedicalScribeJobStatus(MedicalScribeJobStatus medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only supported
     * language for Medical Scribe jobs.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only
     *        supported language for Medical Scribe jobs.
     * @see MedicalScribeLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only supported
     * language for Medical Scribe jobs.
     * </p>
     * 
     * @return The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only
     *         supported language for Medical Scribe jobs.
     * @see MedicalScribeLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only supported
     * language for Medical Scribe jobs.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only
     *        supported language for Medical Scribe jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeLanguageCode
     */

    public MedicalScribeJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only supported
     * language for Medical Scribe jobs.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your Medical Scribe job. US English (<code>en-US</code>) is the only
     *        supported language for Medical Scribe jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeLanguageCode
     */

    public MedicalScribeJob withLanguageCode(MedicalScribeLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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

    public MedicalScribeJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon S3 URI
     * for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @param medicalScribeOutput
     *        The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon
     *        S3 URI for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the
     *        Transcript.
     */

    public void setMedicalScribeOutput(MedicalScribeOutput medicalScribeOutput) {
        this.medicalScribeOutput = medicalScribeOutput;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon S3 URI
     * for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @return The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon
     *         S3 URI for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the
     *         Transcript.
     */

    public MedicalScribeOutput getMedicalScribeOutput() {
        return this.medicalScribeOutput;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon S3 URI
     * for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @param medicalScribeOutput
     *        The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon
     *        S3 URI for the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the
     *        Transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withMedicalScribeOutput(MedicalScribeOutput medicalScribeOutput) {
        setMedicalScribeOutput(medicalScribeOutput);
        return this;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your Medical Scribe job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time your Medical Scribe job began processing.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at
     *         12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param startTime
     *        The date and time your Medical Scribe job began processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified Medical Scribe job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Medical Scribe job request was made.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at
     *         12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at 12:32 PM
     * UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param creationTime
     *        The date and time the specified Medical Scribe job request was made.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that started processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at 12:32
     * PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified Medical Scribe job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at 12:32
     * PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified Medical Scribe job finished processing.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at
     *         12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at 12:32
     * PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param completionTime
     *        The date and time the specified Medical Scribe job finished processing.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe job that finished processing at
     *        12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @return If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *         information about why the transcription job failed. See also: <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     * about why the transcription job failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains
     *        information about why the transcription job failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed using a <code>MedicalScribeSettings</code>
     * object. Specify <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are set. Enabled
     * <code>ShowSpeakerLabels</code> if <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not
     * set. One and only one of <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use <code>Settings</code>
     * to specify a vocabulary or vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must be specified if
     * <code>VocabularyFilterName</code> is set.
     * </p>
     * 
     * @param settings
     *        Makes it possible to control how your Medical Scribe job is processed using a
     *        <code>MedicalScribeSettings</code> object. Specify <code>ChannelIdentification</code> if
     *        <code>ChannelDefinitions</code> are set. Enabled <code>ShowSpeakerLabels</code> if
     *        <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not set. One and only one of
     *        <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     *        <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use
     *        <code>Settings</code> to specify a vocabulary or vocabulary filter or both using
     *        <code>VocabularyName</code>, <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must
     *        be specified if <code>VocabularyFilterName</code> is set.
     */

    public void setSettings(MedicalScribeSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed using a <code>MedicalScribeSettings</code>
     * object. Specify <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are set. Enabled
     * <code>ShowSpeakerLabels</code> if <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not
     * set. One and only one of <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use <code>Settings</code>
     * to specify a vocabulary or vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must be specified if
     * <code>VocabularyFilterName</code> is set.
     * </p>
     * 
     * @return Makes it possible to control how your Medical Scribe job is processed using a
     *         <code>MedicalScribeSettings</code> object. Specify <code>ChannelIdentification</code> if
     *         <code>ChannelDefinitions</code> are set. Enabled <code>ShowSpeakerLabels</code> if
     *         <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not set. One and only one of
     *         <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     *         <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use
     *         <code>Settings</code> to specify a vocabulary or vocabulary filter or both using
     *         <code>VocabularyName</code>, <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must
     *         be specified if <code>VocabularyFilterName</code> is set.
     */

    public MedicalScribeSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed using a <code>MedicalScribeSettings</code>
     * object. Specify <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are set. Enabled
     * <code>ShowSpeakerLabels</code> if <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not
     * set. One and only one of <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use <code>Settings</code>
     * to specify a vocabulary or vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must be specified if
     * <code>VocabularyFilterName</code> is set.
     * </p>
     * 
     * @param settings
     *        Makes it possible to control how your Medical Scribe job is processed using a
     *        <code>MedicalScribeSettings</code> object. Specify <code>ChannelIdentification</code> if
     *        <code>ChannelDefinitions</code> are set. Enabled <code>ShowSpeakerLabels</code> if
     *        <code>ChannelIdentification</code> and <code>ChannelDefinitions</code> are not set. One and only one of
     *        <code>ChannelIdentification</code> and <code>ShowSpeakerLabels</code> must be set. If
     *        <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must also be set. Use
     *        <code>Settings</code> to specify a vocabulary or vocabulary filter or both using
     *        <code>VocabularyName</code>, <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code> must
     *        be specified if <code>VocabularyFilterName</code> is set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withSettings(MedicalScribeSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files, write to the output bucket, and use your KMS key if supplied. If the role that you specify
     * doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files, write to the output bucket, and use your KMS key if supplied. If the role that
     *        you specify doesn’t have the appropriate permissions your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files, write to the output bucket, and use your KMS key if supplied. If the role that you specify
     * doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *         contains your input files, write to the output bucket, and use your KMS key if supplied. If the role that
     *         you specify doesn’t have the appropriate permissions your request fails.</p>
     *         <p>
     *         IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *         example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *         ARNs</a>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files, write to the output bucket, and use your KMS key if supplied. If the role that you specify
     * doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files, write to the output bucket, and use your KMS key if supplied. If the role that
     *        you specify doesn’t have the appropriate permissions your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     * participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in the
     * list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to <code>CLINICIAN</code>
     * (to indicate that it's the clinician speaking). Then you would set the <code>ChannelId</code> of the second
     * <code>ChannelDefinition</code> in the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that it's the patient speaking).
     * </p>
     * 
     * @return Makes it possible to specify which speaker is on which channel. For example, if the clinician is the
     *         first participant to speak, you would set <code>ChannelId</code> of the first
     *         <code>ChannelDefinition</code> in the list to <code>0</code> (to indicate the first channel) and
     *         <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that it's the clinician speaking).
     *         Then you would set the <code>ChannelId</code> of the second <code>ChannelDefinition</code> in the list to
     *         <code>1</code> (to indicate the second channel) and <code>ParticipantRole</code> to <code>PATIENT</code>
     *         (to indicate that it's the patient speaking).
     */

    public java.util.List<MedicalScribeChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     * participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in the
     * list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to <code>CLINICIAN</code>
     * (to indicate that it's the clinician speaking). Then you would set the <code>ChannelId</code> of the second
     * <code>ChannelDefinition</code> in the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that it's the patient speaking).
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     *        participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     *        the list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to
     *        <code>CLINICIAN</code> (to indicate that it's the clinician speaking). Then you would set the
     *        <code>ChannelId</code> of the second <code>ChannelDefinition</code> in the list to <code>1</code> (to
     *        indicate the second channel) and <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     *        it's the patient speaking).
     */

    public void setChannelDefinitions(java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<MedicalScribeChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     * participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in the
     * list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to <code>CLINICIAN</code>
     * (to indicate that it's the clinician speaking). Then you would set the <code>ChannelId</code> of the second
     * <code>ChannelDefinition</code> in the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that it's the patient speaking).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     *        participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     *        the list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to
     *        <code>CLINICIAN</code> (to indicate that it's the clinician speaking). Then you would set the
     *        <code>ChannelId</code> of the second <code>ChannelDefinition</code> in the list to <code>1</code> (to
     *        indicate the second channel) and <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     *        it's the patient speaking).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withChannelDefinitions(MedicalScribeChannelDefinition... channelDefinitions) {
        if (this.channelDefinitions == null) {
            setChannelDefinitions(new java.util.ArrayList<MedicalScribeChannelDefinition>(channelDefinitions.length));
        }
        for (MedicalScribeChannelDefinition ele : channelDefinitions) {
            this.channelDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     * participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in the
     * list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to <code>CLINICIAN</code>
     * (to indicate that it's the clinician speaking). Then you would set the <code>ChannelId</code> of the second
     * <code>ChannelDefinition</code> in the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that it's the patient speaking).
     * </p>
     * 
     * @param channelDefinitions
     *        Makes it possible to specify which speaker is on which channel. For example, if the clinician is the first
     *        participant to speak, you would set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     *        the list to <code>0</code> (to indicate the first channel) and <code>ParticipantRole</code> to
     *        <code>CLINICIAN</code> (to indicate that it's the clinician speaking). Then you would set the
     *        <code>ChannelId</code> of the second <code>ChannelDefinition</code> in the list to <code>1</code> (to
     *        indicate the second channel) and <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     *        it's the patient speaking).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withChannelDefinitions(java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.</p>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.
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
     *        Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to the Medica Scribe job.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeJob withTags(java.util.Collection<Tag> tags) {
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
        if (getMedicalScribeJobName() != null)
            sb.append("MedicalScribeJobName: ").append(getMedicalScribeJobName()).append(",");
        if (getMedicalScribeJobStatus() != null)
            sb.append("MedicalScribeJobStatus: ").append(getMedicalScribeJobStatus()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getMedicalScribeOutput() != null)
            sb.append("MedicalScribeOutput: ").append(getMedicalScribeOutput()).append(",");
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
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: ").append(getChannelDefinitions()).append(",");
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

        if (obj instanceof MedicalScribeJob == false)
            return false;
        MedicalScribeJob other = (MedicalScribeJob) obj;
        if (other.getMedicalScribeJobName() == null ^ this.getMedicalScribeJobName() == null)
            return false;
        if (other.getMedicalScribeJobName() != null && other.getMedicalScribeJobName().equals(this.getMedicalScribeJobName()) == false)
            return false;
        if (other.getMedicalScribeJobStatus() == null ^ this.getMedicalScribeJobStatus() == null)
            return false;
        if (other.getMedicalScribeJobStatus() != null && other.getMedicalScribeJobStatus().equals(this.getMedicalScribeJobStatus()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getMedicalScribeOutput() == null ^ this.getMedicalScribeOutput() == null)
            return false;
        if (other.getMedicalScribeOutput() != null && other.getMedicalScribeOutput().equals(this.getMedicalScribeOutput()) == false)
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
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
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

        hashCode = prime * hashCode + ((getMedicalScribeJobName() == null) ? 0 : getMedicalScribeJobName().hashCode());
        hashCode = prime * hashCode + ((getMedicalScribeJobStatus() == null) ? 0 : getMedicalScribeJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getMedicalScribeOutput() == null) ? 0 : getMedicalScribeOutput().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MedicalScribeJob clone() {
        try {
            return (MedicalScribeJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalScribeJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
