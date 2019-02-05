/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerOverrideMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environment").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<Integer> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryReservation").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceRequirements").build();

    private static final ContainerOverrideMarshaller instance = new ContainerOverrideMarshaller();

    public static ContainerOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerOverride containerOverride, ProtocolMarshaller protocolMarshaller) {

        if (containerOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerOverride.getName(), NAME_BINDING);
            protocolMarshaller.marshall(containerOverride.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(containerOverride.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(containerOverride.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(containerOverride.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(containerOverride.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(containerOverride.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
