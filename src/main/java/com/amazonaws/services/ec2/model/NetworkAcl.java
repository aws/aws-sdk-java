/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Network Acl
 */
public class NetworkAcl {

    private String networkAclId;

    private String vpcId;

    private Boolean isDefault;

    private java.util.List<NetworkAclEntry> entries;

    private java.util.List<NetworkAclAssociation> associations;

    private java.util.List<Tag> tags;

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
            entries = new java.util.ArrayList<NetworkAclEntry>();
        }
        return entries;
    }
    
    /**
     * Sets the value of the Entries property for this object.
     *
     * @param entries The new value for the Entries property for this object.
     */
    public void setEntries(java.util.Collection<NetworkAclEntry> entries) {
        java.util.List<NetworkAclEntry> entriesCopy = new java.util.ArrayList<NetworkAclEntry>();
        if (entries != null) {
            entriesCopy.addAll(entries);
        }
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
        java.util.List<NetworkAclEntry> entriesCopy = new java.util.ArrayList<NetworkAclEntry>();
        if (entries != null) {
            entriesCopy.addAll(entries);
        }
        this.entries = entriesCopy;

        return this;
    }
    
    /**
     * Returns the value of the Associations property for this object.
     *
     * @return The value of the Associations property for this object.
     */
    public java.util.List<NetworkAclAssociation> getAssociations() {
        if (associations == null) {
            associations = new java.util.ArrayList<NetworkAclAssociation>();
        }
        return associations;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     *
     * @param associations The new value for the Associations property for this object.
     */
    public void setAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        java.util.List<NetworkAclAssociation> associationsCopy = new java.util.ArrayList<NetworkAclAssociation>();
        if (associations != null) {
            associationsCopy.addAll(associations);
        }
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
        java.util.List<NetworkAclAssociation> associationsCopy = new java.util.ArrayList<NetworkAclAssociation>();
        if (associations != null) {
            associationsCopy.addAll(associations);
        }
        this.associations = associationsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
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
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("NetworkAclId: " + networkAclId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("IsDefault: " + isDefault + ", ");
        sb.append("Entries: " + entries + ", ");
        sb.append("Associations: " + associations + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    