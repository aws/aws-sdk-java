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
 * RegisterTaskDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterTaskDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> FAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("family").build();
    private static final MarshallingInfo<String> TASKROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRoleArn").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<String> NETWORKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkMode").build();
    private static final MarshallingInfo<List> CONTAINERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerDefinitions").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementConstraints").build();
    private static final MarshallingInfo<List> REQUIRESCOMPATIBILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiresCompatibilities").build();
    private static final MarshallingInfo<String> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> PIDMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pidMode").build();
    private static final MarshallingInfo<String> IPCMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipcMode").build();
    private static final MarshallingInfo<StructuredPojo> PROXYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proxyConfiguration").build();

    private static final RegisterTaskDefinitionRequestMarshaller instance = new RegisterTaskDefinitionRequestMarshaller();

    public static RegisterTaskDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterTaskDefinitionRequest registerTaskDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerTaskDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getFamily(), FAMILY_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getTaskRoleArn(), TASKROLEARN_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getNetworkMode(), NETWORKMODE_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getContainerDefinitions(), CONTAINERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getRequiresCompatibilities(), REQUIRESCOMPATIBILITIES_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getPidMode(), PIDMODE_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getIpcMode(), IPCMODE_BINDING);
            protocolMarshaller.marshall(registerTaskDefinitionRequest.getProxyConfiguration(), PROXYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
