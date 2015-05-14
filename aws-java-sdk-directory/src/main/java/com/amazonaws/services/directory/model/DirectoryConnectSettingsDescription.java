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
 * Contains information about an AD Connector directory.
 * </p>
 */
public class DirectoryConnectSettingsDescription implements Serializable, Cloneable {

    /**
     * The identifier of the VPC that the AD Connector is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     */
    private String vpcId;

    /**
     * A list of subnet identifiers in the VPC that the AD connector is in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * The username of the service account in the on-premises directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     */
    private String customerUserName;

    /**
     * The security group identifier for the AD Connector directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     */
    private String securityGroupId;

    /**
     * A list of the Availability Zones that the directory is in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * The IP addresses of the AD Connector servers.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> connectIps;

    /**
     * The identifier of the VPC that the AD Connector is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the VPC that the AD Connector is in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC that the AD Connector is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the AD Connector is in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC that the AD Connector is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the AD Connector is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * A list of subnet identifiers in the VPC that the AD connector is in.
     *
     * @return A list of subnet identifiers in the VPC that the AD connector is in.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * A list of subnet identifiers in the VPC that the AD connector is in.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD connector is in.
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
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or {@link
     * #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD connector is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of subnet identifiers in the VPC that the AD connector is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD connector is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withSubnetIds(java.util.Collection<String> subnetIds) {
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
     * The username of the service account in the on-premises directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @return The username of the service account in the on-premises directory.
     */
    public String getCustomerUserName() {
        return customerUserName;
    }
    
    /**
     * The username of the service account in the on-premises directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param customerUserName The username of the service account in the on-premises directory.
     */
    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }
    
    /**
     * The username of the service account in the on-premises directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param customerUserName The username of the service account in the on-premises directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
        return this;
    }

    /**
     * The security group identifier for the AD Connector directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @return The security group identifier for the AD Connector directory.
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }
    
    /**
     * The security group identifier for the AD Connector directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param securityGroupId The security group identifier for the AD Connector directory.
     */
    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
    
    /**
     * The security group identifier for the AD Connector directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8})$<br/>
     *
     * @param securityGroupId The security group identifier for the AD Connector directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * A list of the Availability Zones that the directory is in.
     *
     * @return A list of the Availability Zones that the directory is in.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of the Availability Zones that the directory is in.
     *
     * @param availabilityZones A list of the Availability Zones that the directory is in.
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
     * A list of the Availability Zones that the directory is in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of the Availability Zones that the directory is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of the Availability Zones that the directory is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of the Availability Zones that the directory is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
     * The IP addresses of the AD Connector servers.
     *
     * @return The IP addresses of the AD Connector servers.
     */
    public java.util.List<String> getConnectIps() {
        if (connectIps == null) {
              connectIps = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              connectIps.setAutoConstruct(true);
        }
        return connectIps;
    }
    
    /**
     * The IP addresses of the AD Connector servers.
     *
     * @param connectIps The IP addresses of the AD Connector servers.
     */
    public void setConnectIps(java.util.Collection<String> connectIps) {
        if (connectIps == null) {
            this.connectIps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> connectIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(connectIps.size());
        connectIpsCopy.addAll(connectIps);
        this.connectIps = connectIpsCopy;
    }
    
    /**
     * The IP addresses of the AD Connector servers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConnectIps(java.util.Collection)} or {@link
     * #withConnectIps(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectIps The IP addresses of the AD Connector servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withConnectIps(String... connectIps) {
        if (getConnectIps() == null) setConnectIps(new java.util.ArrayList<String>(connectIps.length));
        for (String value : connectIps) {
            getConnectIps().add(value);
        }
        return this;
    }
    
    /**
     * The IP addresses of the AD Connector servers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectIps The IP addresses of the AD Connector servers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettingsDescription withConnectIps(java.util.Collection<String> connectIps) {
        if (connectIps == null) {
            this.connectIps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> connectIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(connectIps.size());
            connectIpsCopy.addAll(connectIps);
            this.connectIps = connectIpsCopy;
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
        if (getCustomerUserName() != null) sb.append("CustomerUserName: " + getCustomerUserName() + ",");
        if (getSecurityGroupId() != null) sb.append("SecurityGroupId: " + getSecurityGroupId() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getConnectIps() != null) sb.append("ConnectIps: " + getConnectIps() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerUserName() == null) ? 0 : getCustomerUserName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getConnectIps() == null) ? 0 : getConnectIps().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryConnectSettingsDescription == false) return false;
        DirectoryConnectSettingsDescription other = (DirectoryConnectSettingsDescription)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null) return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false) return false; 
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null) return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getConnectIps() == null ^ this.getConnectIps() == null) return false;
        if (other.getConnectIps() != null && other.getConnectIps().equals(this.getConnectIps()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryConnectSettingsDescription clone() {
        try {
            return (DirectoryConnectSettingsDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    