/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon EC2.
 */
public enum EC2Actions implements Action {
    /** Represents any action executed on Amazon EC2. */
    AllEC2Actions("EC2:*"),

    /** Action for the ActivateLicense operation. */
    ActivateLicense("EC2:ActivateLicense"),

    /** Action for the AllocateAddress operation. */
    AllocateAddress("EC2:AllocateAddress"),

    /** Action for the AssociateAddress operation. */
    AssociateAddress("EC2:AssociateAddress"),

    /** Action for the AssociateDhcpOptions operation. */
    AssociateDhcpOptions("EC2:AssociateDhcpOptions"),

    /** Action for the AssociateRouteTable operation. */
    AssociateRouteTable("EC2:AssociateRouteTable"),

    /** Action for the AttachInternetGateway operation. */
    AttachInternetGateway("EC2:AttachInternetGateway"),

    /** Action for the AttachNetworkInterface operation. */
    AttachNetworkInterface("EC2:AttachNetworkInterface"),

    /** Action for the AttachVolume operation. */
    AttachVolume("EC2:AttachVolume"),

    /** Action for the AttachVpnGateway operation. */
    AttachVpnGateway("EC2:AttachVpnGateway"),

    /** Action for the AuthorizeSecurityGroupEgress operation. */
    AuthorizeSecurityGroupEgress("EC2:AuthorizeSecurityGroupEgress"),

    /** Action for the AuthorizeSecurityGroupIngress operation. */
    AuthorizeSecurityGroupIngress("EC2:AuthorizeSecurityGroupIngress"),

    /** Action for the BundleInstance operation. */
    BundleInstance("EC2:BundleInstance"),

    /** Action for the CancelBundleTask operation. */
    CancelBundleTask("EC2:CancelBundleTask"),

    /** Action for the CancelConversionTask operation. */
    CancelConversionTask("EC2:CancelConversionTask"),

    /** Action for the CancelExportTask operation. */
    CancelExportTask("EC2:CancelExportTask"),

    /** Action for the CancelSpotInstanceRequests operation. */
    CancelSpotInstanceRequests("EC2:CancelSpotInstanceRequests"),

    /** Action for the ConfirmProductInstance operation. */
    ConfirmProductInstance("EC2:ConfirmProductInstance"),

    /** Action for the CopySnapshot operation. */
    CopySnapshot("EC2:CopySnapshot"),

    /** Action for the CreateCustomerGateway operation. */
    CreateCustomerGateway("EC2:CreateCustomerGateway"),

    /** Action for the CreateDhcpOptions operation. */
    CreateDhcpOptions("EC2:CreateDhcpOptions"),

    /** Action for the CreateImage operation. */
    CreateImage("EC2:CreateImage"),

    /** Action for the CreateInstanceExportTask operation. */
    CreateInstanceExportTask("EC2:CreateInstanceExportTask"),

    /** Action for the CreateInternetGateway operation. */
    CreateInternetGateway("EC2:CreateInternetGateway"),

    /** Action for the CreateKeyPair operation. */
    CreateKeyPair("EC2:CreateKeyPair"),

    /** Action for the CreateNetworkAcl operation. */
    CreateNetworkAcl("EC2:CreateNetworkAcl"),

    /** Action for the CreateNetworkAclEntry operation. */
    CreateNetworkAclEntry("EC2:CreateNetworkAclEntry"),

    /** Action for the CreateNetworkInterface operation. */
    CreateNetworkInterface("EC2:CreateNetworkInterface"),

    /** Action for the CreatePlacementGroup operation. */
    CreatePlacementGroup("EC2:CreatePlacementGroup"),

    /** Action for the CreateRoute operation. */
    CreateRoute("EC2:CreateRoute"),

    /** Action for the CreateRouteTable operation. */
    CreateRouteTable("EC2:CreateRouteTable"),

    /** Action for the CreateSecurityGroup operation. */
    CreateSecurityGroup("EC2:CreateSecurityGroup"),

    /** Action for the CreateSnapshot operation. */
    CreateSnapshot("EC2:CreateSnapshot"),

    /** Action for the CreateSpotDatafeedSubscription operation. */
    CreateSpotDatafeedSubscription("EC2:CreateSpotDatafeedSubscription"),

    /** Action for the CreateSubnet operation. */
    CreateSubnet("EC2:CreateSubnet"),

