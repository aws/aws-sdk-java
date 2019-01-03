/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
  AllEC2Actions("ec2:*"),

  /** Action for the ActivateLicense operation. */
  ActivateLicense("ec2:ActivateLicense"),

  /** Action for the AllocateAddress operation. */
  AllocateAddress("ec2:AllocateAddress"),

  /** Action for the AssociateAddress operation. */
  AssociateAddress("ec2:AssociateAddress"),

  /** Action for the AssociateDhcpOptions operation. */
  AssociateDhcpOptions("ec2:AssociateDhcpOptions"),

  /** Action for the AssociateRouteTable operation. */
  AssociateRouteTable("ec2:AssociateRouteTable"),

  /** Action for the AttachInternetGateway operation. */
  AttachInternetGateway("ec2:AttachInternetGateway"),

  /** Action for the AttachNetworkInterface operation. */
  AttachNetworkInterface("ec2:AttachNetworkInterface"),

  /** Action for the AttachVolume operation. */
  AttachVolume("ec2:AttachVolume"),

  /** Action for the AttachVpnGateway operation. */
  AttachVpnGateway("ec2:AttachVpnGateway"),

  /** Action for the AuthorizeSecurityGroupEgress operation. */
  AuthorizeSecurityGroupEgress("ec2:AuthorizeSecurityGroupEgress"),

  /** Action for the AuthorizeSecurityGroupIngress operation. */
  AuthorizeSecurityGroupIngress("ec2:AuthorizeSecurityGroupIngress"),

  /** Action for the BundleInstance operation. */
  BundleInstance("ec2:BundleInstance"),

  /** Action for the CancelBundleTask operation. */
  CancelBundleTask("ec2:CancelBundleTask"),

  /** Action for the CancelConversionTask operation. */
  CancelConversionTask("ec2:CancelConversionTask"),

  /** Action for the CancelExportTask operation. */
  CancelExportTask("ec2:CancelExportTask"),

  /** Action for the CancelSpotInstanceRequests operation. */
  CancelSpotInstanceRequests("ec2:CancelSpotInstanceRequests"),

  /** Action for the ConfirmProductInstance operation. */
  ConfirmProductInstance("ec2:ConfirmProductInstance"),

  /** Action for the CopyImage operation. */
  CopyImage("ec2:CopyImage"),

  /** Action for the CopySnapshot operation. */
  CopySnapshot("ec2:CopySnapshot"),

  /** Action for the CreateCustomerGateway operation. */
  CreateCustomerGateway("ec2:CreateCustomerGateway"),

  /** Action for the CreateDhcpOptions operation. */
  CreateDhcpOptions("ec2:CreateDhcpOptions"),

  /** Action for the CreateImage operation. */
  CreateImage("ec2:CreateImage"),

  /** Action for the CreateInstanceExportTask operation. */
  CreateInstanceExportTask("ec2:CreateInstanceExportTask"),

  /** Action for the CreateInternetGateway operation. */
  CreateInternetGateway("ec2:CreateInternetGateway"),

  /** Action for the CreateKeyPair operation. */
  CreateKeyPair("ec2:CreateKeyPair"),

  /** Action for the CreateNetworkAcl operation. */
  CreateNetworkAcl("ec2:CreateNetworkAcl"),

  /** Action for the CreateNetworkAclEntry operation. */
  CreateNetworkAclEntry("ec2:CreateNetworkAclEntry"),

  /** Action for the CreateNetworkInterface operation. */
  CreateNetworkInterface("ec2:CreateNetworkInterface"),

  /** Action for the CreatePlacementGroup operation. */
  CreatePlacementGroup("ec2:CreatePlacementGroup"),

  /** Action for the CreateRoute operation. */
  CreateRoute("ec2:CreateRoute"),

  /** Action for the CreateRouteTable operation. */
  CreateRouteTable("ec2:CreateRouteTable"),

  /** Action for the CreateSecurityGroup operation. */
  CreateSecurityGroup("ec2:CreateSecurityGroup"),

  /** Action for the CreateSnapshot operation. */
  CreateSnapshot("ec2:CreateSnapshot"),

  /** Action for the CreateSpotDatafeedSubscription operation. */
  CreateSpotDatafeedSubscription("ec2:CreateSpotDatafeedSubscription"),

  /** Action for the CreateSubnet operation. */
  CreateSubnet("ec2:CreateSubnet"),

  /** Action for the CreateTags operation. */
  CreateTags("ec2:CreateTags"),

  /** Action for the CreateVolume operation. */
  CreateVolume("ec2:CreateVolume"),

  /** Action for the CreateVpc operation. */
  CreateVpc("ec2:CreateVpc"),

  /** Action for the CreateVpnConnection operation. */
  CreateVpnConnection("ec2:CreateVpnConnection"),

  /** Action for the CreateVpnGateway operation. */
  CreateVpnGateway("ec2:CreateVpnGateway"),

  /** Action for the DeactivateLicense operation. */
  DeactivateLicense("ec2:DeactivateLicense"),

  /** Action for the DeleteCustomerGateway operation. */
  DeleteCustomerGateway("ec2:DeleteCustomerGateway"),

  /** Action for the DeleteDhcpOptions operation. */
  DeleteDhcpOptions("ec2:DeleteDhcpOptions"),

  /** Action for the DeleteInternetGateway operation. */
  DeleteInternetGateway("ec2:DeleteInternetGateway"),

  /** Action for the DeleteKeyPair operation. */
  DeleteKeyPair("ec2:DeleteKeyPair"),

  /** Action for the DeleteNetworkAcl operation. */
  DeleteNetworkAcl("ec2:DeleteNetworkAcl"),

  /** Action for the DeleteNetworkAclEntry operation. */
  DeleteNetworkAclEntry("ec2:DeleteNetworkAclEntry"),

  /** Action for the DeleteNetworkInterface operation. */
  DeleteNetworkInterface("ec2:DeleteNetworkInterface"),

  /** Action for the DeletePlacementGroup operation. */
  DeletePlacementGroup("ec2:DeletePlacementGroup"),

  /** Action for the DeleteRoute operation. */
  DeleteRoute("ec2:DeleteRoute"),

  /** Action for the DeleteRouteTable operation. */
  DeleteRouteTable("ec2:DeleteRouteTable"),

  /** Action for the DeleteSecurityGroup operation. */
  DeleteSecurityGroup("ec2:DeleteSecurityGroup"),

  /** Action for the DeleteSnapshot operation. */
  DeleteSnapshot("ec2:DeleteSnapshot"),

  /** Action for the DeleteSpotDatafeedSubscription operation. */
  DeleteSpotDatafeedSubscription("ec2:DeleteSpotDatafeedSubscription"),

  /** Action for the DeleteSubnet operation. */
  DeleteSubnet("ec2:DeleteSubnet"),

  /** Action for the DeleteTags operation. */
  DeleteTags("ec2:DeleteTags"),

  /** Action for the DeleteVolume operation. */
  DeleteVolume("ec2:DeleteVolume"),

  /** Action for the DeleteVpc operation. */
  DeleteVpc("ec2:DeleteVpc"),

  /** Action for the DeleteVpnConnection operation. */
  DeleteVpnConnection("ec2:DeleteVpnConnection"),

  /** Action for the DeleteVpnGateway operation. */
  DeleteVpnGateway("ec2:DeleteVpnGateway"),

  /** Action for the DeregisterImage operation. */
  DeregisterImage("ec2:DeregisterImage"),

  /** Action for the DescribeAddresses operation. */
  DescribeAddresses("ec2:DescribeAddresses"),

  /** Action for the DescribeAvailabilityZones operation. */
  DescribeAvailabilityZones("ec2:DescribeAvailabilityZones"),

  /** Action for the DescribeBundleTasks operation. */
  DescribeBundleTasks("ec2:DescribeBundleTasks"),

  /** Action for the DescribeConversionTasks operation. */
  DescribeConversionTasks("ec2:DescribeConversionTasks"),

  /** Action for the DescribeCustomerGateways operation. */
  DescribeCustomerGateways("ec2:DescribeCustomerGateways"),

  /** Action for the DescribeDhcpOptions operation. */
  DescribeDhcpOptions("ec2:DescribeDhcpOptions"),

  /** Action for the DescribeExportTasks operation. */
  DescribeExportTasks("ec2:DescribeExportTasks"),

  /** Action for the DescribeImageAttribute operation. */
  DescribeImageAttribute("ec2:DescribeImageAttribute"),

  /** Action for the DescribeImages operation. */
  DescribeImages("ec2:DescribeImages"),

  /** Action for the DescribeInstanceAttribute operation. */
  DescribeInstanceAttribute("ec2:DescribeInstanceAttribute"),

  /** Action for the DescribeInstanceStatus operation. */
  DescribeInstanceStatus("ec2:DescribeInstanceStatus"),

  /** Action for the DescribeInstances operation. */
  DescribeInstances("ec2:DescribeInstances"),

  /** Action for the DescribeInternetGateways operation. */
  DescribeInternetGateways("ec2:DescribeInternetGateways"),

  /** Action for the DescribeKeyPairs operation. */
  DescribeKeyPairs("ec2:DescribeKeyPairs"),

  /** Action for the DescribeLicenses operation. */
  DescribeLicenses("ec2:DescribeLicenses"),

  /** Action for the DescribeNetworkAcls operation. */
  DescribeNetworkAcls("ec2:DescribeNetworkAcls"),

  /** Action for the DescribeNetworkInterfaceAttribute operation. */
  DescribeNetworkInterfaceAttribute("ec2:DescribeNetworkInterfaceAttribute"),

  /** Action for the DescribeNetworkInterfaces operation. */
  DescribeNetworkInterfaces("ec2:DescribeNetworkInterfaces"),

  /** Action for the DescribePlacementGroups operation. */
  DescribePlacementGroups("ec2:DescribePlacementGroups"),

  /** Action for the DescribeRegions operation. */
  DescribeRegions("ec2:DescribeRegions"),

  /** Action for the DescribeReservedInstances operation. */
  DescribeReservedInstances("ec2:DescribeReservedInstances"),

  /** Action for the DescribeReservedInstancesOfferings operation. */
  DescribeReservedInstancesOfferings("ec2:DescribeReservedInstancesOfferings"),

  /** Action for the DescribeRouteTables operation. */
  DescribeRouteTables("ec2:DescribeRouteTables"),

  /** Action for the DescribeSecurityGroups operation. */
  DescribeSecurityGroups("ec2:DescribeSecurityGroups"),

  /** Action for the DescribeSnapshotAttribute operation. */
  DescribeSnapshotAttribute("ec2:DescribeSnapshotAttribute"),

  /** Action for the DescribeSnapshots operation. */
  DescribeSnapshots("ec2:DescribeSnapshots"),

  /** Action for the DescribeSpotDatafeedSubscription operation. */
  DescribeSpotDatafeedSubscription("ec2:DescribeSpotDatafeedSubscription"),

  /** Action for the DescribeSpotInstanceRequests operation. */
  DescribeSpotInstanceRequests("ec2:DescribeSpotInstanceRequests"),

  /** Action for the DescribeSpotPriceHistory operation. */
  DescribeSpotPriceHistory("ec2:DescribeSpotPriceHistory"),

  /** Action for the DescribeSubnets operation. */
  DescribeSubnets("ec2:DescribeSubnets"),

  /** Action for the DescribeTags operation. */
  DescribeTags("ec2:DescribeTags"),

  /** Action for the DescribeVolumeAttribute operation. */
  DescribeVolumeAttribute("ec2:DescribeVolumeAttribute"),

  /** Action for the DescribeVolumeStatus operation. */
  DescribeVolumeStatus("ec2:DescribeVolumeStatus"),

  /** Action for the DescribeVolumes operation. */
  DescribeVolumes("ec2:DescribeVolumes"),

  /** Action for the DescribeVpcs operation. */
  DescribeVpcs("ec2:DescribeVpcs"),

  /** Action for the DescribeVpnConnections operation. */
  DescribeVpnConnections("ec2:DescribeVpnConnections"),

  /** Action for the DescribeVpnGateways operation. */
  DescribeVpnGateways("ec2:DescribeVpnGateways"),

  /** Action for the DetachInternetGateway operation. */
  DetachInternetGateway("ec2:DetachInternetGateway"),

  /** Action for the DetachNetworkInterface operation. */
  DetachNetworkInterface("ec2:DetachNetworkInterface"),

  /** Action for the DetachVolume operation. */
  DetachVolume("ec2:DetachVolume"),

  /** Action for the DetachVpnGateway operation. */
  DetachVpnGateway("ec2:DetachVpnGateway"),

  /** Action for the DisassociateAddress operation. */
  DisassociateAddress("ec2:DisassociateAddress"),

  /** Action for the DisassociateRouteTable operation. */
  DisassociateRouteTable("ec2:DisassociateRouteTable"),

  /** Action for the EnableVolumeIO operation. */
  EnableVolumeIO("ec2:EnableVolumeIO"),

  /** Action for the GetConsoleOutput operation. */
  GetConsoleOutput("ec2:GetConsoleOutput"),

  /** Action for the GetPasswordData operation. */
  GetPasswordData("ec2:GetPasswordData"),

  /** Action for the ImportInstance operation. */
  ImportInstance("ec2:ImportInstance"),

  /** Action for the ImportKeyPair operation. */
  ImportKeyPair("ec2:ImportKeyPair"),

  /** Action for the ImportVolume operation. */
  ImportVolume("ec2:ImportVolume"),

  /** Action for the ModifyImageAttribute operation. */
  ModifyImageAttribute("ec2:ModifyImageAttribute"),

  /** Action for the ModifyInstanceAttribute operation. */
  ModifyInstanceAttribute("ec2:ModifyInstanceAttribute"),

  /** Action for the ModifyNetworkInterfaceAttribute operation. */
  ModifyNetworkInterfaceAttribute("ec2:ModifyNetworkInterfaceAttribute"),

  /** Action for the ModifySnapshotAttribute operation. */
  ModifySnapshotAttribute("ec2:ModifySnapshotAttribute"),

  /** Action for the ModifyVolumeAttribute operation. */
  ModifyVolumeAttribute("ec2:ModifyVolumeAttribute"),

  /** Action for the MonitorInstances operation. */
  MonitorInstances("ec2:MonitorInstances"),

  /** Action for the PurchaseReservedInstancesOffering operation. */
  PurchaseReservedInstancesOffering("ec2:PurchaseReservedInstancesOffering"),

  /** Action for the RebootInstances operation. */
  RebootInstances("ec2:RebootInstances"),

  /** Action for the RegisterImage operation. */
  RegisterImage("ec2:RegisterImage"),

  /** Action for the ReleaseAddress operation. */
  ReleaseAddress("ec2:ReleaseAddress"),

  /** Action for the ReplaceNetworkAclAssociation operation. */
  ReplaceNetworkAclAssociation("ec2:ReplaceNetworkAclAssociation"),

  /** Action for the ReplaceNetworkAclEntry operation. */
  ReplaceNetworkAclEntry("ec2:ReplaceNetworkAclEntry"),

  /** Action for the ReplaceRoute operation. */
  ReplaceRoute("ec2:ReplaceRoute"),

  /** Action for the ReplaceRouteTableAssociation operation. */
  ReplaceRouteTableAssociation("ec2:ReplaceRouteTableAssociation"),

  /** Action for the ReportInstanceStatus operation. */
  ReportInstanceStatus("ec2:ReportInstanceStatus"),

  /** Action for the RequestSpotInstances operation. */
  RequestSpotInstances("ec2:RequestSpotInstances"),

  /** Action for the ResetImageAttribute operation. */
  ResetImageAttribute("ec2:ResetImageAttribute"),

  /** Action for the ResetInstanceAttribute operation. */
  ResetInstanceAttribute("ec2:ResetInstanceAttribute"),

  /** Action for the ResetNetworkInterfaceAttribute operation. */
  ResetNetworkInterfaceAttribute("ec2:ResetNetworkInterfaceAttribute"),

  /** Action for the ResetSnapshotAttribute operation. */
  ResetSnapshotAttribute("ec2:ResetSnapshotAttribute"),

  /** Action for the RevokeSecurityGroupEgress operation. */
  RevokeSecurityGroupEgress("ec2:RevokeSecurityGroupEgress"),

  /** Action for the RevokeSecurityGroupIngress operation. */
  RevokeSecurityGroupIngress("ec2:RevokeSecurityGroupIngress"),

  /** Action for the RunInstances operation. */
  RunInstances("ec2:RunInstances"),

  /** Action for the StartInstances operation. */
  StartInstances("ec2:StartInstances"),

  /** Action for the StopInstances operation. */
  StopInstances("ec2:StopInstances"),

  /** Action for the TerminateInstances operation. */
  TerminateInstances("ec2:TerminateInstances"),

  /** Action for the UnmonitorInstances operation. */
  UnmonitorInstances("ec2:UnmonitorInstances");

  private final String action;

  private EC2Actions(String action) {
    this.action = action;
  }

  public String getActionName() {
    return this.action;
  }
}
