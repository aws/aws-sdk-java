/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeVpcPeeringConnectionsResult implements Serializable {

    /**
     * Information about the VPC peering connections.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection> vpcPeeringConnections;

    /**
     * Information about the VPC peering connections.
     *
     * @return Information about the VPC peering connections.
     */
    public java.util.List<VpcPeeringConnection> getVpcPeeringConnections() {
        if (vpcPeeringConnections == null) {
              vpcPeeringConnections = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection>();
              vpcPeeringConnections.setAutoConstruct(true);
        }
        return vpcPeeringConnections;
    }
    
    /**
     * Information about the VPC peering connections.
     *
     * @param vpcPeeringConnections Information about the VPC peering connections.
     */
    public void setVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        if (vpcPeeringConnections == null) {
            this.vpcPeeringConnections = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection> vpcPeeringConnectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection>(vpcPeeringConnections.size());
        vpcPeeringConnectionsCopy.addAll(vpcPeeringConnections);
        this.vpcPeeringConnections = vpcPeeringConnectionsCopy;
    }
    
    /**
     * Information about the VPC peering connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnections Information about the VPC peering connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(VpcPeeringConnection... vpcPeeringConnections) {
        if (getVpcPeeringConnections() == null) setVpcPeeringConnections(new java.util.ArrayList<VpcPeeringConnection>(vpcPeeringConnections.length));
        for (VpcPeeringConnection value : vpcPeeringConnections) {
            getVpcPeeringConnections().add(value);
        }
        return this;
    }
    
    /**
     * Information about the VPC peering connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnections Information about the VPC peering connections.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        if (vpcPeeringConnections == null) {
            this.vpcPeeringConnections = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection> vpcPeeringConnectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcPeeringConnection>(vpcPeeringConnections.size());
            vpcPeeringConnectionsCopy.addAll(vpcPeeringConnections);
            this.vpcPeeringConnections = vpcPeeringConnectionsCopy;
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
        if (getVpcPeeringConnections() != null) sb.append("VpcPeeringConnections: " + getVpcPeeringConnections() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcPeeringConnections() == null) ? 0 : getVpcPeeringConnections().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcPeeringConnectionsResult == false) return false;
        DescribeVpcPeeringConnectionsResult other = (DescribeVpcPeeringConnectionsResult)obj;
        
        if (other.getVpcPeeringConnections() == null ^ this.getVpcPeeringConnections() == null) return false;
        if (other.getVpcPeeringConnections() != null && other.getVpcPeeringConnections().equals(this.getVpcPeeringConnections()) == false) return false; 
        return true;
    }
    
}
    