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
 * UpdateIntegrationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateIntegrationRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
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
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("integrationId").build();
    private static final MarshallingInfo<String> INTEGRATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationMethod").build();
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

    private static final UpdateIntegrationRequestMarshaller instance = new UpdateIntegrationRequestMarshaller();

    public static UpdateIntegrationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateIntegrationRequest updateIntegrationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateIntegrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateIntegrationRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getConnectionId(), CONNECTIONID_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getConnectionType(), CONNECTIONTYPE_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getContentHandlingStrategy(), CONTENTHANDLINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getCredentialsArn(), CREDENTIALSARN_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getIntegrationId(), INTEGRATIONID_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getIntegrationMethod(), INTEGRATIONMETHOD_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getIntegrationType(), INTEGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getIntegrationUri(), INTEGRATIONURI_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getPassthroughBehavior(), PASSTHROUGHBEHAVIOR_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getRequestParameters(), REQUESTPARAMETERS_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getRequestTemplates(), REQUESTTEMPLATES_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getTemplateSelectionExpression(), TEMPLATESELECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getTimeoutInMillis(), TIMEOUTINMILLIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
