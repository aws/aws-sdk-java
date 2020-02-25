/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Describes an IPv6 address pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv6Pool" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipv6Pool implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The description for the address pool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PoolCidrBlock> poolCidrBlocks;
    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the address pool.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @return The ID of the address pool.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     * 
     * @param description
     *        The description for the address pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     * 
     * @return The description for the address pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     * 
     * @param description
     *        The description for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * 
     * @return The CIDR blocks for the address pool.
     */

    public java.util.List<PoolCidrBlock> getPoolCidrBlocks() {
        if (poolCidrBlocks == null) {
            poolCidrBlocks = new com.amazonaws.internal.SdkInternalList<PoolCidrBlock>();
        }
        return poolCidrBlocks;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * 
     * @param poolCidrBlocks
     *        The CIDR blocks for the address pool.
     */

    public void setPoolCidrBlocks(java.util.Collection<PoolCidrBlock> poolCidrBlocks) {
        if (poolCidrBlocks == null) {
            this.poolCidrBlocks = null;
            return;
        }

        this.poolCidrBlocks = new com.amazonaws.internal.SdkInternalList<PoolCidrBlock>(poolCidrBlocks);
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolCidrBlocks(java.util.Collection)} or {@link #withPoolCidrBlocks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param poolCidrBlocks
     *        The CIDR blocks for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withPoolCidrBlocks(PoolCidrBlock... poolCidrBlocks) {
        if (this.poolCidrBlocks == null) {
            setPoolCidrBlocks(new com.amazonaws.internal.SdkInternalList<PoolCidrBlock>(poolCidrBlocks.length));
        }
        for (PoolCidrBlock ele : poolCidrBlocks) {
            this.poolCidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * 
     * @param poolCidrBlocks
     *        The CIDR blocks for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withPoolCidrBlocks(java.util.Collection<PoolCidrBlock> poolCidrBlocks) {
        setPoolCidrBlocks(poolCidrBlocks);
        return this;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * 
     * @return Any tags for the address pool.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
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
     * Any tags for the address pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withTags(Tag... tags) {
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
     * Any tags for the address pool.
     * </p>
     * 
     * @param tags
     *        Any tags for the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6Pool withTags(java.util.Collection<Tag> tags) {
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPoolCidrBlocks() != null)
            sb.append("PoolCidrBlocks: ").append(getPoolCidrBlocks()).append(",");
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

        if (obj instanceof Ipv6Pool == false)
            return false;
        Ipv6Pool other = (Ipv6Pool) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolCidrBlocks() == null ^ this.getPoolCidrBlocks() == null)
            return false;
        if (other.getPoolCidrBlocks() != null && other.getPoolCidrBlocks().equals(this.getPoolCidrBlocks()) == false)
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

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPoolCidrBlocks() == null) ? 0 : getPoolCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Ipv6Pool clone() {
        try {
            return (Ipv6Pool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
