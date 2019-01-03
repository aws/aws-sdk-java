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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The search query, using the same formats that are supported for resource group definition.
     * </p>
     */
    private ResourceQuery resourceQuery;
    /**
     * <p>
     * The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By default,
     * this number is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The search query, using the same formats that are supported for resource group definition.
     * </p>
     * 
     * @param resourceQuery
     *        The search query, using the same formats that are supported for resource group definition.
     */

    public void setResourceQuery(ResourceQuery resourceQuery) {
        this.resourceQuery = resourceQuery;
    }

    /**
     * <p>
     * The search query, using the same formats that are supported for resource group definition.
     * </p>
     * 
     * @return The search query, using the same formats that are supported for resource group definition.
     */

    public ResourceQuery getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * <p>
     * The search query, using the same formats that are supported for resource group definition.
     * </p>
     * 
     * @param resourceQuery
     *        The search query, using the same formats that are supported for resource group definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withResourceQuery(ResourceQuery resourceQuery) {
        setResourceQuery(resourceQuery);
        return this;
    }

    /**
     * <p>
     * The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By
     *        default, this number is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @return The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By
     *         default, this number is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By default,
     * this number is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of group member ARNs returned by <code>SearchResources</code> in paginated output. By
     *        default, this number is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next
     *        page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @return The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next
     *         page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next page of
     * results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value that is returned in a paginated <code>SearchResources</code> request. To get the next
     *        page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesRequest withNextToken(String nextToken) {
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
        if (getResourceQuery() != null)
            sb.append("ResourceQuery: ").append(getResourceQuery()).append(",");
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

        if (obj instanceof SearchResourcesRequest == false)
            return false;
        SearchResourcesRequest other = (SearchResourcesRequest) obj;
        if (other.getResourceQuery() == null ^ this.getResourceQuery() == null)
            return false;
        if (other.getResourceQuery() != null && other.getResourceQuery().equals(this.getResourceQuery()) == false)
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

        hashCode = prime * hashCode + ((getResourceQuery() == null) ? 0 : getResourceQuery().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesRequest clone() {
        return (SearchResourcesRequest) super.clone();
    }

}
