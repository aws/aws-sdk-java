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
 * HeatMapSortConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HeatMapSortConfigurationMarshaller {

    private static final MarshallingInfo<List> HEATMAPROWSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeatMapRowSort").build();
    private static final MarshallingInfo<List> HEATMAPCOLUMNSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeatMapColumnSort").build();
    private static final MarshallingInfo<StructuredPojo> HEATMAPROWITEMSLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeatMapRowItemsLimitConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HEATMAPCOLUMNITEMSLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeatMapColumnItemsLimitConfiguration").build();

    private static final HeatMapSortConfigurationMarshaller instance = new HeatMapSortConfigurationMarshaller();

    public static HeatMapSortConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HeatMapSortConfiguration heatMapSortConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (heatMapSortConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(heatMapSortConfiguration.getHeatMapRowSort(), HEATMAPROWSORT_BINDING);
            protocolMarshaller.marshall(heatMapSortConfiguration.getHeatMapColumnSort(), HEATMAPCOLUMNSORT_BINDING);
            protocolMarshaller.marshall(heatMapSortConfiguration.getHeatMapRowItemsLimitConfiguration(), HEATMAPROWITEMSLIMITCONFIGURATION_BINDING);
            protocolMarshaller.marshall(heatMapSortConfiguration.getHeatMapColumnItemsLimitConfiguration(), HEATMAPCOLUMNITEMSLIMITCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
