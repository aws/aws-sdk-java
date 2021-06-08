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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterGameServerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterGameServerRequestMarshaller {

    private static final MarshallingInfo<String> GAMESERVERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameServerGroupName").build();
    private static final MarshallingInfo<String> GAMESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameServerId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> CONNECTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionInfo").build();
    private static final MarshallingInfo<String> GAMESERVERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameServerData").build();

    private static final RegisterGameServerRequestMarshaller instance = new RegisterGameServerRequestMarshaller();

    public static RegisterGameServerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterGameServerRequest registerGameServerRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerGameServerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerGameServerRequest.getGameServerGroupName(), GAMESERVERGROUPNAME_BINDING);
            protocolMarshaller.marshall(registerGameServerRequest.getGameServerId(), GAMESERVERID_BINDING);
            protocolMarshaller.marshall(registerGameServerRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(registerGameServerRequest.getConnectionInfo(), CONNECTIONINFO_BINDING);
            protocolMarshaller.marshall(registerGameServerRequest.getGameServerData(), GAMESERVERDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
