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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an asset published in an Amazon DataZone catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetListingItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListingItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The additional attributes of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private AssetListingItemAdditionalAttributes additionalAttributes;
    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The revision of the inventory asset.
     * </p>
     */
    private String entityRevision;
    /**
     * <p>
     * The type of the inventory asset.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * Glossary terms attached to the inventory asset.
     * </p>
     */
    private java.util.List<DetailedGlossaryTerm> glossaryTerms;
    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     */
    private String listingCreatedBy;
    /**
     * <p>
     * The identifier of the listing (asset published in Amazon DataZone catalog).
     * </p>
     */
    private String listingId;
    /**
     * <p>
     * The revision of the listing (asset published in Amazon DataZone catalog).
     * </p>
     */
    private String listingRevision;
    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     */
    private String listingUpdatedBy;
    /**
     * <p>
     * The name of the inventory asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the project that owns the inventory asset.
     * </p>
     */
    private String owningProjectId;

    /**
     * <p>
     * The additional attributes of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional attributes of an asset published in an Amazon DataZone catalog.
     */

    public void setAdditionalAttributes(AssetListingItemAdditionalAttributes additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    /**
     * <p>
     * The additional attributes of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The additional attributes of an asset published in an Amazon DataZone catalog.
     */

    public AssetListingItemAdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /**
     * <p>
     * The additional attributes of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional attributes of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withAdditionalAttributes(AssetListingItemAdditionalAttributes additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an asset published in an Amazon DataZone catalog was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @return The timestamp of when an asset published in an Amazon DataZone catalog was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param description
     *        The description of an asset published in an Amazon DataZone catalog.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The description of an asset published in an Amazon DataZone catalog.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param description
     *        The description of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @param entityId
     *        The identifier of the inventory asset.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @return The identifier of the inventory asset.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the inventory asset.
     * </p>
     * 
     * @param entityId
     *        The identifier of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The revision of the inventory asset.
     * </p>
     * 
     * @param entityRevision
     *        The revision of the inventory asset.
     */

    public void setEntityRevision(String entityRevision) {
        this.entityRevision = entityRevision;
    }

    /**
     * <p>
     * The revision of the inventory asset.
     * </p>
     * 
     * @return The revision of the inventory asset.
     */

    public String getEntityRevision() {
        return this.entityRevision;
    }

    /**
     * <p>
     * The revision of the inventory asset.
     * </p>
     * 
     * @param entityRevision
     *        The revision of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withEntityRevision(String entityRevision) {
        setEntityRevision(entityRevision);
        return this;
    }

    /**
     * <p>
     * The type of the inventory asset.
     * </p>
     * 
     * @param entityType
     *        The type of the inventory asset.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the inventory asset.
     * </p>
     * 
     * @return The type of the inventory asset.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the inventory asset.
     * </p>
     * 
     * @param entityType
     *        The type of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Glossary terms attached to the inventory asset.
     * </p>
     * 
     * @return Glossary terms attached to the inventory asset.
     */

    public java.util.List<DetailedGlossaryTerm> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * Glossary terms attached to the inventory asset.
     * </p>
     * 
     * @param glossaryTerms
     *        Glossary terms attached to the inventory asset.
     */

    public void setGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms);
    }

    /**
     * <p>
     * Glossary terms attached to the inventory asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        Glossary terms attached to the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withGlossaryTerms(DetailedGlossaryTerm... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms.length));
        }
        for (DetailedGlossaryTerm ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Glossary terms attached to the inventory asset.
     * </p>
     * 
     * @param glossaryTerms
     *        Glossary terms attached to the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @param listingCreatedBy
     *        The Amazon DataZone user who created the listing.
     */

    public void setListingCreatedBy(String listingCreatedBy) {
        this.listingCreatedBy = listingCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @return The Amazon DataZone user who created the listing.
     */

    public String getListingCreatedBy() {
        return this.listingCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the listing.
     * </p>
     * 
     * @param listingCreatedBy
     *        The Amazon DataZone user who created the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withListingCreatedBy(String listingCreatedBy) {
        setListingCreatedBy(listingCreatedBy);
        return this;
    }

    /**
     * <p>
     * The identifier of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @param listingId
     *        The identifier of the listing (asset published in Amazon DataZone catalog).
     */

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p>
     * The identifier of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @return The identifier of the listing (asset published in Amazon DataZone catalog).
     */

    public String getListingId() {
        return this.listingId;
    }

    /**
     * <p>
     * The identifier of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @param listingId
     *        The identifier of the listing (asset published in Amazon DataZone catalog).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withListingId(String listingId) {
        setListingId(listingId);
        return this;
    }

    /**
     * <p>
     * The revision of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @param listingRevision
     *        The revision of the listing (asset published in Amazon DataZone catalog).
     */

    public void setListingRevision(String listingRevision) {
        this.listingRevision = listingRevision;
    }

    /**
     * <p>
     * The revision of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @return The revision of the listing (asset published in Amazon DataZone catalog).
     */

    public String getListingRevision() {
        return this.listingRevision;
    }

    /**
     * <p>
     * The revision of the listing (asset published in Amazon DataZone catalog).
     * </p>
     * 
     * @param listingRevision
     *        The revision of the listing (asset published in Amazon DataZone catalog).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withListingRevision(String listingRevision) {
        setListingRevision(listingRevision);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @param listingUpdatedBy
     *        The Amazon DataZone user who updated the listing.
     */

    public void setListingUpdatedBy(String listingUpdatedBy) {
        this.listingUpdatedBy = listingUpdatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the listing.
     */

    public String getListingUpdatedBy() {
        return this.listingUpdatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the listing.
     * </p>
     * 
     * @param listingUpdatedBy
     *        The Amazon DataZone user who updated the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withListingUpdatedBy(String listingUpdatedBy) {
        setListingUpdatedBy(listingUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The name of the inventory asset.
     * </p>
     * 
     * @param name
     *        The name of the inventory asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the inventory asset.
     * </p>
     * 
     * @return The name of the inventory asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the inventory asset.
     * </p>
     * 
     * @param name
     *        The name of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project that owns the inventory asset.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project that owns the inventory asset.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project that owns the inventory asset.
     * </p>
     * 
     * @return The identifier of the project that owns the inventory asset.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project that owns the inventory asset.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project that owns the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItem withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
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
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityRevision() != null)
            sb.append("EntityRevision: ").append(getEntityRevision()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getListingCreatedBy() != null)
            sb.append("ListingCreatedBy: ").append(getListingCreatedBy()).append(",");
        if (getListingId() != null)
            sb.append("ListingId: ").append(getListingId()).append(",");
        if (getListingRevision() != null)
            sb.append("ListingRevision: ").append(getListingRevision()).append(",");
        if (getListingUpdatedBy() != null)
            sb.append("ListingUpdatedBy: ").append(getListingUpdatedBy()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetListingItem == false)
            return false;
        AssetListingItem other = (AssetListingItem) obj;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityRevision() == null ^ this.getEntityRevision() == null)
            return false;
        if (other.getEntityRevision() != null && other.getEntityRevision().equals(this.getEntityRevision()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getListingCreatedBy() == null ^ this.getListingCreatedBy() == null)
            return false;
        if (other.getListingCreatedBy() != null && other.getListingCreatedBy().equals(this.getListingCreatedBy()) == false)
            return false;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null && other.getListingId().equals(this.getListingId()) == false)
            return false;
        if (other.getListingRevision() == null ^ this.getListingRevision() == null)
            return false;
        if (other.getListingRevision() != null && other.getListingRevision().equals(this.getListingRevision()) == false)
            return false;
        if (other.getListingUpdatedBy() == null ^ this.getListingUpdatedBy() == null)
            return false;
        if (other.getListingUpdatedBy() != null && other.getListingUpdatedBy().equals(this.getListingUpdatedBy()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityRevision() == null) ? 0 : getEntityRevision().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getListingCreatedBy() == null) ? 0 : getListingCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        hashCode = prime * hashCode + ((getListingRevision() == null) ? 0 : getListingRevision().hashCode());
        hashCode = prime * hashCode + ((getListingUpdatedBy() == null) ? 0 : getListingUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        return hashCode;
    }

    @Override
    public AssetListingItem clone() {
        try {
            return (AssetListingItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetListingItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
