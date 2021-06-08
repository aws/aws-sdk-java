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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferenceSchedulerSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceSchedulerSummaryMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelArn").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerName").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Long> DATADELAYOFFSETINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataDelayOffsetInMinutes").build();
    private static final MarshallingInfo<String> DATAUPLOADFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataUploadFrequency").build();

    private static final InferenceSchedulerSummaryMarshaller instance = new InferenceSchedulerSummaryMarshaller();

    public static InferenceSchedulerSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceSchedulerSummary inferenceSchedulerSummary, ProtocolMarshaller protocolMarshaller) {

        if (inferenceSchedulerSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceSchedulerSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getInferenceSchedulerName(), INFERENCESCHEDULERNAME_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getInferenceSchedulerArn(), INFERENCESCHEDULERARN_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getDataDelayOffsetInMinutes(), DATADELAYOFFSETINMINUTES_BINDING);
            protocolMarshaller.marshall(inferenceSchedulerSummary.getDataUploadFrequency(), DATAUPLOADFREQUENCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
