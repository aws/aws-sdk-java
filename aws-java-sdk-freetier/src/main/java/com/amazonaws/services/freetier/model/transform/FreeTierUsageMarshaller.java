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
package com.amazonaws.services.freetier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.freetier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FreeTierUsageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FreeTierUsageMarshaller {

    private static final MarshallingInfo<Double> ACTUALUSAGEAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actualUsageAmount").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Double> FORECASTEDUSAGEAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forecastedUsageAmount").build();
    private static final MarshallingInfo<String> FREETIERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("freeTierType").build();
    private static final MarshallingInfo<Double> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operation").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("service").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();
    private static final MarshallingInfo<String> USAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageType").build();

    private static final FreeTierUsageMarshaller instance = new FreeTierUsageMarshaller();

    public static FreeTierUsageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FreeTierUsage freeTierUsage, ProtocolMarshaller protocolMarshaller) {

        if (freeTierUsage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(freeTierUsage.getActualUsageAmount(), ACTUALUSAGEAMOUNT_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getForecastedUsageAmount(), FORECASTEDUSAGEAMOUNT_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getFreeTierType(), FREETIERTYPE_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(freeTierUsage.getUsageType(), USAGETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
