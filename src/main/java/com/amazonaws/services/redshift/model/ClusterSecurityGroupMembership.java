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
 * Describes a security group.
 * </p>
 */
public class ClusterSecurityGroupMembership implements Serializable {

    /**
     * The name of the cluster security group.
     */
    private String clusterSecurityGroupName;

    /**
     * The status of the cluster security group.
     */
    private String status;

    /**
     * The name of the cluster security group.
     *
     * @return The name of the cluster security group.
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name of the cluster security group.
     *
     * @param clusterSecurityGroupName The name of the cluster security group.
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name of the cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name of the cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroupMembership withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * The status of the cluster security group.
     *
     * @return The status of the cluster security group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the cluster security group.
     *
     * @param status The status of the cluster security group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroupMembership withStatus(String status) {
        this.status = status;
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
        if (getClusterSecurityGroupName() != null) sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterSecurityGroupMembership == false) return false;
        ClusterSecurityGroupMembership other = (ClusterSecurityGroupMembership)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    