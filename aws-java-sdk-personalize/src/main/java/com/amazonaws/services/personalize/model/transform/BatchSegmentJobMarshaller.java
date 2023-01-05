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
package com.amazonaws.services.personalize.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchSegmentJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchSegmentJobMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> BATCHSEGMENTJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("batchSegmentJobArn").build();
    private static final MarshallingInfo<String> FILTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filterArn").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<String> SOLUTIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("solutionVersionArn").build();
    private static final MarshallingInfo<Integer> NUMRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numResults").build();
    private static final MarshallingInfo<StructuredPojo> JOBINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobInput").build();
    private static final MarshallingInfo<StructuredPojo> JOBOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobOutput").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final BatchSegmentJobMarshaller instance = new BatchSegmentJobMarshaller();

    public static BatchSegmentJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchSegmentJob batchSegmentJob, ProtocolMarshaller protocolMarshaller) {

        if (batchSegmentJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchSegmentJob.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getBatchSegmentJobArn(), BATCHSEGMENTJOBARN_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getFilterArn(), FILTERARN_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getSolutionVersionArn(), SOLUTIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getNumResults(), NUMRESULTS_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getJobInput(), JOBINPUT_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getJobOutput(), JOBOUTPUT_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(batchSegmentJob.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
