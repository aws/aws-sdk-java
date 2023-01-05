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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceConfigurationMarshaller {

    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<List> CONTAINERCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerConfigurations").build();
    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingConfiguration").build();
    private static final MarshallingInfo<String> TASKDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinitionArn").build();

    private static final ServiceConfigurationMarshaller instance = new ServiceConfigurationMarshaller();

    public static ServiceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceConfiguration serviceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serviceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceConfiguration.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(serviceConfiguration.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(serviceConfiguration.getContainerConfigurations(), CONTAINERCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(serviceConfiguration.getAutoScalingConfiguration(), AUTOSCALINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(serviceConfiguration.getTaskDefinitionArn(), TASKDEFINITIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
