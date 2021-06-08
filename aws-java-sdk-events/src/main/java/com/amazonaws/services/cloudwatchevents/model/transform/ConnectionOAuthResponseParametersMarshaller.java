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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionOAuthResponseParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionOAuthResponseParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLIENTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientParameters").build();
    private static final MarshallingInfo<String> AUTHORIZATIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizationEndpoint").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpMethod").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHHTTPPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OAuthHttpParameters").build();

    private static final ConnectionOAuthResponseParametersMarshaller instance = new ConnectionOAuthResponseParametersMarshaller();

    public static ConnectionOAuthResponseParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectionOAuthResponseParameters connectionOAuthResponseParameters, ProtocolMarshaller protocolMarshaller) {

        if (connectionOAuthResponseParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectionOAuthResponseParameters.getClientParameters(), CLIENTPARAMETERS_BINDING);
            protocolMarshaller.marshall(connectionOAuthResponseParameters.getAuthorizationEndpoint(), AUTHORIZATIONENDPOINT_BINDING);
            protocolMarshaller.marshall(connectionOAuthResponseParameters.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(connectionOAuthResponseParameters.getOAuthHttpParameters(), OAUTHHTTPPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
