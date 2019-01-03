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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRouteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRouteRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<Boolean> APIKEYREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiKeyRequired").build();
    private static final MarshallingInfo<List> AUTHORIZATIONSCOPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationScopes").build();
    private static final MarshallingInfo<String> AUTHORIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationType").build();
    private static final MarshallingInfo<String> AUTHORIZERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerId").build();
    private static final MarshallingInfo<String> MODELSELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelSelectionExpression").build();
    private static final MarshallingInfo<String> OPERATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationName").build();
    private static final MarshallingInfo<Map> REQUESTMODELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestModels").build();
    private static final MarshallingInfo<Map> REQUESTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestParameters").build();
    private static final MarshallingInfo<String> ROUTEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("routeKey").build();
    private static final MarshallingInfo<String> ROUTERESPONSESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routeResponseSelectionExpression").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("target").build();

    private static final CreateRouteRequestMarshaller instance = new CreateRouteRequestMarshaller();

    public static CreateRouteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRouteRequest createRouteRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRouteRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getApiKeyRequired(), APIKEYREQUIRED_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getAuthorizationScopes(), AUTHORIZATIONSCOPES_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getAuthorizationType(), AUTHORIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getAuthorizerId(), AUTHORIZERID_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getModelSelectionExpression(), MODELSELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getOperationName(), OPERATIONNAME_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getRequestModels(), REQUESTMODELS_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getRequestParameters(), REQUESTPARAMETERS_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getRouteKey(), ROUTEKEY_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getRouteResponseSelectionExpression(), ROUTERESPONSESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(createRouteRequest.getTarget(), TARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
