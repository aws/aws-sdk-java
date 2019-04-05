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
package com.amazonaws.services.batch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerDetailMarshaller {

    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<Integer> VCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vcpus").build();
    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<String> JOBROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobRoleArn").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environment").build();
    private static final MarshallingInfo<List> MOUNTPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mountPoints").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readonlyRootFilesystem").build();
    private static final MarshallingInfo<List> ULIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ulimits").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privileged").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("user").build();
    private static final MarshallingInfo<Integer> EXITCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exitCode").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<String> CONTAINERINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerInstanceArn").build();
    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskArn").build();
    private static final MarshallingInfo<String> LOGSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamName").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<List> NETWORKINTERFACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaces").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceRequirements").build();

    private static final ContainerDetailMarshaller instance = new ContainerDetailMarshaller();

    public static ContainerDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerDetail containerDetail, ProtocolMarshaller protocolMarshaller) {

        if (containerDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerDetail.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(containerDetail.getVcpus(), VCPUS_BINDING);
            protocolMarshaller.marshall(containerDetail.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(containerDetail.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(containerDetail.getJobRoleArn(), JOBROLEARN_BINDING);
            protocolMarshaller.marshall(containerDetail.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(containerDetail.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(containerDetail.getMountPoints(), MOUNTPOINTS_BINDING);
            protocolMarshaller.marshall(containerDetail.getReadonlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(containerDetail.getUlimits(), ULIMITS_BINDING);
            protocolMarshaller.marshall(containerDetail.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(containerDetail.getUser(), USER_BINDING);
            protocolMarshaller.marshall(containerDetail.getExitCode(), EXITCODE_BINDING);
            protocolMarshaller.marshall(containerDetail.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(containerDetail.getContainerInstanceArn(), CONTAINERINSTANCEARN_BINDING);
            protocolMarshaller.marshall(containerDetail.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(containerDetail.getLogStreamName(), LOGSTREAMNAME_BINDING);
            protocolMarshaller.marshall(containerDetail.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(containerDetail.getNetworkInterfaces(), NETWORKINTERFACES_BINDING);
            protocolMarshaller.marshall(containerDetail.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
