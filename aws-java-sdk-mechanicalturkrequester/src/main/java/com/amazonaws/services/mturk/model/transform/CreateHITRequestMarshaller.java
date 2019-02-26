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
 * CreateHITRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateHITRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXASSIGNMENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAssignments").build();
    private static final MarshallingInfo<Long> AUTOAPPROVALDELAYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoApprovalDelayInSeconds").build();
    private static final MarshallingInfo<Long> LIFETIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifetimeInSeconds").build();
    private static final MarshallingInfo<Long> ASSIGNMENTDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentDurationInSeconds").build();
    private static final MarshallingInfo<String> REWARD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reward").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> KEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keywords").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> QUESTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Question").build();
    private static final MarshallingInfo<String> REQUESTERANNOTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterAnnotation").build();
    private static final MarshallingInfo<List> QUALIFICATIONREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationRequirements").build();
    private static final MarshallingInfo<String> UNIQUEREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UniqueRequestToken").build();
    private static final MarshallingInfo<StructuredPojo> ASSIGNMENTREVIEWPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentReviewPolicy").build();
    private static final MarshallingInfo<StructuredPojo> HITREVIEWPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITReviewPolicy").build();
    private static final MarshallingInfo<String> HITLAYOUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITLayoutId").build();
    private static final MarshallingInfo<List> HITLAYOUTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HITLayoutParameters").build();

    private static final CreateHITRequestMarshaller instance = new CreateHITRequestMarshaller();

    public static CreateHITRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateHITRequest createHITRequest, ProtocolMarshaller protocolMarshaller) {

        if (createHITRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createHITRequest.getMaxAssignments(), MAXASSIGNMENTS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getAutoApprovalDelayInSeconds(), AUTOAPPROVALDELAYINSECONDS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getLifetimeInSeconds(), LIFETIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getAssignmentDurationInSeconds(), ASSIGNMENTDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getReward(), REWARD_BINDING);
            protocolMarshaller.marshall(createHITRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(createHITRequest.getKeywords(), KEYWORDS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createHITRequest.getQuestion(), QUESTION_BINDING);
            protocolMarshaller.marshall(createHITRequest.getRequesterAnnotation(), REQUESTERANNOTATION_BINDING);
            protocolMarshaller.marshall(createHITRequest.getQualificationRequirements(), QUALIFICATIONREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(createHITRequest.getUniqueRequestToken(), UNIQUEREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createHITRequest.getAssignmentReviewPolicy(), ASSIGNMENTREVIEWPOLICY_BINDING);
            protocolMarshaller.marshall(createHITRequest.getHITReviewPolicy(), HITREVIEWPOLICY_BINDING);
            protocolMarshaller.marshall(createHITRequest.getHITLayoutId(), HITLAYOUTID_BINDING);
            protocolMarshaller.marshall(createHITRequest.getHITLayoutParameters(), HITLAYOUTPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
