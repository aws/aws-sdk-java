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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CalculationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CalculationResultMarshaller {

    private static final MarshallingInfo<String> STDOUTS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StdOutS3Uri").build();
    private static final MarshallingInfo<String> STDERRORS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StdErrorS3Uri").build();
    private static final MarshallingInfo<String> RESULTS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultS3Uri").build();
    private static final MarshallingInfo<String> RESULTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultType").build();

    private static final CalculationResultMarshaller instance = new CalculationResultMarshaller();

    public static CalculationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CalculationResult calculationResult, ProtocolMarshaller protocolMarshaller) {

        if (calculationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(calculationResult.getStdOutS3Uri(), STDOUTS3URI_BINDING);
            protocolMarshaller.marshall(calculationResult.getStdErrorS3Uri(), STDERRORS3URI_BINDING);
            protocolMarshaller.marshall(calculationResult.getResultS3Uri(), RESULTS3URI_BINDING);
            protocolMarshaller.marshall(calculationResult.getResultType(), RESULTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
