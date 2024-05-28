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
package com.amazonaws.services.detective.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.detective.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImpossibleTravelDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImpossibleTravelDetailMarshaller {

    private static final MarshallingInfo<String> STARTINGIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingIpAddress").build();
    private static final MarshallingInfo<String> ENDINGIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndingIpAddress").build();
    private static final MarshallingInfo<String> STARTINGLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingLocation").build();
    private static final MarshallingInfo<String> ENDINGLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndingLocation").build();
    private static final MarshallingInfo<Integer> HOURLYTIMEDELTA_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourlyTimeDelta").build();

    private static final ImpossibleTravelDetailMarshaller instance = new ImpossibleTravelDetailMarshaller();

    public static ImpossibleTravelDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImpossibleTravelDetail impossibleTravelDetail, ProtocolMarshaller protocolMarshaller) {

        if (impossibleTravelDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(impossibleTravelDetail.getStartingIpAddress(), STARTINGIPADDRESS_BINDING);
            protocolMarshaller.marshall(impossibleTravelDetail.getEndingIpAddress(), ENDINGIPADDRESS_BINDING);
            protocolMarshaller.marshall(impossibleTravelDetail.getStartingLocation(), STARTINGLOCATION_BINDING);
            protocolMarshaller.marshall(impossibleTravelDetail.getEndingLocation(), ENDINGLOCATION_BINDING);
            protocolMarshaller.marshall(impossibleTravelDetail.getHourlyTimeDelta(), HOURLYTIMEDELTA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
