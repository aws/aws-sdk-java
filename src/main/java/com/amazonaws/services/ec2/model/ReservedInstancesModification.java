/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Information about a specific modification request to your Reserved Instances.
 * </p>
 */
public class ReservedInstancesModification implements Serializable {

    /**
     * The unique ID for the submitted modification request.
     */
    private String reservedInstancesModificationId;

    /**
     * The IDs of the Reserved Instances submitted for modification.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId> reservedInstancesIds;

    /**
     * The resulting information about the modified Reserved Instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult> modificationResults;

    /**
     * The time the modification request was created.
     */
    private java.util.Date createDate;

    /**
     * The time the modification request was last updated.
     */
    private java.util.Date updateDate;

    /**
     * The time the modification becomes effective.
     */
    private java.util.Date effectiveDate;

    /**
     * The status of the modification request, which can be any of the
     * following values: processing, fulfilled, failed.
     */
    private String status;

    /**
     * The reason for the status.
     */
    private String statusMessage;

    /**
     * The idempotency token for the modification request.
     */
    private String clientToken;

    /**
     * The unique ID for the submitted modification request.
     *
     * @return The unique ID for the submitted modification request.
     */
    public String getReservedInstancesModificationId() {
        return reservedInstancesModificationId;
    }
    
    /**
     * The unique ID for the submitted modification request.
     *
     * @param reservedInstancesModificationId The unique ID for the submitted modification request.
     */
    public void setReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
    }
    
    /**
     * The unique ID for the submitted modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationId The unique ID for the submitted modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
        return this;
    }

    /**
     * The IDs of the Reserved Instances submitted for modification.
     *
     * @return The IDs of the Reserved Instances submitted for modification.
     */
    public java.util.List<ReservedInstancesId> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
              reservedInstancesIds = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId>();
              reservedInstancesIds.setAutoConstruct(true);
        }
        return reservedInstancesIds;
    }
    
    /**
     * The IDs of the Reserved Instances submitted for modification.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances submitted for modification.
     */
    public void setReservedInstancesIds(java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId>(reservedInstancesIds.size());
        reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * The IDs of the Reserved Instances submitted for modification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances submitted for modification.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withReservedInstancesIds(ReservedInstancesId... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) setReservedInstancesIds(new java.util.ArrayList<ReservedInstancesId>(reservedInstancesIds.length));
        for (ReservedInstancesId value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Reserved Instances submitted for modification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances submitted for modification.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withReservedInstancesIds(java.util.Collection<ReservedInstancesId> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesId>(reservedInstancesIds.size());
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
            this.reservedInstancesIds = reservedInstancesIdsCopy;
        }

        return this;
    }

    /**
     * The resulting information about the modified Reserved Instances.
     *
     * @return The resulting information about the modified Reserved Instances.
     */
    public java.util.List<ReservedInstancesModificationResult> getModificationResults() {
        if (modificationResults == null) {
              modificationResults = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult>();
              modificationResults.setAutoConstruct(true);
        }
        return modificationResults;
    }
    
    /**
     * The resulting information about the modified Reserved Instances.
     *
     * @param modificationResults The resulting information about the modified Reserved Instances.
     */
    public void setModificationResults(java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        if (modificationResults == null) {
            this.modificationResults = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult> modificationResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult>(modificationResults.size());
        modificationResultsCopy.addAll(modificationResults);
        this.modificationResults = modificationResultsCopy;
    }
    
    /**
     * The resulting information about the modified Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param modificationResults The resulting information about the modified Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withModificationResults(ReservedInstancesModificationResult... modificationResults) {
        if (getModificationResults() == null) setModificationResults(new java.util.ArrayList<ReservedInstancesModificationResult>(modificationResults.length));
        for (ReservedInstancesModificationResult value : modificationResults) {
            getModificationResults().add(value);
        }
        return this;
    }
    
    /**
     * The resulting information about the modified Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param modificationResults The resulting information about the modified Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withModificationResults(java.util.Collection<ReservedInstancesModificationResult> modificationResults) {
        if (modificationResults == null) {
            this.modificationResults = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult> modificationResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesModificationResult>(modificationResults.size());
            modificationResultsCopy.addAll(modificationResults);
            this.modificationResults = modificationResultsCopy;
        }

        return this;
    }

    /**
     * The time the modification request was created.
     *
     * @return The time the modification request was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The time the modification request was created.
     *
     * @param createDate The time the modification request was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The time the modification request was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The time the modification request was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * The time the modification request was last updated.
     *
     * @return The time the modification request was last updated.
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }
    
    /**
     * The time the modification request was last updated.
     *
     * @param updateDate The time the modification request was last updated.
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }
    
    /**
     * The time the modification request was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateDate The time the modification request was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * The time the modification becomes effective.
     *
     * @return The time the modification becomes effective.
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }
    
    /**
     * The time the modification becomes effective.
     *
     * @param effectiveDate The time the modification becomes effective.
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    
    /**
     * The time the modification becomes effective.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param effectiveDate The time the modification becomes effective.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The status of the modification request, which can be any of the
     * following values: processing, fulfilled, failed.
     *
     * @return The status of the modification request, which can be any of the
     *         following values: processing, fulfilled, failed.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the modification request, which can be any of the
     * following values: processing, fulfilled, failed.
     *
     * @param status The status of the modification request, which can be any of the
     *         following values: processing, fulfilled, failed.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the modification request, which can be any of the
     * following values: processing, fulfilled, failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the modification request, which can be any of the
     *         following values: processing, fulfilled, failed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The reason for the status.
     *
     * @return The reason for the status.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * The reason for the status.
     *
     * @param statusMessage The reason for the status.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * The reason for the status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The reason for the status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * The idempotency token for the modification request.
     *
     * @return The idempotency token for the modification request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * The idempotency token for the modification request.
     *
     * @param clientToken The idempotency token for the modification request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * The idempotency token for the modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The idempotency token for the modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesModification withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservedInstancesModificationId() != null) sb.append("ReservedInstancesModificationId: " + getReservedInstancesModificationId() + ",");
        if (getReservedInstancesIds() != null) sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getModificationResults() != null) sb.append("ModificationResults: " + getModificationResults() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUpdateDate() != null) sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getEffectiveDate() != null) sb.append("EffectiveDate: " + getEffectiveDate() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesModificationId() == null) ? 0 : getReservedInstancesModificationId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode()); 
        hashCode = prime * hashCode + ((getModificationResults() == null) ? 0 : getModificationResults().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode()); 
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstancesModification == false) return false;
        ReservedInstancesModification other = (ReservedInstancesModification)obj;
        
        if (other.getReservedInstancesModificationId() == null ^ this.getReservedInstancesModificationId() == null) return false;
        if (other.getReservedInstancesModificationId() != null && other.getReservedInstancesModificationId().equals(this.getReservedInstancesModificationId()) == false) return false; 
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null) return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false) return false; 
        if (other.getModificationResults() == null ^ this.getModificationResults() == null) return false;
        if (other.getModificationResults() != null && other.getModificationResults().equals(this.getModificationResults()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null) return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false) return false; 
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null) return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    