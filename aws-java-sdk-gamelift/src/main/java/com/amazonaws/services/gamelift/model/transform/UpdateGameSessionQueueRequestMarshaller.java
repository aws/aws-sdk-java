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
 * UpdateGameSessionQueueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGameSessionQueueRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Integer> TIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutInSeconds").build();
    private static final MarshallingInfo<List> PLAYERLATENCYPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlayerLatencyPolicies").build();
    private static final MarshallingInfo<List> DESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Destinations").build();
    private static final MarshallingInfo<StructuredPojo> FILTERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PRIORITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PriorityConfiguration").build();
    private static final MarshallingInfo<String> CUSTOMEVENTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomEventData").build();
    private static final MarshallingInfo<String> NOTIFICATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationTarget").build();

    private static final UpdateGameSessionQueueRequestMarshaller instance = new UpdateGameSessionQueueRequestMarshaller();

    public static UpdateGameSessionQueueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGameSessionQueueRequest updateGameSessionQueueRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGameSessionQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getTimeoutInSeconds(), TIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getPlayerLatencyPolicies(), PLAYERLATENCYPOLICIES_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getDestinations(), DESTINATIONS_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getFilterConfiguration(), FILTERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getPriorityConfiguration(), PRIORITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getCustomEventData(), CUSTOMEVENTDATA_BINDING);
            protocolMarshaller.marshall(updateGameSessionQueueRequest.getNotificationTarget(), NOTIFICATIONTARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
