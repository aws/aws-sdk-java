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
 * CreateDirectConnectGatewayAssociationProposalRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDirectConnectGatewayAssociationProposalRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayOwnerAccount").build();
    private static final MarshallingInfo<String> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gatewayId").build();
    private static final MarshallingInfo<List> ADDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addAllowedPrefixesToDirectConnectGateway").build();
    private static final MarshallingInfo<List> REMOVEALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeAllowedPrefixesToDirectConnectGateway").build();

    private static final CreateDirectConnectGatewayAssociationProposalRequestMarshaller instance = new CreateDirectConnectGatewayAssociationProposalRequestMarshaller();

    public static CreateDirectConnectGatewayAssociationProposalRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (createDirectConnectGatewayAssociationProposalRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationProposalRequest.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationProposalRequest.getDirectConnectGatewayOwnerAccount(),
                    DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationProposalRequest.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationProposalRequest.getAddAllowedPrefixesToDirectConnectGateway(),
                    ADDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationProposalRequest.getRemoveAllowedPrefixesToDirectConnectGateway(),
                    REMOVEALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
