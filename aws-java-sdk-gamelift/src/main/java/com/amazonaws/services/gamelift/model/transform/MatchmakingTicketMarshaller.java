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
 * MatchmakingTicketMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MatchmakingTicketMarshaller {

    private static final MarshallingInfo<String> TICKETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TicketId").build();
    private static final MarshallingInfo<String> CONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> PLAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Players").build();
    private static final MarshallingInfo<StructuredPojo> GAMESESSIONCONNECTIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionConnectionInfo").build();
    private static final MarshallingInfo<Integer> ESTIMATEDWAITTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedWaitTime").build();

    private static final MatchmakingTicketMarshaller instance = new MatchmakingTicketMarshaller();

    public static MatchmakingTicketMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MatchmakingTicket matchmakingTicket, ProtocolMarshaller protocolMarshaller) {

        if (matchmakingTicket == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(matchmakingTicket.getTicketId(), TICKETID_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getPlayers(), PLAYERS_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getGameSessionConnectionInfo(), GAMESESSIONCONNECTIONINFO_BINDING);
            protocolMarshaller.marshall(matchmakingTicket.getEstimatedWaitTime(), ESTIMATEDWAITTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
