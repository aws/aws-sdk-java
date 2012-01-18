/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The DhcpOptions data type.
 * </p>
 */
public class DhcpOptions {

    /**
     * Specifies the ID of the set of DHCP options.
     */
    private String dhcpOptionsId;

    /**
     * Contains information about the set of DHCP options.
     */
    private java.util.List<DhcpConfiguration> dhcpConfigurations;

    /**
     * A list of tags for the DhcpOptions.
     */
    private java.util.List<Tag> tags;

    /**
     * Specifies the ID of the set of DHCP options.
     *
     * @return Specifies the ID of the set of DHCP options.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }
    
    
    /**
     * Contains information about the set of DHCP options.
     *
     * @return Contains information about the set of DHCP options.
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        
        if (dhcpConfigurations == null) {
            dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>();
        }
        return dhcpConfigurations;
    }
    
    /**
     * Contains information about the set of DHCP options.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }

        java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations.size());
        dhcpConfigurationsCopy.addAll(dhcpConfigurations);
        this.dhcpConfigurations = dhcpConfigurationsCopy;
    }
    
    /**
     * Contains information about the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
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
     * Contains information about the set of DHCP options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpConfigurations Contains information about the set of DHCP options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
        } else {
            java.util.List<DhcpConfiguration> dhcpConfigurationsCopy = new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations.size());
            dhcpConfigurationsCopy.addAll(dhcpConfigurations);
            this.dhcpConfigurations = dhcpConfigurationsCopy;
        }

        return this;
    }
    
    /**
     * A list of tags for the DhcpOptions.
     *
     * @return A list of tags for the DhcpOptions.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the DhcpOptions.
     *
     * @param tags A list of tags for the DhcpOptions.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the DhcpOptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the DhcpOptions.
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
     * A list of tags for the DhcpOptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the DhcpOptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DhcpOptions withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
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
        if (dhcpOptionsId != null) sb.append("DhcpOptionsId: " + dhcpOptionsId + ", ");
        if (dhcpConfigurations != null) sb.append("DhcpConfigurations: " + dhcpConfigurations + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
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
    