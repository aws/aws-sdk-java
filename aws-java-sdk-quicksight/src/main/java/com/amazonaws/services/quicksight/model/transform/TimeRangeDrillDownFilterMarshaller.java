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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeRangeDrillDownFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeRangeDrillDownFilterMarshaller {

    private static final MarshallingInfo<StructuredPojo> COLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Column").build();
    private static final MarshallingInfo<java.util.Date> RANGEMINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMinimum").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RANGEMAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMaximum").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TIMEGRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeGranularity").build();

    private static final TimeRangeDrillDownFilterMarshaller instance = new TimeRangeDrillDownFilterMarshaller();

    public static TimeRangeDrillDownFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeRangeDrillDownFilter timeRangeDrillDownFilter, ProtocolMarshaller protocolMarshaller) {

        if (timeRangeDrillDownFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeRangeDrillDownFilter.getColumn(), COLUMN_BINDING);
            protocolMarshaller.marshall(timeRangeDrillDownFilter.getRangeMinimum(), RANGEMINIMUM_BINDING);
            protocolMarshaller.marshall(timeRangeDrillDownFilter.getRangeMaximum(), RANGEMAXIMUM_BINDING);
            protocolMarshaller.marshall(timeRangeDrillDownFilter.getTimeGranularity(), TIMEGRANULARITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
