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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhuborchestrator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepAutomationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepAutomationConfigurationMarshaller {

    private static final MarshallingInfo<String> SCRIPTLOCATIONS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptLocationS3Bucket").build();
    private static final MarshallingInfo<StructuredPojo> SCRIPTLOCATIONS3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptLocationS3Key").build();
    private static final MarshallingInfo<StructuredPojo> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("command").build();
    private static final MarshallingInfo<String> RUNENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runEnvironment").build();
    private static final MarshallingInfo<String> TARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetType").build();

    private static final StepAutomationConfigurationMarshaller instance = new StepAutomationConfigurationMarshaller();

    public static StepAutomationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepAutomationConfiguration stepAutomationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (stepAutomationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepAutomationConfiguration.getScriptLocationS3Bucket(), SCRIPTLOCATIONS3BUCKET_BINDING);
            protocolMarshaller.marshall(stepAutomationConfiguration.getScriptLocationS3Key(), SCRIPTLOCATIONS3KEY_BINDING);
            protocolMarshaller.marshall(stepAutomationConfiguration.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(stepAutomationConfiguration.getRunEnvironment(), RUNENVIRONMENT_BINDING);
            protocolMarshaller.marshall(stepAutomationConfiguration.getTargetType(), TARGETTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
