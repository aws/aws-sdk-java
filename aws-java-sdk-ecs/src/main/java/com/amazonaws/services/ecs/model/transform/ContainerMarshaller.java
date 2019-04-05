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
 * ContainerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerMarshaller {

    private static final MarshallingInfo<String> CONTAINERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerArn").build();
    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatus").build();
    private static final MarshallingInfo<Integer> EXITCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exitCode").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<List> NETWORKBINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkBindings").build();
    private static final MarshallingInfo<List> NETWORKINTERFACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaces").build();
    private static final MarshallingInfo<String> HEALTHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthStatus").build();
    private static final MarshallingInfo<String> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<String> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryReservation").build();
    private static final MarshallingInfo<List> GPUIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gpuIds").build();

    private static final ContainerMarshaller instance = new ContainerMarshaller();

    public static ContainerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Container container, ProtocolMarshaller protocolMarshaller) {

        if (container == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(container.getContainerArn(), CONTAINERARN_BINDING);
            protocolMarshaller.marshall(container.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(container.getName(), NAME_BINDING);
            protocolMarshaller.marshall(container.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(container.getExitCode(), EXITCODE_BINDING);
            protocolMarshaller.marshall(container.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(container.getNetworkBindings(), NETWORKBINDINGS_BINDING);
            protocolMarshaller.marshall(container.getNetworkInterfaces(), NETWORKINTERFACES_BINDING);
            protocolMarshaller.marshall(container.getHealthStatus(), HEALTHSTATUS_BINDING);
            protocolMarshaller.marshall(container.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(container.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(container.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(container.getGpuIds(), GPUIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
