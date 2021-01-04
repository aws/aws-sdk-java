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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobDetailsMarshaller {

    private static final MarshallingInfo<String> ISDEFINEDINJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isDefinedInJob").build();
    private static final MarshallingInfo<String> ISMONITOREDBYJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isMonitoredByJob").build();
    private static final MarshallingInfo<String> LASTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lastJobId").build();
    private static final MarshallingInfo<java.util.Date> LASTJOBRUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastJobRunTime").timestampFormat("iso8601").build();

    private static final JobDetailsMarshaller instance = new JobDetailsMarshaller();

    public static JobDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobDetails jobDetails, ProtocolMarshaller protocolMarshaller) {

        if (jobDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobDetails.getIsDefinedInJob(), ISDEFINEDINJOB_BINDING);
            protocolMarshaller.marshall(jobDetails.getIsMonitoredByJob(), ISMONITOREDBYJOB_BINDING);
            protocolMarshaller.marshall(jobDetails.getLastJobId(), LASTJOBID_BINDING);
            protocolMarshaller.marshall(jobDetails.getLastJobRunTime(), LASTJOBRUNTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
