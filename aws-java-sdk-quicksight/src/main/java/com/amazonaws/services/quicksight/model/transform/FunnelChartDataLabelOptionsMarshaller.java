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
 * FunnelChartDataLabelOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunnelChartDataLabelOptionsMarshaller {

    private static final MarshallingInfo<String> VISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visibility").build();
    private static final MarshallingInfo<String> CATEGORYLABELVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelVisibility").build();
    private static final MarshallingInfo<String> MEASURELABELVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureLabelVisibility").build();
    private static final MarshallingInfo<String> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Position").build();
    private static final MarshallingInfo<StructuredPojo> LABELFONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelFontConfiguration").build();
    private static final MarshallingInfo<String> LABELCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelColor").build();
    private static final MarshallingInfo<String> MEASUREDATALABELSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureDataLabelStyle").build();

    private static final FunnelChartDataLabelOptionsMarshaller instance = new FunnelChartDataLabelOptionsMarshaller();

    public static FunnelChartDataLabelOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunnelChartDataLabelOptions funnelChartDataLabelOptions, ProtocolMarshaller protocolMarshaller) {

        if (funnelChartDataLabelOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getVisibility(), VISIBILITY_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getCategoryLabelVisibility(), CATEGORYLABELVISIBILITY_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getMeasureLabelVisibility(), MEASURELABELVISIBILITY_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getLabelFontConfiguration(), LABELFONTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getLabelColor(), LABELCOLOR_BINDING);
            protocolMarshaller.marshall(funnelChartDataLabelOptions.getMeasureDataLabelStyle(), MEASUREDATALABELSTYLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
