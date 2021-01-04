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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectMitigationActionsTaskSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectMitigationActionsTaskSummaryMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<String> TASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStatus").build();
    private static final MarshallingInfo<java.util.Date> TASKSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TASKENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("target").build();
    private static final MarshallingInfo<StructuredPojo> VIOLATIONEVENTOCCURRENCERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("violationEventOccurrenceRange").build();
    private static final MarshallingInfo<Boolean> ONLYACTIVEVIOLATIONSINCLUDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("onlyActiveViolationsIncluded").build();
    private static final MarshallingInfo<Boolean> SUPPRESSEDALERTSINCLUDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressedAlertsIncluded").build();
    private static final MarshallingInfo<List> ACTIONSDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionsDefinition").build();
    private static final MarshallingInfo<StructuredPojo> TASKSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStatistics").build();

    private static final DetectMitigationActionsTaskSummaryMarshaller instance = new DetectMitigationActionsTaskSummaryMarshaller();

    public static DetectMitigationActionsTaskSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary, ProtocolMarshaller protocolMarshaller) {

        if (detectMitigationActionsTaskSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTaskStatus(), TASKSTATUS_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTaskStartTime(), TASKSTARTTIME_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTaskEndTime(), TASKENDTIME_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getViolationEventOccurrenceRange(), VIOLATIONEVENTOCCURRENCERANGE_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getOnlyActiveViolationsIncluded(), ONLYACTIVEVIOLATIONSINCLUDED_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getSuppressedAlertsIncluded(), SUPPRESSEDALERTSINCLUDED_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getActionsDefinition(), ACTIONSDEFINITION_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskSummary.getTaskStatistics(), TASKSTATISTICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
