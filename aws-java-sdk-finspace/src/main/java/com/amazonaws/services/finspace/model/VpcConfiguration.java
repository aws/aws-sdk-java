/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration details about the network where the Privatelink endpoint of the cluster resides.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/VpcConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the VPC endpoint.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The IP address type for cluster network configuration parameters. The following type is available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP_V4 – IP address version 4
     * </p>
     * </li>
     * </ul>
     */
    private String ipAddressType;

    /**
     * <p>
     * The identifier of the VPC endpoint.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC endpoint.
     * </p>
     * 
     * @return The identifier of the VPC endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC endpoint.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * </p>
     * 
     * @return The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * </p>
     * 
     * @param securityGroupIds
     *        The unique identifier of the VPC security group applied to the VPC endpoint ENI for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * </p>
     * 
     * @return The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * </p>
     * 
     * @param subnetIds
     *        The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * </p>
     * 
     * @param subnetIds
     *        The identifier of the subnet that the Privatelink VPC endpoint uses to connect to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IP address type for cluster network configuration parameters. The following type is available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP_V4 – IP address version 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param ipAddressType
     *        The IP address type for cluster network configuration parameters. The following type is available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP_V4 – IP address version 4
     *        </p>
     *        </li>
     * @see IPAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type for cluster network configuration parameters. The following type is available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP_V4 – IP address version 4
     * </p>
     * </li>
     * </ul>
     * 
     * @return The IP address type for cluster network configuration parameters. The following type is available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         IP_V4 – IP address version 4
     *         </p>
     *         </li>
     * @see IPAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type for cluster network configuration parameters. The following type is available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP_V4 – IP address version 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param ipAddressType
     *        The IP address type for cluster network configuration parameters. The following type is available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP_V4 – IP address version 4
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressType
     */

    public VpcConfiguration withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type for cluster network configuration parameters. The following type is available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP_V4 – IP address version 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param ipAddressType
     *        The IP address type for cluster network configuration parameters. The following type is available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP_V4 – IP address version 4
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IPAddressType
     */

    public VpcConfiguration withIpAddressType(IPAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfiguration == false)
            return false;
        VpcConfiguration other = (VpcConfiguration) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfiguration clone() {
        try {
            return (VpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.VpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
