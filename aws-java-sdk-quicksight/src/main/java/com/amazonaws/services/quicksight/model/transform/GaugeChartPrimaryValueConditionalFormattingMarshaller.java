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
 * GaugeChartPrimaryValueConditionalFormattingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GaugeChartPrimaryValueConditionalFormattingMarshaller {

    private static final MarshallingInfo<StructuredPojo> TEXTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextColor").build();
    private static final MarshallingInfo<StructuredPojo> ICON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Icon").build();

    private static final GaugeChartPrimaryValueConditionalFormattingMarshaller instance = new GaugeChartPrimaryValueConditionalFormattingMarshaller();

    public static GaugeChartPrimaryValueConditionalFormattingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GaugeChartPrimaryValueConditionalFormatting gaugeChartPrimaryValueConditionalFormatting, ProtocolMarshaller protocolMarshaller) {

        if (gaugeChartPrimaryValueConditionalFormatting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gaugeChartPrimaryValueConditionalFormatting.getTextColor(), TEXTCOLOR_BINDING);
            protocolMarshaller.marshall(gaugeChartPrimaryValueConditionalFormatting.getIcon(), ICON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
