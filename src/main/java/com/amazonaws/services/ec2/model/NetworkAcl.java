/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Network Acl
 */
public class NetworkAcl implements Serializable {

    private String networkAclId;

    private String vpcId;

    private Boolean isDefault;

    private com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry> entries;

    private com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation> associations;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Returns the value of the NetworkAclId property for this object.
     *
     * @return The value of the NetworkAclId property for this object.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * Sets the value of the NetworkAclId property for this object.
     *
     * @param networkAclId The new value for the NetworkAclId property for this object.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * Sets the value of the NetworkAclId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId The new value for the NetworkAclId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * Returns the value of the VpcId property for this object.
     *
     * @return The value of the VpcId property for this object.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     *
     * @param vpcId The new value for the VpcId property for this object.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The new value for the VpcId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Returns the value of the IsDefault property for this object.
     *
     * @return The value of the IsDefault property for this object.
     */
    public Boolean isDefault() {
        return isDefault;
    }
    
    /**
     * Sets the value of the IsDefault property for this object.
     *
     * @param isDefault The new value for the IsDefault property for this object.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    
    /**
     * Sets the value of the IsDefault property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefault The new value for the IsDefault property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Returns the value of the IsDefault property for this object.
     *
     * @return The value of the IsDefault property for this object.
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Returns the value of the Entries property for this object.
     *
     * @return The value of the Entries property for this object.
     */
    public java.util.List<NetworkAclEntry> getEntries() {
        if (entries == null) {
              entries = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry>();
              entries.setAutoConstruct(true);
        }
        return entries;
    }
    
    /**
     * Sets the value of the Entries property for this object.
     *
     * @param entries The new value for the Entries property for this object.
     */
    public void setEntries(java.util.Collection<NetworkAclEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry>(entries.size());
        entriesCopy.addAll(entries);
        this.entries = entriesCopy;
    }
    
    /**
     * Sets the value of the Entries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries The new value for the Entries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withEntries(NetworkAclEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<NetworkAclEntry>(entries.length));
        for (NetworkAclEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Entries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries The new value for the Entries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withEntries(java.util.Collection<NetworkAclEntry> entries) {
        if (entries == null) {
            this.entries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclEntry>(entries.size());
            entriesCopy.addAll(entries);
            this.entries = entriesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Associations property for this object.
     *
     * @return The value of the Associations property for this object.
     */
    public java.util.List<NetworkAclAssociation> getAssociations() {
        if (associations == null) {
              associations = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation>();
              associations.setAutoConstruct(true);
        }
        return associations;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     *
     * @param associations The new value for the Associations property for this object.
     */
    public void setAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation>(associations.size());
        associationsCopy.addAll(associations);
        this.associations = associationsCopy;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The new value for the Associations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withAssociations(NetworkAclAssociation... associations) {
        if (getAssociations() == null) setAssociations(new java.util.ArrayList<NetworkAclAssociation>(associations.length));
        for (NetworkAclAssociation value : associations) {
            getAssociations().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The new value for the Associations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        if (associations == null) {
            this.associations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAclAssociation>(associations.size());
            associationsCopy.addAll(associations);
            this.associations = associationsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
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
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAcl withTags(java.util.Collection<Tag> tags) {
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
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (isDefault() != null) sb.append("IsDefault: " + isDefault() + ",");
        if (getEntries() != null) sb.append("Entries: " + getEntries() + ",");
        if (getAssociations() != null) sb.append("Associations: " + getAssociations() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((isDefault() == null) ? 0 : isDefault().hashCode()); 
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode()); 
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkAcl == false) return false;
        NetworkAcl other = (NetworkAcl)obj;
        
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isDefault() == null ^ this.isDefault() == null) return false;
        if (other.isDefault() != null && other.isDefault().equals(this.isDefault()) == false) return false; 
        if (other.getEntries() == null ^ this.getEntries() == null) return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false) return false; 
        if (other.getAssociations() == null ^ this.getAssociations() == null) return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    