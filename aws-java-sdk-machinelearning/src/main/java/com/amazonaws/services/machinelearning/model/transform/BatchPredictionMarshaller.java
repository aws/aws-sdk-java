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
 * BatchPredictionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchPredictionMarshaller {

    private static final MarshallingInfo<String> BATCHPREDICTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchPredictionId").build();
    private static final MarshallingInfo<String> MLMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MLModelId").build();
    private static final MarshallingInfo<String> BATCHPREDICTIONDATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchPredictionDataSourceId").build();
    private static final MarshallingInfo<String> INPUTDATALOCATIONS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataLocationS3").build();
    private static final MarshallingInfo<String> CREATEDBYIAMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedByIamUser").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> OUTPUTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputUri").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<Long> COMPUTETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ComputeTime").build();
    private static final MarshallingInfo<java.util.Date> FINISHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinishedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> TOTALRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRecordCount").build();
    private static final MarshallingInfo<Long> INVALIDRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvalidRecordCount").build();

    private static final BatchPredictionMarshaller instance = new BatchPredictionMarshaller();

    public static BatchPredictionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchPrediction batchPrediction, ProtocolMarshaller protocolMarshaller) {

        if (batchPrediction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchPrediction.getBatchPredictionId(), BATCHPREDICTIONID_BINDING);
            protocolMarshaller.marshall(batchPrediction.getMLModelId(), MLMODELID_BINDING);
            protocolMarshaller.marshall(batchPrediction.getBatchPredictionDataSourceId(), BATCHPREDICTIONDATASOURCEID_BINDING);
            protocolMarshaller.marshall(batchPrediction.getInputDataLocationS3(), INPUTDATALOCATIONS3_BINDING);
            protocolMarshaller.marshall(batchPrediction.getCreatedByIamUser(), CREATEDBYIAMUSER_BINDING);
            protocolMarshaller.marshall(batchPrediction.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getName(), NAME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(batchPrediction.getOutputUri(), OUTPUTURI_BINDING);
            protocolMarshaller.marshall(batchPrediction.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(batchPrediction.getComputeTime(), COMPUTETIME_BINDING);
            protocolMarshaller.marshall(batchPrediction.getFinishedAt(), FINISHEDAT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getTotalRecordCount(), TOTALRECORDCOUNT_BINDING);
            protocolMarshaller.marshall(batchPrediction.getInvalidRecordCount(), INVALIDRECORDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
