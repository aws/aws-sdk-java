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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EcsParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EcsParametersMarshaller {

    private static final MarshallingInfo<String> TASKDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskDefinitionArn").build();
    private static final MarshallingInfo<Integer> TASKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskCount").build();
    private static final MarshallingInfo<String> LAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchType").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfiguration").build();
    private static final MarshallingInfo<String> PLATFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformVersion").build();
    private static final MarshallingInfo<String> GROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Group").build();
    private static final MarshallingInfo<List> CAPACITYPROVIDERSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityProviderStrategy").build();
    private static final MarshallingInfo<Boolean> ENABLEECSMANAGEDTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableECSManagedTags").build();
    private static final MarshallingInfo<Boolean> ENABLEEXECUTECOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableExecuteCommand").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementConstraints").build();
    private static final MarshallingInfo<List> PLACEMENTSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementStrategy").build();
    private static final MarshallingInfo<String> PROPAGATETAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PropagateTags").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final EcsParametersMarshaller instance = new EcsParametersMarshaller();

    public static EcsParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EcsParameters ecsParameters, ProtocolMarshaller protocolMarshaller) {

        if (ecsParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ecsParameters.getTaskDefinitionArn(), TASKDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(ecsParameters.getTaskCount(), TASKCOUNT_BINDING);
            protocolMarshaller.marshall(ecsParameters.getLaunchType(), LAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(ecsParameters.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(ecsParameters.getPlatformVersion(), PLATFORMVERSION_BINDING);
            protocolMarshaller.marshall(ecsParameters.getGroup(), GROUP_BINDING);
            protocolMarshaller.marshall(ecsParameters.getCapacityProviderStrategy(), CAPACITYPROVIDERSTRATEGY_BINDING);
            protocolMarshaller.marshall(ecsParameters.getEnableECSManagedTags(), ENABLEECSMANAGEDTAGS_BINDING);
            protocolMarshaller.marshall(ecsParameters.getEnableExecuteCommand(), ENABLEEXECUTECOMMAND_BINDING);
            protocolMarshaller.marshall(ecsParameters.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(ecsParameters.getPlacementStrategy(), PLACEMENTSTRATEGY_BINDING);
            protocolMarshaller.marshall(ecsParameters.getPropagateTags(), PROPAGATETAGS_BINDING);
            protocolMarshaller.marshall(ecsParameters.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(ecsParameters.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
