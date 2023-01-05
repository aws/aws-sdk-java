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
package com.amazonaws.services.lookoutforvision.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutforvision.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PixelAnomalyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PixelAnomalyMarshaller {

    private static final MarshallingInfo<Float> TOTALPERCENTAGEAREA_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalPercentageArea").build();
    private static final MarshallingInfo<String> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Color").build();

    private static final PixelAnomalyMarshaller instance = new PixelAnomalyMarshaller();

    public static PixelAnomalyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PixelAnomaly pixelAnomaly, ProtocolMarshaller protocolMarshaller) {

        if (pixelAnomaly == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pixelAnomaly.getTotalPercentageArea(), TOTALPERCENTAGEAREA_BINDING);
            protocolMarshaller.marshall(pixelAnomaly.getColor(), COLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
