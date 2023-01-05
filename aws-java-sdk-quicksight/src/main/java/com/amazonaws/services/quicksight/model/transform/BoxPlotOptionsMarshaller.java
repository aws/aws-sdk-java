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
 * BoxPlotOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BoxPlotOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> STYLEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StyleOptions").build();
    private static final MarshallingInfo<String> OUTLIERVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutlierVisibility").build();
    private static final MarshallingInfo<String> ALLDATAPOINTSVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllDataPointsVisibility").build();

    private static final BoxPlotOptionsMarshaller instance = new BoxPlotOptionsMarshaller();

    public static BoxPlotOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BoxPlotOptions boxPlotOptions, ProtocolMarshaller protocolMarshaller) {

        if (boxPlotOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(boxPlotOptions.getStyleOptions(), STYLEOPTIONS_BINDING);
            protocolMarshaller.marshall(boxPlotOptions.getOutlierVisibility(), OUTLIERVISIBILITY_BINDING);
            protocolMarshaller.marshall(boxPlotOptions.getAllDataPointsVisibility(), ALLDATAPOINTSVISIBILITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
