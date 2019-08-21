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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricsMarshaller {

    private static final MarshallingInfo<Double> RMSE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RMSE").build();
    private static final MarshallingInfo<List> WEIGHTEDQUANTILELOSSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeightedQuantileLosses").build();

    private static final MetricsMarshaller instance = new MetricsMarshaller();

    public static MetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Metrics metrics, ProtocolMarshaller protocolMarshaller) {

        if (metrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metrics.getRMSE(), RMSE_BINDING);
            protocolMarshaller.marshall(metrics.getWeightedQuantileLosses(), WEIGHTEDQUANTILELOSSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
