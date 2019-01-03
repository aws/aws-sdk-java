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
 * GameSessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GameSessionMarshaller {

    private static final MarshallingInfo<String> GAMESESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TERMINATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> CURRENTPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentPlayerSessionCount").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();
    private static final MarshallingInfo<List> GAMEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameProperties").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> PLAYERSESSIONCREATIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlayerSessionCreationPolicy").build();
    private static final MarshallingInfo<String> CREATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatorId").build();
    private static final MarshallingInfo<String> GAMESESSIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionData").build();
    private static final MarshallingInfo<String> MATCHMAKERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchmakerData").build();

    private static final GameSessionMarshaller instance = new GameSessionMarshaller();

    public static GameSessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GameSession gameSession, ProtocolMarshaller protocolMarshaller) {

        if (gameSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gameSession.getGameSessionId(), GAMESESSIONID_BINDING);
            protocolMarshaller.marshall(gameSession.getName(), NAME_BINDING);
            protocolMarshaller.marshall(gameSession.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(gameSession.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(gameSession.getTerminationTime(), TERMINATIONTIME_BINDING);
            protocolMarshaller.marshall(gameSession.getCurrentPlayerSessionCount(), CURRENTPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(gameSession.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(gameSession.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(gameSession.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(gameSession.getGameProperties(), GAMEPROPERTIES_BINDING);
            protocolMarshaller.marshall(gameSession.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(gameSession.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(gameSession.getPlayerSessionCreationPolicy(), PLAYERSESSIONCREATIONPOLICY_BINDING);
            protocolMarshaller.marshall(gameSession.getCreatorId(), CREATORID_BINDING);
            protocolMarshaller.marshall(gameSession.getGameSessionData(), GAMESESSIONDATA_BINDING);
            protocolMarshaller.marshall(gameSession.getMatchmakerData(), MATCHMAKERDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
