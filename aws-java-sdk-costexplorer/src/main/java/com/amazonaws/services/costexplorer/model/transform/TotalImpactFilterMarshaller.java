/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TotalImpactFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TotalImpactFilterMarshaller {

    private static final MarshallingInfo<String> NUMERICOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumericOperator").build();
    private static final MarshallingInfo<Double> STARTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartValue").build();
    private static final MarshallingInfo<Double> ENDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndValue").build();

    private static final TotalImpactFilterMarshaller instance = new TotalImpactFilterMarshaller();

    public static TotalImpactFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TotalImpactFilter totalImpactFilter, ProtocolMarshaller protocolMarshaller) {

        if (totalImpactFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(totalImpactFilter.getNumericOperator(), NUMERICOPERATOR_BINDING);
            protocolMarshaller.marshall(totalImpactFilter.getStartValue(), STARTVALUE_BINDING);
            protocolMarshaller.marshall(totalImpactFilter.getEndValue(), ENDVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
