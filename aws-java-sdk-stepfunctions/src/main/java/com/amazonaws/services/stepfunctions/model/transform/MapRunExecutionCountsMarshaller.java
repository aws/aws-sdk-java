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
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MapRunExecutionCountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MapRunExecutionCountsMarshaller {

    private static final MarshallingInfo<Long> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pending").build();
    private static final MarshallingInfo<Long> RUNNING_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("running").build();
    private static final MarshallingInfo<Long> SUCCEEDED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("succeeded").build();
    private static final MarshallingInfo<Long> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failed").build();
    private static final MarshallingInfo<Long> TIMEDOUT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timedOut").build();
    private static final MarshallingInfo<Long> ABORTED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("aborted").build();
    private static final MarshallingInfo<Long> TOTAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("total").build();
    private static final MarshallingInfo<Long> RESULTSWRITTEN_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resultsWritten").build();

    private static final MapRunExecutionCountsMarshaller instance = new MapRunExecutionCountsMarshaller();

    public static MapRunExecutionCountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MapRunExecutionCounts mapRunExecutionCounts, ProtocolMarshaller protocolMarshaller) {

        if (mapRunExecutionCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mapRunExecutionCounts.getPending(), PENDING_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getRunning(), RUNNING_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getSucceeded(), SUCCEEDED_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getFailed(), FAILED_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getTimedOut(), TIMEDOUT_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getAborted(), ABORTED_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getTotal(), TOTAL_BINDING);
            protocolMarshaller.marshall(mapRunExecutionCounts.getResultsWritten(), RESULTSWRITTEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
