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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the ID format for a resource.
 * </p>
 */
public class IdFormat implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * </p>
     */
    private Boolean useLongIds;
    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     * available for this resource type, this field is not returned.
     * </p>
     */
    private java.util.Date deadline;

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resource
     *        The type of resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resource
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdFormat withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * </p>
     * 
     * @param useLongIds
     *        Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     */

    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * </p>
     * 
     * @return Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     */

    public Boolean getUseLongIds() {
        return this.useLongIds;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * </p>
     * 
     * @param useLongIds
     *        Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdFormat withUseLongIds(Boolean useLongIds) {
        setUseLongIds(useLongIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     * </p>
     * 
     * @return Indicates whether longer IDs (17-character IDs) are enabled for the resource.
     */

    public Boolean isUseLongIds() {
        return this.useLongIds;
    }

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     * available for this resource type, this field is not returned.
     * </p>
     * 
     * @param deadline
     *        The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     *        available for this resource type, this field is not returned.
     */

    public void setDeadline(java.util.Date deadline) {
        this.deadline = deadline;
    }

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     * available for this resource type, this field is not returned.
     * </p>
     * 
     * @return The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     *         available for this resource type, this field is not returned.
     */

    public java.util.Date getDeadline() {
        return this.deadline;
    }

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     * available for this resource type, this field is not returned.
     * </p>
     * 
     * @param deadline
     *        The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet
     *        available for this resource type, this field is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdFormat withDeadline(java.util.Date deadline) {
        setDeadline(deadline);
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
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getUseLongIds() != null)
            sb.append("UseLongIds: " + getUseLongIds() + ",");
        if (getDeadline() != null)
            sb.append("Deadline: " + getDeadline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdFormat == false)
            return false;
        IdFormat other = (IdFormat) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getUseLongIds() == null ^ this.getUseLongIds() == null)
            return false;
        if (other.getUseLongIds() != null && other.getUseLongIds().equals(this.getUseLongIds()) == false)
            return false;
        if (other.getDeadline() == null ^ this.getDeadline() == null)
            return false;
        if (other.getDeadline() != null && other.getDeadline().equals(this.getDeadline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getUseLongIds() == null) ? 0 : getUseLongIds().hashCode());
        hashCode = prime * hashCode + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        return hashCode;
    }

    @Override
    public IdFormat clone() {
        try {
            return (IdFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
