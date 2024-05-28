/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The tag specifications of an Amazon EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/EBSTagSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSTagSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of volume resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and <code>AmazonECSManaged</code> are
     * reserved tags that can't be used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags can only
     * propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>. If no value is
     * specified, the tags aren't &#x2028;propagated.
     * </p>
     */
    private String propagateTags;

    /**
     * <p>
     * The type of volume resource.
     * </p>
     * 
     * @param resourceType
     *        The type of volume resource.
     * @see EBSResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of volume resource.
     * </p>
     * 
     * @return The type of volume resource.
     * @see EBSResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of volume resource.
     * </p>
     * 
     * @param resourceType
     *        The type of volume resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSResourceType
     */

    public EBSTagSpecification withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of volume resource.
     * </p>
     * 
     * @param resourceType
     *        The type of volume resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSResourceType
     */

    public EBSTagSpecification withResourceType(EBSResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and <code>AmazonECSManaged</code> are
     * reserved tags that can't be used.
     * </p>
     * 
     * @return The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and
     *         <code>AmazonECSManaged</code> are reserved tags that can't be used.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and <code>AmazonECSManaged</code> are
     * reserved tags that can't be used.
     * </p>
     * 
     * @param tags
     *        The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and
     *        <code>AmazonECSManaged</code> are reserved tags that can't be used.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and <code>AmazonECSManaged</code> are
     * reserved tags that can't be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and
     *        <code>AmazonECSManaged</code> are reserved tags that can't be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSTagSpecification withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and <code>AmazonECSManaged</code> are
     * reserved tags that can't be used.
     * </p>
     * 
     * @param tags
     *        The tags applied to this Amazon EBS volume. <code>AmazonECSCreated</code> and
     *        <code>AmazonECSManaged</code> are reserved tags that can't be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSTagSpecification withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags can only
     * propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>. If no value is
     * specified, the tags aren't &#x2028;propagated.
     * </p>
     * 
     * @param propagateTags
     *        Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags
     *        can only propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>.
     *        If no value is specified, the tags aren't &#x2028;propagated.
     * @see PropagateTags
     */

    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags can only
     * propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>. If no value is
     * specified, the tags aren't &#x2028;propagated.
     * </p>
     * 
     * @return Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags
     *         can only propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>
     *         . If no value is specified, the tags aren't &#x2028;propagated.
     * @see PropagateTags
     */

    public String getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags can only
     * propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>. If no value is
     * specified, the tags aren't &#x2028;propagated.
     * </p>
     * 
     * @param propagateTags
     *        Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags
     *        can only propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>.
     *        If no value is specified, the tags aren't &#x2028;propagated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public EBSTagSpecification withPropagateTags(String propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags can only
     * propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>. If no value is
     * specified, the tags aren't &#x2028;propagated.
     * </p>
     * 
     * @param propagateTags
     *        Determines whether to propagate the tags from the task definition to &#x2028;the Amazon EBS volume. Tags
     *        can only propagate to a <code>SERVICE</code> specified in &#x2028;<code>ServiceVolumeConfiguration</code>.
     *        If no value is specified, the tags aren't &#x2028;propagated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public EBSTagSpecification withPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSTagSpecification == false)
            return false;
        EBSTagSpecification other = (EBSTagSpecification) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        return hashCode;
    }

    @Override
    public EBSTagSpecification clone() {
        try {
            return (EBSTagSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.EBSTagSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
