/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * WaterfallChartGroupColorConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WaterfallChartGroupColorConfigurationMarshaller {

    private static final MarshallingInfo<String> POSITIVEBARCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PositiveBarColor").build();
    private static final MarshallingInfo<String> NEGATIVEBARCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NegativeBarColor").build();
    private static final MarshallingInfo<String> TOTALBARCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalBarColor").build();

    private static final WaterfallChartGroupColorConfigurationMarshaller instance = new WaterfallChartGroupColorConfigurationMarshaller();

    public static WaterfallChartGroupColorConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WaterfallChartGroupColorConfiguration waterfallChartGroupColorConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (waterfallChartGroupColorConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(waterfallChartGroupColorConfiguration.getPositiveBarColor(), POSITIVEBARCOLOR_BINDING);
            protocolMarshaller.marshall(waterfallChartGroupColorConfiguration.getNegativeBarColor(), NEGATIVEBARCOLOR_BINDING);
            protocolMarshaller.marshall(waterfallChartGroupColorConfiguration.getTotalBarColor(), TOTALBARCOLOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
