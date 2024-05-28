/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FoundationModelDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FoundationModelDetailsMarshaller {

    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelArn").build();
    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelName").build();
    private static final MarshallingInfo<String> PROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("providerName").build();
    private static final MarshallingInfo<List> INPUTMODALITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputModalities").build();
    private static final MarshallingInfo<List> OUTPUTMODALITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputModalities").build();
    private static final MarshallingInfo<Boolean> RESPONSESTREAMINGSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseStreamingSupported").build();
    private static final MarshallingInfo<List> CUSTOMIZATIONSSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customizationsSupported").build();
    private static final MarshallingInfo<List> INFERENCETYPESSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferenceTypesSupported").build();
    private static final MarshallingInfo<StructuredPojo> MODELLIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelLifecycle").build();

    private static final FoundationModelDetailsMarshaller instance = new FoundationModelDetailsMarshaller();

    public static FoundationModelDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FoundationModelDetails foundationModelDetails, ProtocolMarshaller protocolMarshaller) {

        if (foundationModelDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(foundationModelDetails.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getProviderName(), PROVIDERNAME_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getInputModalities(), INPUTMODALITIES_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getOutputModalities(), OUTPUTMODALITIES_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getResponseStreamingSupported(), RESPONSESTREAMINGSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getCustomizationsSupported(), CUSTOMIZATIONSSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getInferenceTypesSupported(), INFERENCETYPESSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelDetails.getModelLifecycle(), MODELLIFECYCLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
