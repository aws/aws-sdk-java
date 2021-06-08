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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ImportJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobSummary implements Serializable, Cloneable, StructuredPojo {

    private String jobId;

    private ImportDestination importDestination;

    private String jobStatus;
    /**
     * <p>
     * The date and time when the import job was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param importDestination
     */

    public void setImportDestination(ImportDestination importDestination) {
        this.importDestination = importDestination;
    }

    /**
     * @return
     */

    public ImportDestination getImportDestination() {
        return this.importDestination;
    }

    /**
     * @param importDestination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withImportDestination(ImportDestination importDestination) {
        setImportDestination(importDestination);
        return this;
    }

    /**
     * @param jobStatus
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * @return
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @param jobStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobSummary withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * @param jobStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobSummary withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the import job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time when the import job was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The date and time when the import job was created.
     * </p>
     * 
     * @return The date and time when the import job was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The date and time when the import job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time when the import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getImportDestination() != null)
            sb.append("ImportDestination: ").append(getImportDestination()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportJobSummary == false)
            return false;
        ImportJobSummary other = (ImportJobSummary) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getImportDestination() == null ^ this.getImportDestination() == null)
            return false;
        if (other.getImportDestination() != null && other.getImportDestination().equals(this.getImportDestination()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getImportDestination() == null) ? 0 : getImportDestination().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ImportJobSummary clone() {
        try {
            return (ImportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ImportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
