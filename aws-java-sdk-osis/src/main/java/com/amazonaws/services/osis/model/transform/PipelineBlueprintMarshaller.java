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
package com.amazonaws.services.osis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.osis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineBlueprintMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineBlueprintMarshaller {

    private static final MarshallingInfo<String> BLUEPRINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintName").build();
    private static final MarshallingInfo<String> PIPELINECONFIGURATIONBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineConfigurationBody").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> DISPLAYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayDescription").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Service").build();
    private static final MarshallingInfo<String> USECASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UseCase").build();

    private static final PipelineBlueprintMarshaller instance = new PipelineBlueprintMarshaller();

    public static PipelineBlueprintMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineBlueprint pipelineBlueprint, ProtocolMarshaller protocolMarshaller) {

        if (pipelineBlueprint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineBlueprint.getBlueprintName(), BLUEPRINTNAME_BINDING);
            protocolMarshaller.marshall(pipelineBlueprint.getPipelineConfigurationBody(), PIPELINECONFIGURATIONBODY_BINDING);
            protocolMarshaller.marshall(pipelineBlueprint.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(pipelineBlueprint.getDisplayDescription(), DISPLAYDESCRIPTION_BINDING);
            protocolMarshaller.marshall(pipelineBlueprint.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(pipelineBlueprint.getUseCase(), USECASE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
