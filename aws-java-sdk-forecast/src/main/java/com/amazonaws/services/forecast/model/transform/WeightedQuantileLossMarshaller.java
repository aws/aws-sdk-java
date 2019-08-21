/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WeightedQuantileLossMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WeightedQuantileLossMarshaller {

    private static final MarshallingInfo<Double> QUANTILE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Quantile").build();
    private static final MarshallingInfo<Double> LOSSVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LossValue").build();

    private static final WeightedQuantileLossMarshaller instance = new WeightedQuantileLossMarshaller();

    public static WeightedQuantileLossMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WeightedQuantileLoss weightedQuantileLoss, ProtocolMarshaller protocolMarshaller) {

        if (weightedQuantileLoss == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(weightedQuantileLoss.getQuantile(), QUANTILE_BINDING);
            protocolMarshaller.marshall(weightedQuantileLoss.getLossValue(), LOSSVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
