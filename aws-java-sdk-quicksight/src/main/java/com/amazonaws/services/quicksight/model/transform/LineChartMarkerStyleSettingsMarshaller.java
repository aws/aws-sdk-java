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
 * LineChartMarkerStyleSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LineChartMarkerStyleSettingsMarshaller {

    private static final MarshallingInfo<String> MARKERVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarkerVisibility").build();
    private static final MarshallingInfo<String> MARKERSHAPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarkerShape").build();
    private static final MarshallingInfo<String> MARKERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarkerSize").build();
    private static final MarshallingInfo<String> MARKERCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarkerColor").build();

    private static final LineChartMarkerStyleSettingsMarshaller instance = new LineChartMarkerStyleSettingsMarshaller();

    public static LineChartMarkerStyleSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LineChartMarkerStyleSettings lineChartMarkerStyleSettings, ProtocolMarshaller protocolMarshaller) {

        if (lineChartMarkerStyleSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lineChartMarkerStyleSettings.getMarkerVisibility(), MARKERVISIBILITY_BINDING);
            protocolMarshaller.marshall(lineChartMarkerStyleSettings.getMarkerShape(), MARKERSHAPE_BINDING);
            protocolMarshaller.marshall(lineChartMarkerStyleSettings.getMarkerSize(), MARKERSIZE_BINDING);
            protocolMarshaller.marshall(lineChartMarkerStyleSettings.getMarkerColor(), MARKERCOLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
