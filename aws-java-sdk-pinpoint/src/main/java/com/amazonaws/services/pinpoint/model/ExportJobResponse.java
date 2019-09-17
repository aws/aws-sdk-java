/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status and settings of a job that exports endpoint definitions to a file. The file can
 * be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or
 * downloaded directly to a computer by using the Amazon Pinpoint console.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ExportJobResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that's associated with the export job.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     * request.
     * </p>
     */
    private Integer completedPieces;
    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was completed.
     * </p>
     */
    private String completionDate;
    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The resource settings that apply to the export job.
     * </p>
     */
    private ExportJobResource definition;
    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     * request.
     * </p>
     */
    private Integer failedPieces;
    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the
     * export job, if any.
     * </p>
     */
    private java.util.List<String> failures;
    /**
     * <p>
     * The unique identifier for the export job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more
     * pieces in the job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     * typically because an error, such as a syntax error, occurred.
     * </p>
     */
    private Integer totalFailures;
    /**
     * <p>
     * The total number of pieces that must be processed to complete the export job. Each piece consists of an
     * approximately equal portion of the endpoint definitions that are part of the export job.
     * </p>
     */
    private Integer totalPieces;
    /**
     * <p>
     * The total number of endpoint definitions that were processed by the export job.
     * </p>
     */
    private Integer totalProcessed;
    /**
     * <p>
     * The job type. This value is EXPORT for export jobs.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The unique identifier for the application that's associated with the export job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that's associated with the export job.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the export job.
     * </p>
     * 
     * @return The unique identifier for the application that's associated with the export job.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the export job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that's associated with the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @param completedPieces
     *        The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     *        request.
     */

    public void setCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @return The number of pieces that were processed successfully (completed) by the export job, as of the time of
     *         the request.
     */

    public Integer getCompletedPieces() {
        return this.completedPieces;
    }

    /**
     * <p>
     * The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @param completedPieces
     *        The number of pieces that were processed successfully (completed) by the export job, as of the time of the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCompletedPieces(Integer completedPieces) {
        setCompletedPieces(completedPieces);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was completed.
     * </p>
     * 
     * @param completionDate
     *        The date, in ISO 8601 format, when the export job was completed.
     */

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was completed.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the export job was completed.
     */

    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was completed.
     * </p>
     * 
     * @param completionDate
     *        The date, in ISO 8601 format, when the export job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCompletionDate(String completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the export job was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was created.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the export job was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the export job was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The resource settings that apply to the export job.
     * </p>
     * 
     * @param definition
     *        The resource settings that apply to the export job.
     */

    public void setDefinition(ExportJobResource definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The resource settings that apply to the export job.
     * </p>
     * 
     * @return The resource settings that apply to the export job.
     */

    public ExportJobResource getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The resource settings that apply to the export job.
     * </p>
     * 
     * @param definition
     *        The resource settings that apply to the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withDefinition(ExportJobResource definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @param failedPieces
     *        The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     *        request.
     */

    public void setFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @return The number of pieces that weren't processed successfully (failed) by the export job, as of the time of
     *         the request.
     */

    public Integer getFailedPieces() {
        return this.failedPieces;
    }

    /**
     * <p>
     * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     * request.
     * </p>
     * 
     * @param failedPieces
     *        The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withFailedPieces(Integer failedPieces) {
        setFailedPieces(failedPieces);
        return this;
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the
     * export job, if any.
     * </p>
     * 
     * @return An array of entries, one for each of the first 100 entries that weren't processed successfully (failed)
     *         by the export job, if any.
     */

    public java.util.List<String> getFailures() {
        return failures;
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the
     * export job, if any.
     * </p>
     * 
     * @param failures
     *        An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by
     *        the export job, if any.
     */

    public void setFailures(java.util.Collection<String> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<String>(failures);
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the
     * export job, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by
     *        the export job, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withFailures(String... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<String>(failures.length));
        }
        for (String ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the
     * export job, if any.
     * </p>
     * 
     * @param failures
     *        An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by
     *        the export job, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withFailures(java.util.Collection<String> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the export job.
     * </p>
     * 
     * @param id
     *        The unique identifier for the export job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the export job.
     * </p>
     * 
     * @return The unique identifier for the export job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the export job.
     * </p>
     * 
     * @param id
     *        The unique identifier for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more
     * pieces in the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or
     *        more pieces in the job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more
     * pieces in the job.
     * </p>
     * 
     * @return The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or
     *         more pieces in the job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more
     * pieces in the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or
     *        more pieces in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobResponse withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more
     * pieces in the job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or
     *        more pieces in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobResponse withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     * typically because an error, such as a syntax error, occurred.
     * </p>
     * 
     * @param totalFailures
     *        The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     *        typically because an error, such as a syntax error, occurred.
     */

    public void setTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     * typically because an error, such as a syntax error, occurred.
     * </p>
     * 
     * @return The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     *         typically because an error, such as a syntax error, occurred.
     */

    public Integer getTotalFailures() {
        return this.totalFailures;
    }

    /**
     * <p>
     * The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     * typically because an error, such as a syntax error, occurred.
     * </p>
     * 
     * @param totalFailures
     *        The total number of endpoint definitions that weren't processed successfully (failed) by the export job,
     *        typically because an error, such as a syntax error, occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalFailures(Integer totalFailures) {
        setTotalFailures(totalFailures);
        return this;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the export job. Each piece consists of an
     * approximately equal portion of the endpoint definitions that are part of the export job.
     * </p>
     * 
     * @param totalPieces
     *        The total number of pieces that must be processed to complete the export job. Each piece consists of an
     *        approximately equal portion of the endpoint definitions that are part of the export job.
     */

    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the export job. Each piece consists of an
     * approximately equal portion of the endpoint definitions that are part of the export job.
     * </p>
     * 
     * @return The total number of pieces that must be processed to complete the export job. Each piece consists of an
     *         approximately equal portion of the endpoint definitions that are part of the export job.
     */

    public Integer getTotalPieces() {
        return this.totalPieces;
    }

    /**
     * <p>
     * The total number of pieces that must be processed to complete the export job. Each piece consists of an
     * approximately equal portion of the endpoint definitions that are part of the export job.
     * </p>
     * 
     * @param totalPieces
     *        The total number of pieces that must be processed to complete the export job. Each piece consists of an
     *        approximately equal portion of the endpoint definitions that are part of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalPieces(Integer totalPieces) {
        setTotalPieces(totalPieces);
        return this;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the export job.
     * </p>
     * 
     * @param totalProcessed
     *        The total number of endpoint definitions that were processed by the export job.
     */

    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the export job.
     * </p>
     * 
     * @return The total number of endpoint definitions that were processed by the export job.
     */

    public Integer getTotalProcessed() {
        return this.totalProcessed;
    }

    /**
     * <p>
     * The total number of endpoint definitions that were processed by the export job.
     * </p>
     * 
     * @param totalProcessed
     *        The total number of endpoint definitions that were processed by the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalProcessed(Integer totalProcessed) {
        setTotalProcessed(totalProcessed);
        return this;
    }

    /**
     * <p>
     * The job type. This value is EXPORT for export jobs.
     * </p>
     * 
     * @param type
     *        The job type. This value is EXPORT for export jobs.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type. This value is EXPORT for export jobs.
     * </p>
     * 
     * @return The job type. This value is EXPORT for export jobs.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The job type. This value is EXPORT for export jobs.
     * </p>
     * 
     * @param type
     *        The job type. This value is EXPORT for export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withType(String type) {
        setType(type);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCompletedPieces() != null)
            sb.append("CompletedPieces: ").append(getCompletedPieces()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getFailedPieces() != null)
            sb.append("FailedPieces: ").append(getFailedPieces()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getTotalFailures() != null)
            sb.append("TotalFailures: ").append(getTotalFailures()).append(",");
        if (getTotalPieces() != null)
            sb.append("TotalPieces: ").append(getTotalPieces()).append(",");
        if (getTotalProcessed() != null)
            sb.append("TotalProcessed: ").append(getTotalProcessed()).append(",");
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

        if (obj instanceof ExportJobResponse == false)
            return false;
        ExportJobResponse other = (ExportJobResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCompletedPieces() == null ^ this.getCompletedPieces() == null)
            return false;
        if (other.getCompletedPieces() != null && other.getCompletedPieces().equals(this.getCompletedPieces()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getFailedPieces() == null ^ this.getFailedPieces() == null)
            return false;
        if (other.getFailedPieces() != null && other.getFailedPieces().equals(this.getFailedPieces()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getTotalFailures() == null ^ this.getTotalFailures() == null)
            return false;
        if (other.getTotalFailures() != null && other.getTotalFailures().equals(this.getTotalFailures()) == false)
            return false;
        if (other.getTotalPieces() == null ^ this.getTotalPieces() == null)
            return false;
        if (other.getTotalPieces() != null && other.getTotalPieces().equals(this.getTotalPieces()) == false)
            return false;
        if (other.getTotalProcessed() == null ^ this.getTotalProcessed() == null)
            return false;
        if (other.getTotalProcessed() != null && other.getTotalProcessed().equals(this.getTotalProcessed()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCompletedPieces() == null) ? 0 : getCompletedPieces().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getFailedPieces() == null) ? 0 : getFailedPieces().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getTotalFailures() == null) ? 0 : getTotalFailures().hashCode());
        hashCode = prime * hashCode + ((getTotalPieces() == null) ? 0 : getTotalPieces().hashCode());
        hashCode = prime * hashCode + ((getTotalProcessed() == null) ? 0 : getTotalProcessed().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ExportJobResponse clone() {
        try {
            return (ExportJobResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ExportJobResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
