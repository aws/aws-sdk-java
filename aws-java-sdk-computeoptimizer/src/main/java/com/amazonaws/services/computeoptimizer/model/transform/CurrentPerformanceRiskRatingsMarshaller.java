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
package com.amazonaws.services.computeoptimizer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CurrentPerformanceRiskRatingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CurrentPerformanceRiskRatingsMarshaller {

    private static final MarshallingInfo<Long> HIGH_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("high").build();
    private static final MarshallingInfo<Long> MEDIUM_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("medium").build();
    private static final MarshallingInfo<Long> LOW_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("low").build();
    private static final MarshallingInfo<Long> VERYLOW_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("veryLow").build();

    private static final CurrentPerformanceRiskRatingsMarshaller instance = new CurrentPerformanceRiskRatingsMarshaller();

    public static CurrentPerformanceRiskRatingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CurrentPerformanceRiskRatings currentPerformanceRiskRatings, ProtocolMarshaller protocolMarshaller) {

        if (currentPerformanceRiskRatings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(currentPerformanceRiskRatings.getHigh(), HIGH_BINDING);
            protocolMarshaller.marshall(currentPerformanceRiskRatings.getMedium(), MEDIUM_BINDING);
            protocolMarshaller.marshall(currentPerformanceRiskRatings.getLow(), LOW_BINDING);
            protocolMarshaller.marshall(currentPerformanceRiskRatings.getVeryLow(), VERYLOW_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
