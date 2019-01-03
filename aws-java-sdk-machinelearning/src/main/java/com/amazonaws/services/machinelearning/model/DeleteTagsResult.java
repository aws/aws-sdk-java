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

/**
 * <p>
 * Amazon ML returns the following elements.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the ML object from which tags were deleted.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object from which tags were deleted.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the ML object from which tags were deleted.
     * </p>
     * 
     * @return The ID of the ML object from which tags were deleted.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceId
     *        The ID of the ML object from which tags were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object from which tags were deleted.
     * @see TaggableResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     * 
     * @return The type of the ML object from which tags were deleted.
     * @see TaggableResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object from which tags were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public DeleteTagsResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object from which tags were deleted.
     * @see TaggableResourceType
     */

    public void setResourceType(TaggableResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of the ML object from which tags were deleted.
     * </p>
     * 
     * @param resourceType
     *        The type of the ML object from which tags were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public DeleteTagsResult withResourceType(TaggableResourceType resourceType) {
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

        if (obj instanceof DeleteTagsResult == false)
            return false;
        DeleteTagsResult other = (DeleteTagsResult) obj;
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTagsResult clone() {
        try {
            return (DeleteTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