    /** Action for the CreateTags operation. */
    CreateTags("EC2:CreateTags"),

    /** Action for the CreateVolume operation. */
    CreateVolume("EC2:CreateVolume"),

    /** Action for the CreateVpc operation. */
    CreateVpc("EC2:CreateVpc"),

    /** Action for the CreateVpnConnection operation. */
    CreateVpnConnection("EC2:CreateVpnConnection"),

    /** Action for the CreateVpnGateway operation. */
    CreateVpnGateway("EC2:CreateVpnGateway"),

    /** Action for the DeactivateLicense operation. */
    DeactivateLicense("EC2:DeactivateLicense"),

    /** Action for the DeleteCustomerGateway operation. */
    DeleteCustomerGateway("EC2:DeleteCustomerGateway"),

    /** Action for the DeleteDhcpOptions operation. */
    DeleteDhcpOptions("EC2:DeleteDhcpOptions"),

    /** Action for the DeleteInternetGateway operation. */
    DeleteInternetGateway("EC2:DeleteInternetGateway"),

    /** Action for the DeleteKeyPair operation. */
    DeleteKeyPair("EC2:DeleteKeyPair"),

    /** Action for the DeleteNetworkAcl operation. */
    DeleteNetworkAcl("EC2:DeleteNetworkAcl"),

    /** Action for the DeleteNetworkAclEntry operation. */
    DeleteNetworkAclEntry("EC2:DeleteNetworkAclEntry"),

    /** Action for the DeleteNetworkInterface operation. */
    DeleteNetworkInterface("EC2:DeleteNetworkInterface"),

    /** Action for the DeletePlacementGroup operation. */
    DeletePlacementGroup("EC2:DeletePlacementGroup"),

    /** Action for the DeleteRoute operation. */
    DeleteRoute("EC2:DeleteRoute"),

    /** Action for the DeleteRouteTable operation. */
    DeleteRouteTable("EC2:DeleteRouteTable"),

    /** Action for the DeleteSecurityGroup operation. */
    DeleteSecurityGroup("EC2:DeleteSecurityGroup"),

    /** Action for the DeleteSnapshot operation. */
    DeleteSnapshot("EC2:DeleteSnapshot"),

    /** Action for the DeleteSpotDatafeedSubscription operation. */
    DeleteSpotDatafeedSubscription("EC2:DeleteSpotDatafeedSubscription"),

    /** Action for the DeleteSubnet operation. */
    DeleteSubnet("EC2:DeleteSubnet"),

    /** Action for the DeleteTags operation. */
    DeleteTags("EC2:DeleteTags"),

    /** Action for the DeleteVolume operation. */
    DeleteVolume("EC2:DeleteVolume"),

    /** Action for the DeleteVpc operation. */
    DeleteVpc("EC2:DeleteVpc"),

    /** Action for the DeleteVpnConnection operation. */
    DeleteVpnConnection("EC2:DeleteVpnConnection"),

    /** Action for the DeleteVpnGateway operation. */
    DeleteVpnGateway("EC2:DeleteVpnGateway"),

    /** Action for the DeregisterImage operation. */
    DeregisterImage("EC2:DeregisterImage"),

    /** Action for the DescribeAddresses operation. */
    DescribeAddresses("EC2:DescribeAddresses"),

    /** Action for the DescribeAvailabilityZones operation. */
    DescribeAvailabilityZones("EC2:DescribeAvailabilityZones"),

    /** Action for the DescribeBundleTasks operation. */
    DescribeBundleTasks("EC2:DescribeBundleTasks"),

    /** Action for the DescribeConversionTasks operation. */
    DescribeConversionTasks("EC2:DescribeConversionTasks"),

    /** Action for the DescribeCustomerGateways operation. */
    DescribeCustomerGateways("EC2:DescribeCustomerGateways"),

    /** Action for the DescribeDhcpOptions operation. */
    DescribeDhcpOptions("EC2:DescribeDhcpOptions"),

    /** Action for the DescribeExportTasks operation. */
    DescribeExportTasks("EC2:DescribeExportTasks"),

    /** Action for the DescribeImageAttribute operation. */
    DescribeImageAttribute("EC2:DescribeImageAttribute"),

    /** Action for the DescribeImages operation. */
    DescribeImages("EC2:DescribeImages"),

