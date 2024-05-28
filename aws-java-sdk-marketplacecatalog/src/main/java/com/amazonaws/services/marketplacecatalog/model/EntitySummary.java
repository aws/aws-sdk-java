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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This object is a container for common summary information about the entity. The summary doesn't contain the whole
 * entity structure, but it does contain information common across all entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntitySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the seller.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the entity.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing buyers can view it).
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * An object that contains summary information about the AMI product.
     * </p>
     */
    private AmiProductSummary amiProductSummary;
    /**
     * <p>
     * An object that contains summary information about the container product.
     * </p>
     */
    private ContainerProductSummary containerProductSummary;
    /**
     * <p>
     * An object that contains summary information about the data product.
     * </p>
     */
    private DataProductSummary dataProductSummary;
    /**
     * <p>
     * An object that contains summary information about the SaaS product.
     * </p>
     */
    private SaaSProductSummary saaSProductSummary;
    /**
     * <p>
     * An object that contains summary information about the offer.
     * </p>
     */
    private OfferSummary offerSummary;
    /**
     * <p>
     * An object that contains summary information about the Resale Authorization.
     * </p>
     */
    private ResaleAuthorizationSummary resaleAuthorizationSummary;

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the seller.
     * </p>
     * 
     * @param name
     *        The name for the entity. This value is not unique. It is defined by the seller.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the seller.
     * </p>
     * 
     * @return The name for the entity. This value is not unique. It is defined by the seller.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the entity. This value is not unique. It is defined by the seller.
     * </p>
     * 
     * @param name
     *        The name for the entity. This value is not unique. It is defined by the seller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @param entityType
     *        The type of the entity.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @return The type of the entity.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the entity.
     * </p>
     * 
     * @param entityType
     *        The type of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @param entityId
     *        The unique identifier for the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @return The unique identifier for the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The unique identifier for the entity.
     * </p>
     * 
     * @param entityId
     *        The unique identifier for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated with the unique identifier for the entity.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @return The ARN associated with the unique identifier for the entity.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the entity.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated with the unique identifier for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @return The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing buyers can view it).
     * </p>
     * 
     * @param visibility
     *        The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view
     *        the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *        <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view
     *        it).
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing buyers can view it).
     * </p>
     * 
     * @return The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view
     *         the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *         <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view
     *         it).
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view the
     * entity), <code>Limited</code> (the entity is visible to limited accounts only), or <code>Restricted</code> (the
     * entity was published and then unpublished and only existing buyers can view it).
     * </p>
     * 
     * @param visibility
     *        The visibility status of the entity to buyers. This value can be <code>Public</code> (everyone can view
     *        the entity), <code>Limited</code> (the entity is visible to limited accounts only), or
     *        <code>Restricted</code> (the entity was published and then unpublished and only existing buyers can view
     *        it).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the AMI product.
     * </p>
     * 
     * @param amiProductSummary
     *        An object that contains summary information about the AMI product.
     */

    public void setAmiProductSummary(AmiProductSummary amiProductSummary) {
        this.amiProductSummary = amiProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the AMI product.
     * </p>
     * 
     * @return An object that contains summary information about the AMI product.
     */

    public AmiProductSummary getAmiProductSummary() {
        return this.amiProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the AMI product.
     * </p>
     * 
     * @param amiProductSummary
     *        An object that contains summary information about the AMI product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withAmiProductSummary(AmiProductSummary amiProductSummary) {
        setAmiProductSummary(amiProductSummary);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the container product.
     * </p>
     * 
     * @param containerProductSummary
     *        An object that contains summary information about the container product.
     */

    public void setContainerProductSummary(ContainerProductSummary containerProductSummary) {
        this.containerProductSummary = containerProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the container product.
     * </p>
     * 
     * @return An object that contains summary information about the container product.
     */

    public ContainerProductSummary getContainerProductSummary() {
        return this.containerProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the container product.
     * </p>
     * 
     * @param containerProductSummary
     *        An object that contains summary information about the container product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withContainerProductSummary(ContainerProductSummary containerProductSummary) {
        setContainerProductSummary(containerProductSummary);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the data product.
     * </p>
     * 
     * @param dataProductSummary
     *        An object that contains summary information about the data product.
     */

    public void setDataProductSummary(DataProductSummary dataProductSummary) {
        this.dataProductSummary = dataProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the data product.
     * </p>
     * 
     * @return An object that contains summary information about the data product.
     */

    public DataProductSummary getDataProductSummary() {
        return this.dataProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the data product.
     * </p>
     * 
     * @param dataProductSummary
     *        An object that contains summary information about the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withDataProductSummary(DataProductSummary dataProductSummary) {
        setDataProductSummary(dataProductSummary);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the SaaS product.
     * </p>
     * 
     * @param saaSProductSummary
     *        An object that contains summary information about the SaaS product.
     */

    public void setSaaSProductSummary(SaaSProductSummary saaSProductSummary) {
        this.saaSProductSummary = saaSProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the SaaS product.
     * </p>
     * 
     * @return An object that contains summary information about the SaaS product.
     */

    public SaaSProductSummary getSaaSProductSummary() {
        return this.saaSProductSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the SaaS product.
     * </p>
     * 
     * @param saaSProductSummary
     *        An object that contains summary information about the SaaS product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withSaaSProductSummary(SaaSProductSummary saaSProductSummary) {
        setSaaSProductSummary(saaSProductSummary);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the offer.
     * </p>
     * 
     * @param offerSummary
     *        An object that contains summary information about the offer.
     */

    public void setOfferSummary(OfferSummary offerSummary) {
        this.offerSummary = offerSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the offer.
     * </p>
     * 
     * @return An object that contains summary information about the offer.
     */

    public OfferSummary getOfferSummary() {
        return this.offerSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the offer.
     * </p>
     * 
     * @param offerSummary
     *        An object that contains summary information about the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withOfferSummary(OfferSummary offerSummary) {
        setOfferSummary(offerSummary);
        return this;
    }

    /**
     * <p>
     * An object that contains summary information about the Resale Authorization.
     * </p>
     * 
     * @param resaleAuthorizationSummary
     *        An object that contains summary information about the Resale Authorization.
     */

    public void setResaleAuthorizationSummary(ResaleAuthorizationSummary resaleAuthorizationSummary) {
        this.resaleAuthorizationSummary = resaleAuthorizationSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the Resale Authorization.
     * </p>
     * 
     * @return An object that contains summary information about the Resale Authorization.
     */

    public ResaleAuthorizationSummary getResaleAuthorizationSummary() {
        return this.resaleAuthorizationSummary;
    }

    /**
     * <p>
     * An object that contains summary information about the Resale Authorization.
     * </p>
     * 
     * @param resaleAuthorizationSummary
     *        An object that contains summary information about the Resale Authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitySummary withResaleAuthorizationSummary(ResaleAuthorizationSummary resaleAuthorizationSummary) {
        setResaleAuthorizationSummary(resaleAuthorizationSummary);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getAmiProductSummary() != null)
            sb.append("AmiProductSummary: ").append(getAmiProductSummary()).append(",");
        if (getContainerProductSummary() != null)
            sb.append("ContainerProductSummary: ").append(getContainerProductSummary()).append(",");
        if (getDataProductSummary() != null)
            sb.append("DataProductSummary: ").append(getDataProductSummary()).append(",");
        if (getSaaSProductSummary() != null)
            sb.append("SaaSProductSummary: ").append(getSaaSProductSummary()).append(",");
        if (getOfferSummary() != null)
            sb.append("OfferSummary: ").append(getOfferSummary()).append(",");
        if (getResaleAuthorizationSummary() != null)
            sb.append("ResaleAuthorizationSummary: ").append(getResaleAuthorizationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntitySummary == false)
            return false;
        EntitySummary other = (EntitySummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getAmiProductSummary() == null ^ this.getAmiProductSummary() == null)
            return false;
        if (other.getAmiProductSummary() != null && other.getAmiProductSummary().equals(this.getAmiProductSummary()) == false)
            return false;
        if (other.getContainerProductSummary() == null ^ this.getContainerProductSummary() == null)
            return false;
        if (other.getContainerProductSummary() != null && other.getContainerProductSummary().equals(this.getContainerProductSummary()) == false)
            return false;
        if (other.getDataProductSummary() == null ^ this.getDataProductSummary() == null)
            return false;
        if (other.getDataProductSummary() != null && other.getDataProductSummary().equals(this.getDataProductSummary()) == false)
            return false;
        if (other.getSaaSProductSummary() == null ^ this.getSaaSProductSummary() == null)
            return false;
        if (other.getSaaSProductSummary() != null && other.getSaaSProductSummary().equals(this.getSaaSProductSummary()) == false)
            return false;
        if (other.getOfferSummary() == null ^ this.getOfferSummary() == null)
            return false;
        if (other.getOfferSummary() != null && other.getOfferSummary().equals(this.getOfferSummary()) == false)
            return false;
        if (other.getResaleAuthorizationSummary() == null ^ this.getResaleAuthorizationSummary() == null)
            return false;
        if (other.getResaleAuthorizationSummary() != null && other.getResaleAuthorizationSummary().equals(this.getResaleAuthorizationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getAmiProductSummary() == null) ? 0 : getAmiProductSummary().hashCode());
        hashCode = prime * hashCode + ((getContainerProductSummary() == null) ? 0 : getContainerProductSummary().hashCode());
        hashCode = prime * hashCode + ((getDataProductSummary() == null) ? 0 : getDataProductSummary().hashCode());
        hashCode = prime * hashCode + ((getSaaSProductSummary() == null) ? 0 : getSaaSProductSummary().hashCode());
        hashCode = prime * hashCode + ((getOfferSummary() == null) ? 0 : getOfferSummary().hashCode());
        hashCode = prime * hashCode + ((getResaleAuthorizationSummary() == null) ? 0 : getResaleAuthorizationSummary().hashCode());
        return hashCode;
    }

    @Override
    public EntitySummary clone() {
        try {
            return (EntitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.EntitySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
