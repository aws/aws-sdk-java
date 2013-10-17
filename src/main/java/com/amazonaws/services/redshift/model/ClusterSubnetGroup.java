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
 * Describes a subnet group.
 * </p>
 */
public class ClusterSubnetGroup implements Serializable {

    /**
     * The name of the cluster subnet group.
     */
    private String clusterSubnetGroupName;

    /**
     * The description of the cluster subnet group.
     */
    private String description;

    /**
     * The VPC ID of the cluster subnet group.
     */
    private String vpcId;

    /**
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     */
    private String subnetGroupStatus;

    /**
     * A list of the VPC <a>Subnet</a> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnets;

    /**
     * The name of the cluster subnet group.
     *
     * @return The name of the cluster subnet group.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * The description of the cluster subnet group.
     *
     * @return The description of the cluster subnet group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the cluster subnet group.
     *
     * @param description The description of the cluster subnet group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the cluster subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the cluster subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The VPC ID of the cluster subnet group.
     *
     * @return The VPC ID of the cluster subnet group.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The VPC ID of the cluster subnet group.
     *
     * @param vpcId The VPC ID of the cluster subnet group.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The VPC ID of the cluster subnet group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The VPC ID of the cluster subnet group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     *
     * @return The status of the cluster subnet group. Possible values are
     *         <code>Complete</code>, <code>Incomplete</code> and
     *         <code>Invalid</code>.
     */
    public String getSubnetGroupStatus() {
        return subnetGroupStatus;
    }
    
    /**
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     *
     * @param subnetGroupStatus The status of the cluster subnet group. Possible values are
     *         <code>Complete</code>, <code>Incomplete</code> and
     *         <code>Invalid</code>.
     */
    public void setSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
    }
    
    /**
     * The status of the cluster subnet group. Possible values are
     * <code>Complete</code>, <code>Incomplete</code> and
     * <code>Invalid</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetGroupStatus The status of the cluster subnet group. Possible values are
     *         <code>Complete</code>, <code>Incomplete</code> and
     *         <code>Invalid</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withSubnetGroupStatus(String subnetGroupStatus) {
        this.subnetGroupStatus = subnetGroupStatus;
        return this;
    }

    /**
     * A list of the VPC <a>Subnet</a> elements.
     *
     * @return A list of the VPC <a>Subnet</a> elements.
     */
    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * A list of the VPC <a>Subnet</a> elements.
     *
     * @param subnets A list of the VPC <a>Subnet</a> elements.
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * A list of the VPC <a>Subnet</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of the VPC <a>Subnet</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<Subnet>(subnets.length));
        for (Subnet value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * A list of the VPC <a>Subnet</a> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of the VPC <a>Subnet</a> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Subnet> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subnet>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
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
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetGroupStatus() != null) sb.append("SubnetGroupStatus: " + getSubnetGroupStatus() + ",");
        if (getSubnets() != null) sb.append("Subnets: " + getSubnets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetGroupStatus() == null) ? 0 : getSubnetGroupStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterSubnetGroup == false) return false;
        ClusterSubnetGroup other = (ClusterSubnetGroup)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetGroupStatus() == null ^ this.getSubnetGroupStatus() == null) return false;
        if (other.getSubnetGroupStatus() != null && other.getSubnetGroupStatus().equals(this.getSubnetGroupStatus()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        return true;
    }
    
}
    