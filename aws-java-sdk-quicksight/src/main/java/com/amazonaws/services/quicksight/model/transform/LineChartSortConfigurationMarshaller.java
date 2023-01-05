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
 * LineChartSortConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LineChartSortConfigurationMarshaller {

    private static final MarshallingInfo<List> CATEGORYSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CategorySort").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYITEMSLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryItemsLimitConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> COLORITEMSLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorItemsLimitConfiguration").build();
    private static final MarshallingInfo<List> SMALLMULTIPLESSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesSort").build();
    private static final MarshallingInfo<StructuredPojo> SMALLMULTIPLESLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesLimitConfiguration").build();

    private static final LineChartSortConfigurationMarshaller instance = new LineChartSortConfigurationMarshaller();

    public static LineChartSortConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LineChartSortConfiguration lineChartSortConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (lineChartSortConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lineChartSortConfiguration.getCategorySort(), CATEGORYSORT_BINDING);
            protocolMarshaller.marshall(lineChartSortConfiguration.getCategoryItemsLimitConfiguration(), CATEGORYITEMSLIMITCONFIGURATION_BINDING);
            protocolMarshaller.marshall(lineChartSortConfiguration.getColorItemsLimitConfiguration(), COLORITEMSLIMITCONFIGURATION_BINDING);
            protocolMarshaller.marshall(lineChartSortConfiguration.getSmallMultiplesSort(), SMALLMULTIPLESSORT_BINDING);
            protocolMarshaller.marshall(lineChartSortConfiguration.getSmallMultiplesLimitConfiguration(), SMALLMULTIPLESLIMITCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
