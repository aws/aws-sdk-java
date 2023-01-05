/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsecuretunneling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsecuretunneling.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RotateTunnelAccessTokenRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RotateTunnelAccessTokenRequestMarshaller {

    private static final MarshallingInfo<String> TUNNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tunnelId").build();
    private static final MarshallingInfo<String> CLIENTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientMode").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationConfig").build();

    private static final RotateTunnelAccessTokenRequestMarshaller instance = new RotateTunnelAccessTokenRequestMarshaller();

    public static RotateTunnelAccessTokenRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RotateTunnelAccessTokenRequest rotateTunnelAccessTokenRequest, ProtocolMarshaller protocolMarshaller) {

        if (rotateTunnelAccessTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rotateTunnelAccessTokenRequest.getTunnelId(), TUNNELID_BINDING);
            protocolMarshaller.marshall(rotateTunnelAccessTokenRequest.getClientMode(), CLIENTMODE_BINDING);
            protocolMarshaller.marshall(rotateTunnelAccessTokenRequest.getDestinationConfig(), DESTINATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
