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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Description of the collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Name of the collection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The type of collection.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Description of the collection.
     * </p>
     * 
     * @param description
     *        Description of the collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the collection.
     * </p>
     * 
     * @return Description of the collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the collection.
     * </p>
     * 
     * @param description
     *        Description of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Name of the collection.
     * </p>
     * 
     * @param name
     *        Name of the collection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the collection.
     * </p>
     * 
     * @return Name of the collection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the collection.
     * </p>
     * 
     * @param name
     *        Name of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * </p>
     * 
     * @return An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * </p>
     * 
     * @param tags
     *        An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * </p>
     * 
     * @param tags
     *        An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Serverless collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @see CollectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @return The type of collection.
     * @see CollectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public CreateCollectionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of collection.
     * </p>
     * 
     * @param type
     *        The type of collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public CreateCollectionRequest withType(CollectionType type) {
        this.type = type.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCollectionRequest == false)
            return false;
        CreateCollectionRequest other = (CreateCollectionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateCollectionRequest clone() {
        return (CreateCollectionRequest) super.clone();
    }

}
