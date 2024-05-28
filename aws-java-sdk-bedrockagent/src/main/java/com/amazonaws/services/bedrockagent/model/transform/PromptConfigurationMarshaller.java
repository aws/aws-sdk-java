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
package com.amazonaws.services.bedrockagent.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PromptConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PromptConfigurationMarshaller {

    private static final MarshallingInfo<String> BASEPROMPTTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basePromptTemplate").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferenceConfiguration").build();
    private static final MarshallingInfo<String> PARSERMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parserMode").build();
    private static final MarshallingInfo<String> PROMPTCREATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptCreationMode").build();
    private static final MarshallingInfo<String> PROMPTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptState").build();
    private static final MarshallingInfo<String> PROMPTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptType").build();

    private static final PromptConfigurationMarshaller instance = new PromptConfigurationMarshaller();

    public static PromptConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PromptConfiguration promptConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (promptConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(promptConfiguration.getBasePromptTemplate(), BASEPROMPTTEMPLATE_BINDING);
            protocolMarshaller.marshall(promptConfiguration.getInferenceConfiguration(), INFERENCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(promptConfiguration.getParserMode(), PARSERMODE_BINDING);
            protocolMarshaller.marshall(promptConfiguration.getPromptCreationMode(), PROMPTCREATIONMODE_BINDING);
            protocolMarshaller.marshall(promptConfiguration.getPromptState(), PROMPTSTATE_BINDING);
            protocolMarshaller.marshall(promptConfiguration.getPromptType(), PROMPTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
