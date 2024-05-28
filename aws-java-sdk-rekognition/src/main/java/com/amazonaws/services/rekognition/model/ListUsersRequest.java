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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * Maximum number of UsersID to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagingation token to receive the next set of UsersID.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of an existing collection.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection.
     * </p>
     * 
     * @return The ID of an existing collection.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * Maximum number of UsersID to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of UsersID to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of UsersID to return.
     * </p>
     * 
     * @return Maximum number of UsersID to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of UsersID to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of UsersID to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Pagingation token to receive the next set of UsersID.
     * </p>
     * 
     * @param nextToken
     *        Pagingation token to receive the next set of UsersID.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagingation token to receive the next set of UsersID.
     * </p>
     * 
     * @return Pagingation token to receive the next set of UsersID.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagingation token to receive the next set of UsersID.
     * </p>
     * 
     * @param nextToken
     *        Pagingation token to receive the next set of UsersID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withNextToken(String nextToken) {
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
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

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
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

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersRequest clone() {
        return (ListUsersRequest) super.clone();
    }

}
