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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the tags that you want to add, edit, or delete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
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
     * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone
     * and/or the tags that you want to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> addTags;
    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted
     * zone. You can specify up to 10 keys.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeTagKeys;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type for hosted zones is <code>hostedzone</code>.
     *        </p>
     *        </li>
     * @see TagResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the resource.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The resource type for health checks is <code>healthcheck</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type for hosted zones is <code>hostedzone</code>.
     *         </p>
     *         </li>
     * @see TagResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type for hosted zones is <code>hostedzone</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type for hosted zones is <code>hostedzone</code>.
     *        </p>
     *        </li>
     * @see TagResourceType
     */

    public void setResourceType(TagResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type for hosted zones is <code>hostedzone</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagResourceType
     */

    public ChangeTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for which you want to add, change, or delete tags.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * 
     * @return The ID of the resource for which you want to add, change, or delete tags.
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
     *        The ID of the resource for which you want to add, change, or delete tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone
     * and/or the tags that you want to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * 
     * @return A complex type that contains a list of the tags that you want to add to the specified health check or
     *         hosted zone and/or the tags that you want to edit <code>Value</code> for.</p>
     *         <p>
     *         You can add a maximum of 10 tags to a health check or a hosted zone.
     */

    public java.util.List<Tag> getAddTags() {
        if (addTags == null) {
            addTags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return addTags;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone
     * and/or the tags that you want to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of the tags that you want to add to the specified health check or
     *        hosted zone and/or the tags that you want to edit <code>Value</code> for.</p>
     *        <p>
     *        You can add a maximum of 10 tags to a health check or a hosted zone.
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
     * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone
     * and/or the tags that you want to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddTags(java.util.Collection)} or {@link #withAddTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of the tags that you want to add to the specified health check or
     *        hosted zone and/or the tags that you want to edit <code>Value</code> for.</p>
     *        <p>
     *        You can add a maximum of 10 tags to a health check or a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeTagsForResourceRequest withAddTags(Tag... addTags) {
        if (this.addTags == null) {
            setAddTags(new com.amazonaws.internal.SdkInternalList<Tag>(addTags.length));
        }
        for (Tag ele : addTags) {
            this.addTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to the specified health check or hosted zone
     * and/or the tags that you want to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * 
     * @param addTags
     *        A complex type that contains a list of the tags that you want to add to the specified health check or
     *        hosted zone and/or the tags that you want to edit <code>Value</code> for.</p>
     *        <p>
     *        You can add a maximum of 10 tags to a health check or a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeTagsForResourceRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted
     * zone. You can specify up to 10 keys.
     * </p>
     * 
     * @return A complex type that contains a list of the tags that you want to delete from the specified health check
     *         or hosted zone. You can specify up to 10 keys.
     */

    public java.util.List<String> getRemoveTagKeys() {
        if (removeTagKeys == null) {
            removeTagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeTagKeys;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted
     * zone. You can specify up to 10 keys.
     * </p>
     * 
     * @param removeTagKeys
     *        A complex type that contains a list of the tags that you want to delete from the specified health check or
     *        hosted zone. You can specify up to 10 keys.
     */

    public void setRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        if (removeTagKeys == null) {
            this.removeTagKeys = null;
            return;
        }

        this.removeTagKeys = new com.amazonaws.internal.SdkInternalList<String>(removeTagKeys);
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted
     * zone. You can specify up to 10 keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveTagKeys(java.util.Collection)} or {@link #withRemoveTagKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removeTagKeys
     *        A complex type that contains a list of the tags that you want to delete from the specified health check or
     *        hosted zone. You can specify up to 10 keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeTagsForResourceRequest withRemoveTagKeys(String... removeTagKeys) {
        if (this.removeTagKeys == null) {
            setRemoveTagKeys(new com.amazonaws.internal.SdkInternalList<String>(removeTagKeys.length));
        }
        for (String ele : removeTagKeys) {
            this.removeTagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete from the specified health check or hosted
     * zone. You can specify up to 10 keys.
     * </p>
     * 
     * @param removeTagKeys
     *        A complex type that contains a list of the tags that you want to delete from the specified health check or
     *        hosted zone. You can specify up to 10 keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeTagsForResourceRequest withRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        setRemoveTagKeys(removeTagKeys);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getAddTags() != null)
            sb.append("AddTags: ").append(getAddTags()).append(",");
        if (getRemoveTagKeys() != null)
            sb.append("RemoveTagKeys: ").append(getRemoveTagKeys());
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
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTagKeys() == null ^ this.getRemoveTagKeys() == null)
            return false;
        if (other.getRemoveTagKeys() != null && other.getRemoveTagKeys().equals(this.getRemoveTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime * hashCode + ((getRemoveTagKeys() == null) ? 0 : getRemoveTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public ChangeTagsForResourceRequest clone() {
        return (ChangeTagsForResourceRequest) super.clone();
    }

}
