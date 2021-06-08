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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelRequestMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetName").build();
    private static final MarshallingInfo<StructuredPojo> DATASETSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetSchema").build();
    private static final MarshallingInfo<StructuredPojo> LABELSINPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelsInputConfiguration").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<java.util.Date> TRAININGDATASTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingDataStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGDATAENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingDataEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVALUATIONDATASTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationDataStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVALUATIONDATAENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationDataEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<StructuredPojo> DATAPREPROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataPreProcessingConfiguration").build();
    private static final MarshallingInfo<String> SERVERSIDEKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerSideKmsKeyId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateModelRequestMarshaller instance = new CreateModelRequestMarshaller();

    public static CreateModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelRequest createModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getDatasetSchema(), DATASETSCHEMA_BINDING);
            protocolMarshaller.marshall(createModelRequest.getLabelsInputConfiguration(), LABELSINPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createModelRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createModelRequest.getTrainingDataStartTime(), TRAININGDATASTARTTIME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getTrainingDataEndTime(), TRAININGDATAENDTIME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getEvaluationDataStartTime(), EVALUATIONDATASTARTTIME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getEvaluationDataEndTime(), EVALUATIONDATAENDTIME_BINDING);
            protocolMarshaller.marshall(createModelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createModelRequest.getDataPreProcessingConfiguration(), DATAPREPROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createModelRequest.getServerSideKmsKeyId(), SERVERSIDEKMSKEYID_BINDING);
            protocolMarshaller.marshall(createModelRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
