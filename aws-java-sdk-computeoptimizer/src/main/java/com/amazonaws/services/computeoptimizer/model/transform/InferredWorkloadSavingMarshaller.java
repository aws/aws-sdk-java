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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferredWorkloadSavingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferredWorkloadSavingMarshaller {

    private static final MarshallingInfo<List> INFERREDWORKLOADTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferredWorkloadTypes").build();
    private static final MarshallingInfo<StructuredPojo> ESTIMATEDMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlySavings").build();

    private static final InferredWorkloadSavingMarshaller instance = new InferredWorkloadSavingMarshaller();

    public static InferredWorkloadSavingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferredWorkloadSaving inferredWorkloadSaving, ProtocolMarshaller protocolMarshaller) {

        if (inferredWorkloadSaving == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferredWorkloadSaving.getInferredWorkloadTypes(), INFERREDWORKLOADTYPES_BINDING);
            protocolMarshaller.marshall(inferredWorkloadSaving.getEstimatedMonthlySavings(), ESTIMATEDMONTHLYSAVINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
