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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DescribeTableDataImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTableDataImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the import job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * A message providing more details about the current status of the import job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The metadata about the job that was submitted for import.
     * </p>
     */
    private TableDataImportJobMetadata jobMetadata;

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @see TableDataImportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @return The current status of the import job.
     * @see TableDataImportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableDataImportJobStatus
     */

    public DescribeTableDataImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableDataImportJobStatus
     */

    public DescribeTableDataImportJobResult withJobStatus(TableDataImportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message providing more details about the current status of the import job.
     * </p>
     * 
     * @param message
     *        A message providing more details about the current status of the import job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message providing more details about the current status of the import job.
     * </p>
     * 
     * @return A message providing more details about the current status of the import job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message providing more details about the current status of the import job.
     * </p>
     * 
     * @param message
     *        A message providing more details about the current status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableDataImportJobResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The metadata about the job that was submitted for import.
     * </p>
     * 
     * @param jobMetadata
     *        The metadata about the job that was submitted for import.
     */

    public void setJobMetadata(TableDataImportJobMetadata jobMetadata) {
        this.jobMetadata = jobMetadata;
    }

    /**
     * <p>
     * The metadata about the job that was submitted for import.
     * </p>
     * 
     * @return The metadata about the job that was submitted for import.
     */

    public TableDataImportJobMetadata getJobMetadata() {
        return this.jobMetadata;
    }

    /**
     * <p>
     * The metadata about the job that was submitted for import.
     * </p>
     * 
     * @param jobMetadata
     *        The metadata about the job that was submitted for import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableDataImportJobResult withJobMetadata(TableDataImportJobMetadata jobMetadata) {
        setJobMetadata(jobMetadata);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getJobMetadata() != null)
            sb.append("JobMetadata: ").append(getJobMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTableDataImportJobResult == false)
            return false;
        DescribeTableDataImportJobResult other = (DescribeTableDataImportJobResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getJobMetadata() == null ^ this.getJobMetadata() == null)
            return false;
        if (other.getJobMetadata() != null && other.getJobMetadata().equals(this.getJobMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getJobMetadata() == null) ? 0 : getJobMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTableDataImportJobResult clone() {
        try {
            return (DescribeTableDataImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
