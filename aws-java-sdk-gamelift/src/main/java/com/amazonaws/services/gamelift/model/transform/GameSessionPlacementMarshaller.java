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
 * GameSessionPlacementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GameSessionPlacementMarshaller {

    private static final MarshallingInfo<String> PLACEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementId").build();
    private static final MarshallingInfo<String> GAMESESSIONQUEUENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionQueueName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> GAMEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameProperties").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();
    private static final MarshallingInfo<String> GAMESESSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionName").build();
    private static final MarshallingInfo<String> GAMESESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionId").build();
    private static final MarshallingInfo<String> GAMESESSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionArn").build();
    private static final MarshallingInfo<String> GAMESESSIONREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionRegion").build();
    private static final MarshallingInfo<List> PLAYERLATENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlayerLatencies").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<List> PLACEDPLAYERSESSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacedPlayerSessions").build();
    private static final MarshallingInfo<String> GAMESESSIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionData").build();
    private static final MarshallingInfo<String> MATCHMAKERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchmakerData").build();

    private static final GameSessionPlacementMarshaller instance = new GameSessionPlacementMarshaller();

    public static GameSessionPlacementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GameSessionPlacement gameSessionPlacement, ProtocolMarshaller protocolMarshaller) {

        if (gameSessionPlacement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gameSessionPlacement.getPlacementId(), PLACEMENTID_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionQueueName(), GAMESESSIONQUEUENAME_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameProperties(), GAMEPROPERTIES_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionName(), GAMESESSIONNAME_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionId(), GAMESESSIONID_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionArn(), GAMESESSIONARN_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionRegion(), GAMESESSIONREGION_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getPlayerLatencies(), PLAYERLATENCIES_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getPlacedPlayerSessions(), PLACEDPLAYERSESSIONS_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getGameSessionData(), GAMESESSIONDATA_BINDING);
            protocolMarshaller.marshall(gameSessionPlacement.getMatchmakerData(), MATCHMAKERDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
