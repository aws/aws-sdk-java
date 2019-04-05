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
 * DirectConnectGatewayAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectConnectGatewayAssociationMarshaller {

    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayOwnerAccount").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationState").build();
    private static final MarshallingInfo<String> STATECHANGEERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateChangeError").build();
    private static final MarshallingInfo<StructuredPojo> ASSOCIATEDGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedGateway").build();
    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationId").build();
    private static final MarshallingInfo<List> ALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedPrefixesToDirectConnectGateway").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayRegion").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYOWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayOwnerAccount").build();

    private static final DirectConnectGatewayAssociationMarshaller instance = new DirectConnectGatewayAssociationMarshaller();

    public static DirectConnectGatewayAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectConnectGatewayAssociation directConnectGatewayAssociation, ProtocolMarshaller protocolMarshaller) {

        if (directConnectGatewayAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directConnectGatewayAssociation.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getDirectConnectGatewayOwnerAccount(), DIRECTCONNECTGATEWAYOWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getAssociationState(), ASSOCIATIONSTATE_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getStateChangeError(), STATECHANGEERROR_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getAssociatedGateway(), ASSOCIATEDGATEWAY_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getAllowedPrefixesToDirectConnectGateway(),
                    ALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getVirtualGatewayRegion(), VIRTUALGATEWAYREGION_BINDING);
            protocolMarshaller.marshall(directConnectGatewayAssociation.getVirtualGatewayOwnerAccount(), VIRTUALGATEWAYOWNERACCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
