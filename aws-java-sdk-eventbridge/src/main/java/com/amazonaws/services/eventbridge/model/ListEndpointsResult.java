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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoints returned by the call.
     * </p>
     */
    private java.util.List<Endpoint> endpoints;
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
     * The endpoints returned by the call.
     * </p>
     * 
     * @return The endpoints returned by the call.
     */

    public java.util.List<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The endpoints returned by the call.
     * </p>
     * 
     * @param endpoints
     *        The endpoints returned by the call.
     */

    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<Endpoint>(endpoints);
    }

    /**
     * <p>
     * The endpoints returned by the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        The endpoints returned by the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpoints(Endpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<Endpoint>(endpoints.length));
        }
        for (Endpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The endpoints returned by the call.
     * </p>
     * 
     * @param endpoints
     *        The endpoints returned by the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        setEndpoints(endpoints);
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

    public ListEndpointsResult withNextToken(String nextToken) {
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
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

        if (obj instanceof ListEndpointsResult == false)
            return false;
        ListEndpointsResult other = (ListEndpointsResult) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsResult clone() {
        try {
            return (ListEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
