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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActivityResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityResponseMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> CAMPAIGNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CampaignId").build();
    private static final MarshallingInfo<String> END_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("End").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Result").build();
    private static final MarshallingInfo<String> SCHEDULEDSTART_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledStart").build();
    private static final MarshallingInfo<String> START_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Start").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<Integer> SUCCESSFULENDPOINTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessfulEndpointCount").build();
    private static final MarshallingInfo<Integer> TIMEZONESCOMPLETEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimezonesCompletedCount").build();
    private static final MarshallingInfo<Integer> TIMEZONESTOTALCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimezonesTotalCount").build();
    private static final MarshallingInfo<Integer> TOTALENDPOINTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalEndpointCount").build();
    private static final MarshallingInfo<String> TREATMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatmentId").build();

    private static final ActivityResponseMarshaller instance = new ActivityResponseMarshaller();

    public static ActivityResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivityResponse activityResponse, ProtocolMarshaller protocolMarshaller) {

        if (activityResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activityResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(activityResponse.getCampaignId(), CAMPAIGNID_BINDING);
            protocolMarshaller.marshall(activityResponse.getEnd(), END_BINDING);
            protocolMarshaller.marshall(activityResponse.getId(), ID_BINDING);
            protocolMarshaller.marshall(activityResponse.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(activityResponse.getScheduledStart(), SCHEDULEDSTART_BINDING);
            protocolMarshaller.marshall(activityResponse.getStart(), START_BINDING);
            protocolMarshaller.marshall(activityResponse.getState(), STATE_BINDING);
            protocolMarshaller.marshall(activityResponse.getSuccessfulEndpointCount(), SUCCESSFULENDPOINTCOUNT_BINDING);
            protocolMarshaller.marshall(activityResponse.getTimezonesCompletedCount(), TIMEZONESCOMPLETEDCOUNT_BINDING);
            protocolMarshaller.marshall(activityResponse.getTimezonesTotalCount(), TIMEZONESTOTALCOUNT_BINDING);
            protocolMarshaller.marshall(activityResponse.getTotalEndpointCount(), TOTALENDPOINTCOUNT_BINDING);
            protocolMarshaller.marshall(activityResponse.getTreatmentId(), TREATMENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
