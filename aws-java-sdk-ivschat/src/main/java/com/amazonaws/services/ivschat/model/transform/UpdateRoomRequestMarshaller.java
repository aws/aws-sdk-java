/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivschat.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivschat.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRoomRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRoomRequestMarshaller {

    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identifier").build();
    private static final MarshallingInfo<List> LOGGINGCONFIGURATIONIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loggingConfigurationIdentifiers").build();
    private static final MarshallingInfo<Integer> MAXIMUMMESSAGELENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumMessageLength").build();
    private static final MarshallingInfo<Integer> MAXIMUMMESSAGERATEPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumMessageRatePerSecond").build();
    private static final MarshallingInfo<StructuredPojo> MESSAGEREVIEWHANDLER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("messageReviewHandler").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final UpdateRoomRequestMarshaller instance = new UpdateRoomRequestMarshaller();

    public static UpdateRoomRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRoomRequest updateRoomRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRoomRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRoomRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateRoomRequest.getLoggingConfigurationIdentifiers(), LOGGINGCONFIGURATIONIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(updateRoomRequest.getMaximumMessageLength(), MAXIMUMMESSAGELENGTH_BINDING);
            protocolMarshaller.marshall(updateRoomRequest.getMaximumMessageRatePerSecond(), MAXIMUMMESSAGERATEPERSECOND_BINDING);
            protocolMarshaller.marshall(updateRoomRequest.getMessageReviewHandler(), MESSAGEREVIEWHANDLER_BINDING);
            protocolMarshaller.marshall(updateRoomRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
