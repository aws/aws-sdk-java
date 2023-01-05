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
 * GaugeChartOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GaugeChartOptionsMarshaller {

    private static final MarshallingInfo<String> PRIMARYVALUEDISPLAYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryValueDisplayType").build();
    private static final MarshallingInfo<StructuredPojo> COMPARISON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Comparison").build();
    private static final MarshallingInfo<StructuredPojo> ARCAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArcAxis").build();
    private static final MarshallingInfo<StructuredPojo> ARC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Arc").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYVALUEFONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryValueFontConfiguration").build();

    private static final GaugeChartOptionsMarshaller instance = new GaugeChartOptionsMarshaller();

    public static GaugeChartOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GaugeChartOptions gaugeChartOptions, ProtocolMarshaller protocolMarshaller) {

        if (gaugeChartOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gaugeChartOptions.getPrimaryValueDisplayType(), PRIMARYVALUEDISPLAYTYPE_BINDING);
            protocolMarshaller.marshall(gaugeChartOptions.getComparison(), COMPARISON_BINDING);
            protocolMarshaller.marshall(gaugeChartOptions.getArcAxis(), ARCAXIS_BINDING);
            protocolMarshaller.marshall(gaugeChartOptions.getArc(), ARC_BINDING);
            protocolMarshaller.marshall(gaugeChartOptions.getPrimaryValueFontConfiguration(), PRIMARYVALUEFONTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
