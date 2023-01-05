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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDataSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The filters to apply to the search.
     * </p>
     */
    private java.util.List<DataSourceSearchFilter> filters;
    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The filters to apply to the search.
     * </p>
     * 
     * @return The filters to apply to the search.
     */

    public java.util.List<DataSourceSearchFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to apply to the search.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the search.
     */

    public void setFilters(java.util.Collection<DataSourceSearchFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DataSourceSearchFilter>(filters);
    }

    /**
     * <p>
     * The filters to apply to the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesRequest withFilters(DataSourceSearchFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DataSourceSearchFilter>(filters.length));
        }
        for (DataSourceSearchFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to apply to the search.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesRequest withFilters(java.util.Collection<DataSourceSearchFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDataSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchDataSourcesRequest == false)
            return false;
        SearchDataSourcesRequest other = (SearchDataSourcesRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchDataSourcesRequest clone() {
        return (SearchDataSourcesRequest) super.clone();
    }

}
