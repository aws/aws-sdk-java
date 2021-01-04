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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGameServerGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGameServerGroupRequestMarshaller {

    private static final MarshallingInfo<String> GAMESERVERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameServerGroupName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<Integer> MINSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MinSize").build();
    private static final MarshallingInfo<Integer> MAXSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxSize").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTemplate").build();
    private static final MarshallingInfo<List> INSTANCEDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceDefinitions").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSCALINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingPolicy").build();
    private static final MarshallingInfo<String> BALANCINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BalancingStrategy").build();
    private static final MarshallingInfo<String> GAMESERVERPROTECTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameServerProtectionPolicy").build();
    private static final MarshallingInfo<List> VPCSUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcSubnets").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateGameServerGroupRequestMarshaller instance = new CreateGameServerGroupRequestMarshaller();

    public static CreateGameServerGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGameServerGroupRequest createGameServerGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGameServerGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGameServerGroupRequest.getGameServerGroupName(), GAMESERVERGROUPNAME_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getMinSize(), MINSIZE_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getMaxSize(), MAXSIZE_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getLaunchTemplate(), LAUNCHTEMPLATE_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getInstanceDefinitions(), INSTANCEDEFINITIONS_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getAutoScalingPolicy(), AUTOSCALINGPOLICY_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getBalancingStrategy(), BALANCINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getGameServerProtectionPolicy(), GAMESERVERPROTECTIONPOLICY_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getVpcSubnets(), VPCSUBNETS_BINDING);
            protocolMarshaller.marshall(createGameServerGroupRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
