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
 * Object containing all the sort fields per entity type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/EntityTypeSort" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityTypeSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A sort for data products.
     * </p>
     */
    private DataProductSort dataProductSort;
    /**
     * <p>
     * A sort for SaaS products.
     * </p>
     */
    private SaaSProductSort saaSProductSort;
    /**
     * <p>
     * A sort for AMI products.
     * </p>
     */
    private AmiProductSort amiProductSort;
    /**
     * <p>
     * A sort for offers.
     * </p>
     */
    private OfferSort offerSort;
    /**
     * <p>
     * A sort for container products.
     * </p>
     */
    private ContainerProductSort containerProductSort;
    /**
     * <p>
     * A sort for Resale Authorizations.
     * </p>
     */
    private ResaleAuthorizationSort resaleAuthorizationSort;

    /**
     * <p>
     * A sort for data products.
     * </p>
     * 
     * @param dataProductSort
     *        A sort for data products.
     */

    public void setDataProductSort(DataProductSort dataProductSort) {
        this.dataProductSort = dataProductSort;
    }

    /**
     * <p>
     * A sort for data products.
     * </p>
     * 
     * @return A sort for data products.
     */

    public DataProductSort getDataProductSort() {
        return this.dataProductSort;
    }

    /**
     * <p>
     * A sort for data products.
     * </p>
     * 
     * @param dataProductSort
     *        A sort for data products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withDataProductSort(DataProductSort dataProductSort) {
        setDataProductSort(dataProductSort);
        return this;
    }

    /**
     * <p>
     * A sort for SaaS products.
     * </p>
     * 
     * @param saaSProductSort
     *        A sort for SaaS products.
     */

    public void setSaaSProductSort(SaaSProductSort saaSProductSort) {
        this.saaSProductSort = saaSProductSort;
    }

    /**
     * <p>
     * A sort for SaaS products.
     * </p>
     * 
     * @return A sort for SaaS products.
     */

    public SaaSProductSort getSaaSProductSort() {
        return this.saaSProductSort;
    }

    /**
     * <p>
     * A sort for SaaS products.
     * </p>
     * 
     * @param saaSProductSort
     *        A sort for SaaS products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withSaaSProductSort(SaaSProductSort saaSProductSort) {
        setSaaSProductSort(saaSProductSort);
        return this;
    }

    /**
     * <p>
     * A sort for AMI products.
     * </p>
     * 
     * @param amiProductSort
     *        A sort for AMI products.
     */

    public void setAmiProductSort(AmiProductSort amiProductSort) {
        this.amiProductSort = amiProductSort;
    }

    /**
     * <p>
     * A sort for AMI products.
     * </p>
     * 
     * @return A sort for AMI products.
     */

    public AmiProductSort getAmiProductSort() {
        return this.amiProductSort;
    }

    /**
     * <p>
     * A sort for AMI products.
     * </p>
     * 
     * @param amiProductSort
     *        A sort for AMI products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withAmiProductSort(AmiProductSort amiProductSort) {
        setAmiProductSort(amiProductSort);
        return this;
    }

    /**
     * <p>
     * A sort for offers.
     * </p>
     * 
     * @param offerSort
     *        A sort for offers.
     */

    public void setOfferSort(OfferSort offerSort) {
        this.offerSort = offerSort;
    }

    /**
     * <p>
     * A sort for offers.
     * </p>
     * 
     * @return A sort for offers.
     */

    public OfferSort getOfferSort() {
        return this.offerSort;
    }

    /**
     * <p>
     * A sort for offers.
     * </p>
     * 
     * @param offerSort
     *        A sort for offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withOfferSort(OfferSort offerSort) {
        setOfferSort(offerSort);
        return this;
    }

    /**
     * <p>
     * A sort for container products.
     * </p>
     * 
     * @param containerProductSort
     *        A sort for container products.
     */

    public void setContainerProductSort(ContainerProductSort containerProductSort) {
        this.containerProductSort = containerProductSort;
    }

    /**
     * <p>
     * A sort for container products.
     * </p>
     * 
     * @return A sort for container products.
     */

    public ContainerProductSort getContainerProductSort() {
        return this.containerProductSort;
    }

    /**
     * <p>
     * A sort for container products.
     * </p>
     * 
     * @param containerProductSort
     *        A sort for container products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withContainerProductSort(ContainerProductSort containerProductSort) {
        setContainerProductSort(containerProductSort);
        return this;
    }

    /**
     * <p>
     * A sort for Resale Authorizations.
     * </p>
     * 
     * @param resaleAuthorizationSort
     *        A sort for Resale Authorizations.
     */

    public void setResaleAuthorizationSort(ResaleAuthorizationSort resaleAuthorizationSort) {
        this.resaleAuthorizationSort = resaleAuthorizationSort;
    }

    /**
     * <p>
     * A sort for Resale Authorizations.
     * </p>
     * 
     * @return A sort for Resale Authorizations.
     */

    public ResaleAuthorizationSort getResaleAuthorizationSort() {
        return this.resaleAuthorizationSort;
    }

    /**
     * <p>
     * A sort for Resale Authorizations.
     * </p>
     * 
     * @param resaleAuthorizationSort
     *        A sort for Resale Authorizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityTypeSort withResaleAuthorizationSort(ResaleAuthorizationSort resaleAuthorizationSort) {
        setResaleAuthorizationSort(resaleAuthorizationSort);
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
        if (getDataProductSort() != null)
            sb.append("DataProductSort: ").append(getDataProductSort()).append(",");
        if (getSaaSProductSort() != null)
            sb.append("SaaSProductSort: ").append(getSaaSProductSort()).append(",");
        if (getAmiProductSort() != null)
            sb.append("AmiProductSort: ").append(getAmiProductSort()).append(",");
        if (getOfferSort() != null)
            sb.append("OfferSort: ").append(getOfferSort()).append(",");
        if (getContainerProductSort() != null)
            sb.append("ContainerProductSort: ").append(getContainerProductSort()).append(",");
        if (getResaleAuthorizationSort() != null)
            sb.append("ResaleAuthorizationSort: ").append(getResaleAuthorizationSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityTypeSort == false)
            return false;
        EntityTypeSort other = (EntityTypeSort) obj;
        if (other.getDataProductSort() == null ^ this.getDataProductSort() == null)
            return false;
        if (other.getDataProductSort() != null && other.getDataProductSort().equals(this.getDataProductSort()) == false)
            return false;
        if (other.getSaaSProductSort() == null ^ this.getSaaSProductSort() == null)
            return false;
        if (other.getSaaSProductSort() != null && other.getSaaSProductSort().equals(this.getSaaSProductSort()) == false)
            return false;
        if (other.getAmiProductSort() == null ^ this.getAmiProductSort() == null)
            return false;
        if (other.getAmiProductSort() != null && other.getAmiProductSort().equals(this.getAmiProductSort()) == false)
            return false;
        if (other.getOfferSort() == null ^ this.getOfferSort() == null)
            return false;
        if (other.getOfferSort() != null && other.getOfferSort().equals(this.getOfferSort()) == false)
            return false;
        if (other.getContainerProductSort() == null ^ this.getContainerProductSort() == null)
            return false;
        if (other.getContainerProductSort() != null && other.getContainerProductSort().equals(this.getContainerProductSort()) == false)
            return false;
        if (other.getResaleAuthorizationSort() == null ^ this.getResaleAuthorizationSort() == null)
            return false;
        if (other.getResaleAuthorizationSort() != null && other.getResaleAuthorizationSort().equals(this.getResaleAuthorizationSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProductSort() == null) ? 0 : getDataProductSort().hashCode());
        hashCode = prime * hashCode + ((getSaaSProductSort() == null) ? 0 : getSaaSProductSort().hashCode());
        hashCode = prime * hashCode + ((getAmiProductSort() == null) ? 0 : getAmiProductSort().hashCode());
        hashCode = prime * hashCode + ((getOfferSort() == null) ? 0 : getOfferSort().hashCode());
        hashCode = prime * hashCode + ((getContainerProductSort() == null) ? 0 : getContainerProductSort().hashCode());
        hashCode = prime * hashCode + ((getResaleAuthorizationSort() == null) ? 0 : getResaleAuthorizationSort().hashCode());
        return hashCode;
    }

    @Override
    public EntityTypeSort clone() {
        try {
            return (EntityTypeSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.EntityTypeSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
