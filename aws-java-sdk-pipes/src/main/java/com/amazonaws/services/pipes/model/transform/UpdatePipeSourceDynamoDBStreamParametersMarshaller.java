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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePipeSourceDynamoDBStreamParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePipeSourceDynamoDBStreamParametersMarshaller {

    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<StructuredPojo> DEADLETTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeadLetterConfig").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();
    private static final MarshallingInfo<Integer> MAXIMUMRECORDAGEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRecordAgeInSeconds").build();
    private static final MarshallingInfo<Integer> MAXIMUMRETRYATTEMPTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRetryAttempts").build();
    private static final MarshallingInfo<String> ONPARTIALBATCHITEMFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnPartialBatchItemFailure").build();
    private static final MarshallingInfo<Integer> PARALLELIZATIONFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelizationFactor").build();

    private static final UpdatePipeSourceDynamoDBStreamParametersMarshaller instance = new UpdatePipeSourceDynamoDBStreamParametersMarshaller();

    public static UpdatePipeSourceDynamoDBStreamParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePipeSourceDynamoDBStreamParameters updatePipeSourceDynamoDBStreamParameters, ProtocolMarshaller protocolMarshaller) {

        if (updatePipeSourceDynamoDBStreamParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getDeadLetterConfig(), DEADLETTERCONFIG_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getMaximumBatchingWindowInSeconds(), MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getMaximumRecordAgeInSeconds(), MAXIMUMRECORDAGEINSECONDS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getMaximumRetryAttempts(), MAXIMUMRETRYATTEMPTS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getOnPartialBatchItemFailure(), ONPARTIALBATCHITEMFAILURE_BINDING);
            protocolMarshaller.marshall(updatePipeSourceDynamoDBStreamParameters.getParallelizationFactor(), PARALLELIZATIONFACTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
