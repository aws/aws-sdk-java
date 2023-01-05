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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEventDestinationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEventDestinationRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();
    private static final MarshallingInfo<String> EVENTDESTINATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventDestinationName").build();
    private static final MarshallingInfo<List> MATCHINGEVENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchingEventTypes").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsDestination").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseDestination").build();
    private static final MarshallingInfo<StructuredPojo> SNSDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsDestination").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateEventDestinationRequestMarshaller instance = new CreateEventDestinationRequestMarshaller();

    public static CreateEventDestinationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEventDestinationRequest createEventDestinationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEventDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEventDestinationRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getEventDestinationName(), EVENTDESTINATIONNAME_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getMatchingEventTypes(), MATCHINGEVENTTYPES_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getCloudWatchLogsDestination(), CLOUDWATCHLOGSDESTINATION_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getKinesisFirehoseDestination(), KINESISFIREHOSEDESTINATION_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getSnsDestination(), SNSDESTINATION_BINDING);
            protocolMarshaller.marshall(createEventDestinationRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
