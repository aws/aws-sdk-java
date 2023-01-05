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
 * The details that define an aggregation based on operating system package type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/PackageAggregation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names of packages to aggregate findings on.
     * </p>
     */
    private java.util.List<StringFilter> packageNames;
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
     * The names of packages to aggregate findings on.
     * </p>
     * 
     * @return The names of packages to aggregate findings on.
     */

    public java.util.List<StringFilter> getPackageNames() {
        return packageNames;
    }

    /**
     * <p>
     * The names of packages to aggregate findings on.
     * </p>
     * 
     * @param packageNames
     *        The names of packages to aggregate findings on.
     */

    public void setPackageNames(java.util.Collection<StringFilter> packageNames) {
        if (packageNames == null) {
            this.packageNames = null;
            return;
        }

        this.packageNames = new java.util.ArrayList<StringFilter>(packageNames);
    }

    /**
     * <p>
     * The names of packages to aggregate findings on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageNames(java.util.Collection)} or {@link #withPackageNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param packageNames
     *        The names of packages to aggregate findings on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageAggregation withPackageNames(StringFilter... packageNames) {
        if (this.packageNames == null) {
            setPackageNames(new java.util.ArrayList<StringFilter>(packageNames.length));
        }
        for (StringFilter ele : packageNames) {
            this.packageNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of packages to aggregate findings on.
     * </p>
     * 
     * @param packageNames
     *        The names of packages to aggregate findings on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageAggregation withPackageNames(java.util.Collection<StringFilter> packageNames) {
        setPackageNames(packageNames);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @see PackageSortBy
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
     * @see PackageSortBy
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
     * @see PackageSortBy
     */

    public PackageAggregation withSortBy(String sortBy) {
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
     * @see PackageSortBy
     */

    public PackageAggregation withSortBy(PackageSortBy sortBy) {
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

    public PackageAggregation withSortOrder(String sortOrder) {
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

    public PackageAggregation withSortOrder(SortOrder sortOrder) {
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
        if (getPackageNames() != null)
            sb.append("PackageNames: ").append(getPackageNames()).append(",");
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

        if (obj instanceof PackageAggregation == false)
            return false;
        PackageAggregation other = (PackageAggregation) obj;
        if (other.getPackageNames() == null ^ this.getPackageNames() == null)
            return false;
        if (other.getPackageNames() != null && other.getPackageNames().equals(this.getPackageNames()) == false)
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

        hashCode = prime * hashCode + ((getPackageNames() == null) ? 0 : getPackageNames().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public PackageAggregation clone() {
        try {
            return (PackageAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.PackageAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
