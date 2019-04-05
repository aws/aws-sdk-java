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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateGameSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGameSessionRequestMarshaller {

    private static final MarshallingInfo<String> GAMESESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameSessionId").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PLAYERSESSIONCREATIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlayerSessionCreationPolicy").build();
    private static final MarshallingInfo<String> PROTECTIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectionPolicy").build();

    private static final UpdateGameSessionRequestMarshaller instance = new UpdateGameSessionRequestMarshaller();

    public static UpdateGameSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGameSessionRequest updateGameSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGameSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGameSessionRequest.getGameSessionId(), GAMESESSIONID_BINDING);
            protocolMarshaller.marshall(updateGameSessionRequest.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(updateGameSessionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateGameSessionRequest.getPlayerSessionCreationPolicy(), PLAYERSESSIONCREATIONPOLICY_BINDING);
            protocolMarshaller.marshall(updateGameSessionRequest.getProtectionPolicy(), PROTECTIONPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
