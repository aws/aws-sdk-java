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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about a transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalTranscriptionJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     */
    private String medicalTranscriptionJobName;
    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Indicates the location of the transcription job's output.
     * </p>
     * <p>
     * The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field when the
     * </p>
     */
    private String outputLocationType;
    /**
     * <p>
     * The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * </p>
     */
    private String specialty;
    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription job. If
     * the value is <code>PHI</code>, you've configured the transcription job to identify personal health information
     * (PHI).
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of a medical transcription job.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * 
     * @return The name of a medical transcription job.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name of a medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the medical transcription job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     * 
     * @return A timestamp that shows when the medical transcription job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the medical transcription job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job began processing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @return A timestamp that shows when the job began processing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job began processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @return A timestamp that shows when the job was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @return The language of the transcript in the source audio file.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the medical transcription job.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * 
     * @return The status of the medical transcription job.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @return If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, a description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output.
     * </p>
     * <p>
     * The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field when the
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the transcription job's output.</p>
     *        <p>
     *        The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field
     *        when the
     * @see OutputLocationType
     */

    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output.
     * </p>
     * <p>
     * The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field when the
     * </p>
     * 
     * @return Indicates the location of the transcription job's output.</p>
     *         <p>
     *         The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field
     *         when the
     * @see OutputLocationType
     */

    public String getOutputLocationType() {
        return this.outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output.
     * </p>
     * <p>
     * The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field when the
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the transcription job's output.</p>
     *        <p>
     *        The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field
     *        when the
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public MedicalTranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        setOutputLocationType(outputLocationType);
        return this;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output.
     * </p>
     * <p>
     * The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field when the
     * </p>
     * 
     * @param outputLocationType
     *        Indicates the location of the transcription job's output.</p>
     *        <p>
     *        The <code>CUSTOMER_BUCKET</code> is the S3 location provided in the <code>OutputBucketName</code> field
     *        when the
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputLocationType
     */

    public MedicalTranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * </p>
     * 
     * @return The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJobSummary withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * </p>
     * 
     * @param specialty
     *        The medical specialty of the transcription job. <code>Primary care</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJobSummary withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription job. If
     * the value is <code>PHI</code>, you've configured the transcription job to identify personal health information
     * (PHI).
     * </p>
     * 
     * @param contentIdentificationType
     *        Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription
     *        job. If the value is <code>PHI</code>, you've configured the transcription job to identify personal health
     *        information (PHI).
     * @see MedicalContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription job. If
     * the value is <code>PHI</code>, you've configured the transcription job to identify personal health information
     * (PHI).
     * </p>
     * 
     * @return Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription
     *         job. If the value is <code>PHI</code>, you've configured the transcription job to identify personal
     *         health information (PHI).
     * @see MedicalContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription job. If
     * the value is <code>PHI</code>, you've configured the transcription job to identify personal health information
     * (PHI).
     * </p>
     * 
     * @param contentIdentificationType
     *        Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription
     *        job. If the value is <code>PHI</code>, you've configured the transcription job to identify personal health
     *        information (PHI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public MedicalTranscriptionJobSummary withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription job. If
     * the value is <code>PHI</code>, you've configured the transcription job to identify personal health information
     * (PHI).
     * </p>
     * 
     * @param contentIdentificationType
     *        Shows the type of information you've configured Amazon Transcribe Medical to identify in a transcription
     *        job. If the value is <code>PHI</code>, you've configured the transcription job to identify personal health
     *        information (PHI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalContentIdentificationType
     */

    public MedicalTranscriptionJobSummary withContentIdentificationType(MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * 
     * @param type
     *        The speech of the clinician in the input audio.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * 
     * @return The speech of the clinician in the input audio.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * 
     * @param type
     *        The speech of the clinician in the input audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public MedicalTranscriptionJobSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * 
     * @param type
     *        The speech of the clinician in the input audio.
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
