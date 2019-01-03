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
 * IntegrationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IntegrationMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpMethod").build();
    private static final MarshallingInfo<String> URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uri").build();
    private static final MarshallingInfo<String> CONNECTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionType").build();
    private static final MarshallingInfo<String> CONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionId").build();
    private static final MarshallingInfo<String> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentials").build();
    private static final MarshallingInfo<Map> REQUESTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestParameters").build();
    private static final MarshallingInfo<Map> REQUESTTEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestTemplates").build();
    private static final MarshallingInfo<String> PASSTHROUGHBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passthroughBehavior").build();
    private static final MarshallingInfo<String> CONTENTHANDLING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentHandling").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMillis").build();
    private static final MarshallingInfo<String> CACHENAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheNamespace").build();
    private static final MarshallingInfo<List> CACHEKEYPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheKeyParameters").build();
    private static final MarshallingInfo<Map> INTEGRATIONRESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationResponses").build();

    private static final IntegrationMarshaller instance = new IntegrationMarshaller();

    public static IntegrationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Integration integration, ProtocolMarshaller protocolMarshaller) {

        if (integration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(integration.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(integration.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(integration.getUri(), URI_BINDING);
            protocolMarshaller.marshall(integration.getConnectionType(), CONNECTIONTYPE_BINDING);
            protocolMarshaller.marshall(integration.getConnectionId(), CONNECTIONID_BINDING);
            protocolMarshaller.marshall(integration.getCredentials(), CREDENTIALS_BINDING);
            protocolMarshaller.marshall(integration.getRequestParameters(), REQUESTPARAMETERS_BINDING);
            protocolMarshaller.marshall(integration.getRequestTemplates(), REQUESTTEMPLATES_BINDING);
            protocolMarshaller.marshall(integration.getPassthroughBehavior(), PASSTHROUGHBEHAVIOR_BINDING);
            protocolMarshaller.marshall(integration.getContentHandling(), CONTENTHANDLING_BINDING);
            protocolMarshaller.marshall(integration.getTimeoutInMillis(), TIMEOUTINMILLIS_BINDING);
            protocolMarshaller.marshall(integration.getCacheNamespace(), CACHENAMESPACE_BINDING);
            protocolMarshaller.marshall(integration.getCacheKeyParameters(), CACHEKEYPARAMETERS_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationResponses(), INTEGRATIONRESPONSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
