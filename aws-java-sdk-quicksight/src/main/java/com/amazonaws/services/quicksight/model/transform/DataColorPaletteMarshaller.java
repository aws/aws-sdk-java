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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataColorPaletteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataColorPaletteMarshaller {

    private static final MarshallingInfo<List> COLORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Colors").build();
    private static final MarshallingInfo<List> MINMAXGRADIENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinMaxGradient").build();
    private static final MarshallingInfo<String> EMPTYFILLCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmptyFillColor").build();

    private static final DataColorPaletteMarshaller instance = new DataColorPaletteMarshaller();

    public static DataColorPaletteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataColorPalette dataColorPalette, ProtocolMarshaller protocolMarshaller) {

        if (dataColorPalette == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataColorPalette.getColors(), COLORS_BINDING);
            protocolMarshaller.marshall(dataColorPalette.getMinMaxGradient(), MINMAXGRADIENT_BINDING);
            protocolMarshaller.marshall(dataColorPalette.getEmptyFillColor(), EMPTYFILLCOLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
