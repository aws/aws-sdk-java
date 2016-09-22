/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RemoveTagsFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource ID for which you want to remove tags.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * 
     * @return The type of resource of which you want to remove a tag.
     * @see ResourceTypeForTagging
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public RemoveTagsFromResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public RemoveTagsFromResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for which you want to remove tags.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags.
     * </p>
     * 
     * @return The resource ID for which you want to remove tags.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for which you want to remove tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @return Tag keys that you want to remove from the specified resource.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }
}
