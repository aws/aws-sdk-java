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
 * TreeMapConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TreeMapConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> GROUPLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> SIZELABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLORLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLORSCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorScale").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();

    private static final TreeMapConfigurationMarshaller instance = new TreeMapConfigurationMarshaller();

    public static TreeMapConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TreeMapConfiguration treeMapConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (treeMapConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(treeMapConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getGroupLabelOptions(), GROUPLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getSizeLabelOptions(), SIZELABELOPTIONS_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getColorLabelOptions(), COLORLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getColorScale(), COLORSCALE_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(treeMapConfiguration.getTooltip(), TOOLTIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
