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
package com.amazonaws.services.voiceid.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.voiceid.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SpeakerEnrollmentJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SpeakerEnrollmentJobSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainId").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> FAILUREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureDetails").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<StructuredPojo> JOBPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobProgress").build();
    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobStatus").build();

    private static final SpeakerEnrollmentJobSummaryMarshaller instance = new SpeakerEnrollmentJobSummaryMarshaller();

    public static SpeakerEnrollmentJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SpeakerEnrollmentJobSummary speakerEnrollmentJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (speakerEnrollmentJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getFailureDetails(), FAILUREDETAILS_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getJobProgress(), JOBPROGRESS_BINDING);
            protocolMarshaller.marshall(speakerEnrollmentJobSummary.getJobStatus(), JOBSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
