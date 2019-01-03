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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a
     * tag with the specified key and a value of null.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a
     * tag with the specified key and a value of null.
     * </p>
     * 
     * @return The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML
     *         creates a tag with the specified key and a value of null.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a
     * tag with the specified key and a value of null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML
     *        creates a tag with the specified key and a value of null.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a
     * tag with the specified key and a value of null.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML
     *        creates a tag with the specified key and a value of null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a
     * tag with the specified key and a value of null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML
     *        creates a tag with the specified key and a value of null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @return The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object to tag. For example, <code>exampleModelId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object to tag.
     * @see TaggableResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     * 
     * @return The type of the ML object to tag.
     * @see TaggableResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public AddTagsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object to tag.
     * @see TaggableResourceType
     */

    public void setResourceType(TaggableResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of the ML object to tag.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public AddTagsRequest withResourceType(TaggableResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsRequest clone() {
        return (AddTagsRequest) super.clone();
    }

}
