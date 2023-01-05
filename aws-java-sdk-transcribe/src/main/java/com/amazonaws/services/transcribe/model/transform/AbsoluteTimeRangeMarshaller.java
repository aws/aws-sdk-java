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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AbsoluteTimeRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AbsoluteTimeRangeMarshaller {

    private static final MarshallingInfo<Long> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartTime").build();
    private static final MarshallingInfo<Long> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndTime").build();
    private static final MarshallingInfo<Long> FIRST_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("First").build();
    private static final MarshallingInfo<Long> LAST_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Last").build();

    private static final AbsoluteTimeRangeMarshaller instance = new AbsoluteTimeRangeMarshaller();

    public static AbsoluteTimeRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AbsoluteTimeRange absoluteTimeRange, ProtocolMarshaller protocolMarshaller) {

        if (absoluteTimeRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(absoluteTimeRange.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(absoluteTimeRange.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(absoluteTimeRange.getFirst(), FIRST_BINDING);
            protocolMarshaller.marshall(absoluteTimeRange.getLast(), LAST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
