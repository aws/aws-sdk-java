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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerDefinitionMarshaller {

    private static final MarshallingInfo<String> CONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerName").build();
    private static final MarshallingInfo<String> IMAGEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUri").build();
    private static final MarshallingInfo<String> RESOLVEDIMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResolvedImageDigest").build();
    private static final MarshallingInfo<StructuredPojo> MEMORYLIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryLimits").build();
    private static final MarshallingInfo<StructuredPojo> PORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PortConfiguration").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cpu").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheck").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Command").build();
    private static final MarshallingInfo<Boolean> ESSENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Essential").build();
    private static final MarshallingInfo<List> ENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntryPoint").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkingDirectory").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DependsOn").build();

    private static final ContainerDefinitionMarshaller instance = new ContainerDefinitionMarshaller();

    public static ContainerDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerDefinition containerDefinition, ProtocolMarshaller protocolMarshaller) {

        if (containerDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerDefinition.getContainerName(), CONTAINERNAME_BINDING);
            protocolMarshaller.marshall(containerDefinition.getImageUri(), IMAGEURI_BINDING);
            protocolMarshaller.marshall(containerDefinition.getResolvedImageDigest(), RESOLVEDIMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(containerDefinition.getMemoryLimits(), MEMORYLIMITS_BINDING);
            protocolMarshaller.marshall(containerDefinition.getPortConfiguration(), PORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(containerDefinition.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(containerDefinition.getHealthCheck(), HEALTHCHECK_BINDING);
            protocolMarshaller.marshall(containerDefinition.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEssential(), ESSENTIAL_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEntryPoint(), ENTRYPOINT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(containerDefinition.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(containerDefinition.getDependsOn(), DEPENDSON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
