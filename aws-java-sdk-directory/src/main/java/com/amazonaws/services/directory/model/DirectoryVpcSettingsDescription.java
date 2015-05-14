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
 * Contains information about a Simple AD directory.
 * </p>
 */
public class DirectoryVpcSettingsDescription implements Serializable, Cloneable {

    /**
     * The identifier of the VPC that the directory is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     */
    private String vpcId;

    /**
     * The identifiers of the subnets for the directory servers.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The security group identifier for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     */
    private String securityGroupId;

    /**
     * The list of Availability Zones that the directory is in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * The identifier of the VPC that the directory is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the VPC that the directory is in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC that the directory is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the directory is in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC that the directory is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the directory is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The identifiers of the subnets for the directory servers.
     *
     * @return The identifiers of the subnets for the directory servers.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * The identifiers of the subnets for the directory servers.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers.
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
     * The identifiers of the subnets for the directory servers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or {@link
     * #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * The identifiers of the subnets for the directory servers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The identifiers of the subnets for the directory servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withSubnetIds(java.util.Collection<String> subnetIds) {
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
     * The security group identifier for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @return The security group identifier for the directory.
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }
    
    /**
     * The security group identifier for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param securityGroupId The security group identifier for the directory.
     */
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    
    /**
     * The security group identifier for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param securityGroupId The security group identifier for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * The list of Availability Zones that the directory is in.
     *
     * @return The list of Availability Zones that the directory is in.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * The list of Availability Zones that the directory is in.
     *
     * @param availabilityZones The list of Availability Zones that the directory is in.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * The list of Availability Zones that the directory is in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The list of Availability Zones that the directory is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * The list of Availability Zones that the directory is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The list of Availability Zones that the directory is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryVpcSettingsDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
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
        if (getSubnetIds() != null) sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupId() != null) sb.append("SecurityGroupId: " + getSecurityGroupId() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryVpcSettingsDescription == false) return false;
        DirectoryVpcSettingsDescription other = (DirectoryVpcSettingsDescription)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null) return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryVpcSettingsDescription clone() {
        try {
            return (DirectoryVpcSettingsDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    