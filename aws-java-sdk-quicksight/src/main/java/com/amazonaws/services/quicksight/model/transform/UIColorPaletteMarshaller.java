/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UIColorPaletteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UIColorPaletteMarshaller {

    private static final MarshallingInfo<String> PRIMARYFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryForeground").build();
    private static final MarshallingInfo<String> PRIMARYBACKGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryBackground").build();
    private static final MarshallingInfo<String> SECONDARYFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryForeground").build();
    private static final MarshallingInfo<String> SECONDARYBACKGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryBackground").build();
    private static final MarshallingInfo<String> ACCENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Accent").build();
    private static final MarshallingInfo<String> ACCENTFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccentForeground").build();
    private static final MarshallingInfo<String> DANGER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Danger").build();
    private static final MarshallingInfo<String> DANGERFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DangerForeground").build();
    private static final MarshallingInfo<String> WARNING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Warning").build();
    private static final MarshallingInfo<String> WARNINGFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WarningForeground").build();
    private static final MarshallingInfo<String> SUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Success").build();
    private static final MarshallingInfo<String> SUCCESSFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessForeground").build();
    private static final MarshallingInfo<String> DIMENSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimension").build();
    private static final MarshallingInfo<String> DIMENSIONFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DimensionForeground").build();
    private static final MarshallingInfo<String> MEASURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Measure").build();
    private static final MarshallingInfo<String> MEASUREFOREGROUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureForeground").build();

    private static final UIColorPaletteMarshaller instance = new UIColorPaletteMarshaller();

    public static UIColorPaletteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UIColorPalette uIColorPalette, ProtocolMarshaller protocolMarshaller) {

        if (uIColorPalette == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(uIColorPalette.getPrimaryForeground(), PRIMARYFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getPrimaryBackground(), PRIMARYBACKGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getSecondaryForeground(), SECONDARYFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getSecondaryBackground(), SECONDARYBACKGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getAccent(), ACCENT_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getAccentForeground(), ACCENTFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getDanger(), DANGER_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getDangerForeground(), DANGERFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getWarning(), WARNING_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getWarningForeground(), WARNINGFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getSuccess(), SUCCESS_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getSuccessForeground(), SUCCESSFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getDimension(), DIMENSION_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getDimensionForeground(), DIMENSIONFOREGROUND_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getMeasure(), MEASURE_BINDING);
            protocolMarshaller.marshall(uIColorPalette.getMeasureForeground(), MEASUREFOREGROUND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
