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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstancesCountMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstancesCountMarshaller {

    private static final MarshallingInfo<Integer> ASSIGNING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Assigning").build();
    private static final MarshallingInfo<Integer> BOOTING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Booting").build();
    private static final MarshallingInfo<Integer> CONNECTIONLOST_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionLost").build();
    private static final MarshallingInfo<Integer> DEREGISTERING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Deregistering").build();
    private static final MarshallingInfo<Integer> ONLINE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Online").build();
    private static final MarshallingInfo<Integer> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pending").build();
    private static final MarshallingInfo<Integer> REBOOTING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Rebooting").build();
    private static final MarshallingInfo<Integer> REGISTERED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Registered").build();
    private static final MarshallingInfo<Integer> REGISTERING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Registering").build();
    private static final MarshallingInfo<Integer> REQUESTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Requested").build();
    private static final MarshallingInfo<Integer> RUNNINGSETUP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningSetup").build();
    private static final MarshallingInfo<Integer> SETUPFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SetupFailed").build();
    private static final MarshallingInfo<Integer> SHUTTINGDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShuttingDown").build();
    private static final MarshallingInfo<Integer> STARTFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartFailed").build();
    private static final MarshallingInfo<Integer> STOPFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopFailed").build();
    private static final MarshallingInfo<Integer> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stopped").build();
    private static final MarshallingInfo<Integer> STOPPING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Stopping").build();
    private static final MarshallingInfo<Integer> TERMINATED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Terminated").build();
    private static final MarshallingInfo<Integer> TERMINATING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Terminating").build();
    private static final MarshallingInfo<Integer> UNASSIGNING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Unassigning").build();

    private static final InstancesCountMarshaller instance = new InstancesCountMarshaller();

    public static InstancesCountMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstancesCount instancesCount, ProtocolMarshaller protocolMarshaller) {

        if (instancesCount == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instancesCount.getAssigning(), ASSIGNING_BINDING);
            protocolMarshaller.marshall(instancesCount.getBooting(), BOOTING_BINDING);
            protocolMarshaller.marshall(instancesCount.getConnectionLost(), CONNECTIONLOST_BINDING);
            protocolMarshaller.marshall(instancesCount.getDeregistering(), DEREGISTERING_BINDING);
            protocolMarshaller.marshall(instancesCount.getOnline(), ONLINE_BINDING);
            protocolMarshaller.marshall(instancesCount.getPending(), PENDING_BINDING);
            protocolMarshaller.marshall(instancesCount.getRebooting(), REBOOTING_BINDING);
            protocolMarshaller.marshall(instancesCount.getRegistered(), REGISTERED_BINDING);
            protocolMarshaller.marshall(instancesCount.getRegistering(), REGISTERING_BINDING);
            protocolMarshaller.marshall(instancesCount.getRequested(), REQUESTED_BINDING);
            protocolMarshaller.marshall(instancesCount.getRunningSetup(), RUNNINGSETUP_BINDING);
            protocolMarshaller.marshall(instancesCount.getSetupFailed(), SETUPFAILED_BINDING);
            protocolMarshaller.marshall(instancesCount.getShuttingDown(), SHUTTINGDOWN_BINDING);
            protocolMarshaller.marshall(instancesCount.getStartFailed(), STARTFAILED_BINDING);
            protocolMarshaller.marshall(instancesCount.getStopFailed(), STOPFAILED_BINDING);
            protocolMarshaller.marshall(instancesCount.getStopped(), STOPPED_BINDING);
            protocolMarshaller.marshall(instancesCount.getStopping(), STOPPING_BINDING);
            protocolMarshaller.marshall(instancesCount.getTerminated(), TERMINATED_BINDING);
            protocolMarshaller.marshall(instancesCount.getTerminating(), TERMINATING_BINDING);
            protocolMarshaller.marshall(instancesCount.getUnassigning(), UNASSIGNING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
