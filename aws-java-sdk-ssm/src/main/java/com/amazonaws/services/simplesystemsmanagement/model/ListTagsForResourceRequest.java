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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource ID for which you want to see a list of tags.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     * 
     * @param resourceType
     *        Returns a list of tags for a specific resource type.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     * 
     * @return Returns a list of tags for a specific resource type.
     * @see ResourceTypeForTagging
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     * 
     * @param resourceType
     *        Returns a list of tags for a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public ListTagsForResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     * 
     * @param resourceType
     *        Returns a list of tags for a specific resource type.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(ResourceTypeForTagging resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * Returns a list of tags for a specific resource type.
     * </p>
     * 
     * @param resourceType
     *        Returns a list of tags for a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public ListTagsForResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The resource ID for which you want to see a list of tags.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for which you want to see a list of tags.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to see a list of tags.
     * </p>
     * 
     * @return The resource ID for which you want to see a list of tags.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to see a list of tags.
     * </p>
     * 
     * @param resourceId
     *        The resource ID for which you want to see a list of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
