/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the job completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The job's destination in Amazon S3.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The job's read sets.
     * </p>
     */
    private java.util.List<ExportReadSetDetail> readSets;
    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The job's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The job's status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @param completionTime
     *        When the job completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @return When the job completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @param completionTime
     *        When the job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The job's destination in Amazon S3.
     * </p>
     * 
     * @param destination
     *        The job's destination in Amazon S3.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The job's destination in Amazon S3.
     * </p>
     * 
     * @return The job's destination in Amazon S3.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The job's destination in Amazon S3.
     * </p>
     * 
     * @param destination
     *        The job's destination in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @return The job's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The job's read sets.
     * </p>
     * 
     * @return The job's read sets.
     */

    public java.util.List<ExportReadSetDetail> getReadSets() {
        return readSets;
    }

    /**
     * <p>
     * The job's read sets.
     * </p>
     * 
     * @param readSets
     *        The job's read sets.
     */

    public void setReadSets(java.util.Collection<ExportReadSetDetail> readSets) {
        if (readSets == null) {
            this.readSets = null;
            return;
        }

        this.readSets = new java.util.ArrayList<ExportReadSetDetail>(readSets);
    }

    /**
     * <p>
     * The job's read sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadSets(java.util.Collection)} or {@link #withReadSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param readSets
     *        The job's read sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withReadSets(ExportReadSetDetail... readSets) {
        if (this.readSets == null) {
            setReadSets(new java.util.ArrayList<ExportReadSetDetail>(readSets.length));
        }
        for (ExportReadSetDetail ele : readSets) {
            this.readSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job's read sets.
     * </p>
     * 
     * @param readSets
     *        The job's read sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withReadSets(java.util.Collection<ExportReadSetDetail> readSets) {
        setReadSets(readSets);
        return this;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The job's sequence store ID.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @return The job's sequence store ID.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The job's sequence store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @see ReadSetExportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @return The job's status.
     * @see ReadSetExportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetExportJobStatus
     */

    public GetReadSetExportJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetExportJobStatus
     */

    public GetReadSetExportJobResult withStatus(ReadSetExportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @return The job's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetExportJobResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getReadSets() != null)
            sb.append("ReadSets: ").append(getReadSets()).append(",");
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadSetExportJobResult == false)
            return false;
        GetReadSetExportJobResult other = (GetReadSetExportJobResult) obj;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReadSets() == null ^ this.getReadSets() == null)
            return false;
        if (other.getReadSets() != null && other.getReadSets().equals(this.getReadSets()) == false)
            return false;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getReadSets() == null) ? 0 : getReadSets().hashCode());
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetReadSetExportJobResult clone() {
        try {
            return (GetReadSetExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
