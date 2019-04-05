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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MethodMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MethodMarshaller {

    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpMethod").build();
    private static final MarshallingInfo<String> AUTHORIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationType").build();
    private static final MarshallingInfo<String> AUTHORIZERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerId").build();
    private static final MarshallingInfo<Boolean> APIKEYREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiKeyRequired").build();
    private static final MarshallingInfo<String> REQUESTVALIDATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestValidatorId").build();
    private static final MarshallingInfo<String> OPERATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operationName").build();
    private static final MarshallingInfo<Map> REQUESTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestParameters").build();
    private static final MarshallingInfo<Map> REQUESTMODELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestModels").build();
    private static final MarshallingInfo<Map> METHODRESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("methodResponses").build();
    private static final MarshallingInfo<StructuredPojo> METHODINTEGRATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("methodIntegration").build();
    private static final MarshallingInfo<List> AUTHORIZATIONSCOPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationScopes").build();

    private static final MethodMarshaller instance = new MethodMarshaller();

    public static MethodMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Method method, ProtocolMarshaller protocolMarshaller) {

        if (method == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(method.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(method.getAuthorizationType(), AUTHORIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(method.getAuthorizerId(), AUTHORIZERID_BINDING);
            protocolMarshaller.marshall(method.getApiKeyRequired(), APIKEYREQUIRED_BINDING);
            protocolMarshaller.marshall(method.getRequestValidatorId(), REQUESTVALIDATORID_BINDING);
            protocolMarshaller.marshall(method.getOperationName(), OPERATIONNAME_BINDING);
            protocolMarshaller.marshall(method.getRequestParameters(), REQUESTPARAMETERS_BINDING);
            protocolMarshaller.marshall(method.getRequestModels(), REQUESTMODELS_BINDING);
            protocolMarshaller.marshall(method.getMethodResponses(), METHODRESPONSES_BINDING);
            protocolMarshaller.marshall(method.getMethodIntegration(), METHODINTEGRATION_BINDING);
            protocolMarshaller.marshall(method.getAuthorizationScopes(), AUTHORIZATIONSCOPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
