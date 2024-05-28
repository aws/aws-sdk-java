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
 * Object containing all the filter fields for AMI products. Client can add only one wildcard filter and a maximum of 8
 * filters in a single <code>ListEntities</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/AmiProductFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmiProductFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the AMI product.
     * </p>
     */
    private AmiProductEntityIdFilter entityId;
    /**
     * <p>
     * The last date on which the AMI product was modified.
     * </p>
     */
    private AmiProductLastModifiedDateFilter lastModifiedDate;
    /**
     * <p>
     * The title of the AMI product.
     * </p>
     */
    private AmiProductTitleFilter productTitle;
    /**
     * <p>
     * The visibility of the AMI product.
     * </p>
     */
    private AmiProductVisibilityFilter visibility;

    /**
     * <p>
     * Unique identifier for the AMI product.
     * </p>
     * 
     * @param entityId
     *        Unique identifier for the AMI product.
     */

    public void setEntityId(AmiProductEntityIdFilter entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Unique identifier for the AMI product.
     * </p>
     * 
     * @return Unique identifier for the AMI product.
     */

    public AmiProductEntityIdFilter getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Unique identifier for the AMI product.
     * </p>
     * 
     * @param entityId
     *        Unique identifier for the AMI product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiProductFilters withEntityId(AmiProductEntityIdFilter entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The last date on which the AMI product was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last date on which the AMI product was modified.
     */

    public void setLastModifiedDate(AmiProductLastModifiedDateFilter lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last date on which the AMI product was modified.
     * </p>
     * 
     * @return The last date on which the AMI product was modified.
     */

    public AmiProductLastModifiedDateFilter getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last date on which the AMI product was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last date on which the AMI product was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiProductFilters withLastModifiedDate(AmiProductLastModifiedDateFilter lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The title of the AMI product.
     * </p>
     * 
     * @param productTitle
     *        The title of the AMI product.
     */

    public void setProductTitle(AmiProductTitleFilter productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * <p>
     * The title of the AMI product.
     * </p>
     * 
     * @return The title of the AMI product.
     */

    public AmiProductTitleFilter getProductTitle() {
        return this.productTitle;
    }

    /**
     * <p>
     * The title of the AMI product.
     * </p>
     * 
     * @param productTitle
     *        The title of the AMI product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiProductFilters withProductTitle(AmiProductTitleFilter productTitle) {
        setProductTitle(productTitle);
        return this;
    }

    /**
     * <p>
     * The visibility of the AMI product.
     * </p>
     * 
     * @param visibility
     *        The visibility of the AMI product.
     */

    public void setVisibility(AmiProductVisibilityFilter visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the AMI product.
     * </p>
     * 
     * @return The visibility of the AMI product.
     */

    public AmiProductVisibilityFilter getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the AMI product.
     * </p>
     * 
     * @param visibility
     *        The visibility of the AMI product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiProductFilters withVisibility(AmiProductVisibilityFilter visibility) {
        setVisibility(visibility);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getProductTitle() != null)
            sb.append("ProductTitle: ").append(getProductTitle()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmiProductFilters == false)
            return false;
        AmiProductFilters other = (AmiProductFilters) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getProductTitle() == null ^ this.getProductTitle() == null)
            return false;
        if (other.getProductTitle() != null && other.getProductTitle().equals(this.getProductTitle()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getProductTitle() == null) ? 0 : getProductTitle().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public AmiProductFilters clone() {
        try {
            return (AmiProductFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.AmiProductFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
