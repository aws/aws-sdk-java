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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CountersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CountersMarshaller {

    private static final MarshallingInfo<Integer> TOTAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("total").build();
    private static final MarshallingInfo<Integer> PASSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("passed").build();
    private static final MarshallingInfo<Integer> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failed").build();
    private static final MarshallingInfo<Integer> WARNED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("warned").build();
    private static final MarshallingInfo<Integer> ERRORED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errored").build();
    private static final MarshallingInfo<Integer> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stopped").build();
    private static final MarshallingInfo<Integer> SKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("skipped").build();

    private static final CountersMarshaller instance = new CountersMarshaller();

    public static CountersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Counters counters, ProtocolMarshaller protocolMarshaller) {

        if (counters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(counters.getTotal(), TOTAL_BINDING);
            protocolMarshaller.marshall(counters.getPassed(), PASSED_BINDING);
            protocolMarshaller.marshall(counters.getFailed(), FAILED_BINDING);
            protocolMarshaller.marshall(counters.getWarned(), WARNED_BINDING);
            protocolMarshaller.marshall(counters.getErrored(), ERRORED_BINDING);
            protocolMarshaller.marshall(counters.getStopped(), STOPPED_BINDING);
            protocolMarshaller.marshall(counters.getSkipped(), SKIPPED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
