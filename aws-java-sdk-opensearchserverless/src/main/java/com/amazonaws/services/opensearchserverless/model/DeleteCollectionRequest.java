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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCollectionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the
     *        collection endpoint. You can also retrieve it using the <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *        >ListCollections</a> API.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @return The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the
     *         collection endpoint. You can also retrieve it using the <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *         >ListCollections</a> API.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collection. For example, <code>1iu5usc406kd</code>. The ID is part of the
     *        collection endpoint. You can also retrieve it using the <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *        >ListCollections</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCollectionRequest withId(String id) {
        setId(id);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCollectionRequest == false)
            return false;
        DeleteCollectionRequest other = (DeleteCollectionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCollectionRequest clone() {
        return (DeleteCollectionRequest) super.clone();
    }

}
