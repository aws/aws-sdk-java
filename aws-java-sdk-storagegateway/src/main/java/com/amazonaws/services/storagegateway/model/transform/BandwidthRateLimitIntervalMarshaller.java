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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BandwidthRateLimitIntervalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BandwidthRateLimitIntervalMarshaller {

    private static final MarshallingInfo<Integer> STARTHOUROFDAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartHourOfDay").build();
    private static final MarshallingInfo<Integer> STARTMINUTEOFHOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartMinuteOfHour").build();
    private static final MarshallingInfo<Integer> ENDHOUROFDAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndHourOfDay").build();
    private static final MarshallingInfo<Integer> ENDMINUTEOFHOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndMinuteOfHour").build();
    private static final MarshallingInfo<List> DAYSOFWEEK_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DaysOfWeek").build();
    private static final MarshallingInfo<Long> AVERAGEUPLOADRATELIMITINBITSPERSEC_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageUploadRateLimitInBitsPerSec").build();
    private static final MarshallingInfo<Long> AVERAGEDOWNLOADRATELIMITINBITSPERSEC_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageDownloadRateLimitInBitsPerSec").build();

    private static final BandwidthRateLimitIntervalMarshaller instance = new BandwidthRateLimitIntervalMarshaller();

    public static BandwidthRateLimitIntervalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BandwidthRateLimitInterval bandwidthRateLimitInterval, ProtocolMarshaller protocolMarshaller) {

        if (bandwidthRateLimitInterval == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getStartHourOfDay(), STARTHOUROFDAY_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getStartMinuteOfHour(), STARTMINUTEOFHOUR_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getEndHourOfDay(), ENDHOUROFDAY_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getEndMinuteOfHour(), ENDMINUTEOFHOUR_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getDaysOfWeek(), DAYSOFWEEK_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getAverageUploadRateLimitInBitsPerSec(), AVERAGEUPLOADRATELIMITINBITSPERSEC_BINDING);
            protocolMarshaller.marshall(bandwidthRateLimitInterval.getAverageDownloadRateLimitInBitsPerSec(), AVERAGEDOWNLOADRATELIMITINBITSPERSEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
