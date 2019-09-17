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
 * Describes a Reserved Instance listing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstancesListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesListing implements Serializable, Cloneable {

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
     * The time the listing was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The number of instances in this state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceCount> instanceCounts;
    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PriceSchedule> priceSchedules;
    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;
    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     */
    private String reservedInstancesListingId;
    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The response can be blank.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The last modified timestamp of the listing.
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

    public ReservedInstancesListing withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     * 
     * @param createDate
     *        The time the listing was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     * 
     * @return The time the listing was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The time the listing was created.
     * </p>
     * 
     * @param createDate
     *        The time the listing was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * 
     * @return The number of instances in this state.
     */

    public java.util.List<InstanceCount> getInstanceCounts() {
        if (instanceCounts == null) {
            instanceCounts = new com.amazonaws.internal.SdkInternalList<InstanceCount>();
        }
        return instanceCounts;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * 
     * @param instanceCounts
     *        The number of instances in this state.
     */

    public void setInstanceCounts(java.util.Collection<InstanceCount> instanceCounts) {
        if (instanceCounts == null) {
            this.instanceCounts = null;
            return;
        }

        this.instanceCounts = new com.amazonaws.internal.SdkInternalList<InstanceCount>(instanceCounts);
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceCounts(java.util.Collection)} or {@link #withInstanceCounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceCounts
     *        The number of instances in this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withInstanceCounts(InstanceCount... instanceCounts) {
        if (this.instanceCounts == null) {
            setInstanceCounts(new com.amazonaws.internal.SdkInternalList<InstanceCount>(instanceCounts.length));
        }
        for (InstanceCount ele : instanceCounts) {
            this.instanceCounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of instances in this state.
     * </p>
     * 
     * @param instanceCounts
     *        The number of instances in this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withInstanceCounts(java.util.Collection<InstanceCount> instanceCounts) {
        setInstanceCounts(instanceCounts);
        return this;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * 
     * @return The price of the Reserved Instance listing.
     */

    public java.util.List<PriceSchedule> getPriceSchedules() {
        if (priceSchedules == null) {
            priceSchedules = new com.amazonaws.internal.SdkInternalList<PriceSchedule>();
        }
        return priceSchedules;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * 
     * @param priceSchedules
     *        The price of the Reserved Instance listing.
     */

    public void setPriceSchedules(java.util.Collection<PriceSchedule> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }

        this.priceSchedules = new com.amazonaws.internal.SdkInternalList<PriceSchedule>(priceSchedules);
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriceSchedules(java.util.Collection)} or {@link #withPriceSchedules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param priceSchedules
     *        The price of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withPriceSchedules(PriceSchedule... priceSchedules) {
        if (this.priceSchedules == null) {
            setPriceSchedules(new com.amazonaws.internal.SdkInternalList<PriceSchedule>(priceSchedules.length));
        }
        for (PriceSchedule ele : priceSchedules) {
            this.priceSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The price of the Reserved Instance listing.
     * </p>
     * 
     * @param priceSchedules
     *        The price of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withPriceSchedules(java.util.Collection<PriceSchedule> priceSchedules) {
        setPriceSchedules(priceSchedules);
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @return The ID of the Reserved Instance.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        The ID of the Reserved Instance listing.
     */

    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @return The ID of the Reserved Instance listing.
     */

    public String getReservedInstancesListingId() {
        return this.reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        The ID of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withReservedInstancesListingId(String reservedInstancesListingId) {
        setReservedInstancesListingId(reservedInstancesListingId);
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instance listing.
     * @see ListingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * 
     * @return The status of the Reserved Instance listing.
     * @see ListingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public ReservedInstancesListing withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instance listing.
     * @see ListingStatus
     */

    public void setStatus(ListingStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the Reserved Instance listing.
     * </p>
     * 
     * @param status
     *        The status of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public ReservedInstancesListing withStatus(ListingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The response can be blank.
     * </p>
     * 
     * @param statusMessage
     *        The reason for the current status of the Reserved Instance listing. The response can be blank.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The response can be blank.
     * </p>
     * 
     * @return The reason for the current status of the Reserved Instance listing. The response can be blank.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The reason for the current status of the Reserved Instance listing. The response can be blank.
     * </p>
     * 
     * @param statusMessage
     *        The reason for the current status of the Reserved Instance listing. The response can be blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @return Any tags assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     * 
     * @param updateDate
     *        The last modified timestamp of the listing.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     * 
     * @return The last modified timestamp of the listing.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The last modified timestamp of the listing.
     * </p>
     * 
     * @param updateDate
     *        The last modified timestamp of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesListing withUpdateDate(java.util.Date updateDate) {
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
        if (getInstanceCounts() != null)
            sb.append("InstanceCounts: ").append(getInstanceCounts()).append(",");
        if (getPriceSchedules() != null)
            sb.append("PriceSchedules: ").append(getPriceSchedules()).append(",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: ").append(getReservedInstancesId()).append(",");
        if (getReservedInstancesListingId() != null)
            sb.append("ReservedInstancesListingId: ").append(getReservedInstancesListingId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof ReservedInstancesListing == false)
            return false;
        ReservedInstancesListing other = (ReservedInstancesListing) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getInstanceCounts() == null ^ this.getInstanceCounts() == null)
            return false;
        if (other.getInstanceCounts() != null && other.getInstanceCounts().equals(this.getInstanceCounts()) == false)
            return false;
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null)
            return false;
        if (other.getPriceSchedules() != null && other.getPriceSchedules().equals(this.getPriceSchedules()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null)
            return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getInstanceCounts() == null) ? 0 : getInstanceCounts().hashCode());
        hashCode = prime * hashCode + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesListing clone() {
        try {
            return (ReservedInstancesListing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
