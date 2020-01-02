/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindMatchesMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindMatchesMetricsMarshaller {

    private static final MarshallingInfo<Double> AREAUNDERPRCURVE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AreaUnderPRCurve").build();
    private static final MarshallingInfo<Double> PRECISION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Precision").build();
    private static final MarshallingInfo<Double> RECALL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Recall").build();
    private static final MarshallingInfo<Double> F1_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("F1").build();
    private static final MarshallingInfo<StructuredPojo> CONFUSIONMATRIX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfusionMatrix").build();

    private static final FindMatchesMetricsMarshaller instance = new FindMatchesMetricsMarshaller();

    public static FindMatchesMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindMatchesMetrics findMatchesMetrics, ProtocolMarshaller protocolMarshaller) {

        if (findMatchesMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findMatchesMetrics.getAreaUnderPRCurve(), AREAUNDERPRCURVE_BINDING);
            protocolMarshaller.marshall(findMatchesMetrics.getPrecision(), PRECISION_BINDING);
            protocolMarshaller.marshall(findMatchesMetrics.getRecall(), RECALL_BINDING);
            protocolMarshaller.marshall(findMatchesMetrics.getF1(), F1_BINDING);
            protocolMarshaller.marshall(findMatchesMetrics.getConfusionMatrix(), CONFUSIONMATRIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
