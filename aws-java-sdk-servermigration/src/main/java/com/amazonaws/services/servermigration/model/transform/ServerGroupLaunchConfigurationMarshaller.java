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
package com.amazonaws.services.servermigration.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServerGroupLaunchConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerGroupLaunchConfigurationMarshaller {

    private static final MarshallingInfo<String> SERVERGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverGroupId").build();
    private static final MarshallingInfo<Integer> LAUNCHORDER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchOrder").build();
    private static final MarshallingInfo<List> SERVERLAUNCHCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverLaunchConfigurations").build();

    private static final ServerGroupLaunchConfigurationMarshaller instance = new ServerGroupLaunchConfigurationMarshaller();

    public static ServerGroupLaunchConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerGroupLaunchConfiguration serverGroupLaunchConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serverGroupLaunchConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverGroupLaunchConfiguration.getServerGroupId(), SERVERGROUPID_BINDING);
            protocolMarshaller.marshall(serverGroupLaunchConfiguration.getLaunchOrder(), LAUNCHORDER_BINDING);
            protocolMarshaller.marshall(serverGroupLaunchConfiguration.getServerLaunchConfigurations(), SERVERLAUNCHCONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
