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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListResourceCatalogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceCatalogsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     * <code>ResourceCatalog</code> by name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The order in which the resource catalogs are listed.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The value on which the resource catalog list is sorted.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The maximum number of results returned by <code>ListResourceCatalogs</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     * <code>ResourceCatalog</code> by name.
     * </p>
     * 
     * @param nameContains
     *        A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     *        <code>ResourceCatalog</code> by name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     * <code>ResourceCatalog</code> by name.
     * </p>
     * 
     * @return A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     *         <code>ResourceCatalog</code> by name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     * <code>ResourceCatalog</code> by name.
     * </p>
     * 
     * @param nameContains
     *        A string that partially matches one or more <code>ResourceCatalog</code>s names. Filters
     *        <code>ResourceCatalog</code> by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     * </p>
     * 
     * @return Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Use this parameter to search for <code>ResourceCatalog</code>s created after a specific date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     * </p>
     * 
     * @return Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Use this parameter to search for <code>ResourceCatalog</code>s created before a specific date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The order in which the resource catalogs are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which the resource catalogs are listed.
     * @see ResourceCatalogSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which the resource catalogs are listed.
     * </p>
     * 
     * @return The order in which the resource catalogs are listed.
     * @see ResourceCatalogSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order in which the resource catalogs are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which the resource catalogs are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCatalogSortOrder
     */

    public ListResourceCatalogsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order in which the resource catalogs are listed.
     * </p>
     * 
     * @param sortOrder
     *        The order in which the resource catalogs are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCatalogSortOrder
     */

    public ListResourceCatalogsRequest withSortOrder(ResourceCatalogSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The value on which the resource catalog list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the resource catalog list is sorted.
     * @see ResourceCatalogSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value on which the resource catalog list is sorted.
     * </p>
     * 
     * @return The value on which the resource catalog list is sorted.
     * @see ResourceCatalogSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value on which the resource catalog list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the resource catalog list is sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCatalogSortBy
     */

    public ListResourceCatalogsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value on which the resource catalog list is sorted.
     * </p>
     * 
     * @param sortBy
     *        The value on which the resource catalog list is sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCatalogSortBy
     */

    public ListResourceCatalogsRequest withSortBy(ResourceCatalogSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListResourceCatalogs</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListResourceCatalogs</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListResourceCatalogs</code>.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListResourceCatalogs</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListResourceCatalogs</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListResourceCatalogs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListResourceCatalogs</code> results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @return A token to resume pagination of <code>ListResourceCatalogs</code> results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListResourceCatalogs</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceCatalogsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceCatalogsRequest == false)
            return false;
        ListResourceCatalogsRequest other = (ListResourceCatalogsRequest) obj;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceCatalogsRequest clone() {
        return (ListResourceCatalogsRequest) super.clone();
    }

}
