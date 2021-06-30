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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicDnsNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A description for the namespace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Properties for the public DNS namespace.
     * </p>
     */
    private PublicDnsNamespaceProperties properties;

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to this namespace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @return The name that you want to assign to this namespace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to this namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *        requests to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can
     *        be any unique string (for example, a date/timestamp).
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *         requests to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can
     *         be any unique string (for example, a date/timestamp).
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *        requests to be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can
     *        be any unique string (for example, a date/timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @return A description for the namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @return The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags
     *         keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @param tags
     *        The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
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
     * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withTags(Tag... tags) {
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
     * The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @param tags
     *        The tags to add to the namespace. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Properties for the public DNS namespace.
     * </p>
     * 
     * @param properties
     *        Properties for the public DNS namespace.
     */

    public void setProperties(PublicDnsNamespaceProperties properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Properties for the public DNS namespace.
     * </p>
     * 
     * @return Properties for the public DNS namespace.
     */

    public PublicDnsNamespaceProperties getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * Properties for the public DNS namespace.
     * </p>
     * 
     * @param properties
     *        Properties for the public DNS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withProperties(PublicDnsNamespaceProperties properties) {
        setProperties(properties);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicDnsNamespaceRequest == false)
            return false;
        CreatePublicDnsNamespaceRequest other = (CreatePublicDnsNamespaceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicDnsNamespaceRequest clone() {
        return (CreatePublicDnsNamespaceRequest) super.clone();
    }

}
