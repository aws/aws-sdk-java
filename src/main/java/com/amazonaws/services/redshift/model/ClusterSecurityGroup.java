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
public class ClusterSecurityGroup implements Serializable {

    /**
     * The name of the cluster security group to which the operation was
     * applied.
     */
    private String clusterSecurityGroupName;

    /**
     * A description of the security group.
     */
    private String description;

    /**
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * A list of IP ranges (CIDR blocks) that are permitted to access
     * clusters associated with this cluster security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRanges;

    /**
     * The name of the cluster security group to which the operation was
     * applied.
     *
     * @return The name of the cluster security group to which the operation was
     *         applied.
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }
    
    /**
     * The name of the cluster security group to which the operation was
     * applied.
     *
     * @param clusterSecurityGroupName The name of the cluster security group to which the operation was
     *         applied.
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }
    
    /**
     * The name of the cluster security group to which the operation was
     * applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroupName The name of the cluster security group to which the operation was
     *         applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * A description of the security group.
     *
     * @return A description of the security group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the security group.
     *
     * @param description A description of the security group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     *
     * @return A list of EC2 security groups that are permitted to access clusters
     *         associated with this cluster security group.
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        if (eC2SecurityGroups == null) {
              eC2SecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>();
              eC2SecurityGroups.setAutoConstruct(true);
        }
        return eC2SecurityGroups;
    }
    
    /**
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     *
     * @param eC2SecurityGroups A list of EC2 security groups that are permitted to access clusters
     *         associated with this cluster security group.
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
        eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
        this.eC2SecurityGroups = eC2SecurityGroupsCopy;
    }
    
    /**
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups A list of EC2 security groups that are permitted to access clusters
     *         associated with this cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) setEC2SecurityGroups(new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups.length));
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            getEC2SecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 security groups that are permitted to access clusters
     * associated with this cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroups A list of EC2 security groups that are permitted to access clusters
     *         associated with this cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup> eC2SecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EC2SecurityGroup>(eC2SecurityGroups.size());
            eC2SecurityGroupsCopy.addAll(eC2SecurityGroups);
            this.eC2SecurityGroups = eC2SecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of IP ranges (CIDR blocks) that are permitted to access
     * clusters associated with this cluster security group.
     *
     * @return A list of IP ranges (CIDR blocks) that are permitted to access
     *         clusters associated with this cluster security group.
     */
    public java.util.List<IPRange> getIPRanges() {
        if (iPRanges == null) {
              iPRanges = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>();
              iPRanges.setAutoConstruct(true);
        }
        return iPRanges;
    }
    
    /**
     * A list of IP ranges (CIDR blocks) that are permitted to access
     * clusters associated with this cluster security group.
     *
     * @param iPRanges A list of IP ranges (CIDR blocks) that are permitted to access
     *         clusters associated with this cluster security group.
     */
    public void setIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>(iPRanges.size());
        iPRangesCopy.addAll(iPRanges);
        this.iPRanges = iPRangesCopy;
    }
    
    /**
     * A list of IP ranges (CIDR blocks) that are permitted to access
     * clusters associated with this cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iPRanges A list of IP ranges (CIDR blocks) that are permitted to access
     *         clusters associated with this cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withIPRanges(IPRange... iPRanges) {
        if (getIPRanges() == null) setIPRanges(new java.util.ArrayList<IPRange>(iPRanges.length));
        for (IPRange value : iPRanges) {
            getIPRanges().add(value);
        }
        return this;
    }
    
    /**
     * A list of IP ranges (CIDR blocks) that are permitted to access
     * clusters associated with this cluster security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iPRanges A list of IP ranges (CIDR blocks) that are permitted to access
     *         clusters associated with this cluster security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSecurityGroup withIPRanges(java.util.Collection<IPRange> iPRanges) {
        if (iPRanges == null) {
            this.iPRanges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IPRange> iPRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IPRange>(iPRanges.size());
            iPRangesCopy.addAll(iPRanges);
            this.iPRanges = iPRangesCopy;
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
        if (getClusterSecurityGroupName() != null) sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getEC2SecurityGroups() != null) sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() + ",");
        if (getIPRanges() != null) sb.append("IPRanges: " + getIPRanges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getIPRanges() == null) ? 0 : getIPRanges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterSecurityGroup == false) return false;
        ClusterSecurityGroup other = (ClusterSecurityGroup)obj;
        
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null) return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null) return false;
        if (other.getEC2SecurityGroups() != null && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false) return false; 
        if (other.getIPRanges() == null ^ this.getIPRanges() == null) return false;
        if (other.getIPRanges() != null && other.getIPRanges().equals(this.getIPRanges()) == false) return false; 
        return true;
    }
    
}
    