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
 * LineChartLineStyleSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LineChartLineStyleSettingsMarshaller {

    private static final MarshallingInfo<String> LINEVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LineVisibility").build();
    private static final MarshallingInfo<String> LINEINTERPOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LineInterpolation").build();
    private static final MarshallingInfo<String> LINESTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LineStyle").build();
    private static final MarshallingInfo<String> LINEWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LineWidth").build();

    private static final LineChartLineStyleSettingsMarshaller instance = new LineChartLineStyleSettingsMarshaller();

    public static LineChartLineStyleSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LineChartLineStyleSettings lineChartLineStyleSettings, ProtocolMarshaller protocolMarshaller) {

        if (lineChartLineStyleSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lineChartLineStyleSettings.getLineVisibility(), LINEVISIBILITY_BINDING);
            protocolMarshaller.marshall(lineChartLineStyleSettings.getLineInterpolation(), LINEINTERPOLATION_BINDING);
            protocolMarshaller.marshall(lineChartLineStyleSettings.getLineStyle(), LINESTYLE_BINDING);
            protocolMarshaller.marshall(lineChartLineStyleSettings.getLineWidth(), LINEWIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
