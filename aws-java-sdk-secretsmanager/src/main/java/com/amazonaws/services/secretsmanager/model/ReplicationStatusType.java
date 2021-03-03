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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A replication object consisting of a <code>RegionReplicationStatus</code> object and includes a Region, KMSKeyId,
 * status, and status message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicationStatusType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationStatusType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where replication occurs.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Status message such as "<i>Secret with this name already exists in this region</i>".
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date that you last accessed the secret in the Region.
     * </p>
     */
    private java.util.Date lastAccessedDate;

    /**
     * <p>
     * The Region where replication occurs.
     * </p>
     * 
     * @param region
     *        The Region where replication occurs.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where replication occurs.
     * </p>
     * 
     * @return The Region where replication occurs.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region where replication occurs.
     * </p>
     * 
     * @param region
     *        The Region where replication occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationStatusType withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @return Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationStatusType withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * </p>
     * 
     * @param status
     *        The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * </p>
     * 
     * @return The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * </p>
     * 
     * @param status
     *        The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public ReplicationStatusType withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * </p>
     * 
     * @param status
     *        The status can be <code>InProgress</code>, <code>Failed</code>, or <code>InSync</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public ReplicationStatusType withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Status message such as "<i>Secret with this name already exists in this region</i>".
     * </p>
     * 
     * @param statusMessage
     *        Status message such as "<i>Secret with this name already exists in this region</i>".
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Status message such as "<i>Secret with this name already exists in this region</i>".
     * </p>
     * 
     * @return Status message such as "<i>Secret with this name already exists in this region</i>".
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Status message such as "<i>Secret with this name already exists in this region</i>".
     * </p>
     * 
     * @param statusMessage
     *        Status message such as "<i>Secret with this name already exists in this region</i>".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationStatusType withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date that you last accessed the secret in the Region.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that you last accessed the secret in the Region.
     */

    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>
     * The date that you last accessed the secret in the Region.
     * </p>
     * 
     * @return The date that you last accessed the secret in the Region.
     */

    public java.util.Date getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    /**
     * <p>
     * The date that you last accessed the secret in the Region.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that you last accessed the secret in the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationStatusType withLastAccessedDate(java.util.Date lastAccessedDate) {
        setLastAccessedDate(lastAccessedDate);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getLastAccessedDate() != null)
            sb.append("LastAccessedDate: ").append(getLastAccessedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationStatusType == false)
            return false;
        ReplicationStatusType other = (ReplicationStatusType) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null)
            return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationStatusType clone() {
        try {
            return (ReplicationStatusType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.ReplicationStatusTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
