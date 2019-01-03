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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartGameSessionPlacementRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartGameSessionPlacementRequestMarshaller {

    private static final MarshallingInfo<String> PLACEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementId").build();
    private static final MarshallingInfo<String> GAMESESSIONQUEUENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionQueueName").build();
    private static final MarshallingInfo<List> GAMEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameProperties").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();
    private static final MarshallingInfo<String> GAMESESSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionName").build();
    private static final MarshallingInfo<List> PLAYERLATENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlayerLatencies").build();
    private static final MarshallingInfo<List> DESIREDPLAYERSESSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredPlayerSessions").build();
    private static final MarshallingInfo<String> GAMESESSIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionData").build();

    private static final StartGameSessionPlacementRequestMarshaller instance = new StartGameSessionPlacementRequestMarshaller();

    public static StartGameSessionPlacementRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartGameSessionPlacementRequest startGameSessionPlacementRequest, ProtocolMarshaller protocolMarshaller) {

        if (startGameSessionPlacementRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getPlacementId(), PLACEMENTID_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getGameSessionQueueName(), GAMESESSIONQUEUENAME_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getGameProperties(), GAMEPROPERTIES_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getGameSessionName(), GAMESESSIONNAME_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getPlayerLatencies(), PLAYERLATENCIES_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getDesiredPlayerSessions(), DESIREDPLAYERSESSIONS_BINDING);
            protocolMarshaller.marshall(startGameSessionPlacementRequest.getGameSessionData(), GAMESESSIONDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
