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
 * Contains details about the firewall subnet that violates the policy scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/FirewallSubnetIsOutOfScopeViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallSubnetIsOutOfScopeViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the firewall subnet that violates the policy scope.
     * </p>
     */
    private String firewallSubnetId;
    /**
     * <p>
     * The VPC ID of the firewall subnet that violates the policy scope.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The Availability Zone of the firewall subnet that violates the policy scope.
     * </p>
     */
    private String subnetAvailabilityZone;
    /**
     * <p>
     * The Availability Zone ID of the firewall subnet that violates the policy scope.
     * </p>
     */
    private String subnetAvailabilityZoneId;
    /**
     * <p>
     * The VPC endpoint ID of the firewall subnet that violates the policy scope.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall subnet that violates the policy scope.
     */

    public void setFirewallSubnetId(String firewallSubnetId) {
        this.firewallSubnetId = firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @return The ID of the firewall subnet that violates the policy scope.
     */

    public String getFirewallSubnetId() {
        return this.firewallSubnetId;
    }

    /**
     * <p>
     * The ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param firewallSubnetId
     *        The ID of the firewall subnet that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetIsOutOfScopeViolation withFirewallSubnetId(String firewallSubnetId) {
        setFirewallSubnetId(firewallSubnetId);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the firewall subnet that violates the policy scope.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @return The VPC ID of the firewall subnet that violates the policy scope.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the firewall subnet that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetIsOutOfScopeViolation withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone of the firewall subnet that violates the policy scope.
     */

    public void setSubnetAvailabilityZone(String subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @return The Availability Zone of the firewall subnet that violates the policy scope.
     */

    public String getSubnetAvailabilityZone() {
        return this.subnetAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param subnetAvailabilityZone
     *        The Availability Zone of the firewall subnet that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetIsOutOfScopeViolation withSubnetAvailabilityZone(String subnetAvailabilityZone) {
        setSubnetAvailabilityZone(subnetAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The Availability Zone ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The Availability Zone ID of the firewall subnet that violates the policy scope.
     */

    public void setSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        this.subnetAvailabilityZoneId = subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @return The Availability Zone ID of the firewall subnet that violates the policy scope.
     */

    public String getSubnetAvailabilityZoneId() {
        return this.subnetAvailabilityZoneId;
    }

    /**
     * <p>
     * The Availability Zone ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param subnetAvailabilityZoneId
     *        The Availability Zone ID of the firewall subnet that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetIsOutOfScopeViolation withSubnetAvailabilityZoneId(String subnetAvailabilityZoneId) {
        setSubnetAvailabilityZoneId(subnetAvailabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The VPC endpoint ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param vpcEndpointId
     *        The VPC endpoint ID of the firewall subnet that violates the policy scope.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The VPC endpoint ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @return The VPC endpoint ID of the firewall subnet that violates the policy scope.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The VPC endpoint ID of the firewall subnet that violates the policy scope.
     * </p>
     * 
     * @param vpcEndpointId
     *        The VPC endpoint ID of the firewall subnet that violates the policy scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallSubnetIsOutOfScopeViolation withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
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
            sb.append("SubnetAvailabilityZoneId: ").append(getSubnetAvailabilityZoneId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallSubnetIsOutOfScopeViolation == false)
            return false;
        FirewallSubnetIsOutOfScopeViolation other = (FirewallSubnetIsOutOfScopeViolation) obj;
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
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
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
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public FirewallSubnetIsOutOfScopeViolation clone() {
        try {
            return (FirewallSubnetIsOutOfScopeViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.FirewallSubnetIsOutOfScopeViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
