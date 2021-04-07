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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifeCycleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifeCycleMarshaller {

    private static final MarshallingInfo<String> ADDEDTOSERVICEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addedToServiceDateTime").build();
    private static final MarshallingInfo<String> ELAPSEDREPLICATIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elapsedReplicationDuration").build();
    private static final MarshallingInfo<String> FIRSTBYTEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstByteDateTime").build();
    private static final MarshallingInfo<StructuredPojo> LASTCUTOVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastCutover").build();
    private static final MarshallingInfo<String> LASTSEENBYSERVICEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastSeenByServiceDateTime").build();
    private static final MarshallingInfo<StructuredPojo> LASTTEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastTest").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();

    private static final LifeCycleMarshaller instance = new LifeCycleMarshaller();

    public static LifeCycleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifeCycle lifeCycle, ProtocolMarshaller protocolMarshaller) {

        if (lifeCycle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifeCycle.getAddedToServiceDateTime(), ADDEDTOSERVICEDATETIME_BINDING);
            protocolMarshaller.marshall(lifeCycle.getElapsedReplicationDuration(), ELAPSEDREPLICATIONDURATION_BINDING);
            protocolMarshaller.marshall(lifeCycle.getFirstByteDateTime(), FIRSTBYTEDATETIME_BINDING);
            protocolMarshaller.marshall(lifeCycle.getLastCutover(), LASTCUTOVER_BINDING);
            protocolMarshaller.marshall(lifeCycle.getLastSeenByServiceDateTime(), LASTSEENBYSERVICEDATETIME_BINDING);
            protocolMarshaller.marshall(lifeCycle.getLastTest(), LASTTEST_BINDING);
            protocolMarshaller.marshall(lifeCycle.getState(), STATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
