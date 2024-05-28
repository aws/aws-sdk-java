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
 * JobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
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
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("iso8601").build();
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

    private static final JobSummaryMarshaller instance = new JobSummaryMarshaller();

    public static JobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobSummary jobSummary, ProtocolMarshaller protocolMarshaller) {

        if (jobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(jobSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(jobSummary.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(jobSummary.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobSummary.getLifecycleStatus(), LIFECYCLESTATUS_BINDING);
            protocolMarshaller.marshall(jobSummary.getLifecycleStatusMessage(), LIFECYCLESTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(jobSummary.getMaxFailedTasksCount(), MAXFAILEDTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(jobSummary.getMaxRetriesPerTask(), MAXRETRIESPERTASK_BINDING);
            protocolMarshaller.marshall(jobSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jobSummary.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(jobSummary.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(jobSummary.getTargetTaskRunStatus(), TARGETTASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(jobSummary.getTaskRunStatus(), TASKRUNSTATUS_BINDING);
            protocolMarshaller.marshall(jobSummary.getTaskRunStatusCounts(), TASKRUNSTATUSCOUNTS_BINDING);
            protocolMarshaller.marshall(jobSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(jobSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
