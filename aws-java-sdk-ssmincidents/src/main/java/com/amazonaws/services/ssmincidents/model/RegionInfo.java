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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Region in your replication set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/RegionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the KMS key used to encrypt the data in this Region.
     * </p>
     */
    private String sseKmsKeyId;
    /**
     * <p>
     * The status of the Region in the replication set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information displayed about the status of the Region.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The most recent date and time that the Region's status was updated.
     * </p>
     */
    private java.util.Date statusUpdateDateTime;

    /**
     * <p>
     * The ID of the KMS key used to encrypt the data in this Region.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The ID of the KMS key used to encrypt the data in this Region.
     */

    public void setSseKmsKeyId(String sseKmsKeyId) {
        this.sseKmsKeyId = sseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the data in this Region.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the data in this Region.
     */

    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the data in this Region.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The ID of the KMS key used to encrypt the data in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionInfo withSseKmsKeyId(String sseKmsKeyId) {
        setSseKmsKeyId(sseKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The status of the Region in the replication set.
     * </p>
     * 
     * @param status
     *        The status of the Region in the replication set.
     * @see RegionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Region in the replication set.
     * </p>
     * 
     * @return The status of the Region in the replication set.
     * @see RegionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Region in the replication set.
     * </p>
     * 
     * @param status
     *        The status of the Region in the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionStatus
     */

    public RegionInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Region in the replication set.
     * </p>
     * 
     * @param status
     *        The status of the Region in the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionStatus
     */

    public RegionInfo withStatus(RegionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information displayed about the status of the Region.
     * </p>
     * 
     * @param statusMessage
     *        Information displayed about the status of the Region.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Information displayed about the status of the Region.
     * </p>
     * 
     * @return Information displayed about the status of the Region.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Information displayed about the status of the Region.
     * </p>
     * 
     * @param statusMessage
     *        Information displayed about the status of the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionInfo withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the Region's status was updated.
     * </p>
     * 
     * @param statusUpdateDateTime
     *        The most recent date and time that the Region's status was updated.
     */

    public void setStatusUpdateDateTime(java.util.Date statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    /**
     * <p>
     * The most recent date and time that the Region's status was updated.
     * </p>
     * 
     * @return The most recent date and time that the Region's status was updated.
     */

    public java.util.Date getStatusUpdateDateTime() {
        return this.statusUpdateDateTime;
    }

    /**
     * <p>
     * The most recent date and time that the Region's status was updated.
     * </p>
     * 
     * @param statusUpdateDateTime
     *        The most recent date and time that the Region's status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionInfo withStatusUpdateDateTime(java.util.Date statusUpdateDateTime) {
        setStatusUpdateDateTime(statusUpdateDateTime);
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
        if (getSseKmsKeyId() != null)
            sb.append("SseKmsKeyId: ").append(getSseKmsKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStatusUpdateDateTime() != null)
            sb.append("StatusUpdateDateTime: ").append(getStatusUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionInfo == false)
            return false;
        RegionInfo other = (RegionInfo) obj;
        if (other.getSseKmsKeyId() == null ^ this.getSseKmsKeyId() == null)
            return false;
        if (other.getSseKmsKeyId() != null && other.getSseKmsKeyId().equals(this.getSseKmsKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatusUpdateDateTime() == null ^ this.getStatusUpdateDateTime() == null)
            return false;
        if (other.getStatusUpdateDateTime() != null && other.getStatusUpdateDateTime().equals(this.getStatusUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSseKmsKeyId() == null) ? 0 : getSseKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateDateTime() == null) ? 0 : getStatusUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public RegionInfo clone() {
        try {
            return (RegionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.RegionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
