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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateIndex" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The specified tags are attached only to the index created in this Amazon Web Services Region. The tags aren't
     * attached to any of the resources listed in the index.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @param clientToken
     *        This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *        of duplicate versions. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *        uniqueness of your views.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @return This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *         of duplicate versions. We recommend that you generate a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *         uniqueness of your views.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of
     * duplicate versions. We recommend that you generate a <a
     * href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the uniqueness of
     * your views.
     * </p>
     * 
     * @param clientToken
     *        This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation
     *        of duplicate versions. We recommend that you generate a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type value</a> to ensure the
     *        uniqueness of your views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The specified tags are attached only to the index created in this Amazon Web Services Region. The tags aren't
     * attached to any of the resources listed in the index.
     * </p>
     * 
     * @return The specified tags are attached only to the index created in this Amazon Web Services Region. The tags
     *         aren't attached to any of the resources listed in the index.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The specified tags are attached only to the index created in this Amazon Web Services Region. The tags aren't
     * attached to any of the resources listed in the index.
     * </p>
     * 
     * @param tags
     *        The specified tags are attached only to the index created in this Amazon Web Services Region. The tags
     *        aren't attached to any of the resources listed in the index.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The specified tags are attached only to the index created in this Amazon Web Services Region. The tags aren't
     * attached to any of the resources listed in the index.
     * </p>
     * 
     * @param tags
     *        The specified tags are attached only to the index created in this Amazon Web Services Region. The tags
     *        aren't attached to any of the resources listed in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateIndexRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest clearTagsEntries() {
        this.tags = null;
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexRequest clone() {
        return (CreateIndexRequest) super.clone();
    }

}
