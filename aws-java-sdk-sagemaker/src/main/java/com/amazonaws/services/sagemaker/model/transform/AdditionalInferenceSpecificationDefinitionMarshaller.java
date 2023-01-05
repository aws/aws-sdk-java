/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdditionalInferenceSpecificationDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdditionalInferenceSpecificationDefinitionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Containers").build();
    private static final MarshallingInfo<List> SUPPORTEDTRANSFORMINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedTransformInstanceTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDREALTIMEINFERENCEINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedRealtimeInferenceInstanceTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDCONTENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedContentTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDRESPONSEMIMETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedResponseMIMETypes").build();

    private static final AdditionalInferenceSpecificationDefinitionMarshaller instance = new AdditionalInferenceSpecificationDefinitionMarshaller();

    public static AdditionalInferenceSpecificationDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdditionalInferenceSpecificationDefinition additionalInferenceSpecificationDefinition, ProtocolMarshaller protocolMarshaller) {

        if (additionalInferenceSpecificationDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getSupportedTransformInstanceTypes(),
                    SUPPORTEDTRANSFORMINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getSupportedRealtimeInferenceInstanceTypes(),
                    SUPPORTEDREALTIMEINFERENCEINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getSupportedContentTypes(), SUPPORTEDCONTENTTYPES_BINDING);
            protocolMarshaller.marshall(additionalInferenceSpecificationDefinition.getSupportedResponseMIMETypes(), SUPPORTEDRESPONSEMIMETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
