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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type containing information about a request for a list of the tags that are associated with an individual
 * resource.
 * </p>
 */
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     */
    private String resourceId;

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

    public ListTagsForResourceRequest withResourceType(String resourceType) {
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
        this.resourceType = resourceType.toString();
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

    public ListTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for which you want to retrieve tags.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * 
     * @return The ID of the resource for which you want to retrieve tags.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource for which you want to retrieve tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
            sb.append("ResourceId: " + getResourceId());
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
