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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScatterPlotUnaggregatedFieldWellsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScatterPlotUnaggregatedFieldWellsMarshaller {

    private static final MarshallingInfo<List> XAXIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("XAxis").build();
    private static final MarshallingInfo<List> YAXIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("YAxis").build();
    private static final MarshallingInfo<List> SIZE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Size").build();

    private static final ScatterPlotUnaggregatedFieldWellsMarshaller instance = new ScatterPlotUnaggregatedFieldWellsMarshaller();

    public static ScatterPlotUnaggregatedFieldWellsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScatterPlotUnaggregatedFieldWells scatterPlotUnaggregatedFieldWells, ProtocolMarshaller protocolMarshaller) {

        if (scatterPlotUnaggregatedFieldWells == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scatterPlotUnaggregatedFieldWells.getXAxis(), XAXIS_BINDING);
            protocolMarshaller.marshall(scatterPlotUnaggregatedFieldWells.getYAxis(), YAXIS_BINDING);
            protocolMarshaller.marshall(scatterPlotUnaggregatedFieldWells.getSize(), SIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
