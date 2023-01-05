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
 * HistogramBinOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HistogramBinOptionsMarshaller {

    private static final MarshallingInfo<String> SELECTEDBINTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedBinType").build();
    private static final MarshallingInfo<StructuredPojo> BINCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinCount").build();
    private static final MarshallingInfo<StructuredPojo> BINWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinWidth").build();
    private static final MarshallingInfo<Double> STARTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartValue").build();

    private static final HistogramBinOptionsMarshaller instance = new HistogramBinOptionsMarshaller();

    public static HistogramBinOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HistogramBinOptions histogramBinOptions, ProtocolMarshaller protocolMarshaller) {

        if (histogramBinOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(histogramBinOptions.getSelectedBinType(), SELECTEDBINTYPE_BINDING);
            protocolMarshaller.marshall(histogramBinOptions.getBinCount(), BINCOUNT_BINDING);
            protocolMarshaller.marshall(histogramBinOptions.getBinWidth(), BINWIDTH_BINDING);
            protocolMarshaller.marshall(histogramBinOptions.getStartValue(), STARTVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
