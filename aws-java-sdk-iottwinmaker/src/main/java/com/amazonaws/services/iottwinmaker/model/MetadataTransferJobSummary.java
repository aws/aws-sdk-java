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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata transfer job summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/MetadataTransferJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataTransferJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata transfer job summary Id.
     * </p>
     */
    private String metadataTransferJobId;
    /**
     * <p>
     * The metadata transfer job summary ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The metadata transfer job summary creation DateTime object.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The metadata transfer job summary update DateTime object
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The metadata transfer job summary status.
     * </p>
     */
    private MetadataTransferJobStatus status;
    /**
     * <p>
     * The metadata transfer job summary progess.
     * </p>
     */
    private MetadataTransferJobProgress progress;

    /**
     * <p>
     * The metadata transfer job summary Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job summary Id.
     */

    public void setMetadataTransferJobId(String metadataTransferJobId) {
        this.metadataTransferJobId = metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job summary Id.
     * </p>
     * 
     * @return The metadata transfer job summary Id.
     */

    public String getMetadataTransferJobId() {
        return this.metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job summary Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job summary Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withMetadataTransferJobId(String metadataTransferJobId) {
        setMetadataTransferJobId(metadataTransferJobId);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summary ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job summary ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The metadata transfer job summary ARN.
     * </p>
     * 
     * @return The metadata transfer job summary ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The metadata transfer job summary ARN.
     * </p>
     * 
     * @param arn
     *        The metadata transfer job summary ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summary creation DateTime object.
     * </p>
     * 
     * @param creationDateTime
     *        The metadata transfer job summary creation DateTime object.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The metadata transfer job summary creation DateTime object.
     * </p>
     * 
     * @return The metadata transfer job summary creation DateTime object.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The metadata transfer job summary creation DateTime object.
     * </p>
     * 
     * @param creationDateTime
     *        The metadata transfer job summary creation DateTime object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summary update DateTime object
     * </p>
     * 
     * @param updateDateTime
     *        The metadata transfer job summary update DateTime object
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The metadata transfer job summary update DateTime object
     * </p>
     * 
     * @return The metadata transfer job summary update DateTime object
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The metadata transfer job summary update DateTime object
     * </p>
     * 
     * @param updateDateTime
     *        The metadata transfer job summary update DateTime object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summary status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job summary status.
     */

    public void setStatus(MetadataTransferJobStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The metadata transfer job summary status.
     * </p>
     * 
     * @return The metadata transfer job summary status.
     */

    public MetadataTransferJobStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The metadata transfer job summary status.
     * </p>
     * 
     * @param status
     *        The metadata transfer job summary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withStatus(MetadataTransferJobStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summary progess.
     * </p>
     * 
     * @param progress
     *        The metadata transfer job summary progess.
     */

    public void setProgress(MetadataTransferJobProgress progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The metadata transfer job summary progess.
     * </p>
     * 
     * @return The metadata transfer job summary progess.
     */

    public MetadataTransferJobProgress getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The metadata transfer job summary progess.
     * </p>
     * 
     * @param progress
     *        The metadata transfer job summary progess.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobSummary withProgress(MetadataTransferJobProgress progress) {
        setProgress(progress);
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
        if (getMetadataTransferJobId() != null)
            sb.append("MetadataTransferJobId: ").append(getMetadataTransferJobId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataTransferJobSummary == false)
            return false;
        MetadataTransferJobSummary other = (MetadataTransferJobSummary) obj;
        if (other.getMetadataTransferJobId() == null ^ this.getMetadataTransferJobId() == null)
            return false;
        if (other.getMetadataTransferJobId() != null && other.getMetadataTransferJobId().equals(this.getMetadataTransferJobId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataTransferJobId() == null) ? 0 : getMetadataTransferJobId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        return hashCode;
    }

    @Override
    public MetadataTransferJobSummary clone() {
        try {
            return (MetadataTransferJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.MetadataTransferJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
