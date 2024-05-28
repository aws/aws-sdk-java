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
package com.amazonaws.services.bedrockagentruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagentruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExternalSourcesGenerationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExternalSourcesGenerationConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> GUARDRAILCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("guardrailConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferenceConfig").build();
    private static final MarshallingInfo<StructuredPojo> PROMPTTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptTemplate").build();

    private static final ExternalSourcesGenerationConfigurationMarshaller instance = new ExternalSourcesGenerationConfigurationMarshaller();

    public static ExternalSourcesGenerationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExternalSourcesGenerationConfiguration externalSourcesGenerationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (externalSourcesGenerationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(externalSourcesGenerationConfiguration.getGuardrailConfiguration(), GUARDRAILCONFIGURATION_BINDING);
            protocolMarshaller.marshall(externalSourcesGenerationConfiguration.getInferenceConfig(), INFERENCECONFIG_BINDING);
            protocolMarshaller.marshall(externalSourcesGenerationConfiguration.getPromptTemplate(), PROMPTTEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
