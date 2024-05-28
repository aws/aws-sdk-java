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
 * Export task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ExportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Export task creation datetime.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * Export task end datetime.
     * </p>
     */
    private String endDateTime;
    /**
     * <p>
     * Export task id.
     * </p>
     */
    private String exportID;
    /**
     * <p>
     * Export task progress percentage.
     * </p>
     */
    private Float progressPercentage;
    /**
     * <p>
     * Export task s3 bucket.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * Export task s3 bucket owner.
     * </p>
     */
    private String s3BucketOwner;
    /**
     * <p>
     * Export task s3 key.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * Export task status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Export task summary.
     * </p>
     */
    private ExportTaskSummary summary;

    /**
     * <p>
     * Export task creation datetime.
     * </p>
     * 
     * @param creationDateTime
     *        Export task creation datetime.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Export task creation datetime.
     * </p>
     * 
     * @return Export task creation datetime.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Export task creation datetime.
     * </p>
     * 
     * @param creationDateTime
     *        Export task creation datetime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * Export task end datetime.
     * </p>
     * 
     * @param endDateTime
     *        Export task end datetime.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * Export task end datetime.
     * </p>
     * 
     * @return Export task end datetime.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * Export task end datetime.
     * </p>
     * 
     * @param endDateTime
     *        Export task end datetime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * Export task id.
     * </p>
     * 
     * @param exportID
     *        Export task id.
     */

    public void setExportID(String exportID) {
        this.exportID = exportID;
    }

    /**
     * <p>
     * Export task id.
     * </p>
     * 
     * @return Export task id.
     */

    public String getExportID() {
        return this.exportID;
    }

    /**
     * <p>
     * Export task id.
     * </p>
     * 
     * @param exportID
     *        Export task id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withExportID(String exportID) {
        setExportID(exportID);
        return this;
    }

    /**
     * <p>
     * Export task progress percentage.
     * </p>
     * 
     * @param progressPercentage
     *        Export task progress percentage.
     */

    public void setProgressPercentage(Float progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    /**
     * <p>
     * Export task progress percentage.
     * </p>
     * 
     * @return Export task progress percentage.
     */

    public Float getProgressPercentage() {
        return this.progressPercentage;
    }

    /**
     * <p>
     * Export task progress percentage.
     * </p>
     * 
     * @param progressPercentage
     *        Export task progress percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withProgressPercentage(Float progressPercentage) {
        setProgressPercentage(progressPercentage);
        return this;
    }

    /**
     * <p>
     * Export task s3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Export task s3 bucket.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Export task s3 bucket.
     * </p>
     * 
     * @return Export task s3 bucket.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Export task s3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        Export task s3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * Export task s3 bucket owner.
     * </p>
     * 
     * @param s3BucketOwner
     *        Export task s3 bucket owner.
     */

    public void setS3BucketOwner(String s3BucketOwner) {
        this.s3BucketOwner = s3BucketOwner;
    }

    /**
     * <p>
     * Export task s3 bucket owner.
     * </p>
     * 
     * @return Export task s3 bucket owner.
     */

    public String getS3BucketOwner() {
        return this.s3BucketOwner;
    }

    /**
     * <p>
     * Export task s3 bucket owner.
     * </p>
     * 
     * @param s3BucketOwner
     *        Export task s3 bucket owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withS3BucketOwner(String s3BucketOwner) {
        setS3BucketOwner(s3BucketOwner);
        return this;
    }

    /**
     * <p>
     * Export task s3 key.
     * </p>
     * 
     * @param s3Key
     *        Export task s3 key.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * Export task s3 key.
     * </p>
     * 
     * @return Export task s3 key.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * Export task s3 key.
     * </p>
     * 
     * @param s3Key
     *        Export task s3 key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * Export task status.
     * </p>
     * 
     * @param status
     *        Export task status.
     * @see ExportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Export task status.
     * </p>
     * 
     * @return Export task status.
     * @see ExportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Export task status.
     * </p>
     * 
     * @param status
     *        Export task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Export task status.
     * </p>
     * 
     * @param status
     *        Export task status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportTask withStatus(ExportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Export task summary.
     * </p>
     * 
     * @param summary
     *        Export task summary.
     */

    public void setSummary(ExportTaskSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Export task summary.
     * </p>
     * 
     * @return Export task summary.
     */

    public ExportTaskSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Export task summary.
     * </p>
     * 
     * @param summary
     *        Export task summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withSummary(ExportTaskSummary summary) {
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
        if (getExportID() != null)
            sb.append("ExportID: ").append(getExportID()).append(",");
        if (getProgressPercentage() != null)
            sb.append("ProgressPercentage: ").append(getProgressPercentage()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3BucketOwner() != null)
            sb.append("S3BucketOwner: ").append(getS3BucketOwner()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
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

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getExportID() == null ^ this.getExportID() == null)
            return false;
        if (other.getExportID() != null && other.getExportID().equals(this.getExportID()) == false)
            return false;
        if (other.getProgressPercentage() == null ^ this.getProgressPercentage() == null)
            return false;
        if (other.getProgressPercentage() != null && other.getProgressPercentage().equals(this.getProgressPercentage()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3BucketOwner() == null ^ this.getS3BucketOwner() == null)
            return false;
        if (other.getS3BucketOwner() != null && other.getS3BucketOwner().equals(this.getS3BucketOwner()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
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
        hashCode = prime * hashCode + ((getExportID() == null) ? 0 : getExportID().hashCode());
        hashCode = prime * hashCode + ((getProgressPercentage() == null) ? 0 : getProgressPercentage().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3BucketOwner() == null) ? 0 : getS3BucketOwner().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public ExportTask clone() {
        try {
            return (ExportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ExportTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
