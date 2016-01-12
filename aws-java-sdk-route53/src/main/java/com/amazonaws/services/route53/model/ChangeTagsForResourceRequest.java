/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type containing information about a request to add, change, or
 * delete the tags that are associated with a resource.
 * </p>
 */
public class ChangeTagsForResourceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or update
     * for the specified resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> addTags;
    /**
     * <p>
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeTagKeys;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @see TagResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @return The type of the resource.</p>
     *         <p>
     *         - The resource type for health checks is <code>healthcheck</code>
     *         .
     *         </p>
     *         <p>
     *         - The resource type for hosted zones is <code>hostedzone</code>.
     * @see TagResourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ChangeTagsForResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ChangeTagsForResourceRequest withResourceType(
            TagResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for which you want to add, change, or
     *        delete tags.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * 
     * @return The ID of the resource for which you want to add, change, or
     *         delete tags.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for which you want to add, change, or
     *        delete tags.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or update
     * for the specified resource.
     * </p>
     * 
     * @return A complex type that contains a list of <code>Tag</code> elements.
     *         Each <code>Tag</code> element identifies a tag that you want to
     *         add or update for the specified resource.
     */
    public java.util.List<Tag> getAddTags() {
        if (addTags == null) {
            addTags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return addTags;
    }

    /**
     * <p>
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or update
     * for the specified resource.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of <code>Tag</code> elements.
     *        Each <code>Tag</code> element identifies a tag that you want to
     *        add or update for the specified resource.
     */
    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }

        this.addTags = new com.amazonaws.internal.SdkInternalList<Tag>(addTags);
    }

    /**
     * <p>
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or update
     * for the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAddTags(java.util.Collection)} or
     * {@link #withAddTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of <code>Tag</code> elements.
     *        Each <code>Tag</code> element identifies a tag that you want to
     *        add or update for the specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withAddTags(Tag... addTags) {
        if (this.addTags == null) {
            setAddTags(new com.amazonaws.internal.SdkInternalList<Tag>(
                    addTags.length));
        }
        for (Tag ele : addTags) {
            this.addTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of <code>Tag</code> elements. Each
     * <code>Tag</code> element identifies a tag that you want to add or update
     * for the specified resource.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of <code>Tag</code> elements.
     *        Each <code>Tag</code> element identifies a tag that you want to
     *        add or update for the specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withAddTags(
            java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * </p>
     * 
     * @return A list of <code>Tag</code> keys that you want to remove from the
     *         specified resource.
     */
    public java.util.List<String> getRemoveTagKeys() {
        if (removeTagKeys == null) {
            removeTagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeTagKeys;
    }

    /**
     * <p>
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * </p>
     * 
     * @param removeTagKeys
     *        A list of <code>Tag</code> keys that you want to remove from the
     *        specified resource.
     */
    public void setRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        if (removeTagKeys == null) {
            this.removeTagKeys = null;
            return;
        }

        this.removeTagKeys = new com.amazonaws.internal.SdkInternalList<String>(
                removeTagKeys);
    }

    /**
     * <p>
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRemoveTagKeys(java.util.Collection)} or
     * {@link #withRemoveTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param removeTagKeys
     *        A list of <code>Tag</code> keys that you want to remove from the
     *        specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(
            String... removeTagKeys) {
        if (this.removeTagKeys == null) {
            setRemoveTagKeys(new com.amazonaws.internal.SdkInternalList<String>(
                    removeTagKeys.length));
        }
        for (String ele : removeTagKeys) {
            this.removeTagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> keys that you want to remove from the
     * specified resource.
     * </p>
     * 
     * @param removeTagKeys
     *        A list of <code>Tag</code> keys that you want to remove from the
     *        specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(
            java.util.Collection<String> removeTagKeys) {
        setRemoveTagKeys(removeTagKeys);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
        if (getAddTags() != null)
            sb.append("AddTags: " + getAddTags() + ",");
        if (getRemoveTagKeys() != null)
            sb.append("RemoveTagKeys: " + getRemoveTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeTagsForResourceRequest == false)
            return false;
        ChangeTagsForResourceRequest other = (ChangeTagsForResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null
                && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTagKeys() == null ^ this.getRemoveTagKeys() == null)
            return false;
        if (other.getRemoveTagKeys() != null
                && other.getRemoveTagKeys().equals(this.getRemoveTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveTagKeys() == null) ? 0 : getRemoveTagKeys()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ChangeTagsForResourceRequest clone() {
        return (ChangeTagsForResourceRequest) super.clone();
    }
}