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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cost allocation tag backfill request structure that contains metadata and details of a certain backfill.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostAllocationTagBackfillRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostAllocationTagBackfillRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date the backfill starts from.
     * </p>
     */
    private String backfillFrom;
    /**
     * <p>
     * The time when the backfill was requested.
     * </p>
     */
    private String requestedAt;
    /**
     * <p>
     * The backfill completion time.
     * </p>
     */
    private String completedAt;
    /**
     * <p>
     * The status of the cost allocation tag backfill request.
     * </p>
     */
    private String backfillStatus;
    /**
     * <p>
     * The time when the backfill status was last updated.
     * </p>
     */
    private String lastUpdatedAt;

    /**
     * <p>
     * The date the backfill starts from.
     * </p>
     * 
     * @param backfillFrom
     *        The date the backfill starts from.
     */

    public void setBackfillFrom(String backfillFrom) {
        this.backfillFrom = backfillFrom;
    }

    /**
     * <p>
     * The date the backfill starts from.
     * </p>
     * 
     * @return The date the backfill starts from.
     */

    public String getBackfillFrom() {
        return this.backfillFrom;
    }

    /**
     * <p>
     * The date the backfill starts from.
     * </p>
     * 
     * @param backfillFrom
     *        The date the backfill starts from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTagBackfillRequest withBackfillFrom(String backfillFrom) {
        setBackfillFrom(backfillFrom);
        return this;
    }

    /**
     * <p>
     * The time when the backfill was requested.
     * </p>
     * 
     * @param requestedAt
     *        The time when the backfill was requested.
     */

    public void setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
    }

    /**
     * <p>
     * The time when the backfill was requested.
     * </p>
     * 
     * @return The time when the backfill was requested.
     */

    public String getRequestedAt() {
        return this.requestedAt;
    }

    /**
     * <p>
     * The time when the backfill was requested.
     * </p>
     * 
     * @param requestedAt
     *        The time when the backfill was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTagBackfillRequest withRequestedAt(String requestedAt) {
        setRequestedAt(requestedAt);
        return this;
    }

    /**
     * <p>
     * The backfill completion time.
     * </p>
     * 
     * @param completedAt
     *        The backfill completion time.
     */

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The backfill completion time.
     * </p>
     * 
     * @return The backfill completion time.
     */

    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The backfill completion time.
     * </p>
     * 
     * @param completedAt
     *        The backfill completion time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTagBackfillRequest withCompletedAt(String completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The status of the cost allocation tag backfill request.
     * </p>
     * 
     * @param backfillStatus
     *        The status of the cost allocation tag backfill request.
     * @see CostAllocationTagBackfillStatus
     */

    public void setBackfillStatus(String backfillStatus) {
        this.backfillStatus = backfillStatus;
    }

    /**
     * <p>
     * The status of the cost allocation tag backfill request.
     * </p>
     * 
     * @return The status of the cost allocation tag backfill request.
     * @see CostAllocationTagBackfillStatus
     */

    public String getBackfillStatus() {
        return this.backfillStatus;
    }

    /**
     * <p>
     * The status of the cost allocation tag backfill request.
     * </p>
     * 
     * @param backfillStatus
     *        The status of the cost allocation tag backfill request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagBackfillStatus
     */

    public CostAllocationTagBackfillRequest withBackfillStatus(String backfillStatus) {
        setBackfillStatus(backfillStatus);
        return this;
    }

    /**
     * <p>
     * The status of the cost allocation tag backfill request.
     * </p>
     * 
     * @param backfillStatus
     *        The status of the cost allocation tag backfill request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagBackfillStatus
     */

    public CostAllocationTagBackfillRequest withBackfillStatus(CostAllocationTagBackfillStatus backfillStatus) {
        this.backfillStatus = backfillStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the backfill status was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when the backfill status was last updated.
     */

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time when the backfill status was last updated.
     * </p>
     * 
     * @return The time when the backfill status was last updated.
     */

    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time when the backfill status was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when the backfill status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTagBackfillRequest withLastUpdatedAt(String lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getBackfillFrom() != null)
            sb.append("BackfillFrom: ").append(getBackfillFrom()).append(",");
        if (getRequestedAt() != null)
            sb.append("RequestedAt: ").append(getRequestedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getBackfillStatus() != null)
            sb.append("BackfillStatus: ").append(getBackfillStatus()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostAllocationTagBackfillRequest == false)
            return false;
        CostAllocationTagBackfillRequest other = (CostAllocationTagBackfillRequest) obj;
        if (other.getBackfillFrom() == null ^ this.getBackfillFrom() == null)
            return false;
        if (other.getBackfillFrom() != null && other.getBackfillFrom().equals(this.getBackfillFrom()) == false)
            return false;
        if (other.getRequestedAt() == null ^ this.getRequestedAt() == null)
            return false;
        if (other.getRequestedAt() != null && other.getRequestedAt().equals(this.getRequestedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getBackfillStatus() == null ^ this.getBackfillStatus() == null)
            return false;
        if (other.getBackfillStatus() != null && other.getBackfillStatus().equals(this.getBackfillStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackfillFrom() == null) ? 0 : getBackfillFrom().hashCode());
        hashCode = prime * hashCode + ((getRequestedAt() == null) ? 0 : getRequestedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getBackfillStatus() == null) ? 0 : getBackfillStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CostAllocationTagBackfillRequest clone() {
        try {
            return (CostAllocationTagBackfillRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostAllocationTagBackfillRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
