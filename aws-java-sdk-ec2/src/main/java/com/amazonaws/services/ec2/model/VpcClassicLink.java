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
 * Describes whether a VPC is enabled for ClassicLink.
 * </p>
 */
public class VpcClassicLink implements Serializable, Cloneable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     */
    private Boolean classicLinkEnabled;

    /**
     * Any tags assigned to the VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcClassicLink withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     *
     * @return Indicates whether the VPC is enabled for ClassicLink.
     */
    public Boolean isClassicLinkEnabled() {
        return classicLinkEnabled;
    }
    
    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     *
     * @param classicLinkEnabled Indicates whether the VPC is enabled for ClassicLink.
     */
    public void setClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
    }
    
    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param classicLinkEnabled Indicates whether the VPC is enabled for ClassicLink.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcClassicLink withClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
        return this;
    }

    /**
     * Indicates whether the VPC is enabled for ClassicLink.
     *
     * @return Indicates whether the VPC is enabled for ClassicLink.
     */
    public Boolean getClassicLinkEnabled() {
        return classicLinkEnabled;
    }

    /**
     * Any tags assigned to the VPC.
     *
     * @return Any tags assigned to the VPC.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the VPC.
     *
     * @param tags Any tags assigned to the VPC.
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
     * Any tags assigned to the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcClassicLink withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcClassicLink withTags(java.util.Collection<Tag> tags) {
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (isClassicLinkEnabled() != null) sb.append("ClassicLinkEnabled: " + isClassicLinkEnabled() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((isClassicLinkEnabled() == null) ? 0 : isClassicLinkEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcClassicLink == false) return false;
        VpcClassicLink other = (VpcClassicLink)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isClassicLinkEnabled() == null ^ this.isClassicLinkEnabled() == null) return false;
        if (other.isClassicLinkEnabled() != null && other.isClassicLinkEnabled().equals(this.isClassicLinkEnabled()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public VpcClassicLink clone() {
        try {
            return (VpcClassicLink) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    