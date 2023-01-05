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
package com.amazonaws.services.drs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoveryInstanceFailbackMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoveryInstanceFailbackMarshaller {

    private static final MarshallingInfo<String> AGENTLASTSEENBYSERVICEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentLastSeenByServiceDateTime").build();
    private static final MarshallingInfo<String> ELAPSEDREPLICATIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elapsedReplicationDuration").build();
    private static final MarshallingInfo<String> FAILBACKCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackClientID").build();
    private static final MarshallingInfo<String> FAILBACKCLIENTLASTSEENBYSERVICEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackClientLastSeenByServiceDateTime").build();
    private static final MarshallingInfo<String> FAILBACKINITIATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackInitiationTime").build();
    private static final MarshallingInfo<String> FAILBACKJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackJobID").build();
    private static final MarshallingInfo<String> FAILBACKLAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackLaunchType").build();
    private static final MarshallingInfo<Boolean> FAILBACKTOORIGINALSERVER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failbackToOriginalServer").build();
    private static final MarshallingInfo<String> FIRSTBYTEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstByteDateTime").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();

    private static final RecoveryInstanceFailbackMarshaller instance = new RecoveryInstanceFailbackMarshaller();

    public static RecoveryInstanceFailbackMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoveryInstanceFailback recoveryInstanceFailback, ProtocolMarshaller protocolMarshaller) {

        if (recoveryInstanceFailback == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoveryInstanceFailback.getAgentLastSeenByServiceDateTime(), AGENTLASTSEENBYSERVICEDATETIME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getElapsedReplicationDuration(), ELAPSEDREPLICATIONDURATION_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackClientID(), FAILBACKCLIENTID_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackClientLastSeenByServiceDateTime(), FAILBACKCLIENTLASTSEENBYSERVICEDATETIME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackInitiationTime(), FAILBACKINITIATIONTIME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackJobID(), FAILBACKJOBID_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackLaunchType(), FAILBACKLAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFailbackToOriginalServer(), FAILBACKTOORIGINALSERVER_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getFirstByteDateTime(), FIRSTBYTEDATETIME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceFailback.getState(), STATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
