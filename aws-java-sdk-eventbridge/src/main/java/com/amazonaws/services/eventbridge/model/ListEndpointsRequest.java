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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A value that will return a subset of the endpoints associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * The primary Region of the endpoints associated with this account. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will
     * return an HTTP 400 InvalidToken error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results returned by the call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A value that will return a subset of the endpoints associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @param namePrefix
     *        A value that will return a subset of the endpoints associated with this account. For example,
     *        <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * A value that will return a subset of the endpoints associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @return A value that will return a subset of the endpoints associated with this account. For example,
     *         <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * A value that will return a subset of the endpoints associated with this account. For example,
     * <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * </p>
     * 
     * @param namePrefix
     *        A value that will return a subset of the endpoints associated with this account. For example,
     *        <code>"NamePrefix": "ABC"</code> will return all endpoints with "ABC" in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsRequest withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * The primary Region of the endpoints associated with this account. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @param homeRegion
     *        The primary Region of the endpoints associated with this account. For example
     *        <code>"HomeRegion": "us-east-1"</code>.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The primary Region of the endpoints associated with this account. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @return The primary Region of the endpoints associated with this account. For example
     *         <code>"HomeRegion": "us-east-1"</code>.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The primary Region of the endpoints associated with this account. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @param homeRegion
     *        The primary Region of the endpoints associated with this account. For example
     *        <code>"HomeRegion": "us-east-1"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will
     * return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *        unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired
     *        pagination token will return an HTTP 400 InvalidToken error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will
     * return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *         unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *         page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired
     *         pagination token will return an HTTP 400 InvalidToken error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a unique
     * pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     * other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will
     * return an HTTP 400 InvalidToken error.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of nextToken is a
     *        unique pagination token for each page. Make the call again using the returned token to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired
     *        pagination token will return an HTTP 400 InvalidToken error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by the call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by the call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by the call.
     * </p>
     * 
     * @return The maximum number of results returned by the call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by the call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsRequest withMaxResults(Integer maxResults) {
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
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

        if (obj instanceof ListEndpointsRequest == false)
            return false;
        ListEndpointsRequest other = (ListEndpointsRequest) obj;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
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

        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsRequest clone() {
        return (ListEndpointsRequest) super.clone();
    }

}
