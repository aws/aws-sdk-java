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
 * EcsContainerOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EcsContainerOverrideMarshaller {

    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Command").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cpu").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<List> ENVIRONMENTFILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentFiles").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Memory").build();
    private static final MarshallingInfo<Integer> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryReservation").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceRequirements").build();

    private static final EcsContainerOverrideMarshaller instance = new EcsContainerOverrideMarshaller();

    public static EcsContainerOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EcsContainerOverride ecsContainerOverride, ProtocolMarshaller protocolMarshaller) {

        if (ecsContainerOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ecsContainerOverride.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getEnvironmentFiles(), ENVIRONMENTFILES_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getName(), NAME_BINDING);
            protocolMarshaller.marshall(ecsContainerOverride.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
