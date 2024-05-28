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
 * ContainerGroupDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerGroupDefinitionMarshaller {

    private static final MarshallingInfo<String> CONTAINERGROUPDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerGroupDefinitionArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SCHEDULINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchedulingStrategy").build();
    private static final MarshallingInfo<Integer> TOTALMEMORYLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalMemoryLimit").build();
    private static final MarshallingInfo<Integer> TOTALCPULIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCpuLimit").build();
    private static final MarshallingInfo<List> CONTAINERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerDefinitions").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();

    private static final ContainerGroupDefinitionMarshaller instance = new ContainerGroupDefinitionMarshaller();

    public static ContainerGroupDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerGroupDefinition containerGroupDefinition, ProtocolMarshaller protocolMarshaller) {

        if (containerGroupDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerGroupDefinition.getContainerGroupDefinitionArn(), CONTAINERGROUPDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getSchedulingStrategy(), SCHEDULINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getTotalMemoryLimit(), TOTALMEMORYLIMIT_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getTotalCpuLimit(), TOTALCPULIMIT_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getContainerDefinitions(), CONTAINERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(containerGroupDefinition.getStatusReason(), STATUSREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
