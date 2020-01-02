/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProjectVersionDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProjectVersionDescriptionMarshaller {

    private static final MarshallingInfo<String> PROJECTVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectVersionArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> MININFERENCEUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinInferenceUnits").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<Long> BILLABLETRAININGTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillableTrainingTimeInSeconds").build();
    private static final MarshallingInfo<java.util.Date> TRAININGENDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingEndTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGDATARESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingDataResult").build();
    private static final MarshallingInfo<StructuredPojo> TESTINGDATARESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TestingDataResult").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationResult").build();

    private static final ProjectVersionDescriptionMarshaller instance = new ProjectVersionDescriptionMarshaller();

    public static ProjectVersionDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProjectVersionDescription projectVersionDescription, ProtocolMarshaller protocolMarshaller) {

        if (projectVersionDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(projectVersionDescription.getProjectVersionArn(), PROJECTVERSIONARN_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getMinInferenceUnits(), MININFERENCEUNITS_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getBillableTrainingTimeInSeconds(), BILLABLETRAININGTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getTrainingEndTimestamp(), TRAININGENDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getTrainingDataResult(), TRAININGDATARESULT_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getTestingDataResult(), TESTINGDATARESULT_BINDING);
            protocolMarshaller.marshall(projectVersionDescription.getEvaluationResult(), EVALUATIONRESULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
