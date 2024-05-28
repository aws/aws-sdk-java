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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelSummaryMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelArn").build();
    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetName").build();
    private static final MarshallingInfo<String> DATASETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> ACTIVEMODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveModelVersion").build();
    private static final MarshallingInfo<String> ACTIVEMODELVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveModelVersionArn").build();
    private static final MarshallingInfo<String> LATESTSCHEDULEDRETRAININGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestScheduledRetrainingStatus").build();
    private static final MarshallingInfo<Long> LATESTSCHEDULEDRETRAININGMODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestScheduledRetrainingModelVersion").build();
    private static final MarshallingInfo<java.util.Date> LATESTSCHEDULEDRETRAININGSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestScheduledRetrainingStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NEXTSCHEDULEDRETRAININGSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextScheduledRetrainingStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RETRAININGSCHEDULERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrainingSchedulerStatus").build();
    private static final MarshallingInfo<StructuredPojo> MODELDIAGNOSTICSOUTPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelDiagnosticsOutputConfiguration").build();
    private static final MarshallingInfo<String> MODELQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQuality").build();

    private static final ModelSummaryMarshaller instance = new ModelSummaryMarshaller();

    public static ModelSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelSummary modelSummary, ProtocolMarshaller protocolMarshaller) {

        if (modelSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(modelSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(modelSummary.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(modelSummary.getDatasetArn(), DATASETARN_BINDING);
            protocolMarshaller.marshall(modelSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(modelSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(modelSummary.getActiveModelVersion(), ACTIVEMODELVERSION_BINDING);
            protocolMarshaller.marshall(modelSummary.getActiveModelVersionArn(), ACTIVEMODELVERSIONARN_BINDING);
            protocolMarshaller.marshall(modelSummary.getLatestScheduledRetrainingStatus(), LATESTSCHEDULEDRETRAININGSTATUS_BINDING);
            protocolMarshaller.marshall(modelSummary.getLatestScheduledRetrainingModelVersion(), LATESTSCHEDULEDRETRAININGMODELVERSION_BINDING);
            protocolMarshaller.marshall(modelSummary.getLatestScheduledRetrainingStartTime(), LATESTSCHEDULEDRETRAININGSTARTTIME_BINDING);
            protocolMarshaller.marshall(modelSummary.getNextScheduledRetrainingStartDate(), NEXTSCHEDULEDRETRAININGSTARTDATE_BINDING);
            protocolMarshaller.marshall(modelSummary.getRetrainingSchedulerStatus(), RETRAININGSCHEDULERSTATUS_BINDING);
            protocolMarshaller.marshall(modelSummary.getModelDiagnosticsOutputConfiguration(), MODELDIAGNOSTICSOUTPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(modelSummary.getModelQuality(), MODELQUALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
