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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of resource ARNs and the tags (keys and values) that are associated with each.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/ResourceTagMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTagMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of resource ARN(s).
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An array of resource ARN(s).
     * </p>
     * 
     * @param resourceARN
     *        An array of resource ARN(s).
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * An array of resource ARN(s).
     * </p>
     * 
     * @return An array of resource ARN(s).
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * An array of resource ARN(s).
     * </p>
     * 
     * @param resourceARN
     *        An array of resource ARN(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTagMapping withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * 
     * @return The tags that have been applied to one or more AWS resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * 
     * @param tags
     *        The tags that have been applied to one or more AWS resources.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that have been applied to one or more AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTagMapping withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * 
     * @param tags
     *        The tags that have been applied to one or more AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTagMapping withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTagMapping == false)
            return false;
        ResourceTagMapping other = (ResourceTagMapping) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ResourceTagMapping clone() {
        try {
            return (ResourceTagMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroupstaggingapi.model.transform.ResourceTagMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
