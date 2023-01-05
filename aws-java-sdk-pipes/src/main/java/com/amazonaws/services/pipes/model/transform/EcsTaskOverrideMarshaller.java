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
package com.amazonaws.services.pipes.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EcsTaskOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EcsTaskOverrideMarshaller {

    private static final MarshallingInfo<List> CONTAINEROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerOverrides").build();
    private static final MarshallingInfo<String> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cpu").build();
    private static final MarshallingInfo<StructuredPojo> EPHEMERALSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EphemeralStorage").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<List> INFERENCEACCELERATOROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceAcceleratorOverrides").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Memory").build();
    private static final MarshallingInfo<String> TASKROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskRoleArn").build();

    private static final EcsTaskOverrideMarshaller instance = new EcsTaskOverrideMarshaller();

    public static EcsTaskOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EcsTaskOverride ecsTaskOverride, ProtocolMarshaller protocolMarshaller) {

        if (ecsTaskOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ecsTaskOverride.getContainerOverrides(), CONTAINEROVERRIDES_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getEphemeralStorage(), EPHEMERALSTORAGE_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getInferenceAcceleratorOverrides(), INFERENCEACCELERATOROVERRIDES_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(ecsTaskOverride.getTaskRoleArn(), TASKROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
