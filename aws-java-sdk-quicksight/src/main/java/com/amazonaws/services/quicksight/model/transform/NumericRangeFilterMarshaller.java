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
 * NumericRangeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NumericRangeFilterMarshaller {

    private static final MarshallingInfo<String> FILTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FilterId").build();
    private static final MarshallingInfo<StructuredPojo> COLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Column").build();
    private static final MarshallingInfo<Boolean> INCLUDEMINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeMinimum").build();
    private static final MarshallingInfo<Boolean> INCLUDEMAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeMaximum").build();
    private static final MarshallingInfo<StructuredPojo> RANGEMINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMinimum").build();
    private static final MarshallingInfo<StructuredPojo> RANGEMAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RangeMaximum").build();
    private static final MarshallingInfo<String> SELECTALLOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectAllOptions").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATIONFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AggregationFunction").build();
    private static final MarshallingInfo<String> NULLOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullOption").build();

    private static final NumericRangeFilterMarshaller instance = new NumericRangeFilterMarshaller();

    public static NumericRangeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NumericRangeFilter numericRangeFilter, ProtocolMarshaller protocolMarshaller) {

        if (numericRangeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(numericRangeFilter.getFilterId(), FILTERID_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getColumn(), COLUMN_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getIncludeMinimum(), INCLUDEMINIMUM_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getIncludeMaximum(), INCLUDEMAXIMUM_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getRangeMinimum(), RANGEMINIMUM_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getRangeMaximum(), RANGEMAXIMUM_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getSelectAllOptions(), SELECTALLOPTIONS_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getAggregationFunction(), AGGREGATIONFUNCTION_BINDING);
            protocolMarshaller.marshall(numericRangeFilter.getNullOption(), NULLOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
