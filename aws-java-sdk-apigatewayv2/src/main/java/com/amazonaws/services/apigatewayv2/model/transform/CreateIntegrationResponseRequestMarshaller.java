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
 * CreateIntegrationResponseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIntegrationResponseRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> CONTENTHANDLINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentHandlingStrategy").build();
    private static final MarshallingInfo<String> INTEGRATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("integrationId").build();
    private static final MarshallingInfo<String> INTEGRATIONRESPONSEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("integrationResponseKey").build();
    private static final MarshallingInfo<Map> RESPONSEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseParameters").build();
    private static final MarshallingInfo<Map> RESPONSETEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseTemplates").build();
    private static final MarshallingInfo<String> TEMPLATESELECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateSelectionExpression").build();

    private static final CreateIntegrationResponseRequestMarshaller instance = new CreateIntegrationResponseRequestMarshaller();

    public static CreateIntegrationResponseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIntegrationResponseRequest createIntegrationResponseRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIntegrationResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIntegrationResponseRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getContentHandlingStrategy(), CONTENTHANDLINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getIntegrationId(), INTEGRATIONID_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getIntegrationResponseKey(), INTEGRATIONRESPONSEKEY_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getResponseParameters(), RESPONSEPARAMETERS_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getResponseTemplates(), RESPONSETEMPLATES_BINDING);
            protocolMarshaller.marshall(createIntegrationResponseRequest.getTemplateSelectionExpression(), TEMPLATESELECTIONEXPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
