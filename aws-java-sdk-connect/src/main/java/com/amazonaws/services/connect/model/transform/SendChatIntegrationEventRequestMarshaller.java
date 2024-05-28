/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendChatIntegrationEventRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendChatIntegrationEventRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceId").build();
    private static final MarshallingInfo<String> DESTINATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationId").build();
    private static final MarshallingInfo<String> SUBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subtype").build();
    private static final MarshallingInfo<StructuredPojo> EVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Event").build();
    private static final MarshallingInfo<StructuredPojo> NEWSESSIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewSessionDetails").build();

    private static final SendChatIntegrationEventRequestMarshaller instance = new SendChatIntegrationEventRequestMarshaller();

    public static SendChatIntegrationEventRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendChatIntegrationEventRequest sendChatIntegrationEventRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendChatIntegrationEventRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendChatIntegrationEventRequest.getSourceId(), SOURCEID_BINDING);
            protocolMarshaller.marshall(sendChatIntegrationEventRequest.getDestinationId(), DESTINATIONID_BINDING);
            protocolMarshaller.marshall(sendChatIntegrationEventRequest.getSubtype(), SUBTYPE_BINDING);
            protocolMarshaller.marshall(sendChatIntegrationEventRequest.getEvent(), EVENT_BINDING);
            protocolMarshaller.marshall(sendChatIntegrationEventRequest.getNewSessionDetails(), NEWSESSIONDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
