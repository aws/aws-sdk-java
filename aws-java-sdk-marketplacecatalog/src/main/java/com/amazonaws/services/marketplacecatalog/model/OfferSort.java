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
 * Allows to sort offers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/OfferSort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Allows to sort offers.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortBy
     *        Allows to sort offers.
     * @see OfferSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @return Allows to sort offers.
     * @see OfferSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortBy
     *        Allows to sort offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferSortBy
     */

    public OfferSort withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortBy
     *        Allows to sort offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferSortBy
     */

    public OfferSort withSortBy(OfferSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortOrder
     *        Allows to sort offers.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @return Allows to sort offers.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortOrder
     *        Allows to sort offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public OfferSort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Allows to sort offers.
     * </p>
     * 
     * @param sortOrder
     *        Allows to sort offers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public OfferSort withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferSort == false)
            return false;
        OfferSort other = (OfferSort) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public OfferSort clone() {
        try {
            return (OfferSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.OfferSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
