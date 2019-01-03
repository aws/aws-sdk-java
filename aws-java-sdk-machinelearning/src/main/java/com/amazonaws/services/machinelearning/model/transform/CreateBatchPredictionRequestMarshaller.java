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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBatchPredictionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBatchPredictionRequestMarshaller {

    private static final MarshallingInfo<String> BATCHPREDICTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchPredictionId").build();
    private static final MarshallingInfo<String> BATCHPREDICTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchPredictionName").build();
    private static final MarshallingInfo<String> MLMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MLModelId").build();
    private static final MarshallingInfo<String> BATCHPREDICTIONDATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchPredictionDataSourceId").build();
    private static final MarshallingInfo<String> OUTPUTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputUri").build();

    private static final CreateBatchPredictionRequestMarshaller instance = new CreateBatchPredictionRequestMarshaller();

    public static CreateBatchPredictionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBatchPredictionRequest createBatchPredictionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBatchPredictionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBatchPredictionRequest.getBatchPredictionId(), BATCHPREDICTIONID_BINDING);
            protocolMarshaller.marshall(createBatchPredictionRequest.getBatchPredictionName(), BATCHPREDICTIONNAME_BINDING);
            protocolMarshaller.marshall(createBatchPredictionRequest.getMLModelId(), MLMODELID_BINDING);
            protocolMarshaller.marshall(createBatchPredictionRequest.getBatchPredictionDataSourceId(), BATCHPREDICTIONDATASOURCEID_BINDING);
            protocolMarshaller.marshall(createBatchPredictionRequest.getOutputUri(), OUTPUTURI_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
