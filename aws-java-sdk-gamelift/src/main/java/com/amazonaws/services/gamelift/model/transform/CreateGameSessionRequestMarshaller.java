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
 * CreateGameSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGameSessionRequestMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> ALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AliasId").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> GAMEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameProperties").build();
    private static final MarshallingInfo<String> CREATORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatorId").build();
    private static final MarshallingInfo<String> GAMESESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionId").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken").build();
    private static final MarshallingInfo<String> GAMESESSIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionData").build();

    private static final CreateGameSessionRequestMarshaller instance = new CreateGameSessionRequestMarshaller();

    public static CreateGameSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGameSessionRequest createGameSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGameSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGameSessionRequest.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getAliasId(), ALIASID_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getGameProperties(), GAMEPROPERTIES_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getCreatorId(), CREATORID_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getGameSessionId(), GAMESESSIONID_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
            protocolMarshaller.marshall(createGameSessionRequest.getGameSessionData(), GAMESESSIONDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
