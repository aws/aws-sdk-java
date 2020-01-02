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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TargetInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TargetInstanceMarshaller {

    private static final MarshallingInfo<String> ESTIMATEDMONTHLYCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlyCost").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavings").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<Boolean> DEFAULTTARGETINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultTargetInstance").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDetails").build();
    private static final MarshallingInfo<StructuredPojo> EXPECTEDRESOURCEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedResourceUtilization").build();

    private static final TargetInstanceMarshaller instance = new TargetInstanceMarshaller();

    public static TargetInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TargetInstance targetInstance, ProtocolMarshaller protocolMarshaller) {

        if (targetInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(targetInstance.getEstimatedMonthlyCost(), ESTIMATEDMONTHLYCOST_BINDING);
            protocolMarshaller.marshall(targetInstance.getEstimatedMonthlySavings(), ESTIMATEDMONTHLYSAVINGS_BINDING);
            protocolMarshaller.marshall(targetInstance.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(targetInstance.getDefaultTargetInstance(), DEFAULTTARGETINSTANCE_BINDING);
            protocolMarshaller.marshall(targetInstance.getResourceDetails(), RESOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(targetInstance.getExpectedResourceUtilization(), EXPECTEDRESOURCEUTILIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
