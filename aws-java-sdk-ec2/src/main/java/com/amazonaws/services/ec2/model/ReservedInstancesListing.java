/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Reserved Instance listing.
 * </p>
 */
public class ReservedInstancesListing implements Serializable {

    /**
     * The ID of the Reserved Instance listing.
     */
    private String reservedInstancesListingId;

    /**
     * The ID of the Reserved Instance.
     */
    private String reservedInstancesId;

    /**
     * The time the listing was created.
     */
    private java.util.Date createDate;

    /**
     * The last modified timestamp of the listing.
     */
    private java.util.Date updateDate;

    /**
     * The status of the Reserved Instance listing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     */
    private String status;

    /**
     * The reason for the current status of the Reserved Instance listing.
     * The response can be blank.
     */
    private String statusMessage;

    /**
     * The number of instances in this state.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount> instanceCounts;

    /**
     * The price of the Reserved Instance listing.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule> priceSchedules;

    /**
     * Any tags assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The idempotency token you provided when you created the listing.
     */
    private String clientToken;

    /**
     * The ID of the Reserved Instance listing.
     *
     * @return The ID of the Reserved Instance listing.
     */
    public String getReservedInstancesListingId() {
        return reservedInstancesListingId;
    }
    
    /**
     * The ID of the Reserved Instance listing.
     *
     * @param reservedInstancesListingId The ID of the Reserved Instance listing.
     */
    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }
    
    /**
     * The ID of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListingId The ID of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
        return this;
    }

    /**
     * The ID of the Reserved Instance.
     *
     * @return The ID of the Reserved Instance.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The ID of the Reserved Instance.
     *
     * @param reservedInstancesId The ID of the Reserved Instance.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The ID of the Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The ID of the Reserved Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * The time the listing was created.
     *
     * @return The time the listing was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The time the listing was created.
     *
     * @param createDate The time the listing was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The time the listing was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The time the listing was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * The last modified timestamp of the listing.
     *
     * @return The last modified timestamp of the listing.
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }
    
    /**
     * The last modified timestamp of the listing.
     *
     * @param updateDate The last modified timestamp of the listing.
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }
    
    /**
     * The last modified timestamp of the listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateDate The last modified timestamp of the listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * The status of the Reserved Instance listing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @return The status of the Reserved Instance listing.
     *
     * @see ListingStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the Reserved Instance listing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status The status of the Reserved Instance listing.
     *
     * @see ListingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status The status of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ListingStatus
     */
    public ReservedInstancesListing withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the Reserved Instance listing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status The status of the Reserved Instance listing.
     *
     * @see ListingStatus
     */
    public void setStatus(ListingStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, pending, cancelled, closed
     *
     * @param status The status of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ListingStatus
     */
    public ReservedInstancesListing withStatus(ListingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The reason for the current status of the Reserved Instance listing.
     * The response can be blank.
     *
     * @return The reason for the current status of the Reserved Instance listing.
     *         The response can be blank.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * The reason for the current status of the Reserved Instance listing.
     * The response can be blank.
     *
     * @param statusMessage The reason for the current status of the Reserved Instance listing.
     *         The response can be blank.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * The reason for the current status of the Reserved Instance listing.
     * The response can be blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The reason for the current status of the Reserved Instance listing.
     *         The response can be blank.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * The number of instances in this state.
     *
     * @return The number of instances in this state.
     */
    public java.util.List<InstanceCount> getInstanceCounts() {
        if (instanceCounts == null) {
              instanceCounts = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount>();
              instanceCounts.setAutoConstruct(true);
        }
        return instanceCounts;
    }
    
    /**
     * The number of instances in this state.
     *
     * @param instanceCounts The number of instances in this state.
     */
    public void setInstanceCounts(java.util.Collection<InstanceCount> instanceCounts) {
        if (instanceCounts == null) {
            this.instanceCounts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount> instanceCountsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount>(instanceCounts.size());
        instanceCountsCopy.addAll(instanceCounts);
        this.instanceCounts = instanceCountsCopy;
    }
    
    /**
     * The number of instances in this state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCounts The number of instances in this state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withInstanceCounts(InstanceCount... instanceCounts) {
        if (getInstanceCounts() == null) setInstanceCounts(new java.util.ArrayList<InstanceCount>(instanceCounts.length));
        for (InstanceCount value : instanceCounts) {
            getInstanceCounts().add(value);
        }
        return this;
    }
    
    /**
     * The number of instances in this state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCounts The number of instances in this state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withInstanceCounts(java.util.Collection<InstanceCount> instanceCounts) {
        if (instanceCounts == null) {
            this.instanceCounts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount> instanceCountsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCount>(instanceCounts.size());
            instanceCountsCopy.addAll(instanceCounts);
            this.instanceCounts = instanceCountsCopy;
        }

        return this;
    }

    /**
     * The price of the Reserved Instance listing.
     *
     * @return The price of the Reserved Instance listing.
     */
    public java.util.List<PriceSchedule> getPriceSchedules() {
        if (priceSchedules == null) {
              priceSchedules = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule>();
              priceSchedules.setAutoConstruct(true);
        }
        return priceSchedules;
    }
    
    /**
     * The price of the Reserved Instance listing.
     *
     * @param priceSchedules The price of the Reserved Instance listing.
     */
    public void setPriceSchedules(java.util.Collection<PriceSchedule> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule>(priceSchedules.size());
        priceSchedulesCopy.addAll(priceSchedules);
        this.priceSchedules = priceSchedulesCopy;
    }
    
    /**
     * The price of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules The price of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withPriceSchedules(PriceSchedule... priceSchedules) {
        if (getPriceSchedules() == null) setPriceSchedules(new java.util.ArrayList<PriceSchedule>(priceSchedules.length));
        for (PriceSchedule value : priceSchedules) {
            getPriceSchedules().add(value);
        }
        return this;
    }
    
    /**
     * The price of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules The price of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withPriceSchedules(java.util.Collection<PriceSchedule> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceSchedule>(priceSchedules.size());
            priceSchedulesCopy.addAll(priceSchedules);
            this.priceSchedules = priceSchedulesCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the resource.
     *
     * @return Any tags assigned to the resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the resource.
     *
     * @param tags Any tags assigned to the resource.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The idempotency token you provided when you created the listing.
     *
     * @return The idempotency token you provided when you created the listing.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * The idempotency token you provided when you created the listing.
     *
     * @param clientToken The idempotency token you provided when you created the listing.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * The idempotency token you provided when you created the listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The idempotency token you provided when you created the listing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesListing withClientToken(String clientToken) {
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
        if (getReservedInstancesListingId() != null) sb.append("ReservedInstancesListingId: " + getReservedInstancesListingId() + ",");
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUpdateDate() != null) sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getInstanceCounts() != null) sb.append("InstanceCounts: " + getInstanceCounts() + ",");
        if (getPriceSchedules() != null) sb.append("PriceSchedules: " + getPriceSchedules() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCounts() == null) ? 0 : getInstanceCounts().hashCode()); 
        hashCode = prime * hashCode + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstancesListing == false) return false;
        ReservedInstancesListing other = (ReservedInstancesListing)obj;
        
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null) return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false) return false; 
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null) return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getInstanceCounts() == null ^ this.getInstanceCounts() == null) return false;
        if (other.getInstanceCounts() != null && other.getInstanceCounts().equals(this.getInstanceCounts()) == false) return false; 
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null) return false;
        if (other.getPriceSchedules() != null && other.getPriceSchedules().equals(this.getPriceSchedules()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    