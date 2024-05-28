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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/SearchResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The String to search for. Searches across different text fields based on request parameters. Use double quotes
     * around the query string for exact phrase matches.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     */
    private java.util.List<String> queryScopes;
    /**
     * <p>
     * Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4 credentials.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     */
    private java.util.List<String> additionalResponseFields;
    /**
     * <p>
     * Filters results based on entity metadata.
     * </p>
     */
    private Filters filters;
    /**
     * <p>
     * Order by results in one or more categories.
     * </p>
     */
    private java.util.List<SearchSortResult> orderBy;
    /**
     * <p>
     * Max results count per page.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *        credentials to access the API.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *         credentials to access the API.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *        credentials to access the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The String to search for. Searches across different text fields based on request parameters. Use double quotes
     * around the query string for exact phrase matches.
     * </p>
     * 
     * @param queryText
     *        The String to search for. Searches across different text fields based on request parameters. Use double
     *        quotes around the query string for exact phrase matches.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The String to search for. Searches across different text fields based on request parameters. Use double quotes
     * around the query string for exact phrase matches.
     * </p>
     * 
     * @return The String to search for. Searches across different text fields based on request parameters. Use double
     *         quotes around the query string for exact phrase matches.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The String to search for. Searches across different text fields based on request parameters. Use double quotes
     * around the query string for exact phrase matches.
     * </p>
     * 
     * @param queryText
     *        The String to search for. Searches across different text fields based on request parameters. Use double
     *        quotes around the query string for exact phrase matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     * 
     * @return Filter based on the text field type. A Folder has only a name and no content. A Comment has only content
     *         and no name. A Document or Document Version has a name and content
     * @see SearchQueryScopeType
     */

    public java.util.List<String> getQueryScopes() {
        return queryScopes;
    }

    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     * 
     * @param queryScopes
     *        Filter based on the text field type. A Folder has only a name and no content. A Comment has only content
     *        and no name. A Document or Document Version has a name and content
     * @see SearchQueryScopeType
     */

    public void setQueryScopes(java.util.Collection<String> queryScopes) {
        if (queryScopes == null) {
            this.queryScopes = null;
            return;
        }

        this.queryScopes = new java.util.ArrayList<String>(queryScopes);
    }

    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryScopes(java.util.Collection)} or {@link #withQueryScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queryScopes
     *        Filter based on the text field type. A Folder has only a name and no content. A Comment has only content
     *        and no name. A Document or Document Version has a name and content
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchQueryScopeType
     */

    public SearchResourcesRequest withQueryScopes(String... queryScopes) {
        if (this.queryScopes == null) {
            setQueryScopes(new java.util.ArrayList<String>(queryScopes.length));
        }
        for (String ele : queryScopes) {
            this.queryScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     * 
     * @param queryScopes
     *        Filter based on the text field type. A Folder has only a name and no content. A Comment has only content
     *        and no name. A Document or Document Version has a name and content
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchQueryScopeType
     */

    public SearchResourcesRequest withQueryScopes(java.util.Collection<String> queryScopes) {
        setQueryScopes(queryScopes);
        return this;
    }

    /**
     * <p>
     * Filter based on the text field type. A Folder has only a name and no content. A Comment has only content and no
     * name. A Document or Document Version has a name and content
     * </p>
     * 
     * @param queryScopes
     *        Filter based on the text field type. A Folder has only a name and no content. A Comment has only content
     *        and no name. A Document or Document Version has a name and content
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchQueryScopeType
     */

    public SearchResourcesRequest withQueryScopes(SearchQueryScopeType... queryScopes) {
        java.util.ArrayList<String> queryScopesCopy = new java.util.ArrayList<String>(queryScopes.length);
        for (SearchQueryScopeType value : queryScopes) {
            queryScopesCopy.add(value.toString());
        }
        if (getQueryScopes() == null) {
            setQueryScopes(queryScopesCopy);
        } else {
            getQueryScopes().addAll(queryScopesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4 credentials.
     * </p>
     * 
     * @param organizationId
     *        Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4
     *        credentials.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4 credentials.
     * </p>
     * 
     * @return Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4
     *         credentials.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4 credentials.
     * </p>
     * 
     * @param organizationId
     *        Filters based on the resource owner OrgId. This is a mandatory parameter when using Admin SigV4
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     * 
     * @return A list of attributes to include in the response. Used to request fields that are not normally returned in
     *         a standard response.
     * @see AdditionalResponseFieldType
     */

    public java.util.List<String> getAdditionalResponseFields() {
        return additionalResponseFields;
    }

    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     * 
     * @param additionalResponseFields
     *        A list of attributes to include in the response. Used to request fields that are not normally returned in
     *        a standard response.
     * @see AdditionalResponseFieldType
     */

    public void setAdditionalResponseFields(java.util.Collection<String> additionalResponseFields) {
        if (additionalResponseFields == null) {
            this.additionalResponseFields = null;
            return;
        }

        this.additionalResponseFields = new java.util.ArrayList<String>(additionalResponseFields);
    }

    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalResponseFields(java.util.Collection)} or
     * {@link #withAdditionalResponseFields(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalResponseFields
     *        A list of attributes to include in the response. Used to request fields that are not normally returned in
     *        a standard response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResponseFieldType
     */

    public SearchResourcesRequest withAdditionalResponseFields(String... additionalResponseFields) {
        if (this.additionalResponseFields == null) {
            setAdditionalResponseFields(new java.util.ArrayList<String>(additionalResponseFields.length));
        }
        for (String ele : additionalResponseFields) {
            this.additionalResponseFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     * 
     * @param additionalResponseFields
     *        A list of attributes to include in the response. Used to request fields that are not normally returned in
     *        a standard response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResponseFieldType
     */

    public SearchResourcesRequest withAdditionalResponseFields(java.util.Collection<String> additionalResponseFields) {
        setAdditionalResponseFields(additionalResponseFields);
        return this;
    }

    /**
     * <p>
     * A list of attributes to include in the response. Used to request fields that are not normally returned in a
     * standard response.
     * </p>
     * 
     * @param additionalResponseFields
     *        A list of attributes to include in the response. Used to request fields that are not normally returned in
     *        a standard response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResponseFieldType
     */

    public SearchResourcesRequest withAdditionalResponseFields(AdditionalResponseFieldType... additionalResponseFields) {
        java.util.ArrayList<String> additionalResponseFieldsCopy = new java.util.ArrayList<String>(additionalResponseFields.length);
        for (AdditionalResponseFieldType value : additionalResponseFields) {
            additionalResponseFieldsCopy.add(value.toString());
        }
        if (getAdditionalResponseFields() == null) {
            setAdditionalResponseFields(additionalResponseFieldsCopy);
        } else {
            getAdditionalResponseFields().addAll(additionalResponseFieldsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters results based on entity metadata.
     * </p>
     * 
     * @param filters
     *        Filters results based on entity metadata.
     */

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters results based on entity metadata.
     * </p>
     * 
     * @return Filters results based on entity metadata.
     */

    public Filters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters results based on entity metadata.
     * </p>
     * 
     * @param filters
     *        Filters results based on entity metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withFilters(Filters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Order by results in one or more categories.
     * </p>
     * 
     * @return Order by results in one or more categories.
     */

    public java.util.List<SearchSortResult> getOrderBy() {
        return orderBy;
    }

    /**
     * <p>
     * Order by results in one or more categories.
     * </p>
     * 
     * @param orderBy
     *        Order by results in one or more categories.
     */

    public void setOrderBy(java.util.Collection<SearchSortResult> orderBy) {
        if (orderBy == null) {
            this.orderBy = null;
            return;
        }

        this.orderBy = new java.util.ArrayList<SearchSortResult>(orderBy);
    }

    /**
     * <p>
     * Order by results in one or more categories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderBy(java.util.Collection)} or {@link #withOrderBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param orderBy
     *        Order by results in one or more categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withOrderBy(SearchSortResult... orderBy) {
        if (this.orderBy == null) {
            setOrderBy(new java.util.ArrayList<SearchSortResult>(orderBy.length));
        }
        for (SearchSortResult ele : orderBy) {
            this.orderBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Order by results in one or more categories.
     * </p>
     * 
     * @param orderBy
     *        Order by results in one or more categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withOrderBy(java.util.Collection<SearchSortResult> orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * Max results count per page.
     * </p>
     * 
     * @param limit
     *        Max results count per page.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Max results count per page.
     * </p>
     * 
     * @return Max results count per page.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Max results count per page.
     * </p>
     * 
     * @param limit
     *        Max results count per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getQueryText() != null)
            sb.append("QueryText: ").append("***Sensitive Data Redacted***").append(",");
        if (getQueryScopes() != null)
            sb.append("QueryScopes: ").append(getQueryScopes()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getAdditionalResponseFields() != null)
            sb.append("AdditionalResponseFields: ").append(getAdditionalResponseFields()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResourcesRequest == false)
            return false;
        SearchResourcesRequest other = (SearchResourcesRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getQueryScopes() == null ^ this.getQueryScopes() == null)
            return false;
        if (other.getQueryScopes() != null && other.getQueryScopes().equals(this.getQueryScopes()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getAdditionalResponseFields() == null ^ this.getAdditionalResponseFields() == null)
            return false;
        if (other.getAdditionalResponseFields() != null && other.getAdditionalResponseFields().equals(this.getAdditionalResponseFields()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode + ((getQueryScopes() == null) ? 0 : getQueryScopes().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getAdditionalResponseFields() == null) ? 0 : getAdditionalResponseFields().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesRequest clone() {
        return (SearchResourcesRequest) super.clone();
    }

}
