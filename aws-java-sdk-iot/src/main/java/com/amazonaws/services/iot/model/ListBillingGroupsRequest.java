/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBillingGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Limit the results to billing groups whose names have the given prefix.
     * </p>
     */
    private String namePrefixFilter;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @return The maximum number of results to return per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Limit the results to billing groups whose names have the given prefix.
     * </p>
     * 
     * @param namePrefixFilter
     *        Limit the results to billing groups whose names have the given prefix.
     */

    public void setNamePrefixFilter(String namePrefixFilter) {
        this.namePrefixFilter = namePrefixFilter;
    }

    /**
     * <p>
     * Limit the results to billing groups whose names have the given prefix.
     * </p>
     * 
     * @return Limit the results to billing groups whose names have the given prefix.
     */

    public String getNamePrefixFilter() {
        return this.namePrefixFilter;
    }

    /**
     * <p>
     * Limit the results to billing groups whose names have the given prefix.
     * </p>
     * 
     * @param namePrefixFilter
     *        Limit the results to billing groups whose names have the given prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsRequest withNamePrefixFilter(String namePrefixFilter) {
        setNamePrefixFilter(namePrefixFilter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamePrefixFilter() != null)
            sb.append("NamePrefixFilter: ").append(getNamePrefixFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBillingGroupsRequest == false)
            return false;
        ListBillingGroupsRequest other = (ListBillingGroupsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamePrefixFilter() == null ^ this.getNamePrefixFilter() == null)
            return false;
        if (other.getNamePrefixFilter() != null && other.getNamePrefixFilter().equals(this.getNamePrefixFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamePrefixFilter() == null) ? 0 : getNamePrefixFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListBillingGroupsRequest clone() {
        return (ListBillingGroupsRequest) super.clone();
    }

}
