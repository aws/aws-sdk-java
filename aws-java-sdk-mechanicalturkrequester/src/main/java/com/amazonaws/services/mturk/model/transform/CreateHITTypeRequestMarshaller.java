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
 * CreateHITTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateHITTypeRequestMarshaller {

    private static final MarshallingInfo<Long> AUTOAPPROVALDELAYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoApprovalDelayInSeconds").build();
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
    private static final MarshallingInfo<List> QUALIFICATIONREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationRequirements").build();

    private static final CreateHITTypeRequestMarshaller instance = new CreateHITTypeRequestMarshaller();

    public static CreateHITTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateHITTypeRequest createHITTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createHITTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createHITTypeRequest.getAutoApprovalDelayInSeconds(), AUTOAPPROVALDELAYINSECONDS_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getAssignmentDurationInSeconds(), ASSIGNMENTDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getReward(), REWARD_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getKeywords(), KEYWORDS_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createHITTypeRequest.getQualificationRequirements(), QUALIFICATIONREQUIREMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
