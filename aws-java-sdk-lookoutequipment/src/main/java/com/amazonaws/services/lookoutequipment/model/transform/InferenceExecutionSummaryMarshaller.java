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
 * InferenceExecutionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceExecutionSummaryMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelArn").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerName").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerArn").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEDSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATASTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATAENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DATAINPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataInputConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATAOUTPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataOutputConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMERRESULTOBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerResultObject").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> FAILEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedReason").build();

    private static final InferenceExecutionSummaryMarshaller instance = new InferenceExecutionSummaryMarshaller();

    public static InferenceExecutionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceExecutionSummary inferenceExecutionSummary, ProtocolMarshaller protocolMarshaller) {

        if (inferenceExecutionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceExecutionSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getInferenceSchedulerName(), INFERENCESCHEDULERNAME_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getInferenceSchedulerArn(), INFERENCESCHEDULERARN_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getScheduledStartTime(), SCHEDULEDSTARTTIME_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getDataStartTime(), DATASTARTTIME_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getDataEndTime(), DATAENDTIME_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getDataInputConfiguration(), DATAINPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getDataOutputConfiguration(), DATAOUTPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getCustomerResultObject(), CUSTOMERRESULTOBJECT_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(inferenceExecutionSummary.getFailedReason(), FAILEDREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
