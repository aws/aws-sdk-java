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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Violation detail based on resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ResourceViolation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     */
    private AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation;
    /**
     * <p>
     * Violation details for network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation;
    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     */
    private AwsEc2InstanceViolation awsEc2InstanceViolation;
    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed
     * firewall in its VPC.
     * </p>
     */
    private NetworkFirewallMissingFirewallViolation networkFirewallMissingFirewallViolation;
    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected
     * Firewall Manager managed subnet.
     * </p>
     */
    private NetworkFirewallMissingSubnetViolation networkFirewallMissingSubnetViolation;
    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected
     * Firewall Manager managed route table.
     * </p>
     */
    private NetworkFirewallMissingExpectedRTViolation networkFirewallMissingExpectedRTViolation;
    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account
     * has been modified in a way that makes it noncompliant. For example, the individual account owner might have
     * deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
     * </p>
     */
    private NetworkFirewallPolicyModifiedViolation networkFirewallPolicyModifiedViolation;

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation details for security groups.
     */

    public void setAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        this.awsVPCSecurityGroupViolation = awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @return Violation details for security groups.
     */

    public AwsVPCSecurityGroupViolation getAwsVPCSecurityGroupViolation() {
        return this.awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation details for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation details for security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        setAwsVPCSecurityGroupViolation(awsVPCSecurityGroupViolation);
        return this;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation details for network interface.
     */

    public void setAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        this.awsEc2NetworkInterfaceViolation = awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @return Violation details for network interface.
     */

    public AwsEc2NetworkInterfaceViolation getAwsEc2NetworkInterfaceViolation() {
        return this.awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation details for network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation details for network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        setAwsEc2NetworkInterfaceViolation(awsEc2NetworkInterfaceViolation);
        return this;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation details for an EC2 instance.
     */

    public void setAwsEc2InstanceViolation(AwsEc2InstanceViolation awsEc2InstanceViolation) {
        this.awsEc2InstanceViolation = awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @return Violation details for an EC2 instance.
     */

    public AwsEc2InstanceViolation getAwsEc2InstanceViolation() {
        return this.awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation details for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation details for an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsEc2InstanceViolation(AwsEc2InstanceViolation awsEc2InstanceViolation) {
        setAwsEc2InstanceViolation(awsEc2InstanceViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed
     * firewall in its VPC.
     * </p>
     * 
     * @param networkFirewallMissingFirewallViolation
     *        Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager
     *        managed firewall in its VPC.
     */

    public void setNetworkFirewallMissingFirewallViolation(NetworkFirewallMissingFirewallViolation networkFirewallMissingFirewallViolation) {
        this.networkFirewallMissingFirewallViolation = networkFirewallMissingFirewallViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed
     * firewall in its VPC.
     * </p>
     * 
     * @return Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager
     *         managed firewall in its VPC.
     */

    public NetworkFirewallMissingFirewallViolation getNetworkFirewallMissingFirewallViolation() {
        return this.networkFirewallMissingFirewallViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed
     * firewall in its VPC.
     * </p>
     * 
     * @param networkFirewallMissingFirewallViolation
     *        Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager
     *        managed firewall in its VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallMissingFirewallViolation(NetworkFirewallMissingFirewallViolation networkFirewallMissingFirewallViolation) {
        setNetworkFirewallMissingFirewallViolation(networkFirewallMissingFirewallViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected
     * Firewall Manager managed subnet.
     * </p>
     * 
     * @param networkFirewallMissingSubnetViolation
     *        Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the
     *        expected Firewall Manager managed subnet.
     */

    public void setNetworkFirewallMissingSubnetViolation(NetworkFirewallMissingSubnetViolation networkFirewallMissingSubnetViolation) {
        this.networkFirewallMissingSubnetViolation = networkFirewallMissingSubnetViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected
     * Firewall Manager managed subnet.
     * </p>
     * 
     * @return Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the
     *         expected Firewall Manager managed subnet.
     */

    public NetworkFirewallMissingSubnetViolation getNetworkFirewallMissingSubnetViolation() {
        return this.networkFirewallMissingSubnetViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected
     * Firewall Manager managed subnet.
     * </p>
     * 
     * @param networkFirewallMissingSubnetViolation
     *        Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the
     *        expected Firewall Manager managed subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallMissingSubnetViolation(NetworkFirewallMissingSubnetViolation networkFirewallMissingSubnetViolation) {
        setNetworkFirewallMissingSubnetViolation(networkFirewallMissingSubnetViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected
     * Firewall Manager managed route table.
     * </p>
     * 
     * @param networkFirewallMissingExpectedRTViolation
     *        Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the
     *        expected Firewall Manager managed route table.
     */

    public void setNetworkFirewallMissingExpectedRTViolation(NetworkFirewallMissingExpectedRTViolation networkFirewallMissingExpectedRTViolation) {
        this.networkFirewallMissingExpectedRTViolation = networkFirewallMissingExpectedRTViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected
     * Firewall Manager managed route table.
     * </p>
     * 
     * @return Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the
     *         expected Firewall Manager managed route table.
     */

    public NetworkFirewallMissingExpectedRTViolation getNetworkFirewallMissingExpectedRTViolation() {
        return this.networkFirewallMissingExpectedRTViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected
     * Firewall Manager managed route table.
     * </p>
     * 
     * @param networkFirewallMissingExpectedRTViolation
     *        Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the
     *        expected Firewall Manager managed route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallMissingExpectedRTViolation(NetworkFirewallMissingExpectedRTViolation networkFirewallMissingExpectedRTViolation) {
        setNetworkFirewallMissingExpectedRTViolation(networkFirewallMissingExpectedRTViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account
     * has been modified in a way that makes it noncompliant. For example, the individual account owner might have
     * deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
     * </p>
     * 
     * @param networkFirewallPolicyModifiedViolation
     *        Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual
     *        account has been modified in a way that makes it noncompliant. For example, the individual account owner
     *        might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy
     *        default action.
     */

    public void setNetworkFirewallPolicyModifiedViolation(NetworkFirewallPolicyModifiedViolation networkFirewallPolicyModifiedViolation) {
        this.networkFirewallPolicyModifiedViolation = networkFirewallPolicyModifiedViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account
     * has been modified in a way that makes it noncompliant. For example, the individual account owner might have
     * deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
     * </p>
     * 
     * @return Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual
     *         account has been modified in a way that makes it noncompliant. For example, the individual account owner
     *         might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy
     *         default action.
     */

    public NetworkFirewallPolicyModifiedViolation getNetworkFirewallPolicyModifiedViolation() {
        return this.networkFirewallPolicyModifiedViolation;
    }

    /**
     * <p>
     * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account
     * has been modified in a way that makes it noncompliant. For example, the individual account owner might have
     * deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
     * </p>
     * 
     * @param networkFirewallPolicyModifiedViolation
     *        Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual
     *        account has been modified in a way that makes it noncompliant. For example, the individual account owner
     *        might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy
     *        default action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallPolicyModifiedViolation(NetworkFirewallPolicyModifiedViolation networkFirewallPolicyModifiedViolation) {
        setNetworkFirewallPolicyModifiedViolation(networkFirewallPolicyModifiedViolation);
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
        if (getAwsVPCSecurityGroupViolation() != null)
            sb.append("AwsVPCSecurityGroupViolation: ").append(getAwsVPCSecurityGroupViolation()).append(",");
        if (getAwsEc2NetworkInterfaceViolation() != null)
            sb.append("AwsEc2NetworkInterfaceViolation: ").append(getAwsEc2NetworkInterfaceViolation()).append(",");
        if (getAwsEc2InstanceViolation() != null)
            sb.append("AwsEc2InstanceViolation: ").append(getAwsEc2InstanceViolation()).append(",");
        if (getNetworkFirewallMissingFirewallViolation() != null)
            sb.append("NetworkFirewallMissingFirewallViolation: ").append(getNetworkFirewallMissingFirewallViolation()).append(",");
        if (getNetworkFirewallMissingSubnetViolation() != null)
            sb.append("NetworkFirewallMissingSubnetViolation: ").append(getNetworkFirewallMissingSubnetViolation()).append(",");
        if (getNetworkFirewallMissingExpectedRTViolation() != null)
            sb.append("NetworkFirewallMissingExpectedRTViolation: ").append(getNetworkFirewallMissingExpectedRTViolation()).append(",");
        if (getNetworkFirewallPolicyModifiedViolation() != null)
            sb.append("NetworkFirewallPolicyModifiedViolation: ").append(getNetworkFirewallPolicyModifiedViolation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceViolation == false)
            return false;
        ResourceViolation other = (ResourceViolation) obj;
        if (other.getAwsVPCSecurityGroupViolation() == null ^ this.getAwsVPCSecurityGroupViolation() == null)
            return false;
        if (other.getAwsVPCSecurityGroupViolation() != null && other.getAwsVPCSecurityGroupViolation().equals(this.getAwsVPCSecurityGroupViolation()) == false)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolation() == null ^ this.getAwsEc2NetworkInterfaceViolation() == null)
            return false;
        if (other.getAwsEc2NetworkInterfaceViolation() != null
                && other.getAwsEc2NetworkInterfaceViolation().equals(this.getAwsEc2NetworkInterfaceViolation()) == false)
            return false;
        if (other.getAwsEc2InstanceViolation() == null ^ this.getAwsEc2InstanceViolation() == null)
            return false;
        if (other.getAwsEc2InstanceViolation() != null && other.getAwsEc2InstanceViolation().equals(this.getAwsEc2InstanceViolation()) == false)
            return false;
        if (other.getNetworkFirewallMissingFirewallViolation() == null ^ this.getNetworkFirewallMissingFirewallViolation() == null)
            return false;
        if (other.getNetworkFirewallMissingFirewallViolation() != null
                && other.getNetworkFirewallMissingFirewallViolation().equals(this.getNetworkFirewallMissingFirewallViolation()) == false)
            return false;
        if (other.getNetworkFirewallMissingSubnetViolation() == null ^ this.getNetworkFirewallMissingSubnetViolation() == null)
            return false;
        if (other.getNetworkFirewallMissingSubnetViolation() != null
                && other.getNetworkFirewallMissingSubnetViolation().equals(this.getNetworkFirewallMissingSubnetViolation()) == false)
            return false;
        if (other.getNetworkFirewallMissingExpectedRTViolation() == null ^ this.getNetworkFirewallMissingExpectedRTViolation() == null)
            return false;
        if (other.getNetworkFirewallMissingExpectedRTViolation() != null
                && other.getNetworkFirewallMissingExpectedRTViolation().equals(this.getNetworkFirewallMissingExpectedRTViolation()) == false)
            return false;
        if (other.getNetworkFirewallPolicyModifiedViolation() == null ^ this.getNetworkFirewallPolicyModifiedViolation() == null)
            return false;
        if (other.getNetworkFirewallPolicyModifiedViolation() != null
                && other.getNetworkFirewallPolicyModifiedViolation().equals(this.getNetworkFirewallPolicyModifiedViolation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsVPCSecurityGroupViolation() == null) ? 0 : getAwsVPCSecurityGroupViolation().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkInterfaceViolation() == null) ? 0 : getAwsEc2NetworkInterfaceViolation().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2InstanceViolation() == null) ? 0 : getAwsEc2InstanceViolation().hashCode());
        hashCode = prime * hashCode + ((getNetworkFirewallMissingFirewallViolation() == null) ? 0 : getNetworkFirewallMissingFirewallViolation().hashCode());
        hashCode = prime * hashCode + ((getNetworkFirewallMissingSubnetViolation() == null) ? 0 : getNetworkFirewallMissingSubnetViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallMissingExpectedRTViolation() == null) ? 0 : getNetworkFirewallMissingExpectedRTViolation().hashCode());
        hashCode = prime * hashCode + ((getNetworkFirewallPolicyModifiedViolation() == null) ? 0 : getNetworkFirewallPolicyModifiedViolation().hashCode());
        return hashCode;
    }

    @Override
    public ResourceViolation clone() {
        try {
            return (ResourceViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ResourceViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
