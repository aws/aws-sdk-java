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
 * Network Acl Association
 */
public class NetworkAclAssociation {

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
        sb.append("NetworkAclAssociationId: " + networkAclAssociationId + ", ");
        sb.append("NetworkAclId: " + networkAclId + ", ");
        sb.append("SubnetId: " + subnetId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    