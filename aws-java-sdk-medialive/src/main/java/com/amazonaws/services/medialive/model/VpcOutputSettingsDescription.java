/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The properties for a private VPC Output
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VpcOutputSettingsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcOutputSettingsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first subnet
     * in the list of subnets. The second Availability Zone applies to the second subnet.
     */
    private java.util.List<String> availabilityZones;
    /**
     * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     */
    private java.util.List<String> networkInterfaceIds;
    /**
     * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     */
    private java.util.List<String> securityGroupIds;
    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     */
    private java.util.List<String> subnetIds;

    /**
     * The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first subnet
     * in the list of subnets. The second Availability Zone applies to the second subnet.
     * 
     * @return The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the
     *         first subnet in the list of subnets. The second Availability Zone applies to the second subnet.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first subnet
     * in the list of subnets. The second Availability Zone applies to the second subnet.
     * 
     * @param availabilityZones
     *        The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first
     *        subnet in the list of subnets. The second Availability Zone applies to the second subnet.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first subnet
     * in the list of subnets. The second Availability Zone applies to the second subnet.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first
     *        subnet in the list of subnets. The second Availability Zone applies to the second subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first subnet
     * in the list of subnets. The second Availability Zone applies to the second subnet.
     * 
     * @param availabilityZones
     *        The Availability Zones where the vpc subnets are located. The first Availability Zone applies to the first
     *        subnet in the list of subnets. The second Availability Zone applies to the second subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * 
     * @return A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * 
     * @param networkInterfaceIds
     *        A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * 
     * @param networkInterfaceIds
     *        A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * 
     * @return A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * 
     * @param securityGroupIds
     *        A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * 
     * @param securityGroupIds
     *        A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @return A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *         availability zones (AZ).
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     * availability zones (AZ).
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs from the same VPC. If STANDARD channel, subnet IDs must be mapped to two unique
     *        availability zones (AZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOutputSettingsDescription withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcOutputSettingsDescription == false)
            return false;
        VpcOutputSettingsDescription other = (VpcOutputSettingsDescription) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public VpcOutputSettingsDescription clone() {
        try {
            return (VpcOutputSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VpcOutputSettingsDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
