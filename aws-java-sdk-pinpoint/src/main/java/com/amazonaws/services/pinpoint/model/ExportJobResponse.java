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
 * Export job response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ExportJobResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobResponse implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID of the application associated with the export job. */
    private String applicationId;
    /** The number of pieces that have successfully completed as of the time of the request. */
    private Integer completedPieces;
    /** The date the job completed in ISO 8601 format. */
    private String completionDate;
    /** The date the job was created in ISO 8601 format. */
    private String creationDate;
    /** The export job settings. */
    private ExportJobResource definition;
    /** The number of pieces that failed to be processed as of the time of the request. */
    private Integer failedPieces;
    /** Provides up to 100 of the first failed entries for the job, if any exist. */
    private java.util.List<String> failures;
    /** The unique ID of the job. */
    private String id;
    /**
     * The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     * 
     * The job status is FAILED if one or more pieces failed.
     */
    private String jobStatus;
    /** The number of endpoints that were not processed; for example, because of syntax errors. */
    private Integer totalFailures;
    /**
     * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion
     * of the endpoints.
     */
    private Integer totalPieces;
    /** The number of endpoints that were processed by the job. */
    private Integer totalProcessed;
    /** The job type. Will be 'EXPORT'. */
    private String type;

    /**
     * The unique ID of the application associated with the export job.
     * 
     * @param applicationId
     *        The unique ID of the application associated with the export job.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the application associated with the export job.
     * 
     * @return The unique ID of the application associated with the export job.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of the application associated with the export job.
     * 
     * @param applicationId
     *        The unique ID of the application associated with the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The number of pieces that have successfully completed as of the time of the request.
     * 
     * @param completedPieces
     *        The number of pieces that have successfully completed as of the time of the request.
     */

    public void setCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
    }

    /**
     * The number of pieces that have successfully completed as of the time of the request.
     * 
     * @return The number of pieces that have successfully completed as of the time of the request.
     */

    public Integer getCompletedPieces() {
        return this.completedPieces;
    }

    /**
     * The number of pieces that have successfully completed as of the time of the request.
     * 
     * @param completedPieces
     *        The number of pieces that have successfully completed as of the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCompletedPieces(Integer completedPieces) {
        setCompletedPieces(completedPieces);
        return this;
    }

    /**
     * The date the job completed in ISO 8601 format.
     * 
     * @param completionDate
     *        The date the job completed in ISO 8601 format.
     */

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * The date the job completed in ISO 8601 format.
     * 
     * @return The date the job completed in ISO 8601 format.
     */

    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * The date the job completed in ISO 8601 format.
     * 
     * @param completionDate
     *        The date the job completed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCompletionDate(String completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * The date the job was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the job was created in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the job was created in ISO 8601 format.
     * 
     * @return The date the job was created in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date the job was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the job was created in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The export job settings.
     * 
     * @param definition
     *        The export job settings.
     */

    public void setDefinition(ExportJobResource definition) {
        this.definition = definition;
    }

    /**
     * The export job settings.
     * 
     * @return The export job settings.
     */

    public ExportJobResource getDefinition() {
        return this.definition;
    }

    /**
     * The export job settings.
     * 
     * @param definition
     *        The export job settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withDefinition(ExportJobResource definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * The number of pieces that failed to be processed as of the time of the request.
     * 
     * @param failedPieces
     *        The number of pieces that failed to be processed as of the time of the request.
     */

    public void setFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
    }

    /**
     * The number of pieces that failed to be processed as of the time of the request.
     * 
     * @return The number of pieces that failed to be processed as of the time of the request.
     */

    public Integer getFailedPieces() {
        return this.failedPieces;
    }

    /**
     * The number of pieces that failed to be processed as of the time of the request.
     * 
     * @param failedPieces
     *        The number of pieces that failed to be processed as of the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withFailedPieces(Integer failedPieces) {
        setFailedPieces(failedPieces);
        return this;
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * 
     * @return Provides up to 100 of the first failed entries for the job, if any exist.
     */

    public java.util.List<String> getFailures() {
        return failures;
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * 
     * @param failures
     *        Provides up to 100 of the first failed entries for the job, if any exist.
     */

    public void setFailures(java.util.Collection<String> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<String>(failures);
    }

    /**
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Provides up to 100 of the first failed entries for the job, if any exist.
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
     * Provides up to 100 of the first failed entries for the job, if any exist.
     * 
     * @param failures
     *        Provides up to 100 of the first failed entries for the job, if any exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withFailures(java.util.Collection<String> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * The unique ID of the job.
     * 
     * @param id
     *        The unique ID of the job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the job.
     * 
     * @return The unique ID of the job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique ID of the job.
     * 
     * @param id
     *        The unique ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     * 
     * The job status is FAILED if one or more pieces failed.
     * 
     * @param jobStatus
     *        The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *        FAILED
     * 
     *        The job status is FAILED if one or more pieces failed.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     * 
     * The job status is FAILED if one or more pieces failed.
     * 
     * @return The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *         FAILED
     * 
     *         The job status is FAILED if one or more pieces failed.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     * 
     * The job status is FAILED if one or more pieces failed.
     * 
     * @param jobStatus
     *        The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *        FAILED
     * 
     *        The job status is FAILED if one or more pieces failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobResponse withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
     * 
     * The job status is FAILED if one or more pieces failed.
     * 
     * @param jobStatus
     *        The status of the job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     *        FAILED
     * 
     *        The job status is FAILED if one or more pieces failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobResponse withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * The number of endpoints that were not processed; for example, because of syntax errors.
     * 
     * @param totalFailures
     *        The number of endpoints that were not processed; for example, because of syntax errors.
     */

    public void setTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
    }

    /**
     * The number of endpoints that were not processed; for example, because of syntax errors.
     * 
     * @return The number of endpoints that were not processed; for example, because of syntax errors.
     */

    public Integer getTotalFailures() {
        return this.totalFailures;
    }

    /**
     * The number of endpoints that were not processed; for example, because of syntax errors.
     * 
     * @param totalFailures
     *        The number of endpoints that were not processed; for example, because of syntax errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalFailures(Integer totalFailures) {
        setTotalFailures(totalFailures);
        return this;
    }

    /**
     * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion
     * of the endpoints.
     * 
     * @param totalPieces
     *        The total number of pieces that must be processed to finish the job. Each piece is an approximately equal
     *        portion of the endpoints.
     */

    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    /**
     * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion
     * of the endpoints.
     * 
     * @return The total number of pieces that must be processed to finish the job. Each piece is an approximately equal
     *         portion of the endpoints.
     */

    public Integer getTotalPieces() {
        return this.totalPieces;
    }

    /**
     * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion
     * of the endpoints.
     * 
     * @param totalPieces
     *        The total number of pieces that must be processed to finish the job. Each piece is an approximately equal
     *        portion of the endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalPieces(Integer totalPieces) {
        setTotalPieces(totalPieces);
        return this;
    }

    /**
     * The number of endpoints that were processed by the job.
     * 
     * @param totalProcessed
     *        The number of endpoints that were processed by the job.
     */

    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the job.
     * 
     * @return The number of endpoints that were processed by the job.
     */

    public Integer getTotalProcessed() {
        return this.totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the job.
     * 
     * @param totalProcessed
     *        The number of endpoints that were processed by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobResponse withTotalProcessed(Integer totalProcessed) {
        setTotalProcessed(totalProcessed);
        return this;
    }

    /**
     * The job type. Will be 'EXPORT'.
     * 
     * @param type
     *        The job type. Will be 'EXPORT'.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The job type. Will be 'EXPORT'.
     * 
     * @return The job type. Will be 'EXPORT'.
     */

    public String getType() {
        return this.type;
    }

    /**
     * The job type. Will be 'EXPORT'.
     * 
     * @param type
     *        The job type. Will be 'EXPORT'.
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
