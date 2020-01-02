/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/Sort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     * <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     * <code>DESCENDING</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     * <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * 
     * @param sortBy
     *        For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     *        <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.</p>
     *        <p>
     *        For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and
     *        <code>EndTime</code>.
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     * <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * 
     * @return For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     *         <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.</p>
     *         <p>
     *         For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and
     *         <code>EndTime</code>.
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     * <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.
     * </p>
     * <p>
     * For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and <code>EndTime</code>.
     * </p>
     * 
     * @param sortBy
     *        For <code>ListEntities</code>, supported attributes include <code>LastModifiedDate</code> (default),
     *        <code>Visibility</code>, <code>EntityId</code>, and <code>Name</code>.</p>
     *        <p>
     *        For <code>ListChangeSets</code>, supported attributes include <code>StartTime</code> and
     *        <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sort withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     *        <code>DESCENDING</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @return The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     *         <code>DESCENDING</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     *        <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Sort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     * <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sorting order. Can be <code>ASCENDING</code> or <code>DESCENDING</code>. The default value is
     *        <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Sort withSortOrder(SortOrder sortOrder) {
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

        if (obj instanceof Sort == false)
            return false;
        Sort other = (Sort) obj;
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
    public Sort clone() {
        try {
            return (Sort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.SortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
