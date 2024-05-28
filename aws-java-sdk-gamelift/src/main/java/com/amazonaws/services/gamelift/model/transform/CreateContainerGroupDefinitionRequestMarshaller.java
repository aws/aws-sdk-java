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
 * CreateContainerGroupDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateContainerGroupDefinitionRequestMarshaller {

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
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateContainerGroupDefinitionRequestMarshaller instance = new CreateContainerGroupDefinitionRequestMarshaller();

    public static CreateContainerGroupDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateContainerGroupDefinitionRequest createContainerGroupDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createContainerGroupDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getSchedulingStrategy(), SCHEDULINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getTotalMemoryLimit(), TOTALMEMORYLIMIT_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getTotalCpuLimit(), TOTALCPULIMIT_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getContainerDefinitions(), CONTAINERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(createContainerGroupDefinitionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
