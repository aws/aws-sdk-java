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
 * TimeRangeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeRangeFilterMarshaller {

    private static final MarshallingInfo<String> FILTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FilterId").build();
    private static final MarshallingInfo<StructuredPojo> COLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Column").build();
    private static final MarshallingInfo<Boolean> INCLUDEMINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeMinimum").build();
    private static final MarshallingInfo<Boolean> INCLUDEMAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeMaximum").build();
    private static final MarshallingInfo<StructuredPojo> RANGEMINIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMinimumValue").build();
    private static final MarshallingInfo<StructuredPojo> RANGEMAXIMUMVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMaximumValue").build();
    private static final MarshallingInfo<String> NULLOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullOption").build();
    private static final MarshallingInfo<StructuredPojo> EXCLUDEPERIODCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludePeriodConfiguration").build();
    private static final MarshallingInfo<String> TIMEGRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeGranularity").build();

    private static final TimeRangeFilterMarshaller instance = new TimeRangeFilterMarshaller();

    public static TimeRangeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeRangeFilter timeRangeFilter, ProtocolMarshaller protocolMarshaller) {

        if (timeRangeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeRangeFilter.getFilterId(), FILTERID_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getColumn(), COLUMN_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getIncludeMinimum(), INCLUDEMINIMUM_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getIncludeMaximum(), INCLUDEMAXIMUM_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getRangeMinimumValue(), RANGEMINIMUMVALUE_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getRangeMaximumValue(), RANGEMAXIMUMVALUE_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getNullOption(), NULLOPTION_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getExcludePeriodConfiguration(), EXCLUDEPERIODCONFIGURATION_BINDING);
            protocolMarshaller.marshall(timeRangeFilter.getTimeGranularity(), TIMEGRANULARITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
