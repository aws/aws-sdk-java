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
package com.amazonaws.services.mturk.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HITMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HITMarshaller {

    private static final MarshallingInfo<String> HITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HITId").build();
    private static final MarshallingInfo<String> HITTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HITTypeId").build();
    private static final MarshallingInfo<String> HITGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITGroupId").build();
    private static final MarshallingInfo<String> HITLAYOUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITLayoutId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> QUESTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Question").build();
    private static final MarshallingInfo<String> KEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keywords").build();
    private static final MarshallingInfo<String> HITSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HITStatus").build();
    private static final MarshallingInfo<Integer> MAXASSIGNMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAssignments").build();
    private static final MarshallingInfo<String> REWARD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reward").build();
    private static final MarshallingInfo<Long> AUTOAPPROVALDELAYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoApprovalDelayInSeconds").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Expiration").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> ASSIGNMENTDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentDurationInSeconds").build();
    private static final MarshallingInfo<String> REQUESTERANNOTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterAnnotation").build();
    private static final MarshallingInfo<List> QUALIFICATIONREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationRequirements").build();
    private static final MarshallingInfo<String> HITREVIEWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITReviewStatus").build();
    private static final MarshallingInfo<Integer> NUMBEROFASSIGNMENTSPENDING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAssignmentsPending").build();
    private static final MarshallingInfo<Integer> NUMBEROFASSIGNMENTSAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAssignmentsAvailable").build();
    private static final MarshallingInfo<Integer> NUMBEROFASSIGNMENTSCOMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAssignmentsCompleted").build();

    private static final HITMarshaller instance = new HITMarshaller();

    public static HITMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HIT hIT, ProtocolMarshaller protocolMarshaller) {

        if (hIT == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hIT.getHITId(), HITID_BINDING);
            protocolMarshaller.marshall(hIT.getHITTypeId(), HITTYPEID_BINDING);
            protocolMarshaller.marshall(hIT.getHITGroupId(), HITGROUPID_BINDING);
            protocolMarshaller.marshall(hIT.getHITLayoutId(), HITLAYOUTID_BINDING);
            protocolMarshaller.marshall(hIT.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(hIT.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(hIT.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(hIT.getQuestion(), QUESTION_BINDING);
            protocolMarshaller.marshall(hIT.getKeywords(), KEYWORDS_BINDING);
            protocolMarshaller.marshall(hIT.getHITStatus(), HITSTATUS_BINDING);
            protocolMarshaller.marshall(hIT.getMaxAssignments(), MAXASSIGNMENTS_BINDING);
            protocolMarshaller.marshall(hIT.getReward(), REWARD_BINDING);
            protocolMarshaller.marshall(hIT.getAutoApprovalDelayInSeconds(), AUTOAPPROVALDELAYINSECONDS_BINDING);
            protocolMarshaller.marshall(hIT.getExpiration(), EXPIRATION_BINDING);
            protocolMarshaller.marshall(hIT.getAssignmentDurationInSeconds(), ASSIGNMENTDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(hIT.getRequesterAnnotation(), REQUESTERANNOTATION_BINDING);
            protocolMarshaller.marshall(hIT.getQualificationRequirements(), QUALIFICATIONREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(hIT.getHITReviewStatus(), HITREVIEWSTATUS_BINDING);
            protocolMarshaller.marshall(hIT.getNumberOfAssignmentsPending(), NUMBEROFASSIGNMENTSPENDING_BINDING);
            protocolMarshaller.marshall(hIT.getNumberOfAssignmentsAvailable(), NUMBEROFASSIGNMENTSAVAILABLE_BINDING);
            protocolMarshaller.marshall(hIT.getNumberOfAssignmentsCompleted(), NUMBEROFASSIGNMENTSCOMPLETED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
