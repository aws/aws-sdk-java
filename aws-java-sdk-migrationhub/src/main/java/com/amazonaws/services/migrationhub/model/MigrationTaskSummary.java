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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * MigrationTaskSummary includes <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
 * <code>ProgressUpdateStream</code>, <code>Status</code>, and <code>UpdateDateTime</code> for each task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/MigrationTaskSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationTaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all
     * updates made by the tool.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * Status of the task.
     * </p>
     */
    private String status;
    /** <p/> */
    private Integer progressPercent;
    /**
     * <p>
     * Detail information of what is being done within the overall status state.
     * </p>
     */
    private String statusDetail;
    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all
     * updates made by the tool.
     * </p>
     * 
     * @param progressUpdateStream
     *        An AWS resource used for access control. It should uniquely identify the migration tool as it is used for
     *        all updates made by the tool.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all
     * updates made by the tool.
     * </p>
     * 
     * @return An AWS resource used for access control. It should uniquely identify the migration tool as it is used for
     *         all updates made by the tool.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all
     * updates made by the tool.
     * </p>
     * 
     * @param progressUpdateStream
     *        An AWS resource used for access control. It should uniquely identify the migration tool as it is used for
     *        all updates made by the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTaskSummary withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @return Unique identifier that references the migration task.
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTaskSummary withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * Status of the task.
     * </p>
     * 
     * @param status
     *        Status of the task.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the task.
     * </p>
     * 
     * @return Status of the task.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the task.
     * </p>
     * 
     * @param status
     *        Status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public MigrationTaskSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the task.
     * </p>
     * 
     * @param status
     *        Status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public MigrationTaskSummary withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param progressPercent
     */

    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p/>
     * 
     * @param progressPercent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTaskSummary withProgressPercent(Integer progressPercent) {
        setProgressPercent(progressPercent);
        return this;
    }

    /**
     * <p>
     * Detail information of what is being done within the overall status state.
     * </p>
     * 
     * @param statusDetail
     *        Detail information of what is being done within the overall status state.
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Detail information of what is being done within the overall status state.
     * </p>
     * 
     * @return Detail information of what is being done within the overall status state.
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * Detail information of what is being done within the overall status state.
     * </p>
     * 
     * @param statusDetail
     *        Detail information of what is being done within the overall status state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTaskSummary withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
        return this;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @param updateDateTime
     *        The timestamp when the task was gathered.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @return The timestamp when the task was gathered.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * 
     * @param updateDateTime
     *        The timestamp when the task was gathered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationTaskSummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent()).append(",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrationTaskSummary == false)
            return false;
        MigrationTaskSummary other = (MigrationTaskSummary) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public MigrationTaskSummary clone() {
        try {
            return (MigrationTaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.MigrationTaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
