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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentRunMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ASSESSMENTTEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTemplateArn").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<Integer> DURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationInSeconds").build();
    private static final MarshallingInfo<List> RULESPACKAGEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rulesPackageArns").build();
    private static final MarshallingInfo<List> USERATTRIBUTESFORFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttributesForFindings").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STATECHANGEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateChangedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> DATACOLLECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataCollected").build();
    private static final MarshallingInfo<List> STATECHANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stateChanges").build();
    private static final MarshallingInfo<List> NOTIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("notifications").build();
    private static final MarshallingInfo<Map> FINDINGCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("findingCounts").build();

    private static final AssessmentRunMarshaller instance = new AssessmentRunMarshaller();

    public static AssessmentRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentRun assessmentRun, ProtocolMarshaller protocolMarshaller) {

        if (assessmentRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentRun.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(assessmentRun.getName(), NAME_BINDING);
            protocolMarshaller.marshall(assessmentRun.getAssessmentTemplateArn(), ASSESSMENTTEMPLATEARN_BINDING);
            protocolMarshaller.marshall(assessmentRun.getState(), STATE_BINDING);
            protocolMarshaller.marshall(assessmentRun.getDurationInSeconds(), DURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(assessmentRun.getRulesPackageArns(), RULESPACKAGEARNS_BINDING);
            protocolMarshaller.marshall(assessmentRun.getUserAttributesForFindings(), USERATTRIBUTESFORFINDINGS_BINDING);
            protocolMarshaller.marshall(assessmentRun.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(assessmentRun.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(assessmentRun.getCompletedAt(), COMPLETEDAT_BINDING);
            protocolMarshaller.marshall(assessmentRun.getStateChangedAt(), STATECHANGEDAT_BINDING);
            protocolMarshaller.marshall(assessmentRun.getDataCollected(), DATACOLLECTED_BINDING);
            protocolMarshaller.marshall(assessmentRun.getStateChanges(), STATECHANGES_BINDING);
            protocolMarshaller.marshall(assessmentRun.getNotifications(), NOTIFICATIONS_BINDING);
            protocolMarshaller.marshall(assessmentRun.getFindingCounts(), FINDINGCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
