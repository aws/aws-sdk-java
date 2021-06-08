/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListMaps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMapsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @param maxResults
     *        An optional limit for the number of resources returned in a single call. </p>
     *        <p>
     *        Default value: <code>100</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @return An optional limit for the number of resources returned in a single call. </p>
     *         <p>
     *         Default value: <code>100</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @param maxResults
     *        An optional limit for the number of resources returned in a single call. </p>
     *        <p>
     *        Default value: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMapsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page.</p>
     *        <p>
     *        Default value: <code>null</code>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @return The pagination token specifying which page of results to return in the response. If no token is provided,
     *         the default page is the first page.</p>
     *         <p>
     *         Default value: <code>null</code>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page.</p>
     *        <p>
     *        Default value: <code>null</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMapsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListMapsRequest == false)
            return false;
        ListMapsRequest other = (ListMapsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMapsRequest clone() {
        return (ListMapsRequest) super.clone();
    }

}
