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
package com.amazonaws.services.pinpointemail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventDestinationDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventDestinationDefinitionMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<List> MATCHINGEVENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchingEventTypes").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseDestination").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchDestination").build();
    private static final MarshallingInfo<StructuredPojo> SNSDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsDestination").build();
    private static final MarshallingInfo<StructuredPojo> PINPOINTDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinpointDestination").build();

    private static final EventDestinationDefinitionMarshaller instance = new EventDestinationDefinitionMarshaller();

    public static EventDestinationDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventDestinationDefinition eventDestinationDefinition, ProtocolMarshaller protocolMarshaller) {

        if (eventDestinationDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventDestinationDefinition.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(eventDestinationDefinition.getMatchingEventTypes(), MATCHINGEVENTTYPES_BINDING);
            protocolMarshaller.marshall(eventDestinationDefinition.getKinesisFirehoseDestination(), KINESISFIREHOSEDESTINATION_BINDING);
            protocolMarshaller.marshall(eventDestinationDefinition.getCloudWatchDestination(), CLOUDWATCHDESTINATION_BINDING);
            protocolMarshaller.marshall(eventDestinationDefinition.getSnsDestination(), SNSDESTINATION_BINDING);
            protocolMarshaller.marshall(eventDestinationDefinition.getPinpointDestination(), PINPOINTDESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
