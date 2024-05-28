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
package com.amazonaws.services.batch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskContainerDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskContainerDetailsMarshaller {

    private static final MarshallingInfo<List> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("command").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dependsOn").build();
    private static final MarshallingInfo<List> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("environment").build();
    private static final MarshallingInfo<Boolean> ESSENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("essential").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<StructuredPojo> LINUXPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linuxParameters").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logConfiguration").build();
    private static final MarshallingInfo<List> MOUNTPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mountPoints").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privileged").build();
    private static final MarshallingInfo<Boolean> READONLYROOTFILESYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readonlyRootFilesystem").build();
    private static final MarshallingInfo<StructuredPojo> REPOSITORYCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryCredentials").build();
    private static final MarshallingInfo<List> RESOURCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceRequirements").build();
    private static final MarshallingInfo<List> SECRETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("secrets").build();
    private static final MarshallingInfo<List> ULIMITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ulimits").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("user").build();
    private static final MarshallingInfo<Integer> EXITCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exitCode").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<String> LOGSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamName").build();
    private static final MarshallingInfo<List> NETWORKINTERFACES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaces").build();

    private static final TaskContainerDetailsMarshaller instance = new TaskContainerDetailsMarshaller();

    public static TaskContainerDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskContainerDetails taskContainerDetails, ProtocolMarshaller protocolMarshaller) {

        if (taskContainerDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskContainerDetails.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getEssential(), ESSENTIAL_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getLinuxParameters(), LINUXPARAMETERS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getLogConfiguration(), LOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getMountPoints(), MOUNTPOINTS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getPrivileged(), PRIVILEGED_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getReadonlyRootFilesystem(), READONLYROOTFILESYSTEM_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getRepositoryCredentials(), REPOSITORYCREDENTIALS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getResourceRequirements(), RESOURCEREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getSecrets(), SECRETS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getUlimits(), ULIMITS_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getUser(), USER_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getExitCode(), EXITCODE_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getLogStreamName(), LOGSTREAMNAME_BINDING);
            protocolMarshaller.marshall(taskContainerDetails.getNetworkInterfaces(), NETWORKINTERFACES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
