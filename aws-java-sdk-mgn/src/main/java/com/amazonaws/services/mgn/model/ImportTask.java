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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Import task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ImportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Import task creation datetime.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * Import task end datetime.
     * </p>
     */
    private String endDateTime;
    /**
     * <p>
     * Import task id.
     * </p>
     */
    private String importID;
    /**
     * <p>
     * Import task progress percentage.
     * </p>
     */
    private Float progressPercentage;
    /**
     * <p>
     * Import task s3 bucket source.
     * </p>
     */
    private S3BucketSource s3BucketSource;
    /**
     * <p>
     * Import task status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Import task summary.
     * </p>
     */
    private ImportTaskSummary summary;

    /**
     * <p>
     * Import task creation datetime.
     * </p>
     * 
     * @param creationDateTime
     *        Import task creation datetime.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Import task creation datetime.
     * </p>
     * 
     * @return Import task creation datetime.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Import task creation datetime.
     * </p>
     * 
     * @param creationDateTime
     *        Import task creation datetime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * Import task end datetime.
     * </p>
     * 
     * @param endDateTime
     *        Import task end datetime.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * Import task end datetime.
     * </p>
     * 
     * @return Import task end datetime.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * Import task end datetime.
     * </p>
     * 
     * @param endDateTime
     *        Import task end datetime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * Import task id.
     * </p>
     * 
     * @param importID
     *        Import task id.
     */

    public void setImportID(String importID) {
        this.importID = importID;
    }

    /**
     * <p>
     * Import task id.
     * </p>
     * 
     * @return Import task id.
     */

    public String getImportID() {
        return this.importID;
    }

    /**
     * <p>
     * Import task id.
     * </p>
     * 
     * @param importID
     *        Import task id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withImportID(String importID) {
        setImportID(importID);
        return this;
    }

    /**
     * <p>
     * Import task progress percentage.
     * </p>
     * 
     * @param progressPercentage
     *        Import task progress percentage.
     */

    public void setProgressPercentage(Float progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    /**
     * <p>
     * Import task progress percentage.
     * </p>
     * 
     * @return Import task progress percentage.
     */

    public Float getProgressPercentage() {
        return this.progressPercentage;
    }

    /**
     * <p>
     * Import task progress percentage.
     * </p>
     * 
     * @param progressPercentage
     *        Import task progress percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withProgressPercentage(Float progressPercentage) {
        setProgressPercentage(progressPercentage);
        return this;
    }

    /**
     * <p>
     * Import task s3 bucket source.
     * </p>
     * 
     * @param s3BucketSource
     *        Import task s3 bucket source.
     */

    public void setS3BucketSource(S3BucketSource s3BucketSource) {
        this.s3BucketSource = s3BucketSource;
    }

    /**
     * <p>
     * Import task s3 bucket source.
     * </p>
     * 
     * @return Import task s3 bucket source.
     */

    public S3BucketSource getS3BucketSource() {
        return this.s3BucketSource;
    }

    /**
     * <p>
     * Import task s3 bucket source.
     * </p>
     * 
     * @param s3BucketSource
     *        Import task s3 bucket source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withS3BucketSource(S3BucketSource s3BucketSource) {
        setS3BucketSource(s3BucketSource);
        return this;
    }

    /**
     * <p>
     * Import task status.
     * </p>
     * 
     * @param status
     *        Import task status.
     * @see ImportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Import task status.
     * </p>
     * 
     * @return Import task status.
     * @see ImportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Import task status.
     * </p>
     * 
     * @param status
     *        Import task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Import task status.
     * </p>
     * 
     * @param status
     *        Import task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTask withStatus(ImportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Import task summary.
     * </p>
     * 
     * @param summary
     *        Import task summary.
     */

    public void setSummary(ImportTaskSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Import task summary.
     * </p>
     * 
     * @return Import task summary.
     */

    public ImportTaskSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Import task summary.
     * </p>
     * 
     * @param summary
     *        Import task summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTask withSummary(ImportTaskSummary summary) {
        setSummary(summary);
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getImportID() != null)
            sb.append("ImportID: ").append(getImportID()).append(",");
        if (getProgressPercentage() != null)
            sb.append("ProgressPercentage: ").append(getProgressPercentage()).append(",");
        if (getS3BucketSource() != null)
            sb.append("S3BucketSource: ").append(getS3BucketSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTask == false)
            return false;
        ImportTask other = (ImportTask) obj;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getImportID() == null ^ this.getImportID() == null)
            return false;
        if (other.getImportID() != null && other.getImportID().equals(this.getImportID()) == false)
            return false;
        if (other.getProgressPercentage() == null ^ this.getProgressPercentage() == null)
            return false;
        if (other.getProgressPercentage() != null && other.getProgressPercentage().equals(this.getProgressPercentage()) == false)
            return false;
        if (other.getS3BucketSource() == null ^ this.getS3BucketSource() == null)
            return false;
        if (other.getS3BucketSource() != null && other.getS3BucketSource().equals(this.getS3BucketSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getImportID() == null) ? 0 : getImportID().hashCode());
        hashCode = prime * hashCode + ((getProgressPercentage() == null) ? 0 : getProgressPercentage().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSource() == null) ? 0 : getS3BucketSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public ImportTask clone() {
        try {
            return (ImportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ImportTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
