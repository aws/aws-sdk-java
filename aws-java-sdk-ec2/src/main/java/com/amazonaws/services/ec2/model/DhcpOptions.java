/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a set of DHCP options.
 * </p>
 */
public class DhcpOptions implements Serializable {

    /**
     * The ID of the set of DHCP options.
     */
    private String dhcpOptionsId;

    /**
     * One or more DHCP options in the set.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurations;

    /**
     * Any tags assigned to the DHCP options set.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the set of DHCP options.
     *
     * @return The ID of the set of DHCP options.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * The ID of the set of DHCP options.
     *
     * @param dhcpOptionsId The ID of the set of DHCP options.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * The ID of the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The ID of the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * One or more DHCP options in the set.
     *
     * @return One or more DHCP options in the set.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        if (dhcpConfigurations == null) {
              dhcpConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>();
              dhcpConfigurations.setAutoConstruct(true);
        }
        return dhcpConfigurations;
    }
    
    /**
     * One or more DHCP options in the set.
     *
     * @param dhcpConfigurations One or more DHCP options in the set.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
        dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * One or more DHCP options in the set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations One or more DHCP options in the set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DhcpOptions withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (getDhcpConfigurations() == null) setDhcpConfigurations(new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations.length));
        for (DhcpConfiguration value : dhcpConfigurations) {
            getDhcpConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * One or more DHCP options in the set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations One or more DHCP options in the set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DhcpOptions withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration> dhcpConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DhcpConfiguration>(dhcpConfigurations.size());
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
            this.dhcpConfigurations = dhcpConfigurationsCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the DHCP options set.
     *
     * @return Any tags assigned to the DHCP options set.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the DHCP options set.
     *
     * @param tags Any tags assigned to the DHCP options set.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the DHCP options set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the DHCP options set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DhcpOptions withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the DHCP options set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the DHCP options set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DhcpOptions withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getDhcpOptionsId() != null) sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getDhcpConfigurations() != null) sb.append("DhcpConfigurations: " + getDhcpConfigurations() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DhcpOptions == false) return false;
        DhcpOptions other = (DhcpOptions)obj;
        
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null) return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false) return false; 
        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null) return false;
        if (other.getDhcpConfigurations() != null && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    