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
 * Describes a set of DHCP options.
 * </p>
 */
public class DhcpOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     */
    private String dhcpOptionsId;
    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DhcpConfiguration> dhcpConfigurations;
    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the set of DHCP options.
     */

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     * 
     * @return The ID of the set of DHCP options.
     */

    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the set of DHCP options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        setDhcpOptionsId(dhcpOptionsId);
        return this;
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * 
     * @return One or more DHCP options in the set.
     */

    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * 
     * @param dhcpConfigurations
     *        One or more DHCP options in the set.
     */

    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }

        this.dhcpConfigurations = new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>(dhcpConfigurations);
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDhcpConfigurations(java.util.Collection)} or {@link #withDhcpConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dhcpConfigurations
     *        One or more DHCP options in the set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DhcpOptions withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (this.dhcpConfigurations == null) {
            setDhcpConfigurations(new com.amazonaws.internal.SdkInternalList<DhcpConfiguration>(dhcpConfigurations.length));
        }
        for (DhcpConfiguration ele : dhcpConfigurations) {
            this.dhcpConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * 
     * @param dhcpConfigurations
     *        One or more DHCP options in the set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DhcpOptions withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     * 
     * @return Any tags assigned to the DHCP options set.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the DHCP options set.
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
     * Any tags assigned to the DHCP options set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the DHCP options set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DhcpOptions withTags(Tag... tags) {
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
     * Any tags assigned to the DHCP options set.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the DHCP options set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DhcpOptions withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getDhcpConfigurations() != null)
            sb.append("DhcpConfigurations: " + getDhcpConfigurations() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DhcpOptions == false)
            return false;
        DhcpOptions other = (DhcpOptions) obj;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null)
            return false;
        if (other.getDhcpConfigurations() != null && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DhcpOptions clone() {
        try {
            return (DhcpOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
