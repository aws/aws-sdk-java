/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobRunMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> JOBRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobRunId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRole").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> STATEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateDetails").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATIONOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationOverrides").build();
    private static final MarshallingInfo<StructuredPojo> JOBDRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDriver").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> TOTALRESOURCEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalResourceUtilization").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConfiguration").build();
    private static final MarshallingInfo<Integer> TOTALEXECUTIONDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalExecutionDurationSeconds").build();

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
            protocolMarshaller.marshall(jobRun.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(jobRun.getJobRunId(), JOBRUNID_BINDING);
            protocolMarshaller.marshall(jobRun.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jobRun.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(jobRun.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(jobRun.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(jobRun.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(jobRun.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(jobRun.getState(), STATE_BINDING);
            protocolMarshaller.marshall(jobRun.getStateDetails(), STATEDETAILS_BINDING);
            protocolMarshaller.marshall(jobRun.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(jobRun.getConfigurationOverrides(), CONFIGURATIONOVERRIDES_BINDING);
            protocolMarshaller.marshall(jobRun.getJobDriver(), JOBDRIVER_BINDING);
            protocolMarshaller.marshall(jobRun.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(jobRun.getTotalResourceUtilization(), TOTALRESOURCEUTILIZATION_BINDING);
            protocolMarshaller.marshall(jobRun.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(jobRun.getTotalExecutionDurationSeconds(), TOTALEXECUTIONDURATIONSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
