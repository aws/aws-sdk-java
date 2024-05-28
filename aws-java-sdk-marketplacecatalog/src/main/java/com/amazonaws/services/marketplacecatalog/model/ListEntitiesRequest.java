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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>,
     * <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>, <code>Experience</code>,
     * <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>, <code>Seller</code>,
     * <code>ResaleAuthorization</code>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     * <code>filterValues</code>.
     * </p>
     */
    private java.util.List<Filter> filterList;
    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     * </p>
     */
    private Sort sort;
    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list entities
     * shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>. Entities shared
     * through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be discovered through the
     * <code>SHARED</code> parameter.
     * </p>
     */
    private String ownershipType;
    /**
     * <p>
     * A Union object containing filter shapes for all <code>EntityType</code>s. Each <code>EntityTypeFilter</code>
     * shape will have filters applicable for that <code>EntityType</code> that can be used to search or filter
     * entities.
     * </p>
     */
    private EntityTypeFilters entityTypeFilters;
    /**
     * <p>
     * A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     * <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for fields
     * on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     * </p>
     */
    private EntityTypeSort entityTypeSort;

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @return The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>,
     * <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>, <code>Experience</code>,
     * <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>, <code>Seller</code>,
     * <code>ResaleAuthorization</code>.
     * </p>
     * 
     * @param entityType
     *        The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>
     *        , <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>,
     *        <code>Experience</code>, <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>,
     *        <code>Seller</code>, <code>ResaleAuthorization</code>.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>,
     * <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>, <code>Experience</code>,
     * <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>, <code>Seller</code>,
     * <code>ResaleAuthorization</code>.
     * </p>
     * 
     * @return The type of entities to retrieve. Valid values are: <code>AmiProduct</code>,
     *         <code>ContainerProduct</code>, <code>DataProduct</code>, <code>SaaSProduct</code>,
     *         <code>ProcurementPolicy</code>, <code>Experience</code>, <code>Audience</code>,
     *         <code>BrandingSettings</code>, <code>Offer</code>, <code>Seller</code>, <code>ResaleAuthorization</code>.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>,
     * <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>, <code>Experience</code>,
     * <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>, <code>Seller</code>,
     * <code>ResaleAuthorization</code>.
     * </p>
     * 
     * @param entityType
     *        The type of entities to retrieve. Valid values are: <code>AmiProduct</code>, <code>ContainerProduct</code>
     *        , <code>DataProduct</code>, <code>SaaSProduct</code>, <code>ProcurementPolicy</code>,
     *        <code>Experience</code>, <code>Audience</code>, <code>BrandingSettings</code>, <code>Offer</code>,
     *        <code>Seller</code>, <code>ResaleAuthorization</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     * <code>filterValues</code>.
     * </p>
     * 
     * @return An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     *         <code>filterValues</code>.
     */

    public java.util.List<Filter> getFilterList() {
        return filterList;
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     * <code>filterValues</code>.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     *        <code>filterValues</code>.
     */

    public void setFilterList(java.util.Collection<Filter> filterList) {
        if (filterList == null) {
            this.filterList = null;
            return;
        }

        this.filterList = new java.util.ArrayList<Filter>(filterList);
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     * <code>filterValues</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterList(java.util.Collection)} or {@link #withFilterList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     *        <code>filterValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withFilterList(Filter... filterList) {
        if (this.filterList == null) {
            setFilterList(new java.util.ArrayList<Filter>(filterList.length));
        }
        for (Filter ele : filterList) {
            this.filterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     * <code>filterValues</code>.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects. Each filter object contains two attributes, <code>filterName</code> and
     *        <code>filterValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withFilterList(java.util.Collection<Filter> filterList) {
        setFilterList(filterList);
        return this;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     * </p>
     * 
     * @param sort
     *        An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     */

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     * </p>
     * 
     * @return An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     */

    public Sort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     * </p>
     * 
     * @param sort
     *        An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withSort(Sort sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @return The value of the next token, if it exists. Null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
     * </p>
     * 
     * @param maxResults
     *        Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value
     *        is 20.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
     * </p>
     * 
     * @return Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value
     *         is 20.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
     * </p>
     * 
     * @param maxResults
     *        Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value
     *        is 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list entities
     * shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>. Entities shared
     * through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be discovered through the
     * <code>SHARED</code> parameter.
     * </p>
     * 
     * @param ownershipType
     *        Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list
     *        entities shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>.
     *        Entities shared through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be
     *        discovered through the <code>SHARED</code> parameter.
     * @see OwnershipType
     */

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    /**
     * <p>
     * Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list entities
     * shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>. Entities shared
     * through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be discovered through the
     * <code>SHARED</code> parameter.
     * </p>
     * 
     * @return Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list
     *         entities shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>.
     *         Entities shared through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be
     *         discovered through the <code>SHARED</code> parameter.
     * @see OwnershipType
     */

    public String getOwnershipType() {
        return this.ownershipType;
    }

    /**
     * <p>
     * Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list entities
     * shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>. Entities shared
     * through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be discovered through the
     * <code>SHARED</code> parameter.
     * </p>
     * 
     * @param ownershipType
     *        Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list
     *        entities shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>.
     *        Entities shared through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be
     *        discovered through the <code>SHARED</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OwnershipType
     */

    public ListEntitiesRequest withOwnershipType(String ownershipType) {
        setOwnershipType(ownershipType);
        return this;
    }

    /**
     * <p>
     * Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list entities
     * shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>. Entities shared
     * through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be discovered through the
     * <code>SHARED</code> parameter.
     * </p>
     * 
     * @param ownershipType
     *        Filters the returned set of entities based on their owner. The default is <code>SELF</code>. To list
     *        entities shared with you through AWS Resource Access Manager (AWS RAM), set to <code>SHARED</code>.
     *        Entities shared through the AWS Marketplace Catalog API <code>PutResourcePolicy</code> operation can't be
     *        discovered through the <code>SHARED</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OwnershipType
     */

    public ListEntitiesRequest withOwnershipType(OwnershipType ownershipType) {
        this.ownershipType = ownershipType.toString();
        return this;
    }

    /**
     * <p>
     * A Union object containing filter shapes for all <code>EntityType</code>s. Each <code>EntityTypeFilter</code>
     * shape will have filters applicable for that <code>EntityType</code> that can be used to search or filter
     * entities.
     * </p>
     * 
     * @param entityTypeFilters
     *        A Union object containing filter shapes for all <code>EntityType</code>s. Each
     *        <code>EntityTypeFilter</code> shape will have filters applicable for that <code>EntityType</code> that can
     *        be used to search or filter entities.
     */

    public void setEntityTypeFilters(EntityTypeFilters entityTypeFilters) {
        this.entityTypeFilters = entityTypeFilters;
    }

    /**
     * <p>
     * A Union object containing filter shapes for all <code>EntityType</code>s. Each <code>EntityTypeFilter</code>
     * shape will have filters applicable for that <code>EntityType</code> that can be used to search or filter
     * entities.
     * </p>
     * 
     * @return A Union object containing filter shapes for all <code>EntityType</code>s. Each
     *         <code>EntityTypeFilter</code> shape will have filters applicable for that <code>EntityType</code> that
     *         can be used to search or filter entities.
     */

    public EntityTypeFilters getEntityTypeFilters() {
        return this.entityTypeFilters;
    }

    /**
     * <p>
     * A Union object containing filter shapes for all <code>EntityType</code>s. Each <code>EntityTypeFilter</code>
     * shape will have filters applicable for that <code>EntityType</code> that can be used to search or filter
     * entities.
     * </p>
     * 
     * @param entityTypeFilters
     *        A Union object containing filter shapes for all <code>EntityType</code>s. Each
     *        <code>EntityTypeFilter</code> shape will have filters applicable for that <code>EntityType</code> that can
     *        be used to search or filter entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withEntityTypeFilters(EntityTypeFilters entityTypeFilters) {
        setEntityTypeFilters(entityTypeFilters);
        return this;
    }

    /**
     * <p>
     * A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     * <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for fields
     * on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     * </p>
     * 
     * @param entityTypeSort
     *        A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     *        <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for
     *        fields on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     */

    public void setEntityTypeSort(EntityTypeSort entityTypeSort) {
        this.entityTypeSort = entityTypeSort;
    }

    /**
     * <p>
     * A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     * <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for fields
     * on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     * </p>
     * 
     * @return A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     *         <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for
     *         fields on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     */

    public EntityTypeSort getEntityTypeSort() {
        return this.entityTypeSort;
    }

    /**
     * <p>
     * A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     * <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for fields
     * on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     * </p>
     * 
     * @param entityTypeSort
     *        A Union object containing <code>Sort</code> shapes for all <code>EntityType</code>s. Each
     *        <code>EntityTypeSort</code> shape will have <code>SortBy</code> and <code>SortOrder</code> applicable for
     *        fields on that <code>EntityType</code>. This can be used to sort the results of the filter query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesRequest withEntityTypeSort(EntityTypeSort entityTypeSort) {
        setEntityTypeSort(entityTypeSort);
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getFilterList() != null)
            sb.append("FilterList: ").append(getFilterList()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getOwnershipType() != null)
            sb.append("OwnershipType: ").append(getOwnershipType()).append(",");
        if (getEntityTypeFilters() != null)
            sb.append("EntityTypeFilters: ").append(getEntityTypeFilters()).append(",");
        if (getEntityTypeSort() != null)
            sb.append("EntityTypeSort: ").append(getEntityTypeSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesRequest == false)
            return false;
        ListEntitiesRequest other = (ListEntitiesRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getFilterList() == null ^ this.getFilterList() == null)
            return false;
        if (other.getFilterList() != null && other.getFilterList().equals(this.getFilterList()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getOwnershipType() == null ^ this.getOwnershipType() == null)
            return false;
        if (other.getOwnershipType() != null && other.getOwnershipType().equals(this.getOwnershipType()) == false)
            return false;
        if (other.getEntityTypeFilters() == null ^ this.getEntityTypeFilters() == null)
            return false;
        if (other.getEntityTypeFilters() != null && other.getEntityTypeFilters().equals(this.getEntityTypeFilters()) == false)
            return false;
        if (other.getEntityTypeSort() == null ^ this.getEntityTypeSort() == null)
            return false;
        if (other.getEntityTypeSort() != null && other.getEntityTypeSort().equals(this.getEntityTypeSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getFilterList() == null) ? 0 : getFilterList().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getOwnershipType() == null) ? 0 : getOwnershipType().hashCode());
        hashCode = prime * hashCode + ((getEntityTypeFilters() == null) ? 0 : getEntityTypeFilters().hashCode());
        hashCode = prime * hashCode + ((getEntityTypeSort() == null) ? 0 : getEntityTypeSort().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesRequest clone() {
        return (ListEntitiesRequest) super.clone();
    }

}
