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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateGatewayRouteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGatewayRouteRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> GATEWAYROUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("gatewayRouteName").build();
    private static final MarshallingInfo<String> MESHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("meshName").build();
    private static final MarshallingInfo<String> MESHOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("meshOwner").build();
    private static final MarshallingInfo<StructuredPojo> SPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spec").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("virtualGatewayName").build();

    private static final UpdateGatewayRouteRequestMarshaller instance = new UpdateGatewayRouteRequestMarshaller();

    public static UpdateGatewayRouteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGatewayRouteRequest updateGatewayRouteRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGatewayRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGatewayRouteRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateGatewayRouteRequest.getGatewayRouteName(), GATEWAYROUTENAME_BINDING);
            protocolMarshaller.marshall(updateGatewayRouteRequest.getMeshName(), MESHNAME_BINDING);
            protocolMarshaller.marshall(updateGatewayRouteRequest.getMeshOwner(), MESHOWNER_BINDING);
            protocolMarshaller.marshall(updateGatewayRouteRequest.getSpec(), SPEC_BINDING);
            protocolMarshaller.marshall(updateGatewayRouteRequest.getVirtualGatewayName(), VIRTUALGATEWAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
