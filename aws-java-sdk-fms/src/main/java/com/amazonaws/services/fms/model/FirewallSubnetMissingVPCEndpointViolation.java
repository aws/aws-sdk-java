/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The violation details for a firewall subnet's VPC endpoint that's deleted or missing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/FirewallSubnetMissingVPCEndpointViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallSubnetMissingVPCEndpointViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the firewall that this VPC endpoint is associated with.
     * </p>
     */
    private String firewallSubnetId;
    /**
     * <p>
     * The resource ID of the VPC associated with the deleted VPC subnet.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the Availability Zone of the deleted VPC subnet.
     * </p>
     */
    private String subnetAvailabilityZone;
    /**
     * <p>
     * The ID of the Availability Zone of the deleted VPC subnet.
     * </p>
     */
    private String subnetAvailabilityZoneId;

    /**
     * <p>
     * The ID of the firewall that this VPC endpoint is associated with.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall that this VPC endpoint is associated with.
     */

    public void setFirewallSubnetId(String firewallSubnetId) {
        this.firewallSubnetId = firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall that this VPC endpoint is associated with.
     * </p>
     * 
     * @return The ID of the firewall that this VPC endpoint is associated with.
     */

    public String getFirewallSubnetId() {
        return this.firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall that this VPC endpoint is associated with.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall that this VPC endpoint is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetMissingVPCEndpointViolation withFirewallSubnetId(String firewallSubnetId) {
        setFirewallSubnetId(firewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with the deleted VPC subnet.
     * </p>
     * 
     * @param vpcId
     *        The resource ID of the VPC associated with the deleted VPC subnet.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with the deleted VPC subnet.
     * </p>
     * 
     * @return The resource ID of the VPC associated with the deleted VPC subnet.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The resource ID of the VPC associated with the deleted VPC subnet.
     * </p>
     * 
     * @param vpcId
     *        The resource ID of the VPC associated with the deleted VPC subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetMissingVPCEndpointViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The name of the Availability Zone of the deleted VPC subnet.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @return The name of the Availability Zone of the deleted VPC subnet.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The name of the Availability Zone of the deleted VPC subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetMissingVPCEndpointViolation withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The ID of the Availability Zone of the deleted VPC subnet.
     */

    public void setSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        this.subnetAvailabilityZoneId = subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @return The ID of the Availability Zone of the deleted VPC subnet.
     */

    public String getSubnetAvailabilityZoneId() {
        return this.subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone of the deleted VPC subnet.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The ID of the Availability Zone of the deleted VPC subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetMissingVPCEndpointViolation withSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        setSubnetAvailabilityZoneId(subnetAvailabilityZoneId);
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
        if (getFirewallSubnetId() != null)
            sb.append("FirewallSubnetId: ").append(getFirewallSubnetId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetAvailabilityZone() != null)
            sb.append("SubnetAvailabilityZone: ").append(getSubnetAvailabilityZone()).append(",");
        if (getSubnetAvailabilityZoneId() != null)
            sb.append("SubnetAvailabilityZoneId: ").append(getSubnetAvailabilityZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallSubnetMissingVPCEndpointViolation == false)
            return false;
        FirewallSubnetMissingVPCEndpointViolation other = (FirewallSubnetMissingVPCEndpointViolation) obj;
        if (other.getFirewallSubnetId() == null ^ this.getFirewallSubnetId() == null)
            return false;
        if (other.getFirewallSubnetId() != null && other.getFirewallSubnetId().equals(this.getFirewallSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null)
            return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false)
            return false;
        if (other.getSubnetAvailabilityZoneId() == null ^ this.getSubnetAvailabilityZoneId() == null)
            return false;
        if (other.getSubnetAvailabilityZoneId() != null && other.getSubnetAvailabilityZoneId().equals(this.getSubnetAvailabilityZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallSubnetId() == null) ? 0 : getFirewallSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSubnetAvailabilityZoneId() == null) ? 0 : getSubnetAvailabilityZoneId().hashCode());
        return hashCode;
    }

    @Override
    public FirewallSubnetMissingVPCEndpointViolation clone() {
        try {
            return (FirewallSubnetMissingVPCEndpointViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.FirewallSubnetMissingVPCEndpointViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
