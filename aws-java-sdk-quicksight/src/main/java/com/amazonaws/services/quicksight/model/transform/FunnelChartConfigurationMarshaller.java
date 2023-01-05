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
 * FunnelChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunnelChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> VALUELABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final FunnelChartConfigurationMarshaller instance = new FunnelChartConfigurationMarshaller();

    public static FunnelChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunnelChartConfiguration funnelChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (funnelChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(funnelChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getCategoryLabelOptions(), CATEGORYLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getValueLabelOptions(), VALUELABELOPTIONS_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getDataLabelOptions(), DATALABELOPTIONS_BINDING);
            protocolMarshaller.marshall(funnelChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
