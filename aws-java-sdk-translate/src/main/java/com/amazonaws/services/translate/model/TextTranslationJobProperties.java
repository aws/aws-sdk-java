/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a translation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TextTranslationJobProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextTranslationJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The status of the translation job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during the translation job.
     * </p>
     */
    private JobDetails jobDetails;
    /**
     * <p>
     * The language code of the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code of the language of the target text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;
    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     * applied per <a>StartTextTranslationJob</a> request at this time.
     * </p>
     */
    private java.util.List<String> terminologyNames;
    /**
     * <p>
     * An explanation of any errors that may have occured during the translation job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     */
    private java.util.Date submittedTime;
    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The input configuration properties that were specified when the job was requested.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The output configuration properties that were specified when the job was requested.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate
     * read access to the job's input data.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * 
     * @param jobId
     *        The ID of the translation job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * 
     * @return The ID of the translation job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * 
     * @param jobId
     *        The ID of the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * 
     * @param jobName
     *        The user-defined name of the translation job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * 
     * @return The user-defined name of the translation job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * 
     * @param jobName
     *        The user-defined name of the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the translation job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * 
     * @return The status of the translation job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TextTranslationJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TextTranslationJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during the translation job.
     * </p>
     * 
     * @param jobDetails
     *        The number of documents successfully and unsuccessfully processed during the translation job.
     */

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during the translation job.
     * </p>
     * 
     * @return The number of documents successfully and unsuccessfully processed during the translation job.
     */

    public JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during the translation job.
     * </p>
     * 
     * @param jobDetails
     *        The number of documents successfully and unsuccessfully processed during the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withJobDetails(JobDetails jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the language of the source text. The language must be a language supported by Amazon
     *        Translate.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @return The language code of the language of the source text. The language must be a language supported by Amazon
     *         Translate.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the language of the source text. The language must be a language supported by Amazon
     *        Translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @return The language code of the language of the target text. The language must be a language supported by Amazon
     *         Translate.
     */

    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the language of the target text. The language must be a language supported by Amazon
     *        Translate.
     */

    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLanguageCodes(java.util.Collection)} or {@link #withTargetLanguageCodes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the language of the target text. The language must be a language supported by Amazon
     *        Translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withTargetLanguageCodes(String... targetLanguageCodes) {
        if (this.targetLanguageCodes == null) {
            setTargetLanguageCodes(new java.util.ArrayList<String>(targetLanguageCodes.length));
        }
        for (String ele : targetLanguageCodes) {
            this.targetLanguageCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language code of the language of the target text. The language must be a language supported by Amazon
     *        Translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     * applied per <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * 
     * @return A list containing the names of the terminologies applied to a translation job. Only one terminology can
     *         be applied per <a>StartTextTranslationJob</a> request at this time.
     */

    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     * applied per <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * 
     * @param terminologyNames
     *        A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     *        applied per <a>StartTextTranslationJob</a> request at this time.
     */

    public void setTerminologyNames(java.util.Collection<String> terminologyNames) {
        if (terminologyNames == null) {
            this.terminologyNames = null;
            return;
        }

        this.terminologyNames = new java.util.ArrayList<String>(terminologyNames);
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     * applied per <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminologyNames(java.util.Collection)} or {@link #withTerminologyNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param terminologyNames
     *        A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     *        applied per <a>StartTextTranslationJob</a> request at this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withTerminologyNames(String... terminologyNames) {
        if (this.terminologyNames == null) {
            setTerminologyNames(new java.util.ArrayList<String>(terminologyNames.length));
        }
        for (String ele : terminologyNames) {
            this.terminologyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     * applied per <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * 
     * @param terminologyNames
     *        A list containing the names of the terminologies applied to a translation job. Only one terminology can be
     *        applied per <a>StartTextTranslationJob</a> request at this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withTerminologyNames(java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * An explanation of any errors that may have occured during the translation job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occured during the translation job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occured during the translation job.
     * </p>
     * 
     * @return An explanation of any errors that may have occured during the translation job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occured during the translation job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occured during the translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     * 
     * @param submittedTime
     *        The time at which the translation job was submitted.
     */

    public void setSubmittedTime(java.util.Date submittedTime) {
        this.submittedTime = submittedTime;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     * 
     * @return The time at which the translation job was submitted.
     */

    public java.util.Date getSubmittedTime() {
        return this.submittedTime;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     * 
     * @param submittedTime
     *        The time at which the translation job was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withSubmittedTime(java.util.Date submittedTime) {
        setSubmittedTime(submittedTime);
        return this;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the translation job ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     * 
     * @return The time at which the translation job ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the translation job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @param inputDataConfig
     *        The input configuration properties that were specified when the job was requested.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @return The input configuration properties that were specified when the job was requested.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @param inputDataConfig
     *        The input configuration properties that were specified when the job was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @param outputDataConfig
     *        The output configuration properties that were specified when the job was requested.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @return The output configuration properties that were specified when the job was requested.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was requested.
     * </p>
     * 
     * @param outputDataConfig
     *        The output configuration properties that were specified when the job was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate
     * read access to the job's input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon
     *        Translate read access to the job's input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate
     * read access to the job's input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon
     *         Translate read access to the job's input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate
     * read access to the job's input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon
     *        Translate read access to the job's input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTranslationJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: ").append(getTargetLanguageCodes()).append(",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: ").append(getTerminologyNames()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmittedTime() != null)
            sb.append("SubmittedTime: ").append(getSubmittedTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextTranslationJobProperties == false)
            return false;
        TextTranslationJobProperties other = (TextTranslationJobProperties) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getTerminologyNames() == null ^ this.getTerminologyNames() == null)
            return false;
        if (other.getTerminologyNames() != null && other.getTerminologyNames().equals(this.getTerminologyNames()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmittedTime() == null ^ this.getSubmittedTime() == null)
            return false;
        if (other.getSubmittedTime() != null && other.getSubmittedTime().equals(this.getSubmittedTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmittedTime() == null) ? 0 : getSubmittedTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public TextTranslationJobProperties clone() {
        try {
            return (TextTranslationJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TextTranslationJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
