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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WaterfallChartAggregatedFieldWellsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WaterfallChartAggregatedFieldWellsMarshaller {

    private static final MarshallingInfo<List> CATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Categories").build();
    private static final MarshallingInfo<List> VALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Values").build();
    private static final MarshallingInfo<List> BREAKDOWNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Breakdowns").build();

    private static final WaterfallChartAggregatedFieldWellsMarshaller instance = new WaterfallChartAggregatedFieldWellsMarshaller();

    public static WaterfallChartAggregatedFieldWellsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WaterfallChartAggregatedFieldWells waterfallChartAggregatedFieldWells, ProtocolMarshaller protocolMarshaller) {

        if (waterfallChartAggregatedFieldWells == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(waterfallChartAggregatedFieldWells.getCategories(), CATEGORIES_BINDING);
            protocolMarshaller.marshall(waterfallChartAggregatedFieldWells.getValues(), VALUES_BINDING);
            protocolMarshaller.marshall(waterfallChartAggregatedFieldWells.getBreakdowns(), BREAKDOWNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
