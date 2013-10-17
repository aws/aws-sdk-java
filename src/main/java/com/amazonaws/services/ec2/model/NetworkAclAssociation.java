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
 * Network Acl Association
 */
public class NetworkAclAssociation implements Serializable {

    private String networkAclAssociationId;

    private String networkAclId;

    private String subnetId;

    /**
     * Returns the value of the NetworkAclAssociationId property for this
     * object.
     *
     * @return The value of the NetworkAclAssociationId property for this object.
     */
    public String getNetworkAclAssociationId() {
        return networkAclAssociationId;
    }
    
    /**
     * Sets the value of the NetworkAclAssociationId property for this
     * object.
     *
     * @param networkAclAssociationId The new value for the NetworkAclAssociationId property for this
     *         object.
     */
    public void setNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
    }
    
    /**
     * Sets the value of the NetworkAclAssociationId property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclAssociationId The new value for the NetworkAclAssociationId property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAclAssociation withNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
        return this;
    }

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
    public NetworkAclAssociation withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * Returns the value of the SubnetId property for this object.
     *
     * @return The value of the SubnetId property for this object.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public NetworkAclAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
        if (getNetworkAclAssociationId() != null) sb.append("NetworkAclAssociationId: " + getNetworkAclAssociationId() + ",");
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclAssociationId() == null) ? 0 : getNetworkAclAssociationId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkAclAssociation == false) return false;
        NetworkAclAssociation other = (NetworkAclAssociation)obj;
        
        if (other.getNetworkAclAssociationId() == null ^ this.getNetworkAclAssociationId() == null) return false;
        if (other.getNetworkAclAssociationId() != null && other.getNetworkAclAssociationId().equals(this.getNetworkAclAssociationId()) == false) return false; 
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        return true;
    }
    
}
    