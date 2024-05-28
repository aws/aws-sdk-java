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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FlywheelIterationPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FlywheelIterationPropertiesMarshaller {

    private static final MarshallingInfo<String> FLYWHEELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlywheelArn").build();
    private static final MarshallingInfo<String> FLYWHEELITERATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlywheelIterationId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<String> EVALUATEDMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluatedModelArn").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATEDMODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluatedModelMetrics").build();
    private static final MarshallingInfo<String> TRAINEDMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainedModelArn").build();
    private static final MarshallingInfo<StructuredPojo> TRAINEDMODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainedModelMetrics").build();
    private static final MarshallingInfo<String> EVALUATIONMANIFESTS3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationManifestS3Prefix").build();

    private static final FlywheelIterationPropertiesMarshaller instance = new FlywheelIterationPropertiesMarshaller();

    public static FlywheelIterationPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FlywheelIterationProperties flywheelIterationProperties, ProtocolMarshaller protocolMarshaller) {

        if (flywheelIterationProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(flywheelIterationProperties.getFlywheelArn(), FLYWHEELARN_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getFlywheelIterationId(), FLYWHEELITERATIONID_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getEvaluatedModelArn(), EVALUATEDMODELARN_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getEvaluatedModelMetrics(), EVALUATEDMODELMETRICS_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getTrainedModelArn(), TRAINEDMODELARN_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getTrainedModelMetrics(), TRAINEDMODELMETRICS_BINDING);
            protocolMarshaller.marshall(flywheelIterationProperties.getEvaluationManifestS3Prefix(), EVALUATIONMANIFESTS3PREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
