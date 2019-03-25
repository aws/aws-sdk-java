/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS Direct Connect.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DirectConnectActions implements Action {

    /** Represents any action executed on AWS Direct Connect. */
    AllDirectConnectActions("directconnect:*"),

    /** Action for the AcceptDirectConnectGatewayAssociationProposal operation. */
    AcceptDirectConnectGatewayAssociationProposal("directconnect:AcceptDirectConnectGatewayAssociationProposal"),
    /** Action for the AllocateConnectionOnInterconnect operation. */
    AllocateConnectionOnInterconnect("directconnect:AllocateConnectionOnInterconnect"),
    /** Action for the AllocateHostedConnection operation. */
    AllocateHostedConnection("directconnect:AllocateHostedConnection"),
    /** Action for the AllocatePrivateVirtualInterface operation. */
    AllocatePrivateVirtualInterface("directconnect:AllocatePrivateVirtualInterface"),
    /** Action for the AllocatePublicVirtualInterface operation. */
    AllocatePublicVirtualInterface("directconnect:AllocatePublicVirtualInterface"),
    /** Action for the AssociateConnectionWithLag operation. */
    AssociateConnectionWithLag("directconnect:AssociateConnectionWithLag"),
    /** Action for the AssociateHostedConnection operation. */
    AssociateHostedConnection("directconnect:AssociateHostedConnection"),
    /** Action for the AssociateVirtualInterface operation. */
    AssociateVirtualInterface("directconnect:AssociateVirtualInterface"),
    /** Action for the ConfirmConnection operation. */
    ConfirmConnection("directconnect:ConfirmConnection"),
    /** Action for the ConfirmPrivateVirtualInterface operation. */
    ConfirmPrivateVirtualInterface("directconnect:ConfirmPrivateVirtualInterface"),
    /** Action for the ConfirmPublicVirtualInterface operation. */
    ConfirmPublicVirtualInterface("directconnect:ConfirmPublicVirtualInterface"),
    /** Action for the CreateBGPPeer operation. */
    CreateBGPPeer("directconnect:CreateBGPPeer"),
    /** Action for the CreateConnection operation. */
    CreateConnection("directconnect:CreateConnection"),
    /** Action for the CreateDirectConnectGateway operation. */
    CreateDirectConnectGateway("directconnect:CreateDirectConnectGateway"),
    /** Action for the CreateDirectConnectGatewayAssociation operation. */
    CreateDirectConnectGatewayAssociation("directconnect:CreateDirectConnectGatewayAssociation"),
    /** Action for the CreateDirectConnectGatewayAssociationProposal operation. */
    CreateDirectConnectGatewayAssociationProposal("directconnect:CreateDirectConnectGatewayAssociationProposal"),
    /** Action for the CreateInterconnect operation. */
    CreateInterconnect("directconnect:CreateInterconnect"),
    /** Action for the CreateLag operation. */
    CreateLag("directconnect:CreateLag"),
    /** Action for the CreatePrivateVirtualInterface operation. */
    CreatePrivateVirtualInterface("directconnect:CreatePrivateVirtualInterface"),
    /** Action for the CreatePublicVirtualInterface operation. */
    CreatePublicVirtualInterface("directconnect:CreatePublicVirtualInterface"),
    /** Action for the DeleteBGPPeer operation. */
    DeleteBGPPeer("directconnect:DeleteBGPPeer"),
    /** Action for the DeleteConnection operation. */
    DeleteConnection("directconnect:DeleteConnection"),
    /** Action for the DeleteDirectConnectGateway operation. */
    DeleteDirectConnectGateway("directconnect:DeleteDirectConnectGateway"),
    /** Action for the DeleteDirectConnectGatewayAssociation operation. */
    DeleteDirectConnectGatewayAssociation("directconnect:DeleteDirectConnectGatewayAssociation"),
    /** Action for the DeleteDirectConnectGatewayAssociationProposal operation. */
    DeleteDirectConnectGatewayAssociationProposal("directconnect:DeleteDirectConnectGatewayAssociationProposal"),
    /** Action for the DeleteInterconnect operation. */
    DeleteInterconnect("directconnect:DeleteInterconnect"),
    /** Action for the DeleteLag operation. */
    DeleteLag("directconnect:DeleteLag"),
    /** Action for the DeleteVirtualInterface operation. */
    DeleteVirtualInterface("directconnect:DeleteVirtualInterface"),
    /** Action for the DescribeConnectionLoa operation. */
    DescribeConnectionLoa("directconnect:DescribeConnectionLoa"),
    /** Action for the DescribeConnections operation. */
    DescribeConnections("directconnect:DescribeConnections"),
    /** Action for the DescribeConnectionsOnInterconnect operation. */
    DescribeConnectionsOnInterconnect("directconnect:DescribeConnectionsOnInterconnect"),
    /** Action for the DescribeDirectConnectGatewayAssociationProposals operation. */
    DescribeDirectConnectGatewayAssociationProposals("directconnect:DescribeDirectConnectGatewayAssociationProposals"),
    /** Action for the DescribeDirectConnectGatewayAssociations operation. */
    DescribeDirectConnectGatewayAssociations("directconnect:DescribeDirectConnectGatewayAssociations"),
    /** Action for the DescribeDirectConnectGatewayAttachments operation. */
    DescribeDirectConnectGatewayAttachments("directconnect:DescribeDirectConnectGatewayAttachments"),
    /** Action for the DescribeDirectConnectGateways operation. */
    DescribeDirectConnectGateways("directconnect:DescribeDirectConnectGateways"),
    /** Action for the DescribeHostedConnections operation. */
    DescribeHostedConnections("directconnect:DescribeHostedConnections"),
    /** Action for the DescribeInterconnectLoa operation. */
    DescribeInterconnectLoa("directconnect:DescribeInterconnectLoa"),
    /** Action for the DescribeInterconnects operation. */
    DescribeInterconnects("directconnect:DescribeInterconnects"),
    /** Action for the DescribeLags operation. */
    DescribeLags("directconnect:DescribeLags"),
    /** Action for the DescribeLoa operation. */
    DescribeLoa("directconnect:DescribeLoa"),
    /** Action for the DescribeLocations operation. */
    DescribeLocations("directconnect:DescribeLocations"),
    /** Action for the DescribeTags operation. */
    DescribeTags("directconnect:DescribeTags"),
    /** Action for the DescribeVirtualGateways operation. */
    DescribeVirtualGateways("directconnect:DescribeVirtualGateways"),
    /** Action for the DescribeVirtualInterfaces operation. */
    DescribeVirtualInterfaces("directconnect:DescribeVirtualInterfaces"),
    /** Action for the DisassociateConnectionFromLag operation. */
    DisassociateConnectionFromLag("directconnect:DisassociateConnectionFromLag"),
    /** Action for the TagResource operation. */
    TagResource("directconnect:TagResource"),
    /** Action for the UntagResource operation. */
    UntagResource("directconnect:UntagResource"),
    /** Action for the UpdateDirectConnectGatewayAssociation operation. */
    UpdateDirectConnectGatewayAssociation("directconnect:UpdateDirectConnectGatewayAssociation"),
    /** Action for the UpdateLag operation. */
    UpdateLag("directconnect:UpdateLag"),
    /** Action for the UpdateVirtualInterfaceAttributes operation. */
    UpdateVirtualInterfaceAttributes("directconnect:UpdateVirtualInterfaceAttributes"),

    ;

    private final String action;

    private DirectConnectActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
