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
package com.amazonaws.services.deadline.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<StructuredPojo> DEPENDENCYCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dependencyCounts").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> LIFECYCLESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStatus").build();
    private static final MarshallingInfo<String> LIFECYCLESTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStatusMessage").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STEPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stepId").build();
    private static final MarshallingInfo<String> TARGETTASKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetTaskRunStatus").build();
    private static final MarshallingInfo<String> TASKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRunStatus").build();
    private static final MarshallingInfo<Map> TASKRUNSTATUSCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRunStatusCounts").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();

    private static final StepSummaryMarshaller instance = new StepSummaryMarshaller();

    public static StepSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepSummary stepSummary, ProtocolMarshaller protocolMarshaller) {

        if (stepSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(stepSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(stepSummary.getDependencyCounts(), DEPENDENCYCOUNTS_BINDING);
            protocolMarshaller.marshall(stepSummary.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(stepSummary.getLifecycleStatus(), LIFECYCLESTATUS_BINDING);
            protocolMarshaller.marshall(stepSummary.getLifecycleStatusMessage(), LIFECYCLESTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(stepSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(stepSummary.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(stepSummary.getStepId(), STEPID_BINDING);
            protocolMarshaller.marshall(stepSummary.getTargetTaskRunStatus(), TARGETTASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(stepSummary.getTaskRunStatus(), TASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(stepSummary.getTaskRunStatusCounts(), TASKRUNSTATUSCOUNTS_BINDING);
            protocolMarshaller.marshall(stepSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(stepSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
