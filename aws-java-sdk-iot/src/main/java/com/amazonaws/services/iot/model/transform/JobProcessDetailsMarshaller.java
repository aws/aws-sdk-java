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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobProcessDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobProcessDetailsMarshaller {

    private static final MarshallingInfo<List> PROCESSINGTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processingTargets").build();
    private static final MarshallingInfo<Integer> NUMBEROFCANCELEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfCanceledThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFSUCCEEDEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfSucceededThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFFAILEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfFailedThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFREJECTEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRejectedThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFQUEUEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfQueuedThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFINPROGRESSTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfInProgressThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFREMOVEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRemovedThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFTIMEDOUTTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfTimedOutThings").build();

    private static final JobProcessDetailsMarshaller instance = new JobProcessDetailsMarshaller();

    public static JobProcessDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobProcessDetails jobProcessDetails, ProtocolMarshaller protocolMarshaller) {

        if (jobProcessDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobProcessDetails.getProcessingTargets(), PROCESSINGTARGETS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfCanceledThings(), NUMBEROFCANCELEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfSucceededThings(), NUMBEROFSUCCEEDEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfFailedThings(), NUMBEROFFAILEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfRejectedThings(), NUMBEROFREJECTEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfQueuedThings(), NUMBEROFQUEUEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfInProgressThings(), NUMBEROFINPROGRESSTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfRemovedThings(), NUMBEROFREMOVEDTHINGS_BINDING);
            protocolMarshaller.marshall(jobProcessDetails.getNumberOfTimedOutThings(), NUMBEROFTIMEDOUTTHINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
