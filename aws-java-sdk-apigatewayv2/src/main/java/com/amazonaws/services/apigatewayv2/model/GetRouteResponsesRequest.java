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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRouteResponsesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The maximum number of elements to be returned for this resource.
     * </p>
     */
    private String maxResults;
    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last element of the collection.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResponsesRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The maximum number of elements to be returned for this resource.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of elements to be returned for this resource.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of elements to be returned for this resource.
     * </p>
     * 
     * @return The maximum number of elements to be returned for this resource.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of elements to be returned for this resource.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of elements to be returned for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResponsesRequest withMaxResults(String maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last element of the collection.
     * </p>
     * 
     * @param nextToken
     *        The next page of elements from this collection. Not valid for the last element of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last element of the collection.
     * </p>
     * 
     * @return The next page of elements from this collection. Not valid for the last element of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page of elements from this collection. Not valid for the last element of the collection.
     * </p>
     * 
     * @param nextToken
     *        The next page of elements from this collection. Not valid for the last element of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResponsesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @return The route ID.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResponsesRequest withRouteId(String routeId) {
        setRouteId(routeId);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRouteResponsesRequest == false)
            return false;
        GetRouteResponsesRequest other = (GetRouteResponsesRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        return hashCode;
    }

    @Override
    public GetRouteResponsesRequest clone() {
        return (GetRouteResponsesRequest) super.clone();
    }

}
