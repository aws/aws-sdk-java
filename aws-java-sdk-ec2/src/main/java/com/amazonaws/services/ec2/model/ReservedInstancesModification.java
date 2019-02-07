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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Reserved Instance modification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstancesModification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesModification implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     */
    private java.util.Date effectiveDate;
    /**
     * <p>
     * Contains target configurations along with their corresponding new Reserved Instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesModificationResult> modificationResults;
    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesId> reservedInstancesIds;
    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     */
    private String reservedInstancesModificationId;
    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     * 
     * @param createDate
     *        The time when the modification request was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     * 
     * @return The time when the modification request was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The time when the modification request was created.
     * </p>
     * 
     * @param createDate
     *        The time when the modification request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     * 
     * @param effectiveDate
     *        The time for the modification to become effective.
     */

    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     * 
     * @return The time for the modification to become effective.
     */

    public java.util.Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * <p>
     * The time for the modification to become effective.
     * </p>
     * 
     * @param effectiveDate
     *        The time for the modification to become effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withEffectiveDate(java.util.Date effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new Reserved Instance IDs.
     * </p>
     * 
     * @return Contains target configurations along with their corresponding new Reserved Instance IDs.
     */

    public java.util.List<ReservedInstancesModificationResult> getModificationResults() {
        if (modificationResults == null) {
            modificationResults = new com.amazonaws.internal.SdkInternalList<ReservedInstancesModificationResult>();
        }
        return modificationResults;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new Reserved Instance IDs.
     * </p>
     * 
     * @param modificationResults
     *        Contains target configurations along with their corresponding new Reserved Instance IDs.
     */

    public void setModificationResults(java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        if (modificationResults == null) {
            this.modificationResults = null;
            return;
        }

        this.modificationResults = new com.amazonaws.internal.SdkInternalList<ReservedInstancesModificationResult>(modificationResults);
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new Reserved Instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModificationResults(java.util.Collection)} or {@link #withModificationResults(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param modificationResults
     *        Contains target configurations along with their corresponding new Reserved Instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withModificationResults(ReservedInstancesModificationResult... modificationResults) {
        if (this.modificationResults == null) {
            setModificationResults(new com.amazonaws.internal.SdkInternalList<ReservedInstancesModificationResult>(modificationResults.length));
        }
        for (ReservedInstancesModificationResult ele : modificationResults) {
            this.modificationResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains target configurations along with their corresponding new Reserved Instance IDs.
     * </p>
     * 
     * @param modificationResults
     *        Contains target configurations along with their corresponding new Reserved Instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withModificationResults(java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        setModificationResults(modificationResults);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * 
     * @return The IDs of one or more Reserved Instances.
     */

    public java.util.List<ReservedInstancesId> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<ReservedInstancesId>();
        }
        return reservedInstancesIds;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of one or more Reserved Instances.
     */

    public void setReservedInstancesIds(java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<ReservedInstancesId>(reservedInstancesIds);
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesIds(java.util.Collection)} or {@link #withReservedInstancesIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of one or more Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withReservedInstancesIds(ReservedInstancesId... reservedInstancesIds) {
        if (this.reservedInstancesIds == null) {
            setReservedInstancesIds(new com.amazonaws.internal.SdkInternalList<ReservedInstancesId>(reservedInstancesIds.length));
        }
        for (ReservedInstancesId ele : reservedInstancesIds) {
            this.reservedInstancesIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more Reserved Instances.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of one or more Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withReservedInstancesIds(java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     * 
     * @param reservedInstancesModificationId
     *        A unique ID for the Reserved Instance modification.
     */

    public void setReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     * 
     * @return A unique ID for the Reserved Instance modification.
     */

    public String getReservedInstancesModificationId() {
        return this.reservedInstancesModificationId;
    }

    /**
     * <p>
     * A unique ID for the Reserved Instance modification.
     * </p>
     * 
     * @param reservedInstancesModificationId
     *        A unique ID for the Reserved Instance modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withReservedInstancesModificationId(String reservedInstancesModificationId) {
        setReservedInstancesModificationId(reservedInstancesModificationId);
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instances modification request.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     * 
     * @return The status of the Reserved Instances modification request.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Reserved Instances modification request.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instances modification request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @param statusMessage
     *        The reason for the status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @return The reason for the status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @param statusMessage
     *        The reason for the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     * 
     * @param updateDate
     *        The time when the modification request was last updated.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     * 
     * @return The time when the modification request was last updated.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The time when the modification request was last updated.
     * </p>
     * 
     * @param updateDate
     *        The time when the modification request was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesModification withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: ").append(getEffectiveDate()).append(",");
        if (getModificationResults() != null)
            sb.append("ModificationResults: ").append(getModificationResults()).append(",");
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: ").append(getReservedInstancesIds()).append(",");
        if (getReservedInstancesModificationId() != null)
            sb.append("ReservedInstancesModificationId: ").append(getReservedInstancesModificationId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesModification == false)
            return false;
        ReservedInstancesModification other = (ReservedInstancesModification) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getModificationResults() == null ^ this.getModificationResults() == null)
            return false;
        if (other.getModificationResults() != null && other.getModificationResults().equals(this.getModificationResults()) == false)
            return false;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getReservedInstancesModificationId() == null ^ this.getReservedInstancesModificationId() == null)
            return false;
        if (other.getReservedInstancesModificationId() != null
                && other.getReservedInstancesModificationId().equals(this.getReservedInstancesModificationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode + ((getModificationResults() == null) ? 0 : getModificationResults().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesModificationId() == null) ? 0 : getReservedInstancesModificationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesModification clone() {
        try {
            return (ReservedInstancesModification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
