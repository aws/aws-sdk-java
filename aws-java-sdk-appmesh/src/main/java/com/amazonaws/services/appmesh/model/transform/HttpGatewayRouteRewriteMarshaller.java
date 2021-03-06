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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HttpGatewayRouteRewriteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HttpGatewayRouteRewriteMarshaller {

    private static final MarshallingInfo<StructuredPojo> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hostname").build();
    private static final MarshallingInfo<StructuredPojo> PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("path").build();
    private static final MarshallingInfo<StructuredPojo> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("prefix").build();

    private static final HttpGatewayRouteRewriteMarshaller instance = new HttpGatewayRouteRewriteMarshaller();

    public static HttpGatewayRouteRewriteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HttpGatewayRouteRewrite httpGatewayRouteRewrite, ProtocolMarshaller protocolMarshaller) {

        if (httpGatewayRouteRewrite == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(httpGatewayRouteRewrite.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(httpGatewayRouteRewrite.getPath(), PATH_BINDING);
            protocolMarshaller.marshall(httpGatewayRouteRewrite.getPrefix(), PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
