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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest) ModifyClusterSubnetGroup operation}.
 * <p>
 * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list
 * of subnets.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest)
 */
public class ModifyClusterSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the subnet group to be modified.
     */
    private String clusterSubnetGroupName;

    /**
     * A text description of the subnet group to be modified.
     */
    private String description;

    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The name of the subnet group to be modified.
     *
     * @return The name of the subnet group to be modified.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group to be modified.
     *
     * @param clusterSubnetGroupName The name of the subnet group to be modified.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group to be modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the subnet group to be modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterSubnetGroupRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * A text description of the subnet group to be modified.
     *
     * @return A text description of the subnet group to be modified.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A text description of the subnet group to be modified.
     *
     * @param description A text description of the subnet group to be modified.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A text description of the subnet group to be modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A text description of the subnet group to be modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterSubnetGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     *
     * @return An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
        subnetIdsCopy.addAll(subnetIds);
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds An array of VPC subnet IDs. A maximum of 20 subnets can be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnetIds.size());
            subnetIdsCopy.addAll(subnetIds);
            this.subnetIds = subnetIdsCopy;
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
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyClusterSubnetGroupRequest == false) return false;
        ModifyClusterSubnetGroupRequest other = (ModifyClusterSubnetGroupRequest)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        return true;
    }
    
}
    