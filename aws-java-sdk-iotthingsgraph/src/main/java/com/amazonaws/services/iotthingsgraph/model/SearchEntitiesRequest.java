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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     */
    private java.util.List<String> entityTypes;
    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     * <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code> filters
     * on entities that are used by the entity in the result set. For example, you can filter on the ID of a property
     * that is used in a state.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     */
    private java.util.List<EntityFilter> filters;
    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     */
    private Long namespaceVersion;

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     * 
     * @return The entity types for which to search.
     * @see EntityType
     */

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     * 
     * @param entityTypes
     *        The entity types for which to search.
     * @see EntityType
     */

    public void setEntityTypes(java.util.Collection<String> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<String>(entityTypes);
    }

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The entity types for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public SearchEntitiesRequest withEntityTypes(String... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<String>(entityTypes.length));
        }
        for (String ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     * 
     * @param entityTypes
     *        The entity types for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public SearchEntitiesRequest withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * The entity types for which to search.
     * </p>
     * 
     * @param entityTypes
     *        The entity types for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public SearchEntitiesRequest withEntityTypes(EntityType... entityTypes) {
        java.util.ArrayList<String> entityTypesCopy = new java.util.ArrayList<String>(entityTypes.length);
        for (EntityType value : entityTypes) {
            entityTypesCopy.add(value.toString());
        }
        if (getEntityTypes() == null) {
            setEntityTypes(entityTypesCopy);
        } else {
            getEntityTypes().addAll(entityTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     * <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code> filters
     * on entities that are used by the entity in the result set. For example, you can filter on the ID of a property
     * that is used in a state.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @return Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     *         <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code>
     *         filters on entities that are used by the entity in the result set. For example, you can filter on the ID
     *         of a property that is used in a state.</p>
     *         <p>
     *         Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *         as AND criteria.
     */

    public java.util.List<EntityFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     * <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code> filters
     * on entities that are used by the entity in the result set. For example, you can filter on the ID of a property
     * that is used in a state.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     *        <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code>
     *        filters on entities that are used by the entity in the result set. For example, you can filter on the ID
     *        of a property that is used in a state.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     */

    public void setFilters(java.util.Collection<EntityFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<EntityFilter>(filters);
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     * <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code> filters
     * on entities that are used by the entity in the result set. For example, you can filter on the ID of a property
     * that is used in a state.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     *        <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code>
     *        filters on entities that are used by the entity in the result set. For example, you can filter on the ID
     *        of a property that is used in a state.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesRequest withFilters(EntityFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<EntityFilter>(filters.length));
        }
        for (EntityFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     * <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code> filters
     * on entities that are used by the entity in the result set. For example, you can filter on the ID of a property
     * that is used in a state.
     * </p>
     * <p>
     * Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND
     * criteria.
     * </p>
     * 
     * @param filters
     *        Optional filter to apply to the search. Valid filters are <code>NAME</code> <code>NAMESPACE</code>,
     *        <code>SEMANTIC_TYPE_PATH</code> and <code>REFERENCED_ENTITY_ID</code>. <code>REFERENCED_ENTITY_ID</code>
     *        filters on entities that are used by the entity in the result set. For example, you can filter on the ID
     *        of a property that is used in a state.</p>
     *        <p>
     *        Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function
     *        as AND criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesRequest withFilters(java.util.Collection<EntityFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @return The string that specifies the next page of results. Use this when you're paginating results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public void setNamespaceVersion(Long namespaceVersion) {
        this.namespaceVersion = namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @return The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public Long getNamespaceVersion() {
        return this.namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchEntitiesRequest withNamespaceVersion(Long namespaceVersion) {
        setNamespaceVersion(namespaceVersion);
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
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamespaceVersion() != null)
            sb.append("NamespaceVersion: ").append(getNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchEntitiesRequest == false)
            return false;
        SearchEntitiesRequest other = (SearchEntitiesRequest) obj;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamespaceVersion() == null ^ this.getNamespaceVersion() == null)
            return false;
        if (other.getNamespaceVersion() != null && other.getNamespaceVersion().equals(this.getNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamespaceVersion() == null) ? 0 : getNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public SearchEntitiesRequest clone() {
        return (SearchEntitiesRequest) super.clone();
    }

}
