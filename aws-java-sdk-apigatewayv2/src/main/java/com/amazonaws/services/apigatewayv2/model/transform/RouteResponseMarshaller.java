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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteResponseMarshaller {

    private static final MarshallingInfo<String> MODELSELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelSelectionExpression").build();
    private static final MarshallingInfo<Map> RESPONSEMODELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("responseModels").build();
    private static final MarshallingInfo<Map> RESPONSEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseParameters").build();
    private static final MarshallingInfo<String> ROUTERESPONSEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeResponseId").build();
    private static final MarshallingInfo<String> ROUTERESPONSEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeResponseKey").build();

    private static final RouteResponseMarshaller instance = new RouteResponseMarshaller();

    public static RouteResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteResponse routeResponse, ProtocolMarshaller protocolMarshaller) {

        if (routeResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeResponse.getModelSelectionExpression(), MODELSELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(routeResponse.getResponseModels(), RESPONSEMODELS_BINDING);
            protocolMarshaller.marshall(routeResponse.getResponseParameters(), RESPONSEPARAMETERS_BINDING);
            protocolMarshaller.marshall(routeResponse.getRouteResponseId(), ROUTERESPONSEID_BINDING);
            protocolMarshaller.marshall(routeResponse.getRouteResponseKey(), ROUTERESPONSEKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
