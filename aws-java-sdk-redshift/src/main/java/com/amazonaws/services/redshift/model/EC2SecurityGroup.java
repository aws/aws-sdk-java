/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Amazon EC2 security group.
 * </p>
 */
public class EC2SecurityGroup implements Serializable, Cloneable {

    /**
     * The status of the EC2 security group.
     */
    private String status;

    /**
     * The name of the EC2 Security Group.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS ID of the owner of the EC2 security group specified in the
     * <code>EC2SecurityGroupName</code> field.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * The list of tags for the EC2 security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The status of the EC2 security group.
     *
     * @return The status of the EC2 security group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the EC2 security group.
     *
     * @param status The status of the EC2 security group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the EC2 security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2SecurityGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The name of the EC2 Security Group.
     *
     * @return The name of the EC2 Security Group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The name of the EC2 Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The name of the EC2 Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The AWS ID of the owner of the EC2 security group specified in the
     * <code>EC2SecurityGroupName</code> field.
     *
     * @return The AWS ID of the owner of the EC2 security group specified in the
     *         <code>EC2SecurityGroupName</code> field.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS ID of the owner of the EC2 security group specified in the
     * <code>EC2SecurityGroupName</code> field.
     *
     * @param eC2SecurityGroupOwnerId The AWS ID of the owner of the EC2 security group specified in the
     *         <code>EC2SecurityGroupName</code> field.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS ID of the owner of the EC2 security group specified in the
     * <code>EC2SecurityGroupName</code> field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS ID of the owner of the EC2 security group specified in the
     *         <code>EC2SecurityGroupName</code> field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }

    /**
     * The list of tags for the EC2 security group.
     *
     * @return The list of tags for the EC2 security group.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The list of tags for the EC2 security group.
     *
     * @param tags The list of tags for the EC2 security group.
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
     * The list of tags for the EC2 security group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2SecurityGroup withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags for the EC2 security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the EC2 security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2SecurityGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EC2SecurityGroup == false) return false;
        EC2SecurityGroup other = (EC2SecurityGroup)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public EC2SecurityGroup clone() {
        try {
            return (EC2SecurityGroup) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    