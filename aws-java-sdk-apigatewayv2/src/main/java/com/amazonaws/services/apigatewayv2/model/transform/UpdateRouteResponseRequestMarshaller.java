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
 * UpdateRouteResponseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRouteResponseRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> MODELSELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelSelectionExpression").build();
    private static final MarshallingInfo<Map> RESPONSEMODELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("responseModels").build();
    private static final MarshallingInfo<Map> RESPONSEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseParameters").build();
    private static final MarshallingInfo<String> ROUTEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("routeId").build();
    private static final MarshallingInfo<String> ROUTERESPONSEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("routeResponseId").build();
    private static final MarshallingInfo<String> ROUTERESPONSEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeResponseKey").build();

    private static final UpdateRouteResponseRequestMarshaller instance = new UpdateRouteResponseRequestMarshaller();

    public static UpdateRouteResponseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRouteResponseRequest updateRouteResponseRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRouteResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRouteResponseRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getModelSelectionExpression(), MODELSELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getResponseModels(), RESPONSEMODELS_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getResponseParameters(), RESPONSEPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getRouteId(), ROUTEID_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getRouteResponseId(), ROUTERESPONSEID_BINDING);
            protocolMarshaller.marshall(updateRouteResponseRequest.getRouteResponseKey(), ROUTERESPONSEKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
