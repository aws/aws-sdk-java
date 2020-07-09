/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GatewayRouteSpecMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GatewayRouteSpecMarshaller {

    private static final MarshallingInfo<StructuredPojo> GRPCROUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("grpcRoute").build();
    private static final MarshallingInfo<StructuredPojo> HTTP2ROUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("http2Route").build();
    private static final MarshallingInfo<StructuredPojo> HTTPROUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpRoute").build();

    private static final GatewayRouteSpecMarshaller instance = new GatewayRouteSpecMarshaller();

    public static GatewayRouteSpecMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GatewayRouteSpec gatewayRouteSpec, ProtocolMarshaller protocolMarshaller) {

        if (gatewayRouteSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gatewayRouteSpec.getGrpcRoute(), GRPCROUTE_BINDING);
            protocolMarshaller.marshall(gatewayRouteSpec.getHttp2Route(), HTTP2ROUTE_BINDING);
            protocolMarshaller.marshall(gatewayRouteSpec.getHttpRoute(), HTTPROUTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
