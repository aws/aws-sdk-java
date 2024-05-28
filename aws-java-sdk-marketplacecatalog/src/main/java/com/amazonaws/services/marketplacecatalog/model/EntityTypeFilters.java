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
 * Object containing all the filter fields per entity type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntityTypeFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityTypeFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A filter for data products.
     * </p>
     */
    private DataProductFilters dataProductFilters;
    /**
     * <p>
     * A filter for SaaS products.
     * </p>
     */
    private SaaSProductFilters saaSProductFilters;
    /**
     * <p>
     * A filter for AMI products.
     * </p>
     */
    private AmiProductFilters amiProductFilters;
    /**
     * <p>
     * A filter for offers.
     * </p>
     */
    private OfferFilters offerFilters;
    /**
     * <p>
     * A filter for container products.
     * </p>
     */
    private ContainerProductFilters containerProductFilters;
    /**
     * <p>
     * A filter for Resale Authorizations.
     * </p>
     */
    private ResaleAuthorizationFilters resaleAuthorizationFilters;

    /**
     * <p>
     * A filter for data products.
     * </p>
     * 
     * @param dataProductFilters
     *        A filter for data products.
     */

    public void setDataProductFilters(DataProductFilters dataProductFilters) {
        this.dataProductFilters = dataProductFilters;
    }

    /**
     * <p>
     * A filter for data products.
     * </p>
     * 
     * @return A filter for data products.
     */

    public DataProductFilters getDataProductFilters() {
        return this.dataProductFilters;
    }

    /**
     * <p>
     * A filter for data products.
     * </p>
     * 
     * @param dataProductFilters
     *        A filter for data products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withDataProductFilters(DataProductFilters dataProductFilters) {
        setDataProductFilters(dataProductFilters);
        return this;
    }

    /**
     * <p>
     * A filter for SaaS products.
     * </p>
     * 
     * @param saaSProductFilters
     *        A filter for SaaS products.
     */

    public void setSaaSProductFilters(SaaSProductFilters saaSProductFilters) {
        this.saaSProductFilters = saaSProductFilters;
    }

    /**
     * <p>
     * A filter for SaaS products.
     * </p>
     * 
     * @return A filter for SaaS products.
     */

    public SaaSProductFilters getSaaSProductFilters() {
        return this.saaSProductFilters;
    }

    /**
     * <p>
     * A filter for SaaS products.
     * </p>
     * 
     * @param saaSProductFilters
     *        A filter for SaaS products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withSaaSProductFilters(SaaSProductFilters saaSProductFilters) {
        setSaaSProductFilters(saaSProductFilters);
        return this;
    }

    /**
     * <p>
     * A filter for AMI products.
     * </p>
     * 
     * @param amiProductFilters
     *        A filter for AMI products.
     */

    public void setAmiProductFilters(AmiProductFilters amiProductFilters) {
        this.amiProductFilters = amiProductFilters;
    }

    /**
     * <p>
     * A filter for AMI products.
     * </p>
     * 
     * @return A filter for AMI products.
     */

    public AmiProductFilters getAmiProductFilters() {
        return this.amiProductFilters;
    }

    /**
     * <p>
     * A filter for AMI products.
     * </p>
     * 
     * @param amiProductFilters
     *        A filter for AMI products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withAmiProductFilters(AmiProductFilters amiProductFilters) {
        setAmiProductFilters(amiProductFilters);
        return this;
    }

    /**
     * <p>
     * A filter for offers.
     * </p>
     * 
     * @param offerFilters
     *        A filter for offers.
     */

    public void setOfferFilters(OfferFilters offerFilters) {
        this.offerFilters = offerFilters;
    }

    /**
     * <p>
     * A filter for offers.
     * </p>
     * 
     * @return A filter for offers.
     */

    public OfferFilters getOfferFilters() {
        return this.offerFilters;
    }

    /**
     * <p>
     * A filter for offers.
     * </p>
     * 
     * @param offerFilters
     *        A filter for offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withOfferFilters(OfferFilters offerFilters) {
        setOfferFilters(offerFilters);
        return this;
    }

    /**
     * <p>
     * A filter for container products.
     * </p>
     * 
     * @param containerProductFilters
     *        A filter for container products.
     */

    public void setContainerProductFilters(ContainerProductFilters containerProductFilters) {
        this.containerProductFilters = containerProductFilters;
    }

    /**
     * <p>
     * A filter for container products.
     * </p>
     * 
     * @return A filter for container products.
     */

    public ContainerProductFilters getContainerProductFilters() {
        return this.containerProductFilters;
    }

    /**
     * <p>
     * A filter for container products.
     * </p>
     * 
     * @param containerProductFilters
     *        A filter for container products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withContainerProductFilters(ContainerProductFilters containerProductFilters) {
        setContainerProductFilters(containerProductFilters);
        return this;
    }

    /**
     * <p>
     * A filter for Resale Authorizations.
     * </p>
     * 
     * @param resaleAuthorizationFilters
     *        A filter for Resale Authorizations.
     */

    public void setResaleAuthorizationFilters(ResaleAuthorizationFilters resaleAuthorizationFilters) {
        this.resaleAuthorizationFilters = resaleAuthorizationFilters;
    }

    /**
     * <p>
     * A filter for Resale Authorizations.
     * </p>
     * 
     * @return A filter for Resale Authorizations.
     */

    public ResaleAuthorizationFilters getResaleAuthorizationFilters() {
        return this.resaleAuthorizationFilters;
    }

    /**
     * <p>
     * A filter for Resale Authorizations.
     * </p>
     * 
     * @param resaleAuthorizationFilters
     *        A filter for Resale Authorizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeFilters withResaleAuthorizationFilters(ResaleAuthorizationFilters resaleAuthorizationFilters) {
        setResaleAuthorizationFilters(resaleAuthorizationFilters);
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
        if (getDataProductFilters() != null)
            sb.append("DataProductFilters: ").append(getDataProductFilters()).append(",");
        if (getSaaSProductFilters() != null)
            sb.append("SaaSProductFilters: ").append(getSaaSProductFilters()).append(",");
        if (getAmiProductFilters() != null)
            sb.append("AmiProductFilters: ").append(getAmiProductFilters()).append(",");
        if (getOfferFilters() != null)
            sb.append("OfferFilters: ").append(getOfferFilters()).append(",");
        if (getContainerProductFilters() != null)
            sb.append("ContainerProductFilters: ").append(getContainerProductFilters()).append(",");
        if (getResaleAuthorizationFilters() != null)
            sb.append("ResaleAuthorizationFilters: ").append(getResaleAuthorizationFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityTypeFilters == false)
            return false;
        EntityTypeFilters other = (EntityTypeFilters) obj;
        if (other.getDataProductFilters() == null ^ this.getDataProductFilters() == null)
            return false;
        if (other.getDataProductFilters() != null && other.getDataProductFilters().equals(this.getDataProductFilters()) == false)
            return false;
        if (other.getSaaSProductFilters() == null ^ this.getSaaSProductFilters() == null)
            return false;
        if (other.getSaaSProductFilters() != null && other.getSaaSProductFilters().equals(this.getSaaSProductFilters()) == false)
            return false;
        if (other.getAmiProductFilters() == null ^ this.getAmiProductFilters() == null)
            return false;
        if (other.getAmiProductFilters() != null && other.getAmiProductFilters().equals(this.getAmiProductFilters()) == false)
            return false;
        if (other.getOfferFilters() == null ^ this.getOfferFilters() == null)
            return false;
        if (other.getOfferFilters() != null && other.getOfferFilters().equals(this.getOfferFilters()) == false)
            return false;
        if (other.getContainerProductFilters() == null ^ this.getContainerProductFilters() == null)
            return false;
        if (other.getContainerProductFilters() != null && other.getContainerProductFilters().equals(this.getContainerProductFilters()) == false)
            return false;
        if (other.getResaleAuthorizationFilters() == null ^ this.getResaleAuthorizationFilters() == null)
            return false;
        if (other.getResaleAuthorizationFilters() != null && other.getResaleAuthorizationFilters().equals(this.getResaleAuthorizationFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProductFilters() == null) ? 0 : getDataProductFilters().hashCode());
        hashCode = prime * hashCode + ((getSaaSProductFilters() == null) ? 0 : getSaaSProductFilters().hashCode());
        hashCode = prime * hashCode + ((getAmiProductFilters() == null) ? 0 : getAmiProductFilters().hashCode());
        hashCode = prime * hashCode + ((getOfferFilters() == null) ? 0 : getOfferFilters().hashCode());
        hashCode = prime * hashCode + ((getContainerProductFilters() == null) ? 0 : getContainerProductFilters().hashCode());
        hashCode = prime * hashCode + ((getResaleAuthorizationFilters() == null) ? 0 : getResaleAuthorizationFilters().hashCode());
        return hashCode;
    }

    @Override
    public EntityTypeFilters clone() {
        try {
            return (EntityTypeFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.EntityTypeFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
