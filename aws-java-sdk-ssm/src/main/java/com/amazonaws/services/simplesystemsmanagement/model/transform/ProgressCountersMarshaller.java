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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProgressCountersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProgressCountersMarshaller {

    private static final MarshallingInfo<Integer> TOTALSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalSteps").build();
    private static final MarshallingInfo<Integer> SUCCESSSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessSteps").build();
    private static final MarshallingInfo<Integer> FAILEDSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedSteps").build();
    private static final MarshallingInfo<Integer> CANCELLEDSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CancelledSteps").build();
    private static final MarshallingInfo<Integer> TIMEDOUTSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimedOutSteps").build();

    private static final ProgressCountersMarshaller instance = new ProgressCountersMarshaller();

    public static ProgressCountersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProgressCounters progressCounters, ProtocolMarshaller protocolMarshaller) {

        if (progressCounters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(progressCounters.getTotalSteps(), TOTALSTEPS_BINDING);
            protocolMarshaller.marshall(progressCounters.getSuccessSteps(), SUCCESSSTEPS_BINDING);
            protocolMarshaller.marshall(progressCounters.getFailedSteps(), FAILEDSTEPS_BINDING);
            protocolMarshaller.marshall(progressCounters.getCancelledSteps(), CANCELLEDSTEPS_BINDING);
            protocolMarshaller.marshall(progressCounters.getTimedOutSteps(), TIMEDOUTSTEPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
