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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to list the existing recommendations for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     * <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     * </p>
     */
    private java.util.Map<String, String> filter;
    /**
     * <p>
     * A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the list of
     * recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of results to show in a single call to <code>ListRecommendations</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * <p>
     * The value you specify has to be at least 1, and can be no more than 100.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     * <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     * </p>
     * 
     * @return Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     *         <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     */

    public java.util.Map<String, String> getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     * <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     * </p>
     * 
     * @param filter
     *        Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     *        <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     */

    public void setFilter(java.util.Map<String, String> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     * <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     * </p>
     * 
     * @param filter
     *        Filters applied when retrieving recommendations. Can eiter be an individual filter, or combinations of
     *        <code>STATUS</code> and <code>IMPACT</code> or <code>STATUS</code> and <code>TYPE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withFilter(java.util.Map<String, String> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see ListRecommendationsRequest#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest addFilterEntry(String key, String value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, String>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the list of
     * recommendations.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the
     *        list of recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the list of
     * recommendations.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the
     *         list of recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the list of
     * recommendations.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListRecommendations</code> to indicate the position in the
     *        list of recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListRecommendations</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * <p>
     * The value you specify has to be at least 1, and can be no more than 100.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListRecommendations</code>. If the number of
     *        results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.</p>
     *        <p>
     *        The value you specify has to be at least 1, and can be no more than 100.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListRecommendations</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * <p>
     * The value you specify has to be at least 1, and can be no more than 100.
     * </p>
     * 
     * @return The number of results to show in a single call to <code>ListRecommendations</code>. If the number of
     *         results is larger than the number you specified in this parameter, then the response includes a
     *         <code>NextToken</code> element, which you can use to obtain additional results.</p>
     *         <p>
     *         The value you specify has to be at least 1, and can be no more than 100.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of results to show in a single call to <code>ListRecommendations</code>. If the number of results is
     * larger than the number you specified in this parameter, then the response includes a <code>NextToken</code>
     * element, which you can use to obtain additional results.
     * </p>
     * <p>
     * The value you specify has to be at least 1, and can be no more than 100.
     * </p>
     * 
     * @param pageSize
     *        The number of results to show in a single call to <code>ListRecommendations</code>. If the number of
     *        results is larger than the number you specified in this parameter, then the response includes a
     *        <code>NextToken</code> element, which you can use to obtain additional results.</p>
     *        <p>
     *        The value you specify has to be at least 1, and can be no more than 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsRequest == false)
            return false;
        ListRecommendationsRequest other = (ListRecommendationsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsRequest clone() {
        return (ListRecommendationsRequest) super.clone();
    }

}
