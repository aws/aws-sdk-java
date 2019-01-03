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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API operation using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The user ID for the resource collection. This is a required field for accessing the API operation using IAM
     * credentials.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The collection type.
     * </p>
     */
    private String collectionType;
    /**
     * <p>
     * The maximum number of resources to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API operation using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as
     *        in accessing the API operation using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API operation using AWS credentials.
     * </p>
     * 
     * @return The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as
     *         in accessing the API operation using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API operation using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        The Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as
     *        in accessing the API operation using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The user ID for the resource collection. This is a required field for accessing the API operation using IAM
     * credentials.
     * </p>
     * 
     * @param userId
     *        The user ID for the resource collection. This is a required field for accessing the API operation using
     *        IAM credentials.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID for the resource collection. This is a required field for accessing the API operation using IAM
     * credentials.
     * </p>
     * 
     * @return The user ID for the resource collection. This is a required field for accessing the API operation using
     *         IAM credentials.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID for the resource collection. This is a required field for accessing the API operation using IAM
     * credentials.
     * </p>
     * 
     * @param userId
     *        The user ID for the resource collection. This is a required field for accessing the API operation using
     *        IAM credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The collection type.
     * </p>
     * 
     * @param collectionType
     *        The collection type.
     * @see ResourceCollectionType
     */

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * <p>
     * The collection type.
     * </p>
     * 
     * @return The collection type.
     * @see ResourceCollectionType
     */

    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * <p>
     * The collection type.
     * </p>
     * 
     * @param collectionType
     *        The collection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCollectionType
     */

    public GetResourcesRequest withCollectionType(String collectionType) {
        setCollectionType(collectionType);
        return this;
    }

    /**
     * <p>
     * The collection type.
     * </p>
     * 
     * @param collectionType
     *        The collection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceCollectionType
     */

    public GetResourcesRequest withCollectionType(ResourceCollectionType collectionType) {
        this.collectionType = collectionType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of resources to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of resources to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of resources to return.
     * </p>
     * 
     * @return The maximum number of resources to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of resources to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of resources to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @return The marker for the next set of results. This marker was received from a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getCollectionType() != null)
            sb.append("CollectionType: ").append(getCollectionType()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesRequest == false)
            return false;
        GetResourcesRequest other = (GetResourcesRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getCollectionType() == null ^ this.getCollectionType() == null)
            return false;
        if (other.getCollectionType() != null && other.getCollectionType().equals(this.getCollectionType()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getCollectionType() == null) ? 0 : getCollectionType().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcesRequest clone() {
        return (GetResourcesRequest) super.clone();
    }

}
