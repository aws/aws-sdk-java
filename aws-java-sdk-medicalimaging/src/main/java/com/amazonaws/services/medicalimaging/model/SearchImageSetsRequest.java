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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchImageSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchImageSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data store where the image sets reside.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     * </p>
     */
    private SearchCriteria searchCriteria;
    /**
     * <p>
     * The maximum number of results that can be returned in a search.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token used for pagination of results returned in the response. Use the token returned from the previous
     * request to continue results where the previous request ended.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the data store where the image sets reside.
     * </p>
     * 
     * @param datastoreId
     *        The identifier of the data store where the image sets reside.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The identifier of the data store where the image sets reside.
     * </p>
     * 
     * @return The identifier of the data store where the image sets reside.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The identifier of the data store where the image sets reside.
     * </p>
     * 
     * @param datastoreId
     *        The identifier of the data store where the image sets reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     */

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     * </p>
     * 
     * @return The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     */

    public SearchCriteria getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * <p>
     * The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria that filters by applying a maximum of 1 item to <code>SearchByAttribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsRequest withSearchCriteria(SearchCriteria searchCriteria) {
        setSearchCriteria(searchCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that can be returned in a search.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned in a search.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned in a search.
     * </p>
     * 
     * @return The maximum number of results that can be returned in a search.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that can be returned in a search.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that can be returned in a search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token used for pagination of results returned in the response. Use the token returned from the previous
     * request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination of results returned in the response. Use the token returned from the
     *        previous request to continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used for pagination of results returned in the response. Use the token returned from the previous
     * request to continue results where the previous request ended.
     * </p>
     * 
     * @return The token used for pagination of results returned in the response. Use the token returned from the
     *         previous request to continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used for pagination of results returned in the response. Use the token returned from the previous
     * request to continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination of results returned in the response. Use the token returned from the
     *        previous request to continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsRequest withNextToken(String nextToken) {
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof SearchImageSetsRequest == false)
            return false;
        SearchImageSetsRequest other = (SearchImageSetsRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
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

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchImageSetsRequest clone() {
        return (SearchImageSetsRequest) super.clone();
    }

}
