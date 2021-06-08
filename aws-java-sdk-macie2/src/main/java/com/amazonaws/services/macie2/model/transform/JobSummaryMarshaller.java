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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobSummaryMarshaller {

    private static final MarshallingInfo<List> BUCKETDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketDefinitions").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobStatus").build();
    private static final MarshallingInfo<String> JOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobType").build();
    private static final MarshallingInfo<StructuredPojo> LASTRUNERRORSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRunErrorStatus").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> USERPAUSEDDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userPausedDetails").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketCriteria").build();

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
            protocolMarshaller.marshall(jobSummary.getBucketDefinitions(), BUCKETDEFINITIONS_BINDING);
            protocolMarshaller.marshall(jobSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(jobSummary.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobSummary.getJobStatus(), JOBSTATUS_BINDING);
            protocolMarshaller.marshall(jobSummary.getJobType(), JOBTYPE_BINDING);
            protocolMarshaller.marshall(jobSummary.getLastRunErrorStatus(), LASTRUNERRORSTATUS_BINDING);
            protocolMarshaller.marshall(jobSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(jobSummary.getUserPausedDetails(), USERPAUSEDDETAILS_BINDING);
            protocolMarshaller.marshall(jobSummary.getBucketCriteria(), BUCKETCRITERIA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
