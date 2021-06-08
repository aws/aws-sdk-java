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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisDataStreamDestinationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisDataStreamDestinationMarshaller {

    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamArn").build();
    private static final MarshallingInfo<String> DESTINATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationStatus").build();
    private static final MarshallingInfo<String> DESTINATIONSTATUSDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationStatusDescription").build();

    private static final KinesisDataStreamDestinationMarshaller instance = new KinesisDataStreamDestinationMarshaller();

    public static KinesisDataStreamDestinationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisDataStreamDestination kinesisDataStreamDestination, ProtocolMarshaller protocolMarshaller) {

        if (kinesisDataStreamDestination == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisDataStreamDestination.getStreamArn(), STREAMARN_BINDING);
            protocolMarshaller.marshall(kinesisDataStreamDestination.getDestinationStatus(), DESTINATIONSTATUS_BINDING);
            protocolMarshaller.marshall(kinesisDataStreamDestination.getDestinationStatusDescription(), DESTINATIONSTATUSDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