    /** Action for the DescribeInstanceAttribute operation. */
    DescribeInstanceAttribute("EC2:DescribeInstanceAttribute"),

    /** Action for the DescribeInstanceStatus operation. */
    DescribeInstanceStatus("EC2:DescribeInstanceStatus"),

    /** Action for the DescribeInstances operation. */
    DescribeInstances("EC2:DescribeInstances"),

    /** Action for the DescribeInternetGateways operation. */
    DescribeInternetGateways("EC2:DescribeInternetGateways"),

    /** Action for the DescribeKeyPairs operation. */
    DescribeKeyPairs("EC2:DescribeKeyPairs"),

    /** Action for the DescribeLicenses operation. */
    DescribeLicenses("EC2:DescribeLicenses"),

    /** Action for the DescribeNetworkAcls operation. */
    DescribeNetworkAcls("EC2:DescribeNetworkAcls"),

    /** Action for the DescribeNetworkInterfaceAttribute operation. */
    DescribeNetworkInterfaceAttribute("EC2:DescribeNetworkInterfaceAttribute"),

    /** Action for the DescribeNetworkInterfaces operation. */
    DescribeNetworkInterfaces("EC2:DescribeNetworkInterfaces"),

    /** Action for the DescribePlacementGroups operation. */
    DescribePlacementGroups("EC2:DescribePlacementGroups"),

    /** Action for the DescribeRegions operation. */
    DescribeRegions("EC2:DescribeRegions"),

    /** Action for the DescribeReservedInstances operation. */
    DescribeReservedInstances("EC2:DescribeReservedInstances"),

    /** Action for the DescribeReservedInstancesOfferings operation. */
    DescribeReservedInstancesOfferings("EC2:DescribeReservedInstancesOfferings"),

    /** Action for the DescribeRouteTables operation. */
    DescribeRouteTables("EC2:DescribeRouteTables"),

    /** Action for the DescribeSecurityGroups operation. */
    DescribeSecurityGroups("EC2:DescribeSecurityGroups"),

    /** Action for the DescribeSnapshotAttribute operation. */
    DescribeSnapshotAttribute("EC2:DescribeSnapshotAttribute"),

    /** Action for the DescribeSnapshots operation. */
    DescribeSnapshots("EC2:DescribeSnapshots"),

    /** Action for the DescribeSpotDatafeedSubscription operation. */
    DescribeSpotDatafeedSubscription("EC2:DescribeSpotDatafeedSubscription"),

    /** Action for the DescribeSpotInstanceRequests operation. */
    DescribeSpotInstanceRequests("EC2:DescribeSpotInstanceRequests"),

    /** Action for the DescribeSpotPriceHistory operation. */
    DescribeSpotPriceHistory("EC2:DescribeSpotPriceHistory"),

    /** Action for the DescribeSubnets operation. */
    DescribeSubnets("EC2:DescribeSubnets"),

    /** Action for the DescribeTags operation. */
    DescribeTags("EC2:DescribeTags"),

    /** Action for the DescribeVolumeAttribute operation. */
    DescribeVolumeAttribute("EC2:DescribeVolumeAttribute"),

    /** Action for the DescribeVolumeStatus operation. */
    DescribeVolumeStatus("EC2:DescribeVolumeStatus"),

    /** Action for the DescribeVolumes operation. */
    DescribeVolumes("EC2:DescribeVolumes"),

    /** Action for the DescribeVpcs operation. */
    DescribeVpcs("EC2:DescribeVpcs"),

    /** Action for the DescribeVpnConnections operation. */
    DescribeVpnConnections("EC2:DescribeVpnConnections"),

    /** Action for the DescribeVpnGateways operation. */
    DescribeVpnGateways("EC2:DescribeVpnGateways"),

    /** Action for the DetachInternetGateway operation. */
    DetachInternetGateway("EC2:DetachInternetGateway"),

    /** Action for the DetachNetworkInterface operation. */
    DetachNetworkInterface("EC2:DetachNetworkInterface"),

    /** Action for the DetachVolume operation. */
    DetachVolume("EC2:DetachVolume"),

    /** Action for the DetachVpnGateway operation. */
    DetachVpnGateway("EC2:DetachVpnGateway"),

    /** Action for the DisassociateAddress operation. */
    DisassociateAddress("EC2:DisassociateAddress"),

