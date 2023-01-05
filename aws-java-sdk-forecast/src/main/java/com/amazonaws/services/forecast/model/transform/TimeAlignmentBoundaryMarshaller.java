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
package com.amazonaws.services.forecast.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeAlignmentBoundaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeAlignmentBoundaryMarshaller {

    private static final MarshallingInfo<String> MONTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Month").build();
    private static final MarshallingInfo<Integer> DAYOFMONTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DayOfMonth").build();
    private static final MarshallingInfo<String> DAYOFWEEK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DayOfWeek").build();
    private static final MarshallingInfo<Integer> HOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hour").build();

    private static final TimeAlignmentBoundaryMarshaller instance = new TimeAlignmentBoundaryMarshaller();

    public static TimeAlignmentBoundaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeAlignmentBoundary timeAlignmentBoundary, ProtocolMarshaller protocolMarshaller) {

        if (timeAlignmentBoundary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeAlignmentBoundary.getMonth(), MONTH_BINDING);
            protocolMarshaller.marshall(timeAlignmentBoundary.getDayOfMonth(), DAYOFMONTH_BINDING);
            protocolMarshaller.marshall(timeAlignmentBoundary.getDayOfWeek(), DAYOFWEEK_BINDING);
            protocolMarshaller.marshall(timeAlignmentBoundary.getHour(), HOUR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
