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
 * FoundationModelSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FoundationModelSummaryMarshaller {

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

    private static final FoundationModelSummaryMarshaller instance = new FoundationModelSummaryMarshaller();

    public static FoundationModelSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FoundationModelSummary foundationModelSummary, ProtocolMarshaller protocolMarshaller) {

        if (foundationModelSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(foundationModelSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getProviderName(), PROVIDERNAME_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getInputModalities(), INPUTMODALITIES_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getOutputModalities(), OUTPUTMODALITIES_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getResponseStreamingSupported(), RESPONSESTREAMINGSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getCustomizationsSupported(), CUSTOMIZATIONSSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getInferenceTypesSupported(), INFERENCETYPESSUPPORTED_BINDING);
            protocolMarshaller.marshall(foundationModelSummary.getModelLifecycle(), MODELLIFECYCLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
