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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a resource.
 * </p>
 */
public class UpdateResourceResult implements Serializable, Cloneable {

    /**
     * <p>
     * The resource's identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     */
    private String pathPart;
    /**
     * <p>
     * The full path for this resource.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Map of methods for this resource, which is included only if requested
     * using the <b>embed</b> option.
     * </p>
     */
    private java.util.Map<String, Method> resourceMethods;

    /**
     * <p>
     * The resource's identifier.
     * </p>
     * 
     * @param id
     *        The resource's identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The resource's identifier.
     * </p>
     * 
     * @return The resource's identifier.
     */
    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The resource's identifier.
     * </p>
     * 
     * @param id
     *        The resource's identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateResourceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @param parentId
     *        The parent resource's identifier.
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @return The parent resource's identifier.
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The parent resource's identifier.
     * </p>
     * 
     * @param parentId
     *        The parent resource's identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateResourceResult withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @param pathPart
     *        The last path segment for this resource.
     */
    public void setPathPart(String pathPart) {
        this.pathPart = pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @return The last path segment for this resource.
     */
    public String getPathPart() {
        return this.pathPart;
    }

    /**
     * <p>
     * The last path segment for this resource.
     * </p>
     * 
     * @param pathPart
     *        The last path segment for this resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateResourceResult withPathPart(String pathPart) {
        setPathPart(pathPart);
        return this;
    }

    /**
     * <p>
     * The full path for this resource.
     * </p>
     * 
     * @param path
     *        The full path for this resource.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The full path for this resource.
     * </p>
     * 
     * @return The full path for this resource.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The full path for this resource.
     * </p>
     * 
     * @param path
     *        The full path for this resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateResourceResult withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Map of methods for this resource, which is included only if requested
     * using the <b>embed</b> option.
     * </p>
     * 
     * @return Map of methods for this resource, which is included only if
     *         requested using the <b>embed</b> option.
     */
    public java.util.Map<String, Method> getResourceMethods() {
        return resourceMethods;
    }

    /**
     * <p>
     * Map of methods for this resource, which is included only if requested
     * using the <b>embed</b> option.
     * </p>
     * 
     * @param resourceMethods
     *        Map of methods for this resource, which is included only if
     *        requested using the <b>embed</b> option.
     */
    public void setResourceMethods(java.util.Map<String, Method> resourceMethods) {
        this.resourceMethods = resourceMethods;
    }

    /**
     * <p>
     * Map of methods for this resource, which is included only if requested
     * using the <b>embed</b> option.
     * </p>
     * 
     * @param resourceMethods
     *        Map of methods for this resource, which is included only if
     *        requested using the <b>embed</b> option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateResourceResult withResourceMethods(
            java.util.Map<String, Method> resourceMethods) {
        setResourceMethods(resourceMethods);
        return this;
    }

    public UpdateResourceResult addResourceMethodsEntry(String key, Method value) {
        if (null == this.resourceMethods) {
            this.resourceMethods = new java.util.HashMap<String, Method>();
        }
        if (this.resourceMethods.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.resourceMethods.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceMethods. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public UpdateResourceResult clearResourceMethodsEntries() {
        this.resourceMethods = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getPathPart() != null)
            sb.append("PathPart: " + getPathPart() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getResourceMethods() != null)
            sb.append("ResourceMethods: " + getResourceMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceResult == false)
            return false;
        UpdateResourceResult other = (UpdateResourceResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null
                && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getPathPart() == null ^ this.getPathPart() == null)
            return false;
        if (other.getPathPart() != null
                && other.getPathPart().equals(this.getPathPart()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getResourceMethods() == null
                ^ this.getResourceMethods() == null)
            return false;
        if (other.getResourceMethods() != null
                && other.getResourceMethods().equals(this.getResourceMethods()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode
                + ((getPathPart() == null) ? 0 : getPathPart().hashCode());
        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceMethods() == null) ? 0 : getResourceMethods()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceResult clone() {
        try {
            return (UpdateResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}