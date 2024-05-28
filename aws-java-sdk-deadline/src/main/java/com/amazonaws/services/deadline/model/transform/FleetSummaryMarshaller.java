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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FleetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FleetSummaryMarshaller {

    private static final MarshallingInfo<String> AUTOSCALINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingStatus").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fleetId").build();
    private static final MarshallingInfo<Integer> MAXWORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxWorkerCount").build();
    private static final MarshallingInfo<Integer> MINWORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minWorkerCount").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Integer> TARGETWORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetWorkerCount").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();
    private static final MarshallingInfo<Integer> WORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workerCount").build();

    private static final FleetSummaryMarshaller instance = new FleetSummaryMarshaller();

    public static FleetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FleetSummary fleetSummary, ProtocolMarshaller protocolMarshaller) {

        if (fleetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fleetSummary.getAutoScalingStatus(), AUTOSCALINGSTATUS_BINDING);
            protocolMarshaller.marshall(fleetSummary.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(fleetSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(fleetSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(fleetSummary.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(fleetSummary.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(fleetSummary.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(fleetSummary.getMaxWorkerCount(), MAXWORKERCOUNT_BINDING);
            protocolMarshaller.marshall(fleetSummary.getMinWorkerCount(), MINWORKERCOUNT_BINDING);
            protocolMarshaller.marshall(fleetSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(fleetSummary.getTargetWorkerCount(), TARGETWORKERCOUNT_BINDING);
            protocolMarshaller.marshall(fleetSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(fleetSummary.getUpdatedBy(), UPDATEDBY_BINDING);
            protocolMarshaller.marshall(fleetSummary.getWorkerCount(), WORKERCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
