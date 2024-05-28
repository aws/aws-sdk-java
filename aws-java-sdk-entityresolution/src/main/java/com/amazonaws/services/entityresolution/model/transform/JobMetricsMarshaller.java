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
package com.amazonaws.services.entityresolution.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobMetricsMarshaller {

    private static final MarshallingInfo<Integer> INPUTRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputRecords").build();
    private static final MarshallingInfo<Integer> MATCHIDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("matchIDs").build();
    private static final MarshallingInfo<Integer> RECORDSNOTPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordsNotProcessed").build();
    private static final MarshallingInfo<Integer> TOTALRECORDSPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalRecordsProcessed").build();

    private static final JobMetricsMarshaller instance = new JobMetricsMarshaller();

    public static JobMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobMetrics jobMetrics, ProtocolMarshaller protocolMarshaller) {

        if (jobMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobMetrics.getInputRecords(), INPUTRECORDS_BINDING);
            protocolMarshaller.marshall(jobMetrics.getMatchIDs(), MATCHIDS_BINDING);
            protocolMarshaller.marshall(jobMetrics.getRecordsNotProcessed(), RECORDSNOTPROCESSED_BINDING);
            protocolMarshaller.marshall(jobMetrics.getTotalRecordsProcessed(), TOTALRECORDSPROCESSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
