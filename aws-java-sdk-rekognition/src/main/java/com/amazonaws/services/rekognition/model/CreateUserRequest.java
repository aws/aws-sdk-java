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
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection to which the new UserID needs to be created.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * ID for the UserID to be created. This ID needs to be unique within the collection.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with multiple
     * <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to prevent the same
     * request from being processed more than once.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of an existing collection to which the new UserID needs to be created.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection to which the new UserID needs to be created.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which the new UserID needs to be created.
     * </p>
     * 
     * @return The ID of an existing collection to which the new UserID needs to be created.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which the new UserID needs to be created.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection to which the new UserID needs to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * ID for the UserID to be created. This ID needs to be unique within the collection.
     * </p>
     * 
     * @param userId
     *        ID for the UserID to be created. This ID needs to be unique within the collection.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID for the UserID to be created. This ID needs to be unique within the collection.
     * </p>
     * 
     * @return ID for the UserID to be created. This ID needs to be unique within the collection.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * ID for the UserID to be created. This ID needs to be unique within the collection.
     * </p>
     * 
     * @param userId
     *        ID for the UserID to be created. This ID needs to be unique within the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with multiple
     * <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to prevent the same
     * request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with
     *        multiple <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to
     *        prevent the same request from being processed more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with multiple
     * <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to prevent the same
     * request from being processed more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with
     *         multiple <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to
     *         prevent the same request from being processed more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with multiple
     * <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to prevent the same
     * request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the request to <code>CreateUser</code>. If you use the same token with
     *        multiple <code>CreateUser</code> requests, the same response is returned. Use ClientRequestToken to
     *        prevent the same request from being processed more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
