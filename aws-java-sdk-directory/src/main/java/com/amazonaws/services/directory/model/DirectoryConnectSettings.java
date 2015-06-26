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
 * Contains information for the ConnectDirectory operation when an AD
 * Connector directory is being created.
 * </p>
 */
public class DirectoryConnectSettings implements Serializable, Cloneable {

    /**
     * The identifier of the VPC that the AD Connector is created in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     */
    private String vpcId;

    /**
     * A list of subnet identifiers in the VPC that the AD Connector is
     * created in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIds;

    /**
     * A list of one or more IP addresses of DNS servers or domain
     * controllers in the on-premises directory.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> customerDnsIps;

    /**
     * The username of an account in the on-premises directory that is used
     * to connect to the directory. This account must have the following
     * privileges: <ul> <li>Read users and groups</li> <li>Create computer
     * objects</li> <li>Join computers to the domain</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     */
    private String customerUserName;

    /**
     * The identifier of the VPC that the AD Connector is created in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @return The identifier of the VPC that the AD Connector is created in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC that the AD Connector is created in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the AD Connector is created in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC that the AD Connector is created in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(vpc-[0-9a-f]{8})$<br/>
     *
     * @param vpcId The identifier of the VPC that the AD Connector is created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * A list of subnet identifiers in the VPC that the AD Connector is
     * created in.
     *
     * @return A list of subnet identifiers in the VPC that the AD Connector is
     *         created in.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
              subnetIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnetIds.setAutoConstruct(true);
        }
        return subnetIds;
    }
    
    /**
     * A list of subnet identifiers in the VPC that the AD Connector is
     * created in.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD Connector is
     *         created in.
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
     * A list of subnet identifiers in the VPC that the AD Connector is
     * created in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnetIds(java.util.Collection)} or {@link
     * #withSubnetIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD Connector is
     *         created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of subnet identifiers in the VPC that the AD Connector is
     * created in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A list of subnet identifiers in the VPC that the AD Connector is
     *         created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withSubnetIds(java.util.Collection<String> subnetIds) {
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
     * A list of one or more IP addresses of DNS servers or domain
     * controllers in the on-premises directory.
     *
     * @return A list of one or more IP addresses of DNS servers or domain
     *         controllers in the on-premises directory.
     */
    public java.util.List<String> getCustomerDnsIps() {
        if (customerDnsIps == null) {
              customerDnsIps = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              customerDnsIps.setAutoConstruct(true);
        }
        return customerDnsIps;
    }
    
    /**
     * A list of one or more IP addresses of DNS servers or domain
     * controllers in the on-premises directory.
     *
     * @param customerDnsIps A list of one or more IP addresses of DNS servers or domain
     *         controllers in the on-premises directory.
     */
    public void setCustomerDnsIps(java.util.Collection<String> customerDnsIps) {
        if (customerDnsIps == null) {
            this.customerDnsIps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> customerDnsIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customerDnsIps.size());
        customerDnsIpsCopy.addAll(customerDnsIps);
        this.customerDnsIps = customerDnsIpsCopy;
    }
    
    /**
     * A list of one or more IP addresses of DNS servers or domain
     * controllers in the on-premises directory.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCustomerDnsIps(java.util.Collection)} or {@link
     * #withCustomerDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerDnsIps A list of one or more IP addresses of DNS servers or domain
     *         controllers in the on-premises directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withCustomerDnsIps(String... customerDnsIps) {
        if (getCustomerDnsIps() == null) setCustomerDnsIps(new java.util.ArrayList<String>(customerDnsIps.length));
        for (String value : customerDnsIps) {
            getCustomerDnsIps().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more IP addresses of DNS servers or domain
     * controllers in the on-premises directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerDnsIps A list of one or more IP addresses of DNS servers or domain
     *         controllers in the on-premises directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withCustomerDnsIps(java.util.Collection<String> customerDnsIps) {
        if (customerDnsIps == null) {
            this.customerDnsIps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> customerDnsIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customerDnsIps.size());
            customerDnsIpsCopy.addAll(customerDnsIps);
            this.customerDnsIps = customerDnsIpsCopy;
        }

        return this;
    }

    /**
     * The username of an account in the on-premises directory that is used
     * to connect to the directory. This account must have the following
     * privileges: <ul> <li>Read users and groups</li> <li>Create computer
     * objects</li> <li>Join computers to the domain</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @return The username of an account in the on-premises directory that is used
     *         to connect to the directory. This account must have the following
     *         privileges: <ul> <li>Read users and groups</li> <li>Create computer
     *         objects</li> <li>Join computers to the domain</li> </ul>
     */
    public String getCustomerUserName() {
        return customerUserName;
    }
    
    /**
     * The username of an account in the on-premises directory that is used
     * to connect to the directory. This account must have the following
     * privileges: <ul> <li>Read users and groups</li> <li>Create computer
     * objects</li> <li>Join computers to the domain</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param customerUserName The username of an account in the on-premises directory that is used
     *         to connect to the directory. This account must have the following
     *         privileges: <ul> <li>Read users and groups</li> <li>Create computer
     *         objects</li> <li>Join computers to the domain</li> </ul>
     */
    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }
    
    /**
     * The username of an account in the on-premises directory that is used
     * to connect to the directory. This account must have the following
     * privileges: <ul> <li>Read users and groups</li> <li>Create computer
     * objects</li> <li>Join computers to the domain</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param customerUserName The username of an account in the on-premises directory that is used
     *         to connect to the directory. This account must have the following
     *         privileges: <ul> <li>Read users and groups</li> <li>Create computer
     *         objects</li> <li>Join computers to the domain</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryConnectSettings withCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
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
        if (getCustomerDnsIps() != null) sb.append("CustomerDnsIps: " + getCustomerDnsIps() + ",");
        if (getCustomerUserName() != null) sb.append("CustomerUserName: " + getCustomerUserName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerDnsIps() == null) ? 0 : getCustomerDnsIps().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerUserName() == null) ? 0 : getCustomerUserName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryConnectSettings == false) return false;
        DirectoryConnectSettings other = (DirectoryConnectSettings)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null) return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false) return false; 
        if (other.getCustomerDnsIps() == null ^ this.getCustomerDnsIps() == null) return false;
        if (other.getCustomerDnsIps() != null && other.getCustomerDnsIps().equals(this.getCustomerDnsIps()) == false) return false; 
        if (other.getCustomerUserName() == null ^ this.getCustomerUserName() == null) return false;
        if (other.getCustomerUserName() != null && other.getCustomerUserName().equals(this.getCustomerUserName()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryConnectSettings clone() {
        try {
            return (DirectoryConnectSettings) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    