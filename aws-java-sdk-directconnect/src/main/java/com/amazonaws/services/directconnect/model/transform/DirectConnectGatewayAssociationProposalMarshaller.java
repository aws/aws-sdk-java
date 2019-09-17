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
package com.amazonaws.services.directconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectConnectGatewayAssociationProposalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectConnectGatewayAssociationProposalMarshaller {

    private static final MarshallingInfo<String> PROPOSALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proposalId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayOwnerAccount").build();
    private static final MarshallingInfo<String> PROPOSALSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proposalState").build();
    private static final MarshallingInfo<StructuredPojo> ASSOCIATEDGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedGateway").build();
    private static final MarshallingInfo<List> EXISTINGALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingAllowedPrefixesToDirectConnectGateway").build();
    private static final MarshallingInfo<List> REQUESTEDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestedAllowedPrefixesToDirectConnectGateway").build();

    private static final DirectConnectGatewayAssociationProposalMarshaller instance = new DirectConnectGatewayAssociationProposalMarshaller();

    public static DirectConnectGatewayAssociationProposalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal, ProtocolMarshaller protocolMarshaller) {

        if (directConnectGatewayAssociationProposal == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getProposalId(), PROPOSALID_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller
                    .marshall(directConnectGatewayAssociationProposal.getDirectConnectGatewayOwnerAccount(), DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getProposalState(), PROPOSALSTATE_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getAssociatedGateway(), ASSOCIATEDGATEWAY_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getExistingAllowedPrefixesToDirectConnectGateway(),
                    EXISTINGALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociationProposal.getRequestedAllowedPrefixesToDirectConnectGateway(),
                    REQUESTEDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
