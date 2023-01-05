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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivschat.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRoomRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRoomRequestMarshaller {

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
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateRoomRequestMarshaller instance = new CreateRoomRequestMarshaller();

    public static CreateRoomRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRoomRequest createRoomRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRoomRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRoomRequest.getLoggingConfigurationIdentifiers(), LOGGINGCONFIGURATIONIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(createRoomRequest.getMaximumMessageLength(), MAXIMUMMESSAGELENGTH_BINDING);
            protocolMarshaller.marshall(createRoomRequest.getMaximumMessageRatePerSecond(), MAXIMUMMESSAGERATEPERSECOND_BINDING);
            protocolMarshaller.marshall(createRoomRequest.getMessageReviewHandler(), MESSAGEREVIEWHANDLER_BINDING);
            protocolMarshaller.marshall(createRoomRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createRoomRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
