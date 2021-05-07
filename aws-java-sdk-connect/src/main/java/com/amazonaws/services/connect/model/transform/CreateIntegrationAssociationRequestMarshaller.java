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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIntegrationAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIntegrationAssociationRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> INTEGRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegrationType").build();
    private static final MarshallingInfo<String> INTEGRATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegrationArn").build();
    private static final MarshallingInfo<String> SOURCEAPPLICATIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceApplicationUrl").build();
    private static final MarshallingInfo<String> SOURCEAPPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceApplicationName").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateIntegrationAssociationRequestMarshaller instance = new CreateIntegrationAssociationRequestMarshaller();

    public static CreateIntegrationAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIntegrationAssociationRequest createIntegrationAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIntegrationAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getIntegrationType(), INTEGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getIntegrationArn(), INTEGRATIONARN_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getSourceApplicationUrl(), SOURCEAPPLICATIONURL_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getSourceApplicationName(), SOURCEAPPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(createIntegrationAssociationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
