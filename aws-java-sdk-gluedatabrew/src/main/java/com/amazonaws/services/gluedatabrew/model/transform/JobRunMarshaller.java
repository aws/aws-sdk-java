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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobRunMarshaller {

    private static final MarshallingInfo<Integer> ATTEMPT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attempt").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DATASETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetName").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<Integer> EXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionTime").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RunId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> LOGSUBSCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogSubscription").build();
    private static final MarshallingInfo<String> LOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogGroupName").build();
    private static final MarshallingInfo<List> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Outputs").build();
    private static final MarshallingInfo<List> DATACATALOGOUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataCatalogOutputs").build();
    private static final MarshallingInfo<StructuredPojo> RECIPEREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecipeReference").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartedBy").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> JOBSAMPLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobSample").build();

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
            protocolMarshaller.marshall(jobRun.getAttempt(), ATTEMPT_BINDING);
            protocolMarshaller.marshall(jobRun.getCompletedOn(), COMPLETEDON_BINDING);
            protocolMarshaller.marshall(jobRun.getDatasetName(), DATASETNAME_BINDING);
            protocolMarshaller.marshall(jobRun.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(jobRun.getExecutionTime(), EXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(jobRun.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(jobRun.getRunId(), RUNID_BINDING);
            protocolMarshaller.marshall(jobRun.getState(), STATE_BINDING);
            protocolMarshaller.marshall(jobRun.getLogSubscription(), LOGSUBSCRIPTION_BINDING);
            protocolMarshaller.marshall(jobRun.getLogGroupName(), LOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(jobRun.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(jobRun.getDataCatalogOutputs(), DATACATALOGOUTPUTS_BINDING);
            protocolMarshaller.marshall(jobRun.getRecipeReference(), RECIPEREFERENCE_BINDING);
            protocolMarshaller.marshall(jobRun.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(jobRun.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(jobRun.getJobSample(), JOBSAMPLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
