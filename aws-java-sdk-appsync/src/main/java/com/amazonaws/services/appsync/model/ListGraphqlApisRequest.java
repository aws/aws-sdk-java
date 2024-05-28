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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGraphqlApisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that you want the request to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     */
    private String apiType;
    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which you can use to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which you can use to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which you can use to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphqlApisRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that you want the request to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want the request to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want the request to return.
     * </p>
     * 
     * @return The maximum number of results that you want the request to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want the request to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want the request to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphqlApisRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @see GraphQLApiType
     */

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @return The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *         <code>MERGED</code>).
     * @see GraphQLApiType
     */

    public String getApiType() {
        return this.apiType;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiType
     */

    public ListGraphqlApisRequest withApiType(String apiType) {
        setApiType(apiType);
        return this;
    }

    /**
     * <p>
     * The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     * <code>MERGED</code>).
     * </p>
     * 
     * @param apiType
     *        The value that indicates whether the GraphQL API is a standard API (<code>GRAPHQL</code>) or merged API (
     *        <code>MERGED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GraphQLApiType
     */

    public ListGraphqlApisRequest withApiType(GraphQLApiType apiType) {
        this.apiType = apiType.toString();
        return this;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @param owner
     *        The account owner of the GraphQL API.
     * @see Ownership
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @return The account owner of the GraphQL API.
     * @see Ownership
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @param owner
     *        The account owner of the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListGraphqlApisRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The account owner of the GraphQL API.
     * </p>
     * 
     * @param owner
     *        The account owner of the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ownership
     */

    public ListGraphqlApisRequest withOwner(Ownership owner) {
        this.owner = owner.toString();
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
        if (getApiType() != null)
            sb.append("ApiType: ").append(getApiType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGraphqlApisRequest == false)
            return false;
        ListGraphqlApisRequest other = (ListGraphqlApisRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getApiType() == null ^ this.getApiType() == null)
            return false;
        if (other.getApiType() != null && other.getApiType().equals(this.getApiType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getApiType() == null) ? 0 : getApiType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public ListGraphqlApisRequest clone() {
        return (ListGraphqlApisRequest) super.clone();
    }

}
