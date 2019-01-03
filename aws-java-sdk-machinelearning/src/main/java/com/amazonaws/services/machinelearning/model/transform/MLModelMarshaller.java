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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MLModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MLModelMarshaller {

    private static final MarshallingInfo<String> MLMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MLModelId").build();
    private static final MarshallingInfo<String> TRAININGDATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingDataSourceId").build();
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
    private static final MarshallingInfo<Long> SIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SizeInBytes").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointInfo").build();
    private static final MarshallingInfo<Map> TRAININGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingParameters").build();
    private static final MarshallingInfo<String> INPUTDATALOCATIONS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataLocationS3").build();
    private static final MarshallingInfo<String> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Algorithm").build();
    private static final MarshallingInfo<String> MLMODELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MLModelType").build();
    private static final MarshallingInfo<Float> SCORETHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScoreThreshold").build();
    private static final MarshallingInfo<java.util.Date> SCORETHRESHOLDLASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScoreThresholdLastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<Long> COMPUTETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ComputeTime").build();
    private static final MarshallingInfo<java.util.Date> FINISHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinishedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedAt").timestampFormat("unixTimestamp").build();

    private static final MLModelMarshaller instance = new MLModelMarshaller();

    public static MLModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MLModel mLModel, ProtocolMarshaller protocolMarshaller) {

        if (mLModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mLModel.getMLModelId(), MLMODELID_BINDING);
            protocolMarshaller.marshall(mLModel.getTrainingDataSourceId(), TRAININGDATASOURCEID_BINDING);
            protocolMarshaller.marshall(mLModel.getCreatedByIamUser(), CREATEDBYIAMUSER_BINDING);
            protocolMarshaller.marshall(mLModel.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(mLModel.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(mLModel.getName(), NAME_BINDING);
            protocolMarshaller.marshall(mLModel.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(mLModel.getSizeInBytes(), SIZEINBYTES_BINDING);
            protocolMarshaller.marshall(mLModel.getEndpointInfo(), ENDPOINTINFO_BINDING);
            protocolMarshaller.marshall(mLModel.getTrainingParameters(), TRAININGPARAMETERS_BINDING);
            protocolMarshaller.marshall(mLModel.getInputDataLocationS3(), INPUTDATALOCATIONS3_BINDING);
            protocolMarshaller.marshall(mLModel.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(mLModel.getMLModelType(), MLMODELTYPE_BINDING);
            protocolMarshaller.marshall(mLModel.getScoreThreshold(), SCORETHRESHOLD_BINDING);
            protocolMarshaller.marshall(mLModel.getScoreThresholdLastUpdatedAt(), SCORETHRESHOLDLASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(mLModel.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(mLModel.getComputeTime(), COMPUTETIME_BINDING);
            protocolMarshaller.marshall(mLModel.getFinishedAt(), FINISHEDAT_BINDING);
            protocolMarshaller.marshall(mLModel.getStartedAt(), STARTEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
