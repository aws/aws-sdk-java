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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TFIMetricDataPointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TFIMetricDataPointMarshaller {

    private static final MarshallingInfo<Float> FPR_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fpr").build();
    private static final MarshallingInfo<Float> PRECISION_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("precision").build();
    private static final MarshallingInfo<Float> TPR_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tpr").build();
    private static final MarshallingInfo<Float> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("threshold").build();

    private static final TFIMetricDataPointMarshaller instance = new TFIMetricDataPointMarshaller();

    public static TFIMetricDataPointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TFIMetricDataPoint tFIMetricDataPoint, ProtocolMarshaller protocolMarshaller) {

        if (tFIMetricDataPoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tFIMetricDataPoint.getFpr(), FPR_BINDING);
            protocolMarshaller.marshall(tFIMetricDataPoint.getPrecision(), PRECISION_BINDING);
            protocolMarshaller.marshall(tFIMetricDataPoint.getTpr(), TPR_BINDING);
            protocolMarshaller.marshall(tFIMetricDataPoint.getThreshold(), THRESHOLD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
