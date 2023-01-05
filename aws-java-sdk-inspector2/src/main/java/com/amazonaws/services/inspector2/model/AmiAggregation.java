/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that define an aggregation based on Amazon machine images (AMIs).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AmiAggregation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmiAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs of AMIs to aggregate findings for.
     * </p>
     */
    private java.util.List<StringFilter> amis;
    /**
     * <p>
     * The value to sort results by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to sort results by.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The IDs of AMIs to aggregate findings for.
     * </p>
     * 
     * @return The IDs of AMIs to aggregate findings for.
     */

    public java.util.List<StringFilter> getAmis() {
        return amis;
    }

    /**
     * <p>
     * The IDs of AMIs to aggregate findings for.
     * </p>
     * 
     * @param amis
     *        The IDs of AMIs to aggregate findings for.
     */

    public void setAmis(java.util.Collection<StringFilter> amis) {
        if (amis == null) {
            this.amis = null;
            return;
        }

        this.amis = new java.util.ArrayList<StringFilter>(amis);
    }

    /**
     * <p>
     * The IDs of AMIs to aggregate findings for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAmis(java.util.Collection)} or {@link #withAmis(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param amis
     *        The IDs of AMIs to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregation withAmis(StringFilter... amis) {
        if (this.amis == null) {
            setAmis(new java.util.ArrayList<StringFilter>(amis.length));
        }
        for (StringFilter ele : amis) {
            this.amis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of AMIs to aggregate findings for.
     * </p>
     * 
     * @param amis
     *        The IDs of AMIs to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregation withAmis(java.util.Collection<StringFilter> amis) {
        setAmis(amis);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @see AmiSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @return The value to sort results by.
     * @see AmiSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmiSortBy
     */

    public AmiAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmiSortBy
     */

    public AmiAggregation withSortBy(AmiSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @return The order to sort results by.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public AmiAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public AmiAggregation withSortOrder(SortOrder sortOrder) {
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
        if (getAmis() != null)
            sb.append("Amis: ").append(getAmis()).append(",");
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

        if (obj instanceof AmiAggregation == false)
            return false;
        AmiAggregation other = (AmiAggregation) obj;
        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public AmiAggregation clone() {
        try {
            return (AmiAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AmiAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
