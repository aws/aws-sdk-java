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
 * Import job response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ImportJobResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobResponse implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID of the application to which the import job applies. */
    private String applicationId;
    /** The number of pieces that have successfully imported as of the time of the request. */
    private Integer completedPieces;
    /** The date the import job completed in ISO 8601 format. */
    private String completionDate;
    /** The date the import job was created in ISO 8601 format. */
    private String creationDate;
    /** The import job settings. */
    private ImportJobResource definition;
    /** The number of pieces that have failed to import as of the time of the request. */
    private Integer failedPieces;
    /** Provides up to 100 of the first failed entries for the job, if any exist. */
    private java.util.List<String> failures;
    /** The unique ID of the import job. */
    private String id;
    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     */
    private String jobStatus;
    /** The number of endpoints that failed to import; for example, because of syntax errors. */
    private Integer totalFailures;
    /**
     * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion
     * of the endpoints to import.
     */
    private Integer totalPieces;
    /** The number of endpoints that were processed by the import job. */
    private Integer totalProcessed;
    /** The job type. Will be Import. */
    private String type;

    /**
     * The unique ID of the application to which the import job applies.
     * 
     * @param applicationId
     *        The unique ID of the application to which the import job applies.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the application to which the import job applies.
     * 
     * @return The unique ID of the application to which the import job applies.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of the application to which the import job applies.
     * 
     * @param applicationId
     *        The unique ID of the application to which the import job applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The number of pieces that have successfully imported as of the time of the request.
     * 
     * @param completedPieces
     *        The number of pieces that have successfully imported as of the time of the request.
     */

    public void setCompletedPieces(Integer completedPieces) {
        this.completedPieces = completedPieces;
    }

    /**
     * The number of pieces that have successfully imported as of the time of the request.
     * 
     * @return The number of pieces that have successfully imported as of the time of the request.
     */

    public Integer getCompletedPieces() {
        return this.completedPieces;
    }

    /**
     * The number of pieces that have successfully imported as of the time of the request.
     * 
     * @param completedPieces
     *        The number of pieces that have successfully imported as of the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withCompletedPieces(Integer completedPieces) {
        setCompletedPieces(completedPieces);
        return this;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     * 
     * @param completionDate
     *        The date the import job completed in ISO 8601 format.
     */

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     * 
     * @return The date the import job completed in ISO 8601 format.
     */

    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * The date the import job completed in ISO 8601 format.
     * 
     * @param completionDate
     *        The date the import job completed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withCompletionDate(String completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the import job was created in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     * 
     * @return The date the import job was created in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date the import job was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the import job was created in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The import job settings.
     * 
     * @param definition
     *        The import job settings.
     */

    public void setDefinition(ImportJobResource definition) {
        this.definition = definition;
    }

    /**
     * The import job settings.
     * 
     * @return The import job settings.
     */

    public ImportJobResource getDefinition() {
        return this.definition;
    }

    /**
     * The import job settings.
     * 
     * @param definition
     *        The import job settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withDefinition(ImportJobResource definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * The number of pieces that have failed to import as of the time of the request.
     * 
     * @param failedPieces
     *        The number of pieces that have failed to import as of the time of the request.
     */

    public void setFailedPieces(Integer failedPieces) {
        this.failedPieces = failedPieces;
    }

    /**
     * The number of pieces that have failed to import as of the time of the request.
     * 
     * @return The number of pieces that have failed to import as of the time of the request.
     */

    public Integer getFailedPieces() {
        return this.failedPieces;
    }

    /**
     * The number of pieces that have failed to import as of the time of the request.
     * 
     * @param failedPieces
     *        The number of pieces that have failed to import as of the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withFailedPieces(Integer failedPieces) {
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

    public ImportJobResponse withFailures(String... failures) {
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

    public ImportJobResponse withFailures(java.util.Collection<String> failures) {
        setFailures(failures);
        return this;
    }

    /**
     * The unique ID of the import job.
     * 
     * @param id
     *        The unique ID of the import job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the import job.
     * 
     * @return The unique ID of the import job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique ID of the import job.
     * 
     * @param id
     *        The unique ID of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     * 
     * @param jobStatus
     *        The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED,
     *        FAILING, FAILED
     * 
     *        The job status is FAILED if one or more pieces failed to import.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     * 
     * @return The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED,
     *         FAILING, FAILED
     * 
     *         The job status is FAILED if one or more pieces failed to import.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     * 
     * @param jobStatus
     *        The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED,
     *        FAILING, FAILED
     * 
     *        The job status is FAILED if one or more pieces failed to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobResponse withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     * 
     * @param jobStatus
     *        The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED,
     *        FAILING, FAILED
     * 
     *        The job status is FAILED if one or more pieces failed to import.
     * @see JobStatus
     */

    public void setJobStatus(JobStatus jobStatus) {
        withJobStatus(jobStatus);
    }

    /**
     * The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING,
     * FAILED
     * 
     * The job status is FAILED if one or more pieces failed to import.
     * 
     * @param jobStatus
     *        The status of the import job. Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED,
     *        FAILING, FAILED
     * 
     *        The job status is FAILED if one or more pieces failed to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobResponse withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * The number of endpoints that failed to import; for example, because of syntax errors.
     * 
     * @param totalFailures
     *        The number of endpoints that failed to import; for example, because of syntax errors.
     */

    public void setTotalFailures(Integer totalFailures) {
        this.totalFailures = totalFailures;
    }

    /**
     * The number of endpoints that failed to import; for example, because of syntax errors.
     * 
     * @return The number of endpoints that failed to import; for example, because of syntax errors.
     */

    public Integer getTotalFailures() {
        return this.totalFailures;
    }

    /**
     * The number of endpoints that failed to import; for example, because of syntax errors.
     * 
     * @param totalFailures
     *        The number of endpoints that failed to import; for example, because of syntax errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withTotalFailures(Integer totalFailures) {
        setTotalFailures(totalFailures);
        return this;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion
     * of the endpoints to import.
     * 
     * @param totalPieces
     *        The total number of pieces that must be imported to finish the job. Each piece is an approximately equal
     *        portion of the endpoints to import.
     */

    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion
     * of the endpoints to import.
     * 
     * @return The total number of pieces that must be imported to finish the job. Each piece is an approximately equal
     *         portion of the endpoints to import.
     */

    public Integer getTotalPieces() {
        return this.totalPieces;
    }

    /**
     * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion
     * of the endpoints to import.
     * 
     * @param totalPieces
     *        The total number of pieces that must be imported to finish the job. Each piece is an approximately equal
     *        portion of the endpoints to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withTotalPieces(Integer totalPieces) {
        setTotalPieces(totalPieces);
        return this;
    }

    /**
     * The number of endpoints that were processed by the import job.
     * 
     * @param totalProcessed
     *        The number of endpoints that were processed by the import job.
     */

    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the import job.
     * 
     * @return The number of endpoints that were processed by the import job.
     */

    public Integer getTotalProcessed() {
        return this.totalProcessed;
    }

    /**
     * The number of endpoints that were processed by the import job.
     * 
     * @param totalProcessed
     *        The number of endpoints that were processed by the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withTotalProcessed(Integer totalProcessed) {
        setTotalProcessed(totalProcessed);
        return this;
    }

    /**
     * The job type. Will be Import.
     * 
     * @param type
     *        The job type. Will be Import.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The job type. Will be Import.
     * 
     * @return The job type. Will be Import.
     */

    public String getType() {
        return this.type;
    }

    /**
     * The job type. Will be Import.
     * 
     * @param type
     *        The job type. Will be Import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobResponse withType(String type) {
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

        if (obj instanceof ImportJobResponse == false)
            return false;
        ImportJobResponse other = (ImportJobResponse) obj;
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
    public ImportJobResponse clone() {
        try {
            return (ImportJobResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ImportJobResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
