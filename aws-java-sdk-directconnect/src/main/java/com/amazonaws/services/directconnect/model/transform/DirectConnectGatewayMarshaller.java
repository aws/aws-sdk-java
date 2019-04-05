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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectConnectGatewayMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectConnectGatewayMarshaller {

    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayId").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayName").build();
    private static final MarshallingInfo<Long> AMAZONSIDEASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amazonSideAsn").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> DIRECTCONNECTGATEWAYSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directConnectGatewayState").build();
    private static final MarshallingInfo<String> STATECHANGEERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateChangeError").build();

    private static final DirectConnectGatewayMarshaller instance = new DirectConnectGatewayMarshaller();

    public static DirectConnectGatewayMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectConnectGateway directConnectGateway, ProtocolMarshaller protocolMarshaller) {

        if (directConnectGateway == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directConnectGateway.getDirectConnectGatewayId(), DIRECTCONNECTGATEWAYID_BINDING);
            protocolMarshaller.marshall(directConnectGateway.getDirectConnectGatewayName(), DIRECTCONNECTGATEWAYNAME_BINDING);
            protocolMarshaller.marshall(directConnectGateway.getAmazonSideAsn(), AMAZONSIDEASN_BINDING);
            protocolMarshaller.marshall(directConnectGateway.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(directConnectGateway.getDirectConnectGatewayState(), DIRECTCONNECTGATEWAYSTATE_BINDING);
            protocolMarshaller.marshall(directConnectGateway.getStateChangeError(), STATECHANGEERROR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
