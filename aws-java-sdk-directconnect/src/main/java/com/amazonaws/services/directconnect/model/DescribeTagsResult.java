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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * The response received when DescribeTags is called.
 * </p>
 */
public class DescribeTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceTag> resourceTags;

    /**
     * <p>
     * Information about the tags.
     * </p>
     * 
     * @return Information about the tags.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        if (resourceTags == null) {
            resourceTags = new com.amazonaws.internal.SdkInternalList<ResourceTag>();
        }
        return resourceTags;
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * 
     * @param resourceTags
     *        Information about the tags.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new com.amazonaws.internal.SdkInternalList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Information about the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new com.amazonaws.internal.SdkInternalList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * 
     * @param resourceTags
     *        Information about the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
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
        if (getResourceTags() != null)
            sb.append("ResourceTags: " + getResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsResult == false)
            return false;
        DescribeTagsResult other = (DescribeTagsResult) obj;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsResult clone() {
        try {
            return (DescribeTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
