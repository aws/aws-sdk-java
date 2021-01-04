/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Usage allocations allow you to split usage into buckets by tags.
 * </p>
 * <p>
 * Each UsageAllocation indicates the usage quantity for a specific set of tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/UsageAllocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageAllocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total quantity allocated to this bucket of usage.
     * </p>
     */
    private Integer allocatedUsageQuantity;
    /**
     * <p>
     * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left
     * out.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The total quantity allocated to this bucket of usage.
     * </p>
     * 
     * @param allocatedUsageQuantity
     *        The total quantity allocated to this bucket of usage.
     */

    public void setAllocatedUsageQuantity(Integer allocatedUsageQuantity) {
        this.allocatedUsageQuantity = allocatedUsageQuantity;
    }

    /**
     * <p>
     * The total quantity allocated to this bucket of usage.
     * </p>
     * 
     * @return The total quantity allocated to this bucket of usage.
     */

    public Integer getAllocatedUsageQuantity() {
        return this.allocatedUsageQuantity;
    }

    /**
     * <p>
     * The total quantity allocated to this bucket of usage.
     * </p>
     * 
     * @param allocatedUsageQuantity
     *        The total quantity allocated to this bucket of usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageAllocation withAllocatedUsageQuantity(Integer allocatedUsageQuantity) {
        setAllocatedUsageQuantity(allocatedUsageQuantity);
        return this;
    }

    /**
     * <p>
     * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left
     * out.
     * </p>
     * 
     * @return The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can
     *         be left out.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left
     * out.
     * </p>
     * 
     * @param tags
     *        The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can
     *        be left out.
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
     * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left
     * out.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can
     *        be left out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageAllocation withTags(Tag... tags) {
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
     * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left
     * out.
     * </p>
     * 
     * @param tags
     *        The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can
     *        be left out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageAllocation withTags(java.util.Collection<Tag> tags) {
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
        if (getAllocatedUsageQuantity() != null)
            sb.append("AllocatedUsageQuantity: ").append(getAllocatedUsageQuantity()).append(",");
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

        if (obj instanceof UsageAllocation == false)
            return false;
        UsageAllocation other = (UsageAllocation) obj;
        if (other.getAllocatedUsageQuantity() == null ^ this.getAllocatedUsageQuantity() == null)
            return false;
        if (other.getAllocatedUsageQuantity() != null && other.getAllocatedUsageQuantity().equals(this.getAllocatedUsageQuantity()) == false)
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

        hashCode = prime * hashCode + ((getAllocatedUsageQuantity() == null) ? 0 : getAllocatedUsageQuantity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UsageAllocation clone() {
        try {
            return (UsageAllocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacemetering.model.transform.UsageAllocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
