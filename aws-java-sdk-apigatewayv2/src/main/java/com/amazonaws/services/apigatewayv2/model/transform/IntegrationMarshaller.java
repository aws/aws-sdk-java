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
 * IntegrationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IntegrationMarshaller {

    private static final MarshallingInfo<String> CONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionId").build();
    private static final MarshallingInfo<String> CONNECTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionType").build();
    private static final MarshallingInfo<String> CONTENTHANDLINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentHandlingStrategy").build();
    private static final MarshallingInfo<String> CREDENTIALSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> INTEGRATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationId").build();
    private static final MarshallingInfo<String> INTEGRATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationMethod").build();
    private static final MarshallingInfo<String> INTEGRATIONRESPONSESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationResponseSelectionExpression").build();
    private static final MarshallingInfo<String> INTEGRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationType").build();
    private static final MarshallingInfo<String> INTEGRATIONURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationUri").build();
    private static final MarshallingInfo<String> PASSTHROUGHBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passthroughBehavior").build();
    private static final MarshallingInfo<Map> REQUESTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestParameters").build();
    private static final MarshallingInfo<Map> REQUESTTEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestTemplates").build();
    private static final MarshallingInfo<String> TEMPLATESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateSelectionExpression").build();
    private static final MarshallingInfo<Integer> TIMEOUTINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInMillis").build();

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
            protocolMarshaller.marshall(integration.getConnectionId(), CONNECTIONID_BINDING);
            protocolMarshaller.marshall(integration.getConnectionType(), CONNECTIONTYPE_BINDING);
            protocolMarshaller.marshall(integration.getContentHandlingStrategy(), CONTENTHANDLINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(integration.getCredentialsArn(), CREDENTIALSARN_BINDING);
            protocolMarshaller.marshall(integration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationId(), INTEGRATIONID_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationMethod(), INTEGRATIONMETHOD_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationResponseSelectionExpression(), INTEGRATIONRESPONSESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationType(), INTEGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(integration.getIntegrationUri(), INTEGRATIONURI_BINDING);
            protocolMarshaller.marshall(integration.getPassthroughBehavior(), PASSTHROUGHBEHAVIOR_BINDING);
            protocolMarshaller.marshall(integration.getRequestParameters(), REQUESTPARAMETERS_BINDING);
            protocolMarshaller.marshall(integration.getRequestTemplates(), REQUESTTEMPLATES_BINDING);
            protocolMarshaller.marshall(integration.getTemplateSelectionExpression(), TEMPLATESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(integration.getTimeoutInMillis(), TIMEOUTINMILLIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
