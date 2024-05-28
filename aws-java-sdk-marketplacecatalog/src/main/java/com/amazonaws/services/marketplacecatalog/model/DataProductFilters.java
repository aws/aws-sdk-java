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
 * Object containing all the filter fields for data products. Client can add only one wildcard filter and a maximum of 8
 * filters in a single <code>ListEntities</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DataProductFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the data product.
     * </p>
     */
    private DataProductEntityIdFilter entityId;
    /**
     * <p>
     * The title of the data product.
     * </p>
     */
    private DataProductTitleFilter productTitle;
    /**
     * <p>
     * The visibility of the data product.
     * </p>
     */
    private DataProductVisibilityFilter visibility;
    /**
     * <p>
     * The last date on which the data product was modified.
     * </p>
     */
    private DataProductLastModifiedDateFilter lastModifiedDate;

    /**
     * <p>
     * Unique identifier for the data product.
     * </p>
     * 
     * @param entityId
     *        Unique identifier for the data product.
     */

    public void setEntityId(DataProductEntityIdFilter entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Unique identifier for the data product.
     * </p>
     * 
     * @return Unique identifier for the data product.
     */

    public DataProductEntityIdFilter getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Unique identifier for the data product.
     * </p>
     * 
     * @param entityId
     *        Unique identifier for the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductFilters withEntityId(DataProductEntityIdFilter entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @param productTitle
     *        The title of the data product.
     */

    public void setProductTitle(DataProductTitleFilter productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @return The title of the data product.
     */

    public DataProductTitleFilter getProductTitle() {
        return this.productTitle;
    }

    /**
     * <p>
     * The title of the data product.
     * </p>
     * 
     * @param productTitle
     *        The title of the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductFilters withProductTitle(DataProductTitleFilter productTitle) {
        setProductTitle(productTitle);
        return this;
    }

    /**
     * <p>
     * The visibility of the data product.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data product.
     */

    public void setVisibility(DataProductVisibilityFilter visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the data product.
     * </p>
     * 
     * @return The visibility of the data product.
     */

    public DataProductVisibilityFilter getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the data product.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductFilters withVisibility(DataProductVisibilityFilter visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The last date on which the data product was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last date on which the data product was modified.
     */

    public void setLastModifiedDate(DataProductLastModifiedDateFilter lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last date on which the data product was modified.
     * </p>
     * 
     * @return The last date on which the data product was modified.
     */

    public DataProductLastModifiedDateFilter getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last date on which the data product was modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last date on which the data product was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductFilters withLastModifiedDate(DataProductLastModifiedDateFilter lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getProductTitle() != null)
            sb.append("ProductTitle: ").append(getProductTitle()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductFilters == false)
            return false;
        DataProductFilters other = (DataProductFilters) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getProductTitle() == null ^ this.getProductTitle() == null)
            return false;
        if (other.getProductTitle() != null && other.getProductTitle().equals(this.getProductTitle()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getProductTitle() == null) ? 0 : getProductTitle().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DataProductFilters clone() {
        try {
            return (DataProductFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.DataProductFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
