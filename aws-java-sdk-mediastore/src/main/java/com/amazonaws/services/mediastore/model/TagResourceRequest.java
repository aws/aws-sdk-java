/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the container.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you
     * want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     * priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource,
     * you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags:
     * customer:CompanyA, priority:Medium, and type:Contract.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the container.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) for the container.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the container.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the container.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the container.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you
     * want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     * priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource,
     * you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags:
     * customer:CompanyA, priority:Medium, and type:Contract.
     * </p>
     * 
     * @return An array of key:value pairs that you want to add to the container. You need to specify only the tags that
     *         you want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     *         priority:High). You want to change the priority tag and also add a third tag (type:Contract). For
     *         TagResource, you specify the following tags: priority:Medium, type:Contract. The result is that your
     *         container has three tags: customer:CompanyA, priority:Medium, and type:Contract.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you
     * want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     * priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource,
     * you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags:
     * customer:CompanyA, priority:Medium, and type:Contract.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you want to add to the container. You need to specify only the tags that
     *        you want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     *        priority:High). You want to change the priority tag and also add a third tag (type:Contract). For
     *        TagResource, you specify the following tags: priority:Medium, type:Contract. The result is that your
     *        container has three tags: customer:CompanyA, priority:Medium, and type:Contract.
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
     * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you
     * want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     * priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource,
     * you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags:
     * customer:CompanyA, priority:Medium, and type:Contract.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you want to add to the container. You need to specify only the tags that
     *        you want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     *        priority:High). You want to change the priority tag and also add a third tag (type:Contract). For
     *        TagResource, you specify the following tags: priority:Medium, type:Contract. The result is that your
     *        container has three tags: customer:CompanyA, priority:Medium, and type:Contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
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
     * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you
     * want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     * priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource,
     * you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags:
     * customer:CompanyA, priority:Medium, and type:Contract.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you want to add to the container. You need to specify only the tags that
     *        you want to add or update. For example, suppose a container already has two tags (customer:CompanyA and
     *        priority:High). You want to change the priority tag and also add a third tag (type:Contract). For
     *        TagResource, you specify the following tags: priority:Medium, type:Contract. The result is that your
     *        container has three tags: customer:CompanyA, priority:Medium, and type:Contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
