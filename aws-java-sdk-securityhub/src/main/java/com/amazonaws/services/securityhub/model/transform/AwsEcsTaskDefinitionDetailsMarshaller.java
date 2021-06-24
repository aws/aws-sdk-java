/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionDetailsMarshaller {

    private static final MarshallingInfo<List> CONTAINERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerDefinitions").build();
    private static final MarshallingInfo<String> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cpu").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<String> FAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Family").build();
    private static final MarshallingInfo<List> INFERENCEACCELERATORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceAccelerators").build();
    private static final MarshallingInfo<String> IPCMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpcMode").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Memory").build();
    private static final MarshallingInfo<String> NETWORKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkMode").build();
    private static final MarshallingInfo<String> PIDMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PidMode").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementConstraints").build();
    private static final MarshallingInfo<StructuredPojo> PROXYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProxyConfiguration").build();
    private static final MarshallingInfo<List> REQUIRESCOMPATIBILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequiresCompatibilities").build();
    private static final MarshallingInfo<String> TASKROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskRoleArn").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Volumes").build();

    private static final AwsEcsTaskDefinitionDetailsMarshaller instance = new AwsEcsTaskDefinitionDetailsMarshaller();

    public static AwsEcsTaskDefinitionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionDetails awsEcsTaskDefinitionDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getContainerDefinitions(), CONTAINERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getFamily(), FAMILY_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getInferenceAccelerators(), INFERENCEACCELERATORS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getIpcMode(), IPCMODE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getNetworkMode(), NETWORKMODE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getPidMode(), PIDMODE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getProxyConfiguration(), PROXYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getRequiresCompatibilities(), REQUIRESCOMPATIBILITIES_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getTaskRoleArn(), TASKROLEARN_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionDetails.getVolumes(), VOLUMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
