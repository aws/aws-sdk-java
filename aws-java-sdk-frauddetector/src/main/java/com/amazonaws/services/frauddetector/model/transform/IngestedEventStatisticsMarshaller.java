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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IngestedEventStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IngestedEventStatisticsMarshaller {

    private static final MarshallingInfo<Long> NUMBEROFEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfEvents").build();
    private static final MarshallingInfo<Long> EVENTDATASIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventDataSizeInBytes").build();
    private static final MarshallingInfo<String> LEASTRECENTEVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("leastRecentEvent").build();
    private static final MarshallingInfo<String> MOSTRECENTEVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mostRecentEvent").build();
    private static final MarshallingInfo<String> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").build();

    private static final IngestedEventStatisticsMarshaller instance = new IngestedEventStatisticsMarshaller();

    public static IngestedEventStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IngestedEventStatistics ingestedEventStatistics, ProtocolMarshaller protocolMarshaller) {

        if (ingestedEventStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ingestedEventStatistics.getNumberOfEvents(), NUMBEROFEVENTS_BINDING);
            protocolMarshaller.marshall(ingestedEventStatistics.getEventDataSizeInBytes(), EVENTDATASIZEINBYTES_BINDING);
            protocolMarshaller.marshall(ingestedEventStatistics.getLeastRecentEvent(), LEASTRECENTEVENT_BINDING);
            protocolMarshaller.marshall(ingestedEventStatistics.getMostRecentEvent(), MOSTRECENTEVENT_BINDING);
            protocolMarshaller.marshall(ingestedEventStatistics.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
