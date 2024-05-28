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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RunMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RunMetricsMarshaller {

    private static final MarshallingInfo<String> NUMBEROFBYTESCOMPACTED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfBytesCompacted").build();
    private static final MarshallingInfo<String> NUMBEROFFILESCOMPACTED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfFilesCompacted").build();
    private static final MarshallingInfo<String> NUMBEROFDPUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDpus").build();
    private static final MarshallingInfo<String> JOBDURATIONINHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDurationInHour").build();

    private static final RunMetricsMarshaller instance = new RunMetricsMarshaller();

    public static RunMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RunMetrics runMetrics, ProtocolMarshaller protocolMarshaller) {

        if (runMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(runMetrics.getNumberOfBytesCompacted(), NUMBEROFBYTESCOMPACTED_BINDING);
            protocolMarshaller.marshall(runMetrics.getNumberOfFilesCompacted(), NUMBEROFFILESCOMPACTED_BINDING);
            protocolMarshaller.marshall(runMetrics.getNumberOfDpus(), NUMBEROFDPUS_BINDING);
            protocolMarshaller.marshall(runMetrics.getJobDurationInHour(), JOBDURATIONINHOUR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
