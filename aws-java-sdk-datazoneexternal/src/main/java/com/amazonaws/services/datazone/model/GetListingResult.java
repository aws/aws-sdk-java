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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetListingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the listing was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the listing.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the listing.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The details of a listing.
     * </p>
     */
    private ListingItem item;
    /**
     * <p>
     * The revision of a listing.
     * </p>
     */
    private String listingRevision;
    /**
     * <p>
     * The name of the listing.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the listing.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the listing was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp of when the listing was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the listing was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the listing was created.
     * </p>
     * 
     * @return The timestamp of when the listing was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the listing was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the listing was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the listing.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @return The Amazon DataZone user who created the listing.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the listing.
     * </p>
     * 
     * @param description
     *        The description of the listing.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the listing.
     * </p>
     * 
     * @return The description of the listing.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the listing.
     * </p>
     * 
     * @param description
     *        The description of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the listing.
     * </p>
     * 
     * @param id
     *        The ID of the listing.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the listing.
     * </p>
     * 
     * @return The ID of the listing.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the listing.
     * </p>
     * 
     * @param id
     *        The ID of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The details of a listing.
     * </p>
     * 
     * @param item
     *        The details of a listing.
     */

    public void setItem(ListingItem item) {
        this.item = item;
    }

    /**
     * <p>
     * The details of a listing.
     * </p>
     * 
     * @return The details of a listing.
     */

    public ListingItem getItem() {
        return this.item;
    }

    /**
     * <p>
     * The details of a listing.
     * </p>
     * 
     * @param item
     *        The details of a listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withItem(ListingItem item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * The revision of a listing.
     * </p>
     * 
     * @param listingRevision
     *        The revision of a listing.
     */

    public void setListingRevision(String listingRevision) {
        this.listingRevision = listingRevision;
    }

    /**
     * <p>
     * The revision of a listing.
     * </p>
     * 
     * @return The revision of a listing.
     */

    public String getListingRevision() {
        return this.listingRevision;
    }

    /**
     * <p>
     * The revision of a listing.
     * </p>
     * 
     * @param listingRevision
     *        The revision of a listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withListingRevision(String listingRevision) {
        setListingRevision(listingRevision);
        return this;
    }

    /**
     * <p>
     * The name of the listing.
     * </p>
     * 
     * @param name
     *        The name of the listing.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the listing.
     * </p>
     * 
     * @return The name of the listing.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the listing.
     * </p>
     * 
     * @param name
     *        The name of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the listing.
     * </p>
     * 
     * @param status
     *        The status of the listing.
     * @see ListingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the listing.
     * </p>
     * 
     * @return The status of the listing.
     * @see ListingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the listing.
     * </p>
     * 
     * @param status
     *        The status of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public GetListingResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the listing.
     * </p>
     * 
     * @param status
     *        The status of the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public GetListingResult withStatus(ListingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the listing was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the listing was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the listing was updated.
     * </p>
     * 
     * @return The timestamp of when the listing was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the listing was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the listing was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the listing.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the listing.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetListingResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
        if (getListingRevision() != null)
            sb.append("ListingRevision: ").append(getListingRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetListingResult == false)
            return false;
        GetListingResult other = (GetListingResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getListingRevision() == null ^ this.getListingRevision() == null)
            return false;
        if (other.getListingRevision() != null && other.getListingRevision().equals(this.getListingRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getListingRevision() == null) ? 0 : getListingRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetListingResult clone() {
        try {
            return (GetListingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
