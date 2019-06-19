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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobRunMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Integer> ATTEMPT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attempt").build();
    private static final MarshallingInfo<String> PREVIOUSRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousRunId").build();
    private static final MarshallingInfo<String> TRIGGERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TriggerName").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> JOBRUNSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobRunState").build();
    private static final MarshallingInfo<Map> ARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arguments").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<List> PREDECESSORRUNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredecessorRuns").build();
    private static final MarshallingInfo<Integer> ALLOCATEDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedCapacity").build();
    private static final MarshallingInfo<Integer> EXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionTime").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Double> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONPROPERTY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationProperty").build();
    private static final MarshallingInfo<String> WORKERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkerType").build();
    private static final MarshallingInfo<Integer> NUMBEROFWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfWorkers").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogGroupName").build();

    private static final JobRunMarshaller instance = new JobRunMarshaller();

    public static JobRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobRun jobRun, ProtocolMarshaller protocolMarshaller) {

        if (jobRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobRun.getId(), ID_BINDING);
            protocolMarshaller.marshall(jobRun.getAttempt(), ATTEMPT_BINDING);
            protocolMarshaller.marshall(jobRun.getPreviousRunId(), PREVIOUSRUNID_BINDING);
            protocolMarshaller.marshall(jobRun.getTriggerName(), TRIGGERNAME_BINDING);
            protocolMarshaller.marshall(jobRun.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(jobRun.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(jobRun.getLastModifiedOn(), LASTMODIFIEDON_BINDING);
            protocolMarshaller.marshall(jobRun.getCompletedOn(), COMPLETEDON_BINDING);
            protocolMarshaller.marshall(jobRun.getJobRunState(), JOBRUNSTATE_BINDING);
            protocolMarshaller.marshall(jobRun.getArguments(), ARGUMENTS_BINDING);
            protocolMarshaller.marshall(jobRun.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(jobRun.getPredecessorRuns(), PREDECESSORRUNS_BINDING);
            protocolMarshaller.marshall(jobRun.getAllocatedCapacity(), ALLOCATEDCAPACITY_BINDING);
            protocolMarshaller.marshall(jobRun.getExecutionTime(), EXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(jobRun.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(jobRun.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(jobRun.getNotificationProperty(), NOTIFICATIONPROPERTY_BINDING);
            protocolMarshaller.marshall(jobRun.getWorkerType(), WORKERTYPE_BINDING);
            protocolMarshaller.marshall(jobRun.getNumberOfWorkers(), NUMBEROFWORKERS_BINDING);
            protocolMarshaller.marshall(jobRun.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(jobRun.getLogGroupName(), LOGGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
