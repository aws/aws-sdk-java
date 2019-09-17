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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingJobStatusCountersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingJobStatusCountersMarshaller {

    private static final MarshallingInfo<Integer> COMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Completed").build();
    private static final MarshallingInfo<Integer> INPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InProgress").build();
    private static final MarshallingInfo<Integer> RETRYABLEERROR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryableError").build();
    private static final MarshallingInfo<Integer> NONRETRYABLEERROR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonRetryableError").build();
    private static final MarshallingInfo<Integer> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stopped").build();

    private static final TrainingJobStatusCountersMarshaller instance = new TrainingJobStatusCountersMarshaller();

    public static TrainingJobStatusCountersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingJobStatusCounters trainingJobStatusCounters, ProtocolMarshaller protocolMarshaller) {

        if (trainingJobStatusCounters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingJobStatusCounters.getCompleted(), COMPLETED_BINDING);
            protocolMarshaller.marshall(trainingJobStatusCounters.getInProgress(), INPROGRESS_BINDING);
            protocolMarshaller.marshall(trainingJobStatusCounters.getRetryableError(), RETRYABLEERROR_BINDING);
            protocolMarshaller.marshall(trainingJobStatusCounters.getNonRetryableError(), NONRETRYABLEERROR_BINDING);
            protocolMarshaller.marshall(trainingJobStatusCounters.getStopped(), STOPPED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
