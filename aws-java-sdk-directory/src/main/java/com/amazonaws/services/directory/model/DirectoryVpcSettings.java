/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information for the CreateDirectory operation when a Simple
 * AD directory is being created.
 * </p>
 */
public class DirectoryVpcSettings implements Serializable, Cloneable {

    /**
     * The identifier of the VPC to create the Simple AD directory in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     */
    private String vpcId;

    /**
     * The identifiers of the subnets for the directory servers. The two
     * subnets must be in different Availability Zones. AWS Directory Service
     * creates a directory server and a DNS server in each of these subnets.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The identifier of the VPC to create the Simple AD directory in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the VPC to create the Simple AD directory in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC to create the Simple AD directory in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC to create the Simple AD directory in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC to create the Simple AD directory in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC to create the Simple AD directory in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettings withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The identifiers of the subnets for the directory servers. The two
     * subnets must be in different Availability Zones. AWS Directory Service
     * creates a directory server and a DNS server in each of these subnets.
     *
     * @return The identifiers of the subnets for the directory servers. The two
     *         subnets must be in different Availability Zones. AWS Directory Service
     *         creates a directory server and a DNS server in each of these subnets.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * The identifiers of the subnets for the directory servers. The two
     * subnets must be in different Availability Zones. AWS Directory Service
     * creates a directory server and a DNS server in each of these subnets.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers. The two
     *         subnets must be in different Availability Zones. AWS Directory Service
     *         creates a directory server and a DNS server in each of these subnets.
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
     * The identifiers of the subnets for the directory servers. The two
     * subnets must be in different Availability Zones. AWS Directory Service
     * creates a directory server and a DNS server in each of these subnets.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or {@link
     * #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers. The two
     *         subnets must be in different Availability Zones. AWS Directory Service
     *         creates a directory server and a DNS server in each of these subnets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettings withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * The identifiers of the subnets for the directory servers. The two
     * subnets must be in different Availability Zones. AWS Directory Service
     * creates a directory server and a DNS server in each of these subnets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers. The two
     *         subnets must be in different Availability Zones. AWS Directory Service
     *         creates a directory server and a DNS server in each of these subnets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettings withSubnetIds(java.util.Collection<String> subnetIds) {
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryVpcSettings == false) return false;
        DirectoryVpcSettings other = (DirectoryVpcSettings)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryVpcSettings clone() {
        try {
            return (DirectoryVpcSettings) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    