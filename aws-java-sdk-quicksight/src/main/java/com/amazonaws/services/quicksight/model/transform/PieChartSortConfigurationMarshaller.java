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
 * PieChartSortConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PieChartSortConfigurationMarshaller {

    private static final MarshallingInfo<List> CATEGORYSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CategorySort").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYITEMSLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryItemsLimit").build();
    private static final MarshallingInfo<List> SMALLMULTIPLESSORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesSort").build();
    private static final MarshallingInfo<StructuredPojo> SMALLMULTIPLESLIMITCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesLimitConfiguration").build();

    private static final PieChartSortConfigurationMarshaller instance = new PieChartSortConfigurationMarshaller();

    public static PieChartSortConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PieChartSortConfiguration pieChartSortConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (pieChartSortConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pieChartSortConfiguration.getCategorySort(), CATEGORYSORT_BINDING);
            protocolMarshaller.marshall(pieChartSortConfiguration.getCategoryItemsLimit(), CATEGORYITEMSLIMIT_BINDING);
            protocolMarshaller.marshall(pieChartSortConfiguration.getSmallMultiplesSort(), SMALLMULTIPLESSORT_BINDING);
            protocolMarshaller.marshall(pieChartSortConfiguration.getSmallMultiplesLimitConfiguration(), SMALLMULTIPLESLIMITCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
