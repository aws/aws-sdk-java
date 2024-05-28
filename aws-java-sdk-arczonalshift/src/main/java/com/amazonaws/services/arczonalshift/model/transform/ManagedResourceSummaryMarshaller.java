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
package com.amazonaws.services.arczonalshift.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.arczonalshift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManagedResourceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManagedResourceSummaryMarshaller {

    private static final MarshallingInfo<Map> APPLIEDWEIGHTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appliedWeights").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<List> AUTOSHIFTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("autoshifts").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZones").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PRACTICERUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("practiceRunStatus").build();
    private static final MarshallingInfo<String> ZONALAUTOSHIFTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zonalAutoshiftStatus").build();
    private static final MarshallingInfo<List> ZONALSHIFTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("zonalShifts").build();

    private static final ManagedResourceSummaryMarshaller instance = new ManagedResourceSummaryMarshaller();

    public static ManagedResourceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManagedResourceSummary managedResourceSummary, ProtocolMarshaller protocolMarshaller) {

        if (managedResourceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(managedResourceSummary.getAppliedWeights(), APPLIEDWEIGHTS_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getAutoshifts(), AUTOSHIFTS_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getPracticeRunStatus(), PRACTICERUNSTATUS_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getZonalAutoshiftStatus(), ZONALAUTOSHIFTSTATUS_BINDING);
            protocolMarshaller.marshall(managedResourceSummary.getZonalShifts(), ZONALSHIFTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
