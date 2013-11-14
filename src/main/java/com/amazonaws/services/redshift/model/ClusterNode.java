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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * The identifier of a node in a cluster. -->
 * </p>
 */
public class ClusterNode implements Serializable {

    /**
     * Whether the node is a leader node or a compute node.
     */
    private String nodeRole;

    /**
     * The private IP address of a node within a cluster.
     */
    private String privateIPAddress;

    /**
     * The public IP address of a node within a cluster.
     */
    private String publicIPAddress;

    /**
     * Whether the node is a leader node or a compute node.
     *
     * @return Whether the node is a leader node or a compute node.
     */
    public String getNodeRole() {
        return nodeRole;
    }
    
    /**
     * Whether the node is a leader node or a compute node.
     *
     * @param nodeRole Whether the node is a leader node or a compute node.
     */
    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }
    
    /**
     * Whether the node is a leader node or a compute node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeRole Whether the node is a leader node or a compute node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterNode withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * The private IP address of a node within a cluster.
     *
     * @return The private IP address of a node within a cluster.
     */
    public String getPrivateIPAddress() {
        return privateIPAddress;
    }
    
    /**
     * The private IP address of a node within a cluster.
     *
     * @param privateIPAddress The private IP address of a node within a cluster.
     */
    public void setPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
    }
    
    /**
     * The private IP address of a node within a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIPAddress The private IP address of a node within a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterNode withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * The public IP address of a node within a cluster.
     *
     * @return The public IP address of a node within a cluster.
     */
    public String getPublicIPAddress() {
        return publicIPAddress;
    }
    
    /**
     * The public IP address of a node within a cluster.
     *
     * @param publicIPAddress The public IP address of a node within a cluster.
     */
    public void setPublicIPAddress(String publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
    }
    
    /**
     * The public IP address of a node within a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIPAddress The public IP address of a node within a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterNode withPublicIPAddress(String publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
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
        if (getNodeRole() != null) sb.append("NodeRole: " + getNodeRole() + ",");
        if (getPrivateIPAddress() != null) sb.append("PrivateIPAddress: " + getPrivateIPAddress() + ",");
        if (getPublicIPAddress() != null) sb.append("PublicIPAddress: " + getPublicIPAddress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNodeRole() == null) ? 0 : getNodeRole().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIPAddress() == null) ? 0 : getPrivateIPAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIPAddress() == null) ? 0 : getPublicIPAddress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterNode == false) return false;
        ClusterNode other = (ClusterNode)obj;
        
        if (other.getNodeRole() == null ^ this.getNodeRole() == null) return false;
        if (other.getNodeRole() != null && other.getNodeRole().equals(this.getNodeRole()) == false) return false; 
        if (other.getPrivateIPAddress() == null ^ this.getPrivateIPAddress() == null) return false;
        if (other.getPrivateIPAddress() != null && other.getPrivateIPAddress().equals(this.getPrivateIPAddress()) == false) return false; 
        if (other.getPublicIPAddress() == null ^ this.getPublicIPAddress() == null) return false;
        if (other.getPublicIPAddress() != null && other.getPublicIPAddress().equals(this.getPublicIPAddress()) == false) return false; 
        return true;
    }
    
}
    