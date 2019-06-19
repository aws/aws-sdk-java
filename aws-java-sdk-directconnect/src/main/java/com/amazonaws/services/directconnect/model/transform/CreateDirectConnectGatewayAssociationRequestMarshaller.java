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
 * CreateDirectConnectGatewayAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDirectConnectGatewayAssociationRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gatewayId").build();
    private static final MarshallingInfo<List> ADDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addAllowedPrefixesToDirectConnectGateway").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualGatewayId").build();

    private static final CreateDirectConnectGatewayAssociationRequestMarshaller instance = new CreateDirectConnectGatewayAssociationRequestMarshaller();

    public static CreateDirectConnectGatewayAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDirectConnectGatewayAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationRequest.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationRequest.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationRequest.getAddAllowedPrefixesToDirectConnectGateway(),
                    ADDALLOWEDPREFIXESTODIRECTCONNECTGATEWAY_BINDING);
            protocolMarshaller.marshall(createDirectConnectGatewayAssociationRequest.getVirtualGatewayId(), VIRTUALGATEWAYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
