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
     * Violation detail for security groups.
     * </p>
     */
    private AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation;
    /**
     * <p>
     * Violation detail for a network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation;
    /**
     * <p>
     * Violation detail for an EC2 instance.
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
     * Violation detail for the subnet for which internet traffic hasn't been inspected.
     * </p>
     */
    private NetworkFirewallInternetTrafficNotInspectedViolation networkFirewallInternetTrafficNotInspectedViolation;
    /**
     * <p>
     * The route configuration is invalid.
     * </p>
     */
    private NetworkFirewallInvalidRouteConfigurationViolation networkFirewallInvalidRouteConfigurationViolation;

    private NetworkFirewallBlackHoleRouteDetectedViolation networkFirewallBlackHoleRouteDetectedViolation;
    /**
     * <p>
     * There's an unexpected firewall route.
     * </p>
     */
    private NetworkFirewallUnexpectedFirewallRoutesViolation networkFirewallUnexpectedFirewallRoutesViolation;
    /**
     * <p>
     * There's an unexpected gateway route.
     * </p>
     */
    private NetworkFirewallUnexpectedGatewayRoutesViolation networkFirewallUnexpectedGatewayRoutesViolation;
    /**
     * <p>
     * Expected routes are missing from Network Firewall.
     * </p>
     */
    private NetworkFirewallMissingExpectedRoutesViolation networkFirewallMissingExpectedRoutesViolation;
    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC has the same priority as a rule group that's already associated.
     * </p>
     */
    private DnsRuleGroupPriorityConflictViolation dnsRuleGroupPriorityConflictViolation;
    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC is already associated with the VPC and can't be associated again.
     * </p>
     */
    private DnsDuplicateRuleGroupViolation dnsDuplicateRuleGroupViolation;
    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated DNS
     * Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     * </p>
     */
    private DnsRuleGroupLimitExceededViolation dnsRuleGroupLimitExceededViolation;
    /**
     * <p>
     * A list of possible remediation action lists. Each individual possible remediation action is a list of individual
     * remediation actions.
     * </p>
     */
    private PossibleRemediationActions possibleRemediationActions;

    /**
     * <p>
     * Violation detail for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation detail for security groups.
     */

    public void setAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        this.awsVPCSecurityGroupViolation = awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation detail for security groups.
     * </p>
     * 
     * @return Violation detail for security groups.
     */

    public AwsVPCSecurityGroupViolation getAwsVPCSecurityGroupViolation() {
        return this.awsVPCSecurityGroupViolation;
    }

    /**
     * <p>
     * Violation detail for security groups.
     * </p>
     * 
     * @param awsVPCSecurityGroupViolation
     *        Violation detail for security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolation awsVPCSecurityGroupViolation) {
        setAwsVPCSecurityGroupViolation(awsVPCSecurityGroupViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for a network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation detail for a network interface.
     */

    public void setAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        this.awsEc2NetworkInterfaceViolation = awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation detail for a network interface.
     * </p>
     * 
     * @return Violation detail for a network interface.
     */

    public AwsEc2NetworkInterfaceViolation getAwsEc2NetworkInterfaceViolation() {
        return this.awsEc2NetworkInterfaceViolation;
    }

    /**
     * <p>
     * Violation detail for a network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterfaceViolation
     *        Violation detail for a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolation awsEc2NetworkInterfaceViolation) {
        setAwsEc2NetworkInterfaceViolation(awsEc2NetworkInterfaceViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation detail for an EC2 instance.
     */

    public void setAwsEc2InstanceViolation(AwsEc2InstanceViolation awsEc2InstanceViolation) {
        this.awsEc2InstanceViolation = awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation detail for an EC2 instance.
     * </p>
     * 
     * @return Violation detail for an EC2 instance.
     */

    public AwsEc2InstanceViolation getAwsEc2InstanceViolation() {
        return this.awsEc2InstanceViolation;
    }

    /**
     * <p>
     * Violation detail for an EC2 instance.
     * </p>
     * 
     * @param awsEc2InstanceViolation
     *        Violation detail for an EC2 instance.
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
     * <p>
     * Violation detail for the subnet for which internet traffic hasn't been inspected.
     * </p>
     * 
     * @param networkFirewallInternetTrafficNotInspectedViolation
     *        Violation detail for the subnet for which internet traffic hasn't been inspected.
     */

    public void setNetworkFirewallInternetTrafficNotInspectedViolation(
            NetworkFirewallInternetTrafficNotInspectedViolation networkFirewallInternetTrafficNotInspectedViolation) {
        this.networkFirewallInternetTrafficNotInspectedViolation = networkFirewallInternetTrafficNotInspectedViolation;
    }

    /**
     * <p>
     * Violation detail for the subnet for which internet traffic hasn't been inspected.
     * </p>
     * 
     * @return Violation detail for the subnet for which internet traffic hasn't been inspected.
     */

    public NetworkFirewallInternetTrafficNotInspectedViolation getNetworkFirewallInternetTrafficNotInspectedViolation() {
        return this.networkFirewallInternetTrafficNotInspectedViolation;
    }

    /**
     * <p>
     * Violation detail for the subnet for which internet traffic hasn't been inspected.
     * </p>
     * 
     * @param networkFirewallInternetTrafficNotInspectedViolation
     *        Violation detail for the subnet for which internet traffic hasn't been inspected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallInternetTrafficNotInspectedViolation(
            NetworkFirewallInternetTrafficNotInspectedViolation networkFirewallInternetTrafficNotInspectedViolation) {
        setNetworkFirewallInternetTrafficNotInspectedViolation(networkFirewallInternetTrafficNotInspectedViolation);
        return this;
    }

    /**
     * <p>
     * The route configuration is invalid.
     * </p>
     * 
     * @param networkFirewallInvalidRouteConfigurationViolation
     *        The route configuration is invalid.
     */

    public void setNetworkFirewallInvalidRouteConfigurationViolation(
            NetworkFirewallInvalidRouteConfigurationViolation networkFirewallInvalidRouteConfigurationViolation) {
        this.networkFirewallInvalidRouteConfigurationViolation = networkFirewallInvalidRouteConfigurationViolation;
    }

    /**
     * <p>
     * The route configuration is invalid.
     * </p>
     * 
     * @return The route configuration is invalid.
     */

    public NetworkFirewallInvalidRouteConfigurationViolation getNetworkFirewallInvalidRouteConfigurationViolation() {
        return this.networkFirewallInvalidRouteConfigurationViolation;
    }

    /**
     * <p>
     * The route configuration is invalid.
     * </p>
     * 
     * @param networkFirewallInvalidRouteConfigurationViolation
     *        The route configuration is invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallInvalidRouteConfigurationViolation(
            NetworkFirewallInvalidRouteConfigurationViolation networkFirewallInvalidRouteConfigurationViolation) {
        setNetworkFirewallInvalidRouteConfigurationViolation(networkFirewallInvalidRouteConfigurationViolation);
        return this;
    }

    /**
     * @param networkFirewallBlackHoleRouteDetectedViolation
     */

    public void setNetworkFirewallBlackHoleRouteDetectedViolation(NetworkFirewallBlackHoleRouteDetectedViolation networkFirewallBlackHoleRouteDetectedViolation) {
        this.networkFirewallBlackHoleRouteDetectedViolation = networkFirewallBlackHoleRouteDetectedViolation;
    }

    /**
     * @return
     */

    public NetworkFirewallBlackHoleRouteDetectedViolation getNetworkFirewallBlackHoleRouteDetectedViolation() {
        return this.networkFirewallBlackHoleRouteDetectedViolation;
    }

    /**
     * @param networkFirewallBlackHoleRouteDetectedViolation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallBlackHoleRouteDetectedViolation(
            NetworkFirewallBlackHoleRouteDetectedViolation networkFirewallBlackHoleRouteDetectedViolation) {
        setNetworkFirewallBlackHoleRouteDetectedViolation(networkFirewallBlackHoleRouteDetectedViolation);
        return this;
    }

    /**
     * <p>
     * There's an unexpected firewall route.
     * </p>
     * 
     * @param networkFirewallUnexpectedFirewallRoutesViolation
     *        There's an unexpected firewall route.
     */

    public void setNetworkFirewallUnexpectedFirewallRoutesViolation(
            NetworkFirewallUnexpectedFirewallRoutesViolation networkFirewallUnexpectedFirewallRoutesViolation) {
        this.networkFirewallUnexpectedFirewallRoutesViolation = networkFirewallUnexpectedFirewallRoutesViolation;
    }

    /**
     * <p>
     * There's an unexpected firewall route.
     * </p>
     * 
     * @return There's an unexpected firewall route.
     */

    public NetworkFirewallUnexpectedFirewallRoutesViolation getNetworkFirewallUnexpectedFirewallRoutesViolation() {
        return this.networkFirewallUnexpectedFirewallRoutesViolation;
    }

    /**
     * <p>
     * There's an unexpected firewall route.
     * </p>
     * 
     * @param networkFirewallUnexpectedFirewallRoutesViolation
     *        There's an unexpected firewall route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallUnexpectedFirewallRoutesViolation(
            NetworkFirewallUnexpectedFirewallRoutesViolation networkFirewallUnexpectedFirewallRoutesViolation) {
        setNetworkFirewallUnexpectedFirewallRoutesViolation(networkFirewallUnexpectedFirewallRoutesViolation);
        return this;
    }

    /**
     * <p>
     * There's an unexpected gateway route.
     * </p>
     * 
     * @param networkFirewallUnexpectedGatewayRoutesViolation
     *        There's an unexpected gateway route.
     */

    public void setNetworkFirewallUnexpectedGatewayRoutesViolation(
            NetworkFirewallUnexpectedGatewayRoutesViolation networkFirewallUnexpectedGatewayRoutesViolation) {
        this.networkFirewallUnexpectedGatewayRoutesViolation = networkFirewallUnexpectedGatewayRoutesViolation;
    }

    /**
     * <p>
     * There's an unexpected gateway route.
     * </p>
     * 
     * @return There's an unexpected gateway route.
     */

    public NetworkFirewallUnexpectedGatewayRoutesViolation getNetworkFirewallUnexpectedGatewayRoutesViolation() {
        return this.networkFirewallUnexpectedGatewayRoutesViolation;
    }

    /**
     * <p>
     * There's an unexpected gateway route.
     * </p>
     * 
     * @param networkFirewallUnexpectedGatewayRoutesViolation
     *        There's an unexpected gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallUnexpectedGatewayRoutesViolation(
            NetworkFirewallUnexpectedGatewayRoutesViolation networkFirewallUnexpectedGatewayRoutesViolation) {
        setNetworkFirewallUnexpectedGatewayRoutesViolation(networkFirewallUnexpectedGatewayRoutesViolation);
        return this;
    }

    /**
     * <p>
     * Expected routes are missing from Network Firewall.
     * </p>
     * 
     * @param networkFirewallMissingExpectedRoutesViolation
     *        Expected routes are missing from Network Firewall.
     */

    public void setNetworkFirewallMissingExpectedRoutesViolation(NetworkFirewallMissingExpectedRoutesViolation networkFirewallMissingExpectedRoutesViolation) {
        this.networkFirewallMissingExpectedRoutesViolation = networkFirewallMissingExpectedRoutesViolation;
    }

    /**
     * <p>
     * Expected routes are missing from Network Firewall.
     * </p>
     * 
     * @return Expected routes are missing from Network Firewall.
     */

    public NetworkFirewallMissingExpectedRoutesViolation getNetworkFirewallMissingExpectedRoutesViolation() {
        return this.networkFirewallMissingExpectedRoutesViolation;
    }

    /**
     * <p>
     * Expected routes are missing from Network Firewall.
     * </p>
     * 
     * @param networkFirewallMissingExpectedRoutesViolation
     *        Expected routes are missing from Network Firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withNetworkFirewallMissingExpectedRoutesViolation(
            NetworkFirewallMissingExpectedRoutesViolation networkFirewallMissingExpectedRoutesViolation) {
        setNetworkFirewallMissingExpectedRoutesViolation(networkFirewallMissingExpectedRoutesViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC has the same priority as a rule group that's already associated.
     * </p>
     * 
     * @param dnsRuleGroupPriorityConflictViolation
     *        Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     *        associate with a VPC has the same priority as a rule group that's already associated.
     */

    public void setDnsRuleGroupPriorityConflictViolation(DnsRuleGroupPriorityConflictViolation dnsRuleGroupPriorityConflictViolation) {
        this.dnsRuleGroupPriorityConflictViolation = dnsRuleGroupPriorityConflictViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC has the same priority as a rule group that's already associated.
     * </p>
     * 
     * @return Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried
     *         to associate with a VPC has the same priority as a rule group that's already associated.
     */

    public DnsRuleGroupPriorityConflictViolation getDnsRuleGroupPriorityConflictViolation() {
        return this.dnsRuleGroupPriorityConflictViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC has the same priority as a rule group that's already associated.
     * </p>
     * 
     * @param dnsRuleGroupPriorityConflictViolation
     *        Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     *        associate with a VPC has the same priority as a rule group that's already associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withDnsRuleGroupPriorityConflictViolation(DnsRuleGroupPriorityConflictViolation dnsRuleGroupPriorityConflictViolation) {
        setDnsRuleGroupPriorityConflictViolation(dnsRuleGroupPriorityConflictViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC is already associated with the VPC and can't be associated again.
     * </p>
     * 
     * @param dnsDuplicateRuleGroupViolation
     *        Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     *        associate with a VPC is already associated with the VPC and can't be associated again.
     */

    public void setDnsDuplicateRuleGroupViolation(DnsDuplicateRuleGroupViolation dnsDuplicateRuleGroupViolation) {
        this.dnsDuplicateRuleGroupViolation = dnsDuplicateRuleGroupViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC is already associated with the VPC and can't be associated again.
     * </p>
     * 
     * @return Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried
     *         to associate with a VPC is already associated with the VPC and can't be associated again.
     */

    public DnsDuplicateRuleGroupViolation getDnsDuplicateRuleGroupViolation() {
        return this.dnsDuplicateRuleGroupViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     * associate with a VPC is already associated with the VPC and can't be associated again.
     * </p>
     * 
     * @param dnsDuplicateRuleGroupViolation
     *        Violation detail for a DNS Firewall policy that indicates that a rule group that Firewall Manager tried to
     *        associate with a VPC is already associated with the VPC and can't be associated again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withDnsDuplicateRuleGroupViolation(DnsDuplicateRuleGroupViolation dnsDuplicateRuleGroupViolation) {
        setDnsDuplicateRuleGroupViolation(dnsDuplicateRuleGroupViolation);
        return this;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated DNS
     * Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     * </p>
     * 
     * @param dnsRuleGroupLimitExceededViolation
     *        Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated
     *        DNS Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     */

    public void setDnsRuleGroupLimitExceededViolation(DnsRuleGroupLimitExceededViolation dnsRuleGroupLimitExceededViolation) {
        this.dnsRuleGroupLimitExceededViolation = dnsRuleGroupLimitExceededViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated DNS
     * Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     * </p>
     * 
     * @return Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated
     *         DNS Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     */

    public DnsRuleGroupLimitExceededViolation getDnsRuleGroupLimitExceededViolation() {
        return this.dnsRuleGroupLimitExceededViolation;
    }

    /**
     * <p>
     * Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated DNS
     * Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     * </p>
     * 
     * @param dnsRuleGroupLimitExceededViolation
     *        Violation detail for a DNS Firewall policy that indicates that the VPC reached the limit for associated
     *        DNS Firewall rule groups. Firewall Manager tried to associate another rule group with the VPC and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withDnsRuleGroupLimitExceededViolation(DnsRuleGroupLimitExceededViolation dnsRuleGroupLimitExceededViolation) {
        setDnsRuleGroupLimitExceededViolation(dnsRuleGroupLimitExceededViolation);
        return this;
    }

    /**
     * <p>
     * A list of possible remediation action lists. Each individual possible remediation action is a list of individual
     * remediation actions.
     * </p>
     * 
     * @param possibleRemediationActions
     *        A list of possible remediation action lists. Each individual possible remediation action is a list of
     *        individual remediation actions.
     */

    public void setPossibleRemediationActions(PossibleRemediationActions possibleRemediationActions) {
        this.possibleRemediationActions = possibleRemediationActions;
    }

    /**
     * <p>
     * A list of possible remediation action lists. Each individual possible remediation action is a list of individual
     * remediation actions.
     * </p>
     * 
     * @return A list of possible remediation action lists. Each individual possible remediation action is a list of
     *         individual remediation actions.
     */

    public PossibleRemediationActions getPossibleRemediationActions() {
        return this.possibleRemediationActions;
    }

    /**
     * <p>
     * A list of possible remediation action lists. Each individual possible remediation action is a list of individual
     * remediation actions.
     * </p>
     * 
     * @param possibleRemediationActions
     *        A list of possible remediation action lists. Each individual possible remediation action is a list of
     *        individual remediation actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceViolation withPossibleRemediationActions(PossibleRemediationActions possibleRemediationActions) {
        setPossibleRemediationActions(possibleRemediationActions);
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
            sb.append("NetworkFirewallPolicyModifiedViolation: ").append(getNetworkFirewallPolicyModifiedViolation()).append(",");
        if (getNetworkFirewallInternetTrafficNotInspectedViolation() != null)
            sb.append("NetworkFirewallInternetTrafficNotInspectedViolation: ").append(getNetworkFirewallInternetTrafficNotInspectedViolation()).append(",");
        if (getNetworkFirewallInvalidRouteConfigurationViolation() != null)
            sb.append("NetworkFirewallInvalidRouteConfigurationViolation: ").append(getNetworkFirewallInvalidRouteConfigurationViolation()).append(",");
        if (getNetworkFirewallBlackHoleRouteDetectedViolation() != null)
            sb.append("NetworkFirewallBlackHoleRouteDetectedViolation: ").append(getNetworkFirewallBlackHoleRouteDetectedViolation()).append(",");
        if (getNetworkFirewallUnexpectedFirewallRoutesViolation() != null)
            sb.append("NetworkFirewallUnexpectedFirewallRoutesViolation: ").append(getNetworkFirewallUnexpectedFirewallRoutesViolation()).append(",");
        if (getNetworkFirewallUnexpectedGatewayRoutesViolation() != null)
            sb.append("NetworkFirewallUnexpectedGatewayRoutesViolation: ").append(getNetworkFirewallUnexpectedGatewayRoutesViolation()).append(",");
        if (getNetworkFirewallMissingExpectedRoutesViolation() != null)
            sb.append("NetworkFirewallMissingExpectedRoutesViolation: ").append(getNetworkFirewallMissingExpectedRoutesViolation()).append(",");
        if (getDnsRuleGroupPriorityConflictViolation() != null)
            sb.append("DnsRuleGroupPriorityConflictViolation: ").append(getDnsRuleGroupPriorityConflictViolation()).append(",");
        if (getDnsDuplicateRuleGroupViolation() != null)
            sb.append("DnsDuplicateRuleGroupViolation: ").append(getDnsDuplicateRuleGroupViolation()).append(",");
        if (getDnsRuleGroupLimitExceededViolation() != null)
            sb.append("DnsRuleGroupLimitExceededViolation: ").append(getDnsRuleGroupLimitExceededViolation()).append(",");
        if (getPossibleRemediationActions() != null)
            sb.append("PossibleRemediationActions: ").append(getPossibleRemediationActions());
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
        if (other.getNetworkFirewallInternetTrafficNotInspectedViolation() == null ^ this.getNetworkFirewallInternetTrafficNotInspectedViolation() == null)
            return false;
        if (other.getNetworkFirewallInternetTrafficNotInspectedViolation() != null
                && other.getNetworkFirewallInternetTrafficNotInspectedViolation().equals(this.getNetworkFirewallInternetTrafficNotInspectedViolation()) == false)
            return false;
        if (other.getNetworkFirewallInvalidRouteConfigurationViolation() == null ^ this.getNetworkFirewallInvalidRouteConfigurationViolation() == null)
            return false;
        if (other.getNetworkFirewallInvalidRouteConfigurationViolation() != null
                && other.getNetworkFirewallInvalidRouteConfigurationViolation().equals(this.getNetworkFirewallInvalidRouteConfigurationViolation()) == false)
            return false;
        if (other.getNetworkFirewallBlackHoleRouteDetectedViolation() == null ^ this.getNetworkFirewallBlackHoleRouteDetectedViolation() == null)
            return false;
        if (other.getNetworkFirewallBlackHoleRouteDetectedViolation() != null
                && other.getNetworkFirewallBlackHoleRouteDetectedViolation().equals(this.getNetworkFirewallBlackHoleRouteDetectedViolation()) == false)
            return false;
        if (other.getNetworkFirewallUnexpectedFirewallRoutesViolation() == null ^ this.getNetworkFirewallUnexpectedFirewallRoutesViolation() == null)
            return false;
        if (other.getNetworkFirewallUnexpectedFirewallRoutesViolation() != null
                && other.getNetworkFirewallUnexpectedFirewallRoutesViolation().equals(this.getNetworkFirewallUnexpectedFirewallRoutesViolation()) == false)
            return false;
        if (other.getNetworkFirewallUnexpectedGatewayRoutesViolation() == null ^ this.getNetworkFirewallUnexpectedGatewayRoutesViolation() == null)
            return false;
        if (other.getNetworkFirewallUnexpectedGatewayRoutesViolation() != null
                && other.getNetworkFirewallUnexpectedGatewayRoutesViolation().equals(this.getNetworkFirewallUnexpectedGatewayRoutesViolation()) == false)
            return false;
        if (other.getNetworkFirewallMissingExpectedRoutesViolation() == null ^ this.getNetworkFirewallMissingExpectedRoutesViolation() == null)
            return false;
        if (other.getNetworkFirewallMissingExpectedRoutesViolation() != null
                && other.getNetworkFirewallMissingExpectedRoutesViolation().equals(this.getNetworkFirewallMissingExpectedRoutesViolation()) == false)
            return false;
        if (other.getDnsRuleGroupPriorityConflictViolation() == null ^ this.getDnsRuleGroupPriorityConflictViolation() == null)
            return false;
        if (other.getDnsRuleGroupPriorityConflictViolation() != null
                && other.getDnsRuleGroupPriorityConflictViolation().equals(this.getDnsRuleGroupPriorityConflictViolation()) == false)
            return false;
        if (other.getDnsDuplicateRuleGroupViolation() == null ^ this.getDnsDuplicateRuleGroupViolation() == null)
            return false;
        if (other.getDnsDuplicateRuleGroupViolation() != null
                && other.getDnsDuplicateRuleGroupViolation().equals(this.getDnsDuplicateRuleGroupViolation()) == false)
            return false;
        if (other.getDnsRuleGroupLimitExceededViolation() == null ^ this.getDnsRuleGroupLimitExceededViolation() == null)
            return false;
        if (other.getDnsRuleGroupLimitExceededViolation() != null
                && other.getDnsRuleGroupLimitExceededViolation().equals(this.getDnsRuleGroupLimitExceededViolation()) == false)
            return false;
        if (other.getPossibleRemediationActions() == null ^ this.getPossibleRemediationActions() == null)
            return false;
        if (other.getPossibleRemediationActions() != null && other.getPossibleRemediationActions().equals(this.getPossibleRemediationActions()) == false)
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
        hashCode = prime
                * hashCode
                + ((getNetworkFirewallInternetTrafficNotInspectedViolation() == null) ? 0 : getNetworkFirewallInternetTrafficNotInspectedViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallInvalidRouteConfigurationViolation() == null) ? 0 : getNetworkFirewallInvalidRouteConfigurationViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallBlackHoleRouteDetectedViolation() == null) ? 0 : getNetworkFirewallBlackHoleRouteDetectedViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallUnexpectedFirewallRoutesViolation() == null) ? 0 : getNetworkFirewallUnexpectedFirewallRoutesViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallUnexpectedGatewayRoutesViolation() == null) ? 0 : getNetworkFirewallUnexpectedGatewayRoutesViolation().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkFirewallMissingExpectedRoutesViolation() == null) ? 0 : getNetworkFirewallMissingExpectedRoutesViolation().hashCode());
        hashCode = prime * hashCode + ((getDnsRuleGroupPriorityConflictViolation() == null) ? 0 : getDnsRuleGroupPriorityConflictViolation().hashCode());
        hashCode = prime * hashCode + ((getDnsDuplicateRuleGroupViolation() == null) ? 0 : getDnsDuplicateRuleGroupViolation().hashCode());
        hashCode = prime * hashCode + ((getDnsRuleGroupLimitExceededViolation() == null) ? 0 : getDnsRuleGroupLimitExceededViolation().hashCode());
        hashCode = prime * hashCode + ((getPossibleRemediationActions() == null) ? 0 : getPossibleRemediationActions().hashCode());
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
