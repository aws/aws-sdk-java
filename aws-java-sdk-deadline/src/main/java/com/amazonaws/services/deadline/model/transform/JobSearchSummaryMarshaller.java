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
 * JobSearchSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobSearchSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<Map> JOBPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobParameters").build();
    private static final MarshallingInfo<String> LIFECYCLESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStatus").build();
    private static final MarshallingInfo<String> LIFECYCLESTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStatusMessage").build();
    private static final MarshallingInfo<Integer> MAXFAILEDTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxFailedTasksCount").build();
    private static final MarshallingInfo<Integer> MAXRETRIESPERTASK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxRetriesPerTask").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priority").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queueId").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TARGETTASKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetTaskRunStatus").build();
    private static final MarshallingInfo<String> TASKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRunStatus").build();
    private static final MarshallingInfo<Map> TASKRUNSTATUSCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRunStatusCounts").build();

    private static final JobSearchSummaryMarshaller instance = new JobSearchSummaryMarshaller();

    public static JobSearchSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobSearchSummary jobSearchSummary, ProtocolMarshaller protocolMarshaller) {

        if (jobSearchSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobSearchSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getJobParameters(), JOBPARAMETERS_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getLifecycleStatus(), LIFECYCLESTATUS_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getLifecycleStatusMessage(), LIFECYCLESTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getMaxFailedTasksCount(), MAXFAILEDTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getMaxRetriesPerTask(), MAXRETRIESPERTASK_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getTargetTaskRunStatus(), TARGETTASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getTaskRunStatus(), TASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(jobSearchSummary.getTaskRunStatusCounts(), TASKRUNSTATUSCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