    /** Action for the DisassociateRouteTable operation. */
    DisassociateRouteTable("EC2:DisassociateRouteTable"),

    /** Action for the EnableVolumeIO operation. */
    EnableVolumeIO("EC2:EnableVolumeIO"),

    /** Action for the GetConsoleOutput operation. */
    GetConsoleOutput("EC2:GetConsoleOutput"),

    /** Action for the GetPasswordData operation. */
    GetPasswordData("EC2:GetPasswordData"),

    /** Action for the ImportInstance operation. */
    ImportInstance("EC2:ImportInstance"),

    /** Action for the ImportKeyPair operation. */
    ImportKeyPair("EC2:ImportKeyPair"),

    /** Action for the ImportVolume operation. */
    ImportVolume("EC2:ImportVolume"),

    /** Action for the ModifyImageAttribute operation. */
    ModifyImageAttribute("EC2:ModifyImageAttribute"),

    /** Action for the ModifyInstanceAttribute operation. */
    ModifyInstanceAttribute("EC2:ModifyInstanceAttribute"),

    /** Action for the ModifyNetworkInterfaceAttribute operation. */
    ModifyNetworkInterfaceAttribute("EC2:ModifyNetworkInterfaceAttribute"),

    /** Action for the ModifySnapshotAttribute operation. */
    ModifySnapshotAttribute("EC2:ModifySnapshotAttribute"),

    /** Action for the ModifyVolumeAttribute operation. */
    ModifyVolumeAttribute("EC2:ModifyVolumeAttribute"),

    /** Action for the MonitorInstances operation. */
    MonitorInstances("EC2:MonitorInstances"),

    /** Action for the PurchaseReservedInstancesOffering operation. */
    PurchaseReservedInstancesOffering("EC2:PurchaseReservedInstancesOffering"),

    /** Action for the RebootInstances operation. */
    RebootInstances("EC2:RebootInstances"),

    /** Action for the RegisterImage operation. */
    RegisterImage("EC2:RegisterImage"),

    /** Action for the ReleaseAddress operation. */
    ReleaseAddress("EC2:ReleaseAddress"),

    /** Action for the ReplaceNetworkAclAssociation operation. */
    ReplaceNetworkAclAssociation("EC2:ReplaceNetworkAclAssociation"),

    /** Action for the ReplaceNetworkAclEntry operation. */
    ReplaceNetworkAclEntry("EC2:ReplaceNetworkAclEntry"),

    /** Action for the ReplaceRoute operation. */
    ReplaceRoute("EC2:ReplaceRoute"),

    /** Action for the ReplaceRouteTableAssociation operation. */
    ReplaceRouteTableAssociation("EC2:ReplaceRouteTableAssociation"),

    /** Action for the ReportInstanceStatus operation. */
    ReportInstanceStatus("EC2:ReportInstanceStatus"),

    /** Action for the RequestSpotInstances operation. */
    RequestSpotInstances("EC2:RequestSpotInstances"),

    /** Action for the ResetImageAttribute operation. */
    ResetImageAttribute("EC2:ResetImageAttribute"),

    /** Action for the ResetInstanceAttribute operation. */
    ResetInstanceAttribute("EC2:ResetInstanceAttribute"),

    /** Action for the ResetNetworkInterfaceAttribute operation. */
    ResetNetworkInterfaceAttribute("EC2:ResetNetworkInterfaceAttribute"),

    /** Action for the ResetSnapshotAttribute operation. */
    ResetSnapshotAttribute("EC2:ResetSnapshotAttribute"),

    /** Action for the RevokeSecurityGroupEgress operation. */
    RevokeSecurityGroupEgress("EC2:RevokeSecurityGroupEgress"),

    /** Action for the RevokeSecurityGroupIngress operation. */
    RevokeSecurityGroupIngress("EC2:RevokeSecurityGroupIngress"),

    /** Action for the RunInstances operation. */
    RunInstances("EC2:RunInstances"),

    /** Action for the StartInstances operation. */
    StartInstances("EC2:StartInstances"),

    /** Action for the StopInstances operation. */
    StopInstances("EC2:StopInstances"),

    /** Action for the TerminateInstances operation. */
    TerminateInstances("EC2:TerminateInstances"),

    /** Action for the UnmonitorInstances operation. */
    UnmonitorInstances("EC2:UnmonitorInstances");

    private final String action;

    private EC2Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
